package com.google.android.gms.games.multiplayer

// Auto-emitted from smali.
// 1 fields, 21 methods.

class ParticipantRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.multiplayer.Participant {
    private val aci: com.google.android.gms.games.PlayerRef

    public constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int)

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
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;-><init>(Lcom/google/android/gms/games/multiplayer/Participant;)V
    //         return-object v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->freeze()Lcom/google/android/gms/games/multiplayer/Participant;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCapabilities(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "capabilities"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getDisplayName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "default_display_name"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aci:Lcom/google/android/gms/games/PlayerRef;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->getDisplayName()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getDisplayName(dataOut: android.database.CharArrayBuffer) { /* TODO(body): (Landroid/database/CharArrayBuffer;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "default_display_name"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aci:Lcom/google/android/gms/games/PlayerRef;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/games/PlayerRef;->getDisplayName(Landroid/database/CharArrayBuffer;)V
    //         goto :goto_0
    */

    public fun getHiResImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "default_display_hi_res_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aci:Lcom/google/android/gms/games/PlayerRef;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->getHiResImageUri()Landroid/net/Uri;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getHiResImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "default_display_hi_res_image_url"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aci:Lcom/google/android/gms/games/PlayerRef;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->getHiResImageUrl()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getIconImageUri(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "default_display_image_uri"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aR(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aci:Lcom/google/android/gms/games/PlayerRef;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->getIconImageUri()Landroid/net/Uri;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getIconImageUrl(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "default_display_image_url"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aci:Lcom/google/android/gms/games/PlayerRef;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/PlayerRef;->getIconImageUrl()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getParticipantId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_participant_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPlayer(): com.google.android.gms.games.Player { return TODO("body: ()Lcom/google/android/gms/games/Player;") }
    /*
    //         .locals 1
    //         const-string v0, "external_player_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aci:Lcom/google/android/gms/games/PlayerRef;
    //         goto :goto_0
    */

    public fun getResult(): com.google.android.gms.games.multiplayer.ParticipantResult { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/ParticipantResult;") }
    /*
    //         .locals 4
    //         const-string v0, "result_type"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->aS(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "result_type"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->getInteger(Ljava/lang/String;)I
    //         move-result v1
    //         const-string v0, "placing"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->getInteger(Ljava/lang/String;)I
    //         move-result v2
    //         new-instance v0, Lcom/google/android/gms/games/multiplayer/ParticipantResult;
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->getParticipantId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/games/multiplayer/ParticipantResult;-><init>(Ljava/lang/String;II)V
    //         goto :goto_0
    */

    public fun getStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "player_status"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
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
    //         const-string v0, "connected"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun jX(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "client_address"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
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
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/multiplayer/ParticipantRef;->freeze()Lcom/google/android/gms/games/multiplayer/Participant;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/multiplayer/ParticipantEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         return-void
    */

}
