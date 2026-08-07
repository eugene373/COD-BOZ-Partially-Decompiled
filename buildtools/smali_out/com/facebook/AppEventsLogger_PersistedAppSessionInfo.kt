package com.facebook

// Auto-emitted from smali source: AppEventsLogger.java.
// 6 fields, 8 methods.

open class AppEventsLogger_PersistedAppSessionInfo {
    constructor()

    companion object {
    private val PERSISTED_SESSION_INFO_FILENAME: String = "AppEventsLogger.persistedsessioninfo"
    private val appSessionInfoFlushRunnable: Runnable = null!!
    private var appSessionInfoMap: java.util.Map
    private var hasChanges: Boolean
    private var isLoaded: Boolean
    private val staticLock: Object = null!!

    private @JvmStatic fun getTimeSpentData(p0: android.content.Context, p1: com.facebook.AppEventsLogger.AccessTokenAppIdPair): com.facebook.FacebookTimeSpentData { return TODO("body: (Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)Lcom/facebook/FacebookTimeSpentData;") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->restoreAppSessionInformation(Landroid/content/Context;)V
    //         sget-object v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/FacebookTimeSpentData;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/facebook/FacebookTimeSpentData;
    //         invoke-direct {v0}, Lcom/facebook/FacebookTimeSpentData;-><init>()V
    //         sget-object v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;
    //         invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         return-object v0
    */

    @JvmStatic fun onResume(p0: android.content.Context, p1: com.facebook.AppEventsLogger.AccessTokenAppIdPair, p2: com.facebook.AppEventsLogger, p3: Long, p4: String) { /* TODO(body): (Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/AppEventsLogger;JLjava/lang/String;)V */ }
    /*
    //         .locals 3
    //         sget-object v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->staticLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-static {p0, p1}, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->getTimeSpentData(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)Lcom/facebook/FacebookTimeSpentData;
    //         move-result-object v0
    //         invoke-virtual {v0, p2, p3, p4, p5}, Lcom/facebook/FacebookTimeSpentData;->onResume(Lcom/facebook/AppEventsLogger;JLjava/lang/String;)V
    //         invoke-static {}, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->onTimeSpentDataUpdate()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    @JvmStatic fun onSuspend(p0: android.content.Context, p1: com.facebook.AppEventsLogger.AccessTokenAppIdPair, p2: com.facebook.AppEventsLogger, p3: Long) { /* TODO(body): (Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/AppEventsLogger;J)V */ }
    /*
    //         .locals 3
    //         sget-object v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->staticLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-static {p0, p1}, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->getTimeSpentData(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)Lcom/facebook/FacebookTimeSpentData;
    //         move-result-object v0
    //         invoke-virtual {v0, p2, p3, p4}, Lcom/facebook/FacebookTimeSpentData;->onSuspend(Lcom/facebook/AppEventsLogger;J)V
    //         invoke-static {}, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->onTimeSpentDataUpdate()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    private @JvmStatic fun onTimeSpentDataUpdate() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         sget-boolean v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         sput-boolean v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->access$1400()Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoFlushRunnable:Ljava/lang/Runnable;
    //         const-wide/16 v2, 0x1e
    //         sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //         :cond_0
    //         return-void
    */

    private @JvmStatic fun restoreAppSessionInformation(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 7
    //         const/4 v0, 0x0
    //         sget-object v2, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->staticLock:Ljava/lang/Object;
    //         monitor-enter v2
    //         :try_start_0
    //         sget-boolean v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->isLoaded:Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-nez v1, :cond_1
    //         :try_start_1
    //         new-instance v1, Ljava/io/ObjectInputStream;
    //         const-string v3, "AppEventsLogger.persistedsessioninfo"
    //         invoke-virtual {p0, v3}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    //         move-result-object v3
    //         invoke-direct {v1, v3}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    //         :try_end_1
    //         .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         :try_start_2
    //         invoke-virtual {v1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/HashMap;
    //         sput-object v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->APP_EVENTS:Lcom/facebook/LoggingBehavior;
    //         const-string v3, "AppEvents"
    //         const-string v4, "App session info loaded"
    //         invoke-static {v0, v3, v4}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_2
    //         .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_2
    //         :try_start_3
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         const-string v0, "AppEventsLogger.persistedsessioninfo"
    //         invoke-virtual {p0, v0}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    //         sget-object v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         sput-object v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;
    //         :cond_0
    //         const/4 v0, 0x1
    //         sput-boolean v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->isLoaded:Z
    //         const/4 v0, 0x0
    //         sput-boolean v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z
    //         :cond_1
    //         :goto_0
    //         monitor-exit v2
    //         return-void
    //         :catch_0
    //         move-exception v1
    //         :goto_1
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         const-string v0, "AppEventsLogger.persistedsessioninfo"
    //         invoke-virtual {p0, v0}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    //         sget-object v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;
    //         if-nez v0, :cond_2
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         sput-object v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;
    //         :cond_2
    //         const/4 v0, 0x1
    //         sput-boolean v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->isLoaded:Z
    //         const/4 v0, 0x0
    //         sput-boolean v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         throw v0
    //         :catch_1
    //         move-exception v1
    //         move-object v6, v1
    //         move-object v1, v0
    //         move-object v0, v6
    //         :goto_2
    //         :try_start_4
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->access$1300()Ljava/lang/String;
    //         move-result-object v3
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Got unexpected exception: "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_2
    //         :try_start_5
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         const-string v0, "AppEventsLogger.persistedsessioninfo"
    //         invoke-virtual {p0, v0}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    //         sget-object v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;
    //         if-nez v0, :cond_3
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         sput-object v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;
    //         :cond_3
    //         const/4 v0, 0x1
    //         sput-boolean v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->isLoaded:Z
    //         const/4 v0, 0x0
    //         sput-boolean v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z
    //         goto :goto_0
    //         :catchall_1
    //         move-exception v1
    //         move-object v6, v1
    //         move-object v1, v0
    //         move-object v0, v6
    //         :goto_3
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         const-string v1, "AppEventsLogger.persistedsessioninfo"
    //         invoke-virtual {p0, v1}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    //         sget-object v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;
    //         if-nez v1, :cond_4
    //         new-instance v1, Ljava/util/HashMap;
    //         invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
    //         sput-object v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;
    //         :cond_4
    //         const/4 v1, 0x1
    //         sput-boolean v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->isLoaded:Z
    //         const/4 v1, 0x0
    //         sput-boolean v1, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z
    //         throw v0
    //         :try_end_5
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_0
    //         :catchall_2
    //         move-exception v0
    //         goto :goto_3
    //         :catch_2
    //         move-exception v0
    //         goto :goto_2
    //         :catch_3
    //         move-exception v0
    //         move-object v0, v1
    //         goto :goto_1
    */

    @JvmStatic fun saveAppSessionInformation(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 6
    //         const/4 v2, 0x0
    //         sget-object v3, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->staticLock:Ljava/lang/Object;
    //         monitor-enter v3
    //         :try_start_0
    //         sget-boolean v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-eqz v0, :cond_0
    //         :try_start_1
    //         new-instance v1, Ljava/io/ObjectOutputStream;
    //         new-instance v0, Ljava/io/BufferedOutputStream;
    //         const-string v4, "AppEventsLogger.persistedsessioninfo"
    //         const/4 v5, 0x0
    //         invoke-virtual {p0, v4, v5}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //         move-result-object v4
    //         invoke-direct {v0, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    //         invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         :try_start_2
    //         sget-object v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->appSessionInfoMap:Ljava/util/Map;
    //         invoke-virtual {v1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    //         const/4 v0, 0x0
    //         sput-boolean v0, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->hasChanges:Z
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->APP_EVENTS:Lcom/facebook/LoggingBehavior;
    //         const-string v2, "AppEvents"
    //         const-string v4, "App session info saved"
    //         invoke-static {v0, v2, v4}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_2
    //         :try_start_3
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         :cond_0
    //         :goto_0
    //         monitor-exit v3
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         move-object v1, v2
    //         :goto_1
    //         :try_start_4
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->access$1300()Ljava/lang/String;
    //         move-result-object v2
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v5, "Got unexpected exception: "
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_2
    //         :try_start_5
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v3
    //         :try_end_5
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_0
    //         throw v0
    //         :catchall_1
    //         move-exception v0
    //         move-object v1, v2
    //         :goto_2
    //         :try_start_6
    //         invoke-static {v1}, Lcom/facebook/internal/Utility;->closeQuietly(Ljava/io/Closeable;)V
    //         throw v0
    //         :try_end_6
    //         .catchall {:try_start_6 .. :try_end_6} :catchall_0
    //         :catchall_2
    //         move-exception v0
    //         goto :goto_2
    //         :catch_1
    //         move-exception v0
    //         goto :goto_1
    */

    }
}
