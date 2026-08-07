package com.google.android.gms.games.leaderboard

// Auto-emitted from smali.
// 1 fields, 21 methods.

class LeaderboardScoreRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.leaderboard.LeaderboardScore {
    private val abL: com.google.android.gms.games.PlayerRef

    constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int)

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreEntity;->a(Lcom/google/android/gms/games/leaderboard/LeaderboardScore;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->lC()Lcom/google/android/gms/games/leaderboard/LeaderboardScore;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDisplayRank(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "display_rank"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDisplayRank(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "display_rank"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getDisplayScore(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "display_score"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDisplayScore(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "display_score"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getRank(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "rank"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getRawScore(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "raw_score"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getScoreHolder(): com.google.android.gms.games.Player { return TODO("body: ()Lcom/google/android/gms/games/Player;") }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->abL:Lcom/google/android/gms/games/PlayerRef;
    //         goto :goto_0
    */

    public fun getScoreHolderDisplayName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "default_display_name"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->abL:Lcom/google/android/gms/games/PlayerRef;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->getDisplayName()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getScoreHolderDisplayName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "default_display_name"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->abL:Lcom/google/android/gms/games/PlayerRef;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/games/PlayerRef;->getDisplayName(Landroid/database/CharArrayBuffer;)V
    //         goto :goto_0
    */

    public fun getScoreHolderHiResImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->abL:Lcom/google/android/gms/games/PlayerRef;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getScoreHolderHiResImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->abL:Lcom/google/android/gms/games/PlayerRef;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->getHiResImageUrl()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getScoreHolderIconImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "default_display_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->abL:Lcom/google/android/gms/games/PlayerRef;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getScoreHolderIconImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "default_display_image_url"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->abL:Lcom/google/android/gms/games/PlayerRef;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->getIconImageUrl()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getScoreTag(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "score_tag"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getTimestampMillis(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "achieved_timestamp"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreEntity;->a(Lcom/google/android/gms/games/leaderboard/LeaderboardScore;)I
    //         move-result v0
    //         return v0
    */

    public fun lC(): com.google.android.gms.games.leaderboard.LeaderboardScore { return TODO("body: ()Lcom/google/android/gms/games/leaderboard/LeaderboardScore;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreEntity;-><init>(Lcom/google/android/gms/games/leaderboard/LeaderboardScore;)V
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardScoreEntity;->b(Lcom/google/android/gms/games/leaderboard/LeaderboardScore;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
