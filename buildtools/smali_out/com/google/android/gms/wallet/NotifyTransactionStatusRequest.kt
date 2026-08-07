package com.google.android.gms.wallet

// Auto-emitted from smali.
// 5 fields, 10 methods.

class NotifyTransactionStatusRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    var asB: String
    var atB: String
    var status: Int

    constructor()

    constructor(versionCode: Int, googleTransactionId: String, status: Int, detailedReason: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getDetailedReason(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->atB:Ljava/lang/String;
    //         return-object v0
    */

    public fun getGoogleTransactionId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->asB:Ljava/lang/String;
    //         return-object v0
    */

    public fun getStatus(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->status:I
    //         return v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;->BR:I
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/m;->a(Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun newBuilder(): com.google.android.gms.wallet.NotifyTransactionStatusRequest.Builder { return TODO("body: ()Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;
    //         new-instance v1, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;
    //         invoke-direct {v1}, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;-><init>()V
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$Builder;-><init>(Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest$1;)V
    //         return-object v0
    */

    }
}
