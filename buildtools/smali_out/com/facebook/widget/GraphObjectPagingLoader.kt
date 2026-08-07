package com.facebook.widget

// Auto-emitted from smali source: GraphObjectPagingLoader.java.
// 9 fields, 17 methods.

open class GraphObjectPagingLoader: android.support.v4.content.Loader() {
    private var appendResults: Boolean
    private var currentRequest: com.facebook.Request
    private var cursor: com.facebook.widget.SimpleGraphObjectCursor
    private val graphObjectClass: Class
    private var loading: Boolean
    private var nextRequest: com.facebook.Request
    private var onErrorListener: com.facebook.widget.GraphObjectPagingLoader.OnErrorListener
    private var originalRequest: com.facebook.Request
    private var skipRoundtripIfCached: Boolean

    public constructor(p0: android.content.Context, p1: Class)

    private fun addResults(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 7
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->cursor:Lcom/facebook/widget/SimpleGraphObjectCursor;
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->appendResults:Z
    //         if-nez v0, :cond_4
    //         :cond_0
    //         new-instance v0, Lcom/facebook/widget/SimpleGraphObjectCursor;
    //         invoke-direct {v0}, Lcom/facebook/widget/SimpleGraphObjectCursor;-><init>()V
    //         move-object v1, v0
    //         :goto_0
    //         const-class v0, Lcom/facebook/widget/GraphObjectPagingLoader$PagedResults;
    //         invoke-virtual {p1, v0}, Lcom/facebook/Response;->getGraphObjectAs(Ljava/lang/Class;)Lcom/facebook/model/GraphObject;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/widget/GraphObjectPagingLoader$PagedResults;
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getIsFromCache()Z
    //         move-result v4
    //         invoke-interface {v0}, Lcom/facebook/widget/GraphObjectPagingLoader$PagedResults;->getData()Lcom/facebook/model/GraphObjectList;
    //         move-result-object v0
    //         iget-object v5, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->graphObjectClass:Ljava/lang/Class;
    //         invoke-interface {v0, v5}, Lcom/facebook/model/GraphObjectList;->castToListOf(Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;
    //         move-result-object v5
    //         invoke-interface {v5}, Lcom/facebook/model/GraphObjectList;->size()I
    //         move-result v0
    //         if-lez v0, :cond_5
    //         move v0, v2
    //         :goto_1
    //         if-eqz v0, :cond_1
    //         sget-object v6, Lcom/facebook/Response$PagingDirection;->NEXT:Lcom/facebook/Response$PagingDirection;
    //         invoke-virtual {p1, v6}, Lcom/facebook/Response;->getRequestForPagedResults(Lcom/facebook/Response$PagingDirection;)Lcom/facebook/Request;
    //         move-result-object v6
    //         iput-object v6, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->nextRequest:Lcom/facebook/Request;
    //         invoke-virtual {v1, v5, v4}, Lcom/facebook/widget/SimpleGraphObjectCursor;->addGraphObjects(Ljava/util/Collection;Z)V
    //         iget-object v5, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->nextRequest:Lcom/facebook/Request;
    //         if-eqz v5, :cond_6
    //         invoke-virtual {v1, v2}, Lcom/facebook/widget/SimpleGraphObjectCursor;->setMoreObjectsAvailable(Z)V
    //         :cond_1
    //         :goto_2
    //         if-nez v0, :cond_2
    //         invoke-virtual {v1, v3}, Lcom/facebook/widget/SimpleGraphObjectCursor;->setMoreObjectsAvailable(Z)V
    //         invoke-virtual {v1, v4}, Lcom/facebook/widget/SimpleGraphObjectCursor;->setFromCache(Z)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->nextRequest:Lcom/facebook/Request;
    //         :cond_2
    //         if-nez v4, :cond_3
    //         iput-boolean v3, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->skipRoundtripIfCached:Z
    //         :cond_3
    //         invoke-virtual {p0, v1}, Lcom/facebook/widget/GraphObjectPagingLoader;->deliverResult(Lcom/facebook/widget/SimpleGraphObjectCursor;)V
    //         return-void
    //         :cond_4
    //         new-instance v0, Lcom/facebook/widget/SimpleGraphObjectCursor;
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->cursor:Lcom/facebook/widget/SimpleGraphObjectCursor;
    //         invoke-direct {v0, v1}, Lcom/facebook/widget/SimpleGraphObjectCursor;-><init>(Lcom/facebook/widget/SimpleGraphObjectCursor;)V
    //         move-object v1, v0
    //         goto :goto_0
    //         :cond_5
    //         move v0, v3
    //         goto :goto_1
    //         :cond_6
    //         invoke-virtual {v1, v3}, Lcom/facebook/widget/SimpleGraphObjectCursor;->setMoreObjectsAvailable(Z)V
    //         goto :goto_2
    */

    private fun putRequestIntoBatch(p0: com.facebook.Request, p1: Boolean): com.facebook.internal.CacheableRequestBatch { return TODO("body: (Lcom/facebook/Request;Z)Lcom/facebook/internal/CacheableRequestBatch;") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         new-instance v2, Lcom/facebook/internal/CacheableRequestBatch;
    //         new-array v3, v0, [Lcom/facebook/Request;
    //         aput-object p1, v3, v1
    //         invoke-direct {v2, v3}, Lcom/facebook/internal/CacheableRequestBatch;-><init>([Lcom/facebook/Request;)V
    //         if-nez p2, :cond_0
    //         :goto_0
    //         invoke-virtual {v2, v0}, Lcom/facebook/internal/CacheableRequestBatch;->setForceRoundTrip(Z)V
    //         return-object v2
    //         :cond_0
    //         move v0, v1
    //         goto :goto_0
    */

    private fun requestCompleted(p0: com.facebook.Response) { /* TODO(body): (Lcom/facebook/Response;)V */ }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getRequest()Lcom/facebook/Request;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->currentRequest:Lcom/facebook/Request;
    //         if-eq v0, v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->loading:Z
    //         iput-object v1, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->currentRequest:Lcom/facebook/Request;
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v0
    //         if-nez v0, :cond_3
    //         move-object v0, v1
    //         :goto_1
    //         invoke-virtual {p1}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v2
    //         if-nez v2, :cond_2
    //         if-nez v0, :cond_2
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v2, "GraphObjectPagingLoader received neither a result nor an error."
    //         invoke-direct {v0, v2}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         :cond_2
    //         if-eqz v0, :cond_4
    //         iput-object v1, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->nextRequest:Lcom/facebook/Request;
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->onErrorListener:Lcom/facebook/widget/GraphObjectPagingLoader$OnErrorListener;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->onErrorListener:Lcom/facebook/widget/GraphObjectPagingLoader$OnErrorListener;
    //         invoke-interface {v1, v0, p0}, Lcom/facebook/widget/GraphObjectPagingLoader$OnErrorListener;->onError(Lcom/facebook/FacebookException;Lcom/facebook/widget/GraphObjectPagingLoader;)V
    //         goto :goto_0
    //         :cond_3
    //         invoke-virtual {v0}, Lcom/facebook/FacebookRequestError;->getException()Lcom/facebook/FacebookException;
    //         move-result-object v0
    //         goto :goto_1
    //         :cond_4
    //         invoke-direct {p0, p1}, Lcom/facebook/widget/GraphObjectPagingLoader;->addResults(Lcom/facebook/Response;)V
    //         goto :goto_0
    */

    private fun startLoading(p0: com.facebook.Request, p1: Boolean, p2: Long) { /* TODO(body): (Lcom/facebook/Request;ZJ)V */ }
    /*
    //         .locals 5
    //         iput-boolean p2, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->skipRoundtripIfCached:Z
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->appendResults:Z
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->nextRequest:Lcom/facebook/Request;
    //         iput-object p1, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->currentRequest:Lcom/facebook/Request;
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->currentRequest:Lcom/facebook/Request;
    //         new-instance v1, Lcom/facebook/widget/GraphObjectPagingLoader$2;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/GraphObjectPagingLoader$2;-><init>(Lcom/facebook/widget/GraphObjectPagingLoader;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/Request;->setCallback(Lcom/facebook/Request$Callback;)V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->loading:Z
    //         invoke-direct {p0, p1, p2}, Lcom/facebook/widget/GraphObjectPagingLoader;->putRequestIntoBatch(Lcom/facebook/Request;Z)Lcom/facebook/internal/CacheableRequestBatch;
    //         move-result-object v0
    //         new-instance v1, Lcom/facebook/widget/GraphObjectPagingLoader$3;
    //         invoke-direct {v1, p0, v0}, Lcom/facebook/widget/GraphObjectPagingLoader$3;-><init>(Lcom/facebook/widget/GraphObjectPagingLoader;Lcom/facebook/RequestBatch;)V
    //         const-wide/16 v2, 0x0
    //         cmp-long v0, p3, v2
    //         if-nez v0, :cond_0
    //         invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Landroid/os/Handler;
    //         invoke-direct {v0}, Landroid/os/Handler;-><init>()V
    //         invoke-virtual {v0, v1, p3, p4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    //         goto :goto_0
    */

    public fun clearResults() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->nextRequest:Lcom/facebook/Request;
    //         iput-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->originalRequest:Lcom/facebook/Request;
    //         iput-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->currentRequest:Lcom/facebook/Request;
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/GraphObjectPagingLoader;->deliverResult(Lcom/facebook/widget/SimpleGraphObjectCursor;)V
    //         return-void
    */

    public fun deliverResult(p0: com.facebook.widget.SimpleGraphObjectCursor) { /* TODO(body): (Lcom/facebook/widget/SimpleGraphObjectCursor;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/widget/SimpleGraphObjectCursor",
    //                 "<TT;>;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->cursor:Lcom/facebook/widget/SimpleGraphObjectCursor;
    //         iput-object p1, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->cursor:Lcom/facebook/widget/SimpleGraphObjectCursor;
    //         invoke-virtual {p0}, Lcom/facebook/widget/GraphObjectPagingLoader;->isStarted()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-super {p0, p1}, Landroid/support/v4/content/Loader;->deliverResult(Ljava/lang/Object;)V
    //         if-eqz v0, :cond_0
    //         if-eq v0, p1, :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/widget/SimpleGraphObjectCursor;->isClosed()Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         invoke-virtual {v0}, Lcom/facebook/widget/SimpleGraphObjectCursor;->close()V
    //         :cond_0
    //         return-void
    */

    public fun deliverResult(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/facebook/widget/SimpleGraphObjectCursor;
    //         invoke-virtual {p0, p1}, Lcom/facebook/widget/GraphObjectPagingLoader;->deliverResult(Lcom/facebook/widget/SimpleGraphObjectCursor;)V
    //         return-void
    */

    public fun followNextLink() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->nextRequest:Lcom/facebook/Request;
    //         if-eqz v0, :cond_0
    //         iput-boolean v2, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->appendResults:Z
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->nextRequest:Lcom/facebook/Request;
    //         iput-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->currentRequest:Lcom/facebook/Request;
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->currentRequest:Lcom/facebook/Request;
    //         new-instance v1, Lcom/facebook/widget/GraphObjectPagingLoader$1;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/GraphObjectPagingLoader$1;-><init>(Lcom/facebook/widget/GraphObjectPagingLoader;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/Request;->setCallback(Lcom/facebook/Request$Callback;)V
    //         iput-boolean v2, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->loading:Z
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->currentRequest:Lcom/facebook/Request;
    //         iget-boolean v1, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->skipRoundtripIfCached:Z
    //         invoke-direct {p0, v0, v1}, Lcom/facebook/widget/GraphObjectPagingLoader;->putRequestIntoBatch(Lcom/facebook/Request;Z)Lcom/facebook/internal/CacheableRequestBatch;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/Request;->executeBatchAsync(Lcom/facebook/RequestBatch;)Lcom/facebook/RequestAsyncTask;
    //         :cond_0
    //         return-void
    */

    public fun getCursor(): com.facebook.widget.SimpleGraphObjectCursor { return TODO("body: ()Lcom/facebook/widget/SimpleGraphObjectCursor;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lcom/facebook/widget/SimpleGraphObjectCursor",
    //                 "<TT;>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->cursor:Lcom/facebook/widget/SimpleGraphObjectCursor;
    //         return-object v0
    */

    public fun getOnErrorListener(): com.facebook.widget.GraphObjectPagingLoader.OnErrorListener { return TODO("body: ()Lcom/facebook/widget/GraphObjectPagingLoader$OnErrorListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->onErrorListener:Lcom/facebook/widget/GraphObjectPagingLoader$OnErrorListener;
    //         return-object v0
    */

    public fun isLoading(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->loading:Z
    //         return v0
    */

    protected fun onStartLoading() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/support/v4/content/Loader;->onStartLoading()V
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->cursor:Lcom/facebook/widget/SimpleGraphObjectCursor;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->cursor:Lcom/facebook/widget/SimpleGraphObjectCursor;
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/GraphObjectPagingLoader;->deliverResult(Lcom/facebook/widget/SimpleGraphObjectCursor;)V
    //         :cond_0
    //         return-void
    */

    public fun refreshOriginalRequest(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->originalRequest:Lcom/facebook/Request;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "refreshOriginalRequest may not be called until after startLoading has been called."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->originalRequest:Lcom/facebook/Request;
    //         const/4 v1, 0x0
    //         invoke-direct {p0, v0, v1, p1, p2}, Lcom/facebook/widget/GraphObjectPagingLoader;->startLoading(Lcom/facebook/Request;ZJ)V
    //         return-void
    */

    public fun setOnErrorListener(p0: com.facebook.widget.GraphObjectPagingLoader.OnErrorListener) { /* TODO(body): (Lcom/facebook/widget/GraphObjectPagingLoader$OnErrorListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->onErrorListener:Lcom/facebook/widget/GraphObjectPagingLoader$OnErrorListener;
    //         return-void
    */

    public fun startLoading(p0: com.facebook.Request, p1: Boolean) { /* TODO(body): (Lcom/facebook/Request;Z)V */ }
    /*
    //         .locals 2
    //         iput-object p1, p0, Lcom/facebook/widget/GraphObjectPagingLoader;->originalRequest:Lcom/facebook/Request;
    //         const-wide/16 v0, 0x0
    //         invoke-direct {p0, p1, p2, v0, v1}, Lcom/facebook/widget/GraphObjectPagingLoader;->startLoading(Lcom/facebook/Request;ZJ)V
    //         return-void
    */

}
