package com.google.android.gms.wallet

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class o: android.os.Parcelable.Creator {
    public constructor()

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wallet/o;->dA(Landroid/os/Parcel;)Lcom/google/android/gms/wallet/ProxyCard;
    //         move-result-object v0
    //         return-object v0
    */

    public fun dA(p0: android.os.Parcel): com.google.android.gms.wallet.ProxyCard { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/wallet/ProxyCard;") }
    /*
    //         .locals 8
    //         const/4 v3, 0x0
    //         const/4 v5, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v0
    //         move v4, v5
    //         move-object v2, v3
    //         move v1, v5
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v6
    //         if-ge v6, v0, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v6
    //         invoke-static {v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v7
    //         packed-switch v7, :pswitch_data_0
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :pswitch_0
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v1
    //         goto :goto_0
    //         :pswitch_1
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v2
    //         goto :goto_0
    //         :pswitch_2
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v3
    //         goto :goto_0
    //         :pswitch_3
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v4
    //         goto :goto_0
    //         :pswitch_4
    //         invoke-static {p1, v6}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
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
    //         new-instance v0, Lcom/google/android/gms/wallet/ProxyCard;
    //         invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/wallet/ProxyCard;-><init>(ILjava/lang/String;Ljava/lang/String;II)V
    //         return-object v0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //         .end packed-switch
    */

    public fun fB(p0: Int): Array<com.google.android.gms.wallet.ProxyCard> { return TODO("body: (I)[Lcom/google/android/gms/wallet/ProxyCard;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/wallet/ProxyCard;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wallet/o;->fB(I)[Lcom/google/android/gms/wallet/ProxyCard;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.wallet.ProxyCard, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/wallet/ProxyCard;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         invoke-virtual {p0}, Lcom/google/android/gms/wallet/ProxyCard;->getVersionCode()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/ProxyCard;->atF:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/ProxyCard;->atG:Ljava/lang/String;
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x4
    //         iget v2, p0, Lcom/google/android/gms/wallet/ProxyCard;->atH:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x5
    //         iget v2, p0, Lcom/google/android/gms/wallet/ProxyCard;->atI:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
