package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 0 fields, 13 methods.

interface NotificationCompat_NotificationCompatImpl {
    public fun build(p0: android.support.v4.app.NotificationCompat.Builder): android.app.Notification

    public fun getAction(p0: android.app.Notification, p1: Int): android.support.v4.app.NotificationCompat.Action

    public fun getActionCount(p0: android.app.Notification): Int

    public fun getActionsFromParcelableArrayList(p0: java.util.ArrayList): Array<android.support.v4.app.NotificationCompat.Action>

    public fun getBundleForUnreadConversation(p0: android.support.v4.app.NotificationCompatBase.UnreadConversation): android.os.Bundle

    public fun getCategory(p0: android.app.Notification): String

    public fun getExtras(p0: android.app.Notification): android.os.Bundle

    public fun getGroup(p0: android.app.Notification): String

    public fun getLocalOnly(p0: android.app.Notification): Boolean

    public fun getParcelableArrayListForActions(p0: Array<android.support.v4.app.NotificationCompat.Action>): java.util.ArrayList

    public fun getSortKey(p0: android.app.Notification): String

    public fun getUnreadConversationFromBundle(p0: android.os.Bundle, p1: android.support.v4.app.NotificationCompatBase.UnreadConversation.Factory, p2: android.support.v4.app.RemoteInputCompatBase.RemoteInput.Factory): android.support.v4.app.NotificationCompatBase.UnreadConversation

    public fun isGroupSummary(p0: android.app.Notification): Boolean

}
