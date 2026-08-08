package com.ideaworks3d.marmalade.s3eGooglePlayServices

// Auto-emitted from smali source: s3eGooglePlayServicesActivity.java.
// 1 fields, 3 methods.

open class s3eGooglePlayServicesActivity_Anon3() {
    val thisRef0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServicesActivity? = null

    constructor(p0: com.ideaworks3d.marmalade.s3eGooglePlayServices.s3eGooglePlayServicesActivity) : this()

    public fun onResult(p0: com.google.android.gms.common.api.Result) { /* TODO(body): (Lcom/google/android/gms/common/api/Result;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;
    //         invoke-virtual {p0, p1}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity$3;->onResult(Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;)V
    //         return-void
    */

    public fun onResult(p0: com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult) { /* TODO(body): (Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;)V */ }
    /*
    //         .locals 2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;->getStatus()Lcom/google/android/gms/common/api/Status;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;->getStatus()Lcom/google/android/gms/common/api/Status;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I
    //         move-result v0
    //         const/16 v1, 0xbbb
    //         if-ne v0, v1, :cond_1
    //         :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/games/achievement/Achievements$UpdateAchievementResult;->getAchievementId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/ideaworks3d/marmalade/s3eGooglePlayServices/s3eGooglePlayServicesActivity;->native_AchievementUnlockedCallback(Ljava/lang/String;)V
    //         :cond_1
    //         return-void
    */

}