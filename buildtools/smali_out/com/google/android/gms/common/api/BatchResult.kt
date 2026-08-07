package com.google.android.gms.common.api

// Auto-emitted from smali.
// 2 fields, 3 methods.

class BatchResult: com.google.android.gms.common.api.Result {
    private val CM: com.google.android.gms.common.api.Status
    private val IE: Array<com.google.android.gms.common.api.PendingResult>

    constructor(status: com.google.android.gms.common.api.Status, p1: Array<com.google.android.gms.common.api.PendingResult>)

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/BatchResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun take(p0: com.google.android.gms.common.api.BatchResultToken): com.google.android.gms.common.api.Result { return TODO("body: (Lcom/google/android/gms/common/api/BatchResultToken;)Lcom/google/android/gms/common/api/Result;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<R::",
    //                 "Lcom/google/android/gms/common/api/Result;",
    //                 ">(",
    //                 "Lcom/google/android/gms/common/api/BatchResultToken",
    //                 "<TR;>;)TR;"
    //             }
    //         .end annotation
    //         .local p1, "resultToken":Lcom/google/android/gms/common/api/BatchResultToken;, "Lcom/google/android/gms/common/api/BatchResultToken<TR;>;"
    //         iget v0, p1, Lcom/google/android/gms/common/api/BatchResultToken;->mId:I
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/BatchResult;->IE:[Lcom/google/android/gms/common/api/PendingResult;
    //         array-length v1, v1
    //         if-ge v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "The result token does not belong to this batch"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/BatchResult;->IE:[Lcom/google/android/gms/common/api/PendingResult;
    //         iget v1, p1, Lcom/google/android/gms/common/api/BatchResultToken;->mId:I
    //         aget-object v0, v0, v1
    //         const-wide/16 v2, 0x0
    //         sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-interface {v0, v2, v3, v1}, Lcom/google/android/gms/common/api/PendingResult;->await(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/Result;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
