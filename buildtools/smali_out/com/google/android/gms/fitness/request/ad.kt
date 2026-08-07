package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 3 fields, 7 methods.

open class ad: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val UQ: com.google.android.gms.fitness.request.l

    constructor(p0: Int, p1: android.os.IBinder)

    public constructor(p0: com.google.android.gms.fitness.request.BleScanCallback)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/ad;->BR:I
    //         return v0
    */

    public fun jC(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/ad;->UQ:Lcom/google/android/gms/fitness/request/l;
    //         invoke-interface {v0}, Lcom/google/android/gms/fitness/request/l;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/ae;->a(Lcom/google/android/gms/fitness/request/ad;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
