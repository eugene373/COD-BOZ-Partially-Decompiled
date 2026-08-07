package android.support.v4.content

// Auto-emitted from smali source: ModernAsyncTask.java.
// 1 fields, 2 methods.

open class ModernAsyncTask_Anon3: java.util.concurrent.FutureTask() {
    val this$0: android.support.v4.content.ModernAsyncTask

    constructor(p0: android.support.v4.content.ModernAsyncTask, p1: java.util.concurrent.Callable)

    protected fun done() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         .local p0, "this":Landroid/support/v4/content/ModernAsyncTask$3;, "Landroid/support/v4/content/ModernAsyncTask.3;"
    //         :try_start_0
    //         invoke-virtual {p0}, Landroid/support/v4/content/ModernAsyncTask$3;->get()Ljava/lang/Object;
    //         move-result-object v1
    //         .local v1, "result":Ljava/lang/Object;, "TResult;"
    //         iget-object v3, p0, Landroid/support/v4/content/ModernAsyncTask$3;->this$0:Landroid/support/v4/content/ModernAsyncTask;
    //         invoke-static {v3, v1}, Landroid/support/v4/content/ModernAsyncTask;->access$400(Landroid/support/v4/content/ModernAsyncTask;Ljava/lang/Object;)V
    //         :try_end_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3
    //         .end local v1    # "result":Ljava/lang/Object;, "TResult;"
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/InterruptedException;
    //         const-string v3, "AsyncTask"
    //         invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    //         .end local v0    # "e":Ljava/lang/InterruptedException;
    //         :catch_1
    //         move-exception v0
    //         .local v0, "e":Ljava/util/concurrent/ExecutionException;
    //         new-instance v3, Ljava/lang/RuntimeException;
    //         const-string v4, "An error occured while executing doInBackground()"
    //         invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;
    //         move-result-object v5
    //         invoke-direct {v3, v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v3
    //         .end local v0    # "e":Ljava/util/concurrent/ExecutionException;
    //         :catch_2
    //         move-exception v0
    //         .local v0, "e":Ljava/util/concurrent/CancellationException;
    //         iget-object v3, p0, Landroid/support/v4/content/ModernAsyncTask$3;->this$0:Landroid/support/v4/content/ModernAsyncTask;
    //         const/4 v4, 0x0
    //         invoke-static {v3, v4}, Landroid/support/v4/content/ModernAsyncTask;->access$400(Landroid/support/v4/content/ModernAsyncTask;Ljava/lang/Object;)V
    //         goto :goto_0
    //         .end local v0    # "e":Ljava/util/concurrent/CancellationException;
    //         :catch_3
    //         move-exception v2
    //         .local v2, "t":Ljava/lang/Throwable;
    //         new-instance v3, Ljava/lang/RuntimeException;
    //         const-string v4, "An error occured while executing doInBackground()"
    //         invoke-direct {v3, v4, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v3
    */

}
