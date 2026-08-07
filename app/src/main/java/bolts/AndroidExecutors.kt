package bolts

import android.os.Build
import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadFactory
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

internal object AndroidExecutors {
    private val CPU_COUNT = Runtime.getRuntime().availableProcessors()
    val CORE_POOL_SIZE = CPU_COUNT + 1
    val MAX_POOL_SIZE = CPU_COUNT * 2 + 1
    const val KEEP_ALIVE_TIME = 1L
    const val MAX_QUEUE_SIZE = 128


    @JvmStatic
    fun newCachedThreadPool(): ExecutorService {
        val executor = ThreadPoolExecutor(
            CORE_POOL_SIZE, MAX_POOL_SIZE,
            KEEP_ALIVE_TIME, TimeUnit.SECONDS,
            LinkedBlockingQueue(MAX_QUEUE_SIZE)
        )
        allowCoreThreadTimeout(executor, true)
        return executor
    }

    @JvmStatic
    fun newCachedThreadPool(threadFactory: ThreadFactory): ExecutorService {
        val executor = ThreadPoolExecutor(
            CORE_POOL_SIZE, MAX_POOL_SIZE,
            KEEP_ALIVE_TIME, TimeUnit.SECONDS,
            LinkedBlockingQueue(MAX_QUEUE_SIZE),
            threadFactory
        )
        allowCoreThreadTimeout(executor, true)
        return executor
    }

    @JvmStatic
    fun allowCoreThreadTimeout(executor: ThreadPoolExecutor, value: Boolean) {
        if (Build.VERSION.SDK_INT >= 9) {
            executor.allowCoreThreadTimeOut(value)
        }
    }

    @JvmStatic
    fun uiThread(): Executor = sUiThread

    private val sUiThread: Executor = UIThreadExecutor()

    private class UIThreadExecutor : Executor {
        override fun execute(command: Runnable) {
            Handler(Looper.getMainLooper()).post(command)
        }
    }
}
