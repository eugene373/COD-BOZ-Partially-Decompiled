package android.support.v4.content

// Auto-emitted from smali source: AsyncTaskLoader.java.
// 4 fields, 7 methods.

class AsyncTaskLoader_LoadTask: android.support.v4.content.ModernAsyncTask(), Runnable {
    private var done: java.util.concurrent.CountDownLatch
    var result: Object
    val this$0: android.support.v4.content.AsyncTaskLoader
    var waiting: Boolean

    constructor(p0: android.support.v4.content.AsyncTaskLoader)

    protected fun doInBackground(x0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
    //         check-cast p1, [Ljava/lang/Void;
    //         .end local p1    # "x0":[Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun doInBackground(params: Array<Void>): Object { return TODO("body: ([Ljava/lang/Void;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->this$0:Landroid/support/v4/content/AsyncTaskLoader;
    //         invoke-virtual {v0}, Landroid/support/v4/content/AsyncTaskLoader;->onLoadInBackground()Ljava/lang/Object;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->result:Ljava/lang/Object;
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->result:Ljava/lang/Object;
    //         return-object v0
    */

    protected fun onCancelled() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
    //         :try_start_0
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->this$0:Landroid/support/v4/content/AsyncTaskLoader;
    //         iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->result:Ljava/lang/Object;
    //         invoke-virtual {v0, p0, v1}, Landroid/support/v4/content/AsyncTaskLoader;->dispatchOnCancelled(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;Ljava/lang/Object;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->done:Ljava/util/concurrent/CountDownLatch;
    //         invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->done:Ljava/util/concurrent/CountDownLatch;
    //         invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    //         throw v0
    */

    protected fun onPostExecute(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TD;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
    //         .local p1, "data":Ljava/lang/Object;, "TD;"
    //         :try_start_0
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->this$0:Landroid/support/v4/content/AsyncTaskLoader;
    //         invoke-virtual {v0, p0, p1}, Landroid/support/v4/content/AsyncTaskLoader;->dispatchOnLoadComplete(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;Ljava/lang/Object;)V
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->done:Ljava/util/concurrent/CountDownLatch;
    //         invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->done:Ljava/util/concurrent/CountDownLatch;
    //         invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    //         throw v0
    */

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
    //         iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->this$0:Landroid/support/v4/content/AsyncTaskLoader;
    //         invoke-virtual {v0}, Landroid/support/v4/content/AsyncTaskLoader;->executePendingTask()V
    //         return-void
    */

}
