package com.google.android.gms.drive

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class g: android.os.Parcelable.Creator {
    public constructor()

    public fun R(p0: android.os.Parcel): com.google.android.gms.drive.StorageStats { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/drive/StorageStats;") }
    /*
    //         .locals 13
    //         const/4 v10, 0x0
    //         const-wide/16 v8, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v0
    //         move-wide v6, v8
    //         move-wide v4, v8
    //         move-wide v2, v8
    //         move v1, v10
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v11
    //         if-ge v11, v0, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v11
    //         invoke-static {v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v12
    //         packed-switch v12, :pswitch_data_0
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :pswitch_0
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v1
    //         goto :goto_0
    //         :pswitch_1
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->i(Landroid/os/Parcel;I)J
    //         move-result-wide v2
    //         goto :goto_0
    //         :pswitch_2
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->i(Landroid/os/Parcel;I)J
    //         move-result-wide v4
    //         goto :goto_0
    //         :pswitch_3
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->i(Landroid/os/Parcel;I)J
    //         move-result-wide v6
    //         goto :goto_0
    //         :pswitch_4
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->i(Landroid/os/Parcel;I)J
    //         move-result-wide v8
    //         goto :goto_0
    //         :pswitch_5
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v10
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v11
    //         if-eq v11, v0, :cond_1
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
    //         new-instance v0, Lcom/google/android/gms/drive/StorageStats;
    //         invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/drive/StorageStats;-><init>(IJJJJI)V
    //         return-object v0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //         .end packed-switch
    */

    public fun aY(p0: Int): Array<com.google.android.gms.drive.StorageStats> { return TODO("body: (I)[Lcom/google/android/gms/drive/StorageStats;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/drive/StorageStats;
    //         return-object v0
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/g;->R(Landroid/os/Parcel;)Lcom/google/android/gms/drive/StorageStats;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/g;->aY(I)[Lcom/google/android/gms/drive/StorageStats;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.drive.StorageStats, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/drive/StorageStats;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/drive/StorageStats;->BR:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/StorageStats;->NB:J
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IJ)V
    //         const/4 v1, 0x3
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/StorageStats;->NC:J
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IJ)V
    //         const/4 v1, 0x4
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/StorageStats;->ND:J
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IJ)V
    //         const/4 v1, 0x5
    //         iget-wide v2, p0, Lcom/google/android/gms/drive/StorageStats;->NE:J
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IJ)V
    //         const/4 v1, 0x6
    //         iget v2, p0, Lcom/google/android/gms/drive/StorageStats;->NF:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
