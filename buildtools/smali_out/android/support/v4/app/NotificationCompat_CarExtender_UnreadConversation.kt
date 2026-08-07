package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 7 fields, 10 methods.

open class NotificationCompat_CarExtender_UnreadConversation: android.support.v4.app.NotificationCompatBase.UnreadConversation() {
    private val mLatestTimestamp: Long
    private val mMessages: Array<String>
    private val mParticipants: Array<String>
    private val mReadPendingIntent: android.app.PendingIntent
    private val mRemoteInput: android.support.v4.app.RemoteInput
    private val mReplyPendingIntent: android.app.PendingIntent

    constructor(messages: Array<String>, remoteInput: android.support.v4.app.RemoteInput, replyPendingIntent: android.app.PendingIntent, readPendingIntent: android.app.PendingIntent, participants: Array<String>, latestTimestamp: Long)

    fun getLatestTimestamp(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;->mLatestTimestamp:J
    //         return-wide v0
    */

    fun getMessages(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;->mMessages:[Ljava/lang/String;
    //         return-object v0
    */

    fun getParticipant(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;->mParticipants:[Ljava/lang/String;
    //         array-length v0, v0
    //         if-lez v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;->mParticipants:[Ljava/lang/String;
    //         const/4 v1, 0x0
    //         aget-object v0, v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun getParticipants(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;->mParticipants:[Ljava/lang/String;
    //         return-object v0
    */

    fun getReadPendingIntent(): android.app.PendingIntent { return TODO("body: ()Landroid/app/PendingIntent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;->mReadPendingIntent:Landroid/app/PendingIntent;
    //         return-object v0
    */

    fun getRemoteInput(): android.support.v4.app.RemoteInput { return TODO("body: ()Landroid/support/v4/app/RemoteInput;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;->mRemoteInput:Landroid/support/v4/app/RemoteInput;
    //         return-object v0
    */

    fun getRemoteInput(): android.support.v4.app.RemoteInputCompatBase.RemoteInput { return TODO("body: ()Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;->getRemoteInput()Landroid/support/v4/app/RemoteInput;
    //         move-result-object v0
    //         return-object v0
    */

    fun getReplyPendingIntent(): android.app.PendingIntent { return TODO("body: ()Landroid/app/PendingIntent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;->mReplyPendingIntent:Landroid/app/PendingIntent;
    //         return-object v0
    */

    companion object {
    val FACTORY: android.support.v4.app.NotificationCompatBase.UnreadConversation.Factory = null!!
    }
}
