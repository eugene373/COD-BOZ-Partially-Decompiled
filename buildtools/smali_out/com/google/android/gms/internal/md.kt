package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class md: android.os.Parcelable.Creator {
    public constructor()

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/md;->cw(Landroid/os/Parcel;)Lcom/google/android/gms/internal/mc;
    //         move-result-object v0
    //         return-object v0
    */

    public fun cw(p0: android.os.Parcel): com.google.android.gms.internal.mc { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/internal/mc;") }
    /*
    //         .locals 18
    //         invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v2
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         const/4 v6, 0x0
    //         const/4 v7, 0x0
    //         const-wide/16 v8, 0x0
    //         const-wide/16 v10, 0x0
    //         const/4 v12, 0x0
    //         const-wide/16 v13, 0x0
    //         const/4 v15, 0x0
    //         const/16 v16, -0x1
    //         :goto_0
    //         invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v3
    //         if-ge v3, v2, :cond_0
    //         invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v3
    //         invoke-static {v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v17
    //         sparse-switch v17, :sswitch_data_0
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :sswitch_0
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v5
    //         goto :goto_0
    //         :sswitch_1
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v4
    //         goto :goto_0
    //         :sswitch_2
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->i(Landroid/os/Parcel;I)J
    //         move-result-wide v13
    //         goto :goto_0
    //         :sswitch_3
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->f(Landroid/os/Parcel;I)S
    //         move-result v7
    //         goto :goto_0
    //         :sswitch_4
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->m(Landroid/os/Parcel;I)D
    //         move-result-wide v8
    //         goto :goto_0
    //         :sswitch_5
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->m(Landroid/os/Parcel;I)D
    //         move-result-wide v10
    //         goto :goto_0
    //         :sswitch_6
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->l(Landroid/os/Parcel;I)F
    //         move-result v12
    //         goto :goto_0
    //         :sswitch_7
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v6
    //         goto :goto_0
    //         :sswitch_8
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v15
    //         goto :goto_0
    //         :sswitch_9
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v16
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v3
    //         if-eq v3, v2, :cond_1
    //         new-instance v3, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Overread allowed size end="
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         move-object/from16 v0, p1
    //         invoke-direct {v3, v2, v0}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v3
    //         :cond_1
    //         new-instance v3, Lcom/google/android/gms/internal/mc;
    //         invoke-direct/range {v3 .. v16}, Lcom/google/android/gms/internal/mc;-><init>(ILjava/lang/String;ISDDFJII)V
    //         return-object v3
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

    public fun em(p0: Int): Array<com.google.android.gms.internal.mc> { return TODO("body: (I)[Lcom/google/android/gms/internal/mc;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/internal/mc;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/md;->em(I)[Lcom/google/android/gms/internal/mc;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.mc, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/internal/mc;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/mc;->getRequestId()Ljava/lang/String;
    //         move-result-object v2
    //         const/4 v3, 0x0
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/16 v1, 0x3e8
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/mc;->getVersionCode()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/mc;->getExpirationTime()J
    //         move-result-wide v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IJ)V
    //         const/4 v1, 0x3
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/mc;->ma()S
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IS)V
    //         const/4 v1, 0x4
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/mc;->getLatitude()D
    //         move-result-wide v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ID)V
    //         const/4 v1, 0x5
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/mc;->getLongitude()D
    //         move-result-wide v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ID)V
    //         const/4 v1, 0x6
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/mc;->mb()F
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IF)V
    //         const/4 v1, 0x7
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/mc;->mc()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/16 v1, 0x8
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/mc;->getNotificationResponsiveness()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/16 v1, 0x9
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/mc;->md()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
