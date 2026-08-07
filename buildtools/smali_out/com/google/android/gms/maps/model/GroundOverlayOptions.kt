package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 14 fields, 28 methods.

class GroundOverlayOptions: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var ajE: Float
    private var ajL: Float
    private var ajM: Boolean
    private var ajO: com.google.android.gms.maps.model.BitmapDescriptor
    private var ajP: com.google.android.gms.maps.model.LatLng
    private var ajQ: Float
    private var ajR: Float
    private var ajS: com.google.android.gms.maps.model.LatLngBounds
    private var ajT: Float
    private var ajU: Float
    private var ajV: Float

    public constructor()

    constructor(versionCode: Int, wrappedImage: android.os.IBinder, location: com.google.android.gms.maps.model.LatLng, width: Float, height: Float, bounds: com.google.android.gms.maps.model.LatLngBounds, bearing: Float, zIndex: Float, visible: Boolean, transparency: Float, anchorU: Float, anchorV: Float)

    private fun a(p0: com.google.android.gms.maps.model.LatLng, p1: Float, p2: Float): com.google.android.gms.maps.model.GroundOverlayOptions { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;FF)Lcom/google/android/gms/maps/model/GroundOverlayOptions;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajP:Lcom/google/android/gms/maps/model/LatLng;
    //         iput p2, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajQ:F
    //         iput p3, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajR:F
    //         return-object p0
    */

    public fun anchor(u: Float, v: Float): com.google.android.gms.maps.model.GroundOverlayOptions { return TODO("body: (FF)Lcom/google/android/gms/maps/model/GroundOverlayOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajU:F
    //         iput p2, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajV:F
    //         return-object p0
    */

    public fun bearing(bearing: Float): com.google.android.gms.maps.model.GroundOverlayOptions { return TODO("body: (F)Lcom/google/android/gms/maps/model/GroundOverlayOptions;") }
    /*
    //         .locals 2
    //         const/high16 v1, 0x43b40000    # 360.0f
    //         rem-float v0, p1, v1
    //         add-float/2addr v0, v1
    //         rem-float/2addr v0, v1
    //         iput v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajE:F
    //         return-object p0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAnchorU(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajU:F
    //         return v0
    */

    public fun getAnchorV(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajV:F
    //         return v0
    */

    public fun getBearing(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajE:F
    //         return v0
    */

    public fun getBounds(): com.google.android.gms.maps.model.LatLngBounds { return TODO("body: ()Lcom/google/android/gms/maps/model/LatLngBounds;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajS:Lcom/google/android/gms/maps/model/LatLngBounds;
    //         return-object v0
    */

    public fun getHeight(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajR:F
    //         return v0
    */

    public fun getImage(): com.google.android.gms.maps.model.BitmapDescriptor { return TODO("body: ()Lcom/google/android/gms/maps/model/BitmapDescriptor;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajO:Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         return-object v0
    */

    public fun getLocation(): com.google.android.gms.maps.model.LatLng { return TODO("body: ()Lcom/google/android/gms/maps/model/LatLng;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajP:Lcom/google/android/gms/maps/model/LatLng;
    //         return-object v0
    */

    public fun getTransparency(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajT:F
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->BR:I
    //         return v0
    */

    public fun getWidth(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajQ:F
    //         return v0
    */

    public fun getZIndex(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajL:F
    //         return v0
    */

    public fun image(image: com.google.android.gms.maps.model.BitmapDescriptor): com.google.android.gms.maps.model.GroundOverlayOptions { return TODO("body: (Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/GroundOverlayOptions;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajO:Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         return-object p0
    */

    public fun isVisible(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajM:Z
    //         return v0
    */

    fun mO(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajO:Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptor;->mo()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun position(location: com.google.android.gms.maps.model.LatLng, width: Float): com.google.android.gms.maps.model.GroundOverlayOptions { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/model/GroundOverlayOptions;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajS:Lcom/google/android/gms/maps/model/LatLngBounds;
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Position has already been set using positionFromBounds"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         if-eqz p1, :cond_1
    //         move v0, v1
    //         :goto_1
    //         const-string v3, "Location must be specified"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         const/4 v0, 0x0
    //         cmpl-float v0, p2, v0
    //         if-ltz v0, :cond_2
    //         :goto_2
    //         const-string v0, "Width must be non-negative"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         const/high16 v0, -0x40800000    # -1.0f
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->a(Lcom/google/android/gms/maps/model/LatLng;FF)Lcom/google/android/gms/maps/model/GroundOverlayOptions;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    //         :cond_2
    //         move v1, v2
    //         goto :goto_2
    */

    public fun position(location: com.google.android.gms.maps.model.LatLng, width: Float, height: Float): com.google.android.gms.maps.model.GroundOverlayOptions { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;FF)Lcom/google/android/gms/maps/model/GroundOverlayOptions;") }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajS:Lcom/google/android/gms/maps/model/LatLngBounds;
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Position has already been set using positionFromBounds"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         if-eqz p1, :cond_1
    //         move v0, v1
    //         :goto_1
    //         const-string v3, "Location must be specified"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         cmpl-float v0, p2, v4
    //         if-ltz v0, :cond_2
    //         move v0, v1
    //         :goto_2
    //         const-string v3, "Width must be non-negative"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         cmpl-float v0, p3, v4
    //         if-ltz v0, :cond_3
    //         :goto_3
    //         const-string v0, "Height must be non-negative"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->a(Lcom/google/android/gms/maps/model/LatLng;FF)Lcom/google/android/gms/maps/model/GroundOverlayOptions;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    //         :cond_2
    //         move v0, v2
    //         goto :goto_2
    //         :cond_3
    //         move v1, v2
    //         goto :goto_3
    */

    public fun positionFromBounds(bounds: com.google.android.gms.maps.model.LatLngBounds): com.google.android.gms.maps.model.GroundOverlayOptions { return TODO("body: (Lcom/google/android/gms/maps/model/LatLngBounds;)Lcom/google/android/gms/maps/model/GroundOverlayOptions;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajP:Lcom/google/android/gms/maps/model/LatLng;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Position has already been set using position: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajP:Lcom/google/android/gms/maps/model/LatLng;
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iput-object p1, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajS:Lcom/google/android/gms/maps/model/LatLngBounds;
    //         return-object p0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun transparency(transparency: Float): com.google.android.gms.maps.model.GroundOverlayOptions { return TODO("body: (F)Lcom/google/android/gms/maps/model/GroundOverlayOptions;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         cmpl-float v0, p1, v0
    //         if-ltz v0, :cond_0
    //         const/high16 v0, 0x3f800000    # 1.0f
    //         cmpg-float v0, p1, v0
    //         if-gtz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Transparency must be in the range [0..1]"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iput p1, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajT:F
    //         return-object p0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun visible(visible: Boolean): com.google.android.gms.maps.model.GroundOverlayOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/model/GroundOverlayOptions;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajM:Z
    //         return-object p0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/maps/internal/v;->mM()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/f;->a(Lcom/google/android/gms/maps/model/GroundOverlayOptions;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/e;->a(Lcom/google/android/gms/maps/model/GroundOverlayOptions;Landroid/os/Parcel;I)V
    //         goto :goto_0
    */

    public fun zIndex(zIndex: Float): com.google.android.gms.maps.model.GroundOverlayOptions { return TODO("body: (F)Lcom/google/android/gms/maps/model/GroundOverlayOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/GroundOverlayOptions;->ajL:F
    //         return-object p0
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.model.e = null!!
    @JvmField public val NO_DIMENSION: Float = 0.0f
    }
}
