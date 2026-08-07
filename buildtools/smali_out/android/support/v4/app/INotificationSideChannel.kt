package android.support.v4.app

// Auto-emitted from smali source: INotificationSideChannel.java.
// 0 fields, 3 methods.

interface INotificationSideChannel: android.os.IInterface {
    public fun cancel(p0: String, p1: Int, p2: String)

    public fun cancelAll(p0: String)

    public fun notify(p0: String, p1: Int, p2: String, p3: android.app.Notification)

}
