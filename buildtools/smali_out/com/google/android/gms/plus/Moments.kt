package com.google.android.gms.plus

// Auto-emitted from smali.
// 0 fields, 4 methods.

interface Moments {
    public fun load(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult

    public fun load(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int, p2: String, p3: android.net.Uri, p4: String, p5: String): com.google.android.gms.common.api.PendingResult

    public fun remove(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String): com.google.android.gms.common.api.PendingResult

    public fun write(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.plus.model.moments.Moment): com.google.android.gms.common.api.PendingResult

}
