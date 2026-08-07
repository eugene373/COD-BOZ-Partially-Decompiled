package com.google.android.gms.maps

// Auto-emitted from smali.
// 11 fields, 29 methods.

class StreetViewPanoramaOptions: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var aiH: Boolean
    private var aiN: Boolean
    private var ajj: com.google.android.gms.maps.model.StreetViewPanoramaCamera
    private var ajk: String
    private var ajl: com.google.android.gms.maps.model.LatLng
    private var ajm: Integer
    private var ajn: Boolean
    private var ajo: Boolean
    private var ajp: Boolean

    public constructor()

    constructor(versionCode: Int, camera: com.google.android.gms.maps.model.StreetViewPanoramaCamera, panoId: String, position: com.google.android.gms.maps.model.LatLng, radius: Integer, userNavigationEnabled: Byte, zoomGesturesEnabled: Byte, panningGesturesEnabled: Byte, streetNamesEnabled: Byte, useViewLifecycleInFragment: Byte)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getPanningGesturesEnabled(): Boolean { return TODO("body: ()Ljava/lang/Boolean;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajo:Ljava/lang/Boolean;
    //         return-object v0
    */

    public fun getPanoramaId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajk:Ljava/lang/String;
    //         return-object v0
    */

    public fun getPosition(): com.google.android.gms.maps.model.LatLng { return TODO("body: ()Lcom/google/android/gms/maps/model/LatLng;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajl:Lcom/google/android/gms/maps/model/LatLng;
    //         return-object v0
    */

    public fun getRadius(): Integer { return TODO("body: ()Ljava/lang/Integer;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajm:Ljava/lang/Integer;
    //         return-object v0
    */

    public fun getStreetNamesEnabled(): Boolean { return TODO("body: ()Ljava/lang/Boolean;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajp:Ljava/lang/Boolean;
    //         return-object v0
    */

    public fun getStreetViewPanoramaCamera(): com.google.android.gms.maps.model.StreetViewPanoramaCamera { return TODO("body: ()Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajj:Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;
    //         return-object v0
    */

    public fun getUseViewLifecycleInFragment(): Boolean { return TODO("body: ()Ljava/lang/Boolean;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->aiH:Ljava/lang/Boolean;
    //         return-object v0
    */

    public fun getUserNavigationEnabled(): Boolean { return TODO("body: ()Ljava/lang/Boolean;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajn:Ljava/lang/Boolean;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->BR:I
    //         return v0
    */

    public fun getZoomGesturesEnabled(): Boolean { return TODO("body: ()Ljava/lang/Boolean;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->aiN:Ljava/lang/Boolean;
    //         return-object v0
    */

    fun mE(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajn:Ljava/lang/Boolean;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/a;->c(Ljava/lang/Boolean;)B
    //         move-result v0
    //         return v0
    */

    fun mF(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajo:Ljava/lang/Boolean;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/a;->c(Ljava/lang/Boolean;)B
    //         move-result v0
    //         return v0
    */

    fun mG(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajp:Ljava/lang/Boolean;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/a;->c(Ljava/lang/Boolean;)B
    //         move-result v0
    //         return v0
    */

    fun ms(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->aiH:Ljava/lang/Boolean;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/a;->c(Ljava/lang/Boolean;)B
    //         move-result v0
    //         return v0
    */

    fun mw(): Byte { return TODO("body: ()B") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->aiN:Ljava/lang/Boolean;
    //         invoke-static {v0}, Lcom/google/android/gms/maps/internal/a;->c(Ljava/lang/Boolean;)B
    //         move-result v0
    //         return v0
    */

    public fun panningGesturesEnabled(enabled: Boolean): com.google.android.gms.maps.StreetViewPanoramaOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/StreetViewPanoramaOptions;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajo:Ljava/lang/Boolean;
    //         return-object p0
    */

    public fun panoramaCamera(camera: com.google.android.gms.maps.model.StreetViewPanoramaCamera): com.google.android.gms.maps.StreetViewPanoramaOptions { return TODO("body: (Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;)Lcom/google/android/gms/maps/StreetViewPanoramaOptions;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajj:Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;
    //         return-object p0
    */

    public fun panoramaId(panoId: String): com.google.android.gms.maps.StreetViewPanoramaOptions { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/maps/StreetViewPanoramaOptions;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajk:Ljava/lang/String;
    //         return-object p0
    */

    public fun position(position: com.google.android.gms.maps.model.LatLng): com.google.android.gms.maps.StreetViewPanoramaOptions { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/StreetViewPanoramaOptions;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajl:Lcom/google/android/gms/maps/model/LatLng;
    //         return-object p0
    */

    public fun position(position: com.google.android.gms.maps.model.LatLng, radius: Integer): com.google.android.gms.maps.StreetViewPanoramaOptions { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/Integer;)Lcom/google/android/gms/maps/StreetViewPanoramaOptions;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajl:Lcom/google/android/gms/maps/model/LatLng;
    //         iput-object p2, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajm:Ljava/lang/Integer;
    //         return-object p0
    */

    public fun streetNamesEnabled(enabled: Boolean): com.google.android.gms.maps.StreetViewPanoramaOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/StreetViewPanoramaOptions;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajp:Ljava/lang/Boolean;
    //         return-object p0
    */

    public fun useViewLifecycleInFragment(useViewLifecycleInFragment: Boolean): com.google.android.gms.maps.StreetViewPanoramaOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/StreetViewPanoramaOptions;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->aiH:Ljava/lang/Boolean;
    //         return-object p0
    */

    public fun userNavigationEnabled(enabled: Boolean): com.google.android.gms.maps.StreetViewPanoramaOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/StreetViewPanoramaOptions;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->ajn:Ljava/lang/Boolean;
    //         return-object p0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/StreetViewPanoramaOptions;Landroid/os/Parcel;I)V
    //         return-void
    */

    public fun zoomGesturesEnabled(enabled: Boolean): com.google.android.gms.maps.StreetViewPanoramaOptions { return TODO("body: (Z)Lcom/google/android/gms/maps/StreetViewPanoramaOptions;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaOptions;->aiN:Ljava/lang/Boolean;
    //         return-object p0
    */

    companion object {
    @JvmField public val CREATOR: com.google.android.gms.maps.c = null!!
    }
}
