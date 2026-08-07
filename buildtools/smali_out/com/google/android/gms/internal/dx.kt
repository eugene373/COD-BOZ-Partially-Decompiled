package com.google.android.gms.internal

// Auto-emitted from smali.
// 8 fields, 12 methods.

open class dx: com.google.android.gms.internal.gg(), android.content.ServiceConnection {
    private var mContext: android.content.Context
    private val mw: Object
    private var sl: Boolean
    private var sm: com.google.android.gms.internal.el
    private var sn: com.google.android.gms.internal.dw
    private var so: com.google.android.gms.internal.ec
    private var sp: java.util.List
    private var sq: com.google.android.gms.internal.ee

    public constructor(p0: android.content.Context, p1: com.google.android.gms.internal.el, p2: com.google.android.gms.internal.ee)

    private fun a(p0: com.google.android.gms.internal.ea, p1: String, p2: String) { /* TODO(body): (Lcom/google/android/gms/internal/ea;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-direct {v0}, Landroid/content/Intent;-><init>()V
    //         const-string v1, "RESPONSE_CODE"
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         const-string v1, "INAPP_PURCHASE_DATA"
    //         invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v1, "INAPP_DATA_SIGNATURE"
    //         invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         sget-object v1, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         new-instance v2, Lcom/google/android/gms/internal/dx$1;
    //         invoke-direct {v2, p0, p1, v0}, Lcom/google/android/gms/internal/dx$1;-><init>(Lcom/google/android/gms/internal/dx;Lcom/google/android/gms/internal/ea;Landroid/content/Intent;)V
    //         invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    */

    private fun b(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         :cond_0
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/dx;->c(J)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         const-string v0, "Timeout waiting for pending transaction to be processed."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         :cond_1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/dx;->sl:Z
    //         if-eqz v0, :cond_0
    //         return-void
    */

    private fun c(p0: Long): Boolean { return TODO("body: (J)Z") }
    /*
    //         .locals 5
    //         const-wide/32 v0, 0xea60
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v2
    //         sub-long/2addr v2, p1
    //         sub-long/2addr v0, v2
    //         const-wide/16 v2, 0x0
    //         cmp-long v2, v0, v2
    //         if-gtz v2, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         :try_start_0
    //         iget-object v2, p0, Lcom/google/android/gms/internal/dx;->mw:Ljava/lang/Object;
    //         invoke-virtual {v2, v0, v1}, Ljava/lang/Object;->wait(J)V
    //         :try_end_0
    //         .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "waitWithTimeout_lock interrupted"
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->W(Ljava/lang/String;)V
    //         goto :goto_1
    */

    private fun cp() { /* TODO(body): ()V */ }
    /*
    //         .locals 12
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx;->sp:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         return-void
    //         :cond_1
    //         new-instance v6, Ljava/util/HashMap;
    //         invoke-direct {v6}, Ljava/util/HashMap;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx;->sp:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ea;
    //         iget-object v2, v0, Lcom/google/android/gms/internal/ea;->sC:Ljava/lang/String;
    //         invoke-virtual {v6, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         goto :goto_0
    //         :cond_2
    //         const/4 v0, 0x0
    //         :goto_1
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dx;->sn:Lcom/google/android/gms/internal/dw;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/dx;->mContext:Landroid/content/Context;
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/dw;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         if-nez v0, :cond_4
    //         :cond_3
    //         invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_2
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/dx;->so:Lcom/google/android/gms/internal/ec;
    //         invoke-virtual {v6, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ea;
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ec;->a(Lcom/google/android/gms/internal/ea;)V
    //         goto :goto_2
    //         :cond_4
    //         invoke-static {v0}, Lcom/google/android/gms/internal/ed;->b(Landroid/os/Bundle;)I
    //         move-result v1
    //         if-nez v1, :cond_3
    //         const-string v1, "INAPP_PURCHASE_ITEM_LIST"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v7
    //         const-string v1, "INAPP_PURCHASE_DATA_LIST"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v8
    //         const-string v1, "INAPP_DATA_SIGNATURE_LIST"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v9
    //         const-string v1, "INAPP_CONTINUATION_TOKEN"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v5
    //         const/4 v0, 0x0
    //         move v4, v0
    //         :goto_3
    //         invoke-virtual {v7}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         if-ge v4, v0, :cond_6
    //         invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-virtual {v6, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         invoke-virtual {v6, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Lcom/google/android/gms/internal/ea;
    //         invoke-static {v1}, Lcom/google/android/gms/internal/ed;->D(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v10
    //         iget-object v11, v3, Lcom/google/android/gms/internal/ea;->sB:Ljava/lang/String;
    //         invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v10
    //         if-eqz v10, :cond_5
    //         invoke-direct {p0, v3, v1, v2}, Lcom/google/android/gms/internal/dx;->a(Lcom/google/android/gms/internal/ea;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v6, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_5
    //         add-int/lit8 v0, v4, 0x1
    //         move v4, v0
    //         goto :goto_3
    //         :cond_6
    //         if-eqz v5, :cond_3
    //         invoke-virtual {v6}, Ljava/util/HashMap;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_3
    //         move-object v0, v5
    //         goto/16 :goto_1
    */

    public fun co() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dx;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx;->mContext:Landroid/content/Context;
    //         new-instance v2, Landroid/content/Intent;
    //         const-string v3, "com.android.vending.billing.InAppBillingService.BIND"
    //         invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         iget-object v3, p0, Lcom/google/android/gms/internal/dx;->mContext:Landroid/content/Context;
    //         const/4 v3, 0x1
    //         invoke-virtual {v0, v2, p0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v2
    //         invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/dx;->b(J)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx;->sn:Lcom/google/android/gms/internal/dw;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/dw;->destroy()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun onServiceConnected(name: android.content.ComponentName, service: android.os.IBinder) { /* TODO(body): (Landroid/content/ComponentName;Landroid/os/IBinder;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dx;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx;->sn:Lcom/google/android/gms/internal/dw;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/dw;->r(Landroid/os/IBinder;)V
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/dx;->cp()V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/dx;->sl:Z
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx;->mw:Ljava/lang/Object;
    //         invoke-virtual {v0}, Ljava/lang/Object;->notify()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun onServiceDisconnected(name: android.content.ComponentName) { /* TODO(body): (Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 1
    //         const-string v0, "In-app billing service disconnected."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->U(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx;->sn:Lcom/google/android/gms/internal/dw;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/dw;->destroy()V
    //         return-void
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dx;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx;->sn:Lcom/google/android/gms/internal/dw;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/dw;->destroy()V
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
    @JvmStatic fun a(p0: com.google.android.gms.internal.dx): com.google.android.gms.internal.ee { return TODO("body: (Lcom/google/android/gms/internal/dx;)Lcom/google/android/gms/internal/ee;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx;->sq:Lcom/google/android/gms/internal/ee;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.internal.dx): android.content.Context { return TODO("body: (Lcom/google/android/gms/internal/dx;)Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx;->mContext:Landroid/content/Context;
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.internal.dx): com.google.android.gms.internal.el { return TODO("body: (Lcom/google/android/gms/internal/dx;)Lcom/google/android/gms/internal/el;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dx;->sm:Lcom/google/android/gms/internal/el;
    //         return-object v0
    */

    }
}
