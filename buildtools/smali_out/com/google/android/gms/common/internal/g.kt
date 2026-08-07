package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 5 fields, 7 methods.

class g: android.os.Handler.Callback {
    private val LU: java.util.HashMap
    private val mD: android.content.Context
    private val mHandler: android.os.Handler

    private constructor(p0: android.content.Context)

    public fun a(p0: String, p1: com.google.android.gms.common.internal.e.f): Boolean { return TODO("body: (Ljava/lang/String;Lcom/google/android/gms/common/internal/e$f;)Z") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/common/internal/e",
    //                 "<*>.f;)Z"
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/g;->LU:Ljava/util/HashMap;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g;->LU:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/internal/g$a;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/internal/g$a;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/common/internal/g$a;-><init>(Lcom/google/android/gms/common/internal/g;Ljava/lang/String;)V
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/internal/g$a;->a(Lcom/google/android/gms/common/internal/e$f;)V
    //         new-instance v2, Landroid/content/Intent;
    //         invoke-direct {v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v3, "com.google.android.gms"
    //         invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/common/internal/g;->mD:Landroid/content/Context;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/g$a;->gW()Lcom/google/android/gms/common/internal/g$a$a;
    //         move-result-object v4
    //         const/16 v5, 0x81
    //         invoke-virtual {v3, v2, v4, v5}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/common/internal/g$a;->J(Z)V
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/g;->LU:Ljava/util/HashMap;
    //         invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :goto_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/g$a;->isBound()Z
    //         move-result v0
    //         monitor-exit v1
    //         return v0
    //         :cond_0
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/g;->mHandler:Landroid/os/Handler;
    //         const/4 v3, 0x0
    //         invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/internal/g$a;->c(Lcom/google/android/gms/common/internal/e$f;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction="
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_1
    //         :try_start_1
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/internal/g$a;->a(Lcom/google/android/gms/common/internal/e$f;)V
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/g$a;->getState()I
    //         move-result v2
    //         packed-switch v2, :pswitch_data_0
    //         goto :goto_0
    //         :pswitch_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/g$a;->getComponentName()Landroid/content/ComponentName;
    //         move-result-object v2
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/g$a;->getBinder()Landroid/os/IBinder;
    //         move-result-object v3
    //         invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/common/internal/e$f;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    //         goto :goto_0
    //         :pswitch_1
    //         new-instance v2, Landroid/content/Intent;
    //         invoke-direct {v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         const-string v3, "com.google.android.gms"
    //         invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/common/internal/g;->mD:Landroid/content/Context;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/g$a;->gW()Lcom/google/android/gms/common/internal/g$a$a;
    //         move-result-object v4
    //         const/16 v5, 0x81
    //         invoke-virtual {v3, v2, v4, v5}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //         move-result v2
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/common/internal/g$a;->J(Z)V
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    public fun b(p0: String, p1: com.google.android.gms.common.internal.e.f) { /* TODO(body): (Ljava/lang/String;Lcom/google/android/gms/common/internal/e$f;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/String;",
    //                 "Lcom/google/android/gms/common/internal/e",
    //                 "<*>.f;)V"
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/g;->LU:Ljava/util/HashMap;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g;->LU:Ljava/util/HashMap;
    //         invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/internal/g$a;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Nonexistent connection status for service action: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_0
    //         :try_start_1
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/internal/g$a;->c(Lcom/google/android/gms/common/internal/e$f;)Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction="
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/common/internal/g$a;->b(Lcom/google/android/gms/common/internal/e$f;)V
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/g$a;->gY()Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/g;->mHandler:Landroid/os/Handler;
    //         const/4 v3, 0x0
    //         invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/g;->mHandler:Landroid/os/Handler;
    //         const-wide/16 v4, 0x1388
    //         invoke-virtual {v2, v0, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    //         :cond_2
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         return-void
    */

    public fun handleMessage(msg: android.os.Message): Boolean { return TODO("body: (Landroid/os/Message;)Z") }
    /*
    //         .locals 4
    //         iget v0, p1, Landroid/os/Message;->what:I
    //         packed-switch v0, :pswitch_data_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :pswitch_0
    //         iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
    //         check-cast v0, Lcom/google/android/gms/common/internal/g$a;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/g;->LU:Ljava/util/HashMap;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/g$a;->gY()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/g;->mD:Landroid/content/Context;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/g$a;->gW()Lcom/google/android/gms/common/internal/g$a$a;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/g;->LU:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/g$a;->gX()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         monitor-exit v1
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //         .end packed-switch
    */

    companion object {
    private val LS: Object = null!!
    private var LT: com.google.android.gms.common.internal.g

    public @JvmStatic fun J(p0: android.content.Context): com.google.android.gms.common.internal.g { return TODO("body: (Landroid/content/Context;)Lcom/google/android/gms/common/internal/g;") }
    /*
    //         .locals 3
    //         sget-object v1, Lcom/google/android/gms/common/internal/g;->LS:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/common/internal/g;->LT:Lcom/google/android/gms/common/internal/g;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/internal/g;
    //         invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-direct {v0, v2}, Lcom/google/android/gms/common/internal/g;-><init>(Landroid/content/Context;)V
    //         sput-object v0, Lcom/google/android/gms/common/internal/g;->LT:Lcom/google/android/gms/common/internal/g;
    //         :cond_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         sget-object v0, Lcom/google/android/gms/common/internal/g;->LT:Lcom/google/android/gms/common/internal/g;
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.common.internal.g): java.util.HashMap { return TODO("body: (Lcom/google/android/gms/common/internal/g;)Ljava/util/HashMap;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/g;->LU:Ljava/util/HashMap;
    //         return-object v0
    */

    }
}
