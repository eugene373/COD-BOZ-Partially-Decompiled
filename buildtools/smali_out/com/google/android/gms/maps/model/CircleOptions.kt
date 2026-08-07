package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 9 fields, 20 methods.

class CircleOptions: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var ajG: com.google.android.gms.maps.model.LatLng
    private var ajH: Double
    private var ajI: Float
    private var ajJ: Int
    private var ajK: Int
    private var ajL: Float
    private var ajM: Boolean

    public constructor()

    constructor(versionCode: Int, center: com.google.android.gms.maps.model.LatLng, radius: Double, strokeWidth: Float, strokeColor: Int, fillColor: Int, zIndex: Float, visible: Boolean)

    public fun center(center: com.google.android.gms.maps.model.LatLng): com.google.android.gms.maps.model.CircleOptions { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajG:Lcom/google/android/gms/maps/model/LatLng;
    //         return-object p0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun fillColor(color: Int): com.google.android.gms.maps.model.CircleOptions { return TODO("body: (I)Lcom/google/android/gms/maps/model/CircleOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajK:I
    //         return-object p0
    */

    public fun getCenter(): com.google.android.gms.maps.model.LatLng { return TODO("body: ()Lcom/google/android/gms/maps/model/LatLng;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajG:Lcom/google/android/gms/maps/model/LatLng;
    //         return-object v0
    */

    public fun getFillColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajK:I
    //         return v0
    */

    public fun getRadius(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajH:D
    //         return-wide v0
    */

    public fun getStrokeColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajJ:I
    //         return v0
    */

    public fun getStrokeWidth(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajI:F
    //         return v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/CircleOptions;->BR:I
    //         return v0
    */

    public fun getZIndex(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajL:F
    //         return v0
    */

    public fun isVisible(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajM:Z
    //         return v0
    */

    public fun radius(radius: Double): com.google.android.gms.maps.model.CircleOptions { return TODO("body: (D)Lcom/google/android/gms/maps/model/CircleOptions;") }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajH:D
    //         return-object p0
    */

    public fun strokeColor(color: Int): com.google.android.gms.maps.model.CircleOptions { return TODO("body: (I)Lcom/google/android/gms/maps/model/CircleOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajJ:I
    //         return-object p0
    */

    public fun strokeWidth(width: Float): com.google.android.gms.maps.model.CircleOptions { return TODO("body: (F)Lcom/google/android/gms/maps/model/CircleOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajI:F
    //         return-object p0
    */

    public fun visible(visible: Boolean): com.google.android.gms.maps.model.CircleOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/model/CircleOptions;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajM:Z
    //         return-object p0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/maps/internal/v;->mM()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/d;->a(Lcom/google/android/gms/maps/model/CircleOptions;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;Landroid/os/Parcel;I)V
    //         goto :goto_0
    */

    public fun zIndex(zIndex: Float): com.google.android.gms.maps.model.CircleOptions { return TODO("body: (F)Lcom/google/android/gms/maps/model/CircleOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/CircleOptions;->ajL:F
    //         return-object p0
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.model.c = null!!
    }
}
