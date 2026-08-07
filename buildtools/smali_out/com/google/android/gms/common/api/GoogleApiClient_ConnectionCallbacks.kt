package com.google.android.gms.common.api

// Auto-emitted from smali.
// 2 fields, 2 methods.

interface GoogleApiClient_ConnectionCallbacks {
    public fun onConnected(p0: android.os.Bundle)

    public fun onConnectionSuspended(p0: Int)

    companion object {
    @JvmField public val CAUSE_NETWORK_LOST: Int = 0x2
    @JvmField public val CAUSE_SERVICE_DISCONNECTED: Int = 0x1
    }
}
