package com.google.android.gms.internal

// Auto-emitted from smali.
// 7 fields, 13 methods.

open class il: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var FA: Double
    private var FB: Boolean
    private var GB: Int
    private var GC: Int
    private var GN: com.google.android.gms.cast.ApplicationMetadata

    public constructor()

    constructor(p0: Int, p1: Double, p2: Boolean, p3: Int, p4: com.google.android.gms.cast.ApplicationMetadata, p5: Int)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(obj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 6
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p1, p0, :cond_1
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "obj":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/internal/il;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/internal/il;
    //         .end local p1    # "obj":Ljava/lang/Object;
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/il;->FA:D
    //         iget-wide v4, p1, Lcom/google/android/gms/internal/il;->FA:D
    //         cmpl-double v2, v2, v4
    //         if-nez v2, :cond_3
    //         iget-boolean v2, p0, Lcom/google/android/gms/internal/il;->FB:Z
    //         iget-boolean v3, p1, Lcom/google/android/gms/internal/il;->FB:Z
    //         if-ne v2, v3, :cond_3
    //         iget v2, p0, Lcom/google/android/gms/internal/il;->GB:I
    //         iget v3, p1, Lcom/google/android/gms/internal/il;->GB:I
    //         if-ne v2, v3, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/il;->GN:Lcom/google/android/gms/cast/ApplicationMetadata;
    //         iget-object v3, p1, Lcom/google/android/gms/internal/il;->GN:Lcom/google/android/gms/cast/ApplicationMetadata;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget v2, p0, Lcom/google/android/gms/internal/il;->GC:I
    //         iget v3, p1, Lcom/google/android/gms/internal/il;->GC:I
    //         if-eq v2, v3, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun fE(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/il;->FA:D
    //         return-wide v0
    */

    public fun fM(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/il;->FB:Z
    //         return v0
    */

    public fun fN(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/il;->GB:I
    //         return v0
    */

    public fun fO(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/il;->GC:I
    //         return v0
    */

    public fun getApplicationMetadata(): com.google.android.gms.cast.ApplicationMetadata { return TODO("body: ()Lcom/google/android/gms/cast/ApplicationMetadata;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/il;->GN:Lcom/google/android/gms/cast/ApplicationMetadata;
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/internal/il;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x5
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/il;->FA:D
    //         invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-boolean v2, p0, Lcom/google/android/gms/internal/il;->FB:Z
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget v2, p0, Lcom/google/android/gms/internal/il;->GB:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/internal/il;->GN:Lcom/google/android/gms/cast/ApplicationMetadata;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         iget v2, p0, Lcom/google/android/gms/internal/il;->GC:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/il;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
