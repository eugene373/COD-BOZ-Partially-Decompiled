package com.google.android.gms.fitness

// Auto-emitted from smali.
// 0 fields, 6 methods.

interface SessionsApi {
    public fun insertSession(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.request.SessionInsertRequest): com.google.android.gms.common.api.PendingResult

    public fun readSession(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.request.SessionReadRequest): com.google.android.gms.common.api.PendingResult

    public fun registerForSessions(p0: com.google.android.gms.common.api.GoogleApiClient, p1: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult

    public fun startSession(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.data.Session): com.google.android.gms.common.api.PendingResult

    public fun stopSession(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun unregisterForSessions(p0: com.google.android.gms.common.api.GoogleApiClient, p1: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult

}
