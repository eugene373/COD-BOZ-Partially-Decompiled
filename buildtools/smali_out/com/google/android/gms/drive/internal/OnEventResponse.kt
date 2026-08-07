package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 5 fields, 5 methods.

open class OnEventResponse: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Oa: Int
    val Ps: com.google.android.gms.drive.events.ChangeEvent
    val Pt: com.google.android.gms.drive.events.CompletionEvent

    constructor(versionCode: Int, eventType: Int, changeEvent: com.google.android.gms.drive.events.ChangeEvent, completionEvent: com.google.android.gms.drive.events.CompletionEvent)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun ih(): com.google.android.gms.drive.events.DriveEvent { return TODO("body: ()Lcom/google/android/gms/drive/events/DriveEvent;") }
    /*
    //         .locals 3
    //         iget v0, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->Oa:I
    //         packed-switch v0, :pswitch_data_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unexpected event type "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->Oa:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :pswitch_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->Ps:Lcom/google/android/gms/drive/events/ChangeEvent;
    //         :goto_0
    //         return-object v0
    //         :pswitch_1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnEventResponse;->Pt:Lcom/google/android/gms/drive/events/CompletionEvent;
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/am;->a(Lcom/google/android/gms/drive/internal/OnEventResponse;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
