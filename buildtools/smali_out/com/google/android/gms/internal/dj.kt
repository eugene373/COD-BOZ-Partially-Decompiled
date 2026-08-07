package com.google.android.gms.internal

// Auto-emitted from smali.
// 9 fields, 5 methods.

class dj: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public val mimeType: String
    public val packageName: String
    public val rp: String
    public val rq: String
    public val rr: String
    public val rs: String
    public val rt: String
    public val versionCode: Int

    public constructor(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String)

    public constructor(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/di;->a(Lcom/google/android/gms/internal/dj;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.di = null!!
    }
}
