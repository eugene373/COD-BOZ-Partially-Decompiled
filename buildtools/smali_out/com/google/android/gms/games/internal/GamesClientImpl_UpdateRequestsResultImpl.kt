package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

class GamesClientImpl_UpdateRequestsResultImpl: com.google.android.gms.common.api.a(), com.google.android.gms.games.request.Requests.UpdateRequestsResult {
    private val XU: com.google.android.gms.games.internal.request.RequestUpdateOutcomes

    constructor(dataHolder: com.google.android.gms.common.data.DataHolder)

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
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$UpdateRequestsResultImpl;->XU:Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;->getRequestIds()Ljava/util/Set;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getRequestOutcome(requestId: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$UpdateRequestsResultImpl;->XU:Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;->getRequestOutcome(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

}
