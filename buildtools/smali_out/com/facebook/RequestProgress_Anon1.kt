package com.facebook

// Auto-emitted from smali source: RequestProgress.java.
// 4 fields, 2 methods.

open class RequestProgress_Anon1: Runnable {
    val this$0: com.facebook.RequestProgress
    val val$callbackCopy: com.facebook.Request.OnProgressCallback
    val val$currentCopy: Long
    val val$maxProgressCopy: Long

    constructor(p0: com.facebook.RequestProgress, p1: com.facebook.Request.OnProgressCallback, p2: Long, p3: Long)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         iget-object v0, p0, Lcom/facebook/RequestProgress$1;->val$callbackCopy:Lcom/facebook/Request$OnProgressCallback;
    //         iget-wide v2, p0, Lcom/facebook/RequestProgress$1;->val$currentCopy:J
    //         iget-wide v4, p0, Lcom/facebook/RequestProgress$1;->val$maxProgressCopy:J
    //         invoke-interface {v0, v2, v3, v4, v5}, Lcom/facebook/Request$OnProgressCallback;->onProgress(JJ)V
    //         return-void
    */

}
