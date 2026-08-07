package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 5 fields, 4 methods.

open class am: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public val avN: Long
    public val label: String
    public val packageName: String
    public val versionCode: Int

    constructor(p0: Int, p1: String, p2: String, p3: Long)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/an;->a(Lcom/google/android/gms/wearable/internal/am;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
