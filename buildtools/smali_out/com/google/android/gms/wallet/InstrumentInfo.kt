package com.google.android.gms.wallet

// Auto-emitted from smali.
// 4 fields, 7 methods.

class InstrumentInfo: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var asN: String
    private var asO: String

    constructor(versionCode: Int, instrumentType: String, instrumentDetails: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getInstrumentDetails(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/InstrumentInfo;->asO:Ljava/lang/String;
    //         return-object v0
    */

    public fun getInstrumentType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/InstrumentInfo;->asN:Ljava/lang/String;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/InstrumentInfo;->BR:I
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/h;->a(Lcom/google/android/gms/wallet/InstrumentInfo;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
