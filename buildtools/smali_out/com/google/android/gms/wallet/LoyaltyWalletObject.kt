package com.google.android.gms.wallet

// Auto-emitted from smali.
// 24 fields, 14 methods.

class LoyaltyWalletObject: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var Dv: String
    var asT: String
    var asU: String
    var asV: String
    var asW: String
    var asX: String
    var asY: String
    var asZ: String
    var ata: String
    var atb: java.util.ArrayList
    var atc: com.google.android.gms.wallet.wobs.l
    var atd: java.util.ArrayList
    var ate: String
    var atf: String
    var atg: java.util.ArrayList
    var ath: Boolean
    var ati: java.util.ArrayList
    var atj: java.util.ArrayList
    var atk: java.util.ArrayList
    var atl: com.google.android.gms.wallet.wobs.f
    var fl: String
    var state: Int

    constructor()

    constructor(versionCode: Int, id: String, accountId: String, issuerName: String, programName: String, accountName: String, barcodeAlternateText: String, barcodeType: String, barcodeValue: String, barcodeLabel: String, classId: String, state: Int, validTimeInterval: java.util.ArrayList, infoModuleDataHexFontColor: com.google.android.gms.wallet.wobs.l, infoModuleDataHexBackgroundColor: java.util.ArrayList, infoModuleDataShowLastUpdateTime: String, loyaltyPoints: String, p17: java.util.ArrayList, p18: Boolean, p19: java.util.ArrayList, p20: java.util.ArrayList, p21: java.util.ArrayList, p22: com.google.android.gms.wallet.wobs.f)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAccountId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/LoyaltyWalletObject;->asT:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAccountName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/LoyaltyWalletObject;->Dv:Ljava/lang/String;
    //         return-object v0
    */

    public fun getBarcodeAlternateText(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/LoyaltyWalletObject;->asW:Ljava/lang/String;
    //         return-object v0
    */

    public fun getBarcodeType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/LoyaltyWalletObject;->asX:Ljava/lang/String;
    //         return-object v0
    */

    public fun getBarcodeValue(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/LoyaltyWalletObject;->asY:Ljava/lang/String;
    //         return-object v0
    */

    public fun getId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/LoyaltyWalletObject;->fl:Ljava/lang/String;
    //         return-object v0
    */

    public fun getIssuerName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/LoyaltyWalletObject;->asU:Ljava/lang/String;
    //         return-object v0
    */

    public fun getProgramName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/LoyaltyWalletObject;->asV:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/LoyaltyWalletObject;->BR:I
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/j;->a(Lcom/google/android/gms/wallet/LoyaltyWalletObject;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
