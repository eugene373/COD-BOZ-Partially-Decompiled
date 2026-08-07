package com.google.android.gms.internal

// Auto-emitted from smali.
// 17 fields, 6 methods.

class fi: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public val applicationInfo: android.content.pm.ApplicationInfo
    public val lA: String
    public val lD: com.google.android.gms.internal.gt
    public val lH: com.google.android.gms.internal.ay
    public val lS: java.util.List
    public val tA: String
    public val tB: String
    public val tC: android.os.Bundle
    public val tD: Int
    public val tE: android.os.Bundle
    public val tF: Boolean
    public val tw: android.os.Bundle
    public val tx: com.google.android.gms.internal.av
    public val ty: android.content.pm.PackageInfo
    public val tz: String
    public val versionCode: Int

    constructor(p0: Int, p1: android.os.Bundle, p2: com.google.android.gms.internal.av, p3: com.google.android.gms.internal.ay, p4: String, p5: android.content.pm.ApplicationInfo, p6: android.content.pm.PackageInfo, p7: String, p8: String, p9: String, p10: com.google.android.gms.internal.gt, p11: android.os.Bundle, p12: Int, p13: java.util.List, p14: android.os.Bundle, p15: Boolean)

    public constructor(p0: android.os.Bundle, p1: com.google.android.gms.internal.av, p2: com.google.android.gms.internal.ay, p3: String, p4: android.content.pm.ApplicationInfo, p5: android.content.pm.PackageInfo, p6: String, p7: String, p8: String, p9: com.google.android.gms.internal.gt, p10: android.os.Bundle, p11: Int, p12: java.util.List, p13: android.os.Bundle, p14: Boolean)

    public constructor(p0: com.google.android.gms.internal.fi.a, p1: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/fj;->a(Lcom/google/android/gms/internal/fi;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.fj = null!!
    }
}
