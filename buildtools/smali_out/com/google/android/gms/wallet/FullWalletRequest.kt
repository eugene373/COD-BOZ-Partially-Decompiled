package com.google.android.gms.wallet

// Auto-emitted from smali.
// 5 fields, 10 methods.

class FullWalletRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var asB: String
    var asC: String
    var asL: com.google.android.gms.wallet.Cart

    constructor()

    constructor(versionCode: Int, googleTransactionId: String, merchantTransactionId: String, cart: com.google.android.gms.wallet.Cart)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getCart(): com.google.android.gms.wallet.Cart { return TODO("body: ()Lcom/google/android/gms/wallet/Cart;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/FullWalletRequest;->asL:Lcom/google/android/gms/wallet/Cart;
    //         return-object v0
    */

    public fun getGoogleTransactionId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/FullWalletRequest;->asB:Ljava/lang/String;
    //         return-object v0
    */

    public fun getMerchantTransactionId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/FullWalletRequest;->asC:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/FullWalletRequest;->BR:I
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/g;->a(Lcom/google/android/gms/wallet/FullWalletRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun newBuilder(): com.google.android.gms.wallet.FullWalletRequest.Builder { return TODO("body: ()Lcom/google/android/gms/wallet/FullWalletRequest$Builder;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/wallet/FullWalletRequest$Builder;
    //         new-instance v1, Lcom/google/android/gms/wallet/FullWalletRequest;
    //         invoke-direct {v1}, Lcom/google/android/gms/wallet/FullWalletRequest;-><init>()V
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/FullWalletRequest$Builder;-><init>(Lcom/google/android/gms/wallet/FullWalletRequest;Lcom/google/android/gms/wallet/FullWalletRequest$1;)V
    //         return-object v0
    */

    }
}
