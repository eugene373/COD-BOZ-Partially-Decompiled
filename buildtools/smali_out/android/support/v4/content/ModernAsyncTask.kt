package android.support.v4.content

// Auto-emitted from smali source: ModernAsyncTask.java.
// 15 fields, 26 methods.

open class ModernAsyncTask {
    private val mFuture: java.util.concurrent.FutureTask
    private var mStatus: android.support.v4.content.ModernAsyncTask.Status
    private val mTaskInvoked: java.util.concurrent.atomic.AtomicBoolean
    private val mWorker: android.support.v4.content.ModernAsyncTask.WorkerRunnable

    public constructor()

    private fun finish(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TResult;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         .local p1, "result":Ljava/lang/Object;, "TResult;"
    //         invoke-virtual {p0}, Landroid/support/v4/content/ModernAsyncTask;->isCancelled()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, p1}, Landroid/support/v4/content/ModernAsyncTask;->onCancelled(Ljava/lang/Object;)V
    //         :goto_0
    //         sget-object v0, Landroid/support/v4/content/ModernAsyncTask$Status;->FINISHED:Landroid/support/v4/content/ModernAsyncTask$Status;
    //         iput-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mStatus:Landroid/support/v4/content/ModernAsyncTask$Status;
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0, p1}, Landroid/support/v4/content/ModernAsyncTask;->onPostExecute(Ljava/lang/Object;)V
    //         goto :goto_0
    */

    private fun postResult(p0: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TResult;)TResult;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         .local p1, "result":Ljava/lang/Object;, "TResult;"
    //         const/4 v5, 0x1
    //         sget-object v1, Landroid/support/v4/content/ModernAsyncTask;->sHandler:Landroid/support/v4/content/ModernAsyncTask$InternalHandler;
    //         new-instance v2, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;
    //         new-array v3, v5, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         aput-object p1, v3, v4
    //         invoke-direct {v2, p0, v3}, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;-><init>(Landroid/support/v4/content/ModernAsyncTask;[Ljava/lang/Object;)V
    //         invoke-virtual {v1, v5, v2}, Landroid/support/v4/content/ModernAsyncTask$InternalHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v0
    //         .local v0, "message":Landroid/os/Message;
    //         invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    //         return-object p1
    */

