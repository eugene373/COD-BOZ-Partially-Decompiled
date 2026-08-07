package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 9 methods.

open class jd: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Ms: com.google.android.gms.internal.jf

    constructor(p0: Int, p1: com.google.android.gms.internal.jf)

    private constructor(p0: com.google.android.gms.internal.jf)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jd;->CREATOR:Lcom/google/android/gms/internal/je;
    //         const/4 v0, 0x0
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/jd;->BR:I
    //         return v0
    */

    fun ha(): com.google.android.gms.internal.jf { return TODO("body: ()Lcom/google/android/gms/internal/jf;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jd;->Ms:Lcom/google/android/gms/internal/jf;
    //         return-object v0
    */

    public fun hb(): com.google.android.gms.internal.ji.b { return TODO("body: ()Lcom/google/android/gms/internal/ji$b;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lcom/google/android/gms/internal/ji$b",
    //                 "<**>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jd;->Ms:Lcom/google/android/gms/internal/jf;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/jd;->Ms:Lcom/google/android/gms/internal/jf;
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "There was no converter wrapped in this ConverterWrapper."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/jd;->CREATOR:Lcom/google/android/gms/internal/je;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/je;->a(Lcom/google/android/gms/internal/jd;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.je = null!!

    public @JvmStatic fun a(p0: com.google.android.gms.internal.ji.b): com.google.android.gms.internal.jd { return TODO("body: (Lcom/google/android/gms/internal/ji$b;)Lcom/google/android/gms/internal/jd;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/internal/ji$b",
    //                 "<**>;)",
    //                 "Lcom/google/android/gms/internal/jd;"
    //             }
    //         .end annotation
    //         instance-of v0, p0, Lcom/google/android/gms/internal/jf;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/jd;
    //         check-cast p0, Lcom/google/android/gms/internal/jf;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/jd;-><init>(Lcom/google/android/gms/internal/jf;)V
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Unsupported safe parcelable field converter class."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    }
}
