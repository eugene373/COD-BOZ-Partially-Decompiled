package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 5 methods.

class x: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public val lX: Boolean
    public val mh: Boolean
    public val versionCode: Int

    constructor(p0: Int, p1: Boolean, p2: Boolean)

    public constructor(p0: Boolean, p1: Boolean)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/y;->a(Lcom/google/android/gms/internal/x;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.y = null!!
    }
}
