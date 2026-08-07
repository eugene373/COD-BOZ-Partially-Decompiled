package com.android.vending.expansion.downloader

// Auto-emitted from smali source: SystemFacade.java.
// 2 fields, 12 methods.

open class SystemFacade {
    private var mContext: android.content.Context
    private var mNotificationManager: android.app.NotificationManager

    public constructor(p0: android.content.Context)

    public fun cancelAllNotifications() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/SystemFacade;->mNotificationManager:Landroid/app/NotificationManager;
    //         invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V
    //         return-void
    */

    public fun cancelNotification(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/SystemFacade;->mNotificationManager:Landroid/app/NotificationManager;
    //         long-to-int v1, p1
    //         invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
    //         return-void
    */

    public fun currentTimeMillis(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getActiveNetworkType(): Integer { return TODO("body: ()Ljava/lang/Integer;") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/SystemFacade;->mContext:Landroid/content/Context;
    //         const-string v2, "connectivity"
    //         invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/ConnectivityManager;
    //         if-nez v0, :cond_0
    //         const-string v0, "LVLDL"
    //         const-string v2, "couldn\'t get connectivity manager"
    //         invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getMaxBytesOverMobile(): Long { return TODO("body: ()Ljava/lang/Long;") }
    /*
    //         .locals 2
    //         const-wide/32 v0, 0x7fffffff
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getRecommendedMaxBytesOverMobile(): Long { return TODO("body: ()Ljava/lang/Long;") }
    /*
    //         .locals 2
    //         const-wide/32 v0, 0x200000
    //         invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v0
    //         return-object v0
    */

    public fun isNetworkRoaming(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 5
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/SystemFacade;->mContext:Landroid/content/Context;
    //         const-string v1, "connectivity"
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/net/ConnectivityManager;
    //         if-nez v0, :cond_0
    //         const-string v0, "LVLDL"
    //         const-string v1, "couldn\'t get connectivity manager"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         return v3
    //         :cond_0
    //         invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
    //         move-result v0
    //         if-nez v0, :cond_1
    //         move v1, v2
    //         :goto_1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/SystemFacade;->mContext:Landroid/content/Context;
    //         const-string v4, "phone"
    //         invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/telephony/TelephonyManager;
    //         if-nez v0, :cond_2
    //         const-string v0, "LVLDL"
    //         const-string v1, "couldn\'t get telephony manager"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :cond_1
    //         move v1, v3
    //         goto :goto_1
    //         :cond_2
    //         if-eqz v1, :cond_3
    //         invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->isNetworkRoaming()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         :goto_2
    //         move v3, v2
    //         goto :goto_0
    //         :cond_3
    //         move v2, v3
    //         goto :goto_2
    */

    public fun postNotification(p0: Long, p1: android.app.Notification) { /* TODO(body): (JLandroid/app/Notification;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/SystemFacade;->mNotificationManager:Landroid/app/NotificationManager;
    //         long-to-int v1, p1
    //         invoke-virtual {v0, v1, p3}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    //         return-void
    */

    public fun sendBroadcast(p0: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/expansion/downloader/SystemFacade;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    //         return-void
    */

    public fun startThread(p0: Thread) { /* TODO(body): (Ljava/lang/Thread;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p1}, Ljava/lang/Thread;->start()V
    //         return-void
    */

    public fun userOwnsPackage(p0: Int, p1: String): Boolean { return TODO("body: (ILjava/lang/String;)Z") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/content/pm/PackageManager$NameNotFoundException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Lcom/android/vending/expansion/downloader/SystemFacade;->mContext:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         invoke-virtual {v1, p2, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //         move-result-object v1
    //         iget v1, v1, Landroid/content/pm/ApplicationInfo;->uid:I
    //         if-ne v1, p1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         return v0
    */

}
