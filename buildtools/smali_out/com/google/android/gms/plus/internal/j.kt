package com.google.android.gms.plus.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class j: android.os.Parcelable.Creator {
    public constructor()

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/plus/internal/j;->da(Landroid/os/Parcel;)Lcom/google/android/gms/plus/internal/h;
    //         move-result-object v0
    //         return-object v0
    */

    public fun da(p0: android.os.Parcel): com.google.android.gms.plus.internal.h { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/plus/internal/h;") }
    /*
    //         .locals 13
    //         const/4 v10, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v11
    //         const/4 v1, 0x0
    //         move-object v9, v10
    //         move-object v8, v10
    //         move-object v7, v10
    //         move-object v6, v10
    //         move-object v5, v10
    //         move-object v4, v10
    //         move-object v3, v10
    //         move-object v2, v10
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-ge v0, v11, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v12
    //         sparse-switch v12, :sswitch_data_0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :sswitch_0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v2
    //         goto :goto_0
    //         :sswitch_1
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v1
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->A(Landroid/os/Parcel;I)[Ljava/lang/String;
    //         move-result-object v3
    //         goto :goto_0
    //         :sswitch_3
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->A(Landroid/os/Parcel;I)[Ljava/lang/String;
    //         move-result-object v4
    //         goto :goto_0
    //         :sswitch_4
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->A(Landroid/os/Parcel;I)[Ljava/lang/String;
    //         move-result-object v5
    //         goto :goto_0
    //         :sswitch_5
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v6
    //         goto :goto_0
    //         :sswitch_6
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v7
    //         goto :goto_0
    //         :sswitch_7
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v8
    //         goto :goto_0
    //         :sswitch_8
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v9
    //         goto :goto_0
    //         :sswitch_9
    //         sget-object v10, Lcom/google/android/gms/plus/internal/PlusCommonExtras;->CREATOR:Lcom/google/android/gms/plus/internal/f;
    //         invoke-static {p1, v0, v10}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/plus/internal/PlusCommonExtras;
    //         move-object v10, v0
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-eq v0, v11, :cond_1
    //         new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Overread allowed size end="
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p1}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/plus/internal/h;
    //         invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/plus/internal/h;-><init>(ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/PlusCommonExtras;)V
    //         return-object v0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_0
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x4 -> :sswitch_4
    //             0x5 -> :sswitch_5
    //             0x6 -> :sswitch_6
    //             0x7 -> :sswitch_7
    //             0x8 -> :sswitch_8
    //             0x9 -> :sswitch_9
    //             0x3e8 -> :sswitch_1
    //         .end sparse-switch
    */

    public fun eS(p0: Int): Array<com.google.android.gms.plus.internal.h> { return TODO("body: (I)[Lcom/google/android/gms/plus/internal/h;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/plus/internal/h;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/plus/internal/j;->eS(I)[Lcom/google/android/gms/plus/internal/h;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.plus.internal.h, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/plus/internal/h;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/h;->getAccountName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/16 v1, 0x3e8
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/h;->getVersionCode()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/h;->ng()[Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;I[Ljava/lang/String;Z)V
    //         const/4 v1, 0x3
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/h;->nh()[Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;I[Ljava/lang/String;Z)V
    //         const/4 v1, 0x4
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/h;->ni()[Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;I[Ljava/lang/String;Z)V
    //         const/4 v1, 0x5
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/h;->nj()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x6
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/h;->nk()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x7
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/h;->nl()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/16 v1, 0x8
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/h;->nm()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/16 v1, 0x9
    //         invoke-virtual {p0}, Lcom/google/android/gms/plus/internal/h;->nn()Lcom/google/android/gms/plus/internal/PlusCommonExtras;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
