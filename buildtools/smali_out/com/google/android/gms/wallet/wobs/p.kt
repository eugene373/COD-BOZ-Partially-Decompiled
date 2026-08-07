package com.google.android.gms.wallet.wobs

// Auto-emitted from smali.
// 7 fields, 6 methods.

class p: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var auJ: String
    var auN: com.google.android.gms.wallet.wobs.l
    var auO: com.google.android.gms.wallet.wobs.n
    var auP: com.google.android.gms.wallet.wobs.n
    var tG: String

    constructor()

    constructor(p0: Int, p1: String, p2: String, p3: com.google.android.gms.wallet.wobs.l, p4: com.google.android.gms.wallet.wobs.n, p5: com.google.android.gms.wallet.wobs.n)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/wobs/p;->BR:I
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/wobs/q;->a(Lcom/google/android/gms/wallet/wobs/p;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
