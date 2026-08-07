package bolts

import java.util.ArrayList
import java.util.Collection
import java.util.concurrent.Callable
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger

class Task<TResult> private constructor() {
    private val lock = Any()
    private var complete = false
    private var cancelled = false
    private var result: TResult? = null
    private var error: Exception? = null
    private var continuations: MutableList<Continuation<TResult, Void>>? = ArrayList()

    fun isCompleted(): Boolean = synchronized(lock) { complete }

    fun isCancelled(): Boolean = synchronized(lock) { cancelled }

    fun isFaulted(): Boolean = synchronized(lock) { error != null }

    fun getResult(): TResult? = synchronized(lock) { result }

    fun getError(): Exception? = synchronized(lock) { error }

    @Throws(InterruptedException::class)
    fun waitForCompletion() {
        synchronized(lock) {
            if (!isCompleted()) {
                (lock as java.lang.Object).wait()
            }
        }
    }

    fun cast(): Task<*> = this

    fun makeVoid(): Task<Void> =
        continueWithTask(Continuation { task ->
            if (task.isCancelled()) {
                cancelled<Void>()
            } else if (task.isFaulted()) {
                forError<Void>(task.getError())
            } else {
                forResult<Void>(null)
            }
        })

    fun <TContinuationResult> continueWith(
        continuation: Continuation<TResult, TContinuationResult>,
        executor: Executor
    ): Task<TContinuationResult> {
        val tcs = create<TContinuationResult>()
        val completed: Boolean
        synchronized(lock) {
            completed = isCompleted()
            if (!completed) {
                continuations!!.add(Continuation { task ->
                    completeImmediately(tcs, continuation, task, executor)
                    null
                })
            }
        }
        if (completed) {
            completeImmediately(tcs, continuation, this, executor)
        }
        return tcs.task
    }

    fun <TContinuationResult> continueWith(
        continuation: Continuation<TResult, TContinuationResult>
    ): Task<TContinuationResult> = continueWith(continuation, IMMEDIATE_EXECUTOR)

    fun <TContinuationResult> continueWithTask(
        continuation: Continuation<TResult, Task<TContinuationResult>>,
        executor: Executor
    ): Task<TContinuationResult> {
        val tcs = create<TContinuationResult>()
        val completed: Boolean
        synchronized(lock) {
            completed = isCompleted()
            if (!completed) {
                continuations!!.add(Continuation { task ->
                    completeAfterTask(tcs, continuation, task, executor)
                    null
                })
            }
        }
        if (completed) {
            completeAfterTask(tcs, continuation, this, executor)
        }
        return tcs.task
    }

    fun <TContinuationResult> continueWithTask(
        continuation: Continuation<TResult, Task<TContinuationResult>>
    ): Task<TContinuationResult> = continueWithTask(continuation, IMMEDIATE_EXECUTOR)

    fun <TContinuationResult> onSuccess(
        continuation: Continuation<TResult, TContinuationResult>,
        executor: Executor
    ): Task<TContinuationResult> = continueWithTask(
        Continuation { task ->
            if (task.isFaulted()) {
                forError(task.getError())
            } else if (task.isCancelled()) {
                cancelled()
            } else {
                task.continueWith(continuation)
            }
        },
        executor
    )

    fun <TContinuationResult> onSuccess(
        continuation: Continuation<TResult, TContinuationResult>
    ): Task<TContinuationResult> = onSuccess(continuation, IMMEDIATE_EXECUTOR)

    fun <TContinuationResult> onSuccessTask(
        continuation: Continuation<TResult, Task<TContinuationResult>>,
        executor: Executor
    ): Task<TContinuationResult> = continueWithTask(
        Continuation { task ->
            if (task.isFaulted()) {
                forError(task.getError())
            } else if (task.isCancelled()) {
                cancelled()
            } else {
                task.continueWithTask(continuation)
            }
        },
        executor
    )

    fun <TContinuationResult> onSuccessTask(
        continuation: Continuation<TResult, Task<TContinuationResult>>
    ): Task<TContinuationResult> = onSuccessTask(continuation, IMMEDIATE_EXECUTOR)

    fun continueWhile(
        predicate: Callable<Boolean>,
        continuation: Continuation<Void, Task<Void>>,
        executor: Executor
    ): Task<Void> {
        val predicateContinuation = Capture<Continuation<Void, Task<Void>>>()
        predicateContinuation.set(
            Continuation { _ ->
                if (predicate.call()) {
                    forResult<Void>(null)
                        .onSuccessTask(continuation, executor)
                        .onSuccessTask(predicateContinuation.get() as Continuation<Void, Task<Void>>, executor)
                } else {
                    forResult<Void>(null)
                }
            }
        )
        return makeVoid().continueWithTask(predicateContinuation.get() as Continuation<Void, Task<Void>>, executor)
    }

    fun continueWhile(
        predicate: Callable<Boolean>,
        continuation: Continuation<Void, Task<Void>>
    ): Task<Void> = continueWhile(predicate, continuation, IMMEDIATE_EXECUTOR)

    private fun runContinuations() {
        synchronized(lock) {
            val iter = continuations!!.iterator()
            while (iter.hasNext()) {
                try {
                    iter.next().then(this)
                } catch (e: RuntimeException) {
                    throw e
                } catch (e: Exception) {
                    throw RuntimeException(e)
                }
            }
            continuations = null
        }
    }

