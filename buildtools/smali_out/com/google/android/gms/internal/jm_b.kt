package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 5 methods.

open class jm_b: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val MM: com.google.android.gms.internal.ji.a
    val fv: String
    val versionCode: Int

    constructor(p0: Int, p1: String, p2: com.google.android.gms.internal.ji.a)

    constructor(p0: String, p1: com.google.android.gms.internal.ji.a)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jm$b;->CREATOR:Lcom/google/android/gms/internal/jl;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jm$b;->CREATOR:Lcom/google/android/gms/internal/jl;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/jl;->a(Lcom/google/android/gms/internal/jm$b;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.jl = null!!
    }
}
