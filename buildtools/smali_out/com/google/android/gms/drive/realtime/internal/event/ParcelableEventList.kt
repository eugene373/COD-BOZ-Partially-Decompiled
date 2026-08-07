package com.google.android.gms.drive.realtime.internal.event

// Auto-emitted from smali.
// 6 fields, 4 methods.

open class ParcelableEventList: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val RE: com.google.android.gms.common.data.DataHolder
    val RF: Boolean
    val RG: java.util.List
    val me: java.util.List

    constructor(versionCode: Int, eventData: java.util.List, undoRedoStateChanged: com.google.android.gms.common.data.DataHolder, p3: Boolean, p4: java.util.List)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/realtime/internal/event/c;->a(Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEventList;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
