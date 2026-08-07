package com.google.android.gms.games.internal.request

// Auto-emitted from smali.
// 2 fields, 4 methods.

class RequestUpdateOutcomes_Builder {
    private var HF: Int
    private var abt: java.util.HashMap

    public constructor()

    public fun dR(p0: Int): com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder { return TODO("body: (I)Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;->HF:I
    //         return-object p0
    */

    public fun ly(): com.google.android.gms.games.internal.request.RequestUpdateOutcomes { return TODO("body: ()Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;") }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;
    //         iget v1, p0, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;->HF:I
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;->abt:Ljava/util/HashMap;
    //         const/4 v3, 0x0
    //         invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;-><init>(ILjava/util/HashMap;Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$1;)V
    //         return-object v0
    */

    public fun x(p0: String, p1: Int): com.google.android.gms.games.internal.request.RequestUpdateOutcomes.Builder { return TODO("body: (Ljava/lang/String;I)Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;") }
    /*
    //         .locals 2
    //         invoke-static {p2}, Lcom/google/android/gms/games/internal/constants/RequestUpdateResultOutcome;->isValid(I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;->abt:Ljava/util/HashMap;
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v1
    //         invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         return-object p0
    */

}
