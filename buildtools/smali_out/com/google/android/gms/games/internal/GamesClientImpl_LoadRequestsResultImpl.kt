package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 2 fields, 4 methods.

class GamesClientImpl_LoadRequestsResultImpl: com.google.android.gms.games.request.Requests.LoadRequestsResult {
    private val CM: com.google.android.gms.common.api.Status
    private val Xb: android.os.Bundle

    constructor(status: com.google.android.gms.common.api.Status, requestData: android.os.Bundle)

    public fun getRequests(requestType: Int): com.google.android.gms.games.request.GameRequestBuffer { return TODO("body: (I)Lcom/google/android/gms/games/request/GameRequestBuffer;") }
    /*
    //         .locals 2
    //         invoke-static {p1}, Lcom/google/android/gms/games/internal/constants/RequestType;->dH(I)Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadRequestsResultImpl;->Xb:Landroid/os/Bundle;
    //         invoke-virtual {v1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadRequestsResultImpl;->Xb:Landroid/os/Bundle;
    //         invoke-virtual {v1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/data/DataHolder;
    //         new-instance v1, Lcom/google/android/gms/games/request/GameRequestBuffer;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/games/request/GameRequestBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         move-object v0, v1
    //         goto :goto_0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadRequestsResultImpl;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadRequestsResultImpl;->Xb:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadRequestsResultImpl;->Xb:Landroid/os/Bundle;
    //         invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/data/DataHolder;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/data/DataHolder;->close()V
    //         goto :goto_0
    //         :cond_1
    //         return-void
    */

}
