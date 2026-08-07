package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class oi: android.os.Parcelable.Creator {
    public constructor()

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/oi;->dl(Landroid/os/Parcel;)Lcom/google/android/gms/internal/nz$g;
    //         move-result-object v0
    //         return-object v0
    */

    public fun dl(p0: android.os.Parcel): com.google.android.gms.internal.nz.g { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/internal/nz$g;") }
    /*
    //         .locals 7
    //         const/4 v1, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v3
    //         new-instance v4, Ljava/util/HashSet;
    //         invoke-direct {v4}, Ljava/util/HashSet;-><init>()V
    //         const/4 v0, 0x0
    //         move v2, v1
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v5
    //         if-ge v5, v3, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v5
    //         invoke-static {v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v6
    //         packed-switch v6, :pswitch_data_0
    //         invoke-static {p1, v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :pswitch_0
    //         invoke-static {p1, v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v2
    //         const/4 v5, 0x1
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :pswitch_1
    //         invoke-static {p1, v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;I)Z
    //         move-result v1
    //         const/4 v5, 0x2
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :pswitch_2
    //         invoke-static {p1, v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v5, 0x3
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v5
    //         if-eq v5, v3, :cond_1
    //         new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Overread allowed size end="
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p1}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v0
    //         :cond_1
    //         new-instance v3, Lcom/google/android/gms/internal/nz$g;
    //         invoke-direct {v3, v4, v2, v1, v0}, Lcom/google/android/gms/internal/nz$g;-><init>(Ljava/util/Set;IZLjava/lang/String;)V
    //         return-object v3
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun fd(p0: Int): Array<com.google.android.gms.internal.nz.g> { return TODO("body: (I)[Lcom/google/android/gms/internal/nz$g;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/internal/nz$g;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/oi;->fd(I)[Lcom/google/android/gms/internal/nz$g;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.nz.g, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/internal/nz$g;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x3
    //         const/4 v4, 0x2
    //         const/4 v3, 0x1
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/nz$g;->amc:Ljava/util/Set;
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         iget v2, p0, Lcom/google/android/gms/internal/nz$g;->BR:I
    //         invoke-static {p1, v3, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         :cond_0
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         iget-boolean v2, p0, Lcom/google/android/gms/internal/nz$g;->anG:Z
    //         invoke-static {p1, v4, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IZ)V
    //         :cond_1
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/nz$g;->mValue:Ljava/lang/String;
    //         invoke-static {p1, v5, v1, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         :cond_2
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
