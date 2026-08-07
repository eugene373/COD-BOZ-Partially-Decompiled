package com.google.android.gms.maps.internal

// Auto-emitted from smali.
// 0 fields, 11 methods.

interface IStreetViewPanoramaFragmentDelegate: android.os.IInterface {
    public fun getStreetViewPanorama(): com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate

    public fun isReady(): Boolean

    public fun onCreate(p0: android.os.Bundle)

    public fun onCreateView(p0: com.google.android.gms.dynamic.d, p1: com.google.android.gms.dynamic.d, p2: android.os.Bundle): com.google.android.gms.dynamic.d

    public fun onDestroy()

    public fun onDestroyView()

    public fun onInflate(p0: com.google.android.gms.dynamic.d, p1: com.google.android.gms.maps.StreetViewPanoramaOptions, p2: android.os.Bundle)

    public fun onLowMemory()

    public fun onPause()

    public fun onResume()

    public fun onSaveInstanceState(p0: android.os.Bundle)

}
