package com.google.android.gms.appstate

// Auto-emitted from smali.
// 0 fields, 6 methods.

interface AppState: com.google.android.gms.common.data.Freezable {
    public fun getConflictData(): ByteArray

    public fun getConflictVersion(): String

    public fun getKey(): Int

    public fun getLocalData(): ByteArray

    public fun getLocalVersion(): String

    public fun hasConflict(): Boolean

}
