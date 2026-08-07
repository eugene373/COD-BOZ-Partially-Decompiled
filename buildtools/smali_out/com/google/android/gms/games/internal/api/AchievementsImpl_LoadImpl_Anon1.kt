package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 2 fields, 4 methods.

open class AchievementsImpl_LoadImpl_Anon1: com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult {
    val CW: com.google.android.gms.common.api.Status
    val Yl: com.google.android.gms.games.internal.api.AchievementsImpl.LoadImpl

    constructor(p0: com.google.android.gms.games.internal.api.AchievementsImpl.LoadImpl, p1: com.google.android.gms.common.api.Status)

    public fun getAchievements(): com.google.android.gms.games.achievement.AchievementBuffer { return TODO("body: ()Lcom/google/android/gms/games/achievement/AchievementBuffer;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/games/achievement/AchievementBuffer;
    //         const/16 v1, 0xe
    //         invoke-static {v1}, Lcom/google/android/gms/common/data/DataHolder;->as(I)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/games/achievement/AchievementBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$LoadImpl$1;->CW:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun release() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
