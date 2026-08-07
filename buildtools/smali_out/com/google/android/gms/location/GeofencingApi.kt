package com.google.android.gms.location

// Auto-emitted from smali.
// 0 fields, 3 methods.

interface GeofencingApi {
    public fun addGeofences(p0: com.google.android.gms.common.api.GoogleApiClient, p1: java.util.List, p2: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult

    public fun removeGeofences(p0: com.google.android.gms.common.api.GoogleApiClient, p1: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult

    public fun removeGeofences(p0: com.google.android.gms.common.api.GoogleApiClient, p1: java.util.List): com.google.android.gms.common.api.PendingResult

}
