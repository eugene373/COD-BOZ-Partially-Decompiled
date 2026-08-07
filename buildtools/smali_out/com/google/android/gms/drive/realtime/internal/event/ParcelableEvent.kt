package com.google.android.gms.drive.realtime.internal.event

// Auto-emitted from smali.
// 16 fields, 4 methods.

open class ParcelableEvent: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val RA: com.google.android.gms.drive.realtime.internal.event.ValuesSetDetails
    val RB: com.google.android.gms.drive.realtime.internal.event.ValueChangedDetails
    val RC: com.google.android.gms.drive.realtime.internal.event.ReferenceShiftedDetails
    val RD: com.google.android.gms.drive.realtime.internal.event.ObjectChangedDetails
    val Rm: String
    val Rp: String
    val Rt: java.util.List
    val Ru: Boolean
    val Rv: String
    val Rw: com.google.android.gms.drive.realtime.internal.event.TextInsertedDetails
    val Rx: com.google.android.gms.drive.realtime.internal.event.TextDeletedDetails
    val Ry: com.google.android.gms.drive.realtime.internal.event.ValuesAddedDetails
    val Rz: com.google.android.gms.drive.realtime.internal.event.ValuesRemovedDetails
    val vL: String

    constructor(versionCode: Int, sessionId: String, userId: String, isLocal: java.util.List, objectId: Boolean, objectType: String, textInsertedDetails: String, textDeletedDetails: com.google.android.gms.drive.realtime.internal.event.TextInsertedDetails, valuesAddedDetails: com.google.android.gms.drive.realtime.internal.event.TextDeletedDetails, valuesRemovedDetails: com.google.android.gms.drive.realtime.internal.event.ValuesAddedDetails, valuesSetDetails: com.google.android.gms.drive.realtime.internal.event.ValuesRemovedDetails, valueChangedDetails: com.google.android.gms.drive.realtime.internal.event.ValuesSetDetails, referenceShiftedDetails: com.google.android.gms.drive.realtime.internal.event.ValueChangedDetails, objectChangedDetails: com.google.android.gms.drive.realtime.internal.event.ReferenceShiftedDetails, p14: com.google.android.gms.drive.realtime.internal.event.ObjectChangedDetails)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/realtime/internal/event/b;->a(Lcom/google/android/gms/drive/realtime/internal/event/ParcelableEvent;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
