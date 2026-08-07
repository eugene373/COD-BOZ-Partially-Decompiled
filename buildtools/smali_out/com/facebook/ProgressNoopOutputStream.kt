package com.facebook

// Auto-emitted from smali source: ProgressNoopOutputStream.java.
// 5 fields, 8 methods.

open class ProgressNoopOutputStream: java.io.OutputStream(), com.facebook.RequestOutputStream {
    private var batchMax: Int
    private val callbackHandler: android.os.Handler
    private var currentRequest: com.facebook.Request
    private var currentRequestProgress: com.facebook.RequestProgress
    private val progressMap: java.util.Map

    constructor(p0: android.os.Handler)

    fun addProgress(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/ProgressNoopOutputStream;->currentRequestProgress:Lcom/facebook/RequestProgress;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/facebook/RequestProgress;
    //         iget-object v1, p0, Lcom/facebook/ProgressNoopOutputStream;->callbackHandler:Landroid/os/Handler;
    //         iget-object v2, p0, Lcom/facebook/ProgressNoopOutputStream;->currentRequest:Lcom/facebook/Request;
    //         invoke-direct {v0, v1, v2}, Lcom/facebook/RequestProgress;-><init>(Landroid/os/Handler;Lcom/facebook/Request;)V
    //         iput-object v0, p0, Lcom/facebook/ProgressNoopOutputStream;->currentRequestProgress:Lcom/facebook/RequestProgress;
    //         iget-object v0, p0, Lcom/facebook/ProgressNoopOutputStream;->progressMap:Ljava/util/Map;
    //         iget-object v1, p0, Lcom/facebook/ProgressNoopOutputStream;->currentRequest:Lcom/facebook/Request;
    //         iget-object v2, p0, Lcom/facebook/ProgressNoopOutputStream;->currentRequestProgress:Lcom/facebook/RequestProgress;
    //         invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/ProgressNoopOutputStream;->currentRequestProgress:Lcom/facebook/RequestProgress;
    //         invoke-virtual {v0, p1, p2}, Lcom/facebook/RequestProgress;->addToMax(J)V
    //         iget v0, p0, Lcom/facebook/ProgressNoopOutputStream;->batchMax:I
    //         int-to-long v0, v0
    //         add-long/2addr v0, p1
    //         long-to-int v0, v0
    //         iput v0, p0, Lcom/facebook/ProgressNoopOutputStream;->batchMax:I
    //         return-void
    */

    fun getMaxProgress(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/ProgressNoopOutputStream;->batchMax:I
    //         return v0
    */

    fun getProgressMap(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Lcom/facebook/Request;",
    //                 "Lcom/facebook/RequestProgress;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/ProgressNoopOutputStream;->progressMap:Ljava/util/Map;
    //         return-object v0
    */

    public fun setCurrentRequest(p0: com.facebook.Request) { /* TODO(body): (Lcom/facebook/Request;)V */ }
    /*
    //         .locals 1
    //         iput-object p1, p0, Lcom/facebook/ProgressNoopOutputStream;->currentRequest:Lcom/facebook/Request;
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/ProgressNoopOutputStream;->progressMap:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/RequestProgress;
    //         :goto_0
    //         iput-object v0, p0, Lcom/facebook/ProgressNoopOutputStream;->currentRequestProgress:Lcom/facebook/RequestProgress;
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun write(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         const-wide/16 v0, 0x1
    //         invoke-virtual {p0, v0, v1}, Lcom/facebook/ProgressNoopOutputStream;->addProgress(J)V
    //         return-void
    */

    public fun write(p0: ByteArray) { /* TODO(body): ([B)V */ }
    /*
    //         .locals 2
    //         array-length v0, p1
    //         int-to-long v0, v0
    //         invoke-virtual {p0, v0, v1}, Lcom/facebook/ProgressNoopOutputStream;->addProgress(J)V
    //         return-void
    */

    public fun write(p0: ByteArray, p1: Int, p2: Int) { /* TODO(body): ([BII)V */ }
    /*
    //         .locals 2
    //         int-to-long v0, p3
    //         invoke-virtual {p0, v0, v1}, Lcom/facebook/ProgressNoopOutputStream;->addProgress(J)V
    //         return-void
    */

}
