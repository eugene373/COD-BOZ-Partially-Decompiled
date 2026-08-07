package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 2 fields, 3 methods.

class GamesClientImpl_QuestUpdateBinderCallback: com.google.android.gms.games.internal.AbstractGamesCallbacks() {
    val WC: com.google.android.gms.games.internal.GamesClientImpl
    private val Xv: com.google.android.gms.games.quest.QuestUpdateListener

    constructor(listener: com.google.android.gms.games.internal.GamesClientImpl, p1: com.google.android.gms.games.quest.QuestUpdateListener)

    private fun S(p0: com.google.android.gms.common.data.DataHolder): com.google.android.gms.games.quest.Quest { return TODO("body: (Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/quest/Quest;") }
    /*
    //         .locals 3
    //         new-instance v1, Lcom/google/android/gms/games/quest/QuestBuffer;
    //         invoke-direct {v1, p1}, Lcom/google/android/gms/games/quest/QuestBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/quest/QuestBuffer;->getCount()I
    //         move-result v2
    //         if-lez v2, :cond_0
    //         const/4 v0, 0x0
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/games/quest/QuestBuffer;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/quest/Quest;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/quest/Quest;->freeze()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/quest/Quest;
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :cond_0
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/quest/QuestBuffer;->release()V
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         invoke-virtual {v1}, Lcom/google/android/gms/games/quest/QuestBuffer;->release()V
    //         throw v0
    */

    public fun M(p0: com.google.android.gms.common.data.DataHolder) { /* TODO(body): (Lcom/google/android/gms/common/data/DataHolder;)V */ }
    /*
    //         .locals 5
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestUpdateBinderCallback;->S(Lcom/google/android/gms/common/data/DataHolder;)Lcom/google/android/gms/games/quest/Quest;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestUpdateBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         new-instance v2, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestCompletedCallback;
    //         iget-object v3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestUpdateBinderCallback;->WC:Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         iget-object v4, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestUpdateBinderCallback;->Xv:Lcom/google/android/gms/games/quest/QuestUpdateListener;
    //         invoke-direct {v2, v3, v4, v0}, Lcom/google/android/gms/games/internal/GamesClientImpl$QuestCompletedCallback;-><init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/quest/QuestUpdateListener;Lcom/google/android/gms/games/quest/Quest;)V
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/internal/e$b;)V
    //         :cond_0
    //         return-void
    */

}
