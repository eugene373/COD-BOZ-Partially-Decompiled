package com.google.android.gms.analytics

// Auto-emitted from smali.
// 11 fields, 33 methods.

open class Tracker {
    private val Bm: com.google.android.gms.analytics.TrackerHandler
    private var Bn: com.google.android.gms.analytics.ac
    private val Bo: com.google.android.gms.analytics.h
    private val Bp: com.google.android.gms.analytics.ad
    private val Bq: com.google.android.gms.analytics.g
    private var Br: Boolean
    private var Bs: com.google.android.gms.analytics.Tracker.a
    private var Bt: com.google.android.gms.analytics.ai
    private var Bu: com.google.android.gms.analytics.ExceptionReporter
    private var mContext: android.content.Context
    private val qM: java.util.Map

    constructor(trackingId: String, handler: com.google.android.gms.analytics.TrackerHandler, context: android.content.Context)

    constructor(trackingId: String, handler: com.google.android.gms.analytics.TrackerHandler, clientIdDefaultProvider: com.google.android.gms.analytics.h, screenResolutionDefaultProvider: com.google.android.gms.analytics.ad, appFieldsDefaultProvider: com.google.android.gms.analytics.g, rateLimiter: com.google.android.gms.analytics.ac, context: android.content.Context)

    fun a(p0: com.google.android.gms.analytics.ai) { /* TODO(body): (Lcom/google/android/gms/analytics/ai;)V */ }
    /*
    //         .locals 4
    //         const-string v0, "Loading Tracker config values."
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         iput-object p1, p0, Lcom/google/android/gms/analytics/Tracker;->Bt:Lcom/google/android/gms/analytics/ai;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bt:Lcom/google/android/gms/analytics/ai;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ai;->eZ()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bt:Lcom/google/android/gms/analytics/ai;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ai;->fa()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "&tid"
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "[Tracker] trackingId loaded: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bt:Lcom/google/android/gms/analytics/ai;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ai;->fb()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bt:Lcom/google/android/gms/analytics/ai;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ai;->fc()D
    //         move-result-wide v0
    //         invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "&sf"
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "[Tracker] sample frequency loaded: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bt:Lcom/google/android/gms/analytics/ai;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ai;->fd()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bt:Lcom/google/android/gms/analytics/ai;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ai;->getSessionTimeout()I
    //         move-result v0
    //         int-to-long v0, v0
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/Tracker;->setSessionTimeout(J)V
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "[Tracker] session timeout loaded: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/Tracker;->eT()J
    //         move-result-wide v2
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bt:Lcom/google/android/gms/analytics/ai;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ai;->fe()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bt:Lcom/google/android/gms/analytics/ai;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ai;->ff()Z
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/Tracker;->enableAutoActivityTracking(Z)V
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "[Tracker] auto activity tracking loaded: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/Tracker;->eU()Z
    //         move-result v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bt:Lcom/google/android/gms/analytics/ai;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ai;->fg()Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bt:Lcom/google/android/gms/analytics/ai;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ai;->fh()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         const-string v0, "&aip"
    //         const-string v1, "1"
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "[Tracker] anonymize ip loaded: true"
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         :cond_4
    //         const-string v0, "[Tracker] anonymize ip loaded: false"
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bt:Lcom/google/android/gms/analytics/ai;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ai;->fi()Z
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/Tracker;->enableExceptionReporting(Z)V
    //         return-void
    */

