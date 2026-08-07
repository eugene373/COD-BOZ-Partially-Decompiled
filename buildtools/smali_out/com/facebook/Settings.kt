package com.facebook

// Auto-emitted from smali source: Settings.java.
// 30 fields, 37 methods.

class Settings {
    public constructor()

    companion object {
    private val ANALYTICS_EVENT: String = "event"
    @JvmField public val APPLICATION_ID_PROPERTY: String = "com.facebook.sdk.ApplicationId"
    private val APP_EVENT_PREFERENCES: String = "com.facebook.sdk.appEventPreferences"
    private val ATTRIBUTION_ID_COLUMN_NAME: String = "aid"
    private val ATTRIBUTION_ID_CONTENT_URI: android.net.Uri = null!!
    private val ATTRIBUTION_PREFERENCES: String = "com.facebook.sdk.attributionTracking"
    private val AUTO_PUBLISH: String = "auto_publish"
    @JvmField public val CLIENT_TOKEN_PROPERTY: String = "com.facebook.sdk.ClientToken"
    private val DEFAULT_CORE_POOL_SIZE: Int = 0x5
    private val DEFAULT_KEEP_ALIVE: Int = 0x1
    private val DEFAULT_MAXIMUM_POOL_SIZE: Int = 0x80
    private val DEFAULT_THREAD_FACTORY: java.util.concurrent.ThreadFactory = null!!
    private val DEFAULT_WORK_QUEUE: java.util.concurrent.BlockingQueue = null!!
    private val FACEBOOK_COM: String = "facebook.com"
    private val LOCK: Object = null!!
    private val MOBILE_INSTALL_EVENT: String = "MOBILE_APP_INSTALL"
    private val PUBLISH_ACTIVITY_PATH: String = "%s/activities"
    private val TAG: String = null!!
    private var appClientToken: String
    private var appVersion: String
    private var applicationId: String
    private var defaultsLoaded: Boolean
    private var executor: java.util.concurrent.Executor
    private var facebookDomain: String
    private var isDebugEnabled: Boolean
    private val loggingBehaviors: java.util.HashSet = null!!
    private var onProgressThreshold: java.util.concurrent.atomic.AtomicLong
    private var platformCompatibilityEnabled: Boolean
    private var sdkInitialized: Boolean
    private var shouldAutoPublishInstall: Boolean

    public @JvmStatic fun addLoggingBehavior(p0: com.facebook.LoggingBehavior) { /* TODO(body): (Lcom/facebook/LoggingBehavior;)V */ }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/facebook/Settings;->loggingBehaviors:Ljava/util/HashSet;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/Settings;->loggingBehaviors:Ljava/util/HashSet;
    //         invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun clearLoggingBehaviors() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/facebook/Settings;->loggingBehaviors:Ljava/util/HashSet;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/Settings;->loggingBehaviors:Ljava/util/HashSet;
    //         invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun getAppVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/Settings;->appVersion:Ljava/lang/String;
    //         return-object v0
    */

    public @JvmStatic fun getApplicationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/Settings;->applicationId:Ljava/lang/String;
    //         return-object v0
    */

    public @JvmStatic fun getApplicationSignature(p0: android.content.Context): String { return TODO("body: (Landroid/content/Context;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const/4 v0, 0x0
    //         if-nez p0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         const/16 v3, 0x40
    //         :try_start_0
    //         invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v1
    //         iget-object v2, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
    //         if-eqz v2, :cond_0
    //         array-length v2, v2
    //         if-eqz v2, :cond_0
    //         :try_start_1
    //         const-string v2, "SHA-1"
    //         invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    //         :try_end_1
    //         .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_1
    //         move-result-object v0
    //         iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
    //         const/4 v2, 0x0
    //         aget-object v1, v1, v2
    //         invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V
    //         invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
    //         move-result-object v0
    //         const/16 v1, 0x9
    //         invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         goto :goto_0
    */

    private @JvmStatic fun getAsyncTaskExecutor(): java.util.concurrent.Executor { return TODO("body: ()Ljava/util/concurrent/Executor;") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         :try_start_0
    //         const-class v0, Landroid/os/AsyncTask;
    //         const-string v2, "THREAD_POOL_EXECUTOR"
    //         invoke-virtual {v0, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //         :try_end_0
    //         .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         const/4 v2, 0x0
    //         :try_start_1
    //         invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_1
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         move-object v0, v1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_0
    //         instance-of v2, v0, Ljava/util/concurrent/Executor;
    //         if-nez v2, :cond_1
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_1
    //         check-cast v0, Ljava/util/concurrent/Executor;
    //         goto :goto_0
    */

    public @JvmStatic fun getAttributionId(p0: android.content.ContentResolver): String { return TODO("body: (Landroid/content/ContentResolver;)Ljava/lang/String;") }
    /*
    //         .locals 7
    //         const/4 v6, 0x0
    //         const/4 v0, 0x1
    //         :try_start_0
    //         new-array v2, v0, [Ljava/lang/String;
    //         const/4 v0, 0x0
    //         const-string v1, "aid"
    //         aput-object v1, v2, v0
    //         sget-object v1, Lcom/facebook/Settings;->ATTRIBUTION_ID_CONTENT_URI:Landroid/net/Uri;
    //         const/4 v3, 0x0
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         move-object v0, p0
    //         invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         :try_start_1
    //         invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         move-result v0
    //         if-nez v0, :cond_3
    //         :cond_0
    //         if-eqz v1, :cond_1
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_1
    //         move-object v0, v6
    //         :cond_2
    //         :goto_0
    //         return-object v0
    //         :cond_3
    //         :try_start_2
    //         const-string v0, "aid"
    //         invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
    //         move-result v0
    //         invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         move-result-object v0
    //         if-eqz v1, :cond_2
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         move-object v1, v6
    //         :goto_1
    //         :try_start_3
    //         sget-object v2, Lcom/facebook/Settings;->TAG:Ljava/lang/String;
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
    //         if-eqz v1, :cond_4
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_4
    //         move-object v0, v6
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         move-object v1, v6
    //         :goto_2
    //         if-eqz v1, :cond_5
    //         invoke-interface {v1}, Landroid/database/Cursor;->close()V
    //         :cond_5
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         goto :goto_2
    //         :catch_1
    //         move-exception v0
    //         goto :goto_1
    */

    public @JvmStatic fun getClientToken(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/Settings;->appClientToken:Ljava/lang/String;
    //         return-object v0
    */

    public @JvmStatic fun getExecutor(): java.util.concurrent.Executor { return TODO("body: ()Ljava/util/concurrent/Executor;") }
    /*
    //         .locals 10
    //         sget-object v9, Lcom/facebook/Settings;->LOCK:Ljava/lang/Object;
    //         monitor-enter v9
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/Settings;->executor:Ljava/util/concurrent/Executor;
    //         if-nez v0, :cond_1
    //         invoke-static {}, Lcom/facebook/Settings;->getAsyncTaskExecutor()Ljava/util/concurrent/Executor;
    //         move-result-object v1
    //         if-nez v1, :cond_0
    //         new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;
    //         const/4 v2, 0x5
    //         const/16 v3, 0x80
    //         const-wide/16 v4, 0x1
    //         sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;
    //         sget-object v7, Lcom/facebook/Settings;->DEFAULT_WORK_QUEUE:Ljava/util/concurrent/BlockingQueue;
    //         sget-object v8, Lcom/facebook/Settings;->DEFAULT_THREAD_FACTORY:Ljava/util/concurrent/ThreadFactory;
    //         invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
    //         :cond_0
    //         sput-object v1, Lcom/facebook/Settings;->executor:Ljava/util/concurrent/Executor;
    //         :cond_1
    //         monitor-exit v9
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         sget-object v0, Lcom/facebook/Settings;->executor:Ljava/util/concurrent/Executor;
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v9
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun getFacebookDomain(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/Settings;->facebookDomain:Ljava/lang/String;
    //         return-object v0
    */

    public @JvmStatic fun getLimitEventAndDataUsage(p0: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         const-string v0, "com.facebook.sdk.appEventPreferences"
    //         invoke-virtual {p0, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         const-string v1, "limitEventUsage"
    //         invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getLoggingBehaviors(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Lcom/facebook/LoggingBehavior;",
    //                 ">;"
    //             }
    //         .end annotation
    //         sget-object v1, Lcom/facebook/Settings;->loggingBehaviors:Ljava/util/HashSet;
    //         monitor-enter v1
    //         :try_start_0
    //         new-instance v0, Ljava/util/HashSet;
    //         sget-object v2, Lcom/facebook/Settings;->loggingBehaviors:Ljava/util/HashSet;
    //         invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V
    //         invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;
    //         move-result-object v0
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun getOnProgressThreshold(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/facebook/Settings;->onProgressThreshold:Ljava/util/concurrent/atomic/AtomicLong;
    //         invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public @JvmStatic fun getPlatformCompatibilityEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-boolean v0, Lcom/facebook/Settings;->platformCompatibilityEnabled:Z
    //         return v0
    */

    public @JvmStatic fun getSdkVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "3.22.0"
    //         return-object v0
    */

    public @JvmStatic fun getShouldAutoPublishInstall(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         sget-boolean v0, Lcom/facebook/Settings;->shouldAutoPublishInstall:Z
    //         return v0
    */

    public @JvmStatic fun isDebugEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         sget-boolean v0, Lcom/facebook/Settings;->isDebugEnabled:Z
    //         return v0
    */

    public @JvmStatic fun isLoggingBehaviorEnabled(p0: com.facebook.LoggingBehavior): Boolean { return TODO("body: (Lcom/facebook/LoggingBehavior;)Z") }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/facebook/Settings;->loggingBehaviors:Ljava/util/HashSet;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-static {}, Lcom/facebook/Settings;->isDebugEnabled()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         sget-object v0, Lcom/facebook/Settings;->loggingBehaviors:Ljava/util/HashSet;
    //         invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         monitor-exit v1
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun isLoggingEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {}, Lcom/facebook/Settings;->isDebugEnabled()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun loadDefaultsFromMetadata(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         sput-boolean v0, Lcom/facebook/Settings;->defaultsLoaded:Z
    //         if-nez p0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         :try_start_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v0
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         const/16 v2, 0x80
    //         invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    //         if-eqz v1, :cond_0
    //         sget-object v1, Lcom/facebook/Settings;->applicationId:Ljava/lang/String;
    //         if-nez v1, :cond_2
    //         iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    //         const-string v2, "com.facebook.sdk.ApplicationId"
    //         invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         sput-object v1, Lcom/facebook/Settings;->applicationId:Ljava/lang/String;
    //         :cond_2
    //         sget-object v1, Lcom/facebook/Settings;->appClientToken:Ljava/lang/String;
    //         if-nez v1, :cond_0
    //         iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    //         const-string v1, "com.facebook.sdk.ClientToken"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         sput-object v0, Lcom/facebook/Settings;->appClientToken:Ljava/lang/String;
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    @JvmStatic fun loadDefaultsFromMetadataIfNeeded(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 1
    //         sget-boolean v0, Lcom/facebook/Settings;->defaultsLoaded:Z
    //         if-nez v0, :cond_0
    //         invoke-static {p0}, Lcom/facebook/Settings;->loadDefaultsFromMetadata(Landroid/content/Context;)V
    //         :cond_0
    //         return-void
    */

    @JvmStatic fun publishInstallAndWaitForResponse(p0: android.content.Context, p1: String, p2: Boolean): com.facebook.Response { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Z)Lcom/facebook/Response;") }
    /*
    //         .locals 11
    //         if-eqz p0, :cond_0
    //         if-nez p1, :cond_1
    //         :cond_0
    //         :try_start_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Both context and applicationId must be non-null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :catch_0
    //         move-exception v0
    //         move-object v1, v0
    //         const-string v0, "Facebook-publish"
    //         invoke-static {v0, v1}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/Exception;)V
    //         new-instance v0, Lcom/facebook/Response;
    //         const/4 v2, 0x0
    //         const/4 v3, 0x0
    //         new-instance v4, Lcom/facebook/FacebookRequestError;
    //         const/4 v5, 0x0
    //         invoke-direct {v4, v5, v1}, Lcom/facebook/FacebookRequestError;-><init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V
    //         invoke-direct {v0, v2, v3, v4}, Lcom/facebook/Response;-><init>(Lcom/facebook/Request;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         :try_start_1
    //         invoke-static {p0}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionIdentifiers(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;
    //         move-result-object v0
    //         const-string v1, "com.facebook.sdk.attributionTracking"
    //         const/4 v2, 0x0
    //         invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v1
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, "ping"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         const-string v4, "json"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         const-wide/16 v4, 0x0
    //         invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
    //         move-result-wide v4
    //         const/4 v6, 0x0
    //         invoke-interface {v1, v3, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         if-nez p2, :cond_2
    //         const/4 v7, 0x0
    //         invoke-static {v7}, Lcom/facebook/Settings;->setShouldAutoPublishInstall(Z)V
    //         :cond_2
    //         invoke-static {}, Lcom/facebook/model/GraphObject$Factory;->create()Lcom/facebook/model/GraphObject;
    //         move-result-object v7
    //         const-string v8, "event"
    //         const-string v9, "MOBILE_APP_INSTALL"
    //         invoke-interface {v7, v8, v9}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         invoke-static {p0, p1}, Lcom/facebook/internal/Utility;->getHashedDeviceAndAppID(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v8
    //         invoke-static {p0}, Lcom/facebook/Settings;->getLimitEventAndDataUsage(Landroid/content/Context;)Z
    //         move-result v9
    //         invoke-static {v7, v0, v8, v9}, Lcom/facebook/internal/Utility;->setAppEventAttributionParameters(Lcom/facebook/model/GraphObject;Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;Z)V
    //         const-string v8, "auto_publish"
    //         invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v9
    //         invoke-interface {v7, v8, v9}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         const-string v8, "application_package_name"
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v9
    //         invoke-interface {v7, v8, v9}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    //         const-string v8, "%s/activities"
    //         const/4 v9, 0x1
    //         new-array v9, v9, [Ljava/lang/Object;
    //         const/4 v10, 0x0
    //         aput-object p1, v9, v10
    //         invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v8
    //         const/4 v9, 0x0
    //         const/4 v10, 0x0
    //         invoke-static {v9, v8, v7, v10}, Lcom/facebook/Request;->newPostRequest(Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/model/GraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         move-result-object v7
    //         const-wide/16 v8, 0x0
    //         cmp-long v4, v4, v8
    //         if-eqz v4, :cond_5
    //         const/4 v0, 0x0
    //         if-eqz v6, :cond_3
    //         :try_start_2
    //         new-instance v1, Lorg/json/JSONObject;
    //         invoke-direct {v1, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         invoke-static {v1}, Lcom/facebook/model/GraphObject$Factory;->create(Lorg/json/JSONObject;)Lcom/facebook/model/GraphObject;
    //         :try_end_2
    //         .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    //         move-result-object v0
    //         :cond_3
    //         move-object v4, v0
    //         :goto_1
    //         if-nez v4, :cond_4
    //         :try_start_3
    //         const-string v0, "true"
    //         const/4 v1, 0x0
    //         new-instance v2, Lcom/facebook/RequestBatch;
    //         const/4 v3, 0x1
    //         new-array v3, v3, [Lcom/facebook/Request;
    //         const/4 v4, 0x0
    //         aput-object v7, v3, v4
    //         invoke-direct {v2, v3}, Lcom/facebook/RequestBatch;-><init>([Lcom/facebook/Request;)V
    //         const/4 v3, 0x1
    //         invoke-static {v0, v1, v2, v3}, Lcom/facebook/Response;->createResponsesFromString(Ljava/lang/String;Ljava/net/HttpURLConnection;Lcom/facebook/RequestBatch;Z)Ljava/util/List;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Response;
    //         goto/16 :goto_0
    //         :catch_1
    //         move-exception v1
    //         move-object v4, v0
    //         goto :goto_1
    //         :cond_4
    //         new-instance v0, Lcom/facebook/Response;
    //         const/4 v1, 0x0
    //         const/4 v2, 0x0
    //         const/4 v3, 0x0
    //         const/4 v5, 0x1
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/Response;-><init>(Lcom/facebook/Request;Ljava/net/HttpURLConnection;Ljava/lang/String;Lcom/facebook/model/GraphObject;Z)V
    //         goto/16 :goto_0
    //         :cond_5
    //         if-eqz v0, :cond_6
    //         invoke-virtual {v0}, Lcom/facebook/internal/AttributionIdentifiers;->getAndroidAdvertiserId()Ljava/lang/String;
    //         move-result-object v4
    //         if-nez v4, :cond_7
    //         invoke-virtual {v0}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionId()Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_7
    //         :cond_6
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "No attribution id available to send to server."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_7
    //         const/4 v0, 0x0
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Utility;->queryAppSettings(Ljava/lang/String;Z)Lcom/facebook/internal/Utility$FetchedAppSettings;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/facebook/internal/Utility$FetchedAppSettings;->supportsAttribution()Z
    //         move-result v0
    //         if-nez v0, :cond_8
    //         new-instance v0, Lcom/facebook/FacebookException;
    //         const-string v1, "Install attribution has been disabled on the server."
    //         invoke-direct {v0, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_8
    //         invoke-virtual {v7}, Lcom/facebook/Request;->executeAndWait()Lcom/facebook/Response;
    //         move-result-object v0
    //         invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v1
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v4
    //         invoke-interface {v1, v2, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    //         invoke-virtual {v0}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v2
    //         if-eqz v2, :cond_9
    //         invoke-virtual {v0}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v2
    //         invoke-interface {v2}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;
    //         move-result-object v2
    //         if-eqz v2, :cond_9
    //         invoke-virtual {v0}, Lcom/facebook/Response;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v2
    //         invoke-interface {v2}, Lcom/facebook/model/GraphObject;->getInnerJSONObject()Lorg/json/JSONObject;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //         :cond_9
    //         invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    //         :try_end_3
    //         .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    //         goto/16 :goto_0
    */

    @JvmStatic fun publishInstallAsync(p0: android.content.Context, p1: String, p2: com.facebook.Request.Callback) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Request$Callback;)V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-static {}, Lcom/facebook/Settings;->getExecutor()Ljava/util/concurrent/Executor;
    //         move-result-object v1
    //         new-instance v2, Lcom/facebook/Settings$2;
    //         invoke-direct {v2, v0, p1, p2}, Lcom/facebook/Settings$2;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Request$Callback;)V
    //         invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    //         return-void
    */

    public @JvmStatic fun removeLoggingBehavior(p0: com.facebook.LoggingBehavior) { /* TODO(body): (Lcom/facebook/LoggingBehavior;)V */ }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/facebook/Settings;->loggingBehaviors:Ljava/util/HashSet;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/Settings;->loggingBehaviors:Ljava/util/HashSet;
    //         invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun setAppVersion(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         sput-object p0, Lcom/facebook/Settings;->appVersion:Ljava/lang/String;
    //         return-void
    */

    public @JvmStatic fun setApplicationId(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         sput-object p0, Lcom/facebook/Settings;->applicationId:Ljava/lang/String;
    //         return-void
    */

    public @JvmStatic fun setClientToken(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         sput-object p0, Lcom/facebook/Settings;->appClientToken:Ljava/lang/String;
    //         return-void
    */

    public @JvmStatic fun setExecutor(p0: java.util.concurrent.Executor) { /* TODO(body): (Ljava/util/concurrent/Executor;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "executor"
    //         invoke-static {p0, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V
    //         sget-object v1, Lcom/facebook/Settings;->LOCK:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sput-object p0, Lcom/facebook/Settings;->executor:Ljava/util/concurrent/Executor;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun setFacebookDomain(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/facebook/Settings;->TAG:Ljava/lang/String;
    //         const-string v1, "WARNING: Calling setFacebookDomain from non-DEBUG code."
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         sput-object p0, Lcom/facebook/Settings;->facebookDomain:Ljava/lang/String;
    //         return-void
    */

    public @JvmStatic fun setIsDebugEnabled(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         sput-boolean p0, Lcom/facebook/Settings;->isDebugEnabled:Z
    //         return-void
    */

    public @JvmStatic fun setIsLoggingEnabled(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {p0}, Lcom/facebook/Settings;->setIsDebugEnabled(Z)V
    //         return-void
    */

    public @JvmStatic fun setLimitEventAndDataUsage(p0: android.content.Context, p1: Boolean) { /* TODO(body): (Landroid/content/Context;Z)V */ }
    /*
    //         .locals 2
    //         const-string v0, "com.facebook.sdk.appEventPreferences"
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         const-string v1, "limitEventUsage"
    //         invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //         move-result-object v0
    //         invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    //         return-void
    */

    public @JvmStatic fun setOnProgressThreshold(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/facebook/Settings;->onProgressThreshold:Ljava/util/concurrent/atomic/AtomicLong;
    //         invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V
    //         return-void
    */

    public @JvmStatic fun setPlatformCompatibilityEnabled(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         sput-boolean p0, Lcom/facebook/Settings;->platformCompatibilityEnabled:Z
    //         return-void
    */

    public @JvmStatic fun setShouldAutoPublishInstall(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         sput-boolean p0, Lcom/facebook/Settings;->shouldAutoPublishInstall:Z
    //         return-void
    */

    }
}
