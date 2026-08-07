package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 11 methods.

open class am: android.app.Application.ActivityLifecycleCallbacks {
    private var mContext: android.content.Context
    private val mw: Object
    private var nr: android.app.Activity

    public constructor(p0: android.app.Application, p1: android.app.Activity)

    private fun setActivity(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/am;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v2, "com.google.android.gms.ads"
    //         invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/am;->nr:Landroid/app/Activity;
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

    public fun getActivity(): android.app.Activity { return TODO("body: ()Landroid/app/Activity;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/am;->nr:Landroid/app/Activity;
    //         return-object v0
    */

    public fun getContext(): android.content.Context { return TODO("body: ()Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/am;->mContext:Landroid/content/Context;
    //         return-object v0
    */

    public fun onActivityCreated(activity: android.app.Activity, savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onActivityDestroyed(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/am;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/am;->nr:Landroid/app/Activity;
    //         if-nez v0, :cond_0
    //         monitor-exit v1
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/am;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/am;->nr:Landroid/app/Activity;
    //         :cond_1
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun onActivityPaused(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/am;->setActivity(Landroid/app/Activity;)V
    //         return-void
    */

    public fun onActivityResumed(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/am;->setActivity(Landroid/app/Activity;)V
    //         return-void
    */

    public fun onActivitySaveInstanceState(activity: android.app.Activity, savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onActivityStarted(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/am;->setActivity(Landroid/app/Activity;)V
    //         return-void
    */

    public fun onActivityStopped(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