    fun eT(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bs:Lcom/google/android/gms/analytics/Tracker$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/Tracker$a;->eT()J
    //         move-result-wide v0
    //         return-wide v0
    */

    fun eU(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bs:Lcom/google/android/gms/analytics/Tracker$a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/Tracker$a;->eU()Z
    //         move-result v0
    //         return v0
    */

    public fun enableAdvertisingIdCollection(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         if-nez p1, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->qM:Ljava/util/Map;
    //         const-string v1, "&ate"
    //         invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->qM:Ljava/util/Map;
    //         const-string v1, "&adid"
    //         invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->qM:Ljava/util/Map;
    //         const-string v1, "&ate"
    //         invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->qM:Ljava/util/Map;
    //         const-string v1, "&ate"
    //         invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->qM:Ljava/util/Map;
    //         const-string v1, "&adid"
    //         invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->qM:Ljava/util/Map;
    //         const-string v1, "&adid"
    //         invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    */

    public fun enableAutoActivityTracking(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bs:Lcom/google/android/gms/analytics/Tracker$a;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/Tracker$a;->enableAutoActivityTracking(Z)V
    //         return-void
    */

    public fun enableExceptionReporting(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 3
    //         iget-boolean v0, p0, Lcom/google/android/gms/analytics/Tracker;->Br:Z
    //         if-ne v0, p1, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iput-boolean p1, p0, Lcom/google/android/gms/analytics/Tracker;->Br:Z
    //         if-eqz p1, :cond_1
    //         new-instance v0, Lcom/google/android/gms/analytics/ExceptionReporter;
    //         invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/Tracker;->mContext:Landroid/content/Context;
    //         invoke-direct {v0, p0, v1, v2}, Lcom/google/android/gms/analytics/ExceptionReporter;-><init>(Lcom/google/android/gms/analytics/Tracker;Ljava/lang/Thread$UncaughtExceptionHandler;Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bu:Lcom/google/android/gms/analytics/ExceptionReporter;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bu:Lcom/google/android/gms/analytics/ExceptionReporter;
    //         invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    //         const-string v0, "Uncaught exceptions will be reported to Google Analytics."
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bu:Lcom/google/android/gms/analytics/ExceptionReporter;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bu:Lcom/google/android/gms/analytics/ExceptionReporter;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ExceptionReporter;->dY()Ljava/lang/Thread$UncaughtExceptionHandler;
    //         move-result-object v0
    //         invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    //         :goto_1
    //         const-string v0, "Uncaught exceptions will not be reported to Google Analytics."
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_2
    //         const/4 v0, 0x0
    //         invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    //         goto :goto_1
    */

    public fun get(key: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;
    //         move-result-object v1
    //         sget-object v2, Lcom/google/android/gms/analytics/t$a;->zo:Lcom/google/android/gms/analytics/t$a;
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker;->qM:Ljava/util/Map;
    //         invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->qM:Ljava/util/Map;
    //         invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         goto :goto_0
    //         :cond_2
    //         const-string v1, "&ul"
    //         invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/aj;->a(Ljava/util/Locale;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_3
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker;->Bo:Lcom/google/android/gms/analytics/h;
    //         if-eqz v1, :cond_4
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker;->Bo:Lcom/google/android/gms/analytics/h;
    //         invoke-virtual {v1, p1}, Lcom/google/android/gms/analytics/h;->ac(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bo:Lcom/google/android/gms/analytics/h;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/h;->getValue(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_4
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker;->Bp:Lcom/google/android/gms/analytics/ad;
    //         if-eqz v1, :cond_5
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker;->Bp:Lcom/google/android/gms/analytics/ad;
    //         invoke-virtual {v1, p1}, Lcom/google/android/gms/analytics/ad;->ac(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bp:Lcom/google/android/gms/analytics/ad;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/ad;->getValue(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    //         :cond_5
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker;->Bq:Lcom/google/android/gms/analytics/g;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker;->Bq:Lcom/google/android/gms/analytics/g;
    //         invoke-virtual {v1, p1}, Lcom/google/android/gms/analytics/g;->ac(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bq:Lcom/google/android/gms/analytics/g;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/g;->getValue(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun send(p0: java.util.Map) { /* TODO(body): (Ljava/util/Map;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .local p1, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    //         const/4 v5, 0x0
    //         const/4 v1, 0x1
    //         invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;
    //         move-result-object v0
    //         sget-object v2, Lcom/google/android/gms/analytics/t$a;->zq:Lcom/google/android/gms/analytics/t$a;
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V
    //         new-instance v2, Ljava/util/HashMap;
    //         invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->qM:Ljava/util/Map;
    //         invoke-interface {v2, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V
    //         if-eqz p1, :cond_0
    //         invoke-interface {v2, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V
    //         :cond_0
    //         const-string v0, "&tid"
    //         invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/CharSequence;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const-string v0, "Missing tracking id (%s) parameter."
    //         new-array v3, v1, [Ljava/lang/Object;
    //         const-string v4, "&tid"
    //         aput-object v4, v3, v5
    //         invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         :cond_1
    //         const-string v0, "&t"
    //         invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v3
    //         if-eqz v3, :cond_2
    //         const-string v0, "Missing hit type (%s) parameter."
    //         new-array v3, v1, [Ljava/lang/Object;
    //         const-string v4, "&t"
    //         aput-object v4, v3, v5
    //         invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         const-string v0, ""
    //         :cond_2
    //         iget-object v3, p0, Lcom/google/android/gms/analytics/Tracker;->Bs:Lcom/google/android/gms/analytics/Tracker$a;
    //         invoke-virtual {v3}, Lcom/google/android/gms/analytics/Tracker$a;->eV()Z
    //         move-result v3
    //         if-eqz v3, :cond_3
    //         const-string v3, "&sc"
    //         const-string v4, "start"
    //         invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_3
    //         invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
    //         move-result-object v3
    //         const-string v0, "screenview"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_4
    //         const-string v0, "pageview"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_4
    //         const-string v0, "appview"
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_4
    //         invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->qM:Ljava/util/Map;
    //         const-string v4, "&a"
    //         invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    //         move-result v0
    //         add-int/lit8 v0, v0, 0x1
    //         const v4, 0x7fffffff
    //         if-lt v0, v4, :cond_5
    //         move v0, v1
    //         :cond_5
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker;->qM:Ljava/util/Map;
    //         const-string v4, "&a"
    //         invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_6
    //         const-string v0, "transaction"
    //         invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_7
    //         const-string v0, "item"
    //         invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_7
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bn:Lcom/google/android/gms/analytics/ac;
    //         invoke-interface {v0}, Lcom/google/android/gms/analytics/ac;->eJ()Z
    //         move-result v0
    //         if-nez v0, :cond_7
    //         const-string v0, "Too many hits sent too quickly, rate limiting invoked."
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_7
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bm:Lcom/google/android/gms/analytics/TrackerHandler;
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/analytics/TrackerHandler;->u(Ljava/util/Map;)V
    //         goto :goto_0
    */

    public fun set(key: String, value: String) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "Key should be non-null"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/analytics/t$a;->zp:Lcom/google/android/gms/analytics/t$a;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->qM:Ljava/util/Map;
    //         invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    public fun setAnonymizeIp(anonymize: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         const-string v0, "&aip"
    //         invoke-static {p1}, Lcom/google/android/gms/analytics/aj;->C(Z)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setAppId(appId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&aid"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setAppInstallerId(appInstallerId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&aiid"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setAppName(appName: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&an"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setAppVersion(appVersion: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&av"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setClientId(clientId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&cid"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setEncoding(encoding: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&de"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setHostname(hostname: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&dh"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setLanguage(language: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&ul"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setLocation(location: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&dl"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setPage(page: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&dp"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setReferrer(referrer: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&dr"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setSampleRate(sampleRate: Double) { /* TODO(body): (D)V */ }
    /*
    //         .locals 3
    //         const-string v0, "&sf"
    //         invoke-static {p1, p2}, Ljava/lang/Double;->toHexString(D)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setScreenColors(screenColors: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&sd"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setScreenName(screenName: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&cd"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setScreenResolution(width: Int, height: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 3
    //         if-gez p1, :cond_0
    //         if-gez p2, :cond_0
    //         const-string v0, "Invalid width or height. The values should be non-negative."
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "&sr"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, "x"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun setSessionTimeout(sessionTimeout: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 5
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bs:Lcom/google/android/gms/analytics/Tracker$a;
    //         const-wide/16 v2, 0x3e8
    //         mul-long/2addr v2, p1
    //         invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/analytics/Tracker$a;->setSessionTimeout(J)V
    //         return-void
    */

    public fun setTitle(title: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&dt"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setUseSecure(useSecure: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         const-string v0, "useSecure"
    //         invoke-static {p1}, Lcom/google/android/gms/analytics/aj;->C(Z)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    public fun setViewportSize(viewportSize: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "&vp"
    //         invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    companion object {
    @JvmStatic fun b(p0: com.google.android.gms.analytics.Tracker): com.google.android.gms.analytics.Tracker.a { return TODO("body: (Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/Tracker$a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bs:Lcom/google/android/gms/analytics/Tracker$a;
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.analytics.Tracker): com.google.android.gms.analytics.ai { return TODO("body: (Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/ai;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker;->Bt:Lcom/google/android/gms/analytics/ai;
    //         return-object v0
    */

    }
}
