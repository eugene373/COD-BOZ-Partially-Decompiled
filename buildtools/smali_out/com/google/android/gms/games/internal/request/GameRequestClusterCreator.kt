package com.google.android.gms.games.internal.request

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class GameRequestClusterCreator: android.os.Parcelable.Creator {
    public constructor()

    public fun ck(p0: android.os.Parcel): com.google.android.gms.games.internal.request.GameRequestCluster { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/games/internal/request/GameRequestCluster;") }
    /*
    //         .locals 5
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v2
    //         const/4 v1, 0x0
    //         const/4 v0, 0x0
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v3
    //         if-ge v3, v2, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v3
    //         invoke-static {v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v4
    //         sparse-switch v4, :sswitch_data_0
    //         invoke-static {p1, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :sswitch_0
    //         sget-object v0, Lcom/google/android/gms/games/request/GameRequestEntity;->CREATOR:Lcom/google/android/gms/games/request/GameRequestEntityCreator;
    //         invoke-static {p1, v3, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         goto :goto_0
    //         :sswitch_1
    //         invoke-static {p1, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v1
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v3
    //         if-eq v3, v2, :cond_1
    //         new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Overread allowed size end="
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p1}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v0
    //         :cond_1
    //         new-instance v2, Lcom/google/android/gms/games/internal/request/GameRequestCluster;
    //         invoke-direct {v2, v1, v0}, Lcom/google/android/gms/games/internal/request/GameRequestCluster;-><init>(ILjava/util/ArrayList;)V
    //         return-object v2
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_0
    //             0x3e8 -> :sswitch_1
    //         .end sparse-switch
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/request/GameRequestClusterCreator;->ck(Landroid/os/Parcel;)Lcom/google/android/gms/games/internal/request/GameRequestCluster;
    //         move-result-object v0
    //         return-object v0
    */

    public fun dQ(p0: Int): Array<com.google.android.gms.games.internal.request.GameRequestCluster> { return TODO("body: (I)[Lcom/google/android/gms/games/internal/request/GameRequestCluster;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/games/internal/request/GameRequestCluster;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/request/GameRequestClusterCreator;->dQ(I)[Lcom/google/android/gms/games/internal/request/GameRequestCluster;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.games.internal.request.GameRequestCluster, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/games/internal/request/GameRequestCluster;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->lw()Ljava/util/ArrayList;
    //         move-result-object v2
    //         const/4 v3, 0x0
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/16 v1, 0x3e8
    //         invoke-virtual {p0}, Lcom/google/android/gms/games/internal/request/GameRequestCluster;->getVersionCode()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
