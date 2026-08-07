package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class fj: android.os.Parcelable.Creator {
    public constructor()

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/fj;->h(Landroid/os/Parcel;)Lcom/google/android/gms/internal/fi;
    //         move-result-object v0
    //         return-object v0
    */

    public fun h(p0: android.os.Parcel): com.google.android.gms.internal.fi { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/internal/fi;") }
    /*
    //         .locals 20
    //         invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v18
    //         const/4 v2, 0x0
    //         const/4 v3, 0x0
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         const/4 v6, 0x0
    //         const/4 v7, 0x0
    //         const/4 v8, 0x0
    //         const/4 v9, 0x0
    //         const/4 v10, 0x0
    //         const/4 v11, 0x0
    //         const/4 v12, 0x0
    //         const/4 v13, 0x0
    //         const/4 v14, 0x0
    //         const/4 v15, 0x0
    //         const/16 v16, 0x0
    //         const/16 v17, 0x0
    //         :goto_0
    //         invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v1
    //         move/from16 v0, v18
    //         if-ge v1, v0, :cond_0
    //         invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v1
    //         invoke-static {v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v19
    //         packed-switch v19, :pswitch_data_0
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :pswitch_0
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v2
    //         goto :goto_0
    //         :pswitch_1
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->q(Landroid/os/Parcel;I)Landroid/os/Bundle;
    //         move-result-object v3
    //         goto :goto_0
    //         :pswitch_2
    //         sget-object v4, Lcom/google/android/gms/internal/av;->CREATOR:Lcom/google/android/gms/internal/aw;
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1, v4}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/av;
    //         move-object v4, v1
    //         goto :goto_0
    //         :pswitch_3
    //         sget-object v5, Lcom/google/android/gms/internal/ay;->CREATOR:Lcom/google/android/gms/internal/az;
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1, v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/ay;
    //         move-object v5, v1
    //         goto :goto_0
    //         :pswitch_4
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v6
    //         goto :goto_0
    //         :pswitch_5
    //         sget-object v7, Landroid/content/pm/ApplicationInfo;->CREATOR:Landroid/os/Parcelable$Creator;
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v1
    //         check-cast v1, Landroid/content/pm/ApplicationInfo;
    //         move-object v7, v1
    //         goto :goto_0
    //         :pswitch_6
    //         sget-object v8, Landroid/content/pm/PackageInfo;->CREATOR:Landroid/os/Parcelable$Creator;
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1, v8}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v1
    //         check-cast v1, Landroid/content/pm/PackageInfo;
    //         move-object v8, v1
    //         goto :goto_0
    //         :pswitch_7
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v9
    //         goto :goto_0
    //         :pswitch_8
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v10
    //         goto :goto_0
    //         :pswitch_9
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v11
    //         goto :goto_0
    //         :pswitch_a
    //         sget-object v12, Lcom/google/android/gms/internal/gt;->CREATOR:Lcom/google/android/gms/internal/gu;
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1, v12}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/gt;
    //         move-object v12, v1
    //         goto :goto_0
    //         :pswitch_b
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->q(Landroid/os/Parcel;I)Landroid/os/Bundle;
    //         move-result-object v13
    //         goto/16 :goto_0
    //         :pswitch_c
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v14
    //         goto/16 :goto_0
    //         :pswitch_d
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;I)Ljava/util/ArrayList;
    //         move-result-object v15
    //         goto/16 :goto_0
    //         :pswitch_e
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->q(Landroid/os/Parcel;I)Landroid/os/Bundle;
    //         move-result-object v16
    //         goto/16 :goto_0
    //         :pswitch_f
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;I)Z
    //         move-result v17
    //         goto/16 :goto_0
    //         :cond_0
    //         invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v1
    //         move/from16 v0, v18
    //         if-eq v1, v0, :cond_1
    //         new-instance v1, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Overread allowed size end="
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         move/from16 v0, v18
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         move-object/from16 v0, p1
    //         invoke-direct {v1, v2, v0}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v1
    //         :cond_1
    //         new-instance v1, Lcom/google/android/gms/internal/fi;
    //         invoke-direct/range {v1 .. v17}, Lcom/google/android/gms/internal/fi;-><init>(ILandroid/os/Bundle;Lcom/google/android/gms/internal/av;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/gt;Landroid/os/Bundle;ILjava/util/List;Landroid/os/Bundle;Z)V
    //         return-object v1
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //             :pswitch_6
    //             :pswitch_7
    //             :pswitch_8
    //             :pswitch_9
    //             :pswitch_a
    //             :pswitch_b
    //             :pswitch_c
    //             :pswitch_d
    //             :pswitch_e
    //             :pswitch_f
    //         .end packed-switch
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/fj;->p(I)[Lcom/google/android/gms/internal/fi;
    //         move-result-object v0
    //         return-object v0
    */

    public fun p(p0: Int): Array<com.google.android.gms.internal.fi> { return TODO("body: (I)[Lcom/google/android/gms/internal/fi;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/internal/fi;
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.fi, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/internal/fi;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/internal/fi;->versionCode:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fi;->tw:Landroid/os/Bundle;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fi;->tx:Lcom/google/android/gms/internal/av;
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         const/4 v1, 0x4
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fi;->lH:Lcom/google/android/gms/internal/ay;
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         const/4 v1, 0x5
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fi;->lA:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x6
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fi;->applicationInfo:Landroid/content/pm/ApplicationInfo;
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         const/4 v1, 0x7
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fi;->ty:Landroid/content/pm/PackageInfo;
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         const/16 v1, 0x8
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fi;->tz:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/16 v1, 0x9
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fi;->tA:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/16 v1, 0xa
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fi;->tB:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/16 v1, 0xb
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fi;->lD:Lcom/google/android/gms/internal/gt;
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         const/16 v1, 0xc
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fi;->tC:Landroid/os/Bundle;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V
    //         const/16 v1, 0xd
    //         iget v2, p0, Lcom/google/android/gms/internal/fi;->tD:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/16 v1, 0xe
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fi;->lS:Ljava/util/List;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->b(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/16 v1, 0xf
    //         iget-object v2, p0, Lcom/google/android/gms/internal/fi;->tE:Landroid/os/Bundle;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V
    //         const/16 v1, 0x10
    //         iget-boolean v2, p0, Lcom/google/android/gms/internal/fi;->tF:Z
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IZ)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
