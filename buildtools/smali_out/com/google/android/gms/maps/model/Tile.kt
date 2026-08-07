package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 5 fields, 6 methods.

class Tile: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    public val data: ByteArray
    public val height: Int
    public val width: Int

    constructor(versionCode: Int, width: Int, height: Int, data: ByteArray)

    public constructor(width: Int, height: Int, data: ByteArray)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/Tile;->BR:I
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/maps/internal/v;->mM()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/v;->a(Lcom/google/android/gms/maps/model/Tile;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/u;->a(Lcom/google/android/gms/maps/model/Tile;Landroid/os/Parcel;I)V
    //         goto :goto_0
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.model.u = null!!
    }
}
