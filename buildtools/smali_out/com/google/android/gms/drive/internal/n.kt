package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class n: android.os.Parcelable.Creator {
    public constructor()

    public fun af(p0: android.os.Parcel): com.google.android.gms.drive.internal.DisconnectRequest { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/drive/internal/DisconnectRequest;") }
    /*
    //         .locals 4
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v1
    //         const/4 v0, 0x0
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-ge v2, v1, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v2
    //         invoke-static {v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v3
    //         packed-switch v3, :pswitch_data_0
    //         invoke-static {p1, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :pswitch_0
    //         invoke-static {p1, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v0
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v2
    //         if-eq v2, v1, :cond_1
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
    //         new-instance v1, Lcom/google/android/gms/drive/internal/DisconnectRequest;
    //         invoke-direct {v1, v0}, Lcom/google/android/gms/drive/internal/DisconnectRequest;-><init>(I)V
    //         return-object v1
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //         .end packed-switch
    */

    public fun bp(p0: Int): Array<com.google.android.gms.drive.internal.DisconnectRequest> { return TODO("body: (I)[Lcom/google/android/gms/drive/internal/DisconnectRequest;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/drive/internal/DisconnectRequest;
    //         return-object v0
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/n;->af(Landroid/os/Parcel;)Lcom/google/android/gms/drive/internal/DisconnectRequest;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/n;->bp(I)[Lcom/google/android/gms/drive/internal/DisconnectRequest;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.drive.internal.DisconnectRequest, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/drive/internal/DisconnectRequest;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 3
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/drive/internal/DisconnectRequest;->BR:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
