package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 4 methods.

open class hk: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val Ci: android.os.Bundle
    public val id: Int

    constructor(p0: Int, p1: Int, p2: android.os.Bundle)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hk;->CREATOR:Lcom/google/android/gms/internal/hl;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hk;->CREATOR:Lcom/google/android/gms/internal/hl;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/hl;->a(Lcom/google/android/gms/internal/hk;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.hl = null!!
    }
}
