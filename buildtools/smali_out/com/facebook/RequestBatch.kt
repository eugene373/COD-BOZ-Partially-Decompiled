package com.facebook

// Auto-emitted from smali source: RequestBatch.java.
// 7 fields, 32 methods.

open class RequestBatch: java.util.AbstractList() {
    private var batchApplicationId: String
    private var callbackHandler: android.os.Handler
    private var callbacks: java.util.List
    private val id: String
    private var requests: java.util.List
    private var timeoutInMilliseconds: Int

    public constructor()

    public constructor(p0: com.facebook.RequestBatch)

    public constructor(p0: java.util.Collection)

    public constructor(p0: Array<com.facebook.Request>)

    public fun add(p0: Int, p1: com.facebook.Request) { /* TODO(body): (ILcom/facebook/Request;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;
    //         invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V
    //         return-void
    */

    public fun add(p0: Int, p1: Object) { /* TODO(body): (ILjava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p2, Lcom/facebook/Request;
    //         invoke-virtual {p0, p1, p2}, Lcom/facebook/RequestBatch;->add(ILcom/facebook/Request;)V
    //         return-void
    */

    public fun add(p0: com.facebook.Request): Boolean { return TODO("body: (Lcom/facebook/Request;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun add(p0: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p1, Lcom/facebook/Request;
    //         invoke-virtual {p0, p1}, Lcom/facebook/RequestBatch;->add(Lcom/facebook/Request;)Z
    //         move-result v0
    //         return v0
    */

    public fun addCallback(p0: com.facebook.RequestBatch.Callback) { /* TODO(body): (Lcom/facebook/RequestBatch$Callback;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         return-void
    */

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->clear()V
    //         return-void
    */

    public fun executeAndWait(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->executeAndWaitImpl()Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    fun executeAndWaitImpl(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Response;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-static {p0}, Lcom/facebook/Request;->executeBatchAndWait(Lcom/facebook/RequestBatch;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun executeAsync(): com.facebook.RequestAsyncTask { return TODO("body: ()Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/facebook/RequestBatch;->executeAsyncImpl()Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    fun executeAsyncImpl(): com.facebook.RequestAsyncTask { return TODO("body: ()Lcom/facebook/RequestAsyncTask;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/facebook/Request;->executeBatchAsync(Lcom/facebook/RequestBatch;)Lcom/facebook/RequestAsyncTask;
    //         move-result-object v0
    //         return-object v0
    */

    public fun get(p0: Int): com.facebook.Request { return TODO("body: (I)Lcom/facebook/Request;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Request;
    //         return-object v0
    */

    public fun get(p0: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/RequestBatch;->get(I)Lcom/facebook/Request;
    //         move-result-object v0
    //         return-object v0
    */

    fun getBatchApplicationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->batchApplicationId:Ljava/lang/String;
    //         return-object v0
    */

    fun getCallbackHandler(): android.os.Handler { return TODO("body: ()Landroid/os/Handler;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->callbackHandler:Landroid/os/Handler;
    //         return-object v0
    */

    fun getCallbacks(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/RequestBatch$Callback;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;
    //         return-object v0
    */

    fun getId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->id:Ljava/lang/String;
    //         return-object v0
    */

    fun getRequests(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/facebook/Request;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;
    //         return-object v0
    */

    public fun getTimeout(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/RequestBatch;->timeoutInMilliseconds:I
    //         return v0
    */

    public fun remove(p0: Int): com.facebook.Request { return TODO("body: (I)Lcom/facebook/Request;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Request;
    //         return-object v0
    */

    public fun remove(p0: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/facebook/RequestBatch;->remove(I)Lcom/facebook/Request;
    //         move-result-object v0
    //         return-object v0
    */

    public fun removeCallback(p0: com.facebook.RequestBatch.Callback) { /* TODO(body): (Lcom/facebook/RequestBatch$Callback;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun set(p0: Int, p1: com.facebook.Request): com.facebook.Request { return TODO("body: (ILcom/facebook/Request;)Lcom/facebook/Request;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;
    //         invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Request;
    //         return-object v0
    */

    public fun set(p0: Int, p1: Object): Object { return TODO("body: (ILjava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p2, Lcom/facebook/Request;
    //         invoke-virtual {p0, p1, p2}, Lcom/facebook/RequestBatch;->set(ILcom/facebook/Request;)Lcom/facebook/Request;
    //         move-result-object v0
    //         return-object v0
    */

    fun setBatchApplicationId(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/RequestBatch;->batchApplicationId:Ljava/lang/String;
    //         return-void
    */

    fun setCallbackHandler(p0: android.os.Handler) { /* TODO(body): (Landroid/os/Handler;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/RequestBatch;->callbackHandler:Landroid/os/Handler;
    //         return-void
    */

    public fun setTimeout(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         if-gez p1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Argument timeoutInMilliseconds must be >= 0."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iput p1, p0, Lcom/facebook/RequestBatch;->timeoutInMilliseconds:I
    //         return-void
    */

    public fun size(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         return v0
    */

    companion object {
    private var idGenerator: java.util.concurrent.atomic.AtomicInteger
    }
}
