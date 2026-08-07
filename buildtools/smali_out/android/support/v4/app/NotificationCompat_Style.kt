package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 4 fields, 3 methods.

open class NotificationCompat_Style {
    var mBigContentTitle: CharSequence
    var mBuilder: android.support.v4.app.NotificationCompat.Builder
    var mSummaryText: CharSequence
    var mSummaryTextSet: Boolean

    public constructor()

    public fun build(): android.app.Notification { return TODO("body: ()Landroid/app/Notification;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         .local v0, "notification":Landroid/app/Notification;
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;
    //         invoke-virtual {v1}, Landroid/support/v4/app/NotificationCompat$Builder;->build()Landroid/app/Notification;
    //         move-result-object v0
    //         :cond_0
    //         return-object v0
    */

    public fun setBuilder(builder: android.support.v4.app.NotificationCompat.Builder) { /* TODO(body): (Landroid/support/v4/app/NotificationCompat$Builder;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;
    //         if-eq v0, p1, :cond_0
    //         iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Style;->mBuilder:Landroid/support/v4/app/NotificationCompat$Builder;
    //         invoke-virtual {v0, p0}, Landroid/support/v4/app/NotificationCompat$Builder;->setStyle(Landroid/support/v4/app/NotificationCompat$Style;)Landroid/support/v4/app/NotificationCompat$Builder;
    //         :cond_0
    //         return-void
    */

}
