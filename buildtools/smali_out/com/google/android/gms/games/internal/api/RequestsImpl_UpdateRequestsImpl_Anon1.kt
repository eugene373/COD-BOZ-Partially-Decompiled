package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 2 fields, 5 methods.

open class RequestsImpl_UpdateRequestsImpl_Anon1: com.google.android.gms.games.request.Requests.UpdateRequestsResult {
    val CW: com.google.android.gms.common.api.Status
    val ZK: com.google.android.gms.games.internal.api.RequestsImpl.UpdateRequestsImpl

    constructor(p0: com.google.android.gms.games.internal.api.RequestsImpl.UpdateRequestsImpl, p1: com.google.android.gms.common.api.Status)

    public fun getRequestIds(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getRequestOutcome(requestId: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 3
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unknown request ID "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$UpdateRequestsImpl$1;->CW:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
