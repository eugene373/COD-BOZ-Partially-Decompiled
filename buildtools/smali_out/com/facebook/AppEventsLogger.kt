package com.facebook

// Auto-emitted from smali source: AppEventsLogger.java.
// 20 fields, 57 methods.

open class AppEventsLogger {
    private val accessTokenAppId: com.facebook.AppEventsLogger.AccessTokenAppIdPair
    private val context: android.content.Context

    private constructor(p0: android.content.Context, p1: String, p2: com.facebook.Session)

    private fun logAppSessionResumeEvent(p0: Long, p1: String) { /* TODO(body): (JLjava/lang/String;)V */ }
    /*
    //         .locals 7
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->applicationContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/facebook/AppEventsLogger;->accessTokenAppId:Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
    //         move-object v3, p0
    //         move-wide v4, p1
    //         move-object v6, p3
    //         invoke-static/range {v1 .. v6}, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->onResume(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/AppEventsLogger;JLjava/lang/String;)V
    //         return-void
    */

    private fun logAppSessionSuspendEvent(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->applicationContext:Landroid/content/Context;
    //         iget-object v1, p0, Lcom/facebook/AppEventsLogger;->accessTokenAppId:Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
    //         invoke-static {v0, v1, p0, p1, p2}, Lcom/facebook/AppEventsLogger$PersistedAppSessionInfo;->onSuspend(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/AppEventsLogger;J)V
    //         return-void
    */

    private fun logEvent(p0: String, p1: Double, p2: android.os.Bundle, p3: Boolean) { /* TODO(body): (Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Z)V */ }
    /*
    //         .locals 6
    //         new-instance v0, Lcom/facebook/AppEventsLogger$AppEvent;
    //         iget-object v1, p0, Lcom/facebook/AppEventsLogger;->context:Landroid/content/Context;
    //         move-object v2, p1
    //         move-object v3, p2
    //         move-object v4, p3
    //         move v5, p4
    //         invoke-direct/range {v0 .. v5}, Lcom/facebook/AppEventsLogger$AppEvent;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Z)V
    //         iget-object v1, p0, Lcom/facebook/AppEventsLogger;->context:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/facebook/AppEventsLogger;->accessTokenAppId:Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
    //         invoke-static {v1, v0, v2}, Lcom/facebook/AppEventsLogger;->logEvent(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AppEvent;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)V
    //         return-void
    */

    public fun flush() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/facebook/AppEventsLogger$FlushReason;->EXPLICIT:Lcom/facebook/AppEventsLogger$FlushReason;
    //         invoke-static {v0}, Lcom/facebook/AppEventsLogger;->flush(Lcom/facebook/AppEventsLogger$FlushReason;)V
    //         return-void
    */

    public fun getApplicationId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/AppEventsLogger;->accessTokenAppId:Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
    //         invoke-virtual {v0}, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;->getApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    fun isValidForSession(p0: com.facebook.Session): Boolean { return TODO("body: (Lcom/facebook/Session;)Z") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
    //         invoke-direct {v0, p1}, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;-><init>(Lcom/facebook/Session;)V
    //         iget-object v1, p0, Lcom/facebook/AppEventsLogger;->accessTokenAppId:Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
    //         invoke-virtual {v1, v0}, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun logEvent(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun logEvent(p0: String, p1: Double) { /* TODO(body): (Ljava/lang/String;D)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, p3, v0}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;DLandroid/os/Bundle;)V
    //         return-void
    */

    public fun logEvent(p0: String, p1: Double, p2: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;DLandroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-direct {p0, p1, v0, p4, v1}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Z)V
    //         return-void
    */

    public fun logEvent(p0: String, p1: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         const/4 v1, 0x0
    //         invoke-direct {p0, p1, v0, p2, v1}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Z)V
    //         return-void
    */

    public fun logPurchase(p0: java.math.BigDecimal, p1: java.util.Currency) { /* TODO(body): (Ljava/math/BigDecimal;Ljava/util/Currency;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/AppEventsLogger;->logPurchase(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun logPurchase(p0: java.math.BigDecimal, p1: java.util.Currency, p2: android.os.Bundle) { /* TODO(body): (Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         if-nez p1, :cond_0
    //         const-string v0, "purchaseAmount cannot be null"
    //         invoke-static {v0}, Lcom/facebook/AppEventsLogger;->notifyDeveloperError(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         if-nez p2, :cond_1
    //         const-string v0, "currency cannot be null"
    //         invoke-static {v0}, Lcom/facebook/AppEventsLogger;->notifyDeveloperError(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_1
    //         if-nez p3, :cond_2
    //         new-instance p3, Landroid/os/Bundle;
    //         invoke-direct {p3}, Landroid/os/Bundle;-><init>()V
    //         :cond_2
    //         const-string v0, "fb_currency"
    //         invoke-virtual {p2}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "fb_mobile_purchase"
    //         invoke-virtual {p1}, Ljava/math/BigDecimal;->doubleValue()D
    //         move-result-wide v2
    //         invoke-virtual {p0, v0, v2, v3, p3}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;DLandroid/os/Bundle;)V
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->eagerFlush()V
    //         goto :goto_0
    */

    public fun logSdkEvent(p0: String, p1: Double, p2: android.os.Bundle) { /* TODO(body): (Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/AppEventsLogger;->logEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Z)V
    //         return-void
    */

    companion object {
    @JvmField public val ACTION_APP_EVENTS_FLUSHED: String = "com.facebook.sdk.APP_EVENTS_FLUSHED"
    @JvmField public val APP_EVENTS_EXTRA_FLUSH_RESULT: String = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT"
    @JvmField public val APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED: String = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED"
    private val APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS: Int = 0x15180
    private val FLUSH_APP_SESSION_INFO_IN_SECONDS: Int = 0x1e
    private val FLUSH_PERIOD_IN_SECONDS: Int = 0xf
    private val NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER: Int = 0x64
    private val SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT: String = "_fbSourceApplicationHasBeenSet"
    private val TAG: String = null!!
    private var applicationContext: android.content.Context
    private var backgroundExecutor: java.util.concurrent.ScheduledThreadPoolExecutor
    private var flushBehavior: com.facebook.AppEventsLogger.FlushBehavior
    private var hashedDeviceAndAppId: String
    private var isOpenedByApplink: Boolean
    private var requestInFlight: Boolean
    private var sourceApplication: String
    private var stateMap: java.util.Map
    private var staticLock: Object

    private @JvmStatic fun accumulatePersistedEvents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 5
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->applicationContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/facebook/AppEventsLogger$PersistedEvents;->readAndClearStore(Landroid/content/Context;)Lcom/facebook/AppEventsLogger$PersistedEvents;
    //         move-result-object v2
    //         const/4 v0, 0x0
    //         invoke-virtual {v2}, Lcom/facebook/AppEventsLogger$PersistedEvents;->keySet()Ljava/util/Set;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         move v1, v0
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
    //         sget-object v4, Lcom/facebook/AppEventsLogger;->applicationContext:Landroid/content/Context;
    //         invoke-static {v4, v0}, Lcom/facebook/AppEventsLogger;->getSessionEventsState(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)Lcom/facebook/AppEventsLogger$SessionEventsState;
    //         move-result-object v4
    //         invoke-virtual {v2, v0}, Lcom/facebook/AppEventsLogger$PersistedEvents;->getEvents(Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-virtual {v4, v0}, Lcom/facebook/AppEventsLogger$SessionEventsState;->accumulatePersistedEvents(Ljava/util/List;)V
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         add-int/2addr v0, v1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         return v1
    */

    public @JvmStatic fun activateApp(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/facebook/Settings;->sdkInitialize(Landroid/content/Context;)V
    //         invoke-static {p0}, Lcom/facebook/internal/Utility;->getMetadataApplicationId(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/facebook/AppEventsLogger;->activateApp(Landroid/content/Context;Ljava/lang/String;)V
    //         return-void
    */

    public @JvmStatic fun activateApp(p0: android.content.Context, p1: String) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;)V */ }
    /*
    //         .locals 6
    //         const/4 v2, 0x0
    //         if-eqz p0, :cond_0
    //         if-nez p1, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Both context and applicationId must be non-null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         instance-of v0, p0, Landroid/app/Activity;
    //         if-eqz v0, :cond_2
    //         move-object v0, p0
    //         check-cast v0, Landroid/app/Activity;
    //         invoke-static {v0}, Lcom/facebook/AppEventsLogger;->setSourceApplication(Landroid/app/Activity;)V
    //         :goto_0
    //         invoke-static {p0, p1, v2}, Lcom/facebook/Settings;->publishInstallAsync(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Request$Callback;)V
    //         new-instance v0, Lcom/facebook/AppEventsLogger;
    //         invoke-direct {v0, p0, p1, v2}, Lcom/facebook/AppEventsLogger;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)V
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->getSourceApplication()Ljava/lang/String;
    //         move-result-object v1
    //         sget-object v4, Lcom/facebook/AppEventsLogger;->backgroundExecutor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    //         new-instance v5, Lcom/facebook/AppEventsLogger$1;
    //         invoke-direct {v5, v0, v2, v3, v1}, Lcom/facebook/AppEventsLogger$1;-><init>(Lcom/facebook/AppEventsLogger;JLjava/lang/String;)V
    //         invoke-virtual {v4, v5}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    //         return-void
    //         :cond_2
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->resetSourceApplication()V
    //         const-class v0, Lcom/facebook/AppEventsLogger;
    //         invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "To set source application the context of activateApp must be an instance of Activity"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    private @JvmStatic fun buildAndExecuteRequests(p0: com.facebook.AppEventsLogger.FlushReason, p1: java.util.Set): com.facebook.AppEventsLogger.FlushStatistics { return TODO("body: (Lcom/facebook/AppEventsLogger$FlushReason;Ljava/util/Set;)Lcom/facebook/AppEventsLogger$FlushStatistics;") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/facebook/AppEventsLogger$FlushReason;",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;",
    //                 ">;)",
    //                 "Lcom/facebook/AppEventsLogger$FlushStatistics;"
    //             }
    //         .end annotation
    //         const/4 v2, 0x0
    //         new-instance v1, Lcom/facebook/AppEventsLogger$FlushStatistics;
    //         invoke-direct {v1, v2}, Lcom/facebook/AppEventsLogger$FlushStatistics;-><init>(Lcom/facebook/AppEventsLogger$1;)V
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->applicationContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/facebook/Settings;->getLimitEventAndDataUsage(Landroid/content/Context;)Z
    //         move-result v3
    //         new-instance v4, Ljava/util/ArrayList;
    //         invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    //         invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;
    //         invoke-static {v0}, Lcom/facebook/AppEventsLogger;->getSessionEventsState(Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)Lcom/facebook/AppEventsLogger$SessionEventsState;
    //         move-result-object v6
    //         if-eqz v6, :cond_0
    //         invoke-static {v0, v6, v3, v1}, Lcom/facebook/AppEventsLogger;->buildRequestForSession(Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/AppEventsLogger$SessionEventsState;ZLcom/facebook/AppEventsLogger$FlushStatistics;)Lcom/facebook/Request;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_1
    //         invoke-interface {v4}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-lez v0, :cond_3
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->APP_EVENTS:Lcom/facebook/LoggingBehavior;
    //         sget-object v2, Lcom/facebook/AppEventsLogger;->TAG:Ljava/lang/String;
    //         const-string v3, "Flushing %d events due to %s."
    //         const/4 v5, 0x2
    //         new-array v5, v5, [Ljava/lang/Object;
    //         const/4 v6, 0x0
    //         iget v7, v1, Lcom/facebook/AppEventsLogger$FlushStatistics;->numEvents:I
    //         invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v7
    //         aput-object v7, v5, v6
    //         const/4 v6, 0x1
    //         invoke-virtual {p0}, Lcom/facebook/AppEventsLogger$FlushReason;->toString()Ljava/lang/String;
    //         move-result-object v7
    //         aput-object v7, v5, v6
    //         invoke-static {v0, v2, v3, v5}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/Request;
    //         invoke-virtual {v0}, Lcom/facebook/Request;->executeAndWait()Lcom/facebook/Response;
    //         goto :goto_1
    //         :cond_2
    //         move-object v0, v1
    //         :goto_2
    //         return-object v0
    //         :cond_3
    //         move-object v0, v2
    //         goto :goto_2
    */

    private @JvmStatic fun buildRequestForSession(p0: com.facebook.AppEventsLogger.AccessTokenAppIdPair, p1: com.facebook.AppEventsLogger.SessionEventsState, p2: Boolean, p3: com.facebook.AppEventsLogger.FlushStatistics): com.facebook.Request { return TODO("body: (Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/AppEventsLogger$SessionEventsState;ZLcom/facebook/AppEventsLogger$FlushStatistics;)Lcom/facebook/Request;") }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0}, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;->getApplicationId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0, v5}, Lcom/facebook/internal/Utility;->queryAppSettings(Ljava/lang/String;Z)Lcom/facebook/internal/Utility$FetchedAppSettings;
    //         move-result-object v3
    //         const-string v2, "%s/activities"
    //         const/4 v4, 0x1
    //         new-array v4, v4, [Ljava/lang/Object;
    //         aput-object v0, v4, v5
    //         invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0, v1, v1}, Lcom/facebook/Request;->newPostRequest(Lcom/facebook/Session;Ljava/lang/String;Lcom/facebook/model/GraphObject;Lcom/facebook/Request$Callback;)Lcom/facebook/Request;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/facebook/Request;->getParameters()Landroid/os/Bundle;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         :cond_0
    //         const-string v4, "access_token"
    //         invoke-virtual {p0}, Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;->getAccessToken()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v2, v0}, Lcom/facebook/Request;->setParameters(Landroid/os/Bundle;)V
    //         if-nez v3, :cond_1
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         invoke-virtual {v3}, Lcom/facebook/internal/Utility$FetchedAppSettings;->supportsImplicitLogging()Z
    //         move-result v0
    //         invoke-virtual {v3}, Lcom/facebook/internal/Utility$FetchedAppSettings;->supportsAttribution()Z
    //         move-result v3
    //         invoke-virtual {p1, v2, v0, v3, p2}, Lcom/facebook/AppEventsLogger$SessionEventsState;->populateRequest(Lcom/facebook/Request;ZZZ)I
    //         move-result v0
    //         if-nez v0, :cond_2
    //         move-object v0, v1
    //         goto :goto_0
    //         :cond_2
    //         iget v1, p3, Lcom/facebook/AppEventsLogger$FlushStatistics;->numEvents:I
    //         add-int/2addr v0, v1
    //         iput v0, p3, Lcom/facebook/AppEventsLogger$FlushStatistics;->numEvents:I
    //         new-instance v0, Lcom/facebook/AppEventsLogger$7;
    //         invoke-direct {v0, p0, v2, p1, p3}, Lcom/facebook/AppEventsLogger$7;-><init>(Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/Request;Lcom/facebook/AppEventsLogger$SessionEventsState;Lcom/facebook/AppEventsLogger$FlushStatistics;)V
    //         invoke-virtual {v2, v0}, Lcom/facebook/Request;->setCallback(Lcom/facebook/Request$Callback;)V
    //         move-object v0, v2
    //         goto :goto_0
    */

    public @JvmStatic fun deactivateApp(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/facebook/internal/Utility;->getMetadataApplicationId(Landroid/content/Context;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Lcom/facebook/AppEventsLogger;->deactivateApp(Landroid/content/Context;Ljava/lang/String;)V
    //         return-void
    */

    public @JvmStatic fun deactivateApp(p0: android.content.Context, p1: String) { /* TODO(body): (Landroid/content/Context;Ljava/lang/String;)V */ }
    /*
    //         .locals 5
    //         if-eqz p0, :cond_0
    //         if-nez p1, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Both context and applicationId must be non-null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->resetSourceApplication()V
    //         new-instance v0, Lcom/facebook/AppEventsLogger;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, p1, v1}, Lcom/facebook/AppEventsLogger;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)V
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->backgroundExecutor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    //         new-instance v4, Lcom/facebook/AppEventsLogger$2;
    //         invoke-direct {v4, v0, v2, v3}, Lcom/facebook/AppEventsLogger$2;-><init>(Lcom/facebook/AppEventsLogger;J)V
    //         invoke-virtual {v1, v4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    //         return-void
    */

    @JvmStatic fun eagerFlush() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->getFlushBehavior()Lcom/facebook/AppEventsLogger$FlushBehavior;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/AppEventsLogger$FlushBehavior;->EXPLICIT_ONLY:Lcom/facebook/AppEventsLogger$FlushBehavior;
    //         if-eq v0, v1, :cond_0
    //         sget-object v0, Lcom/facebook/AppEventsLogger$FlushReason;->EAGER_FLUSHING_EVENT:Lcom/facebook/AppEventsLogger$FlushReason;
    //         invoke-static {v0}, Lcom/facebook/AppEventsLogger;->flush(Lcom/facebook/AppEventsLogger$FlushReason;)V
    //         :cond_0
    //         return-void
    */

    private @JvmStatic fun flush(p0: com.facebook.AppEventsLogger.FlushReason) { /* TODO(body): (Lcom/facebook/AppEventsLogger$FlushReason;)V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/facebook/Settings;->getExecutor()Ljava/util/concurrent/Executor;
    //         move-result-object v0
    //         new-instance v1, Lcom/facebook/AppEventsLogger$6;
    //         invoke-direct {v1, p0}, Lcom/facebook/AppEventsLogger$6;-><init>(Lcom/facebook/AppEventsLogger$FlushReason;)V
    //         invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    //         return-void
    */

    private @JvmStatic fun flushAndWait(p0: com.facebook.AppEventsLogger.FlushReason) { /* TODO(body): (Lcom/facebook/AppEventsLogger$FlushReason;)V */ }
    /*
    //         .locals 4
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->staticLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-boolean v0, Lcom/facebook/AppEventsLogger;->requestInFlight:Z
    //         if-eqz v0, :cond_1
    //         monitor-exit v1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x1
    //         sput-boolean v0, Lcom/facebook/AppEventsLogger;->requestInFlight:Z
    //         new-instance v2, Ljava/util/HashSet;
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->stateMap:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->accumulatePersistedEvents()I
    //         const/4 v0, 0x0
    //         :try_start_1
    //         invoke-static {p0, v2}, Lcom/facebook/AppEventsLogger;->buildAndExecuteRequests(Lcom/facebook/AppEventsLogger$FlushReason;Ljava/util/Set;)Lcom/facebook/AppEventsLogger$FlushStatistics;
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         move-result-object v0
    //         :goto_1
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->staticLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         const/4 v2, 0x0
    //         :try_start_2
    //         sput-boolean v2, Lcom/facebook/AppEventsLogger;->requestInFlight:Z
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_1
    //         if-eqz v0, :cond_0
    //         new-instance v1, Landroid/content/Intent;
    //         const-string v2, "com.facebook.sdk.APP_EVENTS_FLUSHED"
    //         invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v2, "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED"
    //         iget v3, v0, Lcom/facebook/AppEventsLogger$FlushStatistics;->numEvents:I
    //         invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         const-string v2, "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT"
    //         iget-object v0, v0, Lcom/facebook/AppEventsLogger$FlushStatistics;->result:Lcom/facebook/AppEventsLogger$FlushResult;
    //         invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->applicationContext:Landroid/content/Context;
    //         invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;
    //         move-result-object v0
    //         invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_3
    //         monitor-exit v1
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         throw v0
    //         :catch_0
    //         move-exception v1
    //         sget-object v2, Lcom/facebook/AppEventsLogger;->TAG:Ljava/lang/String;
    //         const-string v3, "Caught unexpected exception while flushing: "
    //         invoke-static {v2, v3, v1}, Lcom/facebook/internal/Utility;->logd(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_1
    //         :catchall_1
    //         move-exception v0
    //         :try_start_4
    //         monitor-exit v1
    //         :try_end_4
    //         .catchall {:try_start_4 .. :try_end_4} :catchall_1
    //         throw v0
    */

    private @JvmStatic fun flushIfNecessary() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->staticLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->getFlushBehavior()Lcom/facebook/AppEventsLogger$FlushBehavior;
    //         move-result-object v0
    //         sget-object v2, Lcom/facebook/AppEventsLogger$FlushBehavior;->EXPLICIT_ONLY:Lcom/facebook/AppEventsLogger$FlushBehavior;
    //         if-eq v0, v2, :cond_0
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->getAccumulatedEventCount()I
    //         move-result v0
    //         const/16 v2, 0x64
    //         if-le v0, v2, :cond_0
    //         sget-object v0, Lcom/facebook/AppEventsLogger$FlushReason;->EVENT_THRESHOLD:Lcom/facebook/AppEventsLogger$FlushReason;
    //         invoke-static {v0}, Lcom/facebook/AppEventsLogger;->flush(Lcom/facebook/AppEventsLogger$FlushReason;)V
    //         :cond_0
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    private @JvmStatic fun getAccumulatedEventCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         sget-object v2, Lcom/facebook/AppEventsLogger;->staticLock:Ljava/lang/Object;
    //         monitor-enter v2
    //         const/4 v0, 0x0
    //         :try_start_0
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->stateMap:Ljava/util/Map;
    //         invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         move v1, v0
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AppEventsLogger$SessionEventsState;
    //         invoke-virtual {v0}, Lcom/facebook/AppEventsLogger$SessionEventsState;->getAccumulatedEventCount()I
    //         move-result v0
    //         add-int/2addr v0, v1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         monitor-exit v2
    //         return v1
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun getFlushBehavior(): com.facebook.AppEventsLogger.FlushBehavior { return TODO("body: ()Lcom/facebook/AppEventsLogger$FlushBehavior;") }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->staticLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->flushBehavior:Lcom/facebook/AppEventsLogger$FlushBehavior;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun getLimitEventUsage(p0: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {p0}, Lcom/facebook/Settings;->getLimitEventAndDataUsage(Landroid/content/Context;)Z
    //         move-result v0
    //         return v0
    */

    private @JvmStatic fun getSessionEventsState(p0: android.content.Context, p1: com.facebook.AppEventsLogger.AccessTokenAppIdPair): com.facebook.AppEventsLogger.SessionEventsState { return TODO("body: (Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)Lcom/facebook/AppEventsLogger$SessionEventsState;") }
    /*
    //         .locals 5
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->stateMap:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AppEventsLogger$SessionEventsState;
    //         const/4 v1, 0x0
    //         if-nez v0, :cond_0
    //         invoke-static {p0}, Lcom/facebook/internal/AttributionIdentifiers;->getAttributionIdentifiers(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;
    //         move-result-object v0
    //         move-object v1, v0
    //         :cond_0
    //         sget-object v2, Lcom/facebook/AppEventsLogger;->staticLock:Ljava/lang/Object;
    //         monitor-enter v2
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->stateMap:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AppEventsLogger$SessionEventsState;
    //         if-nez v0, :cond_1
    //         new-instance v0, Lcom/facebook/AppEventsLogger$SessionEventsState;
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         sget-object v4, Lcom/facebook/AppEventsLogger;->hashedDeviceAndAppId:Ljava/lang/String;
    //         invoke-direct {v0, v1, v3, v4}, Lcom/facebook/AppEventsLogger$SessionEventsState;-><init>(Lcom/facebook/internal/AttributionIdentifiers;Ljava/lang/String;Ljava/lang/String;)V
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->stateMap:Ljava/util/Map;
    //         invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_1
    //         monitor-exit v2
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    private @JvmStatic fun getSessionEventsState(p0: com.facebook.AppEventsLogger.AccessTokenAppIdPair): com.facebook.AppEventsLogger.SessionEventsState { return TODO("body: (Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)Lcom/facebook/AppEventsLogger$SessionEventsState;") }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->staticLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->stateMap:Ljava/util/Map;
    //         invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/facebook/AppEventsLogger$SessionEventsState;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    @JvmStatic fun getSourceApplication(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 2
    //         const-string v0, "Unclassified"
    //         sget-boolean v1, Lcom/facebook/AppEventsLogger;->isOpenedByApplink:Z
    //         if-eqz v1, :cond_0
    //         const-string v0, "Applink"
    //         :cond_0
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->sourceApplication:Ljava/lang/String;
    //         if-eqz v1, :cond_1
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, "("
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->sourceApplication:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ")"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :cond_1
    //         return-object v0
    */

    private @JvmStatic fun handleResponse(p0: com.facebook.AppEventsLogger.AccessTokenAppIdPair, p1: com.facebook.Request, p2: com.facebook.Response, p3: com.facebook.AppEventsLogger.SessionEventsState, p4: com.facebook.AppEventsLogger.FlushStatistics) { /* TODO(body): (Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/Request;Lcom/facebook/Response;Lcom/facebook/AppEventsLogger$SessionEventsState;Lcom/facebook/AppEventsLogger$FlushStatistics;)V */ }
    /*
    //         .locals 10
    //         invoke-virtual {p2}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;
    //         move-result-object v3
    //         const-string v1, "Success"
    //         sget-object v0, Lcom/facebook/AppEventsLogger$FlushResult;->SUCCESS:Lcom/facebook/AppEventsLogger$FlushResult;
    //         if-eqz v3, :cond_5
    //         invoke-virtual {v3}, Lcom/facebook/FacebookRequestError;->getErrorCode()I
    //         move-result v0
    //         const/4 v1, -0x1
    //         if-ne v0, v1, :cond_3
    //         const-string v1, "Failed: No Connectivity"
    //         sget-object v0, Lcom/facebook/AppEventsLogger$FlushResult;->NO_CONNECTIVITY:Lcom/facebook/AppEventsLogger$FlushResult;
    //         move-object v2, v1
    //         move-object v1, v0
    //         :goto_0
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->APP_EVENTS:Lcom/facebook/LoggingBehavior;
    //         invoke-static {v0}, Lcom/facebook/Settings;->isLoggingBehaviorEnabled(Lcom/facebook/LoggingBehavior;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1}, Lcom/facebook/Request;->getTag()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         :try_start_0
    //         new-instance v4, Lorg/json/JSONArray;
    //         invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    //         const/4 v0, 0x2
    //         invoke-virtual {v4, v0}, Lorg/json/JSONArray;->toString(I)Ljava/lang/String;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_1
    //         sget-object v4, Lcom/facebook/LoggingBehavior;->APP_EVENTS:Lcom/facebook/LoggingBehavior;
    //         sget-object v5, Lcom/facebook/AppEventsLogger;->TAG:Ljava/lang/String;
    //         const-string v6, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s"
    //         const/4 v7, 0x3
    //         new-array v7, v7, [Ljava/lang/Object;
    //         const/4 v8, 0x0
    //         invoke-virtual {p1}, Lcom/facebook/Request;->getGraphObject()Lcom/facebook/model/GraphObject;
    //         move-result-object v9
    //         invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v9
    //         aput-object v9, v7, v8
    //         const/4 v8, 0x1
    //         aput-object v2, v7, v8
    //         const/4 v2, 0x2
    //         aput-object v0, v7, v2
    //         invoke-static {v4, v5, v6, v7}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //         :cond_0
    //         if-eqz v3, :cond_4
    //         const/4 v0, 0x1
    //         :goto_2
    //         invoke-virtual {p3, v0}, Lcom/facebook/AppEventsLogger$SessionEventsState;->clearInFlightAndStats(Z)V
    //         sget-object v0, Lcom/facebook/AppEventsLogger$FlushResult;->NO_CONNECTIVITY:Lcom/facebook/AppEventsLogger$FlushResult;
    //         if-ne v1, v0, :cond_1
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->applicationContext:Landroid/content/Context;
    //         invoke-static {v0, p0, p3}, Lcom/facebook/AppEventsLogger$PersistedEvents;->persistEvents(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/AppEventsLogger$SessionEventsState;)V
    //         :cond_1
    //         sget-object v0, Lcom/facebook/AppEventsLogger$FlushResult;->SUCCESS:Lcom/facebook/AppEventsLogger$FlushResult;
    //         if-eq v1, v0, :cond_2
    //         iget-object v0, p4, Lcom/facebook/AppEventsLogger$FlushStatistics;->result:Lcom/facebook/AppEventsLogger$FlushResult;
    //         sget-object v2, Lcom/facebook/AppEventsLogger$FlushResult;->NO_CONNECTIVITY:Lcom/facebook/AppEventsLogger$FlushResult;
    //         if-eq v0, v2, :cond_2
    //         iput-object v1, p4, Lcom/facebook/AppEventsLogger$FlushStatistics;->result:Lcom/facebook/AppEventsLogger$FlushResult;
    //         :cond_2
    //         return-void
    //         :cond_3
    //         const-string v0, "Failed:\n  Response: %s\n  Error %s"
    //         const/4 v1, 0x2
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         invoke-virtual {p2}, Lcom/facebook/Response;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         aput-object v4, v1, v2
    //         const/4 v2, 0x1
    //         invoke-virtual {v3}, Lcom/facebook/FacebookRequestError;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         aput-object v4, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         sget-object v0, Lcom/facebook/AppEventsLogger$FlushResult;->SERVER_ERROR:Lcom/facebook/AppEventsLogger$FlushResult;
    //         move-object v2, v1
    //         move-object v1, v0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "<Can\'t encode events for debug logging>"
    //         goto :goto_1
    //         :cond_4
    //         const/4 v0, 0x0
    //         goto :goto_2
    //         :cond_5
    //         move-object v2, v1
    //         move-object v1, v0
    //         goto :goto_0
    */

    private @JvmStatic fun initializeTimersIfNeeded() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         const-wide/16 v2, 0x0
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->staticLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->backgroundExecutor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    //         if-eqz v0, :cond_0
    //         monitor-exit v1
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    //         const/4 v4, 0x1
    //         invoke-direct {v0, v4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V
    //         sput-object v0, Lcom/facebook/AppEventsLogger;->backgroundExecutor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         new-instance v1, Lcom/facebook/AppEventsLogger$3;
    //         invoke-direct {v1}, Lcom/facebook/AppEventsLogger$3;-><init>()V
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->backgroundExecutor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    //         const-wide/16 v4, 0xf
    //         sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual/range {v0 .. v6}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //         new-instance v1, Lcom/facebook/AppEventsLogger$4;
    //         invoke-direct {v1}, Lcom/facebook/AppEventsLogger$4;-><init>()V
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->backgroundExecutor:Ljava/util/concurrent/ScheduledThreadPoolExecutor;
    //         const-wide/32 v4, 0x15180
    //         sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual/range {v0 .. v6}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    private @JvmStatic fun logEvent(p0: android.content.Context, p1: com.facebook.AppEventsLogger.AppEvent, p2: com.facebook.AppEventsLogger.AccessTokenAppIdPair) { /* TODO(body): (Landroid/content/Context;Lcom/facebook/AppEventsLogger$AppEvent;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;)V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/facebook/Settings;->getExecutor()Ljava/util/concurrent/Executor;
    //         move-result-object v0
    //         new-instance v1, Lcom/facebook/AppEventsLogger$5;
    //         invoke-direct {v1, p0, p2, p1}, Lcom/facebook/AppEventsLogger$5;-><init>(Landroid/content/Context;Lcom/facebook/AppEventsLogger$AccessTokenAppIdPair;Lcom/facebook/AppEventsLogger$AppEvent;)V
    //         invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    //         return-void
    */

    public @JvmStatic fun newLogger(p0: android.content.Context): com.facebook.AppEventsLogger { return TODO("body: (Landroid/content/Context;)Lcom/facebook/AppEventsLogger;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         new-instance v0, Lcom/facebook/AppEventsLogger;
    //         invoke-direct {v0, p0, v1, v1}, Lcom/facebook/AppEventsLogger;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)V
    //         return-object v0
    */

    public @JvmStatic fun newLogger(p0: android.content.Context, p1: com.facebook.Session): com.facebook.AppEventsLogger { return TODO("body: (Landroid/content/Context;Lcom/facebook/Session;)Lcom/facebook/AppEventsLogger;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/facebook/AppEventsLogger;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1, p1}, Lcom/facebook/AppEventsLogger;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)V
    //         return-object v0
    */

    public @JvmStatic fun newLogger(p0: android.content.Context, p1: String): com.facebook.AppEventsLogger { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Lcom/facebook/AppEventsLogger;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/facebook/AppEventsLogger;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, p1, v1}, Lcom/facebook/AppEventsLogger;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)V
    //         return-object v0
    */

    public @JvmStatic fun newLogger(p0: android.content.Context, p1: String, p2: com.facebook.Session): com.facebook.AppEventsLogger { return TODO("body: (Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)Lcom/facebook/AppEventsLogger;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/facebook/AppEventsLogger;
    //         invoke-direct {v0, p0, p1, p2}, Lcom/facebook/AppEventsLogger;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Session;)V
    //         return-object v0
    */

    private @JvmStatic fun notifyDeveloperError(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/facebook/LoggingBehavior;->DEVELOPER_ERRORS:Lcom/facebook/LoggingBehavior;
    //         const-string v1, "AppEvents"
    //         invoke-static {v0, v1, p0}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public @JvmStatic fun onContextStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/facebook/AppEventsLogger;->applicationContext:Landroid/content/Context;
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->stateMap:Ljava/util/Map;
    //         invoke-static {v0, v1}, Lcom/facebook/AppEventsLogger$PersistedEvents;->persistEvents(Landroid/content/Context;Ljava/util/Map;)V
    //         return-void
    */

    @JvmStatic fun resetSourceApplication() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         sput-object v0, Lcom/facebook/AppEventsLogger;->sourceApplication:Ljava/lang/String;
    //         const/4 v0, 0x0
    //         sput-boolean v0, Lcom/facebook/AppEventsLogger;->isOpenedByApplink:Z
    //         return-void
    */

    public @JvmStatic fun setFlushBehavior(p0: com.facebook.AppEventsLogger.FlushBehavior) { /* TODO(body): (Lcom/facebook/AppEventsLogger$FlushBehavior;)V */ }
    /*
    //         .locals 2
    //         sget-object v1, Lcom/facebook/AppEventsLogger;->staticLock:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sput-object p0, Lcom/facebook/AppEventsLogger;->flushBehavior:Lcom/facebook/AppEventsLogger$FlushBehavior;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun setLimitEventUsage(p0: android.content.Context, p1: Boolean) { /* TODO(body): (Landroid/content/Context;Z)V */ }
    /*
    //         .locals 0
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-static {p0, p1}, Lcom/facebook/Settings;->setLimitEventAndDataUsage(Landroid/content/Context;Z)V
    //         return-void
    */

    private @JvmStatic fun setSourceApplication(p0: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         invoke-virtual {p0}, Landroid/app/Activity;->getCallingActivity()Landroid/content/ComponentName;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->resetSourceApplication()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         sput-object v0, Lcom/facebook/AppEventsLogger;->sourceApplication:Ljava/lang/String;
    //         :cond_1
    //         invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         const-string v1, "_fbSourceApplicationHasBeenSet"
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         :cond_2
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->resetSourceApplication()V
    //         goto :goto_0
    //         :cond_3
    //         invoke-static {v0}, Lbolts/AppLinks;->getAppLinkData(Landroid/content/Intent;)Landroid/os/Bundle;
    //         move-result-object v1
    //         if-nez v1, :cond_4
    //         invoke-static {}, Lcom/facebook/AppEventsLogger;->resetSourceApplication()V
    //         goto :goto_0
    //         :cond_4
    //         sput-boolean v3, Lcom/facebook/AppEventsLogger;->isOpenedByApplink:Z
    //         const-string v2, "referer_app_link"
    //         invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v1
    //         if-nez v1, :cond_5
    //         const/4 v0, 0x0
    //         sput-object v0, Lcom/facebook/AppEventsLogger;->sourceApplication:Ljava/lang/String;
    //         goto :goto_0
    //         :cond_5
    //         const-string v2, "package"
    //         invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         sput-object v1, Lcom/facebook/AppEventsLogger;->sourceApplication:Ljava/lang/String;
    //         const-string v1, "_fbSourceApplicationHasBeenSet"
    //         invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
    //         goto :goto_0
    */

    @JvmStatic fun setSourceApplication(p0: String, p1: Boolean) { /* TODO(body): (Ljava/lang/String;Z)V */ }
    /*
    //         .locals 0
    //         sput-object p0, Lcom/facebook/AppEventsLogger;->sourceApplication:Ljava/lang/String;
    //         sput-boolean p1, Lcom/facebook/AppEventsLogger;->isOpenedByApplink:Z
    //         return-void
    */

    }
}
