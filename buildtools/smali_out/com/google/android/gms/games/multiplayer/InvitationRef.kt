package com.google.android.gms.games.multiplayer

// Auto-emitted from smali.
// 3 fields, 16 methods.

class InvitationRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.multiplayer.Invitation {
    private val abx: com.google.android.gms.games.Game
    private val acc: java.util.ArrayList
    private val acf: com.google.android.gms.games.multiplayer.ParticipantRef

    constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int, numChildren: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/multiplayer/InvitationEntity;->a(Lcom/google/android/gms/games/multiplayer/Invitation;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.multiplayer.Invitation { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/Invitation;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/multiplayer/InvitationEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/multiplayer/InvitationEntity;-><init>(Lcom/google/android/gms/games/multiplayer/Invitation;)V
    //         return-object v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/InvitationRef;->freeze()Lcom/google/android/gms/games/multiplayer/Invitation;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAvailableAutoMatchSlots(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "has_automatch_criteria"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/InvitationRef;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v0, "automatch_max_players"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/InvitationRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         goto :goto_0
    */

    public fun getCreationTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 4
    //         const-string v0, "creation_timestamp"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/InvitationRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         const-string v2, "last_modified_timestamp"
    //         invoke-virtual {p0, v2}, Lcom/google/android/gms/games/multiplayer/InvitationRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v2
    //         invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getGame(): com.google.android.gms.games.Game { return TODO("body: ()Lcom/google/android/gms/games/Game;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/InvitationRef;->abx:Lcom/google/android/gms/games/Game;
    //         return-object v0
    */

    public fun getInvitationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_invitation_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/InvitationRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getInvitationType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "type"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/InvitationRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getInviter(): com.google.android.gms.games.multiplayer.Participant { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/Participant;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/InvitationRef;->acf:Lcom/google/android/gms/games/multiplayer/ParticipantRef;
    //         return-object v0
    */

    public fun getParticipants(): java.util.ArrayList { return TODO("body: ()Ljava/util/ArrayList;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/games/multiplayer/Participant;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/InvitationRef;->acc:Ljava/util/ArrayList;
    //         return-object v0
    */

    public fun getVariant(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "variant"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/InvitationRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/InvitationEntity;->a(Lcom/google/android/gms/games/multiplayer/Invitation;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/InvitationEntity;->b(Lcom/google/android/gms/games/multiplayer/Invitation;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/InvitationRef;->freeze()Lcom/google/android/gms/games/multiplayer/Invitation;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/InvitationEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/multiplayer/InvitationEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         return-void
    */

}
