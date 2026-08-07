package com.google.android.gms.games.achievement

// Auto-emitted from smali.
// 0 fields, 26 methods.

class AchievementRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.achievement.Achievement {
    constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.achievement.Achievement { return TODO("body: ()Lcom/google/android/gms/games/achievement/Achievement;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/achievement/AchievementEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;-><init>(Lcom/google/android/gms/games/achievement/Achievement;)V
    //         return-object v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementRef;->freeze()Lcom/google/android/gms/games/achievement/Achievement;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAchievementId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_achievement_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCurrentSteps(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getType()I
    //         move-result v1
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->I(Z)V
    //         const-string v0, "current_steps"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "description"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDescription(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "description"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/achievement/AchievementRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getFormattedCurrentSteps(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getType()I
    //         move-result v1
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->I(Z)V
    //         const-string v0, "formatted_current_steps"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getFormattedCurrentSteps(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getType()I
    //         move-result v1
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->I(Z)V
    //         const-string v0, "formatted_current_steps"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/achievement/AchievementRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getFormattedTotalSteps(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getType()I
    //         move-result v1
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->I(Z)V
    //         const-string v0, "formatted_total_steps"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getFormattedTotalSteps(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getType()I
    //         move-result v1
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->I(Z)V
    //         const-string v0, "formatted_total_steps"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/achievement/AchievementRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getLastUpdatedTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "last_updated_timestamp"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "name"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "name"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/achievement/AchievementRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getPlayer(): com.google.android.gms.games.Player { return TODO("body: ()Lcom/google/android/gms/games/Player;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/games/PlayerRef;
    //         iget-object v1, p0, Lcom/google/android/gms/games/achievement/AchievementRef;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v2, p0, Lcom/google/android/gms/games/achievement/AchievementRef;->JX:I
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/games/PlayerRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    //         return-object v0
    */

    public fun getRevealedImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "revealed_icon_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getRevealedImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "revealed_icon_image_url"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getState(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "state"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getTotalSteps(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getType()I
    //         move-result v1
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->I(Z)V
    //         const-string v0, "total_steps"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "type"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getUnlockedImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "unlocked_icon_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getUnlockedImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "unlocked_icon_image_url"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getXpValue(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "instance_xp_value"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->aQ(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "instance_xp_value"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const-string v0, "definition_xp_value"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         :goto_0
    //         return-wide v0
    //         :cond_1
    //         const-string v0, "instance_xp_value"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/achievement/AchievementRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/achievement/AchievementEntity;->b(Lcom/google/android/gms/games/achievement/Achievement;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/achievement/AchievementRef;->freeze()Lcom/google/android/gms/games/achievement/Achievement;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/achievement/AchievementEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/achievement/AchievementEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         return-void
    */

}
