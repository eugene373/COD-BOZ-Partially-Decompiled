package com.google.android.gms.wallet

// Auto-emitted from smali.
// 6 fields, 9 methods.

class ProxyCard: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var atF: String
    var atG: String
    var atH: Int
    var atI: Int

    constructor(versionCode: Int, pan: String, cvn: String, expirationMonth: Int, expirationYear: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getCvn(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/ProxyCard;->atG:Ljava/lang/String;
    //         return-object v0
    */

    public fun getExpirationMonth(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/ProxyCard;->atH:I
    //         return v0
    */

    public fun getExpirationYear(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/ProxyCard;->atI:I
    //         return v0
    */

    public fun getPan(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/ProxyCard;->atF:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/ProxyCard;->BR:I
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/o;->a(Lcom/google/android/gms/wallet/ProxyCard;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
