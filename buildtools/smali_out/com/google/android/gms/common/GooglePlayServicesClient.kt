package com.google.android.gms.common

// Auto-emitted from smali.
// 0 fields, 10 methods.

interface GooglePlayServicesClient {
    public fun connect()

    public fun disconnect()

    public fun isConnected(): Boolean

    public fun isConnecting(): Boolean

    public fun isConnectionCallbacksRegistered(p0: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks): Boolean

    public fun isConnectionFailedListenerRegistered(p0: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener): Boolean

    public fun registerConnectionCallbacks(p0: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks)

    public fun registerConnectionFailedListener(p0: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)

    public fun unregisterConnectionCallbacks(p0: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks)

    public fun unregisterConnectionFailedListener(p0: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)

}
