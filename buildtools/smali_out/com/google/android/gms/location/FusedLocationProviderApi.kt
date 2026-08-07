package com.google.android.gms.location

// Auto-emitted from smali.
// 2 fields, 8 methods.

interface FusedLocationProviderApi {
    public fun getLastLocation(p0: com.google.android.gms.common.api.GoogleApiClient): android.location.Location

    public fun removeLocationUpdates(p0: com.google.android.gms.common.api.GoogleApiClient, p1: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult

    public fun removeLocationUpdates(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.location.LocationListener): com.google.android.gms.common.api.PendingResult

    public fun requestLocationUpdates(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.location.LocationRequest, p2: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult

    public fun requestLocationUpdates(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.location.LocationRequest, p2: com.google.android.gms.location.LocationListener): com.google.android.gms.common.api.PendingResult

    public fun requestLocationUpdates(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.location.LocationRequest, p2: com.google.android.gms.location.LocationListener, p3: android.os.Looper): com.google.android.gms.common.api.PendingResult

    public fun setMockLocation(p0: com.google.android.gms.common.api.GoogleApiClient, p1: android.location.Location): com.google.android.gms.common.api.PendingResult

    public fun setMockMode(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Boolean): com.google.android.gms.common.api.PendingResult

    companion object {
    @JvmField public val KEY_LOCATION_CHANGED: String = "com.google.android.location.LOCATION"
    @JvmField public val KEY_MOCK_LOCATION: String = "mockLocation"
    }
}
