package com.android.vending.expansion.downloader.impl

// Auto-emitted from smali source: DownloadNotification.java.
// 0 fields, 8 methods.

interface DownloadNotification_ICustomNotification {
    public fun setCurrentBytes(p0: Long)

    public fun setIcon(p0: Int)

    public fun setPendingIntent(p0: android.app.PendingIntent)

    public fun setTicker(p0: CharSequence)

    public fun setTimeRemaining(p0: Long)

    public fun setTitle(p0: CharSequence)

    public fun setTotalBytes(p0: Long)

    public fun updateNotification(p0: android.content.Context): android.app.Notification

}
