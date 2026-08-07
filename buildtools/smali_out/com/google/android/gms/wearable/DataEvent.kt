package com.google.android.gms.wearable

// Auto-emitted from smali.
// 2 fields, 2 methods.

interface DataEvent: com.google.android.gms.common.data.Freezable {
    public fun getDataItem(): com.google.android.gms.wearable.DataItem

    public fun getType(): Int

    companion object {
    @JvmField public val TYPE_CHANGED: Int = 0x1
    @JvmField public val TYPE_DELETED: Int = 0x2
    }
}
