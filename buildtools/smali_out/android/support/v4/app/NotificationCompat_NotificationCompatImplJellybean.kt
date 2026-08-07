package android.support.v4.app

// Auto-emitted from smali source: NotificationCompat.java.
// 0 fields, 11 methods.

open class NotificationCompat_NotificationCompatImplJellybean: android.support.v4.app.NotificationCompat.NotificationCompatImplBase() {
    constructor()

    public fun build(b: android.support.v4.app.NotificationCompat.Builder): android.app.Notification { return TODO("body: (Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;") }
    /*
    //         .locals 23
    //         new-instance v1, Landroid/support/v4/app/NotificationCompatJellybean$Builder;
    //         move-object/from16 v0, p1
    //         iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContext:Landroid/content/Context;
    //         move-object/from16 v0, p1
    //         iget-object v3, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
    //         move-object/from16 v0, p1
    //         iget-object v4, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentTitle:Ljava/lang/CharSequence;
    //         move-object/from16 v0, p1
    //         iget-object v5, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentText:Ljava/lang/CharSequence;
    //         move-object/from16 v0, p1
    //         iget-object v6, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentInfo:Ljava/lang/CharSequence;
    //         move-object/from16 v0, p1
    //         iget-object v7, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mTickerView:Landroid/widget/RemoteViews;
    //         move-object/from16 v0, p1
    //         iget v8, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mNumber:I
    //         move-object/from16 v0, p1
    //         iget-object v9, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentIntent:Landroid/app/PendingIntent;
    //         move-object/from16 v0, p1
    //         iget-object v10, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mFullScreenIntent:Landroid/app/PendingIntent;
    //         move-object/from16 v0, p1
    //         iget-object v11, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mLargeIcon:Landroid/graphics/Bitmap;
    //         move-object/from16 v0, p1
    //         iget v12, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressMax:I
    //         move-object/from16 v0, p1
    //         iget v13, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgress:I
    //         move-object/from16 v0, p1
    //         iget-boolean v14, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressIndeterminate:Z
    //         move-object/from16 v0, p1
    //         iget-boolean v15, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mUseChronometer:Z
    //         move-object/from16 v0, p1
    //         iget v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mPriority:I
    //         move/from16 v16, v0
    //         move-object/from16 v0, p1
    //         iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mSubText:Ljava/lang/CharSequence;
    //         move-object/from16 v17, v0
    //         move-object/from16 v0, p1
    //         iget-boolean v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mLocalOnly:Z
    //         move/from16 v18, v0
    //         move-object/from16 v0, p1
    //         iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
    //         move-object/from16 v19, v0
    //         move-object/from16 v0, p1
    //         iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mGroupKey:Ljava/lang/String;
    //         move-object/from16 v20, v0
    //         move-object/from16 v0, p1
    //         iget-boolean v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mGroupSummary:Z
    //         move/from16 v21, v0
    //         move-object/from16 v0, p1
    //         iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mSortKey:Ljava/lang/String;
    //         move-object/from16 v22, v0
    //         invoke-direct/range {v1 .. v22}, Landroid/support/v4/app/NotificationCompatJellybean$Builder;-><init>(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;IIZZILjava/lang/CharSequence;ZLandroid/os/Bundle;Ljava/lang/String;ZLjava/lang/String;)V
    //         .local v1, "builder":Landroid/support/v4/app/NotificationCompatJellybean$Builder;
    //         move-object/from16 v0, p1
    //         iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mActions:Ljava/util/ArrayList;
    //         invoke-static {v1, v2}, Landroid/support/v4/app/NotificationCompat;->access$000(Landroid/support/v4/app/NotificationBuilderWithActions;Ljava/util/ArrayList;)V
    //         move-object/from16 v0, p1
    //         iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
    //         invoke-static {v1, v2}, Landroid/support/v4/app/NotificationCompat;->access$100(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Landroid/support/v4/app/NotificationCompat$Style;)V
    //         invoke-virtual {v1}, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->build()Landroid/app/Notification;
    //         move-result-object v2
    //         return-object v2
    */

    public fun getAction(n: android.app.Notification, actionIndex: Int): android.support.v4.app.NotificationCompat.Action { return TODO("body: (Landroid/app/Notification;I)Landroid/support/v4/app/NotificationCompat$Action;") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/app/NotificationCompat$Action;->FACTORY:Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
    //         sget-object v1, Landroid/support/v4/app/RemoteInput;->FACTORY:Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
    //         invoke-static {p1, p2, v0, v1}, Landroid/support/v4/app/NotificationCompatJellybean;->getAction(Landroid/app/Notification;ILandroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/app/NotificationCompat$Action;
    //         return-object v0
    */

    public fun getActionCount(n: android.app.Notification): Int { return TODO("body: (Landroid/app/Notification;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->getActionCount(Landroid/app/Notification;)I
    //         move-result v0
    //         return v0
    */

    public fun getActionsFromParcelableArrayList(p0: java.util.ArrayList): Array<android.support.v4.app.NotificationCompat.Action> { return TODO("body: (Ljava/util/ArrayList;)[Landroid/support/v4/app/NotificationCompat$Action;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Landroid/os/Parcelable;",
    //                 ">;)[",
    //                 "Landroid/support/v4/app/NotificationCompat$Action;"
    //             }
    //         .end annotation
    //         .local p1, "parcelables":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
    //         sget-object v0, Landroid/support/v4/app/NotificationCompat$Action;->FACTORY:Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
    //         sget-object v1, Landroid/support/v4/app/RemoteInput;->FACTORY:Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
    //         invoke-static {p1, v0, v1}, Landroid/support/v4/app/NotificationCompatJellybean;->getActionsFromParcelableArrayList(Ljava/util/ArrayList;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/NotificationCompatBase$Action;
    //         move-result-object v0
    //         check-cast v0, [Landroid/support/v4/app/NotificationCompat$Action;
    //         check-cast v0, [Landroid/support/v4/app/NotificationCompat$Action;
    //         return-object v0
    */

    public fun getExtras(n: android.app.Notification): android.os.Bundle { return TODO("body: (Landroid/app/Notification;)Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getGroup(n: android.app.Notification): String { return TODO("body: (Landroid/app/Notification;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->getGroup(Landroid/app/Notification;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getLocalOnly(n: android.app.Notification): Boolean { return TODO("body: (Landroid/app/Notification;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->getLocalOnly(Landroid/app/Notification;)Z
    //         move-result v0
    //         return v0
    */

    public fun getParcelableArrayListForActions(actions: Array<android.support.v4.app.NotificationCompat.Action>): java.util.ArrayList { return TODO("body: ([Landroid/support/v4/app/NotificationCompat$Action;)Ljava/util/ArrayList;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->getParcelableArrayListForActions([Landroid/support/v4/app/NotificationCompatBase$Action;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getSortKey(n: android.app.Notification): String { return TODO("body: (Landroid/app/Notification;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->getSortKey(Landroid/app/Notification;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun isGroupSummary(n: android.app.Notification): Boolean { return TODO("body: (Landroid/app/Notification;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->isGroupSummary(Landroid/app/Notification;)Z
    //         move-result v0
    //         return v0
    */

}
