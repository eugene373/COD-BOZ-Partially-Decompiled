package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 15 fields, 31 methods.

class MarkerOptions: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var Nw: String
    private var ajM: Boolean
    private var ajU: Float
    private var ajV: Float
    private var ajl: com.google.android.gms.maps.model.LatLng
    private var akd: String
    private var ake: com.google.android.gms.maps.model.BitmapDescriptor
    private var akf: Boolean
    private var akg: Boolean
    private var akh: Float
    private var aki: Float
    private var akj: Float
    private var mAlpha: Float

    public constructor()

    constructor(versionCode: Int, position: com.google.android.gms.maps.model.LatLng, title: String, snippet: String, wrappedIcon: android.os.IBinder, anchorU: Float, anchorV: Float, draggable: Boolean, visible: Boolean, flat: Boolean, rotation: Float, infoWindowAnchorU: Float, infoWindowAnchorV: Float, alpha: Float)

    public fun alpha(alpha: Float): com.google.android.gms.maps.model.MarkerOptions { return TODO("body: (F)Lcom/google/android/gms/maps/model/MarkerOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->mAlpha:F
    //         return-object p0
    */

    public fun anchor(u: Float, v: Float): com.google.android.gms.maps.model.MarkerOptions { return TODO("body: (FF)Lcom/google/android/gms/maps/model/MarkerOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ajU:F
    //         iput p2, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ajV:F
    //         return-object p0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun draggable(draggable: Boolean): com.google.android.gms.maps.model.MarkerOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/model/MarkerOptions;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->akf:Z
    //         return-object p0
    */

    public fun flat(flat: Boolean): com.google.android.gms.maps.model.MarkerOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/model/MarkerOptions;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->akg:Z
    //         return-object p0
    */

    public fun getAlpha(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->mAlpha:F
    //         return v0
    */

    public fun getAnchorU(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ajU:F
    //         return v0
    */

    public fun getAnchorV(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ajV:F
    //         return v0
    */

    public fun getIcon(): com.google.android.gms.maps.model.BitmapDescriptor { return TODO("body: ()Lcom/google/android/gms/maps/model/BitmapDescriptor;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ake:Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         return-object v0
    */

    public fun getInfoWindowAnchorU(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->aki:F
    //         return v0
    */

    public fun getInfoWindowAnchorV(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->akj:F
    //         return v0
    */

    public fun getPosition(): com.google.android.gms.maps.model.LatLng { return TODO("body: ()Lcom/google/android/gms/maps/model/LatLng;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ajl:Lcom/google/android/gms/maps/model/LatLng;
    //         return-object v0
    */

    public fun getRotation(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->akh:F
    //         return v0
    */

    public fun getSnippet(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->akd:Ljava/lang/String;
    //         return-object v0
    */

    public fun getTitle(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->Nw:Ljava/lang/String;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->BR:I
    //         return v0
    */

    public fun icon(icon: com.google.android.gms.maps.model.BitmapDescriptor): com.google.android.gms.maps.model.MarkerOptions { return TODO("body: (Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ake:Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         return-object p0
    */

    public fun infoWindowAnchor(u: Float, v: Float): com.google.android.gms.maps.model.MarkerOptions { return TODO("body: (FF)Lcom/google/android/gms/maps/model/MarkerOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->aki:F
    //         iput p2, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->akj:F
    //         return-object p0
    */

    public fun isDraggable(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->akf:Z
    //         return v0
    */

    public fun isFlat(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->akg:Z
    //         return v0
    */

    public fun isVisible(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ajM:Z
    //         return v0
    */

    fun mP(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ake:Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ake:Lcom/google/android/gms/maps/model/BitmapDescriptor;
    //         invoke-virtual {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptor;->mo()Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/dynamic/d;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun position(position: com.google.android.gms.maps.model.LatLng): com.google.android.gms.maps.model.MarkerOptions { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ajl:Lcom/google/android/gms/maps/model/LatLng;
    //         return-object p0
    */

    public fun rotation(rotation: Float): com.google.android.gms.maps.model.MarkerOptions { return TODO("body: (F)Lcom/google/android/gms/maps/model/MarkerOptions;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->akh:F
    //         return-object p0
    */

    public fun snippet(snippet: String): com.google.android.gms.maps.model.MarkerOptions { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->akd:Ljava/lang/String;
    //         return-object p0
    */

    public fun title(title: String): com.google.android.gms.maps.model.MarkerOptions { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->Nw:Ljava/lang/String;
    //         return-object p0
    */

    public fun visible(visible: Boolean): com.google.android.gms.maps.model.MarkerOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/model/MarkerOptions;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/maps/model/MarkerOptions;->ajM:Z
    //         return-object p0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         invoke-static {}, Lcom/google/android/gms/maps/internal/v;->mM()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/l;->a(Lcom/google/android/gms/maps/model/MarkerOptions;Landroid/os/Parcel;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/model/k;->a(Lcom/google/android/gms/maps/model/MarkerOptions;Landroid/os/Parcel;I)V
    //         goto :goto_0
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.model.k = null!!
    }
}
