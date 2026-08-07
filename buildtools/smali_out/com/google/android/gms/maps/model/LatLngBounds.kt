package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 4 fields, 19 methods.

class LatLngBounds: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    public val northeast: com.google.android.gms.maps.model.LatLng
    public val southwest: com.google.android.gms.maps.model.LatLng

    constructor(versionCode: Int, southwest: com.google.android.gms.maps.model.LatLng, northeast: com.google.android.gms.maps.model.LatLng)

    public constructor(southwest: com.google.android.gms.maps.model.LatLng, northeast: com.google.android.gms.maps.model.LatLng)

    private fun c(p0: Double): Boolean { return TODO("body: (D)Z") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D
    //         cmpg-double v0, v0, p1
    //         if-gtz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D
    //         cmpg-double v0, p1, v0
    //         if-gtz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun d(p0: Double): Boolean { return TODO("body: (D)Z") }
    /*
    //         .locals 7
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         iget-object v4, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         cmpg-double v2, v2, v4
    //         if-gtz v2, :cond_1
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         cmpg-double v2, v2, p1
    //         if-gtz v2, :cond_0
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         cmpg-double v2, p1, v2
    //         if-gtz v2, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :cond_1
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         cmpg-double v2, v2, p1
    //         if-lez v2, :cond_2
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         cmpg-double v2, p1, v2
    //         if-gtz v2, :cond_3
    //         :cond_2
    //         move v1, v0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun contains(point: com.google.android.gms.maps.model.LatLng): Boolean { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;)Z") }
    /*
    //         .locals 2
    //         iget-wide v0, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D
    //         invoke-direct {p0, v0, v1}, Lcom/google/android/gms/maps/model/LatLngBounds;->c(D)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-wide v0, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         invoke-direct {p0, v0, v1}, Lcom/google/android/gms/maps/model/LatLngBounds;->d(D)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p0, p1, :cond_1
    //         .end local p1    # "o":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "o":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v2, p1, Lcom/google/android/gms/maps/model/LatLngBounds;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/maps/model/LatLngBounds;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-object v3, p1, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_3
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-object v3, p1, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/LatLng;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getCenter(): com.google.android.gms.maps.model.LatLng { return TODO("body: ()Lcom/google/android/gms/maps/model/LatLng;") }
    /*
    //         .locals 10
    //         const-wide/high16 v8, 0x4000000000000000L    # 2.0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D
    //         add-double/2addr v0, v2
    //         div-double v2, v0, v8
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         iget-object v4, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         cmpg-double v6, v4, v0
    //         if-gtz v6, :cond_0
    //         add-double/2addr v0, v4
    //         div-double/2addr v0, v8
    //         :goto_0
    //         new-instance v4, Lcom/google/android/gms/maps/model/LatLng;
    //         invoke-direct {v4, v2, v3, v0, v1}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V
    //         return-object v4
    //         :cond_0
    //         const-wide v6, 0x4076800000000000L    # 360.0
    //         add-double/2addr v0, v6
    //         add-double/2addr v0, v4
    //         div-double/2addr v0, v8
    //         goto :goto_0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun including(point: com.google.android.gms.maps.model.LatLng): com.google.android.gms.maps.model.LatLngBounds { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds;") }
    /*
    //         .locals 18
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D
    //         move-object/from16 v0, p1
    //         iget-wide v4, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D
    //         invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(DD)D
    //         move-result-wide v8
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v2, v2, Lcom/google/android/gms/maps/model/LatLng;->latitude:D
    //         move-object/from16 v0, p1
    //         iget-wide v4, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D
    //         invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D
    //         move-result-wide v10
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v6, v2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;
    //         iget-wide v4, v2, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         move-object/from16 v0, p1
    //         iget-wide v2, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D
    //         move-object/from16 v0, p0
    //         invoke-direct {v0, v2, v3}, Lcom/google/android/gms/maps/model/LatLngBounds;->d(D)Z
    //         move-result v12
    //         if-nez v12, :cond_1
    //         invoke-static {v4, v5, v2, v3}, Lcom/google/android/gms/maps/model/LatLngBounds;->b(DD)D
    //         move-result-wide v12
    //         invoke-static {v6, v7, v2, v3}, Lcom/google/android/gms/maps/model/LatLngBounds;->c(DD)D
    //         move-result-wide v14
    //         cmpg-double v12, v12, v14
    //         if-gez v12, :cond_0
    //         move-wide v4, v6
    //         :goto_0
    //         new-instance v6, Lcom/google/android/gms/maps/model/LatLngBounds;
    //         new-instance v7, Lcom/google/android/gms/maps/model/LatLng;
    //         invoke-direct {v7, v8, v9, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V
    //         new-instance v2, Lcom/google/android/gms/maps/model/LatLng;
    //         invoke-direct {v2, v10, v11, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V
    //         invoke-direct {v6, v7, v2}, Lcom/google/android/gms/maps/model/LatLngBounds;-><init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V
    //         return-object v6
    //         :cond_0
    //         move-wide/from16 v16, v4
    //         move-wide v4, v2
    //         move-wide/from16 v2, v16
    //         goto :goto_0
    //         :cond_1
    //         move-wide v2, v4
    //         move-wide v4, v6
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "southwest"
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->southwest:Lcom/google/android/gms/maps/model/LatLng;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "northeast"
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/LatLngBounds;->northeast:Lcom/google/android/gms/maps/model/LatLng;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/maps/internal/v;->mM()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/h;->a(Lcom/google/android/gms/maps/model/LatLngBounds;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/LatLngBounds;Landroid/os/Parcel;I)V
    //         goto :goto_0
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.model.g = null!!

    private @JvmStatic fun b(p0: Double, p1: Double): Double { return TODO("body: (DD)D") }
    /*
    //         .locals 4
    //         const-wide v2, 0x4076800000000000L    # 360.0
    //         sub-double v0, p0, p2
    //         add-double/2addr v0, v2
    //         rem-double/2addr v0, v2
    //         return-wide v0
    */

    public @JvmStatic fun builder(): com.google.android.gms.maps.model.LatLngBounds.Builder { return TODO("body: ()Lcom/google/android/gms/maps/model/LatLngBounds$Builder;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;
    //         invoke-direct {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V
    //         return-object v0
    */

    private @JvmStatic fun c(p0: Double, p1: Double): Double { return TODO("body: (DD)D") }
    /*
    //         .locals 4
    //         const-wide v2, 0x4076800000000000L    # 360.0
    //         sub-double v0, p2, p0
    //         add-double/2addr v0, v2
    //         rem-double/2addr v0, v2
    //         return-wide v0
    */

    @JvmStatic fun d(p0: Double, p1: Double): Double { return TODO("body: (DD)D") }
    /*
    //         .locals 2
    //         invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/maps/model/LatLngBounds;->b(DD)D
    //         move-result-wide v0
    //         return-wide v0
    */

    @JvmStatic fun e(p0: Double, p1: Double): Double { return TODO("body: (DD)D") }
    /*
    //         .locals 2
    //         invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/maps/model/LatLngBounds;->c(DD)D
    //         move-result-wide v0
    //         return-wide v0
    */

    }
}
