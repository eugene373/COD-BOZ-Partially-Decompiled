package com.google.android.gms.games.request

// Auto-emitted from smali.
// 12 fields, 28 methods.

class GameRequestEntity: com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.gms.games.request.GameRequest {
    private val BR: Int
    private val FD: Int
    private val Fa: Int
    private val XC: String
    private val aay: com.google.android.gms.games.GameEntity
    private val abZ: Long
    private val acH: ByteArray
    private val adc: com.google.android.gms.games.PlayerEntity
    private val add: java.util.ArrayList
    private val ade: Long
    private val adf: android.os.Bundle

    constructor(versionCode: Int, game: com.google.android.gms.games.GameEntity, sender: com.google.android.gms.games.PlayerEntity, data: ByteArray, requestId: String, type: java.util.ArrayList, creationTimestamp: Int, expirationTimestamp: Long, recipientStatuses: Long, status: android.os.Bundle, p10: Int)

    public constructor(request: com.google.android.gms.games.request.GameRequest)

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
    //         .locals 0
    //         return-object p0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/request/GameRequestEntity;->freeze()Lcom/google/android/gms/games/request/GameRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCreationTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/games/request/GameRequestEntity;->abZ:J
    //         return-wide v0
    */

    public fun getData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/request/GameRequestEntity;->acH:[B
    //         return-object v0
    */

    public fun getExpirationTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/games/request/GameRequestEntity;->ade:J
    //         return-wide v0
    */

    public fun getGame(): com.google.android.gms.games.Game { return TODO("body: ()Lcom/google/android/gms/games/Game;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/request/GameRequestEntity;->aay:Lcom/google/android/gms/games/GameEntity;
    //         return-object v0
    */

    public fun getRecipientStatus(playerId: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/request/GameRequestEntity;->adf:Landroid/os/Bundle;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
    //         move-result v0
    //         return v0
    */

    public fun getRecipients(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/games/Player;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/ArrayList;
    //         iget-object v1, p0, Lcom/google/android/gms/games/request/GameRequestEntity;->add:Ljava/util/ArrayList;
    //         invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         return-object v0
    */

    public fun getRequestId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/request/GameRequestEntity;->XC:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSender(): com.google.android.gms.games.Player { return TODO("body: ()Lcom/google/android/gms/games/Player;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/request/GameRequestEntity;->adc:Lcom/google/android/gms/games/PlayerEntity;
    //         return-object v0
    */

    public fun getStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/request/GameRequestEntity;->Fa:I
    //         return v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/request/GameRequestEntity;->FD:I
    //         return v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/request/GameRequestEntity;->BR:I
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
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/games/request/GameRequestEntity;->getRecipientStatus(Ljava/lang/String;)I
    //         move-result v1
    //         if-ne v1, v0, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun lL(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/request/GameRequestEntity;->adf:Landroid/os/Bundle;
    //         return-object v0
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
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/request/GameRequestEntityCreator;->a(Lcom/google/android/gms/games/request/GameRequestEntity;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.games.request.GameRequestEntityCreator = null!!

    @JvmStatic fun a(p0: com.google.android.gms.games.request.GameRequest): Int { return TODO("body: (Lcom/google/android/gms/games/request/GameRequest;)I") }
    /*
    //         .locals 4
    //         const/16 v0, 0x8
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getGame()Lcom/google/android/gms/games/Game;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getRecipients()Ljava/util/List;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getRequestId()Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getSender()Lcom/google/android/gms/games/Player;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         invoke-static {p0}, Lcom/google/android/gms/games/request/GameRequestEntity;->b(Lcom/google/android/gms/games/request/GameRequest;)[I
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getType()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x6
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getCreationTimestamp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x7
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getExpirationTimestamp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.games.request.GameRequest, p1: Object): Boolean { return TODO("body: (Lcom/google/android/gms/games/request/GameRequest;Ljava/lang/Object;)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         instance-of v2, p1, Lcom/google/android/gms/games/request/GameRequest;
    //         if-nez v2, :cond_1
    //         move v0, v1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         if-eq p0, p1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/games/request/GameRequest;
    //         invoke-interface {p1}, Lcom/google/android/gms/games/request/GameRequest;->getGame()Lcom/google/android/gms/games/Game;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getGame()Lcom/google/android/gms/games/Game;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/request/GameRequest;->getRecipients()Ljava/util/List;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getRecipients()Ljava/util/List;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/request/GameRequest;->getRequestId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getRequestId()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/request/GameRequest;->getSender()Lcom/google/android/gms/games/Player;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getSender()Lcom/google/android/gms/games/Player;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-static {p1}, Lcom/google/android/gms/games/request/GameRequestEntity;->b(Lcom/google/android/gms/games/request/GameRequest;)[I
    //         move-result-object v2
    //         invoke-static {p0}, Lcom/google/android/gms/games/request/GameRequestEntity;->b(Lcom/google/android/gms/games/request/GameRequest;)[I
    //         move-result-object v3
    //         invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/request/GameRequest;->getType()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getType()I
    //         move-result v3
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/request/GameRequest;->getCreationTimestamp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getCreationTimestamp()J
    //         move-result-wide v4
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-interface {p1}, Lcom/google/android/gms/games/request/GameRequest;->getExpirationTimestamp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getExpirationTimestamp()J
    //         move-result-wide v4
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_2
    //         move v0, v1
    //         goto/16 :goto_0
    */

    private @JvmStatic fun b(p0: com.google.android.gms.games.request.GameRequest): IntArray { return TODO("body: (Lcom/google/android/gms/games/request/GameRequest;)[I") }
    /*
    //         .locals 5
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getRecipients()Ljava/util/List;
    //         move-result-object v2
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v3
    //         new-array v4, v3, [I
    //         const/4 v0, 0x0
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_0
    //         invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/Player;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/Player;->getPlayerId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {p0, v0}, Lcom/google/android/gms/games/request/GameRequest;->getRecipientStatus(Ljava/lang/String;)I
    //         move-result v0
    //         aput v0, v4, v1
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         return-object v4
    */

    @JvmStatic fun c(p0: com.google.android.gms.games.request.GameRequest): String { return TODO("body: (Lcom/google/android/gms/games/request/GameRequest;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Game"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getGame()Lcom/google/android/gms/games/Game;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Sender"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getSender()Lcom/google/android/gms/games/Player;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Recipients"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getRecipients()Ljava/util/List;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Data"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getData()[B
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "RequestId"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getRequestId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "Type"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getType()I
    //         move-result v2
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "CreationTimestamp"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getCreationTimestamp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "ExpirationTimestamp"
    //         invoke-interface {p0}, Lcom/google/android/gms/games/request/GameRequest;->getExpirationTimestamp()J
    //         move-result-wide v2
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
