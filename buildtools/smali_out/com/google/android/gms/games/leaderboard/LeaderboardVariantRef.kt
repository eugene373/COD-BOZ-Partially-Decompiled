package com.google.android.gms.games.leaderboard

// Auto-emitted from smali.
// 0 fields, 18 methods.

class LeaderboardVariantRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.leaderboard.LeaderboardVariant {
    constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int)

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->a(Lcom/google/android/gms/games/leaderboard/LeaderboardVariant;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->lG()Lcom/google/android/gms/games/leaderboard/LeaderboardVariant;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCollection(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "collection"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getDisplayPlayerRank(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "player_display_rank"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDisplayPlayerScore(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "player_display_score"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getNumScores(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "total_scores"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-wide/16 v0, -0x1
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         const-string v0, "total_scores"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         goto :goto_0
    */

    public fun getPlayerRank(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "player_rank"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-wide/16 v0, -0x1
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         const-string v0, "player_rank"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         goto :goto_0
    */

    public fun getPlayerScoreTag(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "player_score_tag"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getRawPlayerScore(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "player_raw_score"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-wide/16 v0, -0x1
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         const-string v0, "player_raw_score"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         goto :goto_0
    */

    public fun getTimeSpan(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "timespan"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun hasPlayerInfo(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "player_raw_score"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->a(Lcom/google/android/gms/games/leaderboard/LeaderboardVariant;)I
    //         move-result v0
    //         return v0
    */

    public fun lD(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "top_page_token_next"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun lE(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "window_page_token_prev"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun lF(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "window_page_token_next"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun lG(): com.google.android.gms.games.leaderboard.LeaderboardVariant { return TODO("body: ()Lcom/google/android/gms/games/leaderboard/LeaderboardVariant;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;-><init>(Lcom/google/android/gms/games/leaderboard/LeaderboardVariant;)V
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantEntity;->b(Lcom/google/android/gms/games/leaderboard/LeaderboardVariant;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
