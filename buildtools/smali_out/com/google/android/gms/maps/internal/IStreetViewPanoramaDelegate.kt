package com.google.android.gms.maps.internal

// Auto-emitted from smali.
// 0 fields, 19 methods.

interface IStreetViewPanoramaDelegate: android.os.IInterface {
    public fun animateTo(p0: com.google.android.gms.maps.model.StreetViewPanoramaCamera, p1: Long)

    public fun enablePanning(p0: Boolean)

    public fun enableStreetNames(p0: Boolean)

    public fun enableUserNavigation(p0: Boolean)

    public fun enableZoom(p0: Boolean)

    public fun getPanoramaCamera(): com.google.android.gms.maps.model.StreetViewPanoramaCamera

    public fun getStreetViewPanoramaLocation(): com.google.android.gms.maps.model.StreetViewPanoramaLocation

    public fun isPanningGesturesEnabled(): Boolean

    public fun isStreetNamesEnabled(): Boolean

    public fun isUserNavigationEnabled(): Boolean

    public fun isZoomGesturesEnabled(): Boolean

    public fun orientationToPoint(p0: com.google.android.gms.maps.model.StreetViewPanoramaOrientation): com.google.android.gms.dynamic.d

    public fun pointToOrientation(p0: com.google.android.gms.dynamic.d): com.google.android.gms.maps.model.StreetViewPanoramaOrientation

    public fun setOnStreetViewPanoramaCameraChangeListener(p0: com.google.android.gms.maps.internal.p)

    public fun setOnStreetViewPanoramaChangeListener(p0: com.google.android.gms.maps.internal.q)

    public fun setOnStreetViewPanoramaClickListener(p0: com.google.android.gms.maps.internal.r)

    public fun setPosition(p0: com.google.android.gms.maps.model.LatLng)

    public fun setPositionWithID(p0: String)

    public fun setPositionWithRadius(p0: com.google.android.gms.maps.model.LatLng, p1: Int)

}
