package com.google.android.gms.cast

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class a: android.os.Parcelable.Creator {
    public constructor()

    public fun U(p0: Int): Array<com.google.android.gms.cast.ApplicationMetadata> { return TODO("body: (I)[Lcom/google/android/gms/cast/ApplicationMetadata;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/cast/ApplicationMetadata;
    //         return-object v0
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/a;->t(Landroid/os/Parcel;)Lcom/google/android/gms/cast/ApplicationMetadata;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/a;->U(I)[Lcom/google/android/gms/cast/ApplicationMetadata;
    //         move-result-object v0
    //         return-object v0
    */

    public fun t(p0: android.os.Parcel): com.google.android.gms.cast.ApplicationMetadata { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/cast/ApplicationMetadata;") }
    /*
    //         .locals 10
    //         const/4 v7, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v8
    //         const/4 v1, 0x0
    //         move-object v6, v7
    //         move-object v5, v7
    //         move-object v4, v7
    //         move-object v3, v7
    //         move-object v2, v7
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-ge v0, v8, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v9
    //         packed-switch v9, :pswitch_data_0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :pswitch_0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v1
    //         goto :goto_0
    //         :pswitch_1
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v2
    //         goto :goto_0
    //         :pswitch_2
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v3
    //         goto :goto_0
    //         :pswitch_3
    //         sget-object v4, Lcom/google/android/gms/common/images/WebImage;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-static {p1, v0, v4}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v4
    //         goto :goto_0
    //         :pswitch_4
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;I)Ljava/util/ArrayList;
    //         move-result-object v5
    //         goto :goto_0
    //         :pswitch_5
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v6
    //         goto :goto_0
    //         :pswitch_6
    //         sget-object v7, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-static {p1, v0, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/Uri;
    //         move-object v7, v0
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-eq v0, v8, :cond_1
    //         new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/a$a;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Overread allowed size end="
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p1}, Lcom/google/android/gms/common/internal/safeparcel/a$a;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V
    //         throw v0
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/cast/ApplicationMetadata;
    //         invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/cast/ApplicationMetadata;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Landroid/net/Uri;)V
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
    //             :pswitch_6
    //         .end packed-switch
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.cast.ApplicationMetadata, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/cast/ApplicationMetadata;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/ApplicationMetadata;->getVersionCode()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/ApplicationMetadata;->getApplicationId()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x3
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/ApplicationMetadata;->getName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x4
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/ApplicationMetadata;->getImages()Ljava/util/List;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/4 v1, 0x5
    //         iget-object v2, p0, Lcom/google/android/gms/cast/ApplicationMetadata;->EB:Ljava/util/List;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->b(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/4 v1, 0x6
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/ApplicationMetadata;->getSenderAppIdentifier()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x7
    //         invoke-virtual {p0}, Lcom/google/android/gms/cast/ApplicationMetadata;->fu()Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
