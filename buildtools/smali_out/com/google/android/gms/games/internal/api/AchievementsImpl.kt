package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 0 fields, 11 methods.

class AchievementsImpl: com.google.android.gms.games.achievement.Achievements {
    public constructor()

    public fun getAchievementsIntent(apiClient: com.google.android.gms.common.api.GoogleApiClient): android.content.Intent { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kf()Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun increment(apiClient: com.google.android.gms.common.api.GoogleApiClient, id: String, numSteps: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$6;
    //         invoke-direct {v0, p0, p2, p2, p3}, Lcom/google/android/gms/games/internal/api/AchievementsImpl$6;-><init>(Lcom/google/android/gms/games/internal/api/AchievementsImpl;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         return-void
    */

    public fun incrementImmediate(apiClient: com.google.android.gms.common.api.GoogleApiClient, id: String, numSteps: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$7;
    //         invoke-direct {v0, p0, p2, p2, p3}, Lcom/google/android/gms/games/internal/api/AchievementsImpl$7;-><init>(Lcom/google/android/gms/games/internal/api/AchievementsImpl;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun load(apiClient: com.google.android.gms.common.api.GoogleApiClient, forceReload: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$1;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/AchievementsImpl$1;-><init>(Lcom/google/android/gms/games/internal/api/AchievementsImpl;Z)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun reveal(apiClient: com.google.android.gms.common.api.GoogleApiClient, id: String) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$2;
    //         invoke-direct {v0, p0, p2, p2}, Lcom/google/android/gms/games/internal/api/AchievementsImpl$2;-><init>(Lcom/google/android/gms/games/internal/api/AchievementsImpl;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         return-void
    */

    public fun revealImmediate(apiClient: com.google.android.gms.common.api.GoogleApiClient, id: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$3;
    //         invoke-direct {v0, p0, p2, p2}, Lcom/google/android/gms/games/internal/api/AchievementsImpl$3;-><init>(Lcom/google/android/gms/games/internal/api/AchievementsImpl;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setSteps(apiClient: com.google.android.gms.common.api.GoogleApiClient, id: String, numSteps: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$8;
    //         invoke-direct {v0, p0, p2, p2, p3}, Lcom/google/android/gms/games/internal/api/AchievementsImpl$8;-><init>(Lcom/google/android/gms/games/internal/api/AchievementsImpl;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         return-void
    */

    public fun setStepsImmediate(apiClient: com.google.android.gms.common.api.GoogleApiClient, id: String, numSteps: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$9;
    //         invoke-direct {v0, p0, p2, p2, p3}, Lcom/google/android/gms/games/internal/api/AchievementsImpl$9;-><init>(Lcom/google/android/gms/games/internal/api/AchievementsImpl;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun unlock(apiClient: com.google.android.gms.common.api.GoogleApiClient, id: String) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$4;
    //         invoke-direct {v0, p0, p2, p2}, Lcom/google/android/gms/games/internal/api/AchievementsImpl$4;-><init>(Lcom/google/android/gms/games/internal/api/AchievementsImpl;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         return-void
    */

    public fun unlockImmediate(apiClient: com.google.android.gms.common.api.GoogleApiClient, id: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$5;
    //         invoke-direct {v0, p0, p2, p2}, Lcom/google/android/gms/games/internal/api/AchievementsImpl$5;-><init>(Lcom/google/android/gms/games/internal/api/AchievementsImpl;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
