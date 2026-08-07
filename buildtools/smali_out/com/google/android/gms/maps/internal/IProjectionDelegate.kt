package com.google.android.gms.maps.internal

// Auto-emitted from smali.
// 0 fields, 3 methods.

interface IProjectionDelegate: android.os.IInterface {
    public fun fromScreenLocation(p0: com.google.android.gms.dynamic.d): com.google.android.gms.maps.model.LatLng

    public fun getVisibleRegion(): com.google.android.gms.maps.model.VisibleRegion

    public fun toScreenLocation(p0: com.google.android.gms.maps.model.LatLng): com.google.android.gms.dynamic.d

}
