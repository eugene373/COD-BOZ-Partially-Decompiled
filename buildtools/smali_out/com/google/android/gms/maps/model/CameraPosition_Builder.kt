package com.google.android.gms.maps.model

// Auto-emitted from smali.
// 4 fields, 7 methods.

class CameraPosition_Builder {
    private var ajB: com.google.android.gms.maps.model.LatLng
    private var ajC: Float
    private var ajD: Float
    private var ajE: Float

    public constructor()

    public constructor(previous: com.google.android.gms.maps.model.CameraPosition)

    public fun bearing(bearing: Float): com.google.android.gms.maps.model.CameraPosition.Builder { return TODO("body: (F)Lcom/google/android/gms/maps/model/CameraPosition$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->ajE:F
    //         return-object p0
    */

    public fun build(): com.google.android.gms.maps.model.CameraPosition { return TODO("body: ()Lcom/google/android/gms/maps/model/CameraPosition;") }
    /*
    //         .locals 5
    //         new-instance v0, Lcom/google/android/gms/maps/model/CameraPosition;
    //         iget-object v1, p0, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->ajB:Lcom/google/android/gms/maps/model/LatLng;
    //         iget v2, p0, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->ajC:F
    //         iget v3, p0, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->ajD:F
    //         iget v4, p0, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->ajE:F
    //         invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/CameraPosition;-><init>(Lcom/google/android/gms/maps/model/LatLng;FFF)V
    //         return-object v0
    */

    public fun target(location: com.google.android.gms.maps.model.LatLng): com.google.android.gms.maps.model.CameraPosition.Builder { return TODO("body: (Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CameraPosition$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->ajB:Lcom/google/android/gms/maps/model/LatLng;
    //         return-object p0
    */

    public fun tilt(tilt: Float): com.google.android.gms.maps.model.CameraPosition.Builder { return TODO("body: (F)Lcom/google/android/gms/maps/model/CameraPosition$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->ajD:F
    //         return-object p0
    */

    public fun zoom(zoom: Float): com.google.android.gms.maps.model.CameraPosition.Builder { return TODO("body: (F)Lcom/google/android/gms/maps/model/CameraPosition$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/maps/model/CameraPosition$Builder;->ajC:F
    //         return-object p0
    */

}
