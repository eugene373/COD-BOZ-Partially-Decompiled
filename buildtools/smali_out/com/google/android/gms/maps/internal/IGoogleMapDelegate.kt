package com.google.android.gms.maps.internal

// Auto-emitted from smali.
// 0 fields, 43 methods.

interface IGoogleMapDelegate: android.os.IInterface {
    public fun addCircle(p0: com.google.android.gms.maps.model.CircleOptions): com.google.android.gms.maps.model.internal.b

    public fun addGroundOverlay(p0: com.google.android.gms.maps.model.GroundOverlayOptions): com.google.android.gms.maps.model.internal.c

    public fun addMarker(p0: com.google.android.gms.maps.model.MarkerOptions): com.google.android.gms.maps.model.internal.f

    public fun addPolygon(p0: com.google.android.gms.maps.model.PolygonOptions): com.google.android.gms.maps.model.internal.g

    public fun addPolyline(p0: com.google.android.gms.maps.model.PolylineOptions): com.google.android.gms.maps.model.internal.IPolylineDelegate

    public fun addTileOverlay(p0: com.google.android.gms.maps.model.TileOverlayOptions): com.google.android.gms.maps.model.internal.h

    public fun animateCamera(p0: com.google.android.gms.dynamic.d)

    public fun animateCameraWithCallback(p0: com.google.android.gms.dynamic.d, p1: com.google.android.gms.maps.internal.b)

    public fun animateCameraWithDurationAndCallback(p0: com.google.android.gms.dynamic.d, p1: Int, p2: com.google.android.gms.maps.internal.b)

    public fun clear()

    public fun getCameraPosition(): com.google.android.gms.maps.model.CameraPosition

    public fun getFocusedBuilding(): com.google.android.gms.maps.model.internal.d

    public fun getMapType(): Int

    public fun getMaxZoomLevel(): Float

    public fun getMinZoomLevel(): Float

    public fun getMyLocation(): android.location.Location

    public fun getProjection(): com.google.android.gms.maps.internal.IProjectionDelegate

    public fun getUiSettings(): com.google.android.gms.maps.internal.IUiSettingsDelegate

    public fun isBuildingsEnabled(): Boolean

    public fun isIndoorEnabled(): Boolean

    public fun isMyLocationEnabled(): Boolean

    public fun isTrafficEnabled(): Boolean

    public fun moveCamera(p0: com.google.android.gms.dynamic.d)

    public fun setBuildingsEnabled(p0: Boolean)

    public fun setIndoorEnabled(p0: Boolean): Boolean

    public fun setInfoWindowAdapter(p0: com.google.android.gms.maps.internal.d)

    public fun setLocationSource(p0: com.google.android.gms.maps.internal.ILocationSourceDelegate)

    public fun setMapType(p0: Int)

    public fun setMyLocationEnabled(p0: Boolean)

    public fun setOnCameraChangeListener(p0: com.google.android.gms.maps.internal.e)

    public fun setOnIndoorStateChangeListener(p0: com.google.android.gms.maps.internal.f)

    public fun setOnInfoWindowClickListener(p0: com.google.android.gms.maps.internal.g)

    public fun setOnMapClickListener(p0: com.google.android.gms.maps.internal.i)

    public fun setOnMapLoadedCallback(p0: com.google.android.gms.maps.internal.j)

    public fun setOnMapLongClickListener(p0: com.google.android.gms.maps.internal.k)

    public fun setOnMarkerClickListener(p0: com.google.android.gms.maps.internal.l)

    public fun setOnMarkerDragListener(p0: com.google.android.gms.maps.internal.m)

    public fun setOnMyLocationButtonClickListener(p0: com.google.android.gms.maps.internal.n)

    public fun setOnMyLocationChangeListener(p0: com.google.android.gms.maps.internal.o)

    public fun setPadding(p0: Int, p1: Int, p2: Int, p3: Int)

    public fun setTrafficEnabled(p0: Boolean)

    public fun snapshot(p0: com.google.android.gms.maps.internal.s, p1: com.google.android.gms.dynamic.d)

    public fun stopAnimation()

}
