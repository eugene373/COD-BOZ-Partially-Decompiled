package com.google.android.gms.wallet

// Auto-emitted from smali.
// 5 fields, 10 methods.

class Cart: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var asv: String
    var asw: String
    var asx: java.util.ArrayList

    constructor()

    constructor(versionCode: Int, totalPrice: String, currencyCode: String, p3: java.util.ArrayList)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getCurrencyCode(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Cart;->asw:Ljava/lang/String;
    //         return-object v0
    */

    public fun getLineItems(): java.util.ArrayList { return TODO("body: ()Ljava/util/ArrayList;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/google/android/gms/wallet/LineItem;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Cart;->asx:Ljava/util/ArrayList;
    //         return-object v0
    */

    public fun getTotalPrice(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Cart;->asv:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/Cart;->BR:I
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/b;->a(Lcom/google/android/gms/wallet/Cart;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun newBuilder(): com.google.android.gms.wallet.Cart.Builder { return TODO("body: ()Lcom/google/android/gms/wallet/Cart$Builder;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/wallet/Cart$Builder;
    //         new-instance v1, Lcom/google/android/gms/wallet/Cart;
    //         invoke-direct {v1}, Lcom/google/android/gms/wallet/Cart;-><init>()V
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/Cart$Builder;-><init>(Lcom/google/android/gms/wallet/Cart;Lcom/google/android/gms/wallet/Cart$1;)V
    //         return-object v0
    */

    }
}
