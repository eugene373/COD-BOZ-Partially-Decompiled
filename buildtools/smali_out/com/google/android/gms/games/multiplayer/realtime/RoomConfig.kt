package com.google.android.gms.games.multiplayer.realtime

// Auto-emitted from smali.
// 8 fields, 12 methods.

class RoomConfig {
    private val WO: String
    private val acd: Int
    private val aco: com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener
    private val acp: com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    private val acq: com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener
    private val acr: Array<String>
    private val acs: android.os.Bundle
    private val act: Boolean

    private constructor(builder: com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder)

    constructor(x0: com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder, x1: com.google.android.gms.games.multiplayer.realtime.RoomConfig.1)

    public fun getAutoMatchCriteria(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->acs:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun getInvitationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->WO:Ljava/lang/String;
    //         return-object v0
    */

    public fun getInvitedPlayerIds(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->acr:[Ljava/lang/String;
    //         return-object v0
    */

    public fun getMessageReceivedListener(): com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->acq:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;
    //         return-object v0
    */

    public fun getRoomStatusUpdateListener(): com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->acp:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         return-object v0
    */

    public fun getRoomUpdateListener(): com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->aco:Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;
    //         return-object v0
    */

    public fun getVariant(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->acd:I
    //         return v0
    */

    public fun isSocketEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;->act:Z
    //         return v0
    */

    companion object {
    public @JvmStatic fun builder(listener: com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener): com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder { return TODO("body: (Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;-><init>(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$1;)V
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
