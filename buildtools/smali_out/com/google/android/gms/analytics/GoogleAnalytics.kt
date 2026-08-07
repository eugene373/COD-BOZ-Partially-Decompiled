package com.google.android.gms.analytics

// Auto-emitted from smali.
// 12 fields, 26 methods.

open class GoogleAnalytics: com.google.android.gms.analytics.TrackerHandler() {
    private var AA: java.util.Set
    private var AB: Boolean
    private var Aw: Boolean
    private var Ax: com.google.android.gms.analytics.ae
    private var Ay: Boolean
    private var Az: com.google.android.gms.analytics.Logger
    private var mContext: android.content.Context
    private var xL: String
    private var xM: String
    private var ye: com.google.android.gms.analytics.f

    protected constructor(context: android.content.Context)

    private constructor(context: android.content.Context, thread: com.google.android.gms.analytics.f, serviceManager: com.google.android.gms.analytics.ae)

    private fun a(p0: com.google.android.gms.analytics.Tracker): com.google.android.gms.analytics.Tracker { return TODO("body: (Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/Tracker;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->xL:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         const-string v0, "&an"
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->xL:Ljava/lang/String;
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->xM:Ljava/lang/String;
    //         if-eqz v0, :cond_1
    //         const-string v0, "&av"
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->xM:Ljava/lang/String;
    //         invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_1
    //         return-object p1
    */

    private fun ai(p0: String): Int { return TODO("body: (Ljava/lang/String;)I") }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "verbose"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const-string v1, "info"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :cond_1
    //         const-string v1, "warning"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         const/4 v0, 0x2
    //         goto :goto_0
    //         :cond_2
    //         const-string v1, "error"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         const/4 v0, 0x3
    //         goto :goto_0
    //         :cond_3
    //         const/4 v0, -0x1
    //         goto :goto_0
    */

    private fun eE() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         sget-boolean v0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Av:Z
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         const/16 v3, 0x81
    //         invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_1
    //         if-nez v0, :cond_2
    //         const-string v0, "Couldn\'t get ApplicationInfo to load gloabl config."
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "PackageManager doesn\'t know about package: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         move-object v0, v1
    //         goto :goto_1
    //         :cond_2
    //         iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    //         if-eqz v0, :cond_0
    //         const-string v1, "com.google.android.gms.analytics.globalConfigResource"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         new-instance v1, Lcom/google/android/gms/analytics/u;
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/analytics/u;-><init>(Landroid/content/Context;)V
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/analytics/u;->w(I)Lcom/google/android/gms/analytics/i;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/analytics/v;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->a(Lcom/google/android/gms/analytics/v;)V
    //         goto :goto_0
    */

    fun a(p0: com.google.android.gms.analytics.GoogleAnalytics.a) { /* TODO(body): (Lcom/google/android/gms/analytics/GoogleAnalytics$a;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->AA:Ljava/util/Set;
    //         invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;
    //         instance-of v0, v0, Landroid/app/Application;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;
    //         check-cast v0, Landroid/app/Application;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->enableAutoActivityReports(Landroid/app/Application;)V
    //         :cond_0
    //         return-void
    */

    fun a(p0: com.google.android.gms.analytics.v) { /* TODO(body): (Lcom/google/android/gms/analytics/v;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "Loading global config values."
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         invoke-virtual {p1}, Lcom/google/android/gms/analytics/v;->et()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/analytics/v;->eu()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->xL:Ljava/lang/String;
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "app name loaded: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->xL:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         :cond_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/analytics/v;->ev()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p1}, Lcom/google/android/gms/analytics/v;->ew()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->xM:Ljava/lang/String;
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "app version loaded: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->xM:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         :cond_1
    //         invoke-virtual {p1}, Lcom/google/android/gms/analytics/v;->ex()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/analytics/v;->ey()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->ai(Ljava/lang/String;)I
    //         move-result v0
    //         if-ltz v0, :cond_2
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "log level loaded: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getLogger()Lcom/google/android/gms/analytics/Logger;
    //         move-result-object v1
    //         invoke-interface {v1, v0}, Lcom/google/android/gms/analytics/Logger;->setLogLevel(I)V
    //         :cond_2
    //         invoke-virtual {p1}, Lcom/google/android/gms/analytics/v;->ez()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Ax:Lcom/google/android/gms/analytics/ae;
    //         invoke-virtual {p1}, Lcom/google/android/gms/analytics/v;->eA()I
    //         move-result v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/ae;->setLocalDispatchPeriod(I)V
    //         :cond_3
    //         invoke-virtual {p1}, Lcom/google/android/gms/analytics/v;->eB()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-virtual {p1}, Lcom/google/android/gms/analytics/v;->eC()Z
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->setDryRun(Z)V
    //         :cond_4
    //         return-void
    */

    fun b(p0: com.google.android.gms.analytics.GoogleAnalytics.a) { /* TODO(body): (Lcom/google/android/gms/analytics/GoogleAnalytics$a;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->AA:Ljava/util/Set;
    //         invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    //         return-void
    */

    public fun dispatchLocalHits() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Ax:Lcom/google/android/gms/analytics/ae;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ae;->dispatchLocalHits()V
    //         return-void
    */

    public fun enableAutoActivityReports(application: android.app.Application) { /* TODO(body): (Landroid/app/Application;)V */ }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0xe
    //         if-lt v0, v1, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->AB:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/analytics/GoogleAnalytics$b;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/GoogleAnalytics$b;-><init>(Lcom/google/android/gms/analytics/GoogleAnalytics;)V
    //         invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->AB:Z
    //         :cond_0
    //         return-void
    */

    fun g(p0: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->AA:Ljava/util/Set;
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/analytics/GoogleAnalytics$a;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/analytics/GoogleAnalytics$a;->i(Landroid/app/Activity;)V
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public fun getAppOptOut(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/analytics/t$a;->zW:Lcom/google/android/gms/analytics/t$a;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Ay:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         return v0
    */

    public fun getLogger(): com.google.android.gms.analytics.Logger { return TODO("body: ()Lcom/google/android/gms/analytics/Logger;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Az:Lcom/google/android/gms/analytics/Logger;
    //         return-object v0
    */

    fun h(p0: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->AA:Ljava/util/Set;
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/analytics/GoogleAnalytics$a;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/analytics/GoogleAnalytics$a;->j(Landroid/app/Activity;)V
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public fun isDryRunEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/analytics/t$a;->Ai:Lcom/google/android/gms/analytics/t$a;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V
    //         iget-boolean v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Aw:Z
    //         return v0
    */

    public fun newTracker(configResId: Int): com.google.android.gms.analytics.Tracker { return TODO("body: (I)Lcom/google/android/gms/analytics/Tracker;") }
    /*
    //         .locals 3
    //         monitor-enter p0
    //         :try_start_0
    //         invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/analytics/t$a;->zS:Lcom/google/android/gms/analytics/t$a;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V
    //         new-instance v1, Lcom/google/android/gms/analytics/Tracker;
    //         const/4 v0, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;
    //         invoke-direct {v1, v0, p0, v2}, Lcom/google/android/gms/analytics/Tracker;-><init>(Ljava/lang/String;Lcom/google/android/gms/analytics/TrackerHandler;Landroid/content/Context;)V
    //         if-lez p1, :cond_0
    //         new-instance v0, Lcom/google/android/gms/analytics/ah;
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;
    //         invoke-direct {v0, v2}, Lcom/google/android/gms/analytics/ah;-><init>(Landroid/content/Context;)V
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/ah;->w(I)Lcom/google/android/gms/analytics/i;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/analytics/ai;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/analytics/Tracker;->a(Lcom/google/android/gms/analytics/ai;)V
    //         :cond_0
    //         invoke-direct {p0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->a(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/Tracker;
    //         move-result-object v0
    //         monitor-exit p0
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun newTracker(trackingId: String): com.google.android.gms.analytics.Tracker { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/analytics/Tracker;") }
    /*
    //         .locals 2
    //         monitor-enter p0
    //         :try_start_0
    //         invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/analytics/t$a;->zS:Lcom/google/android/gms/analytics/t$a;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V
    //         new-instance v0, Lcom/google/android/gms/analytics/Tracker;
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->mContext:Landroid/content/Context;
    //         invoke-direct {v0, p1, p0, v1}, Lcom/google/android/gms/analytics/Tracker;-><init>(Ljava/lang/String;Lcom/google/android/gms/analytics/TrackerHandler;Landroid/content/Context;)V
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->a(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/Tracker;
    //         move-result-object v0
    //         monitor-exit p0
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun reportActivityStart(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->AB:Z
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->g(Landroid/app/Activity;)V
    //         :cond_0
    //         return-void
    */

    public fun reportActivityStop(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->AB:Z
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->h(Landroid/app/Activity;)V
    //         :cond_0
    //         return-void
    */

    public fun setAppOptOut(optOut: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/analytics/t$a;->zV:Lcom/google/android/gms/analytics/t$a;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V
    //         invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Ay:Ljava/lang/Boolean;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Ay:Ljava/lang/Boolean;
    //         invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->ye:Lcom/google/android/gms/analytics/f;
    //         invoke-interface {v0}, Lcom/google/android/gms/analytics/f;->dH()V
    //         :cond_0
    //         return-void
    */

    public fun setDryRun(dryRun: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/analytics/t$a;->Ah:Lcom/google/android/gms/analytics/t$a;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V
    //         iput-boolean p1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Aw:Z
    //         return-void
    */

    public fun setLocalDispatchPeriod(dispatchPeriodInSeconds: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Ax:Lcom/google/android/gms/analytics/ae;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/ae;->setLocalDispatchPeriod(I)V
    //         return-void
    */

    public fun setLogger(logger: com.google.android.gms.analytics.Logger) { /* TODO(body): (Lcom/google/android/gms/analytics/Logger;)V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/analytics/t$a;->Aj:Lcom/google/android/gms/analytics/t$a;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/t;->a(Lcom/google/android/gms/analytics/t$a;)V
    //         iput-object p1, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->Az:Lcom/google/android/gms/analytics/Logger;
    //         return-void
    */

    fun u(p0: java.util.Map) { /* TODO(body): (Ljava/util/Map;)V */ }
    /*
    //         .locals 2
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
    //         monitor-enter p0
    //         if-nez p1, :cond_0
    //         :try_start_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "hit cannot be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit p0
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         const-string v0, "&ul"
    //         invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
    //         move-result-object v1
    //         invoke-static {v1}, Lcom/google/android/gms/analytics/aj;->a(Ljava/util/Locale;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {p1, v0, v1}, Lcom/google/android/gms/analytics/aj;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "&sr"
    //         invoke-static {}, Lcom/google/android/gms/analytics/ad;->eQ()Lcom/google/android/gms/analytics/ad;
    //         move-result-object v1
    //         invoke-static {p1, v0, v1}, Lcom/google/android/gms/analytics/aj;->a(Ljava/util/Map;Ljava/lang/String;Lcom/google/android/gms/analytics/l;)V
    //         const-string v0, "&_u"
    //         invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/google/android/gms/analytics/t;->er()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-static {}, Lcom/google/android/gms/analytics/t;->ep()Lcom/google/android/gms/analytics/t;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/t;->eq()Ljava/lang/String;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/GoogleAnalytics;->ye:Lcom/google/android/gms/analytics/f;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/analytics/f;->u(Ljava/util/Map;)V
    //         monitor-exit p0
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-void
    */

    companion object {
    private var AC: com.google.android.gms.analytics.GoogleAnalytics
    private var Av: Boolean

    @JvmStatic fun eD(): com.google.android.gms.analytics.GoogleAnalytics { return TODO("body: ()Lcom/google/android/gms/analytics/GoogleAnalytics;") }
    /*
    //         .locals 2
    //         const-class v1, Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/analytics/GoogleAnalytics;->AC:Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public @JvmStatic fun getInstance(context: android.content.Context): com.google.android.gms.analytics.GoogleAnalytics { return TODO("body: (Landroid/content/Context;)Lcom/google/android/gms/analytics/GoogleAnalytics;") }
    /*
    //         .locals 2
    //         const-class v1, Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/analytics/GoogleAnalytics;->AC:Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/GoogleAnalytics;-><init>(Landroid/content/Context;)V
    //         sput-object v0, Lcom/google/android/gms/analytics/GoogleAnalytics;->AC:Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         :cond_0
    //         sget-object v0, Lcom/google/android/gms/analytics/GoogleAnalytics;->AC:Lcom/google/android/gms/analytics/GoogleAnalytics;
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    }
}
