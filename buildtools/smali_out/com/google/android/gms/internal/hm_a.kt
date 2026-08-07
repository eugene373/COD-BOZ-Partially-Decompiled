package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 6 methods.

open class hm_a: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    public val Cj: android.accounts.Account

    public constructor()

    constructor(p0: Int, p1: android.accounts.Account)

    public constructor(p0: android.accounts.Account)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hm$a;->CREATOR:Lcom/google/android/gms/internal/hn;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hm$a;->CREATOR:Lcom/google/android/gms/internal/hn;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/hn;->a(Lcom/google/android/gms/internal/hm$a;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.hn = null!!
    }
}
