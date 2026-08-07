package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class oh: android.os.Parcelable.Creator {
    public constructor()

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/oh;->dk(Landroid/os/Parcel;)Lcom/google/android/gms/internal/nz$f;
    //         move-result-object v0
    //         return-object v0
    */

    public fun dk(p0: android.os.Parcel): com.google.android.gms.internal.nz.f { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/internal/nz$f;") }
    /*
    //         .locals 14
    //         const/4 v11, 0x0
    //         const/4 v10, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v0
    //         new-instance v1, Ljava/util/HashSet;
    //         invoke-direct {v1}, Ljava/util/HashSet;-><init>()V
    //         move-object v9, v10
    //         move v8, v11
    //         move-object v7, v10
    //         move-object v6, v10
    //         move-object v5, v10
    //         move-object v4, v10
    //         move-object v3, v10
    //         move v2, v11
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v12
    //         if-ge v12, v0, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v12
    //         invoke-static {v12}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v13
    //         packed-switch v13, :pswitch_data_0
    //         invoke-static {p1, v12}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :pswitch_0
    //         invoke-static {p1, v12}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v2
    //         const/4 v12, 0x1
    //         invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v12
    //         invoke-interface {v1, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :pswitch_1
    //         invoke-static {p1, v12}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v3
    //         const/4 v12, 0x2
    //         invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v12
    //         invoke-interface {v1, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :pswitch_2
    //         invoke-static {p1, v12}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v4
    //         const/4 v12, 0x3
    //         invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v12
    //         invoke-interface {v1, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :pswitch_3
    //         invoke-static {p1, v12}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v5
    //         const/4 v12, 0x4
    //         invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v12
    //         invoke-interface {v1, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :pswitch_4
    //         invoke-static {p1, v12}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v6
    //         const/4 v12, 0x5
    //         invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v12
    //         invoke-interface {v1, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :pswitch_5
    //         invoke-static {p1, v12}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v7
    //         const/4 v12, 0x6
    //         invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v12
    //         invoke-interface {v1, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :pswitch_6
    //         invoke-static {p1, v12}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;I)Z
    //         move-result v8
    //         const/4 v12, 0x7
    //         invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v12
    //         invoke-interface {v1, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :pswitch_7
    //         invoke-static {p1, v12}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v9
    //         const/16 v12, 0x8
    //         invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v12
    //         invoke-interface {v1, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :pswitch_8
    //         invoke-static {p1, v12}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v10
    //         const/16 v12, 0x9
    //         invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v12
    //         invoke-interface {v1, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto/16 :goto_0
    //         :pswitch_9
    //         invoke-static {p1, v12}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v11
    //         const/16 v12, 0xa
    //         invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v12
    //         invoke-interface {v1, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto/16 :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v12
    //         if-eq v12, v0, :cond_1
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
    //         new-instance v0, Lcom/google/android/gms/internal/nz$f;
    //         invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/internal/nz$f;-><init>(Ljava/util/Set;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)V
    //         return-object v0
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
    //         .end packed-switch
    */

    public fun fc(p0: Int): Array<com.google.android.gms.internal.nz.f> { return TODO("body: (I)[Lcom/google/android/gms/internal/nz$f;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/internal/nz$f;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/oh;->fc(I)[Lcom/google/android/gms/internal/nz$f;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.nz.f, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/internal/nz$f;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 8
    //         const/4 v7, 0x5
    //         const/4 v6, 0x4
    //         const/4 v5, 0x3
    //         const/4 v3, 0x2
    //         const/4 v4, 0x1
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/nz$f;->amc:Ljava/util/Set;
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         iget v2, p0, Lcom/google/android/gms/internal/nz$f;->BR:I
    //         invoke-static {p1, v4, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         :cond_0
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/nz$f;->anE:Ljava/lang/String;
    //         invoke-static {p1, v3, v2, v4}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         :cond_1
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         iget-object v2, p0, Lcom/google/android/gms/internal/nz$f;->Tr:Ljava/lang/String;
    //         invoke-static {p1, v5, v2, v4}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         :cond_2
    //         invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/nz$f;->amz:Ljava/lang/String;
    //         invoke-static {p1, v6, v2, v4}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         :cond_3
    //         invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         iget-object v2, p0, Lcom/google/android/gms/internal/nz$f;->anF:Ljava/lang/String;
    //         invoke-static {p1, v7, v2, v4}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         :cond_4
    //         const/4 v2, 0x6
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_5
    //         const/4 v2, 0x6
    //         iget-object v3, p0, Lcom/google/android/gms/internal/nz$f;->mName:Ljava/lang/String;
    //         invoke-static {p1, v2, v3, v4}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         :cond_5
    //         const/4 v2, 0x7
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_6
    //         const/4 v2, 0x7
    //         iget-boolean v3, p0, Lcom/google/android/gms/internal/nz$f;->anG:Z
    //         invoke-static {p1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IZ)V
    //         :cond_6
    //         const/16 v2, 0x8
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_7
    //         const/16 v2, 0x8
    //         iget-object v3, p0, Lcom/google/android/gms/internal/nz$f;->amP:Ljava/lang/String;
    //         invoke-static {p1, v2, v3, v4}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         :cond_7
    //         const/16 v2, 0x9
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_8
    //         const/16 v2, 0x9
    //         iget-object v3, p0, Lcom/google/android/gms/internal/nz$f;->Nw:Ljava/lang/String;
    //         invoke-static {p1, v2, v3, v4}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         :cond_8
    //         const/16 v2, 0xa
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_9
    //         const/16 v1, 0xa
    //         iget v2, p0, Lcom/google/android/gms/internal/nz$f;->FD:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         :cond_9
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
