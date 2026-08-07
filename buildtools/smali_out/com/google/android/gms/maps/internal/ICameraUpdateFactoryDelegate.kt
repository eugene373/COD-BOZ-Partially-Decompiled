package com.google.android.gms.maps.internal

// Auto-emitted from smali.
// 0 fields, 11 methods.

interface ICameraUpdateFactoryDelegate: android.os.IInterface {
    public fun newCameraPosition(p0: com.google.android.gms.maps.model.CameraPosition): com.google.android.gms.dynamic.d

    public fun newLatLng(p0: com.google.android.gms.maps.model.LatLng): com.google.android.gms.dynamic.d

    public fun newLatLngBounds(p0: com.google.android.gms.maps.model.LatLngBounds, p1: Int): com.google.android.gms.dynamic.d

    public fun newLatLngBoundsWithSize(p0: com.google.android.gms.maps.model.LatLngBounds, p1: Int, p2: Int, p3: Int): com.google.android.gms.dynamic.d

    public fun newLatLngZoom(p0: com.google.android.gms.maps.model.LatLng, p1: Float): com.google.android.gms.dynamic.d

    public fun scrollBy(p0: Float, p1: Float): com.google.android.gms.dynamic.d

    public fun zoomBy(p0: Float): com.google.android.gms.dynamic.d

    public fun zoomByWithFocus(p0: Float, p1: Int, p2: Int): com.google.android.gms.dynamic.d

    public fun zoomIn(): com.google.android.gms.dynamic.d

    public fun zoomOut(): com.google.android.gms.dynamic.d

    public fun zoomTo(p0: Float): com.google.android.gms.dynamic.d

}
