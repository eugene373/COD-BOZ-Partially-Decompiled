package com.google.android.gms.games.internal

// Auto-emitted from smali.
// 4 fields, 7 methods.

open class ConnectionInfo: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Wq: String
    private val Wr: Int

    public constructor(versionCode: Int, clientAddress: String, registrationLatency: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/internal/ConnectionInfo;->BR:I
    //         return v0
    */

    public fun jX(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/games/internal/ConnectionInfo;->Wq:Ljava/lang/String;
    //         return-object v0
    */

    public fun jY(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/games/internal/ConnectionInfo;->Wr:I
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/games/internal/ConnectionInfoCreator;->a(Lcom/google/android/gms/games/internal/ConnectionInfo;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.games.internal.ConnectionInfoCreator = null!!
    }
}
