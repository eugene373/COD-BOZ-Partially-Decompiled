package com.google.android.gms.wallet

// Auto-emitted from smali.
// 1 fields, 14 methods.

class MaskedWallet_Builder {
    val ato: com.google.android.gms.wallet.MaskedWallet

    private constructor(p0: com.google.android.gms.wallet.MaskedWallet)

    constructor(x0: com.google.android.gms.wallet.MaskedWallet, x1: com.google.android.gms.wallet.MaskedWallet.1)

    public fun build(): com.google.android.gms.wallet.MaskedWallet { return TODO("body: ()Lcom/google/android/gms/wallet/MaskedWallet;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;
    //         return-object v0
    */

    public fun setBillingAddress(billingAddress: com.google.android.gms.wallet.Address): com.google.android.gms.wallet.MaskedWallet.Builder { return TODO("body: (Lcom/google/android/gms/wallet/Address;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asF:Lcom/google/android/gms/wallet/Address;
    //         return-object p0
    */

    public fun setBuyerBillingAddress(buyerBillingAddress: com.google.android.gms.identity.intents.model.UserAddress): com.google.android.gms.wallet.MaskedWallet.Builder { return TODO("body: (Lcom/google/android/gms/identity/intents/model/UserAddress;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asI:Lcom/google/android/gms/identity/intents/model/UserAddress;
    //         return-object p0
    */

    public fun setBuyerShippingAddress(buyerShippingAddress: com.google.android.gms.identity.intents.model.UserAddress): com.google.android.gms.wallet.MaskedWallet.Builder { return TODO("body: (Lcom/google/android/gms/identity/intents/model/UserAddress;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asJ:Lcom/google/android/gms/identity/intents/model/UserAddress;
    //         return-object p0
    */

    public fun setEmail(email: String): com.google.android.gms.wallet.MaskedWallet.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asE:Ljava/lang/String;
    //         return-object p0
    */

    public fun setGoogleTransactionId(googleTransactionId: String): com.google.android.gms.wallet.MaskedWallet.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asB:Ljava/lang/String;
    //         return-object p0
    */

    public fun setInstrumentInfos(instrumentInfos: Array<com.google.android.gms.wallet.InstrumentInfo>): com.google.android.gms.wallet.MaskedWallet.Builder { return TODO("body: ([Lcom/google/android/gms/wallet/InstrumentInfo;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asK:[Lcom/google/android/gms/wallet/InstrumentInfo;
    //         return-object p0
    */

    public fun setLoyaltyWalletObjects(loyaltyWalletObjects: Array<com.google.android.gms.wallet.LoyaltyWalletObject>): com.google.android.gms.wallet.MaskedWallet.Builder { return TODO("body: ([Lcom/google/android/gms/wallet/LoyaltyWalletObject;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->atm:[Lcom/google/android/gms/wallet/LoyaltyWalletObject;
    //         return-object p0
    */

    public fun setMerchantTransactionId(merchantTransactionId: String): com.google.android.gms.wallet.MaskedWallet.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asC:Ljava/lang/String;
    //         return-object p0
    */

    public fun setOfferWalletObjects(offerWalletObjects: Array<com.google.android.gms.wallet.OfferWalletObject>): com.google.android.gms.wallet.MaskedWallet.Builder { return TODO("body: ([Lcom/google/android/gms/wallet/OfferWalletObject;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->atn:[Lcom/google/android/gms/wallet/OfferWalletObject;
    //         return-object p0
    */

    public fun setPaymentDescriptions(paymentDescriptions: Array<String>): com.google.android.gms.wallet.MaskedWallet.Builder { return TODO("body: ([Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asH:[Ljava/lang/String;
    //         return-object p0
    */

    public fun setShippingAddress(shippingAddress: com.google.android.gms.wallet.Address): com.google.android.gms.wallet.MaskedWallet.Builder { return TODO("body: (Lcom/google/android/gms/wallet/Address;)Lcom/google/android/gms/wallet/MaskedWallet$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWallet$Builder;->ato:Lcom/google/android/gms/wallet/MaskedWallet;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWallet;->asG:Lcom/google/android/gms/wallet/Address;
    //         return-object p0
    */

}
