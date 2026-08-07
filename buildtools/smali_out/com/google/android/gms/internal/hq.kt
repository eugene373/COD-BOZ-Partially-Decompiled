package com.google.android.gms.internal

// Auto-emitted from smali.
// 11 fields, 6 methods.

open class hq: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    public val Co: String
    public val Cp: Boolean
    public val Cq: Boolean
    public val Cr: String
    public val Cs: Array<com.google.android.gms.internal.hk>
    val Ct: IntArray
    public val Cu: String
    public val name: String
    public val weight: Int

    constructor(p0: Int, p1: String, p2: String, p3: Boolean, p4: Int, p5: Boolean, p6: String, p7: Array<com.google.android.gms.internal.hk>, p8: IntArray, p9: String)

    constructor(p0: String, p1: String, p2: Boolean, p3: Int, p4: Boolean, p5: String, p6: Array<com.google.android.gms.internal.hk>, p7: IntArray, p8: String)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hq;->CREATOR:Lcom/google/android/gms/internal/hr;
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(object: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         instance-of v1, p1, Lcom/google/android/gms/internal/hq;
    //         if-eqz v1, :cond_0
    //         check-cast p1, Lcom/google/android/gms/internal/hq;
    //         .end local p1    # "object":Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/hq;->name:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/hq;->name:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/hq;->Co:Ljava/lang/String;
    //         iget-object v2, p1, Lcom/google/android/gms/internal/hq;->Co:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-boolean v1, p0, Lcom/google/android/gms/internal/hq;->Cp:Z
    //         iget-boolean v2, p1, Lcom/google/android/gms/internal/hq;->Cp:Z
    //         if-ne v1, v2, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/internal/hq;->CREATOR:Lcom/google/android/gms/internal/hr;
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/hr;->a(Lcom/google/android/gms/internal/hq;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.internal.hr = null!!
    }
}
