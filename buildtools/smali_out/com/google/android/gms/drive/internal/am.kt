package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class am: android.os.Parcelable.Creator {
    public constructor()

    public fun ao(p0: android.os.Parcel): com.google.android.gms.drive.internal.OnEventResponse { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/drive/internal/OnEventResponse;") }
    /*
    //         .locals 8
    //         const/4 v1, 0x0
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v5
    //         move-object v2, v1
    //         move v4, v3
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v0
    //         if-ge v0, v5, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v6
    //         packed-switch v6, :pswitch_data_0
    //         :pswitch_0
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         move-object v0, v1
    //         move-object v1, v2
    //         move v2, v3
    //         move v3, v4
    //         :goto_1
    //         move v4, v3
    //         move v3, v2
    //         move-object v2, v1
    //         move-object v1, v0
    //         goto :goto_0
    //         :pswitch_1
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v0
    //         move-object v7, v1
    //         move-object v1, v2
    //         move v2, v3
    //         move v3, v0
    //         move-object v0, v7
    //         goto :goto_1
    //         :pswitch_2
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v0
    //         move v3, v4
    //         move-object v7, v2
    //         move v2, v0
    //         move-object v0, v1
    //         move-object v1, v7
    //         goto :goto_1
    //         :pswitch_3
    //         sget-object v2, Lcom/google/android/gms/drive/events/ChangeEvent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-static {p1, v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/events/ChangeEvent;
    //         move v2, v3
    //         move v3, v4
    //         move-object v7, v1
    //         move-object v1, v0
    //         move-object v0, v7
    //         goto :goto_1
    //         :pswitch_4
    //         sget-object v1, Lcom/google/android/gms/drive/events/CompletionEvent;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->a(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/events/CompletionEvent;
    //         move-object v1, v2
    //         move v2, v3
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
    //         new-instance v0, Lcom/google/android/gms/drive/internal/OnEventResponse;
    //         invoke-direct {v0, v4, v3, v2, v1}, Lcom/google/android/gms/drive/internal/OnEventResponse;-><init>(IILcom/google/android/gms/drive/events/ChangeEvent;Lcom/google/android/gms/drive/events/CompletionEvent;)V
    //         return-object v0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_0
    //             :pswitch_4
    //         .end packed-switch
    */

    public fun bA(p0: Int): Array<com.google.android.gms.drive.internal.OnEventResponse> { return TODO("body: (I)[Lcom/google/android/gms/drive/internal/OnEventResponse;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/drive/internal/OnEventResponse;
    //         return-object v0
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/am;->ao(Landroid/os/Parcel;)Lcom/google/android/gms/drive/internal/OnEventResponse;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/am;->bA(I)[Lcom/google/android/gms/drive/internal/OnEventResponse;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.drive.internal.OnEventResponse, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/drive/internal/OnEventResponse;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->BR:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         iget v2, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->Oa:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->Ps:Lcom/google/android/gms/drive/events/ChangeEvent;
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         const/4 v1, 0x5
    //         iget-object v2, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->Pt:Lcom/google/android/gms/drive/events/CompletionEvent;
    //         invoke-static {p1, v1, v2, p2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
