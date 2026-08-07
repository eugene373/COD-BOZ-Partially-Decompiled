package com.google.android.gms.games.multiplayer.turnbased

// Auto-emitted from smali.
// 2 fields, 36 methods.

class TurnBasedMatchRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch {
    private val aaK: Int
    private val abx: com.google.android.gms.games.Game

    constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int, numChildren: Int)

    public fun canRematch(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getTurnStatus()I
    //         move-result v1
    //         const/4 v2, 0x3
    //         if-ne v1, v2, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getRematchId()Ljava/lang/String;
    //         move-result-object v1
    //         if-nez v1, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getParticipants()Ljava/util/ArrayList;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         if-le v1, v0, :cond_0
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
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntity;->a(Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntity;-><init>(Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;)V
    //         return-object v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->freeze()Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAutoMatchCriteria(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         const-string v0, "has_automatch_criteria"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "automatch_min_players"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         const-string v1, "automatch_max_players"
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getInteger(Ljava/lang/String;)I
    //         move-result v1
    //         const-string v2, "automatch_bit_mask"
    //         invoke-virtual {p0, v2}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v2
    //         invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfig;->createAutoMatchCriteria(IIJ)Landroid/os/Bundle;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getAvailableAutoMatchSlots(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "has_automatch_criteria"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v0, "automatch_max_players"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         goto :goto_0
    */

    public fun getCreationTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "creation_timestamp"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getCreatorId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "creator_external"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         const-string v0, "data"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getByteArray(Ljava/lang/String;)[B
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "description"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDescription(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "description"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getDescriptionParticipant(): com.google.android.gms.games.multiplayer.Participant { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/Participant;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getDescriptionParticipantId()Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getParticipant(Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/Participant;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getDescriptionParticipantId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "description_participant_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getGame(): com.google.android.gms.games.Game { return TODO("body: ()Lcom/google/android/gms/games/Game;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->abx:Lcom/google/android/gms/games/Game;
    //         return-object v0
    */

    public fun getLastUpdatedTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "last_updated_timestamp"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getLastUpdaterId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "last_updater_external"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getMatchId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_match_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getMatchNumber(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "match_number"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getParticipant(participantId: String): com.google.android.gms.games.multiplayer.Participant { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/Participant;") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntity;->c(Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/Participant;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getParticipantId(playerId: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntity;->b(Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getParticipantIds(): java.util.ArrayList { return TODO("body: ()Ljava/util/ArrayList;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntity;->c(Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getParticipantStatus(participantId: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntity;->a(Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getParticipants(): java.util.ArrayList { return TODO("body: ()Ljava/util/ArrayList;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/games/multiplayer/Participant;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->aaK:I
    //         invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         iget v2, p0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->aaK:I
    //         if-ge v0, v2, :cond_0
    //         new-instance v2, Lcom/google/android/gms/games/multiplayer/ParticipantRef;
    //         iget-object v3, p0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v4, p0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->JX:I
    //         add-int/2addr v4, v0
    //         invoke-direct {v2, v3, v4}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    //         invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public fun getPendingParticipantId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "pending_participant_external"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPreviousMatchData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         const-string v0, "previous_match_data"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getByteArray(Ljava/lang/String;)[B
    //         move-result-object v0
    //         return-object v0
    */

    public fun getRematchId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "rematch_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "status"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getTurnStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "user_match_status"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getVariant(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "variant"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getVersion(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "version"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntity;->a(Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;)I
    //         move-result v0
    //         return v0
    */

    public fun isLocallyModified(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const-string v0, "upsync_required"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->getBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntity;->b(Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchRef;->freeze()Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatch;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         return-void
    */

}
