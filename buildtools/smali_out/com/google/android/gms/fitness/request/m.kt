package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 3 fields, 8 methods.

open class m: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Sp: com.google.android.gms.fitness.data.DataType

    constructor(p0: Int, p1: com.google.android.gms.fitness.data.DataType)

    private constructor(p0: com.google.android.gms.fitness.request.m.a)

    constructor(p0: com.google.android.gms.fitness.request.m.a, p1: com.google.android.gms.fitness.request.m.1)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getDataType(): com.google.android.gms.fitness.data.DataType { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/m;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/m;->BR:I
    //         return v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/n;->a(Lcom/google/android/gms/fitness/request/m;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
