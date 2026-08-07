package com.google.android.gms.cast

// Auto-emitted from smali.
// 0 fields, 4 methods.

interface Cast_ApplicationConnectionResult: com.google.android.gms.common.api.Result {
    public fun getApplicationMetadata(): com.google.android.gms.cast.ApplicationMetadata

    public fun getApplicationStatus(): String

    public fun getSessionId(): String

    public fun getWasLaunched(): Boolean

}
