package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 2 fields, 4 methods.

open class QuestsImpl_LoadsImpl_Anon1: com.google.android.gms.games.quest.Quests.LoadQuestsResult {
    val CW: com.google.android.gms.common.api.Status
    val Zy: com.google.android.gms.games.internal.api.QuestsImpl.LoadsImpl

    constructor(p0: com.google.android.gms.games.internal.api.QuestsImpl.LoadsImpl, p1: com.google.android.gms.common.api.Status)

    public fun getQuests(): com.google.android.gms.games.quest.QuestBuffer { return TODO("body: ()Lcom/google/android/gms/games/quest/QuestBuffer;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/api/QuestsImpl$LoadsImpl$1;->CW:Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I
    //         move-result v0
    //         new-instance v1, Lcom/google/android/gms/games/quest/QuestBuffer;
    //         invoke-static {v0}, Lcom/google/android/gms/common/data/DataHolder;->as(I)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/games/quest/QuestBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         return-object v1
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/api/QuestsImpl$LoadsImpl$1;->CW:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
