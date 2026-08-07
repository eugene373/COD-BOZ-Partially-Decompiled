package android.support.v4.content

// Auto-emitted from smali source: AsyncTaskLoader.java.
// 7 fields, 12 methods.

open class AsyncTaskLoader: android.support.v4.content.Loader() {
    var mCancellingTask: android.support.v4.content.AsyncTaskLoader.LoadTask
    var mHandler: android.os.Handler
    var mLastLoadCompleteTime: Long
    var mTask: android.support.v4.content.AsyncTaskLoader.LoadTask
    var mUpdateThrottle: Long

    public constructor(context: android.content.Context)

    public fun cancelLoad(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    //         const/4 v3, 0x0
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         if-eqz v1, :cond_1
    //         iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         if-eqz v1, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         iget-boolean v1, v1, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         iput-boolean v0, v1, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
    //         iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;
    //         iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    //         :cond_0
    //         iput-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         :cond_1
    //         :goto_0
    //         return v0
    //         :cond_2
    //         iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         iget-boolean v1, v1, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
    //         if-eqz v1, :cond_3
    //         iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         iput-boolean v0, v1, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
    //         iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;
    //         iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    //         iput-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         goto :goto_0
    //         :cond_3
    //         iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         invoke-virtual {v1, v0}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->cancel(Z)Z
    //         move-result v0
    //         .local v0, "cancelled":Z
    //         if-eqz v0, :cond_4
    //         iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         iput-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         :cond_4
    //         iput-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         goto :goto_0
    */

    fun dispatchOnCancelled(p0: android.support.v4.content.AsyncTaskLoader.LoadTask, p1: Object) { /* TODO(body): (Landroid/support/v4/content/AsyncTaskLoader$LoadTask;Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/support/v4/content/AsyncTaskLoader",
    //                 "<TD;>.",
    //                 "LoadTask;",
    //                 "TD;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    //         .local p1, "task":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
    //         .local p2, "data":Ljava/lang/Object;, "TD;"
    //         invoke-virtual {p0, p2}, Landroid/support/v4/content/AsyncTaskLoader;->onCanceled(Ljava/lang/Object;)V
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         if-ne v0, p1, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->rollbackContentChanged()V
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->executePendingTask()V
    //         :cond_0
    //         return-void
    */

    fun dispatchOnLoadComplete(p0: android.support.v4.content.AsyncTaskLoader.LoadTask, p1: Object) { /* TODO(body): (Landroid/support/v4/content/AsyncTaskLoader$LoadTask;Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/support/v4/content/AsyncTaskLoader",
    //                 "<TD;>.",
    //                 "LoadTask;",
    //                 "TD;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    //         .local p1, "task":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
    //         .local p2, "data":Ljava/lang/Object;, "TD;"
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         if-eq v0, p1, :cond_0
    //         invoke-virtual {p0, p1, p2}, Landroid/support/v4/content/AsyncTaskLoader;->dispatchOnCancelled(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;Ljava/lang/Object;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->isAbandoned()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p0, p2}, Landroid/support/v4/content/AsyncTaskLoader;->onCanceled(Ljava/lang/Object;)V
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->commitContentChanged()V
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         invoke-virtual {p0, p2}, Landroid/support/v4/content/AsyncTaskLoader;->deliverResult(Ljava/lang/Object;)V
    //         goto :goto_0
    */

    public fun dump(prefix: String, fd: java.io.FileDescriptor, writer: java.io.PrintWriter, args: Array<String>) { /* TODO(body): (Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V */ }
    /*
    //         .locals 4
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v4/content/Loader;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mTask="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V
    //         const-string v0, " waiting="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         iget-boolean v0, v0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mCancellingTask="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V
    //         const-string v0, " waiting="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         iget-boolean v0, v0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
    //         :cond_1
    //         iget-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J
    //         const-wide/16 v2, 0x0
    //         cmp-long v0, v0, v2
    //         if-eqz v0, :cond_2
    //         invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         const-string v0, "mUpdateThrottle="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J
    //         invoke-static {v0, v1, p3}, Landroid/support/v4/util/TimeUtils;->formatDuration(JLjava/io/PrintWriter;)V
    //         const-string v0, " mLastLoadCompleteTime="
    //         invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
    //         iget-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v2
    //         invoke-static {v0, v1, v2, v3, p3}, Landroid/support/v4/util/TimeUtils;->formatDuration(JJLjava/io/PrintWriter;)V
    //         invoke-virtual {p3}, Ljava/io/PrintWriter;->println()V
    //         :cond_2
    //         return-void
    */

    fun executePendingTask() { /* TODO(body): ()V */ }
    /*
    //         .locals 8
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    //         iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         if-nez v2, :cond_1
    //         iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         if-eqz v2, :cond_1
    //         iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         iget-boolean v2, v2, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
    //         if-eqz v2, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         const/4 v3, 0x0
    //         iput-boolean v3, v2, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
    //         iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;
    //         iget-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    //         :cond_0
    //         iget-wide v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J
    //         const-wide/16 v4, 0x0
    //         cmp-long v2, v2, v4
    //         if-lez v2, :cond_2
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v0
    //         .local v0, "now":J
    //         iget-wide v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J
    //         iget-wide v4, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J
    //         add-long/2addr v2, v4
    //         cmp-long v2, v0, v2
    //         if-gez v2, :cond_2
    //         iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         const/4 v3, 0x1
    //         iput-boolean v3, v2, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
    //         iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;
    //         iget-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         iget-wide v4, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J
    //         iget-wide v6, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J
    //         add-long/2addr v4, v6
    //         invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z
    //         .end local v0    # "now":J
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         iget-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         sget-object v4, Landroid/support/v4/content/ModernAsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
    //         const/4 v2, 0x0
    //         check-cast v2, [Ljava/lang/Void;
    //         invoke-virtual {v3, v4, v2}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/support/v4/content/ModernAsyncTask;
    //         goto :goto_0
    */

    public fun loadInBackground(): Object

    public fun onCanceled(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TD;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    //         .local p1, "data":Ljava/lang/Object;, "TD;"
    //         return-void
    */

    protected fun onForceLoad() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    //         invoke-super {p0}, Landroid/support/v4/content/Loader;->onForceLoad()V
    //         invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->cancelLoad()Z
    //         new-instance v0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         invoke-direct {v0, p0}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;-><init>(Landroid/support/v4/content/AsyncTaskLoader;)V
    //         iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->executePendingTask()V
    //         return-void
    */

    protected fun onLoadInBackground(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TD;"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    //         invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->loadInBackground()Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setUpdateThrottle(delayMS: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 3
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    //         iput-wide p1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J
    //         const-wide/16 v0, 0x0
    //         cmp-long v0, p1, v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Landroid/os/Handler;
    //         invoke-direct {v0}, Landroid/os/Handler;-><init>()V
    //         iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;
    //         :cond_0
    //         return-void
    */

    public fun waitForLoader() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    //         .local v0, "task":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         invoke-static {v0}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->access$000(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;)Ljava/util/concurrent/CountDownLatch;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V
    //         :try_end_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    companion object {
    val DEBUG: Boolean = false
    val TAG: String = "AsyncTaskLoader"
    }
}
