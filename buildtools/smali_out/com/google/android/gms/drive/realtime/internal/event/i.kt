package com.google.android.gms.drive.realtime.internal.event

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class i: android.os.Parcelable.Creator {
    public constructor()

    public fun bg(p0: android.os.Parcel): com.google.android.gms.drive.realtime.internal.event.ValuesRemovedDetails { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;") }
    /*
    //         .locals 9
    //         const/4 v6, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v5, 0x0
    //         move v4, v6
    //         move v3, v6
    //         move v2, v6
    //         move v1, v6
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v7
    //         if-ge v7, v0, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v7
    //         invoke-static {v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v8
    //         packed-switch v8, :pswitch_data_0
    //         invoke-static {p1, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :pswitch_0
    //         invoke-static {p1, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v1
    //         goto :goto_0
    //         :pswitch_1
    //         invoke-static {p1, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v2
    //         goto :goto_0
    //         :pswitch_2
    //         invoke-static {p1, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v3
    //         goto :goto_0
    //         :pswitch_3
    //         invoke-static {p1, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v4
    //         goto :goto_0
    //         :pswitch_4
    //         invoke-static {p1, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->o(Landroid/os/Parcel;I)Ljava/lang/String;
    //         move-result-object v5
    //         goto :goto_0
    //         :pswitch_5
    //         invoke-static {p1, v7}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v6
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v7
    //         if-eq v7, v0, :cond_1
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
    //         new-instance v0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;-><init>(IIIILjava/lang/String;I)V
    //         return-object v0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //         .end packed-switch
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/realtime/internal/event/i;->bg(Landroid/os/Parcel;)Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;
    //         move-result-object v0
    //         return-object v0
    */

    public fun ct(p0: Int): Array<com.google.android.gms.drive.realtime.internal.event.ValuesRemovedDetails> { return TODO("body: (I)[Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/realtime/internal/event/i;->ct(I)[Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.drive.realtime.internal.event.ValuesRemovedDetails, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;->BR:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         iget v2, p0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;->mIndex:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x3
    //         iget v2, p0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;->Rr:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x4
    //         iget v2, p0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;->Rs:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x5
    //         iget-object v2, p0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;->RP:Ljava/lang/String;
    //         const/4 v3, 0x0
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    //         const/4 v1, 0x6
    //         iget v2, p0, Lcom/google/android/gms/drive/realtime/internal/event/ValuesRemovedDetails;->RQ:I
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
