package com.google.android.gms.games.request

// Auto-emitted from smali.
// 7 fields, 11 methods.

interface GameRequest: android.os.Parcelable, com.google.android.gms.common.data.Freezable {
    public fun getCreationTimestamp(): Long

    public fun getData(): ByteArray

    public fun getExpirationTimestamp(): Long

    public fun getGame(): com.google.android.gms.games.Game

    public fun getRecipientStatus(p0: String): Int

    public fun getRecipients(): java.util.List

    public fun getRequestId(): String

    public fun getSender(): com.google.android.gms.games.Player

    public fun getStatus(): Int

    public fun getType(): Int

    public fun isConsumed(p0: String): Boolean

    companion object {
    @JvmField public val RECIPIENT_STATUS_ACCEPTED: Int = 0x1
    @JvmField public val RECIPIENT_STATUS_PENDING: Int = 0x0
    @JvmField public val STATUS_ACCEPTED: Int = 0x1
    @JvmField public val STATUS_PENDING: Int = 0x0
    @JvmField public val TYPE_ALL: Int = 0xffff
    @JvmField public val TYPE_GIFT: Int = 0x1
    @JvmField public val TYPE_WISH: Int = 0x2
    }
}
