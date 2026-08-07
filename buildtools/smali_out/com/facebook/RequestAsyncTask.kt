package com.facebook

// Auto-emitted from smali source: RequestAsyncTask.java.
// 5 fields, 16 methods.

open class RequestAsyncTask: android.os.AsyncTask() {
    private val connection: java.net.HttpURLConnection
    private var exception: Exception
    private val requests: com.facebook.RequestBatch

    public constructor(p0: com.facebook.RequestBatch)

    public constructor(p0: java.net.HttpURLConnection, p1: com.facebook.RequestBatch)

    public constructor(p0: java.net.HttpURLConnection, p1: java.util.Collection)

    public constructor(p0: java.net.HttpURLConnection, p1: Array<com.facebook.Request>)

    public constructor(p0: java.util.Collection)

    public constructor(p0: Array<com.facebook.Request>)

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Ljava/lang/Void;
    //         invoke-virtual {p0, p1}, Lcom/facebook/RequestAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun doInBackground(p0: Array<Void>): java.util.List { return TODO("body: ([Ljava/lang/Void;)Ljava/util/List;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "([",
    //                 "Ljava/lang/Void;",
    //                 ")",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;"
    //             }
    //         .end annotation
    //         :try_start_0
    //         iget-object v0, p0, Lcom/facebook/RequestAsyncTask;->connection:Ljava/net/HttpURLConnection;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/RequestAsyncTask;->requests:Lcom/facebook/RequestBatch;
    //         invoke-virtual {v0}, Lcom/facebook/RequestBatch;->executeAndWait()Ljava/util/List;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/RequestAsyncTask;->connection:Ljava/net/HttpURLConnection;
    //         iget-object v1, p0, Lcom/facebook/RequestAsyncTask;->requests:Lcom/facebook/RequestBatch;
    //         invoke-static {v0, v1}, Lcom/facebook/Request;->executeConnectionAndWait(Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;)Ljava/util/List;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         iput-object v0, p0, Lcom/facebook/RequestAsyncTask;->exception:Ljava/lang/Exception;
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun executeOnSettingsExecutor(): com.facebook.RequestAsyncTask { return TODO("body: ()Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         sget-object v0, Lcom/facebook/RequestAsyncTask;->executeOnExecutorMethod:Ljava/lang/reflect/Method;
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/RequestAsyncTask;->executeOnExecutorMethod:Ljava/lang/reflect/Method;
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-static {}, Lcom/facebook/Settings;->getExecutor()Ljava/util/concurrent/Executor;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         aput-object v3, v1, v2
    //         invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object p0
    //         :cond_0
    //         new-array v0, v1, [Ljava/lang/Void;
    //         invoke-virtual {p0, v0}, Lcom/facebook/RequestAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         goto :goto_0
    */

    protected fun getException(): Exception { return TODO("body: ()Ljava/lang/Exception;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestAsyncTask;->exception:Ljava/lang/Exception;
    //         return-object v0
    */

    protected fun getRequests(): com.facebook.RequestBatch { return TODO("body: ()Lcom/facebook/RequestBatch;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestAsyncTask;->requests:Lcom/facebook/RequestBatch;
    //         return-object v0
    */

    protected fun onPostExecute(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Ljava/util/List;
    //         invoke-virtual {p0, p1}, Lcom/facebook/RequestAsyncTask;->onPostExecute(Ljava/util/List;)V
    //         return-void
    */

    protected fun onPostExecute(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/facebook/RequestAsyncTask;->exception:Ljava/lang/Exception;
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/facebook/RequestAsyncTask;->TAG:Ljava/lang/String;
    //         const-string v1, "onPostExecute: exception encountered during request: %s"
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         iget-object v4, p0, Lcom/facebook/RequestAsyncTask;->exception:Ljava/lang/Exception;
    //         invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         return-void
    */

    protected fun onPreExecute() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V
    //         iget-object v0, p0, Lcom/facebook/RequestAsyncTask;->requests:Lcom/facebook/RequestBatch;
    //         invoke-virtual {v0}, Lcom/facebook/RequestBatch;->getCallbackHandler()Landroid/os/Handler;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/RequestAsyncTask;->requests:Lcom/facebook/RequestBatch;
    //         new-instance v1, Landroid/os/Handler;
    //         invoke-direct {v1}, Landroid/os/Handler;-><init>()V
    //         invoke-virtual {v0, v1}, Lcom/facebook/RequestBatch;->setCallbackHandler(Landroid/os/Handler;)V
    //         :cond_0
    //         return-void
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "{RequestAsyncTask: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, " connection: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/RequestAsyncTask;->connection:Ljava/net/HttpURLConnection;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ", requests: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/RequestAsyncTask;->requests:Lcom/facebook/RequestBatch;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "}"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private val TAG: String = null!!
    private var executeOnExecutorMethod: java.lang.reflect.Method
    }
}
