package com.google.android.gms.wallet.wobs

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class a: android.os.Parcelable.Creator {
    public constructor()

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wallet/wobs/a;->dG(Landroid/os/Parcel;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject;
    //         move-result-object v0
    //         return-object v0
    */

    public fun dG(p0: android.os.Parcel): com.google.android.gms.wallet.wobs.CommonWalletObject { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject;") }
    /*
    //         .locals 25
    //         invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v23
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
    //         invoke-static {}, Lcom/google/android/gms/internal/jr;->hz()Ljava/util/ArrayList;
    //         move-result-object v13
    //         const/4 v14, 0x0
    //         invoke-static {}, Lcom/google/android/gms/internal/jr;->hz()Ljava/util/ArrayList;
    //         move-result-object v15
    //         const/16 v16, 0x0
    //         const/16 v17, 0x0
    //         invoke-static {}, Lcom/google/android/gms/internal/jr;->hz()Ljava/util/ArrayList;
    //         move-result-object v18
    //         const/16 v19, 0x0
    //         invoke-static {}, Lcom/google/android/gms/internal/jr;->hz()Ljava/util/ArrayList;
    //         move-result-object v20
    //         invoke-static {}, Lcom/google/android/gms/internal/jr;->hz()Ljava/util/ArrayList;
    //         move-result-object v21
    //         invoke-static {}, Lcom/google/android/gms/internal/jr;->hz()Ljava/util/ArrayList;
    //         move-result-object v22
    //         :goto_0
    //         invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         move/from16 v0, v23
    //         if-ge v2, v0, :cond_0
    //         invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v2
    //         invoke-static {v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v24
    //         packed-switch v24, :pswitch_data_0
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :pswitch_0
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v3
    //         goto :goto_0
    //         :pswitch_1
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v4
    //         goto :goto_0
    //         :pswitch_2
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v5
    //         goto :goto_0
    //         :pswitch_3
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v6
    //         goto :goto_0
    //         :pswitch_4
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v7
    //         goto :goto_0
    //         :pswitch_5
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v8
    //         goto :goto_0
    //         :pswitch_6
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v9
    //         goto :goto_0
    //         :pswitch_7
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v10
    //         goto :goto_0
    //         :pswitch_8
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v11
    //         goto :goto_0
    //         :pswitch_9
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v12
    //         goto :goto_0
    //         :pswitch_a
    //         sget-object v13, Lcom/google/android/gms/wallet/wobs/p;->CREATOR:Landroid/os/Parcelable$Creator;
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2, v13}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v13
    //         goto :goto_0
    //         :pswitch_b
    //         sget-object v14, Lcom/google/android/gms/wallet/wobs/l;->CREATOR:Landroid/os/Parcelable$Creator;
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2, v14}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v2
    //         check-cast v2, Lcom/google/android/gms/wallet/wobs/l;
    //         move-object v14, v2
    //         goto :goto_0
    //         :pswitch_c
    //         sget-object v15, Lcom/google/android/gms/maps/model/LatLng;->CREATOR:Lcom/google/android/gms/maps/model/i;
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2, v15}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v15
    //         goto :goto_0
    //         :pswitch_d
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v16
    //         goto/16 :goto_0
    //         :pswitch_e
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v17
    //         goto/16 :goto_0
    //         :pswitch_f
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;I)Z
    //         move-result v19
    //         goto/16 :goto_0
    //         :pswitch_10
    //         sget-object v18, Lcom/google/android/gms/wallet/wobs/d;->CREATOR:Landroid/os/Parcelable$Creator;
    //         move-object/from16 v0, p1
    //         move-object/from16 v1, v18
    //         invoke-static {v0, v2, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v18
    //         goto/16 :goto_0
    //         :pswitch_11
    //         sget-object v21, Lcom/google/android/gms/wallet/wobs/j;->CREATOR:Landroid/os/Parcelable$Creator;
    //         move-object/from16 v0, p1
    //         move-object/from16 v1, v21
    //         invoke-static {v0, v2, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v21
    //         goto/16 :goto_0
    //         :pswitch_12
    //         sget-object v20, Lcom/google/android/gms/wallet/wobs/n;->CREATOR:Landroid/os/Parcelable$Creator;
    //         move-object/from16 v0, p1
    //         move-object/from16 v1, v20
    //         invoke-static {v0, v2, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v20
    //         goto/16 :goto_0
    //         :pswitch_13
    //         sget-object v22, Lcom/google/android/gms/wallet/wobs/n;->CREATOR:Landroid/os/Parcelable$Creator;
    //         move-object/from16 v0, p1
    //         move-object/from16 v1, v22
    //         invoke-static {v0, v2, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v22
    //         goto/16 :goto_0
    //         :cond_0
    //         invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         move/from16 v0, v23
    //         if-eq v2, v0, :cond_1
    //         new-instance v2, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Overread allowed size end="
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         move/from16 v0, v23
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         move-object/from16 v0, p1
    //         invoke-direct {v2, v3, v0}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v2
    //         :cond_1
    //         new-instance v2, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;
    //         invoke-direct/range {v2 .. v22}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Lcom/google/android/gms/wallet/wobs/l;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //         return-object v2
    //         nop
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
    //             :pswitch_10
    //             :pswitch_f
    //             :pswitch_12
    //             :pswitch_11
    //             :pswitch_13
    //         .end packed-switch
    */

    public fun fJ(p0: Int): Array<com.google.android.gms.wallet.wobs.CommonWalletObject> { return TODO("body: (I)[Lcom/google/android/gms/wallet/wobs/CommonWalletObject;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/wallet/wobs/CommonWalletObject;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wallet/wobs/a;->fJ(I)[Lcom/google/android/gms/wallet/wobs/CommonWalletObject;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.wallet.wobs.CommonWalletObject, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/wallet/wobs/CommonWalletObject;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->getVersionCode()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->fl:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->ata:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x4
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->name:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x5
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->asU:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x6
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->asW:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x7
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->asX:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/16 v1, 0x8
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->asY:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/16 v1, 0x9
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->asZ:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/16 v1, 0xa
    //         iget v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->state:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/16 v1, 0xb
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->atb:Ljava/util/ArrayList;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/16 v1, 0xc
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->atc:Lcom/google/android/gms/wallet/wobs/l;
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         const/16 v1, 0xd
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->atd:Ljava/util/ArrayList;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/16 v1, 0xe
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->ate:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/16 v1, 0xf
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->atf:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/16 v1, 0x11
    //         iget-boolean v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->ath:Z
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IZ)V
    //         const/16 v1, 0x10
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->atg:Ljava/util/ArrayList;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/16 v1, 0x13
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->atj:Ljava/util/ArrayList;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/16 v1, 0x12
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->ati:Ljava/util/ArrayList;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/16 v1, 0x14
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->atk:Ljava/util/ArrayList;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
