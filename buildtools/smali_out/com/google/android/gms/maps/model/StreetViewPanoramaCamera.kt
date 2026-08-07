package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 6 fields, 12 methods.

open class StreetViewPanoramaCamera: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var akp: com.google.android.gms.maps.model.StreetViewPanoramaOrientation
    public val bearing: Float
    public val tilt: Float
    public val zoom: Float

    public constructor(zoom: Float, tilt: Float, bearing: Float)

    constructor(versionCode: Int, zoom: Float, tilt: Float, bearing: Float)

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
    //         instance-of v2, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;
    //         if-nez v2, :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         check-cast p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         iget v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->zoom:F
    //         invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v2
    //         iget v3, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->zoom:F
    //         invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v3
    //         if-ne v2, v3, :cond_3
    //         iget v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->tilt:F
    //         invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v2
    //         iget v3, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->tilt:F
    //         invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v3
    //         if-ne v2, v3, :cond_3
    //         iget v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->bearing:F
    //         invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v2
    //         iget v3, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->bearing:F
    //         invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I
    //         move-result v3
    //         if-eq v2, v3, :cond_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getOrientation(): com.google.android.gms.maps.model.StreetViewPanoramaOrientation { return TODO("body: ()Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->akp:Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->zoom:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->tilt:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->bearing:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "zoom"
    //         iget v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->zoom:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "tilt"
    //         iget v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->tilt:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "bearing"
    //         iget v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->bearing:F
    //         invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/q;->a(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.model.q = null!!

    public @JvmStatic fun builder(): com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder { return TODO("body: ()Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;
    //         invoke-direct {v0}, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;-><init>()V
    //         return-object v0
    */

    public @JvmStatic fun builder(camera: com.google.android.gms.maps.model.StreetViewPanoramaCamera): com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder { return TODO("body: (Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;)Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;-><init>(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;)V
    //         return-object v0
    */

    }
}
