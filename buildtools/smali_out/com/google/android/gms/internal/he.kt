package com.google.android.gms.internal

// Auto-emitted from smali.
// 6 fields, 5 methods.

open class he: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val BS: Array<com.google.android.gms.internal.hi>
    public val BT: String
    public val BU: Boolean
    public val account: android.accounts.Account

    constructor(p0: Int, p1: Array<com.google.android.gms.internal.hi>, p2: String, p3: Boolean, p4: android.accounts.Account)

    constructor(p0: String, p1: Boolean, p2: android.accounts.Account, p3: Array<com.google.android.gms.internal.hi>)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/he;->CREATOR:Lcom/google/android/gms/internal/hf;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/he;->CREATOR:Lcom/google/android/gms/internal/hf;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/hf;->a(Lcom/google/android/gms/internal/he;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.hf = null!!
    }
}
