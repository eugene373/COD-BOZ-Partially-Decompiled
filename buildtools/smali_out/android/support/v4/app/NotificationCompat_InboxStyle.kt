package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 1 fields, 5 methods.

open class NotificationCompat_InboxStyle: android.support.v4.app.NotificationCompat.Style() {
    var mTexts: java.util.ArrayList

    public constructor()

    public constructor(builder: android.support.v4.app.NotificationCompat.Builder)

    public fun addLine(cs: CharSequence): android.support.v4.app.NotificationCompat.InboxStyle { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mTexts:Ljava/util/ArrayList;
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         return-object p0
    */

    public fun setBigContentTitle(title: CharSequence): android.support.v4.app.NotificationCompat.InboxStyle { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mBigContentTitle:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setSummaryText(cs: CharSequence): android.support.v4.app.NotificationCompat.InboxStyle { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$InboxStyle;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mSummaryText:Ljava/lang/CharSequence;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/NotificationCompat$InboxStyle;->mSummaryTextSet:Z
    //         return-object p0
    */

}
