package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class oe: android.os.Parcelable.Creator {
    public constructor()

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/oe;->dh(Landroid/os/Parcel;)Lcom/google/android/gms/internal/nz$b$b;
    //         move-result-object v0
    //         return-object v0
    */

    public fun dh(p0: android.os.Parcel): com.google.android.gms.internal.nz.b.b { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/internal/nz$b$b;") }
    /*
    //         .locals 8
    //         const/4 v5, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v0
    //         new-instance v1, Ljava/util/HashSet;
    //         invoke-direct {v1}, Ljava/util/HashSet;-><init>()V
    //         const/4 v4, 0x0
    //         move v3, v5
    //         move v2, v5
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v6
    //         if-ge v6, v0, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v6
    //         invoke-static {v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v7
    //         packed-switch v7, :pswitch_data_0
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :pswitch_0
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v2
    //         const/4 v6, 0x1
    //         invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v6
    //         invoke-interface {v1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :pswitch_1
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v3
    //         const/4 v6, 0x2
    //         invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v6
    //         invoke-interface {v1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :pswitch_2
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v4
    //         const/4 v6, 0x3
    //         invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v6
    //         invoke-interface {v1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :pswitch_3
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v5
    //         const/4 v6, 0x4
    //         invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v6
    //         invoke-interface {v1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v6
    //         if-eq v6, v0, :cond_1
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
    //         new-instance v0, Lcom/google/android/gms/internal/nz$b$b;
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/nz$b$b;-><init>(Ljava/util/Set;IILjava/lang/String;I)V
    //         return-object v0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //         .end packed-switch
    */

    public fun eZ(p0: Int): Array<com.google.android.gms.internal.nz.b.b> { return TODO("body: (I)[Lcom/google/android/gms/internal/nz$b$b;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/internal/nz$b$b;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/oe;->eZ(I)[Lcom/google/android/gms/internal/nz$b$b;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.nz.b.b, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/internal/nz$b$b;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 7
    //         const/4 v6, 0x4
    //         const/4 v5, 0x3
    //         const/4 v4, 0x2
    //         const/4 v3, 0x1
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/nz$b$b;->amc:Ljava/util/Set;
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         iget v2, p0, Lcom/google/android/gms/internal/nz$b$b;->BR:I
    //         invoke-static {p1, v3, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         :cond_0
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         iget v2, p0, Lcom/google/android/gms/internal/nz$b$b;->lg:I
    //         invoke-static {p1, v4, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         :cond_1
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         iget-object v2, p0, Lcom/google/android/gms/internal/nz$b$b;->uR:Ljava/lang/String;
    //         invoke-static {p1, v5, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         :cond_2
    //         invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         iget v1, p0, Lcom/google/android/gms/internal/nz$b$b;->lf:I
    //         invoke-static {p1, v6, v1}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         :cond_3
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
