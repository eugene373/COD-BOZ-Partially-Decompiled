package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 6 methods.

open class hm_b: com.google.android.gms.common.api.Result, com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    public var Ck: com.google.android.gms.common.api.Status
    public var Cl: java.util.List

    public constructor()

    constructor(p0: Int, p1: com.google.android.gms.common.api.Status, p2: java.util.List)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hm$b;->CREATOR:Lcom/google/android/gms/internal/ho;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/hm$b;->Ck:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hm$b;->CREATOR:Lcom/google/android/gms/internal/ho;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ho;->a(Lcom/google/android/gms/internal/hm$b;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.ho = null!!
    }
}
