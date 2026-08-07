package com.google.android.gms.games.internal.request

// Auto-emitted from smali.
// 3 fields, 24 methods.

class GameRequestCluster: com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.gms.games.request.GameRequest {
    private val BR: Int
    private val abr: java.util.ArrayList

    constructor(versionCode: Int, p1: java.util.ArrayList)

    private fun li() { /* TODO(body): ()V */ }
    /*
    //         .locals 8
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         move v0, v2
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->I(Z)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/request/GameRequest;
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v6
    //         move v5, v2
    //         :goto_1
    //         if-ge v5, v6, :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/games/request/GameRequest;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/request/GameRequest;->getType()I
    //         move-result v4
    //         invoke-interface {v1}, Lcom/google/android/gms/games/request/GameRequest;->getType()I
    //         move-result v7
    //         if-ne v4, v7, :cond_1
    //         move v4, v2
    //         :goto_2
    //         const-string v7, "All the requests must be of the same type"
    //         invoke-static {v4, v7}, Lcom/google/android/gms/common/internal/a;->a(ZLjava/lang/Object;)V
    //         invoke-interface {v0}, Lcom/google/android/gms/games/request/GameRequest;->getSender()Lcom/google/android/gms/games/Player;
    //         move-result-object v4
    //         invoke-interface {v1}, Lcom/google/android/gms/games/request/GameRequest;->getSender()Lcom/google/android/gms/games/Player;
    //         move-result-object v1
    //         invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         const-string v4, "All the requests must be from the same sender"
    //         invoke-static {v1, v4}, Lcom/google/android/gms/common/internal/a;->a(ZLjava/lang/Object;)V
    //         add-int/lit8 v1, v5, 0x1
    //         move v5, v1
    //         goto :goto_1
    //         :cond_0
    //         move v0, v3
    //         goto :goto_0
    //         :cond_1
    //         move v4, v3
    //         goto :goto_2
    //         :cond_2
    //         return-void
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 6
    //         const/4 v3, 0x1
    //         const/4 v2, 0x0
    //         instance-of v0, p1, Lcom/google/android/gms/games/internal/request/GameRequestCluster;
    //         if-nez v0, :cond_0
    //         move v0, v2
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         if-ne p0, p1, :cond_1
    //         move v0, v3
    //         goto :goto_0
    //         :cond_1
    //         check-cast p1, Lcom/google/android/gms/games/internal/request/GameRequestCluster;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget-object v0, p1, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         if-eq v0, v1, :cond_2
    //         move v0, v2
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v5
    //         move v4, v2
    //         :goto_1
    //         if-ge v4, v5, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/request/GameRequest;
    //         iget-object v1, p1, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/games/request/GameRequest;
    //         invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_3
    //         move v0, v2
    //         goto :goto_0
    //         :cond_3
    //         add-int/lit8 v0, v4, 0x1
    //         move v4, v0
    //         goto :goto_1
    //         :cond_4
    //         move v0, v3
    //         goto :goto_0
    */

    public fun freeze(): com.google.android.gms.games.request.GameRequest { return TODO("body: ()Lcom/google/android/gms/games/request/GameRequest;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->freeze()Lcom/google/android/gms/games/request/GameRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCreationTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Method not supported on a cluster"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getData(): ByteArray { return TODO("body: ()[B") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Method not supported on a cluster"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getExpirationTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Method not supported on a cluster"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getGame(): com.google.android.gms.games.Game { return TODO("body: ()Lcom/google/android/gms/games/Game;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Method not supported on a cluster"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getRecipientStatus(playerId: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Method not supported on a cluster"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getRecipients(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->lx()Ljava/util/ArrayList;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getRequestId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/request/GameRequestEntity;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/request/GameRequestEntity;->getRequestId()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getSender(): com.google.android.gms.games.Player { return TODO("body: ()Lcom/google/android/gms/games/Player;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/request/GameRequestEntity;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/request/GameRequestEntity;->getSender()Lcom/google/android/gms/games/Player;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Method not supported on a cluster"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/request/GameRequestEntity;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/request/GameRequestEntity;->getType()I
    //         move-result v0
    //         return v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun isConsumed(playerId: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Method not supported on a cluster"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun lw(): java.util.ArrayList { return TODO("body: ()Ljava/util/ArrayList;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/games/request/GameRequest;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/ArrayList;
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->abr:Ljava/util/ArrayList;
    //         invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         return-object v0
    */

    public fun lx(): java.util.ArrayList { return TODO("body: ()Ljava/util/ArrayList;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/games/Player;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Method not supported on a cluster"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/internal/request/GameRequestClusterCreator;->a(Lcom/google/android/gms/games/internal/request/GameRequestCluster;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.games.internal.request.GameRequestClusterCreator = null!!
    }
}
