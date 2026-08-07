package com.google.android.gms.internal

// Auto-emitted from smali.
// 9 fields, 12 methods.

class ay: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public val height: Int
    public val heightPixels: Int
    public val of: String
    public val og: Boolean
    public val oh: Array<com.google.android.gms.internal.ay>
    public val versionCode: Int
    public val width: Int
    public val widthPixels: Int

    public constructor()

    constructor(p0: Int, p1: String, p2: Int, p3: Int, p4: Boolean, p5: Int, p6: Int, p7: Array<com.google.android.gms.internal.ay>)

    public constructor(p0: android.content.Context, p1: com.google.android.gms.ads.AdSize)

    public constructor(p0: android.content.Context, p1: Array<com.google.android.gms.ads.AdSize>)

    public constructor(p0: com.google.android.gms.internal.ay, p1: Array<com.google.android.gms.internal.ay>)

    public fun bc(): com.google.android.gms.ads.AdSize { return TODO("body: ()Lcom/google/android/gms/ads/AdSize;") }
    /*
    //         .locals 3
    //         iget v0, p0, Lcom/google/android/gms/internal/ay;->width:I
    //         iget v1, p0, Lcom/google/android/gms/internal/ay;->height:I
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ay;->of:Ljava/lang/String;
    //         invoke-static {v0, v1, v2}, Lcom/google/android/gms/ads/a;->a(IILjava/lang/String;)Lcom/google/android/gms/ads/AdSize;
    //         move-result-object v0
    //         return-object v0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/az;->a(Lcom/google/android/gms/internal/ay;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.az = null!!

    public @JvmStatic fun a(p0: android.util.DisplayMetrics): Int { return TODO("body: (Landroid/util/DisplayMetrics;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/util/DisplayMetrics;->widthPixels:I
    //         return v0
    */

    public @JvmStatic fun b(p0: android.util.DisplayMetrics): Int { return TODO("body: (Landroid/util/DisplayMetrics;)I") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/google/android/gms/internal/ay;->c(Landroid/util/DisplayMetrics;)I
    //         move-result v0
    //         int-to-float v0, v0
    //         iget v1, p0, Landroid/util/DisplayMetrics;->density:F
    //         mul-float/2addr v0, v1
    //         float-to-int v0, v0
    //         return v0
    */

    private @JvmStatic fun c(p0: android.util.DisplayMetrics): Int { return TODO("body: (Landroid/util/DisplayMetrics;)I") }
    /*
    //         .locals 2
    //         iget v0, p0, Landroid/util/DisplayMetrics;->heightPixels:I
    //         int-to-float v0, v0
    //         iget v1, p0, Landroid/util/DisplayMetrics;->density:F
    //         div-float/2addr v0, v1
    //         float-to-int v0, v0
    //         const/16 v1, 0x190
    //         if-gt v0, v1, :cond_0
    //         const/16 v0, 0x20
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/16 v1, 0x2d0
    //         if-gt v0, v1, :cond_1
    //         const/16 v0, 0x32
    //         goto :goto_0
    //         :cond_1
    //         const/16 v0, 0x5a
    //         goto :goto_0
    */

    }
}
