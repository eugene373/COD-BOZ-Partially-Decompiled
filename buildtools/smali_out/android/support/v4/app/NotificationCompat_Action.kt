package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 6 fields, 11 methods.

open class NotificationCompat_Action: android.support.v4.app.NotificationCompatBase.Action() {
    public var actionIntent: android.app.PendingIntent
    public var icon: Int
    private val mExtras: android.os.Bundle
    private val mRemoteInputs: Array<android.support.v4.app.RemoteInput>
    public var title: CharSequence

    public constructor(icon: Int, title: CharSequence, intent: android.app.PendingIntent)

    private constructor(icon: Int, title: CharSequence, intent: android.app.PendingIntent, extras: android.os.Bundle, remoteInputs: Array<android.support.v4.app.RemoteInput>)

    constructor(x0: Int, x1: CharSequence, x2: android.app.PendingIntent, x3: android.os.Bundle, x4: Array<android.support.v4.app.RemoteInput>, x5: android.support.v4.app.NotificationCompat.1)

    protected fun getActionIntent(): android.app.PendingIntent { return TODO("body: ()Landroid/app/PendingIntent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->actionIntent:Landroid/app/PendingIntent;
    //         return-object v0
    */

    public fun getExtras(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->mExtras:Landroid/os/Bundle;
    //         return-object v0
    */

    protected fun getIcon(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->icon:I
    //         return v0
    */

    public fun getRemoteInputs(): Array<android.support.v4.app.RemoteInput> { return TODO("body: ()[Landroid/support/v4/app/RemoteInput;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->mRemoteInputs:[Landroid/support/v4/app/RemoteInput;
    //         return-object v0
    */

    public fun getRemoteInputs(): Array<android.support.v4.app.RemoteInputCompatBase.RemoteInput> { return TODO("body: ()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompat$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInput;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun getTitle(): CharSequence { return TODO("body: ()Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->title:Ljava/lang/CharSequence;
    //         return-object v0
    */

    companion object {
    @JvmField public val FACTORY: android.support.v4.app.NotificationCompatBase.Action.Factory = null!!
    }
}
