package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 1 fields, 5 methods.

open class NotificationCompat_BigTextStyle: android.support.v4.app.NotificationCompat.Style() {
    var mBigText: CharSequence

    public constructor()

    public constructor(builder: android.support.v4.app.NotificationCompat.Builder)

    public fun bigText(cs: CharSequence): android.support.v4.app.NotificationCompat.BigTextStyle { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$BigTextStyle;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mBigText:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setBigContentTitle(title: CharSequence): android.support.v4.app.NotificationCompat.BigTextStyle { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$BigTextStyle;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mBigContentTitle:Ljava/lang/CharSequence;
    //         return-object p0
    */

    public fun setSummaryText(cs: CharSequence): android.support.v4.app.NotificationCompat.BigTextStyle { return TODO("body: (Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$BigTextStyle;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Builder;->limitCharSequenceLength(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mSummaryText:Ljava/lang/CharSequence;
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/app/NotificationCompat$BigTextStyle;->mSummaryTextSet:Z
    //         return-object p0
    */

}
