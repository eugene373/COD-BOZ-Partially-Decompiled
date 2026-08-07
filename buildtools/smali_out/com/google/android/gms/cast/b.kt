package com.google.android.gms.cast

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class b: android.os.Parcelable.Creator {
    public constructor()

    public fun Y(p0: Int): Array<com.google.android.gms.cast.CastDevice> { return TODO("body: (I)[Lcom/google/android/gms/cast/CastDevice;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/cast/CastDevice;
    //         return-object v0
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/b;->u(Landroid/os/Parcel;)Lcom/google/android/gms/cast/CastDevice;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/b;->Y(I)[Lcom/google/android/gms/cast/CastDevice;
    //         move-result-object v0
    //         return-object v0
    */

    public fun u(p0: android.os.Parcel): com.google.android.gms.cast.CastDevice { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/cast/CastDevice;") }
    /*
    //         .locals 13
    //         const/4 v10, 0x0
    //         const/4 v8, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v0
    //         move v9, v10
    //         move v7, v10
    //         move-object v6, v8
    //         move-object v5, v8
    //         move-object v4, v8
    //         move-object v3, v8
    //         move-object v2, v8
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
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v2
    //         goto :goto_0
    //         :pswitch_2
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v3
    //         goto :goto_0
    //         :pswitch_3
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v4
    //         goto :goto_0
    //         :pswitch_4
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v5
    //         goto :goto_0
    //         :pswitch_5
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v6
    //         goto :goto_0
    //         :pswitch_6
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v7
    //         goto :goto_0
    //         :pswitch_7
    //         sget-object v8, Lcom/google/android/gms/common/images/WebImage;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-static {p1, v11, v8}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v8
    //         goto :goto_0
    //         :pswitch_8
    //         invoke-static {p1, v11}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v9
    //         goto :goto_0
    //         :pswitch_9
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
    //         new-instance v0, Lcom/google/android/gms/cast/CastDevice;
    //         invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/cast/CastDevice;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;II)V
    //         return-object v0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //             :pswitch_6
    //             :pswitch_7
    //             :pswitch_8
    //             :pswitch_9
    //         .end packed-switch
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.cast.CastDevice, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/cast/CastDevice;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/CastDevice;->getVersionCode()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/CastDevice;->getDeviceId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/cast/CastDevice;->ES:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x4
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/CastDevice;->getFriendlyName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x5
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/CastDevice;->getModelName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x6
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/CastDevice;->getDeviceVersion()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x7
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/CastDevice;->getServicePort()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/16 v1, 0x8
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/CastDevice;->getIcons()Ljava/util/List;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/16 v1, 0x9
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/CastDevice;->getCapabilities()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/16 v1, 0xa
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/CastDevice;->getStatus()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
