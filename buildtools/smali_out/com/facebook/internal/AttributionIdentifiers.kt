package com.facebook.internal

// Auto-emitted from smali source: AttributionIdentifiers.java.
// 12 fields, 7 methods.

open class AttributionIdentifiers {
    private var androidAdvertiserId: String
    private var attributionId: String
    private var fetchTime: Long
    private var limitTracking: Boolean

    public constructor()

    public fun getAndroidAdvertiserId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/AttributionIdentifiers;->androidAdvertiserId:Ljava/lang/String;
    //         return-object v0
    */

    public fun getAttributionId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/internal/AttributionIdentifiers;->attributionId:Ljava/lang/String;
    //         return-object v0
    */

    public fun isTrackingLimited(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/internal/AttributionIdentifiers;->limitTracking:Z
    //         return v0
    */

    companion object {
    private val ANDROID_ID_COLUMN_NAME: String = "androidid"
    private val ATTRIBUTION_ID_COLUMN_NAME: String = "aid"
    private val ATTRIBUTION_ID_CONTENT_URI: android.net.Uri = null!!
    private val CONNECTION_RESULT_SUCCESS: Int = 0x0
    private val IDENTIFIER_REFRESH_INTERVAL_MILLIS: Long = 0x36ee80L
    private val LIMIT_TRACKING_COLUMN_NAME: String = "limit_tracking"
    private val TAG: String = null!!
    private var recentlyFetchedIdentifiers: com.facebook.internal.AttributionIdentifiers

    private @JvmStatic fun getAndroidId(p0: android.content.Context): com.facebook.internal.AttributionIdentifiers { return TODO("body: (Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;") }
    /*
    //         .locals 6
    //         new-instance v1, Lcom/facebook/internal/AttributionIdentifiers;
    //         invoke-direct {v1}, Lcom/facebook/internal/AttributionIdentifiers;-><init>()V
    //         :try_start_0
    //         invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v2
    //         if-ne v0, v2, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v2, "getAndroidId cannot be called on the main thread."
    //         invoke-direct {v0, v2}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :catch_0
    //         move-exception v0
    //         const-string v2, "android_id"
    //         invoke-static {v2, v0}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V
    //         :goto_0
    //         move-object v0, v1
    //         :goto_1
    //         return-object v0
    //         :cond_0
    //         :try_start_1
    //         const-string v0, "com.google.android.gms.common.GooglePlayServicesUtil"
    //         const-string v2, "isGooglePlayServicesAvailable"
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Class;
    //         const/4 v4, 0x0
    //         const-class v5, Landroid/content/Context;
    //         aput-object v5, v3, v4
    //         invoke-static {v0, v2, v3}, Lcom/facebook/internal/Utility;->getMethodQuietly(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         move-object v0, v1
    //         goto :goto_1
    //         :cond_1
    //         const/4 v2, 0x0
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         aput-object p0, v3, v4
    //         invoke-static {v2, v0, v3}, Lcom/facebook/internal/Utility;->invokeMethodQuietly(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         instance-of v2, v0, Ljava/lang/Integer;
    //         if-eqz v2, :cond_2
    //         check-cast v0, Ljava/lang/Integer;
    //         invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         :cond_2
    //         move-object v0, v1
    //         goto :goto_1
    //         :cond_3
    //         const-string v0, "com.google.android.gms.ads.identifier.AdvertisingIdClient"
    //         const-string v2, "getAdvertisingIdInfo"
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Class;
    //         const/4 v4, 0x0
    //         const-class v5, Landroid/content/Context;
    //         aput-object v5, v3, v4
    //         invoke-static {v0, v2, v3}, Lcom/facebook/internal/Utility;->getMethodQuietly(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v0
    //         if-nez v0, :cond_4
    //         move-object v0, v1
    //         goto :goto_1
    //         :cond_4
    //         const/4 v2, 0x0
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Ljava/lang/Object;
    //         const/4 v4, 0x0
    //         aput-object p0, v3, v4
    //         invoke-static {v2, v0, v3}, Lcom/facebook/internal/Utility;->invokeMethodQuietly(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         if-nez v2, :cond_5
    //         move-object v0, v1
    //         goto :goto_1
    //         :cond_5
    //         invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         const-string v3, "getId"
    //         const/4 v4, 0x0
    //         new-array v4, v4, [Ljava/lang/Class;
    //         invoke-static {v0, v3, v4}, Lcom/facebook/internal/Utility;->getMethodQuietly(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v0
    //         invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v3
    //         const-string v4, "isLimitAdTrackingEnabled"
    //         const/4 v5, 0x0
    //         new-array v5, v5, [Ljava/lang/Class;
    //         invoke-static {v3, v4, v5}, Lcom/facebook/internal/Utility;->getMethodQuietly(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //         move-result-object v3
    //         if-eqz v0, :cond_6
    //         if-nez v3, :cond_7
    //         :cond_6
    //         move-object v0, v1
    //         goto :goto_1
    //         :cond_7
    //         const/4 v4, 0x0
    //         new-array v4, v4, [Ljava/lang/Object;
    //         invoke-static {v2, v0, v4}, Lcom/facebook/internal/Utility;->invokeMethodQuietly(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iput-object v0, v1, Lcom/facebook/internal/AttributionIdentifiers;->androidAdvertiserId:Ljava/lang/String;
    //         const/4 v0, 0x0
    //         new-array v0, v0, [Ljava/lang/Object;
    //         invoke-static {v2, v3, v0}, Lcom/facebook/internal/Utility;->invokeMethodQuietly(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         iput-boolean v0, v1, Lcom/facebook/internal/AttributionIdentifiers;->limitTracking:Z
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         goto/16 :goto_0
    */

    public @JvmStatic fun getAttributionIdentifiers(p0: android.content.Context): com.facebook.internal.AttributionIdentifiers { return TODO("body: (Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;") }
    /*
    //         .locals 8
    //         const/4 v7, 0x0
    //         sget-object v0, Lcom/facebook/internal/AttributionIdentifiers;->recentlyFetchedIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;
    //         if-eqz v0, :cond_0
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v0
    //         sget-object v2, Lcom/facebook/internal/AttributionIdentifiers;->recentlyFetchedIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;
    //         iget-wide v2, v2, Lcom/facebook/internal/AttributionIdentifiers;->fetchTime:J
    //         sub-long/2addr v0, v2
    //         const-wide/32 v2, 0x36ee80
    //         cmp-long v0, v0, v2
    //         if-gez v0, :cond_0
    //         sget-object v0, Lcom/facebook/internal/AttributionIdentifiers;->recentlyFetchedIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-static {p0}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidId(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;
    //         move-result-object v6
    //         const/4 v0, 0x3
    //         :try_start_0
    //         new-array v2, v0, [Ljava/lang/String;
    //         const/4 v0, 0x0
    //         const-string v1, "aid"
    //         aput-object v1, v2, v0
    //         const/4 v0, 0x1
    //         const-string v1, "androidid"
    //         aput-object v1, v2, v0
    //         const/4 v0, 0x2
    //         const-string v1, "limit_tracking"
    //         aput-object v1, v2, v0
    //         invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/internal/AttributionIdentifiers;->ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;
    //         const/4 v3, 0x0
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v1
    //         if-eqz v1, :cond_1
    //         :try_start_1
    //         invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         move-result v0
    //         if-nez v0, :cond_3
    //         :cond_1
    //         if-eqz v1, :cond_2
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_2
    //         move-object v0, v6
    //         goto :goto_0
    //         :cond_3
    //         :try_start_2
    //         const-string v0, "aid"
    //         invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
    //         move-result v0
    //         const-string v2, "androidid"
    //         invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
    //         move-result v2
    //         const-string v3, "limit_tracking"
    //         invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
    //         move-result v3
    //         invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, v6, Lcom/facebook/internal/AttributionIdentifiers;->attributionId:Ljava/lang/String;
    //         if-lez v2, :cond_4
    //         if-lez v3, :cond_4
    //         invoke-virtual {v6}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidAdvertiserId()Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_4
    //         invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, v6, Lcom/facebook/internal/AttributionIdentifiers;->androidAdvertiserId:Ljava/lang/String;
    //         invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
    //         move-result v0
    //         iput-boolean v0, v6, Lcom/facebook/internal/AttributionIdentifiers;->limitTracking:Z
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         :cond_4
    //         if-eqz v1, :cond_5
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_5
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v0
    //         iput-wide v0, v6, Lcom/facebook/internal/AttributionIdentifiers;->fetchTime:J
    //         sput-object v6, Lcom/facebook/internal/AttributionIdentifiers;->recentlyFetchedIdentifiers:Lcom/facebook/internal/AttributionIdentifiers;
    //         move-object v0, v6
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         move-object v1, v7
    //         :goto_1
    //         :try_start_3
    //         sget-object v2, Lcom/facebook/internal/AttributionIdentifiers;->TAG:Ljava/lang/String;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Caught unexpected exception in getAttributionId(): "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_1
    //         if-eqz v1, :cond_6
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_6
    //         move-object v0, v7
    //         goto/16 :goto_0
    //         :catchall_0
    //         move-exception v0
    //         move-object v1, v7
    //         :goto_2
    //         if-eqz v1, :cond_7
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_7
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         goto :goto_2
    //         :catch_1
    //         move-exception v0
    //         goto :goto_1
    */

    }
}
