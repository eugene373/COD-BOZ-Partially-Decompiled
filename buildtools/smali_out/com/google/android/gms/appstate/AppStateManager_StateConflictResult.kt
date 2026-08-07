package com.google.android.gms.appstate

// Auto-emitted from smali.
// 0 fields, 4 methods.

interface AppStateManager_StateConflictResult: com.google.android.gms.common.api.Releasable, com.google.android.gms.common.api.Result {
    public fun getLocalData(): ByteArray

    public fun getResolvedVersion(): String

    public fun getServerData(): ByteArray

    public fun getStateKey(): Int

}
