package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 4 fields, 10 methods.

open class b: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Ui: String
    private val Uj: com.google.android.gms.fitness.data.BleDevice

    constructor(p0: Int, p1: String, p2: com.google.android.gms.fitness.data.BleDevice)

    public constructor(p0: com.google.android.gms.fitness.data.BleDevice)

    public constructor(p0: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getDeviceAddress(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/b;->Ui:Ljava/lang/String;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/b;->BR:I
    //         return v0
    */

    public fun jf(): com.google.android.gms.fitness.data.BleDevice { return TODO("body: ()Lcom/google/android/gms/fitness/data/BleDevice;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/b;->Uj:Lcom/google/android/gms/fitness/data/BleDevice;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "ClaimBleDeviceRequest{%s %s}"
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/request/b;->Ui:Ljava/lang/String;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/request/b;->Uj:Lcom/google/android/gms/fitness/data/BleDevice;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/c;->a(Lcom/google/android/gms/fitness/request/b;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
