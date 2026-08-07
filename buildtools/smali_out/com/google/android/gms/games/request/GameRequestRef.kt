package com.google.android.gms.games.request

// Auto-emitted from smali.
// 1 fields, 19 methods.

class GameRequestRef: com.google.android.gms.common.data.d(), com.google.android.gms.games.request.GameRequest {
    private val aaK: Int

    public constructor(holder: com.google.android.gms.common.data.DataHolder, dataRow: Int, numChildren: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Lcom/google/android/gms/games/request/GameRequestEntity;->a(Lcom/google/android/gms/games/request/GameRequest;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun freeze(): com.google.android.gms.games.request.GameRequest { return TODO("body: ()Lcom/google/android/gms/games/request/GameRequest;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/request/GameRequestEntity;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/games/request/GameRequestEntity;-><init>(Lcom/google/android/gms/games/request/GameRequest;)V
    //         return-object v0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/request/GameRequestRef;->freeze()Lcom/google/android/gms/games/request/GameRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCreationTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "creation_timestamp"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/request/GameRequestRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         const-string v0, "data"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/request/GameRequestRef;->getByteArray(Ljava/lang/String;)[B
    //         move-result-object v0
    //         return-object v0
    */

    public fun getExpirationTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-string v0, "expiration_timestamp"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/request/GameRequestRef;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getGame(): com.google.android.gms.games.Game { return TODO("body: ()Lcom/google/android/gms/games/Game;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/games/GameRef;
    //         iget-object v1, p0, Lcom/google/android/gms/games/request/GameRequestRef;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v2, p0, Lcom/google/android/gms/games/request/GameRequestRef;->JX:I
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/games/GameRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    //         return-object v0
    */

    public fun getRecipientStatus(playerId: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 4
    //         iget v0, p0, Lcom/google/android/gms/games/request/GameRequestRef;->JX:I
    //         :goto_0
    //         iget v1, p0, Lcom/google/android/gms/games/request/GameRequestRef;->JX:I
    //         iget v2, p0, Lcom/google/android/gms/games/request/GameRequestRef;->aaK:I
    //         add-int/2addr v1, v2
    //         if-ge v0, v1, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/games/request/GameRequestRef;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/common/data/DataHolder;->ar(I)I
    //         move-result v1
    //         iget-object v2, p0, Lcom/google/android/gms/games/request/GameRequestRef;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         const-string v3, "recipient_external_player_id"
    //         invoke-virtual {v2, v3, v0, v1}, Lcom/google/android/gms/common/data/DataHolder;->c(Ljava/lang/String;II)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         iget-object v2, p0, Lcom/google/android/gms/games/request/GameRequestRef;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         const-string v3, "recipient_status"
    //         invoke-virtual {v2, v3, v0, v1}, Lcom/google/android/gms/common/data/DataHolder;->b(Ljava/lang/String;II)I
    //         move-result v0
    //         :goto_1
    //         return v0
    //         :cond_0
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         const/4 v0, -0x1
    //         goto :goto_1
    */

    public fun getRecipients(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/games/Player;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         iget v0, p0, Lcom/google/android/gms/games/request/GameRequestRef;->aaK:I
    //         invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         iget v2, p0, Lcom/google/android/gms/games/request/GameRequestRef;->aaK:I
    //         if-ge v0, v2, :cond_0
    //         new-instance v2, Lcom/google/android/gms/games/PlayerRef;
    //         iget-object v3, p0, Lcom/google/android/gms/games/request/GameRequestRef;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         iget v4, p0, Lcom/google/android/gms/games/request/GameRequestRef;->JX:I
    //         add-int/2addr v4, v0
    //         const-string v5, "recipient_"
    //         invoke-direct {v2, v3, v4, v5}, Lcom/google/android/gms/games/PlayerRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;ILjava/lang/String;)V
    //         invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public fun getRequestId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "external_request_id"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/request/GameRequestRef;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getSender(): com.google.android.gms.games.Player { return TODO("body: ()Lcom/google/android/gms/games/Player;") }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/google/android/gms/games/PlayerRef;
    //         iget-object v1, p0, Lcom/google/android/gms/games/request/GameRequestRef;->II:Lcom/google/android/gms/common/data/DataHolder;
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/request/GameRequestRef;->gz()I
    //         move-result v2
    //         const-string v3, "sender_"
    //         invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/games/PlayerRef;-><init>(Lcom/google/android/gms/common/data/DataHolder;ILjava/lang/String;)V
    //         return-object v0
    */

    public fun getStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "status"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/request/GameRequestRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const-string v0, "type"
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/request/GameRequestRef;->getInteger(Ljava/lang/String;)I
    //         move-result v0
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/request/GameRequestEntity;->a(Lcom/google/android/gms/games/request/GameRequest;)I
    //         move-result v0
    //         return v0
    */

    public fun isConsumed(playerId: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/games/request/GameRequestRef;->getRecipientStatus(Ljava/lang/String;)I
    //         move-result v1
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/games/request/GameRequestEntity;->c(Lcom/google/android/gms/games/request/GameRequest;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/request/GameRequestRef;->freeze()Lcom/google/android/gms/games/request/GameRequest;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/request/GameRequestEntity;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/request/GameRequestEntity;->writeToParcel(Landroid/os/Parcel;I)V
    //         return-void
    */

}
