package com.facebook

// Auto-emitted from smali source: Session.java.
// 3 fields, 5 methods.

open class Session_AutoPublishAsyncTask: android.os.AsyncTask() {
    private val mApplicationContext: android.content.Context
    private val mApplicationId: String
    val this$0: com.facebook.Session

    public constructor(p0: com.facebook.Session, p1: String, p2: android.content.Context)

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Ljava/lang/Void;
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session$AutoPublishAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun doInBackground(p0: Array<Void>): Void { return TODO("body: ([Ljava/lang/Void;)Ljava/lang/Void;") }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session$AutoPublishAsyncTask;->mApplicationContext:Landroid/content/Context;
    //         iget-object v1, p0, Lcom/facebook/Session$AutoPublishAsyncTask;->mApplicationId:Ljava/lang/String;
    //         const/4 v2, 0x1
    //         invoke-static {v0, v1, v2}, Lcom/facebook/Settings;->publishInstallAndWaitForResponse(Landroid/content/Context;Ljava/lang/String;Z)Lcom/facebook/Response;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         const/4 v0, 0x0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Facebook-publish"
    //         invoke-static {v1, v0}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V
    //         goto :goto_0
    */

    protected fun onPostExecute(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Ljava/lang/Void;
    //         invoke-virtual {p0, p1}, Lcom/facebook/Session$AutoPublishAsyncTask;->onPostExecute(Ljava/lang/Void;)V
    //         return-void
    */

    protected fun onPostExecute(p0: Void) { /* TODO(body): (Ljava/lang/Void;)V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/facebook/Session$AutoPublishAsyncTask;->this$0:Lcom/facebook/Session;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/Session$AutoPublishAsyncTask;->this$0:Lcom/facebook/Session;
    //         const/4 v2, 0x0
    //         invoke-static {v0, v2}, Lcom/facebook/Session;->access$1802(Lcom/facebook/Session;Lcom/facebook/Session$AutoPublishAsyncTask;)Lcom/facebook/Session$AutoPublishAsyncTask;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
