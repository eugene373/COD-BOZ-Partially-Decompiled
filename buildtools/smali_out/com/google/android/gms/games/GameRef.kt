package com.google.android.gms.games

// Auto-emitted from smali.
// 0 fields, 35 methods.

class GameRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.Game {
    public constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int)

    public fun areSnapshotsEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "snapshots_enabled"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/GameEntity;->a(Lcom/google/android/gms/games/Game;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.Game { return TODO("body: ()Lcom/google/android/gms/games/Game;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/GameEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/GameEntity;-><init>(Lcom/google/android/gms/games/Game;)V
    //         return-object v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/GameRef;->freeze()Lcom/google/android/gms/games/Game;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAchievementTotalCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "achievement_total_count"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getApplicationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_game_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "game_description"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDescription(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "game_description"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/GameRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getDeveloperName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "developer_name"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDeveloperName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "developer_name"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/GameRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getDisplayName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "display_name"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDisplayName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "display_name"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/GameRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getFeaturedImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "featured_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getFeaturedImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "featured_image_url"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getHiResImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "game_hi_res_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getHiResImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "game_hi_res_image_url"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getIconImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "game_icon_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getIconImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "game_icon_image_url"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getLeaderboardCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "leaderboard_count"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getPrimaryCategory(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "primary_category"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getSecondaryCategory(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "secondary_category"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getThemeColor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "theme_color"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/GameEntity;->a(Lcom/google/android/gms/games/Game;)I
    //         move-result v0
    //         return v0
    */

    public fun isMuted(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "muted"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public fun isRealTimeMultiplayerEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "real_time_support"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isTurnBasedMultiplayerEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "turn_based_support"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun jO(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "play_enabled_game"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public fun jP(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "identity_sharing_confirmed"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public fun jQ(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "installed"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun jR(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "package_name"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun jS(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "gameplay_acl_status"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/GameRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/GameEntity;->b(Lcom/google/android/gms/games/Game;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/GameRef;->freeze()Lcom/google/android/gms/games/Game;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/GameEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/GameEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         return-void
    */

}