    inner class TaskCompletionSource internal constructor() {
        val task: Task<TResult>
            get() = this@Task

        fun trySetCancelled(): Boolean = synchronized(lock) {
            if (complete) return@synchronized false
            complete = true
            cancelled = true
            (lock as java.lang.Object).notifyAll()
            runContinuations()
            true
        }

        fun trySetResult(result: TResult?): Boolean = synchronized(lock) {
            if (complete) return@synchronized false
            complete = true
            this@Task.result = result
            (lock as java.lang.Object).notifyAll()
            runContinuations()
            true
        }

        fun trySetError(error: Exception?): Boolean = synchronized(lock) {
            if (complete) return@synchronized false
            complete = true
            this@Task.error = error
            (lock as java.lang.Object).notifyAll()
            runContinuations()
            true
        }

        fun setCancelled() {
            if (!trySetCancelled()) {
                throw IllegalStateException("Cannot cancel a completed task.")
            }
        }

        fun setResult(result: TResult?) {
            if (!trySetResult(result)) {
                throw IllegalStateException("Cannot set the result of a completed task.")
            }
        }

        fun setError(error: Exception?) {
            if (!trySetError(error)) {
                throw IllegalStateException("Cannot set the error on a completed task.")
            }
        }
    }

    companion object {
        @JvmField
        val BACKGROUND_EXECUTOR: ExecutorService = BoltsExecutors.background()

        @JvmStatic
        private val IMMEDIATE_EXECUTOR: Executor = BoltsExecutors.immediate()

        @JvmField
        val UI_THREAD_EXECUTOR: Executor = AndroidExecutors.uiThread()

        @JvmStatic
        fun <TResult> create(): Task<TResult>.TaskCompletionSource {
            val task = Task<TResult>()
            return task.TaskCompletionSource()
        }

        @JvmStatic
        fun <TResult> forResult(result: TResult?): Task<TResult> {
            val tcs = create<TResult>()
            tcs.setResult(result)
            return tcs.task
        }

        @JvmStatic
        fun <TResult> forError(error: Exception?): Task<TResult> {
            val tcs = create<TResult>()
            tcs.setError(error)
            return tcs.task
        }

        @JvmStatic
        fun <TResult> cancelled(): Task<TResult> {
            val tcs = create<TResult>()
            tcs.setCancelled()
            return tcs.task
        }

        @JvmStatic
        fun <TResult> callInBackground(callable: Callable<TResult>): Task<TResult> =
            call(callable, BACKGROUND_EXECUTOR)

        @JvmStatic
        fun <TResult> call(callable: Callable<TResult>, executor: Executor): Task<TResult> {
            val tcs = create<TResult>()
            executor.execute {
                try {
                    tcs.setResult(callable.call())
                } catch (e: Exception) {
                    tcs.setError(e)
                }
            }
            return tcs.task
        }

        @JvmStatic
        fun <TResult> call(callable: Callable<TResult>): Task<TResult> =
            call(callable, IMMEDIATE_EXECUTOR)

        @JvmStatic
        fun whenAll(tasks: Collection<Task<*>>): Task<Void> {
            if (tasks.isEmpty()) {
                return forResult(null)
            }
            val allFinished = create<Void>()
            val errors = ArrayList<Exception>()
            val errorLock = Any()
            val isCancelled = AtomicBoolean(false)
            val count = AtomicInteger(tasks.size())
            for (task in tasks) {
                @Suppress("UNCHECKED_CAST")
                (task as Task<Any>).continueWith(Continuation<Any, Void> { t ->
                    if (t.isFaulted()) {
                        synchronized(errorLock) {
                            errors.add(t.getError()!!)
                        }
                    }
                    if (t.isCancelled()) {
                        isCancelled.set(true)
                    }
                    if (count.decrementAndGet() == 0) {
                        if (errors.isNotEmpty()) {
                            if (errors.size == 1) {
                                allFinished.setError(errors[0])
                            } else {
                                allFinished.setError(AggregateException(errors))
                            }
                        } else if (isCancelled.get()) {
                            allFinished.setCancelled()
                        } else {
                            allFinished.setResult(null)
                        }
                    }
                    null
                })
            }
            return allFinished.task
        }

        private fun <TContinuationResult, TResult> completeImmediately(
            tcs: Task<TContinuationResult>.TaskCompletionSource,
            continuation: Continuation<TResult, TContinuationResult>,
            task: Task<TResult>,
            executor: Executor
        ) {
            executor.execute {
                try {
                    tcs.setResult(continuation.then(task))
                } catch (e: Exception) {
                    tcs.setError(e)
                }
            }
        }

        private fun <TContinuationResult, TResult> completeAfterTask(
            tcs: Task<TContinuationResult>.TaskCompletionSource,
            continuation: Continuation<TResult, Task<TContinuationResult>>,
            task: Task<TResult>,
            executor: Executor
        ) {
            executor.execute {
                try {
                    val resultTask: Task<TContinuationResult>? = continuation.then(task)
                    if (resultTask == null) {
                        tcs.setResult(null)
                    } else {
                        resultTask.continueWith(Continuation { task ->
                            if (task.isCancelled()) {
                                tcs.setCancelled()
                            } else if (task.isFaulted()) {
                                tcs.setError(task.getError())
                            } else {
                                tcs.setResult(task.getResult())
                            }
                            null
                        })
                    }
                } catch (e: Exception) {
                    tcs.setError(e)
                }
            }
        }
    }
}
