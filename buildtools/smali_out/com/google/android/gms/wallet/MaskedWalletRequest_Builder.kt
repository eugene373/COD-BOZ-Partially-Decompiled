package com.google.android.gms.wallet

// Auto-emitted from smali.
// 1 fields, 17 methods.

class MaskedWalletRequest_Builder {
    val atA: com.google.android.gms.wallet.MaskedWalletRequest

    private constructor(p0: com.google.android.gms.wallet.MaskedWalletRequest)

    constructor(x0: com.google.android.gms.wallet.MaskedWalletRequest, x1: com.google.android.gms.wallet.MaskedWalletRequest.1)

    public fun addAllowedCountrySpecificationForShipping(countrySpecification: com.google.android.gms.identity.intents.model.CountrySpecification): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Lcom/google/android/gms/identity/intents/model/CountrySpecification;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atz:Ljava/util/ArrayList;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         iput-object v1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atz:Ljava/util/ArrayList;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atz:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun addAllowedCountrySpecificationsForShipping(p0: java.util.Collection): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Ljava/util/Collection;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Collection",
    //                 "<",
    //                 "Lcom/google/android/gms/identity/intents/model/CountrySpecification;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "countrySpecifications":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/android/gms/identity/intents/model/CountrySpecification;>;"
    //         if-eqz p1, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atz:Ljava/util/ArrayList;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         iput-object v1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atz:Ljava/util/ArrayList;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atz:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    //         :cond_1
    //         return-object p0
    */

    public fun build(): com.google.android.gms.wallet.MaskedWalletRequest { return TODO("body: ()Lcom/google/android/gms/wallet/MaskedWalletRequest;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         return-object v0
    */

    public fun setAllowDebitCard(allowDebitCard: Boolean): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->aty:Z
    //         return-object p0
    */

    public fun setAllowPrepaidCard(allowPrepaidCard: Boolean): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atx:Z
    //         return-object p0
    */

    public fun setCart(cart: com.google.android.gms.wallet.Cart): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Lcom/google/android/gms/wallet/Cart;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->asL:Lcom/google/android/gms/wallet/Cart;
    //         return-object p0
    */

    public fun setCurrencyCode(currencyCode: String): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->asw:Ljava/lang/String;
    //         return-object p0
    */

    public fun setEstimatedTotalPrice(estimatedTotalPrice: String): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->ats:Ljava/lang/String;
    //         return-object p0
    */

    public fun setIsBillingAgreement(isBillingAgreement: Boolean): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atv:Z
    //         return-object p0
    */

    public fun setMerchantName(merchantName: String): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->att:Ljava/lang/String;
    //         return-object p0
    */

    public fun setMerchantTransactionId(merchantTransactionId: String): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->asC:Ljava/lang/String;
    //         return-object p0
    */

    public fun setPhoneNumberRequired(phoneNumberRequired: Boolean): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atp:Z
    //         return-object p0
    */

    public fun setShippingAddressRequired(shippingAddressRequired: Boolean): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atq:Z
    //         return-object p0
    */

    public fun setShouldRetrieveWalletObjects(shouldRetrieveWalletObjects: Boolean): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atu:Z
    //         return-object p0
    */

    public fun setUseMinimalBillingAddress(useMinimalBillingAddress: Boolean): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: (Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->atA:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atr:Z
    //         return-object p0
    */

}
