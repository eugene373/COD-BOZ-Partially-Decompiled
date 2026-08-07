package com.google.android.gms.wallet

// Auto-emitted from smali.
// 8 fields, 13 methods.

class LineItem: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var asP: String
    var asQ: String
    var asR: Int
    var asv: String
    var asw: String
    var description: String

    constructor()

    constructor(versionCode: Int, description: String, quantity: String, unitPrice: String, totalPrice: String, role: Int, currencyCode: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getCurrencyCode(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/LineItem;->asw:Ljava/lang/String;
    //         return-object v0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/LineItem;->description:Ljava/lang/String;
    //         return-object v0
    */

    public fun getQuantity(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/LineItem;->asP:Ljava/lang/String;
    //         return-object v0
    */

    public fun getRole(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/LineItem;->asR:I
    //         return v0
    */

    public fun getTotalPrice(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/LineItem;->asv:Ljava/lang/String;
    //         return-object v0
    */

    public fun getUnitPrice(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/LineItem;->asQ:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/LineItem;->BR:I
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/i;->a(Lcom/google/android/gms/wallet/LineItem;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun newBuilder(): com.google.android.gms.wallet.LineItem.Builder { return TODO("body: ()Lcom/google/android/gms/wallet/LineItem$Builder;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/wallet/LineItem$Builder;
    //         new-instance v1, Lcom/google/android/gms/wallet/LineItem;
    //         invoke-direct {v1}, Lcom/google/android/gms/wallet/LineItem;-><init>()V
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/LineItem$Builder;-><init>(Lcom/google/android/gms/wallet/LineItem;Lcom/google/android/gms/wallet/LineItem$1;)V
    //         return-object v0
    */

    }
}
