package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 6 fields, 6 methods.

open class NotificationCompat_CarExtender_UnreadConversation_Builder {
    private var mLatestTimestamp: Long
    private val mMessages: java.util.List
    private val mParticipant: String
    private var mReadPendingIntent: android.app.PendingIntent
    private var mRemoteInput: android.support.v4.app.RemoteInput
    private var mReplyPendingIntent: android.app.PendingIntent

    public constructor(name: String)

    public fun addMessage(message: String): android.support.v4.app.NotificationCompat.CarExtender.UnreadConversation.Builder { return TODO("body: (Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->mMessages:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun build(): android.support.v4.app.NotificationCompat.CarExtender.UnreadConversation { return TODO("body: ()Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;") }
    /*
    //         .locals 8
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->mMessages:Ljava/util/List;
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->mMessages:Ljava/util/List;
    //         invoke-interface {v2}, Ljava/util/List;->size()I
    //         move-result v2
    //         new-array v2, v2, [Ljava/lang/String;
    //         invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, [Ljava/lang/String;
    //         .local v1, "messages":[Ljava/lang/String;
    //         const/4 v0, 0x1
    //         new-array v5, v0, [Ljava/lang/String;
    //         const/4 v0, 0x0
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->mParticipant:Ljava/lang/String;
    //         aput-object v2, v5, v0
    //         .local v5, "participants":[Ljava/lang/String;
    //         new-instance v0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;
    //         iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->mRemoteInput:Landroid/support/v4/app/RemoteInput;
    //         iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->mReplyPendingIntent:Landroid/app/PendingIntent;
    //         iget-object v4, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->mReadPendingIntent:Landroid/app/PendingIntent;
    //         iget-wide v6, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->mLatestTimestamp:J
    //         invoke-direct/range {v0 .. v7}, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation;-><init>([Ljava/lang/String;Landroid/support/v4/app/RemoteInput;Landroid/app/PendingIntent;Landroid/app/PendingIntent;[Ljava/lang/String;J)V
    //         return-object v0
    */

    public fun setLatestTimestamp(timestamp: Long): android.support.v4.app.NotificationCompat.CarExtender.UnreadConversation.Builder { return TODO("body: (J)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;") }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->mLatestTimestamp:J
    //         return-object p0
    */

    public fun setReadPendingIntent(pendingIntent: android.app.PendingIntent): android.support.v4.app.NotificationCompat.CarExtender.UnreadConversation.Builder { return TODO("body: (Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->mReadPendingIntent:Landroid/app/PendingIntent;
    //         return-object p0
    */

    public fun setReplyAction(pendingIntent: android.app.PendingIntent, remoteInput: android.support.v4.app.RemoteInput): android.support.v4.app.NotificationCompat.CarExtender.UnreadConversation.Builder { return TODO("body: (Landroid/app/PendingIntent;Landroid/support/v4/app/RemoteInput;)Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;") }
    /*
    //         .locals 0
    //         iput-object p2, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->mRemoteInput:Landroid/support/v4/app/RemoteInput;
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$CarExtender$UnreadConversation$Builder;->mReplyPendingIntent:Landroid/app/PendingIntent;
    //         return-object p0
    */

}
