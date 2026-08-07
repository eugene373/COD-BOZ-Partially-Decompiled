package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 6 fields, 13 methods.

class f {
    private val LM: com.google.android.gms.common.internal.f.b
    private val LN: java.util.ArrayList
    val LO: java.util.ArrayList
    private var LP: Boolean
    private val LQ: java.util.ArrayList
    private val mHandler: android.os.Handler

    public constructor(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.f.b)

    public fun aB(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 4
    //         const/4 v1, 0x1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->mHandler:Landroid/os/Handler;
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         monitor-enter v1
    //         const/4 v0, 0x1
    //         :try_start_0
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/internal/f;->LP:Z
    //         new-instance v0, Ljava/util/ArrayList;
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
    //         iget-object v3, p0, Lcom/google/android/gms/common/internal/f;->LM:Lcom/google/android/gms/common/internal/f$b;
    //         invoke-interface {v3}, Lcom/google/android/gms/common/internal/f$b;->gq()Z
    //         move-result v3
    //         if-nez v3, :cond_2
    //         :cond_1
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/internal/f;->LP:Z
    //         monitor-exit v1
    //         return-void
    //         :cond_2
    //         iget-object v3, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;->onConnectionSuspended(I)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun b(p0: com.google.android.gms.common.ConnectionResult) { /* TODO(body): (Lcom/google/android/gms/common/ConnectionResult;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->mHandler:Landroid/os/Handler;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/f;->LQ:Ljava/util/ArrayList;
    //         monitor-enter v1
    //         :try_start_0
    //         new-instance v0, Ljava/util/ArrayList;
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/f;->LQ:Ljava/util/ArrayList;
    //         invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_0
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    //         iget-object v3, p0, Lcom/google/android/gms/common/internal/f;->LM:Lcom/google/android/gms/common/internal/f$b;
    //         invoke-interface {v3}, Lcom/google/android/gms/common/internal/f$b;->gq()Z
    //         move-result v3
    //         if-nez v3, :cond_1
    //         monitor-exit v1
    //         :goto_1
    //         return-void
    //         :cond_1
    //         iget-object v3, p0, Lcom/google/android/gms/common/internal/f;->LQ:Ljava/util/ArrayList;
    //         invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_2
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_1
    */

    public fun d(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         const/4 v0, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         monitor-enter v3
    //         :try_start_0
    //         iget-boolean v2, p0, Lcom/google/android/gms/common/internal/f;->LP:Z
    //         if-nez v2, :cond_2
    //         move v2, v0
    //         :goto_0
    //         invoke-static {v2}, Lcom/google/android/gms/common/internal/o;->I(Z)V
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/f;->mHandler:Landroid/os/Handler;
    //         const/4 v4, 0x1
    //         invoke-virtual {v2, v4}, Landroid/os/Handler;->removeMessages(I)V
    //         const/4 v2, 0x1
    //         iput-boolean v2, p0, Lcom/google/android/gms/common/internal/f;->LP:Z
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/f;->LO:Ljava/util/ArrayList;
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
    //         move-result v2
    //         if-nez v2, :cond_3
    //         :goto_1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->I(Z)V
    //         new-instance v0, Ljava/util/ArrayList;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         :goto_2
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/f;->LM:Lcom/google/android/gms/common/internal/f$b;
    //         invoke-interface {v2}, Lcom/google/android/gms/common/internal/f$b;->gq()Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/f;->LM:Lcom/google/android/gms/common/internal/f$b;
    //         invoke-interface {v2}, Lcom/google/android/gms/common/internal/f$b;->isConnected()Z
    //         move-result v2
    //         if-nez v2, :cond_4
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LO:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/internal/f;->LP:Z
    //         monitor-exit v3
    //         return-void
    //         :cond_2
    //         move v2, v1
    //         goto :goto_0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_1
    //         :cond_4
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/f;->LO:Ljava/util/ArrayList;
    //         invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;->onConnected(Landroid/os/Bundle;)V
    //         goto :goto_2
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v3
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    protected fun dL() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LM:Lcom/google/android/gms/common/internal/f$b;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/internal/f$b;->fC()Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/internal/f;->d(Landroid/os/Bundle;)V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun isConnectionCallbacksRegistered(listener: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks): Boolean { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Z") }
    /*
    //         .locals 2
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun isConnectionFailedListenerRegistered(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener): Boolean { return TODO("body: (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z") }
    /*
    //         .locals 2
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/f;->LQ:Ljava/util/ArrayList;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LQ:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         monitor-exit v1
    //         return v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun registerConnectionCallbacks(listener: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V */ }
    /*
    //         .locals 4
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const-string v0, "GmsClientEvents"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "registerConnectionCallbacks(): listener "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " is already registered"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LM:Lcom/google/android/gms/common/internal/f$b;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/internal/f$b;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->mHandler:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/f;->mHandler:Landroid/os/Handler;
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    //         :cond_0
    //         return-void
    //         :cond_1
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun registerConnectionFailedListener(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V */ }
    /*
    //         .locals 4
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/f;->LQ:Ljava/util/ArrayList;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LQ:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "GmsClientEvents"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "registerConnectionFailedListener(): listener "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " is already registered"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :goto_0
    //         monitor-exit v1
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LQ:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun unregisterConnectionCallbacks(listener: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V */ }
    /*
    //         .locals 4
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         const-string v0, "GmsClientEvents"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "unregisterConnectionCallbacks(): listener "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " not found"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         :goto_0
    //         monitor-exit v1
    //         return-void
    //         :cond_1
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/internal/f;->LP:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LO:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun unregisterConnectionFailedListener(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V */ }
    /*
    //         .locals 4
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/f;->LQ:Ljava/util/ArrayList;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LQ:Ljava/util/ArrayList;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LQ:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "GmsClientEvents"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "unregisterConnectionFailedListener(): listener "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " not found"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
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

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.common.internal.f): java.util.ArrayList { return TODO("body: (Lcom/google/android/gms/common/internal/f;)Ljava/util/ArrayList;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LN:Ljava/util/ArrayList;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.common.internal.f): com.google.android.gms.common.internal.f.b { return TODO("body: (Lcom/google/android/gms/common/internal/f;)Lcom/google/android/gms/common/internal/f$b;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/f;->LM:Lcom/google/android/gms/common/internal/f$b;
    //         return-object v0
    */

    }
}
