package com.google.android.gms.games.event

// Auto-emitted from smali.
// 0 fields, 12 methods.

interface Event: android.os.Parcelable, com.google.android.gms.common.data.Freezable {
    public fun getDescription(): String

    public fun getDescription(p0: android.database.CharArrayBuffer)

    public fun getEventId(): String

    public fun getFormattedValue(): String

    public fun getFormattedValue(p0: android.database.CharArrayBuffer)

    public fun getIconImageUri(): android.net.Uri

    public fun getIconImageUrl(): String

    public fun getName(): String

    public fun getName(p0: android.database.CharArrayBuffer)

    public fun getPlayer(): com.google.android.gms.games.Player

    public fun getValue(): Long

    public fun isVisible(): Boolean

}