    private fun postResultIfNotInvoked(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TResult;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         .local p1, "result":Ljava/lang/Object;, "TResult;"
    //         iget-object v1, p0, Landroid/support/v4/content/ModernAsyncTask;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;
    //         invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
    //         move-result v0
    //         .local v0, "wasTaskInvoked":Z
    //         if-nez v0, :cond_0
    //         invoke-direct {p0, p1}, Landroid/support/v4/content/ModernAsyncTask;->postResult(Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         return-void
    */

    public fun cancel(mayInterruptIfRunning: Boolean): Boolean { return TODO("body: (Z)Z") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
    //         invoke-virtual {v0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z
    //         move-result v0
    //         return v0
    */

    protected fun doInBackground(p0: Array<Object>): Object

    public fun execute(p0: Array<Object>): android.support.v4.content.ModernAsyncTask { return TODO("body: ([Ljava/lang/Object;)Landroid/support/v4/content/ModernAsyncTask;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "([TParams;)",
    //                 "Landroid/support/v4/content/ModernAsyncTask",
    //                 "<TParams;TProgress;TResult;>;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         .local p1, "params":[Ljava/lang/Object;, "[TParams;"
    //         sget-object v0, Landroid/support/v4/content/ModernAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;
    //         invoke-virtual {p0, v0, p1}, Landroid/support/v4/content/ModernAsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/support/v4/content/ModernAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    public fun executeOnExecutor(exec: java.util.concurrent.Executor, p1: Array<Object>): android.support.v4.content.ModernAsyncTask { return TODO("body: (Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/support/v4/content/ModernAsyncTask;") }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         .local p2, "params":[Ljava/lang/Object;, "[TParams;"
    //         iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mStatus:Landroid/support/v4/content/ModernAsyncTask$Status;
    //         sget-object v1, Landroid/support/v4/content/ModernAsyncTask$Status;->PENDING:Landroid/support/v4/content/ModernAsyncTask$Status;
    //         if-eq v0, v1, :cond_0
    //         sget-object v0, Landroid/support/v4/content/ModernAsyncTask$4;->$SwitchMap$android$support$v4$content$ModernAsyncTask$Status:[I
    //         iget-object v1, p0, Landroid/support/v4/content/ModernAsyncTask;->mStatus:Landroid/support/v4/content/ModernAsyncTask$Status;
    //         invoke-virtual {v1}, Landroid/support/v4/content/ModernAsyncTask$Status;->ordinal()I
    //         move-result v1
    //         aget v0, v0, v1
    //         packed-switch v0, :pswitch_data_0
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/content/ModernAsyncTask$Status;->RUNNING:Landroid/support/v4/content/ModernAsyncTask$Status;
    //         iput-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mStatus:Landroid/support/v4/content/ModernAsyncTask$Status;
    //         invoke-virtual {p0}, Landroid/support/v4/content/ModernAsyncTask;->onPreExecute()V
    //         iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mWorker:Landroid/support/v4/content/ModernAsyncTask$WorkerRunnable;
    //         iput-object p2, v0, Landroid/support/v4/content/ModernAsyncTask$WorkerRunnable;->mParams:[Ljava/lang/Object;
    //         iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
    //         invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    //         return-object p0
    //         :pswitch_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Cannot execute task: the task is already running."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Cannot execute task: the task has already been executed (a task can be executed only once)"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    public fun get(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TResult;"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/InterruptedException;,
    //                 Ljava/util/concurrent/ExecutionException;
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
    //         invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun get(timeout: Long, unit: java.util.concurrent.TimeUnit): Object { return TODO("body: (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/InterruptedException;,
    //                 Ljava/util/concurrent/ExecutionException;,
    //                 Ljava/util/concurrent/TimeoutException;
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
    //         invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getStatus(): android.support.v4.content.ModernAsyncTask.Status { return TODO("body: ()Landroid/support/v4/content/ModernAsyncTask$Status;") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mStatus:Landroid/support/v4/content/ModernAsyncTask$Status;
    //         return-object v0
    */

    public fun isCancelled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
    //         invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->isCancelled()Z
    //         move-result v0
    //         return v0
    */

    protected fun onCancelled() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         return-void
    */

    protected fun onCancelled(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TResult;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         .local p1, "result":Ljava/lang/Object;, "TResult;"
    //         invoke-virtual {p0}, Landroid/support/v4/content/ModernAsyncTask;->onCancelled()V
    //         return-void
    */

    protected fun onPostExecute(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TResult;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         .local p1, "result":Ljava/lang/Object;, "TResult;"
    //         return-void
    */

    protected fun onPreExecute() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         return-void
    */

    protected fun onProgressUpdate(p0: Array<Object>) { /* TODO(body): ([Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "([TProgress;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         .local p1, "values":[Ljava/lang/Object;, "[TProgress;"
    //         return-void
    */

    protected fun publishProgress(p0: Array<Object>) { /* TODO(body): ([Ljava/lang/Object;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "([TProgress;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
    //         .local p1, "values":[Ljava/lang/Object;, "[TProgress;"
    //         invoke-virtual {p0}, Landroid/support/v4/content/ModernAsyncTask;->isCancelled()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         sget-object v0, Landroid/support/v4/content/ModernAsyncTask;->sHandler:Landroid/support/v4/content/ModernAsyncTask$InternalHandler;
    //         const/4 v1, 0x2
    //         new-instance v2, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;
    //         invoke-direct {v2, p0, p1}, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;-><init>(Landroid/support/v4/content/ModernAsyncTask;[Ljava/lang/Object;)V
    //         invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/ModernAsyncTask$InternalHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    //         :cond_0
    //         return-void
    */

    companion object {
    private val CORE_POOL_SIZE: Int = 0x5
    private val KEEP_ALIVE: Int = 0x1
    private val LOG_TAG: String = "AsyncTask"
    private val MAXIMUM_POOL_SIZE: Int = 0x80
    private val MESSAGE_POST_PROGRESS: Int = 0x2
    private val MESSAGE_POST_RESULT: Int = 0x1
    @JvmField public val THREAD_POOL_EXECUTOR: java.util.concurrent.Executor = null!!
    private var sDefaultExecutor: java.util.concurrent.Executor
    private val sHandler: android.support.v4.content.ModernAsyncTask.InternalHandler = null!!
    private val sPoolWorkQueue: java.util.concurrent.BlockingQueue = null!!
    private val sThreadFactory: java.util.concurrent.ThreadFactory = null!!

    public @JvmStatic fun execute(runnable: Runnable) { /* TODO(body): (Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/content/ModernAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;
    //         invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    //         return-void
    */

    public @JvmStatic fun init() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/content/ModernAsyncTask;->sHandler:Landroid/support/v4/content/ModernAsyncTask$InternalHandler;
    //         invoke-virtual {v0}, Landroid/support/v4/content/ModernAsyncTask$InternalHandler;->getLooper()Landroid/os/Looper;
    //         return-void
    */

    public @JvmStatic fun setDefaultExecutor(exec: java.util.concurrent.Executor) { /* TODO(body): (Ljava/util/concurrent/Executor;)V */ }
    /*
    //         .locals 0
    //         sput-object p0, Landroid/support/v4/content/ModernAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;
    //         return-void
    */

    }
}
