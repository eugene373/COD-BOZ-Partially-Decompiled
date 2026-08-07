package com.google.android.gms.internal

// Auto-emitted from smali.
// 8 fields, 10 methods.

open class mr: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    private val Sz: String
    private val ahY: com.google.android.gms.maps.model.LatLng
    private val ahZ: java.util.List
    private val aia: String
    private val aib: String
    private val mName: String

    constructor(p0: Int, p1: String, p2: com.google.android.gms.maps.model.LatLng, p3: String, p4: java.util.List, p5: String, p6: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAddress(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/mr;->Sz:Ljava/lang/String;
    //         return-object v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/mr;->mName:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPhoneNumber(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/mr;->aia:Ljava/lang/String;
    //         return-object v0
    */

    public fun ml(): com.google.android.gms.maps.model.LatLng { return TODO("body: ()Lcom/google/android/gms/maps/model/LatLng;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/mr;->ahY:Lcom/google/android/gms/maps/model/LatLng;
    //         return-object v0
    */

    public fun mm(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/internal/mp;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/mr;->ahZ:Ljava/util/List;
    //         return-object v0
    */

    public fun mn(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/mr;->aib:Ljava/lang/String;
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ms;->a(Lcom/google/android/gms/internal/mr;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
