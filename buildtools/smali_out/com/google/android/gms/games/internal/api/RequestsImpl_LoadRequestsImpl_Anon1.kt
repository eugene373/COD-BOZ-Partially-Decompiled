package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 2 fields, 4 methods.

open class RequestsImpl_LoadRequestsImpl_Anon1: com.google.android.gms.games.request.Requests.LoadRequestsResult {
    val CW: com.google.android.gms.common.api.Status
    val ZI: com.google.android.gms.games.internal.api.RequestsImpl.LoadRequestsImpl

    constructor(p0: com.google.android.gms.games.internal.api.RequestsImpl.LoadRequestsImpl, p1: com.google.android.gms.common.api.Status)

    public fun getRequests(type: Int): com.google.android.gms.games.request.GameRequestBuffer { return TODO("body: (I)Lcom/google/android/gms/games/request/GameRequestBuffer;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$LoadRequestsImpl$1;->CW:Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I
    //         move-result v0
    //         new-instance v1, Lcom/google/android/gms/games/request/GameRequestBuffer;
    //         invoke-static {v0}, Lcom/google/android/gms/common/data/DataHolder;->as(I)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/games/request/GameRequestBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         return-object v1
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/api/RequestsImpl$LoadRequestsImpl$1;->CW:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
