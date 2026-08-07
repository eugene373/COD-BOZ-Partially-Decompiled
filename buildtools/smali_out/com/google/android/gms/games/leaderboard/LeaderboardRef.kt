package com.google.android.gms.games.leaderboard

// Auto-emitted from smali.
// 2 fields, 14 methods.

class LeaderboardRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.leaderboard.Leaderboard {
    private val aaK: Int
    private val abx: com.google.android.gms.games.Game

    constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int, numChildren: Int)

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;->a(Lcom/google/android/gms/games/leaderboard/Leaderboard;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardRef;->lz()Lcom/google/android/gms/games/leaderboard/Leaderboard;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDisplayName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "name"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDisplayName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "name"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/leaderboard/LeaderboardRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getGame(): com.google.android.gms.games.Game { return TODO("body: ()Lcom/google/android/gms/games/Game;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardRef;->abx:Lcom/google/android/gms/games/Game;
    //         return-object v0
    */

    public fun getIconImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "board_icon_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getIconImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "board_icon_image_url"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getLeaderboardId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_leaderboard_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getScoreOrder(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "score_order"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/LeaderboardRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getVariants(): java.util.ArrayList { return TODO("body: ()Ljava/util/ArrayList;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/games/leaderboard/LeaderboardVariant;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         iget v0, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardRef;->aaK:I
    //         invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         iget v2, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardRef;->aaK:I
    //         if-ge v0, v2, :cond_0
    //         new-instance v2, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;
    //         iget-object v3, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardRef;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v4, p0, Lcom/google/android/gms/games/leaderboard/LeaderboardRef;->JX:I
    //         add-int/2addr v4, v0
    //         invoke-direct {v2, v3, v4}, Lcom/google/android/gms/games/leaderboard/LeaderboardVariantRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    //         invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;->a(Lcom/google/android/gms/games/leaderboard/Leaderboard;)I
    //         move-result v0
    //         return v0
    */

    public fun lz(): com.google.android.gms.games.leaderboard.Leaderboard { return TODO("body: ()Lcom/google/android/gms/games/leaderboard/Leaderboard;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;-><init>(Lcom/google/android/gms/games/leaderboard/Leaderboard;)V
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/leaderboard/LeaderboardEntity;->b(Lcom/google/android/gms/games/leaderboard/Leaderboard;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

}
