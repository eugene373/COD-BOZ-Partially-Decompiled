package com.google.android.gms.common.api

// Auto-emitted from smali.
// 5 fields, 14 methods.

class Batch: com.google.android.gms.common.api.BaseImplementation.AbstractPendingResult() {
    private var IA: Int
    private var IB: Boolean
    private var IC: Boolean
    private val IE: Array<com.google.android.gms.common.api.PendingResult>
    private val mw: Object

    private constructor(looper: java.util.List, p1: android.os.Looper)

    constructor(x0: java.util.List, x1: android.os.Looper, x2: com.google.android.gms.common.api.Batch.1)

    public fun c(p0: com.google.android.gms.common.api.Status): com.google.android.gms.common.api.Result { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/Batch;->createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/BatchResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun cancel() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         invoke-super {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->cancel()V
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/Batch;->IE:[Lcom/google/android/gms/common/api/PendingResult;
    //         array-length v2, v1
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v2, :cond_0
    //         aget-object v3, v1, v0
    //         invoke-interface {v3}, Lcom/google/android/gms/common/api/PendingResult;->cancel()V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public fun createFailedResult(status: com.google.android.gms.common.api.Status): com.google.android.gms.common.api.BatchResult { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/BatchResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/common/api/BatchResult;
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/Batch;->IE:[Lcom/google/android/gms/common/api/PendingResult;
    //         invoke-direct {v0, p1, v1}, Lcom/google/android/gms/common/api/BatchResult;-><init>(Lcom/google/android/gms/common/api/Status;[Lcom/google/android/gms/common/api/PendingResult;)V
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.common.api.Batch): Object { return TODO("body: (Lcom/google/android/gms/common/api/Batch;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/Batch;->mw:Ljava/lang/Object;
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.common.api.Batch, p1: Boolean): Boolean { return TODO("body: (Lcom/google/android/gms/common/api/Batch;Z)Z") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/common/api/Batch;->IC:Z
    //         return p1
    */

    @JvmStatic fun b(p0: com.google.android.gms.common.api.Batch): Int { return TODO("body: (Lcom/google/android/gms/common/api/Batch;)I") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/common/api/Batch;->IA:I
    //         add-int/lit8 v1, v0, -0x1
    //         iput v1, p0, Lcom/google/android/gms/common/api/Batch;->IA:I
    //         return v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.common.api.Batch, p1: Boolean): Boolean { return TODO("body: (Lcom/google/android/gms/common/api/Batch;Z)Z") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/common/api/Batch;->IB:Z
    //         return p1
    */

    @JvmStatic fun c(p0: com.google.android.gms.common.api.Batch): Int { return TODO("body: (Lcom/google/android/gms/common/api/Batch;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/api/Batch;->IA:I
    //         return v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.common.api.Batch): Boolean { return TODO("body: (Lcom/google/android/gms/common/api/Batch;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/api/Batch;->IC:Z
    //         return v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.common.api.Batch) { /* TODO(body): (Lcom/google/android/gms/common/api/Batch;)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->cancel()V
    //         return-void
    */

    @JvmStatic fun f(p0: com.google.android.gms.common.api.Batch): Boolean { return TODO("body: (Lcom/google/android/gms/common/api/Batch;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/api/Batch;->IB:Z
    //         return v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.common.api.Batch): Array<com.google.android.gms.common.api.PendingResult> { return TODO("body: (Lcom/google/android/gms/common/api/Batch;)[Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/Batch;->IE:[Lcom/google/android/gms/common/api/PendingResult;
    //         return-object v0
    */

    }
}
