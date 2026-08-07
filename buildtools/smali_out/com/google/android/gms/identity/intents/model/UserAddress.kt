package com.google.android.gms.identity.intents.model

// Auto-emitted from smali.
// 17 fields, 22 methods.

class UserAddress: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var adN: String
    var adO: String
    var adP: String
    var adQ: String
    var adR: String
    var adS: String
    var adT: String
    var adU: String
    var adV: String
    var adW: String
    var adX: Boolean
    var adY: String
    var adZ: String
    var name: String
    var uW: String

    constructor()

    constructor(versionCode: Int, name: String, address1: String, address2: String, address3: String, address4: String, address5: String, administrativeArea: String, locality: String, countryCode: String, postalCode: String, sortingCode: String, phoneNumber: String, isPostBox: Boolean, companyName: String, emailAddress: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAddress1(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->adN:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAddress2(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->adO:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAddress3(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->adP:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAddress4(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->adQ:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAddress5(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->adR:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAdministrativeArea(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->adS:Ljava/lang/String;
    //         return-object v0
    */

    public fun getCompanyName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->adY:Ljava/lang/String;
    //         return-object v0
    */

    public fun getCountryCode(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->uW:Ljava/lang/String;
    //         return-object v0
    */

    public fun getEmailAddress(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->adZ:Ljava/lang/String;
    //         return-object v0
    */

    public fun getLocality(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->adT:Ljava/lang/String;
    //         return-object v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->name:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPhoneNumber(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->adW:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPostalCode(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->adU:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSortingCode(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->adV:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->BR:I
    //         return v0
    */

    public fun isPostBox(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/identity/intents/model/UserAddress;->adX:Z
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/identity/intents/model/b;->a(Lcom/google/android/gms/identity/intents/model/UserAddress;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun fromIntent(data: android.content.Intent): com.google.android.gms.identity.intents.model.UserAddress { return TODO("body: (Landroid/content/Intent;)Lcom/google/android/gms/identity/intents/model/UserAddress;") }
    /*
    //         .locals 1
    //         if-eqz p0, :cond_0
    //         const-string v0, "com.google.android.gms.identity.intents.EXTRA_ADDRESS"
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const-string v0, "com.google.android.gms.identity.intents.EXTRA_ADDRESS"
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/identity/intents/model/UserAddress;
    //         goto :goto_0
    */

    }
}
