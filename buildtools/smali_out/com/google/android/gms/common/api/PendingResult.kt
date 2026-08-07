package com.google.android.gms.common.api

// Auto-emitted from smali.
// 0 fields, 7 methods.

interface PendingResult {
    public fun a(p0: com.google.android.gms.common.api.PendingResult.a)

    public fun await(): com.google.android.gms.common.api.Result

    public fun await(p0: Long, p1: java.util.concurrent.TimeUnit): com.google.android.gms.common.api.Result

    public fun cancel()

    public fun isCanceled(): Boolean

    public fun setResultCallback(p0: com.google.android.gms.common.api.ResultCallback)

    public fun setResultCallback(p0: com.google.android.gms.common.api.ResultCallback, p1: Long, p2: java.util.concurrent.TimeUnit)

}
