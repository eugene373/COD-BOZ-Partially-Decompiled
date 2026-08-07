package com.google.android.gms.internal

// Auto-emitted from smali.
// 21 fields, 33 methods.

class af: android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener {
    private var mA: java.lang.ref.WeakReference
    private val mB: java.lang.ref.WeakReference
    private val mC: com.google.android.gms.internal.ad
    private val mD: android.content.Context
    private val mE: com.google.android.gms.internal.ah
    private var mF: Boolean
    private val mG: android.view.WindowManager
    private val mH: android.os.PowerManager
    private val mI: android.app.KeyguardManager
    private var mJ: com.google.android.gms.internal.ag
    private var mL: Boolean
    private val mM: java.util.concurrent.BlockingQueue
    private var mN: Long
    private var mO: Boolean
    private var mP: Boolean
    private var mQ: android.content.BroadcastReceiver
    private val mR: java.util.HashSet
    private var mn: Boolean
    private val mw: Object
    private val mz: java.lang.ref.WeakReference

    public constructor(p0: android.content.Context, p1: com.google.android.gms.internal.ay, p2: com.google.android.gms.internal.fz, p3: android.view.View, p4: com.google.android.gms.internal.gt)

    public constructor(p0: com.google.android.gms.internal.ay, p1: com.google.android.gms.internal.fz, p2: com.google.android.gms.internal.gt, p3: android.view.View, p4: com.google.android.gms.internal.ah)

    protected fun a(p0: Int, p1: android.util.DisplayMetrics): Int { return TODO("body: (ILandroid/util/DisplayMetrics;)I") }
    /*
    //         .locals 2
    //         iget v0, p2, Landroid/util/DisplayMetrics;->density:F
    //         int-to-float v1, p1
    //         div-float v0, v1, v0
    //         float-to-int v0, v0
    //         return v0
    */

