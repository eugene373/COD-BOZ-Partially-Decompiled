package com.google.android.gms.common.api

// Auto-emitted from smali.
// 0 fields, 20 methods.

interface GoogleApiClient {
    public fun a(p0: com.google.android.gms.common.api.Api.c): com.google.android.gms.common.api.Api.a

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.a): com.google.android.gms.common.api.BaseImplementation.a

    public fun a(p0: com.google.android.gms.common.api.Scope): Boolean

    public fun b(p0: com.google.android.gms.common.api.BaseImplementation.a): com.google.android.gms.common.api.BaseImplementation.a

    public fun blockingConnect(): com.google.android.gms.common.ConnectionResult

    public fun blockingConnect(p0: Long, p1: java.util.concurrent.TimeUnit): com.google.android.gms.common.ConnectionResult

    public fun c(p0: Object): com.google.android.gms.common.api.c

    public fun connect()

    public fun disconnect()

    public fun getLooper(): android.os.Looper

    public fun isConnected(): Boolean

    public fun isConnecting(): Boolean

    public fun isConnectionCallbacksRegistered(p0: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks): Boolean

    public fun isConnectionFailedListenerRegistered(p0: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): Boolean

    public fun reconnect()

    public fun registerConnectionCallbacks(p0: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)

    public fun registerConnectionFailedListener(p0: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)

    public fun stopAutoManage(p0: android.support.v4.app.FragmentActivity)

    public fun unregisterConnectionCallbacks(p0: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)

    public fun unregisterConnectionFailedListener(p0: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)

}
