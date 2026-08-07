package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 3 methods.

interface lw: android.os.IInterface {
    public fun onAddGeofencesResult(p0: Int, p1: Array<String>)

    public fun onRemoveGeofencesByPendingIntentResult(p0: Int, p1: android.app.PendingIntent)

    public fun onRemoveGeofencesByRequestIdsResult(p0: Int, p1: Array<String>)

}
