package com.google.android.gms.games.internal.request

// Auto-emitted from smali.
// 3 fields, 6 methods.

class RequestUpdateOutcomes {
    private val HF: Int
    private val abt: java.util.HashMap

    private constructor(statusCode: Int, p1: java.util.HashMap)

    constructor(x0: Int, x1: java.util.HashMap, x2: com.google.android.gms.games.internal.request.RequestUpdateOutcomes.1)

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
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;->abt:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getRequestOutcome(requestId: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;->abt:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Request "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " was not part of the update operation!"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;->abt:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Integer;
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         return v0
    */

    companion object {
    private val abs: Array<String> = null!!

    public @JvmStatic fun V(p0: com.google.android.gms.common.data.DataHolder): com.google.android.gms.games.internal.request.RequestUpdateOutcomes { return TODO("body: (Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;") }
    /*
    //         .locals 6
    //         new-instance v1, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;
    //         invoke-direct {v1}, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;-><init>()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/data/DataHolder;->getStatusCode()I
    //         move-result v0
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;->dR(I)Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/data/DataHolder;->getCount()I
    //         move-result v2
    //         const/4 v0, 0x0
    //         :goto_0
    //         if-ge v0, v2, :cond_0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/data/DataHolder;->ar(I)I
    //         move-result v3
    //         const-string v4, "requestId"
    //         invoke-virtual {p0, v4, v0, v3}, Lcom/google/android/gms/common/data/DataHolder;->c(Ljava/lang/String;II)Ljava/lang/String;
    //         move-result-object v4
    //         const-string v5, "outcome"
    //         invoke-virtual {p0, v5, v0, v3}, Lcom/google/android/gms/common/data/DataHolder;->b(Ljava/lang/String;II)I
    //         move-result v3
    //         invoke-virtual {v1, v4, v3}, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;->x(Ljava/lang/String;I)Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes$Builder;->ly()Lcom/google/android/gms/games/internal/request/RequestUpdateOutcomes;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
