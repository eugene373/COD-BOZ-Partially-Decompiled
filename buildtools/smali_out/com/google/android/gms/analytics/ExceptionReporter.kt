package com.google.android.gms.analytics

// Auto-emitted from smali.
// 4 fields, 5 methods.

open class ExceptionReporter: java.lang.Thread.UncaughtExceptionHandler {
    private val mContext: android.content.Context
    private val xX: java.lang.Thread.UncaughtExceptionHandler
    private val xY: com.google.android.gms.analytics.Tracker
    private var xZ: com.google.android.gms.analytics.ExceptionParser

    public constructor(tracker: com.google.android.gms.analytics.Tracker, originalHandler: java.lang.Thread.UncaughtExceptionHandler, context: android.content.Context)

    fun dY(): java.lang.Thread.UncaughtExceptionHandler { return TODO("body: ()Ljava/lang/Thread$UncaughtExceptionHandler;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ExceptionReporter;->xX:Ljava/lang/Thread$UncaughtExceptionHandler;
    //         return-object v0
    */

    public fun getExceptionParser(): com.google.android.gms.analytics.ExceptionParser { return TODO("body: ()Lcom/google/android/gms/analytics/ExceptionParser;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ExceptionReporter;->xZ:Lcom/google/android/gms/analytics/ExceptionParser;
    //         return-object v0
    */

    public fun setExceptionParser(exceptionParser: com.google.android.gms.analytics.ExceptionParser) { /* TODO(body): (Lcom/google/android/gms/analytics/ExceptionParser;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/analytics/ExceptionReporter;->xZ:Lcom/google/android/gms/analytics/ExceptionParser;
    //         return-void
    */

    public fun uncaughtException(t: Thread, e: Throwable) { /* TODO(body): (Ljava/lang/Thread;Ljava/lang/Throwable;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "UncaughtException"
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/ExceptionReporter;->xZ:Lcom/google/android/gms/analytics/ExceptionParser;
    //         if-eqz v1, :cond_0
    //         if-eqz p1, :cond_2
    //         invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/ExceptionReporter;->xZ:Lcom/google/android/gms/analytics/ExceptionParser;
    //         invoke-interface {v1, v0, p2}, Lcom/google/android/gms/analytics/ExceptionParser;->getDescription(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Tracking Exception: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/ExceptionReporter;->xY:Lcom/google/android/gms/analytics/Tracker;
    //         new-instance v2, Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;
    //         invoke-direct {v2}, Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;-><init>()V
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;->setDescription(Ljava/lang/String;)Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;
    //         move-result-object v0
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;->setFatal(Z)Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/HitBuilders$ExceptionBuilder;->build()Ljava/util/Map;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ExceptionReporter;->mContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->dispatchLocalHits()V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ExceptionReporter;->xX:Ljava/lang/Thread$UncaughtExceptionHandler;
    //         if-eqz v0, :cond_1
    //         const-string v0, "Passing exception to original handler."
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/ExceptionReporter;->xX:Ljava/lang/Thread$UncaughtExceptionHandler;
    //         invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    //         :cond_1
    //         return-void
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
