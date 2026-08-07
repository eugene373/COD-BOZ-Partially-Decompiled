package com.google.android.gms.wallet

// Auto-emitted from smali.
// 13 fields, 17 methods.

class Address: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var adN: String
    var adO: String
    var adP: String
    var adU: String
    var adW: String
    var adX: Boolean
    var adY: String
    var ast: String
    var asu: String
    var name: String
    var uW: String

    constructor()

    constructor(versionCode: Int, name: String, address1: String, address2: String, address3: String, countryCode: String, city: String, state: String, postalCode: String, phoneNumber: String, isPostBox: Boolean, companyName: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAddress1(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Address;->adN:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAddress2(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Address;->adO:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAddress3(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Address;->adP:Ljava/lang/String;
    //         return-object v0
    */

    public fun getCity(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Address;->ast:Ljava/lang/String;
    //         return-object v0
    */

    public fun getCompanyName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Address;->adY:Ljava/lang/String;
    //         return-object v0
    */

    public fun getCountryCode(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Address;->uW:Ljava/lang/String;
    //         return-object v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Address;->name:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPhoneNumber(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Address;->adW:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPostalCode(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Address;->adU:Ljava/lang/String;
    //         return-object v0
    */

    public fun getState(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/Address;->asu:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/Address;->BR:I
    //         return v0
    */

    public fun isPostBox(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/wallet/Address;->adX:Z
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/a;->a(Lcom/google/android/gms/wallet/Address;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
