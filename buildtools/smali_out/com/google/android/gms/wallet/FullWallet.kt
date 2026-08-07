package com.google.android.gms.wallet

// Auto-emitted from smali.
// 12 fields, 16 methods.

class FullWallet: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var asB: String
    var asC: String
    var asD: com.google.android.gms.wallet.ProxyCard
    var asE: String
    var asF: com.google.android.gms.wallet.Address
    var asG: com.google.android.gms.wallet.Address
    var asH: Array<String>
    var asI: com.google.android.gms.identity.intents.model.UserAddress
    var asJ: com.google.android.gms.identity.intents.model.UserAddress
    var asK: Array<com.google.android.gms.wallet.InstrumentInfo>

    private constructor()

    constructor(versionCode: Int, googleTransactionId: String, merchantTransactionId: String, proxyCard: com.google.android.gms.wallet.ProxyCard, email: String, billingAddress: com.google.android.gms.wallet.Address, shippingAddress: com.google.android.gms.wallet.Address, paymentDescriptions: Array<String>, buyerBillingAddress: com.google.android.gms.identity.intents.model.UserAddress, buyerShippingAddress: com.google.android.gms.identity.intents.model.UserAddress, instrumentInfos: Array<com.google.android.gms.wallet.InstrumentInfo>)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getBillingAddress(): com.google.android.gms.wallet.Address { return TODO("body: ()Lcom/google/android/gms/wallet/Address;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/FullWallet;->asF:Lcom/google/android/gms/wallet/Address;
    //         return-object v0
    */

    public fun getBuyerBillingAddress(): com.google.android.gms.identity.intents.model.UserAddress { return TODO("body: ()Lcom/google/android/gms/identity/intents/model/UserAddress;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/FullWallet;->asI:Lcom/google/android/gms/identity/intents/model/UserAddress;
    //         return-object v0
    */

    public fun getBuyerShippingAddress(): com.google.android.gms.identity.intents.model.UserAddress { return TODO("body: ()Lcom/google/android/gms/identity/intents/model/UserAddress;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/FullWallet;->asJ:Lcom/google/android/gms/identity/intents/model/UserAddress;
    //         return-object v0
    */

    public fun getEmail(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/FullWallet;->asE:Ljava/lang/String;
    //         return-object v0
    */

    public fun getGoogleTransactionId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/FullWallet;->asB:Ljava/lang/String;
    //         return-object v0
    */

    public fun getInstrumentInfos(): Array<com.google.android.gms.wallet.InstrumentInfo> { return TODO("body: ()[Lcom/google/android/gms/wallet/InstrumentInfo;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/FullWallet;->asK:[Lcom/google/android/gms/wallet/InstrumentInfo;
    //         return-object v0
    */

    public fun getMerchantTransactionId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/FullWallet;->asC:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPaymentDescriptions(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/FullWallet;->asH:[Ljava/lang/String;
    //         return-object v0
    */

    public fun getProxyCard(): com.google.android.gms.wallet.ProxyCard { return TODO("body: ()Lcom/google/android/gms/wallet/ProxyCard;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/FullWallet;->asD:Lcom/google/android/gms/wallet/ProxyCard;
    //         return-object v0
    */

    public fun getShippingAddress(): com.google.android.gms.wallet.Address { return TODO("body: ()Lcom/google/android/gms/wallet/Address;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/FullWallet;->asG:Lcom/google/android/gms/wallet/Address;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/FullWallet;->BR:I
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/f;->a(Lcom/google/android/gms/wallet/FullWallet;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
