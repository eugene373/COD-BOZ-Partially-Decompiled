package com.google.android.gms.wallet

// Auto-emitted from smali.
// 16 fields, 21 methods.

class MaskedWalletRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var asC: String
    var asL: com.google.android.gms.wallet.Cart
    var asw: String
    var atp: Boolean
    var atq: Boolean
    var atr: Boolean
    var ats: String
    var att: String
    var atu: Boolean
    var atv: Boolean
    var atw: Array<com.google.android.gms.wallet.CountrySpecification>
    var atx: Boolean
    var aty: Boolean
    var atz: java.util.ArrayList

    constructor()

    constructor(versionCode: Int, merchantTransactionId: String, phoneNumberRequired: Boolean, shippingAddressRequired: Boolean, useMinimalBillingAddress: Boolean, estimatedTotalPrice: String, currencyCode: String, merchantName: String, cart: com.google.android.gms.wallet.Cart, shouldRetrieveWalletObjects: Boolean, isBillingAgreement: Boolean, allowedShippingCountrySpecifications: Array<com.google.android.gms.wallet.CountrySpecification>, allowPrepaidCard: Boolean, allowDebitCard: Boolean, p14: java.util.ArrayList)

    public fun allowDebitCard(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->aty:Z
    //         return v0
    */

    public fun allowPrepaidCard(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atx:Z
    //         return v0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAllowedCountrySpecificationsForShipping(): java.util.ArrayList { return TODO("body: ()Ljava/util/ArrayList;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/identity/intents/model/CountrySpecification;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atz:Ljava/util/ArrayList;
    //         return-object v0
    */

    public fun getAllowedShippingCountrySpecifications(): Array<com.google.android.gms.wallet.CountrySpecification> { return TODO("body: ()[Lcom/google/android/gms/wallet/CountrySpecification;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atw:[Lcom/google/android/gms/wallet/CountrySpecification;
    //         return-object v0
    */

    public fun getCart(): com.google.android.gms.wallet.Cart { return TODO("body: ()Lcom/google/android/gms/wallet/Cart;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->asL:Lcom/google/android/gms/wallet/Cart;
    //         return-object v0
    */

    public fun getCurrencyCode(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->asw:Ljava/lang/String;
    //         return-object v0
    */

    public fun getEstimatedTotalPrice(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->ats:Ljava/lang/String;
    //         return-object v0
    */

    public fun getMerchantName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->att:Ljava/lang/String;
    //         return-object v0
    */

    public fun getMerchantTransactionId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->asC:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->BR:I
    //         return v0
    */

    public fun isBillingAgreement(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atv:Z
    //         return v0
    */

    public fun isPhoneNumberRequired(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atp:Z
    //         return v0
    */

    public fun isShippingAddressRequired(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atq:Z
    //         return v0
    */

    public fun shouldRetrieveWalletObjects(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atu:Z
    //         return v0
    */

    public fun useMinimalBillingAddress(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->atr:Z
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/l;->a(Lcom/google/android/gms/wallet/MaskedWalletRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun newBuilder(): com.google.android.gms.wallet.MaskedWalletRequest.Builder { return TODO("body: ()Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    //         new-instance v1, Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         invoke-direct {v1}, Lcom/google/android/gms/wallet/MaskedWalletRequest;-><init>()V
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;-><init>(Lcom/google/android/gms/wallet/MaskedWalletRequest;Lcom/google/android/gms/wallet/MaskedWalletRequest$1;)V
    //         return-object v0
    */

    }
}
