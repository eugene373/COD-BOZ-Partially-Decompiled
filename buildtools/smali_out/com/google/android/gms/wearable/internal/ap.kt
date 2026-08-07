package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class ap: android.os.Parcelable.Creator {
    public constructor()

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ap;->ef(Landroid/os/Parcel;)Lcom/google/android/gms/wearable/internal/ao;
    //         move-result-object v0
    //         return-object v0
    */

    public fun ef(p0: android.os.Parcel): com.google.android.gms.wearable.internal.ao { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/wearable/internal/ao;") }
    /*
    //         .locals 6
    //         const/4 v1, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v3
    //         const/4 v0, 0x0
    //         move v2, v1
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v4
    //         if-ge v4, v3, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v4
    //         invoke-static {v4}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v5
    //         packed-switch v5, :pswitch_data_0
    //         invoke-static {p1, v4}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :pswitch_0
    //         invoke-static {p1, v4}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v2
    //         goto :goto_0
    //         :pswitch_1
    //         invoke-static {p1, v4}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v1
    //         goto :goto_0
    //         :pswitch_2
    //         sget-object v0, Lcom/google/android/gms/wearable/internal/m;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-static {p1, v4, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/m;
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v4
    //         if-eq v4, v3, :cond_1
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
    //         new-instance v3, Lcom/google/android/gms/wearable/internal/ao;
    //         invoke-direct {v3, v2, v1, v0}, Lcom/google/android/gms/wearable/internal/ao;-><init>(IILcom/google/android/gms/wearable/internal/m;)V
    //         return-object v3
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun gi(p0: Int): Array<com.google.android.gms.wearable.internal.ao> { return TODO("body: (I)[Lcom/google/android/gms/wearable/internal/ao;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/wearable/internal/ao;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ap;->gi(I)[Lcom/google/android/gms/wearable/internal/ao;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.wearable.internal.ao, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/wearable/internal/ao;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/wearable/internal/ao;->versionCode:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         iget v2, p0, Lcom/google/android/gms/wearable/internal/ao;->statusCode:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/internal/ao;->avA:Lcom/google/android/gms/wearable/internal/m;
    //         const/4 v3, 0x0
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
