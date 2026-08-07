package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 6 methods.

class op: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var atO: Array<String>

    constructor()

    constructor(p0: Int, p1: Array<String>, p2: Array<ByteArray>)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/op;->BR:I
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/oq;->a(Lcom/google/android/gms/internal/op;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
