package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 0 fields, 10 methods.

class QuestsImpl: com.google.android.gms.games.quest.Quests {
    public constructor()

    public fun accept(apiClient: com.google.android.gms.common.api.GoogleApiClient, questId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/QuestsImpl$1;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/QuestsImpl$1;-><init>(Lcom/google/android/gms/games/internal/api/QuestsImpl;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun claim(apiClient: com.google.android.gms.common.api.GoogleApiClient, questId: String, milestoneId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/QuestsImpl$2;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/games/internal/api/QuestsImpl$2;-><init>(Lcom/google/android/gms/games/internal/api/QuestsImpl;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getQuestIntent(apiClient: com.google.android.gms.common.api.GoogleApiClient, questId: String): android.content.Intent { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->bC(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getQuestsIntent(apiClient: com.google.android.gms.common.api.GoogleApiClient, questSelectors: IntArray): android.content.Intent { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;[I)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->b([I)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun load(apiClient: com.google.android.gms.common.api.GoogleApiClient, questSelectors: IntArray, sortOrder: Int, forceReload: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;[IIZ)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/QuestsImpl$3;
    //         invoke-direct {v0, p0, p2, p3, p4}, Lcom/google/android/gms/games/internal/api/QuestsImpl$3;-><init>(Lcom/google/android/gms/games/internal/api/QuestsImpl;[IIZ)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadByIds(apiClient: com.google.android.gms.common.api.GoogleApiClient, forceReload: Boolean, questIds: Array<String>): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Z[Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/QuestsImpl$4;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/games/internal/api/QuestsImpl$4;-><init>(Lcom/google/android/gms/games/internal/api/QuestsImpl;Z[Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun registerQuestUpdateListener(apiClient: com.google.android.gms.common.api.GoogleApiClient, listener: com.google.android.gms.games.quest.QuestUpdateListener) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/quest/QuestUpdateListener;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/games/quest/QuestUpdateListener;)V
    //         return-void
    */

    public fun showStateChangedPopup(apiClient: com.google.android.gms.common.api.GoogleApiClient, questId: String) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->bD(Ljava/lang/String;)V
    //         return-void
    */

    public fun unregisterQuestUpdateListener(apiClient: com.google.android.gms.common.api.GoogleApiClient) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kk()V
    //         return-void
    */

}
