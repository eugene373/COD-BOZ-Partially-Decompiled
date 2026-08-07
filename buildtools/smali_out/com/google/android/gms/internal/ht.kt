package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class ht: android.os.Parcelable.Creator {
    public constructor()

    public fun R(p0: Int): Array<com.google.android.gms.internal.hs> { return TODO("body: (I)[Lcom/google/android/gms/internal/hs;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/internal/hs;
    //         return-object v0
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ht;->s(Landroid/os/Parcel;)Lcom/google/android/gms/internal/hs;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ht;->R(I)[Lcom/google/android/gms/internal/hs;
    //         move-result-object v0
    //         return-object v0
    */

    public fun s(p0: android.os.Parcel): com.google.android.gms.internal.hs { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/internal/hs;") }
    /*
    //         .locals 10
    //         const/4 v6, 0x0
    //         const/4 v8, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v1
    //         const-wide/16 v4, 0x0
    //         move-object v7, v8
    //         move-object v3, v8
    //         move v2, v6
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-ge v0, v1, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v9
    //         sparse-switch v9, :sswitch_data_0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :sswitch_0
    //         sget-object v3, Lcom/google/android/gms/internal/hg;->CREATOR:Lcom/google/android/gms/internal/hh;
    //         invoke-static {p1, v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/hg;
    //         move-object v3, v0
    //         goto :goto_0
    //         :sswitch_1
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v2
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->i(Landroid/os/Parcel;I)J
    //         move-result-wide v4
    //         goto :goto_0
    //         :sswitch_3
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v6
    //         goto :goto_0
    //         :sswitch_4
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v7
    //         goto :goto_0
    //         :sswitch_5
    //         sget-object v8, Lcom/google/android/gms/internal/he;->CREATOR:Lcom/google/android/gms/internal/hf;
    //         invoke-static {p1, v0, v8}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/he;
    //         move-object v8, v0
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-eq v0, v1, :cond_1
    //         new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Overread allowed size end="
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p1}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v0
    //         :cond_1
    //         new-instance v1, Lcom/google/android/gms/internal/hs;
    //         invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/hs;-><init>(ILcom/google/android/gms/internal/hg;JILjava/lang/String;Lcom/google/android/gms/internal/he;)V
    //         return-object v1
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_0
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x4 -> :sswitch_4
    //             0x5 -> :sswitch_5
    //             0x3e8 -> :sswitch_1
    //         .end sparse-switch
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.hs, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/internal/hs;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/hs;->CD:Lcom/google/android/gms/internal/hg;
    //         invoke-static {p1, v1, v2, p2, v4}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         const/16 v1, 0x3e8
    //         iget v2, p0, Lcom/google/android/gms/internal/hs;->BR:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/hs;->CE:J
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IJ)V
    //         const/4 v1, 0x3
    //         iget v2, p0, Lcom/google/android/gms/internal/hs;->CF:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x4
    //         iget-object v2, p0, Lcom/google/android/gms/internal/hs;->oT:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v4}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x5
    //         iget-object v2, p0, Lcom/google/android/gms/internal/hs;->CG:Lcom/google/android/gms/internal/he;
    //         invoke-static {p1, v1, v2, p2, v4}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
