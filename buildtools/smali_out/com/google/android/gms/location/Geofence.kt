package com.google.android.gms.location

// Auto-emitted from smali.
// 4 fields, 1 methods.

interface Geofence {
    public fun getRequestId(): String

    companion object {
    @JvmField public val GEOFENCE_TRANSITION_DWELL: Int = 0x4
    @JvmField public val GEOFENCE_TRANSITION_ENTER: Int = 0x1
    @JvmField public val GEOFENCE_TRANSITION_EXIT: Int = 0x2
    @JvmField public val NEVER_EXPIRE: Long = 0L
    }
}
