package com.google.android.gms.wallet.wobs

// Auto-emitted from smali.
// 21 fields, 8 methods.

open class CommonWalletObject: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var asU: String
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
    var fl: String
    var name: String
    var state: Int

    constructor()

    constructor(versionCode: Int, id: String, classId: String, name: String, issuerName: String, barcodeAlternateText: String, barcodeType: String, barcodeValue: String, barcodeLabel: String, state: Int, validTimeInterval: java.util.ArrayList, infoModuleDataHexFontColor: com.google.android.gms.wallet.wobs.l, infoModuleDataHexBackgroundColor: java.util.ArrayList, infoModuleDataShowLastUpdateTime: String, p14: String, p15: java.util.ArrayList, p16: Boolean, p17: java.util.ArrayList, p18: java.util.ArrayList, p19: java.util.ArrayList)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->fl:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->BR:I
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/wobs/a;->a(Lcom/google/android/gms/wallet/wobs/CommonWalletObject;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun pQ(): com.google.android.gms.wallet.wobs.CommonWalletObject.a { return TODO("body: ()Lcom/google/android/gms/wallet/wobs/CommonWalletObject$a;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$a;
    //         new-instance v1, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;
    //         invoke-direct {v1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;-><init>()V
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$a;-><init>(Lcom/google/android/gms/wallet/wobs/CommonWalletObject;Lcom/google/android/gms/wallet/wobs/CommonWalletObject$1;)V
    //         return-object v0
    */

    }
}
