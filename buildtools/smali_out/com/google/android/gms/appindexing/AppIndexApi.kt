package com.google.android.gms.appindexing

// Auto-emitted from smali.
// 0 fields, 4 methods.

interface AppIndexApi {
    public fun view(p0: com.google.android.gms.common.api.GoogleApiClient, p1: android.app.Activity, p2: android.content.Intent, p3: String, p4: android.net.Uri, p5: java.util.List): com.google.android.gms.common.api.PendingResult

    public fun view(p0: com.google.android.gms.common.api.GoogleApiClient, p1: android.app.Activity, p2: android.net.Uri, p3: String, p4: android.net.Uri, p5: java.util.List): com.google.android.gms.common.api.PendingResult

    public fun viewEnd(p0: com.google.android.gms.common.api.GoogleApiClient, p1: android.app.Activity, p2: android.content.Intent): com.google.android.gms.common.api.PendingResult

    public fun viewEnd(p0: com.google.android.gms.common.api.GoogleApiClient, p1: android.app.Activity, p2: android.net.Uri): com.google.android.gms.common.api.PendingResult

}
