package com.google.android.gms.common.images

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class b: android.os.Parcelable.Creator {
    public constructor()

    public fun A(p0: android.os.Parcel): com.google.android.gms.common.images.WebImage { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/common/images/WebImage;") }
    /*
    //         .locals 8
    //         const/4 v1, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v5
    //         const/4 v3, 0x0
    //         move v2, v1
    //         move v4, v1
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-ge v0, v5, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v6
    //         packed-switch v6, :pswitch_data_0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         move v0, v1
    //         move v1, v2
    //         move-object v2, v3
    //         move v3, v4
    //         :goto_1
    //         move v4, v3
    //         move-object v3, v2
    //         move v2, v1
    //         move v1, v0
    //         goto :goto_0
    //         :pswitch_0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v0
    //         move v7, v1
    //         move v1, v2
    //         move-object v2, v3
    //         move v3, v0
    //         move v0, v7
    //         goto :goto_1
    //         :pswitch_1
    //         sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-static {p1, v0, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/Uri;
    //         move v3, v4
    //         move v7, v2
    //         move-object v2, v0
    //         move v0, v1
    //         move v1, v7
    //         goto :goto_1
    //         :pswitch_2
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v0
    //         move-object v2, v3
    //         move v3, v4
    //         move v7, v1
    //         move v1, v0
    //         move v0, v7
    //         goto :goto_1
    //         :pswitch_3
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v0
    //         move v1, v2
    //         move-object v2, v3
    //         move v3, v4
    //         goto :goto_1
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-eq v0, v5, :cond_1
    //         new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Overread allowed size end="
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p1}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/common/images/WebImage;
    //         invoke-direct {v0, v4, v3, v2, v1}, Lcom/google/android/gms/common/images/WebImage;-><init>(ILandroid/net/Uri;II)V
    //         return-object v0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //         .end packed-switch
    */

    public fun ax(p0: Int): Array<com.google.android.gms.common.images.WebImage> { return TODO("body: (I)[Lcom/google/android/gms/common/images/WebImage;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/common/images/WebImage;
    //         return-object v0
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/common/images/b;->A(Landroid/os/Parcel;)Lcom/google/android/gms/common/images/WebImage;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/common/images/b;->ax(I)[Lcom/google/android/gms/common/images/WebImage;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.common.images.WebImage, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/common/images/WebImage;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/images/WebImage;->getVersionCode()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/images/WebImage;->getUrl()Landroid/net/Uri;
    //         move-result-object v2
    //         const/4 v3, 0x0
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         const/4 v1, 0x3
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/images/WebImage;->getWidth()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x4
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/images/WebImage;->getHeight()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
