package com.facebook

// Auto-emitted from smali source: ProgressOutputStream.java.
// 7 fields, 13 methods.

open class ProgressOutputStream: java.io.FilterOutputStream(), com.facebook.RequestOutputStream {
    private var batchProgress: Long
    private var currentRequestProgress: com.facebook.RequestProgress
    private var lastReportedProgress: Long
    private var maxProgress: Long
    private val progressMap: java.util.Map
    private val requests: com.facebook.RequestBatch
    private val threshold: Long

    constructor(p0: java.io.OutputStream, p1: com.facebook.RequestBatch, p2: java.util.Map, p3: Long)

    private fun addProgress(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->currentRequestProgress:Lcom/facebook/RequestProgress;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->currentRequestProgress:Lcom/facebook/RequestProgress;
    //         invoke-virtual {v0, p1, p2}, Lcom/facebook/RequestProgress;->addProgress(J)V
    //         :cond_0
    //         iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J
    //         add-long/2addr v0, p1
    //         iput-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J
    //         iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J
    //         iget-wide v2, p0, Lcom/facebook/ProgressOutputStream;->lastReportedProgress:J
    //         iget-wide v4, p0, Lcom/facebook/ProgressOutputStream;->threshold:J
    //         add-long/2addr v2, v4
    //         cmp-long v0, v0, v2
    //         if-gez v0, :cond_1
    //         iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J
    //         iget-wide v2, p0, Lcom/facebook/ProgressOutputStream;->maxProgress:J
    //         cmp-long v0, v0, v2
    //         if-ltz v0, :cond_2
    //         :cond_1
    //         invoke-direct {p0}, Lcom/facebook/ProgressOutputStream;->reportBatchProgress()V
    //         :cond_2
    //         return-void
    */

    private fun reportBatchProgress() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J
    //         iget-wide v2, p0, Lcom/facebook/ProgressOutputStream;->lastReportedProgress:J
    //         cmp-long v0, v0, v2
    //         if-lez v0, :cond_3
    //         iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->requests:Lcom/facebook/RequestBatch;
    //         invoke-virtual {v0}, Lcom/facebook/RequestBatch;->getCallbacks()Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v6
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/RequestBatch$Callback;
    //         instance-of v1, v0, Lcom/facebook/RequestBatch$OnProgressCallback;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/facebook/ProgressOutputStream;->requests:Lcom/facebook/RequestBatch;
    //         invoke-virtual {v1}, Lcom/facebook/RequestBatch;->getCallbackHandler()Landroid/os/Handler;
    //         move-result-object v1
    //         check-cast v0, Lcom/facebook/RequestBatch$OnProgressCallback;
    //         if-nez v1, :cond_1
    //         iget-object v1, p0, Lcom/facebook/ProgressOutputStream;->requests:Lcom/facebook/RequestBatch;
    //         iget-wide v2, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J
    //         iget-wide v4, p0, Lcom/facebook/ProgressOutputStream;->maxProgress:J
    //         invoke-interface/range {v0 .. v5}, Lcom/facebook/RequestBatch$OnProgressCallback;->onBatchProgress(Lcom/facebook/RequestBatch;JJ)V
    //         goto :goto_0
    //         :cond_1
    //         new-instance v2, Lcom/facebook/ProgressOutputStream$1;
    //         invoke-direct {v2, p0, v0}, Lcom/facebook/ProgressOutputStream$1;-><init>(Lcom/facebook/ProgressOutputStream;Lcom/facebook/RequestBatch$OnProgressCallback;)V
    //         invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         goto :goto_0
    //         :cond_2
    //         iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J
    //         iput-wide v0, p0, Lcom/facebook/ProgressOutputStream;->lastReportedProgress:J
    //         :cond_3
    //         return-void
    */

    public fun close() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V
    //         iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->progressMap:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/RequestProgress;
    //         invoke-virtual {v0}, Lcom/facebook/RequestProgress;->reportProgress()V
    //         goto :goto_0
    //         :cond_0
    //         invoke-direct {p0}, Lcom/facebook/ProgressOutputStream;->reportBatchProgress()V
    //         return-void
    */

    fun getBatchProgress(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J
    //         return-wide v0
    */

    fun getMaxProgress(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->maxProgress:J
    //         return-wide v0
    */

    public fun setCurrentRequest(p0: com.facebook.Request) { /* TODO(body): (Lcom/facebook/Request;)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->progressMap:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/RequestProgress;
    //         :goto_0
    //         iput-object v0, p0, Lcom/facebook/ProgressOutputStream;->currentRequestProgress:Lcom/facebook/RequestProgress;
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun write(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->out:Ljava/io/OutputStream;
    //         invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V
    //         const-wide/16 v0, 0x1
    //         invoke-direct {p0, v0, v1}, Lcom/facebook/ProgressOutputStream;->addProgress(J)V
    //         return-void
    */

    public fun write(p0: ByteArray) { /* TODO(body): ([B)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->out:Ljava/io/OutputStream;
    //         invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    //         array-length v0, p1
    //         int-to-long v0, v0
    //         invoke-direct {p0, v0, v1}, Lcom/facebook/ProgressOutputStream;->addProgress(J)V
    //         return-void
    */

    public fun write(p0: ByteArray, p1: Int, p2: Int) { /* TODO(body): ([BII)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->out:Ljava/io/OutputStream;
    //         invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
    //         int-to-long v0, p3
    //         invoke-direct {p0, v0, v1}, Lcom/facebook/ProgressOutputStream;->addProgress(J)V
    //         return-void
    */

}
