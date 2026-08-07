package com.google.android.gms.analytics

// Auto-emitted from smali.
// 1 fields, 3 methods.

class c_a: android.content.ServiceConnection {
    val xK: com.google.android.gms.analytics.c

    constructor(p0: com.google.android.gms.analytics.c)

    public fun onServiceConnected(component: android.content.ComponentName, binder: android.os.IBinder) { /* TODO(body): (Landroid/content/ComponentName;Landroid/os/IBinder;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "service connected, binder: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         :try_start_0
    //         invoke-interface {p2}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "com.google.android.gms.analytics.internal.IAnalyticsService"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "bound to service"
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/c$a;->xK:Lcom/google/android/gms/analytics/c;
    //         invoke-static {p2}, Lcom/google/android/gms/internal/hc$a;->E(Landroid/os/IBinder;)Lcom/google/android/gms/internal/hc;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/analytics/c;->a(Lcom/google/android/gms/analytics/c;Lcom/google/android/gms/internal/hc;)Lcom/google/android/gms/internal/hc;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/c$a;->xK:Lcom/google/android/gms/analytics/c;
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/c;->a(Lcom/google/android/gms/analytics/c;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         :cond_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/c$a;->xK:Lcom/google/android/gms/analytics/c;
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/c;->b(Lcom/google/android/gms/analytics/c;)Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         :try_end_1
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    //         :goto_1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/c$a;->xK:Lcom/google/android/gms/analytics/c;
    //         invoke-static {v0, v2}, Lcom/google/android/gms/analytics/c;->a(Lcom/google/android/gms/analytics/c;Landroid/content/ServiceConnection;)Landroid/content/ServiceConnection;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/c$a;->xK:Lcom/google/android/gms/analytics/c;
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/c;->c(Lcom/google/android/gms/analytics/c;)Lcom/google/android/gms/analytics/c$c;
    //         move-result-object v0
    //         const/4 v1, 0x2
    //         invoke-interface {v0, v1, v2}, Lcom/google/android/gms/analytics/c$c;->a(ILandroid/content/Intent;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         goto :goto_1
    */

    public fun onServiceDisconnected(component: android.content.ComponentName) { /* TODO(body): (Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "service disconnected: "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/c$a;->xK:Lcom/google/android/gms/analytics/c;
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Lcom/google/android/gms/analytics/c;->a(Lcom/google/android/gms/analytics/c;Landroid/content/ServiceConnection;)Landroid/content/ServiceConnection;
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/c$a;->xK:Lcom/google/android/gms/analytics/c;
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/c;->d(Lcom/google/android/gms/analytics/c;)Lcom/google/android/gms/analytics/c$b;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/google/android/gms/analytics/c$b;->onDisconnected()V
    //         return-void
    */

}
