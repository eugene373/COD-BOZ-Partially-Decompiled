package com.google.android.gms.location

// Auto-emitted from smali.
// 1 fields, 6 methods.

open class ActivityRecognitionResultCreator: android.os.Parcelable.Creator {
    public constructor()

    public fun createFromParcel(parcel: android.os.Parcel): com.google.android.gms.location.ActivityRecognitionResult { return TODO("body: (Landroid/os/Parcel;)Lcom/google/android/gms/location/ActivityRecognitionResult;") }
    /*
    //         .locals 9
    //         const-wide/16 v6, 0x0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->C(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v2, 0x0
    //         const/4 v3, 0x0
    //         move-wide v4, v6
    //         :goto_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v1
    //         if-ge v1, v0, :cond_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/a;->B(Landroid/os/Parcel;)I
    //         move-result v1
    //         invoke-static {v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->aD(I)I
    //         move-result v8
    //         sparse-switch v8, :sswitch_data_0
    //         invoke-static {p1, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->b(Landroid/os/Parcel;I)V
    //         goto :goto_0
    //         :sswitch_0
    //         sget-object v3, Lcom/google/android/gms/location/DetectedActivity;->CREATOR:Lcom/google/android/gms/location/DetectedActivityCreator;
    //         invoke-static {p1, v1, v3}, Lcom/google/android/gms/common/internal/safeparcel/a;->c(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //         move-result-object v3
    //         goto :goto_0
    //         :sswitch_1
    //         invoke-static {p1, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->g(Landroid/os/Parcel;I)I
    //         move-result v2
    //         goto :goto_0
    //         :sswitch_2
    //         invoke-static {p1, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->i(Landroid/os/Parcel;I)J
    //         move-result-wide v4
    //         goto :goto_0
    //         :sswitch_3
    //         invoke-static {p1, v1}, Lcom/google/android/gms/common/internal/safeparcel/a;->i(Landroid/os/Parcel;I)J
    //         move-result-wide v6
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
    //         move-result v1
    //         if-eq v1, v0, :cond_1
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
    //         new-instance v1, Lcom/google/android/gms/location/ActivityRecognitionResult;
    //         invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/location/ActivityRecognitionResult;-><init>(ILjava/util/List;JJ)V
    //         return-object v1
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x1 -> :sswitch_0
    //             0x2 -> :sswitch_2
    //             0x3 -> :sswitch_3
    //             0x3e8 -> :sswitch_1
    //         .end sparse-switch
    */

    public fun createFromParcel(x0: android.os.Parcel): Object { return TODO("body: (Landroid/os/Parcel;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/location/ActivityRecognitionResultCreator;->createFromParcel(Landroid/os/Parcel;)Lcom/google/android/gms/location/ActivityRecognitionResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newArray(size: Int): Array<com.google.android.gms.location.ActivityRecognitionResult> { return TODO("body: (I)[Lcom/google/android/gms/location/ActivityRecognitionResult;") }
    /*
    //         .locals 1
    //         new-array v0, p1, [Lcom/google/android/gms/location/ActivityRecognitionResult;
    //         return-object v0
    */

    public fun newArray(x0: Int): Array<Object> { return TODO("body: (I)[Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/location/ActivityRecognitionResultCreator;->newArray(I)[Lcom/google/android/gms/location/ActivityRecognitionResult;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmField public val CONTENT_DESCRIPTION: Int = 0

    @JvmStatic fun a(p0: com.google.android.gms.location.ActivityRecognitionResult, p1: android.os.Parcel, p2: Int) { /* TODO(body): (Lcom/google/android/gms/location/ActivityRecognitionResult;Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 4
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/b;->D(Landroid/os/Parcel;)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->aeb:Ljava/util/List;
    //         const/4 v3, 0x0
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;ILjava/util/List;Z)V
    //         const/16 v1, 0x3e8
    //         invoke-virtual {p0}, Lcom/google/android/gms/location/ActivityRecognitionResult;->getVersionCode()I
    //         move-result v2
    //         invoke-static {p1, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/b;->c(Landroid/os/Parcel;II)V
    //         const/4 v1, 0x2
    //         iget-wide v2, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->aec:J
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IJ)V
    //         const/4 v1, 0x3
    //         iget-wide v2, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->aed:J
    //         invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/b;->a(Landroid/os/Parcel;IJ)V
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/b;->H(Landroid/os/Parcel;I)V
    //         return-void
    */

    }
}
