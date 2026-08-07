package com.google.android.gms.wallet

// Auto-emitted from smali.
// 13 fields, 19 methods.

class MaskedWallet: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var asB: String
    var asC: String
    var asE: String
    var asF: com.google.android.gms.wallet.Address
    var asG: com.google.android.gms.wallet.Address
    var asH: Array<String>
    var asI: com.google.android.gms.identity.intents.model.UserAddress
    var asJ: com.google.android.gms.identity.intents.model.UserAddress
    var asK: Array<com.google.android.gms.wallet.InstrumentInfo>
    var atm: Array<com.google.android.gms.wallet.LoyaltyWalletObject>
    var atn: Array<com.google.android.gms.wallet.OfferWalletObject>

    private constructor()

    constructor(versionCode: Int, googleTransactionId: String, merchantTransactionId: String, paymentDescriptions: Array<String>, email: String, billingAddress: com.google.android.gms.wallet.Address, shippingAddress: com.google.android.gms.wallet.Address, loyaltyWalletObjects: Array<com.google.android.gms.wallet.LoyaltyWalletObject>, offerWalletObjects: Array<com.google.android.gms.wallet.OfferWalletObject>, buyerBillingAddress: com.google.android.gms.identity.intents.model.UserAddress, buyerShippingAddress: com.google.android.gms.identity.intents.model.UserAddress, instrumentInfos: Array<com.google.android.gms.wallet.InstrumentInfo>)

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
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->asF:Lcom/google/android/gms/wallet/Address;
    //         return-object v0
    */

    public fun getBuyerBillingAddress(): com.google.android.gms.identity.intents.model.UserAddress { return TODO("body: ()Lcom/google/android/gms/identity/intents/model/UserAddress;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->asI:Lcom/google/android/gms/identity/intents/model/UserAddress;
    //         return-object v0
    */

    public fun getBuyerShippingAddress(): com.google.android.gms.identity.intents.model.UserAddress { return TODO("body: ()Lcom/google/android/gms/identity/intents/model/UserAddress;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->asJ:Lcom/google/android/gms/identity/intents/model/UserAddress;
    //         return-object v0
    */

    public fun getEmail(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->asE:Ljava/lang/String;
    //         return-object v0
    */

    public fun getGoogleTransactionId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->asB:Ljava/lang/String;
    //         return-object v0
    */

    public fun getInstrumentInfos(): Array<com.google.android.gms.wallet.InstrumentInfo> { return TODO("body: ()[Lcom/google/android/gms/wallet/InstrumentInfo;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->asK:[Lcom/google/android/gms/wallet/InstrumentInfo;
    //         return-object v0
    */

    public fun getLoyaltyWalletObjects(): Array<com.google.android.gms.wallet.LoyaltyWalletObject> { return TODO("body: ()[Lcom/google/android/gms/wallet/LoyaltyWalletObject;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->atm:[Lcom/google/android/gms/wallet/LoyaltyWalletObject;
    //         return-object v0
    */

    public fun getMerchantTransactionId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->asC:Ljava/lang/String;
    //         return-object v0
    */

    public fun getOfferWalletObjects(): Array<com.google.android.gms.wallet.OfferWalletObject> { return TODO("body: ()[Lcom/google/android/gms/wallet/OfferWalletObject;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->atn:[Lcom/google/android/gms/wallet/OfferWalletObject;
    //         return-object v0
    */

    public fun getPaymentDescriptions(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->asH:[Ljava/lang/String;
    //         return-object v0
    */

    public fun getShippingAddress(): com.google.android.gms.wallet.Address { return TODO("body: ()Lcom/google/android/gms/wallet/Address;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->asG:Lcom/google/android/gms/wallet/Address;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/MaskedWallet;->BR:I
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/k;->a(Lcom/google/android/gms/wallet/MaskedWallet;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun newBuilderFrom(maskedWallet: com.google.android.gms.wallet.MaskedWallet): com.google.android.gms.wallet.MaskedWallet.Builder { return TODO("body: (Lcom/google/android/gms/wallet/MaskedWallet;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-static {}, Lcom/google/android/gms/wallet/MaskedWallet;->pM()Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getGoogleTransactionId()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setGoogleTransactionId(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getMerchantTransactionId()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setMerchantTransactionId(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getPaymentDescriptions()[Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setPaymentDescriptions([Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getInstrumentInfos()[Lcom/google/android/gms/wallet/InstrumentInfo;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setInstrumentInfos([Lcom/google/android/gms/wallet/InstrumentInfo;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getEmail()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setEmail(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getLoyaltyWalletObjects()[Lcom/google/android/gms/wallet/LoyaltyWalletObject;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setLoyaltyWalletObjects([Lcom/google/android/gms/wallet/LoyaltyWalletObject;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getOfferWalletObjects()[Lcom/google/android/gms/wallet/OfferWalletObject;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setOfferWalletObjects([Lcom/google/android/gms/wallet/OfferWalletObject;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getBuyerBillingAddress()Lcom/google/android/gms/identity/intents/model/UserAddress;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setBuyerBillingAddress(Lcom/google/android/gms/identity/intents/model/UserAddress;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wallet/MaskedWallet;->getBuyerShippingAddress()Lcom/google/android/gms/identity/intents/model/UserAddress;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->setBuyerShippingAddress(Lcom/google/android/gms/identity/intents/model/UserAddress;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun pM(): com.google.android.gms.wallet.MaskedWallet.Builder { return TODO("body: ()Lcom/google/android/gms/wallet/MaskedWallet$Builder;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;
    //         new-instance v1, Lcom/google/android/gms/wallet/MaskedWallet;
    //         invoke-direct {v1}, Lcom/google/android/gms/wallet/MaskedWallet;-><init>()V
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/MaskedWallet$Builder;-><init>(Lcom/google/android/gms/wallet/MaskedWallet;Lcom/google/android/gms/wallet/MaskedWallet$1;)V
    //         return-object v0
    */

    }
}
