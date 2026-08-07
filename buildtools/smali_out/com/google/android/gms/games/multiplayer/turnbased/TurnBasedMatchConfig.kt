package com.google.android.gms.games.multiplayer.turnbased

// Auto-emitted from smali.
// 4 fields, 8 methods.

class TurnBasedMatchConfig {
    private val acD: Int
    private val acd: Int
    private val acr: Array<String>
    private val acs: android.os.Bundle

    private constructor(builder: com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.Builder)

    constructor(x0: com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.Builder, x1: com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.1)

    public fun getAutoMatchCriteria(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;->acs:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun getInvitedPlayerIds(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;->acr:[Ljava/lang/String;
    //         return-object v0
    */

    public fun getVariant(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;->acd:I
    //         return v0
    */

    public fun lH(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;->acD:I
    //         return v0
    */

    companion object {
    public @JvmStatic fun builder(): com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig.Builder { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$Builder;-><init>(Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig$1;)V
    //         return-object v0
    */

    public @JvmStatic fun createAutoMatchCriteria(minAutoMatchPlayers: Int, maxAutoMatchPlayers: Int, exclusiveBitMask: Long): android.os.Bundle { return TODO("body: (IIJ)Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "min_automatch_players"
    //         invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v1, "max_automatch_players"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v1, "exclusive_bit_mask"
    //         invoke-virtual {v0, v1, p2, p3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         return-object v0
    */

    }
}
