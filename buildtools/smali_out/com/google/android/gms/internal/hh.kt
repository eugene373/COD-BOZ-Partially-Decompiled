package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class hh: android.os.Parcelable.Creator {
    public constructor()

    public fun J(p0: Int): Array<com.google.android.gms.internal.hg> { return TODO("body: (I)[Lcom/google/android/gms/internal/hg;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/internal/hg;
    //         return-object v0
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/hh;->m(Landroid/os/Parcel;)Lcom/google/android/gms/internal/hg;
    //         move-result-object v0
    //         return-object v0
    */

    public fun m(p0: android.os.Parcel): com.google.android.gms.internal.hg { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/internal/hg;") }
    /*
    //         .locals 7
    //         const/4 v0, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v4
    //         const/4 v3, 0x0
    //         move-object v1, v0
    //         move-object v2, v0
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v5
    //         if-ge v5, v4, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v5
    //         invoke-static {v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v6
    //         sparse-switch v6, :sswitch_data_0
    //         invoke-static {p1, v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :sswitch_0
    //         invoke-static {p1, v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v2
    //         goto :goto_0
    //         :sswitch_1
    //         invoke-static {p1, v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v3
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-static {p1, v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v1
    //         goto :goto_0
    //         :sswitch_3
    //         invoke-static {p1, v5}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v5
    //         if-eq v5, v4, :cond_1
    //         new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Overread allowed size end="
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p1}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v0
    //         :cond_1
    //         new-instance v4, Lcom/google/android/gms/internal/hg;
    //         invoke-direct {v4, v3, v2, v1, v0}, Lcom/google/android/gms/internal/hg;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v4
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_0
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x3e8 -> :sswitch_1
    //         .end sparse-switch
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/hh;->J(I)[Lcom/google/android/gms/internal/hg;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.hg, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/internal/hg;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/hg;->BZ:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/16 v1, 0x3e8
    //         iget v2, p0, Lcom/google/android/gms/internal/hg;->BR:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/internal/hg;->Ca:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/hg;->Cb:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
