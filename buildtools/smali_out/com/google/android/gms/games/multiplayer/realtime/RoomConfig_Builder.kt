package com.google.android.gms.games.multiplayer.realtime

// Auto-emitted from smali.
// 8 fields, 11 methods.

class RoomConfig_Builder {
    var acd: Int
    val aco: com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener
    var acp: com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    var acq: com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener
    var acs: android.os.Bundle
    var act: Boolean
    var acu: String
    var acv: java.util.ArrayList

    private constructor(updateListener: com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener)

    constructor(x0: com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener, x1: com.google.android.gms.games.multiplayer.realtime.RoomConfig.1)

    public fun addPlayersToInvite(p0: java.util.ArrayList): com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder { return TODO("body: (Ljava/util/ArrayList;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "playerIds":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->acv:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    //         return-object p0
    */

    public fun addPlayersToInvite(playerIds: Array<String>): com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder { return TODO("body: ([Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;") }
    /*
    //         .locals 2
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->acv:Ljava/util/ArrayList;
    //         invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    //         return-object p0
    */

    public fun build(): com.google.android.gms.games.multiplayer.realtime.RoomConfig { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig;-><init>(Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$1;)V
    //         return-object v0
    */

    public fun setAutoMatchCriteria(autoMatchCriteria: android.os.Bundle): com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder { return TODO("body: (Landroid/os/Bundle;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->acs:Landroid/os/Bundle;
    //         return-object p0
    */

    public fun setInvitationIdToAccept(invitationId: String): com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;") }
    /*
    //         .locals 0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         iput-object p1, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->acu:Ljava/lang/String;
    //         return-object p0
    */

    public fun setMessageReceivedListener(listener: com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener): com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder { return TODO("body: (Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->acq:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;
    //         return-object p0
    */

    public fun setRoomStatusUpdateListener(listener: com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener): com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder { return TODO("body: (Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->acp:Lcom/google/android/gms/games/multiplayer/realtime/RoomStatusUpdateListener;
    //         return-object p0
    */

    public fun setSocketCommunicationEnabled(enableSockets: Boolean): com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder { return TODO("body: (Z)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->act:Z
    //         return-object p0
    */

    public fun setVariant(variant: Int): com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder { return TODO("body: (I)Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;") }
    /*
    //         .locals 2
    //         const/4 v0, -0x1
    //         if-eq p1, v0, :cond_0
    //         if-lez p1, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iput p1, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomConfig$Builder;->acd:I
    //         return-object p0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
