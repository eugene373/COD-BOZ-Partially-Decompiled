package com.google.android.gms.games.internal.multiplayer

// Auto-emitted from smali.
// 3 fields, 20 methods.

class ZInvitationCluster: com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.gms.games.multiplayer.Invitation {
    private val BR: Int
    private val aaL: java.util.ArrayList

    constructor(versionCode: Int, p1: java.util.ArrayList)

    private fun li() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->aaL:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->I(Z)V
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->aaL:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/Invitation;
    //         iget-object v2, p0, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->aaL:Ljava/util/ArrayList;
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         move v2, v1
    //         :goto_1
    //         if-ge v2, v3, :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->aaL:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/games/multiplayer/Invitation;
    //         invoke-interface {v0}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInviter()Lcom/google/android/gms/games/multiplayer/Participant;
    //         move-result-object v4
    //         invoke-interface {v1}, Lcom/google/android/gms/games/multiplayer/Invitation;->getInviter()Lcom/google/android/gms/games/multiplayer/Participant;
    //         move-result-object v1
    //         invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         const-string v4, "All the invitations must be from the same inviter"
    //         invoke-static {v1, v4}, Lcom/google/android/gms/common/internal/a;->a(ZLjava/lang/Object;)V
    //         add-int/lit8 v1, v2, 0x1
    //         move v2, v1
    //         goto :goto_1
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
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
    //         instance-of v0, p1, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;
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
    //         check-cast p1, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget-object v0, p1, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->aaL:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->aaL:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v1
    //         if-eq v0, v1, :cond_2
    //         move v0, v2
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->aaL:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v5
    //         move v4, v2
    //         :goto_1
    //         if-ge v4, v5, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->aaL:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/Invitation;
    //         iget-object v1, p1, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->aaL:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/games/multiplayer/Invitation;
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

    public fun freeze(): com.google.android.gms.games.multiplayer.Invitation { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/Invitation;") }
    /*
    //         .locals 0
    //         return-object p0
    */

    public fun freeze(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->freeze()Lcom/google/android/gms/games/multiplayer/Invitation;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAvailableAutoMatchSlots(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Method not supported on a cluster"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getCreationTimestamp(): Long { return TODO("body: ()J") }
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

    public fun getInvitationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->aaL:Ljava/util/ArrayList;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/InvitationEntity;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/InvitationEntity;->getInvitationId()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getInvitationType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Method not supported on a cluster"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getInviter(): com.google.android.gms.games.multiplayer.Participant { return TODO("body: ()Lcom/google/android/gms/games/multiplayer/Participant;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->aaL:Ljava/util/ArrayList;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/games/multiplayer/InvitationEntity;
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/multiplayer/InvitationEntity;->getInviter()Lcom/google/android/gms/games/multiplayer/Participant;
    //         move-result-object v0
    //         return-object v0
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
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Method not supported on a cluster"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getVariant(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Method not supported on a cluster"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->aaL:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun isDataValid(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun lj(): java.util.ArrayList { return TODO("body: ()Ljava/util/ArrayList;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/games/multiplayer/Invitation;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/ArrayList;
    //         iget-object v1, p0, Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;->aaL:Ljava/util/ArrayList;
    //         invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/internal/multiplayer/InvitationClusterCreator;->a(Lcom/google/android/gms/games/internal/multiplayer/ZInvitationCluster;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.games.internal.multiplayer.InvitationClusterCreator = null!!
    }
}
