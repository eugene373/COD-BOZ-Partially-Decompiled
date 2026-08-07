package com.google.android.gms.common.api

// Auto-emitted from smali.
// 2 fields, 3 methods.

class Batch_Builder {
    private var IG: java.util.List
    private var IH: android.os.Looper

    public constructor(googleApiClient: com.google.android.gms.common.api.GoogleApiClient)

    public fun add(p0: com.google.android.gms.common.api.PendingResult): com.google.android.gms.common.api.BatchResultToken { return TODO("body: (Lcom/google/android/gms/common/api/PendingResult;)Lcom/google/android/gms/common/api/BatchResultToken;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<R::",
    //                 "Lcom/google/android/gms/common/api/Result;",
    //                 ">(",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<TR;>;)",
    //                 "Lcom/google/android/gms/common/api/BatchResultToken",
    //                 "<TR;>;"
    //             }
    //         .end annotation
    //         .local p1, "pendingResult":Lcom/google/android/gms/common/api/PendingResult;, "Lcom/google/android/gms/common/api/PendingResult<TR;>;"
    //         new-instance v0, Lcom/google/android/gms/common/api/BatchResultToken;
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/Batch$Builder;->IG:Ljava/util/List;
    //         invoke-interface {v1}, Ljava/util/List;->size()I
    //         move-result v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/BatchResultToken;-><init>(I)V
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/Batch$Builder;->IG:Ljava/util/List;
    //         invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-object v0
    */

    public fun build(): com.google.android.gms.common.api.Batch { return TODO("body: ()Lcom/google/android/gms/common/api/Batch;") }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/google/android/gms/common/api/Batch;
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/Batch$Builder;->IG:Ljava/util/List;
    //         iget-object v2, p0, Lcom/google/android/gms/common/api/Batch$Builder;->IH:Landroid/os/Looper;
    //         const/4 v3, 0x0
    //         invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/Batch;-><init>(Ljava/util/List;Landroid/os/Looper;Lcom/google/android/gms/common/api/Batch$1;)V
    //         return-object v0
    */

}
