package com.google.android.gms.wallet

// Auto-emitted from smali.
// 5 fields, 8 methods.

class OfferWalletObject: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var atD: String
    var atE: com.google.android.gms.wallet.wobs.CommonWalletObject
    var fl: String

    constructor()

    constructor(versionCode: Int, id: String, redemptionCode: String, commonWalletObject: com.google.android.gms.wallet.wobs.CommonWalletObject)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/OfferWalletObject;->atE:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;
    //         invoke-virtual {v0}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getRedemptionCode(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/OfferWalletObject;->atD:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/OfferWalletObject;->BR:I
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/n;->a(Lcom/google/android/gms/wallet/OfferWalletObject;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
