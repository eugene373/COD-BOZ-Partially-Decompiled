package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 3 fields, 5 methods.

open class OnListParentsResponse: com.google.android.gms.drive.i(), com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Pv: com.google.android.gms.common.data.DataHolder

    constructor(versionCode: Int, parents: com.google.android.gms.common.data.DataHolder)

    protected fun I(p0: android.os.Parcel, p1: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/ao;->a(Lcom/google/android/gms/drive/internal/OnListParentsResponse;Landroid/os/Parcel;I)V
    //         return-void
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun ik(): com.google.android.gms.common.data.DataHolder { return TODO("body: ()Lcom/google/android/gms/common/data/DataHolder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnListParentsResponse;->Pv:Lcom/google/android/gms/common/data/DataHolder;
    //         return-object v0
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
