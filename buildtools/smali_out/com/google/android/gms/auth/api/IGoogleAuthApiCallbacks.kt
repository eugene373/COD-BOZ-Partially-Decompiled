package com.google.android.gms.auth.api

// Auto-emitted from smali.
// 0 fields, 2 methods.

interface IGoogleAuthApiCallbacks: android.os.IInterface {
    public fun onConnectionSuccess(p0: com.google.android.gms.auth.api.GoogleAuthApiResponse)

    public fun onError(p0: Int, p1: String, p2: android.app.PendingIntent)

}
