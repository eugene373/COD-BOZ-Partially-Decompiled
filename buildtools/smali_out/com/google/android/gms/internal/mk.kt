package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class mk: android.os.Parcelable.Creator {
    public constructor()

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/mk;->cz(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mj;
    //         move-result-object v0
    //         return-object v0
    */

    public fun cz(p0: android.os.Parcel): com.google.android.gms.internal.mj { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/internal/mj;") }
    /*
    //         .locals 9
    //         const/4 v4, 0x0
    //         const/4 v6, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v0
    //         move-object v5, v6
    //         move-object v3, v6
    //         move-object v2, v6
    //         move v1, v4
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v7
    //         if-ge v7, v0, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v7
    //         invoke-static {v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v8
    //         sparse-switch v8, :sswitch_data_0
    //         invoke-static {p1, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :sswitch_0
    //         sget-object v2, Lcom/google/android/gms/internal/mp;->CREATOR:Lcom/google/android/gms/internal/mq;
    //         invoke-static {p1, v7, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v2
    //         goto :goto_0
    //         :sswitch_1
    //         invoke-static {p1, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v1
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-static {p1, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v3
    //         goto :goto_0
    //         :sswitch_3
    //         invoke-static {p1, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;I)Z
    //         move-result v4
    //         goto :goto_0
    //         :sswitch_4
    //         sget-object v5, Lcom/google/android/gms/internal/mt;->CREATOR:Lcom/google/android/gms/internal/mu;
    //         invoke-static {p1, v7, v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v5
    //         goto :goto_0
    //         :sswitch_5
    //         invoke-static {p1, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;I)Ljava/util/ArrayList;
    //         move-result-object v6
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v7
    //         if-eq v7, v0, :cond_1
    //         new-instance v1, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Overread allowed size end="
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0, p1}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v1
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/internal/mj;
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/mj;-><init>(ILjava/util/List;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V
    //         return-object v0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_0
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x4 -> :sswitch_4
    //             0x6 -> :sswitch_5
    //             0x3e8 -> :sswitch_1
    //         .end sparse-switch
    */

    public fun ep(p0: Int): Array<com.google.android.gms.internal.mj> { return TODO("body: (I)[Lcom/google/android/gms/internal/mj;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/internal/mj;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/mk;->ep(I)[Lcom/google/android/gms/internal/mj;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.mj, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/internal/mj;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mj;->afr:Ljava/util/List;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/16 v1, 0x3e8
    //         iget v2, p0, Lcom/google/android/gms/internal/mj;->BR:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/mj;->mi()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x3
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/mj;->mj()Z
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IZ)V
    //         const/4 v1, 0x4
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mj;->afu:Ljava/util/List;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/4 v1, 0x6
    //         iget-object v2, p0, Lcom/google/android/gms/internal/mj;->afv:Ljava/util/List;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->b(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
