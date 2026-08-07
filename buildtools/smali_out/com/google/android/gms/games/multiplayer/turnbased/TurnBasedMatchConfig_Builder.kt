package com.google.android.gms.games.multiplayer.turnbased

// Auto-emitted from smali.
// 4 fields, 7 methods.

class TurnBasedMatchConfig_Builder {
    var acD: Int
    var acd: Int
    var acs: android.os.Bundle
    var acv: java.util.ArrayList

    private constructor()

    constructor(x0: com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.1)

    public fun addInvitedPlayer(playerId: String): com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;->acv:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun addInvitedPlayers(p0: java.util.ArrayList): com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.Builder { return TODO("body: (Ljava/util/ArrayList;)Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "playerIds":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;->acv:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    //         return-object p0
    */

    public fun build(): com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;-><init>(Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$1;)V
    //         return-object v0
    */

    public fun setAutoMatchCriteria(autoMatchCriteria: android.os.Bundle): com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.Builder { return TODO("body: (Landroid/os/Bundle;)Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;->acs:Landroid/os/Bundle;
    //         return-object p0
    */

    public fun setVariant(variant: Int): com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.Builder { return TODO("body: (I)Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;") }
    /*
    //         .locals 2
    //         const/4 v0, -0x1
    //         if-eq p1, v0, :cond_0
    //         if-lez p1, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iput p1, p0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;->acd:I
    //         return-object p0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
