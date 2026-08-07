package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 4 fields, 6 methods.

open class OnListEntriesResponse: com.google.android.gms.drive.i(), com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Oz: Boolean
    val Pu: com.google.android.gms.common.data.DataHolder

    constructor(versionCode: Int, entries: com.google.android.gms.common.data.DataHolder, moreEntriesMayExist: Boolean)

    protected fun I(p0: android.os.Parcel, p1: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/an;->a(Lcom/google/android/gms/drive/internal/OnListEntriesResponse;Landroid/os/Parcel;I)V
    //         return-void
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun ii(): com.google.android.gms.common.data.DataHolder { return TODO("body: ()Lcom/google/android/gms/common/data/DataHolder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/OnListEntriesResponse;->Pu:Lcom/google/android/gms/common/data/DataHolder;
    //         return-object v0
    */

    public fun ij(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/internal/OnListEntriesResponse;->Oz:Z
    //         return v0
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
