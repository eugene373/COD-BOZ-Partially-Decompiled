package com.google.android.gms.identity.intents

// Auto-emitted from smali.
// 3 fields, 7 methods.

class UserAddressRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    var adK: java.util.List

    constructor()

    constructor(versionCode: Int, p1: java.util.List)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/identity/intents/UserAddressRequest;->BR:I
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/identity/intents/a;->a(Lcom/google/android/gms/identity/intents/UserAddressRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun newBuilder(): com.google.android.gms.identity.intents.UserAddressRequest.Builder { return TODO("body: ()Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;
    //         new-instance v1, Lcom/google/android/gms/identity/intents/UserAddressRequest;
    //         invoke-direct {v1}, Lcom/google/android/gms/identity/intents/UserAddressRequest;-><init>()V
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/identity/intents/UserAddressRequest$Builder;-><init>(Lcom/google/android/gms/identity/intents/UserAddressRequest;Lcom/google/android/gms/identity/intents/UserAddressRequest$1;)V
    //         return-object v0
    */

    }
}
