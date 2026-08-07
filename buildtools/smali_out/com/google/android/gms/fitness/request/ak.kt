package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class ak: android.os.Parcelable.Creator {
    public constructor()

    public fun bU(p0: android.os.Parcel): com.google.android.gms.fitness.request.aj { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/fitness/request/aj;") }
    /*
    //         .locals 7
    //         const/4 v1, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v4
    //         const/4 v3, 0x0
    //         move-object v2, v1
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-ge v0, v4, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v5
    //         sparse-switch v5, :sswitch_data_0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         move-object v0, v1
    //         move-object v1, v2
    //         move v2, v3
    //         :goto_1
    //         move v3, v2
    //         move-object v2, v1
    //         move-object v1, v0
    //         goto :goto_0
    //         :sswitch_0
    //         sget-object v2, Lcom/google/android/gms/fitness/data/DataType;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-static {p1, v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataType;
    //         move v2, v3
    //         move-object v6, v0
    //         move-object v0, v1
    //         move-object v1, v6
    //         goto :goto_1
    //         :sswitch_1
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v0
    //         move-object v6, v1
    //         move-object v1, v2
    //         move v2, v0
    //         move-object v0, v6
    //         goto :goto_1
    //         :sswitch_2
    //         sget-object v1, Lcom/google/android/gms/fitness/data/DataSource;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;
    //         move-object v1, v2
    //         move v2, v3
    //         goto :goto_1
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-eq v0, v4, :cond_1
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
    //         new-instance v0, Lcom/google/android/gms/fitness/request/aj;
    //         invoke-direct {v0, v3, v2, v1}, Lcom/google/android/gms/fitness/request/aj;-><init>(ILcom/google/android/gms/fitness/data/DataType;Lcom/google/android/gms/fitness/data/DataSource;)V
    //         return-object v0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_0
    //             0x2 -> :sswitch_2
    //             0x3e8 -> :sswitch_1
    //         .end sparse-switch
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/request/ak;->bU(Landroid/os/Parcel;)Lcom/google/android/gms/fitness/request/aj;
    //         move-result-object v0
    //         return-object v0
    */

    public fun dm(p0: Int): Array<com.google.android.gms.fitness.request.aj> { return TODO("body: (I)[Lcom/google/android/gms/fitness/request/aj;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/fitness/request/aj;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/request/ak;->dm(I)[Lcom/google/android/gms/fitness/request/aj;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.fitness.request.aj, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/fitness/request/aj;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/request/aj;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         const/16 v1, 0x3e8
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/request/aj;->getVersionCode()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/request/aj;->getDataSource()Lcom/google/android/gms/fitness/data/DataSource;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
