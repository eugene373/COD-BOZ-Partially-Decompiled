package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class g_a_a: android.content.ServiceConnection {
    val Mc: com.google.android.gms.common.internal.g.a

    public constructor(p0: com.google.android.gms.common.internal.g.a)

    public fun onServiceConnected(component: android.content.ComponentName, binder: android.os.IBinder) { /* TODO(body): (Landroid/content/ComponentName;Landroid/os/IBinder;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a$a;->Mc:Lcom/google/android/gms/common/internal/g$a;
    //         iget-object v0, v0, Lcom/google/android/gms/common/internal/g$a;->Mb:Lcom/google/android/gms/common/internal/g;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/g;->a(Lcom/google/android/gms/common/internal/g;)Ljava/util/HashMap;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a$a;->Mc:Lcom/google/android/gms/common/internal/g$a;
    //         invoke-static {v0, p2}, Lcom/google/android/gms/common/internal/g$a;->a(Lcom/google/android/gms/common/internal/g$a;Landroid/os/IBinder;)Landroid/os/IBinder;
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a$a;->Mc:Lcom/google/android/gms/common/internal/g$a;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/common/internal/g$a;->a(Lcom/google/android/gms/common/internal/g$a;Landroid/content/ComponentName;)Landroid/content/ComponentName;
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a$a;->Mc:Lcom/google/android/gms/common/internal/g$a;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/g$a;->a(Lcom/google/android/gms/common/internal/g$a;)Ljava/util/HashSet;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/internal/e$f;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/common/internal/e$f;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a$a;->Mc:Lcom/google/android/gms/common/internal/g$a;
    //         const/4 v2, 0x1
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/g$a;->a(Lcom/google/android/gms/common/internal/g$a;I)I
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-void
    */

    public fun onServiceDisconnected(component: android.content.ComponentName) { /* TODO(body): (Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a$a;->Mc:Lcom/google/android/gms/common/internal/g$a;
    //         iget-object v0, v0, Lcom/google/android/gms/common/internal/g$a;->Mb:Lcom/google/android/gms/common/internal/g;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/g;->a(Lcom/google/android/gms/common/internal/g;)Ljava/util/HashMap;
    //         move-result-object v1
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a$a;->Mc:Lcom/google/android/gms/common/internal/g$a;
    //         const/4 v2, 0x0
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/g$a;->a(Lcom/google/android/gms/common/internal/g$a;Landroid/os/IBinder;)Landroid/os/IBinder;
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a$a;->Mc:Lcom/google/android/gms/common/internal/g$a;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/common/internal/g$a;->a(Lcom/google/android/gms/common/internal/g$a;Landroid/content/ComponentName;)Landroid/content/ComponentName;
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a$a;->Mc:Lcom/google/android/gms/common/internal/g$a;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/g$a;->a(Lcom/google/android/gms/common/internal/g$a;)Ljava/util/HashSet;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/internal/e$f;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/e$f;->onServiceDisconnected(Landroid/content/ComponentName;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g$a$a;->Mc:Lcom/google/android/gms/common/internal/g$a;
    //         const/4 v2, 0x2
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/g$a;->a(Lcom/google/android/gms/common/internal/g$a;I)I
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-void
    */

}
