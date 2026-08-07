package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class o: android.os.Parcelable.Creator {
    public constructor()

    public fun bt(p0: android.os.Parcel): com.google.android.gms.fitness.data.RawDataSet { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/fitness/data/RawDataSet;") }
    /*
    //         .locals 8
    //         const/4 v5, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v4, 0x0
    //         move v3, v5
    //         move v2, v5
    //         move v1, v5
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v6
    //         if-ge v6, v0, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v6
    //         invoke-static {v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v7
    //         sparse-switch v7, :sswitch_data_0
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :sswitch_0
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v2
    //         goto :goto_0
    //         :sswitch_1
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v1
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v3
    //         goto :goto_0
    //         :sswitch_3
    //         sget-object v4, Lcom/google/android/gms/fitness/data/RawDataPoint;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-static {p1, v6, v4}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v4
    //         goto :goto_0
    //         :sswitch_4
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;I)Z
    //         move-result v5
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
    //         new-instance v0, Lcom/google/android/gms/fitness/data/RawDataSet;
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/fitness/data/RawDataSet;-><init>(IIILjava/util/List;Z)V
    //         return-object v0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_0
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x4 -> :sswitch_4
    //             0x3e8 -> :sswitch_1
    //         .end sparse-switch
    */

    public fun cJ(p0: Int): Array<com.google.android.gms.fitness.data.RawDataSet> { return TODO("body: (I)[Lcom/google/android/gms/fitness/data/RawDataSet;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/fitness/data/RawDataSet;
    //         return-object v0
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/data/o;->bt(Landroid/os/Parcel;)Lcom/google/android/gms/fitness/data/RawDataSet;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/data/o;->cJ(I)[Lcom/google/android/gms/fitness/data/RawDataSet;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.fitness.data.RawDataSet, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/fitness/data/RawDataSet;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->Tm:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/16 v1, 0x3e8
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->BR:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->To:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->Tp:Ljava/util/List;
    //         const/4 v3, 0x0
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/4 v1, 0x4
    //         iget-boolean v2, p0, Lcom/google/android/gms/fitness/data/RawDataSet;->SF:Z
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IZ)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
