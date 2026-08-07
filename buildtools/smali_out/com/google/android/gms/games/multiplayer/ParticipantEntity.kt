package com.google.android.gms.games.multiplayer

// Auto-emitted from smali.
// 14 fields, 31 methods.

class ParticipantEntity: com.google.android.gms.games.internal.GamesDowngradeableSafeParcel(), com.google.android.gms.games.multiplayer.Participant {
    private val BR: Int
    private val EZ: Int
    private val Fa: Int
    private val NH: String
    private val Vh: android.net.Uri
    private val Vi: android.net.Uri
    private val Vs: String
    private val Vt: String
    private val Wh: com.google.android.gms.games.PlayerEntity
    private val Wq: String
    private val Xr: String
    private val acg: Boolean
    private val ach: com.google.android.gms.games.multiplayer.ParticipantResult

    constructor(versionCode: Int, participantId: String, displayName: String, iconImageUri: android.net.Uri, hiResImageUri: android.net.Uri, status: Int, clientAddress: String, connectedToRoom: Boolean, player: com.google.android.gms.games.PlayerEntity, capabilities: Int, result: com.google.android.gms.games.multiplayer.ParticipantResult, iconImageUrl: String, hiResImageUrl: String)

    public constructor(participant: com.google.android.gms.games.multiplayer.Participant)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->a(Lcom/google/android/gms/games/multiplayer/Participant;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.multiplayer.Participant { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/Participant;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->freeze()Lcom/google/android/gms/games/multiplayer/Participant;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCapabilities(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->EZ:I
    //         return v0
    */

    public fun getDisplayName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->NH:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerEntity;->getDisplayName()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getDisplayName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->NH:Ljava/lang/String;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/internal/jv;->b(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/games/PlayerEntity;->getDisplayName(Landroid/database/CharArrayBuffer;)V
    //         goto :goto_0
    */

    public fun getHiResImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Vi:Landroid/net/Uri;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerEntity;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getHiResImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Vt:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerEntity;->getHiResImageUrl()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getIconImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Vh:Landroid/net/Uri;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerEntity;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getIconImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Vs:Ljava/lang/String;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerEntity;->getIconImageUrl()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getParticipantId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Xr:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPlayer(): com.google.android.gms.games.Player { return TODO("body: ()Lcom/google/android/gms/games/Player;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         return-object v0
    */

    public fun getResult(): com.google.android.gms.games.multiplayer.ParticipantResult { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/ParticipantResult;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->ach:Lcom/google/android/gms/games/multiplayer/ParticipantResult;
    //         return-object v0
    */

    public fun getStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Fa:I
    //         return v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->a(Lcom/google/android/gms/games/multiplayer/Participant;)I
    //         move-result v0
    //         return v0
    */

    public fun isConnectedToRoom(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->acg:Z
    //         return v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun jX(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wq:Ljava/lang/String;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->b(Lcom/google/android/gms/games/multiplayer/Participant;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->gQ()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/multiplayer/ParticipantEntityCreator;->a(Lcom/google/android/gms/games/multiplayer/ParticipantEntity;Landroid/os/Parcel;I)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Xr:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->NH:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Vh:Landroid/net/Uri;
    //         if-nez v0, :cond_2
    //         move-object v0, v1
    //         :goto_1
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Vi:Landroid/net/Uri;
    //         if-nez v0, :cond_3
    //         :goto_2
    //         invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Fa:I
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wq:Ljava/lang/String;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
    //         iget-boolean v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->acg:Z
    //         if-eqz v0, :cond_4
    //         move v0, v2
    //         :goto_3
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         if-nez v0, :cond_5
    //         :goto_4
    //         invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Wh:Lcom/google/android/gms/games/PlayerEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/PlayerEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Vh:Landroid/net/Uri;
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_1
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->Vi:Landroid/net/Uri;
    //         invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         goto :goto_2
    //         :cond_4
    //         move v0, v3
    //         goto :goto_3
    //         :cond_5
    //         move v3, v2
    //         goto :goto_4
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    @JvmStatic fun a(p0: com.google.android.gms.games.multiplayer.Participant): Int { return TODO("body: (Lcom/google/android/gms/games/multiplayer/Participant;)I") }
    /*
    //         .locals 3
    //         const/16 v0, 0xa
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getPlayer()Lcom/google/android/gms/games/Player;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getStatus()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->jX()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->isConnectedToRoom()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getDisplayName()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x6
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x7
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getCapabilities()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0x8
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getResult()Lcom/google/android/gms/games/multiplayer/ParticipantResult;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/16 v1, 0x9
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.games.multiplayer.Participant, p1: Object): Boolean { return TODO("body: (Lcom/google/android/gms/games/multiplayer/Participant;Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         instance-of v2, p1, Lcom/google/android/gms/games/multiplayer/Participant;
    //         if-nez v2, :cond_1
    //         move v0, v1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         if-eq p0, p1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/games/multiplayer/Participant;
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/Participant;->getPlayer()Lcom/google/android/gms/games/Player;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getPlayer()Lcom/google/android/gms/games/Player;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/Participant;->getStatus()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getStatus()I
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/Participant;->jX()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->jX()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/Participant;->isConnectedToRoom()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->isConnectedToRoom()Z
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/Participant;->getDisplayName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getDisplayName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/Participant;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/Participant;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/Participant;->getCapabilities()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getCapabilities()I
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/Participant;->getResult()Lcom/google/android/gms/games/multiplayer/ParticipantResult;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getResult()Lcom/google/android/gms/games/multiplayer/ParticipantResult;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_2
    //         move v0, v1
    //         goto/16 :goto_0
    */

    @JvmStatic fun b(p0: com.google.android.gms.games.multiplayer.Participant): String { return TODO("body: (Lcom/google/android/gms/games/multiplayer/Participant;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "ParticipantId"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getParticipantId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Player"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getPlayer()Lcom/google/android/gms/games/Player;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Status"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getStatus()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "ClientAddress"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->jX()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "ConnectedToRoom"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->isConnectedToRoom()Z
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "DisplayName"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getDisplayName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "IconImage"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "IconImageUrl"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getIconImageUrl()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "HiResImage"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "HiResImageUrl"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getHiResImageUrl()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Capabilities"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getCapabilities()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Result"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/multiplayer/Participant;->getResult()Lcom/google/android/gms/games/multiplayer/ParticipantResult;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun b(p0: Integer): Boolean { return TODO("body: (Ljava/lang/Integer;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->c(Ljava/lang/Integer;)Z
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun bw(p0: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->aV(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun jT(): Integer { return TODO("body: ()Ljava/lang/Integer;") }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->gP()Ljava/lang/Integer;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
