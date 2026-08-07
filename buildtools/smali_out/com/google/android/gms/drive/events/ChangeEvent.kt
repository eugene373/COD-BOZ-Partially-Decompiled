package com.google.android.gms.drive.events

// Auto-emitted from smali.
// 4 fields, 9 methods.

class ChangeEvent: com.google.android.gms.common.internal.safeparcel.SafeParcelable, com.google.android.gms.drive.events.ResourceEvent {
    val BR: Int
    val MW: com.google.android.gms.drive.DriveId
    val NM: Int

    constructor(versionCode: Int, driveId: com.google.android.gms.drive.DriveId, changeFlags: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getDriveId(): com.google.android.gms.drive.DriveId { return TODO("body: ()Lcom/google/android/gms/drive/DriveId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/events/ChangeEvent;->MW:Lcom/google/android/gms/drive/DriveId;
    //         return-object v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun hasContentChanged(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/drive/events/ChangeEvent;->NM:I
    //         and-int/lit8 v0, v0, 0x2
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun hasMetadataChanged(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/drive/events/ChangeEvent;->NM:I
    //         and-int/lit8 v0, v0, 0x1
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 5
    //         sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         const-string v1, "ChangeEvent [id=%s,changeFlags=%x]"
    //         const/4 v2, 0x2
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         iget-object v4, p0, Lcom/google/android/gms/drive/events/ChangeEvent;->MW:Lcom/google/android/gms/drive/DriveId;
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x1
    //         iget v4, p0, Lcom/google/android/gms/drive/events/ChangeEvent;->NM:I
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/events/a;->a(Lcom/google/android/gms/drive/events/ChangeEvent;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
