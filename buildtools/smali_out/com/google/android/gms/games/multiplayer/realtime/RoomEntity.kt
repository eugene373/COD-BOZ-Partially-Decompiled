package com.google.android.gms.games.multiplayer.realtime

// Auto-emitted from smali.
// 11 fields, 36 methods.

class RoomEntity: com.google.android.gms.games.internal.GamesDowngradeableSafeParcel(), com.google.android.gms.games.multiplayer.realtime.Room {
    private val BR: Int
    private val Tr: String
    private val WQ: String
    private val abZ: Long
    private val acc: java.util.ArrayList
    private val acd: Int
    private val acs: android.os.Bundle
    private val acw: String
    private val acx: Int
    private val acy: Int

    constructor(versionCode: Int, roomId: String, creatorId: String, creationTimestamp: Long, roomStatus: Int, description: String, variant: Int, autoMatchCriteria: android.os.Bundle, autoMatchWaitEstimateSeconds: java.util.ArrayList, p9: Int)

    public constructor(room: com.google.android.gms.games.multiplayer.realtime.Room)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->a(Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.multiplayer.realtime.Room { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/realtime/Room;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->freeze()Lcom/google/android/gms/games/multiplayer/realtime/Room;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAutoMatchCriteria(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->acs:Landroid/os/Bundle;
    //         return-object v0
    */

    public fun getAutoMatchWaitEstimateSeconds(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->acy:I
    //         return v0
    */

    public fun getCreationTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->abZ:J
    //         return-wide v0
    */

    public fun getCreatorId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->acw:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->Tr:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDescription(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->Tr:Ljava/lang/String;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/jv;->b(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         return-void
    */

    public fun getParticipant(participantId: String): com.google.android.gms.games.multiplayer.Participant { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/Participant;") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->c(Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/Participant;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getParticipantId(playerId: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->b(Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/lang/String;)Ljava/lang/String;
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
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->c(Lcom/google/android/gms/games/multiplayer/realtime/Room;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getParticipantStatus(participantId: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->a(Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getParticipants(): java.util.ArrayList { return TODO("body: ()Ljava/util/ArrayList;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/games/multiplayer/Participant;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/ArrayList;
    //         iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->acc:Ljava/util/ArrayList;
    //         invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         return-object v0
    */

    public fun getRoomId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->WQ:Ljava/lang/String;
    //         return-object v0
    */

    public fun getStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->acx:I
    //         return v0
    */

    public fun getVariant(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->acd:I
    //         return v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->a(Lcom/google/android/gms/games/multiplayer/realtime/Room;)I
    //         move-result v0
    //         return v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->b(Lcom/google/android/gms/games/multiplayer/realtime/Room;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->gQ()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntityCreator;->a(Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;Landroid/os/Parcel;I)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->WQ:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->acw:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-wide v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->abZ:J
    //         invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->acx:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->Tr:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->acd:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->acs:Landroid/os/Bundle;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->acc:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v2
    //         invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v2, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->acc:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    @JvmStatic fun a(p0: com.google.android.gms.games.multiplayer.realtime.Room): Int { return TODO("body: (Lcom/google/android/gms/games/multiplayer/realtime/Room;)I") }
    /*
    //         .locals 4
    //         const/16 v0, 0x9
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getRoomId()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getCreatorId()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getCreationTimestamp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getStatus()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getDescription()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getVariant()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x6
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getAutoMatchCriteria()Landroid/os/Bundle;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x7
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipants()Ljava/util/ArrayList;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0x8
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getAutoMatchWaitEstimateSeconds()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: String): Int { return TODO("body: (Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/lang/String;)I") }
    /*
    //         .locals 5
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipants()Ljava/util/ArrayList;
    //         move-result-object v2
    //         const/4 v0, 0x0
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_1
    //         invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/Participant;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Participant;->getStatus()I
    //         move-result v0
    //         return v0
    //         :cond_0
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Participant "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " is not in room "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getRoomId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: Object): Boolean { return TODO("body: (Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/lang/Object;)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         instance-of v2, p1, Lcom/google/android/gms/games/multiplayer/realtime/Room;
    //         if-nez v2, :cond_1
    //         move v0, v1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         if-eq p0, p1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/Room;
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getRoomId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getRoomId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getCreatorId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getCreatorId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getCreationTimestamp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getCreationTimestamp()J
    //         move-result-wide v4
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getStatus()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getStatus()I
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getDescription()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getDescription()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getVariant()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getVariant()I
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getAutoMatchCriteria()Landroid/os/Bundle;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getAutoMatchCriteria()Landroid/os/Bundle;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipants()Ljava/util/ArrayList;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipants()Ljava/util/ArrayList;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getAutoMatchWaitEstimateSeconds()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getAutoMatchWaitEstimateSeconds()I
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_2
    //         move v0, v1
    //         goto/16 :goto_0
    */

    @JvmStatic fun b(p0: com.google.android.gms.games.multiplayer.realtime.Room): String { return TODO("body: (Lcom/google/android/gms/games/multiplayer/realtime/Room;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "RoomId"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getRoomId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "CreatorId"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getCreatorId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "CreationTimestamp"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getCreationTimestamp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "RoomStatus"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getStatus()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Description"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getDescription()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Variant"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getVariant()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "AutoMatchCriteria"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getAutoMatchCriteria()Landroid/os/Bundle;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Participants"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipants()Ljava/util/ArrayList;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "AutoMatchWaitEstimateSeconds"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getAutoMatchWaitEstimateSeconds()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: String): String { return TODO("body: (Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 6
    //         const/4 v1, 0x0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipants()Ljava/util/ArrayList;
    //         move-result-object v3
    //         const/4 v0, 0x0
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
    //         move-result v4
    //         move v2, v0
    //         :goto_0
    //         if-ge v2, v4, :cond_1
    //         invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/Participant;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Participant;->getPlayer()Lcom/google/android/gms/games/Player;
    //         move-result-object v5
    //         if-eqz v5, :cond_0
    //         invoke-interface {v5}, Lcom/google/android/gms/games/Player;->getPlayerId()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v5
    //         if-eqz v5, :cond_0
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         add-int/lit8 v0, v2, 0x1
    //         move v2, v0
    //         goto :goto_0
    //         :cond_1
    //         move-object v0, v1
    //         goto :goto_1
    */

    @JvmStatic fun b(p0: Integer): Boolean { return TODO("body: (Ljava/lang/Integer;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->c(Ljava/lang/Integer;)Z
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun bw(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->aV(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.games.multiplayer.realtime.Room, p1: String): com.google.android.gms.games.multiplayer.Participant { return TODO("body: (Lcom/google/android/gms/games/multiplayer/realtime/Room;Ljava/lang/String;)Lcom/google/android/gms/games/multiplayer/Participant;") }
    /*
    //         .locals 5
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipants()Ljava/util/ArrayList;
    //         move-result-object v2
    //         const/4 v0, 0x0
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_1
    //         invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/Participant;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         return-object v0
    //         :cond_0
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Participant "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " is not in match "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getRoomId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.games.multiplayer.realtime.Room): java.util.ArrayList { return TODO("body: (Lcom/google/android/gms/games/multiplayer/realtime/Room;)Ljava/util/ArrayList;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/games/multiplayer/realtime/Room;",
    //                 ")",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/realtime/Room;->getParticipants()Ljava/util/ArrayList;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         new-instance v4, Ljava/util/ArrayList;
    //         invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_0
    //         invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/Participant;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         return-object v4
    */

    @JvmStatic fun jT(): Integer { return TODO("body: ()Ljava/lang/Integer;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/games/multiplayer/realtime/RoomEntity;->gP()Ljava/lang/Integer;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
