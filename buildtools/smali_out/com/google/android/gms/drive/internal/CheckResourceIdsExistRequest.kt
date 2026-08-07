package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 3 fields, 6 methods.

open class CheckResourceIdsExistRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Oc: java.util.List

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
    //         iget v0, p0, Lcom/google/android/gms/drive/internal/CheckResourceIdsExistRequest;->BR:I
    //         return v0
    */

    public fun hX(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/CheckResourceIdsExistRequest;->Oc:Ljava/util/List;
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/internal/d;->a(Lcom/google/android/gms/drive/internal/CheckResourceIdsExistRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