    protected fun a(p0: android.view.View, p1: java.util.Map) { /* TODO(body): (Landroid/view/View;Ljava/util/Map;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/view/View;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/af;->e(Z)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.ac) { /* TODO(body): (Lcom/google/android/gms/internal/ac;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mR:Ljava/util/HashSet;
    //         invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.ag) { /* TODO(body): (Lcom/google/android/gms/internal/ag;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/af;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/af;->mJ:Lcom/google/android/gms/internal/ag;
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    protected fun a(p0: com.google.android.gms.internal.ah) { /* TODO(body): (Lcom/google/android/gms/internal/ah;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "https://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.html"
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ah;->f(Ljava/lang/String;)V
    //         return-void
    */

    protected fun a(p0: org.json.JSONObject) { /* TODO(body): (Lorg/json/JSONObject;)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         new-instance v0, Lorg/json/JSONArray;
    //         invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V
    //         new-instance v1, Lorg/json/JSONObject;
    //         invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    //         invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         const-string v2, "units"
    //         invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mE:Lcom/google/android/gms/internal/ah;
    //         const-string v2, "AFMA_updateActiveView"
    //         invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ah;->a(Ljava/lang/String;Lorg/json/JSONObject;)V
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Skipping active view message."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    */

    protected fun a(p0: java.util.Map): Boolean { return TODO("body: (Ljava/util/Map;)Z") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ">;)Z"
    //             }
    //         .end annotation
    //         const/4 v1, 0x0
    //         if-nez p1, :cond_0
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const-string v0, "hashCode"
    //         invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/af;->mC:Lcom/google/android/gms/internal/ad;
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/ad;->aC()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_1
    //         move v0, v1
    //         goto :goto_1
    */

    protected fun aD() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/af;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mQ:Landroid/content/BroadcastReceiver;
    //         if-eqz v0, :cond_0
    //         monitor-exit v1
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Landroid/content/IntentFilter;
    //         invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V
    //         const-string v2, "android.intent.action.SCREEN_ON"
    //         invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         const-string v2, "android.intent.action.SCREEN_OFF"
    //         invoke-virtual {v0, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         new-instance v2, Lcom/google/android/gms/internal/af$4;
    //         invoke-direct {v2, p0}, Lcom/google/android/gms/internal/af$4;-><init>(Lcom/google/android/gms/internal/af;)V
    //         iput-object v2, p0, Lcom/google/android/gms/internal/af;->mQ:Landroid/content/BroadcastReceiver;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/af;->mD:Landroid/content/Context;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/af;->mQ:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v2, v3, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    protected fun aE() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/af;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mQ:Landroid/content/BroadcastReceiver;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mD:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/af;->mQ:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/af;->mQ:Landroid/content/BroadcastReceiver;
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

    public fun aF() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/af;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/af;->mO:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/af;->mP:Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :try_start_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/af;->aL()Lorg/json/JSONObject;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/af;->a(Lorg/json/JSONObject;)V
    //         :try_end_1
    //         .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :goto_0
    //         :try_start_2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Untracking ad unit: "
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/af;->mC:Lcom/google/android/gms/internal/ad;
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/ad;->aC()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         :cond_0
    //         monitor-exit v1
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v2, "JSON Failure while processing active view data."
    //         invoke-static {v2, v0}, Lcom/google/android/gms/internal/gs;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v0
    */

    protected fun aG() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mJ:Lcom/google/android/gms/internal/ag;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mJ:Lcom/google/android/gms/internal/ag;
    //         invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ag;->a(Lcom/google/android/gms/internal/af;)V
    //         :cond_0
    //         return-void
    */

    public fun aH(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/af;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/af;->mO:Z
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    protected fun aI() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mB:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/af;->mA:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Landroid/view/ViewTreeObserver;
    //         invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v0
    //         if-eq v0, v1, :cond_0
    //         new-instance v1, Ljava/lang/ref/WeakReference;
    //         invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
    //         iput-object v1, p0, Lcom/google/android/gms/internal/af;->mA:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V
    //         invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    //         goto :goto_0
    */

    protected fun aJ() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mA:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/ViewTreeObserver;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z
    //         move-result v1
    //         if-nez v1, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V
    //         invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    //         goto :goto_0
    */

    protected fun aK(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         const-string v1, "afmaVersion"
    //         iget-object v2, p0, Lcom/google/android/gms/internal/af;->mC:Lcom/google/android/gms/internal/ad;
    //         invoke-virtual {v2}, Lcom/google/android/gms/internal/ad;->aA()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         const-string v2, "activeViewJSON"
    //         iget-object v3, p0, Lcom/google/android/gms/internal/af;->mC:Lcom/google/android/gms/internal/ad;
    //         invoke-virtual {v3}, Lcom/google/android/gms/internal/ad;->aB()Lorg/json/JSONObject;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         const-string v2, "timestamp"
    //         sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-static {}, Ljava/lang/System;->nanoTime()J
    //         move-result-wide v4
    //         invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v4
    //         invoke-virtual {v1, v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         move-result-object v1
    //         const-string v2, "adFormat"
    //         iget-object v3, p0, Lcom/google/android/gms/internal/af;->mC:Lcom/google/android/gms/internal/ad;
    //         invoke-virtual {v3}, Lcom/google/android/gms/internal/ad;->az()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         const-string v2, "hashCode"
    //         iget-object v3, p0, Lcom/google/android/gms/internal/af;->mC:Lcom/google/android/gms/internal/ad;
    //         invoke-virtual {v3}, Lcom/google/android/gms/internal/ad;->aC()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         return-object v0
    */

    protected fun aL(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/af;->aK()Lorg/json/JSONObject;
    //         move-result-object v0
    //         const-string v1, "doneReasonCode"
    //         const-string v2, "u"
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         return-object v0
    */

    protected fun b(p0: com.google.android.gms.internal.ah) { /* TODO(body): (Lcom/google/android/gms/internal/ah;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "/updateActiveView"
    //         new-instance v1, Lcom/google/android/gms/internal/af$5;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/af$5;-><init>(Lcom/google/android/gms/internal/af;)V
    //         invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ah;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         const-string v0, "/untrackActiveViewUnit"
    //         new-instance v1, Lcom/google/android/gms/internal/af$6;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/af$6;-><init>(Lcom/google/android/gms/internal/af;)V
    //         invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ah;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         const-string v0, "/visibilityChanged"
    //         new-instance v1, Lcom/google/android/gms/internal/af$7;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/internal/af$7;-><init>(Lcom/google/android/gms/internal/af;)V
    //         invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ah;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         const-string v0, "/viewabilityChanged"
    //         sget-object v1, Lcom/google/android/gms/internal/bx;->pA:Lcom/google/android/gms/internal/by;
    //         invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ah;->a(Ljava/lang/String;Lcom/google/android/gms/internal/by;)V
    //         return-void
    */

    protected fun d(p0: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         iget-object v1, p0, Lcom/google/android/gms/internal/af;->mM:Ljava/util/concurrent/BlockingQueue;
    //         invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->drainTo(Ljava/util/Collection;)I
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/Runnable;
    //         invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    protected fun d(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mR:Ljava/util/HashSet;
    //         invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ac;
    //         invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/ac;->a(Lcom/google/android/gms/internal/af;Z)V
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    protected fun destroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/af;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/af;->aJ()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/af;->aE()V
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/af;->mO:Z
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mE:Lcom/google/android/gms/internal/ah;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ah;->destroy()V
    //         :try_end_1
    //         .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         :goto_0
    //         :try_start_2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/af;->aG()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_2
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         throw v0
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    protected fun e(p0: android.view.View): org.json.JSONObject { return TODO("body: (Landroid/view/View;)Lorg/json/JSONObject;") }
    /*
    //         .locals 12
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const/4 v1, 0x2
    //         new-array v0, v1, [I
    //         new-array v1, v1, [I
    //         invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V
    //         invoke-virtual {p1, v1}, Landroid/view/View;->getLocationInWindow([I)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/af;->aK()Lorg/json/JSONObject;
    //         move-result-object v1
    //         invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
    //         move-result-object v2
    //         new-instance v3, Landroid/graphics/Rect;
    //         invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V
    //         const/4 v4, 0x0
    //         aget v4, v0, v4
    //         iput v4, v3, Landroid/graphics/Rect;->left:I
    //         const/4 v4, 0x1
    //         aget v0, v0, v4
    //         iput v0, v3, Landroid/graphics/Rect;->top:I
    //         iget v0, v3, Landroid/graphics/Rect;->left:I
    //         invoke-virtual {p1}, Landroid/view/View;->getWidth()I
    //         move-result v4
    //         add-int/2addr v0, v4
    //         iput v0, v3, Landroid/graphics/Rect;->right:I
    //         iget v0, v3, Landroid/graphics/Rect;->top:I
    //         invoke-virtual {p1}, Landroid/view/View;->getHeight()I
    //         move-result v4
    //         add-int/2addr v0, v4
    //         iput v0, v3, Landroid/graphics/Rect;->bottom:I
    //         new-instance v0, Landroid/graphics/Rect;
    //         invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
    //         iget-object v4, p0, Lcom/google/android/gms/internal/af;->mG:Landroid/view/WindowManager;
    //         invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
    //         move-result-object v4
    //         invoke-virtual {v4}, Landroid/view/Display;->getWidth()I
    //         move-result v4
    //         iput v4, v0, Landroid/graphics/Rect;->right:I
    //         iget-object v4, p0, Lcom/google/android/gms/internal/af;->mG:Landroid/view/WindowManager;
    //         invoke-interface {v4}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
    //         move-result-object v4
    //         invoke-virtual {v4}, Landroid/view/Display;->getHeight()I
    //         move-result v4
    //         iput v4, v0, Landroid/graphics/Rect;->bottom:I
    //         new-instance v4, Landroid/graphics/Rect;
    //         invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V
    //         const/4 v5, 0x0
    //         invoke-virtual {p1, v4, v5}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z
    //         move-result v5
    //         new-instance v6, Landroid/graphics/Rect;
    //         invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V
    //         invoke-virtual {p1, v6}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z
    //         move-result v7
    //         const-string v8, "viewBox"
    //         new-instance v9, Lorg/json/JSONObject;
    //         invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V
    //         const-string v10, "top"
    //         iget v11, v0, Landroid/graphics/Rect;->top:I
    //         invoke-virtual {p0, v11, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v11
    //         invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v9
    //         const-string v10, "bottom"
    //         iget v11, v0, Landroid/graphics/Rect;->bottom:I
    //         invoke-virtual {p0, v11, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v11
    //         invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v9
    //         const-string v10, "left"
    //         iget v11, v0, Landroid/graphics/Rect;->left:I
    //         invoke-virtual {p0, v11, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v11
    //         invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v9
    //         const-string v10, "right"
    //         iget v0, v0, Landroid/graphics/Rect;->right:I
    //         invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v0
    //         invoke-virtual {v9, v10, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v0
    //         invoke-virtual {v1, v8, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         move-result-object v0
    //         const-string v8, "adBox"
    //         new-instance v9, Lorg/json/JSONObject;
    //         invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V
    //         const-string v10, "top"
    //         iget v11, v3, Landroid/graphics/Rect;->top:I
    //         invoke-virtual {p0, v11, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v11
    //         invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v9
    //         const-string v10, "bottom"
    //         iget v11, v3, Landroid/graphics/Rect;->bottom:I
    //         invoke-virtual {p0, v11, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v11
    //         invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v9
    //         const-string v10, "left"
    //         iget v11, v3, Landroid/graphics/Rect;->left:I
    //         invoke-virtual {p0, v11, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v11
    //         invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v9
    //         const-string v10, "right"
    //         iget v3, v3, Landroid/graphics/Rect;->right:I
    //         invoke-virtual {p0, v3, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v3
    //         invoke-virtual {v9, v10, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v3
    //         invoke-virtual {v0, v8, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         move-result-object v0
    //         const-string v3, "globalVisibleBox"
    //         new-instance v8, Lorg/json/JSONObject;
    //         invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V
    //         const-string v9, "top"
    //         iget v10, v4, Landroid/graphics/Rect;->top:I
    //         invoke-virtual {p0, v10, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v10
    //         invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v8
    //         const-string v9, "bottom"
    //         iget v10, v4, Landroid/graphics/Rect;->bottom:I
    //         invoke-virtual {p0, v10, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v10
    //         invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v8
    //         const-string v9, "left"
    //         iget v10, v4, Landroid/graphics/Rect;->left:I
    //         invoke-virtual {p0, v10, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v10
    //         invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v8
    //         const-string v9, "right"
    //         iget v4, v4, Landroid/graphics/Rect;->right:I
    //         invoke-virtual {p0, v4, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v4
    //         invoke-virtual {v8, v9, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v4
    //         invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         move-result-object v0
    //         const-string v3, "globalVisibleBoxVisible"
    //         invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         move-result-object v0
    //         const-string v3, "localVisibleBox"
    //         new-instance v4, Lorg/json/JSONObject;
    //         invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V
    //         const-string v5, "top"
    //         iget v8, v6, Landroid/graphics/Rect;->top:I
    //         invoke-virtual {p0, v8, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v8
    //         invoke-virtual {v4, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v4
    //         const-string v5, "bottom"
    //         iget v8, v6, Landroid/graphics/Rect;->bottom:I
    //         invoke-virtual {p0, v8, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v8
    //         invoke-virtual {v4, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v4
    //         const-string v5, "left"
    //         iget v8, v6, Landroid/graphics/Rect;->left:I
    //         invoke-virtual {p0, v8, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v8
    //         invoke-virtual {v4, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v4
    //         const-string v5, "right"
    //         iget v6, v6, Landroid/graphics/Rect;->right:I
    //         invoke-virtual {p0, v6, v2}, Lcom/google/android/gms/internal/af;->a(ILandroid/util/DisplayMetrics;)I
    //         move-result v6
    //         invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         move-result-object v4
    //         invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         move-result-object v0
    //         const-string v3, "localVisibleBoxVisible"
    //         invoke-virtual {v0, v3, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         move-result-object v0
    //         const-string v3, "screenDensity"
    //         iget v2, v2, Landroid/util/DisplayMetrics;->density:F
    //         float-to-double v4, v2
    //         invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    //         move-result-object v0
    //         const-string v2, "isVisible"
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/af;->f(Landroid/view/View;)Z
    //         move-result v3
    //         invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         move-result-object v0
    //         const-string v2, "isStopped"
    //         iget-boolean v3, p0, Lcom/google/android/gms/internal/af;->mL:Z
    //         invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         move-result-object v0
    //         const-string v2, "isPaused"
    //         iget-boolean v3, p0, Lcom/google/android/gms/internal/af;->mn:Z
    //         invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         return-object v1
    */

    protected fun e(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 8
    //         iget-object v2, p0, Lcom/google/android/gms/internal/af;->mw:Ljava/lang/Object;
    //         monitor-enter v2
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/af;->mF:Z
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/af;->mO:Z
    //         if-nez v0, :cond_1
    //         :cond_0
    //         monitor-exit v2
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-static {}, Ljava/lang/System;->nanoTime()J
    //         move-result-wide v0
    //         if-eqz p1, :cond_2
    //         iget-wide v4, p0, Lcom/google/android/gms/internal/af;->mN:J
    //         sget-wide v6, Lcom/google/android/gms/internal/af;->mK:J
    //         add-long/2addr v4, v6
    //         cmp-long v3, v4, v0
    //         if-lez v3, :cond_2
    //         monitor-exit v2
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_2
    //         :try_start_1
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/af;->mN:J
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mz:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/fz;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/af;->mB:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Landroid/view/View;
    //         if-eqz v1, :cond_3
    //         if-nez v0, :cond_4
    //         :cond_3
    //         const/4 v0, 0x1
    //         :goto_1
    //         if-eqz v0, :cond_5
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/af;->aF()V
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :cond_4
    //         const/4 v0, 0x0
    //         goto :goto_1
    //         :cond_5
    //         :try_start_2
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/af;->e(Landroid/view/View;)Lorg/json/JSONObject;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/af;->a(Lorg/json/JSONObject;)V
    //         :try_end_2
    //         .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_0
    //         :goto_2
    //         :try_start_3
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/af;->aI()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/af;->aG()V
    //         monitor-exit v2
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "Active view update failed."
    //         invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         :try_end_3
    //         .catchall {:try_start_3 .. :try_end_3} :catchall_0
    //         goto :goto_2
    */

    protected fun f(p0: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p1}, Landroid/view/View;->isShown()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mH:Landroid/os/PowerManager;
    //         invoke-virtual {v0}, Landroid/os/PowerManager;->isScreenOn()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mI:Landroid/app/KeyguardManager;
    //         invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun onGlobalLayout() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/af;->e(Z)V
    //         return-void
    */

    public fun onScrollChanged() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/af;->e(Z)V
    //         return-void
    */

    public fun pause() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/af;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         const/4 v0, 0x1
    //         :try_start_0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/af;->mn:Z
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/af;->e(Z)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mE:Lcom/google/android/gms/internal/ah;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ah;->pause()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun resume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/af;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mE:Lcom/google/android/gms/internal/ah;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ah;->resume()V
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/af;->mn:Z
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/af;->e(Z)V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun stop() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/af;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         const/4 v0, 0x1
    //         :try_start_0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/af;->mL:Z
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/af;->e(Z)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mE:Lcom/google/android/gms/internal/ah;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ah;->pause()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    companion object {
    private val mK: Long = 0L

    @JvmStatic fun b(p0: com.google.android.gms.internal.af): com.google.android.gms.internal.ad { return TODO("body: (Lcom/google/android/gms/internal/af;)Lcom/google/android/gms/internal/ad;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/af;->mC:Lcom/google/android/gms/internal/ad;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.internal.af, p1: Boolean): Boolean { return TODO("body: (Lcom/google/android/gms/internal/af;Z)Z") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/af;->mF:Z
    //         return p1
    */

    }
}
