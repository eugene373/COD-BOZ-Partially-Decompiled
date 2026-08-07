package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 3 fields, 7 methods.

class StreetViewPanoramaCamera_Builder {
    public var bearing: Float
    public var tilt: Float
    public var zoom: Float

    public constructor()

    public constructor(previous: com.google.android.gms.maps.model.StreetViewPanoramaCamera)

    public fun bearing(bearing: Float): com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder { return TODO("body: (F)Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->bearing:F
    //         return-object p0
    */

    public fun build(): com.google.android.gms.maps.model.StreetViewPanoramaCamera { return TODO("body: ()Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;") }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;
    //         iget v1, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->zoom:F
    //         iget v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->tilt:F
    //         iget v3, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->bearing:F
    //         invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;-><init>(FFF)V
    //         return-object v0
    */

    public fun orientation(orientation: com.google.android.gms.maps.model.StreetViewPanoramaOrientation): com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder { return TODO("body: (Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;") }
    /*
    //         .locals 1
    //         iget v0, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;->tilt:F
    //         iput v0, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->tilt:F
    //         iget v0, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;->bearing:F
    //         iput v0, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->bearing:F
    //         return-object p0
    */

    public fun tilt(tilt: Float): com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder { return TODO("body: (F)Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->tilt:F
    //         return-object p0
    */

    public fun zoom(zoom: Float): com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder { return TODO("body: (F)Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->zoom:F
    //         return-object p0
    */

}
