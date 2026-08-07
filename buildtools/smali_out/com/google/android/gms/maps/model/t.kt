package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class t: android.os.Parcelable.Creator {
    public constructor()

    public fun cT(p0: android.os.Parcel): com.google.android.gms.maps.model.StreetViewPanoramaOrientation { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;") }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v3
    //         const/4 v1, 0x0
    //         move v2, v1
    //         move v1, v0
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
    //         invoke-static {p1, v4}, Lcom/google/android/gms/common/internal/safeparcel/a;->l(Landroid/os/Parcel;I)F
    //         move-result v1
    //         goto :goto_0
    //         :pswitch_2
    //         invoke-static {p1, v4}, Lcom/google/android/gms/common/internal/safeparcel/a;->l(Landroid/os/Parcel;I)F
    //         move-result v0
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
    //         new-instance v3, Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;
    //         invoke-direct {v3, v2, v1, v0}, Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;-><init>(IFF)V
    //         return-object v3
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/maps/model/t;->cT(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;
    //         move-result-object v0
    //         return-object v0
    */

    public fun eJ(p0: Int): Array<com.google.android.gms.maps.model.StreetViewPanoramaOrientation> { return TODO("body: (I)[Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/maps/model/t;->eJ(I)[Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.maps.model.StreetViewPanoramaOrientation, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 3
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;->getVersionCode()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         iget v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;->tilt:F
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IF)V
    //         const/4 v1, 0x3
    //         iget v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;->bearing:F
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IF)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
