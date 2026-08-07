package com.google.android.gms.wallet.wobs

// Auto-emitted from smali.
// 5 fields, 6 methods.

class d: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var auA: String
    var auB: java.util.ArrayList
    var auz: String

    constructor()

    constructor(p0: Int, p1: String, p2: String, p3: java.util.ArrayList)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/wobs/d;->BR:I
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/wobs/e;->a(Lcom/google/android/gms/wallet/wobs/d;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
