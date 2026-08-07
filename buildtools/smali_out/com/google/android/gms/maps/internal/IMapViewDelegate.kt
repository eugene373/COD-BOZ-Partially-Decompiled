package com.google.android.gms.maps.internal

// Auto-emitted from smali.
// 0 fields, 8 methods.

interface IMapViewDelegate: android.os.IInterface {
    public fun getMap(): com.google.android.gms.maps.internal.IGoogleMapDelegate

    public fun getView(): com.google.android.gms.dynamic.d

    public fun onCreate(p0: android.os.Bundle)

    public fun onDestroy()

    public fun onLowMemory()

    public fun onPause()

    public fun onResume()

    public fun onSaveInstanceState(p0: android.os.Bundle)

}
