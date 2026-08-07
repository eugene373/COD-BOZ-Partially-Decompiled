package com.google.android.gms.internal

// Auto-emitted from smali.
// 5 fields, 13 methods.

open class no: com.google.android.gms.common.internal.e() {
    private val BZ: String
    private val akW: com.google.android.gms.internal.nl
    private val akX: com.google.android.gms.internal.nj
    private var akY: Boolean
    private val mw: Object

    public constructor(p0: android.content.Context, p1: com.google.android.gms.internal.nl)

    private fun c(p0: com.google.android.gms.internal.nm, p1: com.google.android.gms.internal.ni) { /* TODO(body): (Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/no;->akX:Lcom/google/android/gms/internal/nj;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/nj;->a(Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;)V
    //         return-void
    */

    private fun d(p0: com.google.android.gms.internal.nm, p1: com.google.android.gms.internal.ni) { /* TODO(body): (Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/no;->mY()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/no;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/nh;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/no;->BZ:Ljava/lang/String;
    //         invoke-interface {v0, v1, p1, p2}, Lcom/google/android/gms/internal/nh;->a(Ljava/lang/String;Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "PlayLoggerImpl"
    //         const-string v1, "Couldn\'t send log event.  Will try caching."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/no;->c(Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         const-string v0, "PlayLoggerImpl"
    //         const-string v1, "Service was disconnected.  Will try caching."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/no;->c(Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;)V
    //         goto :goto_0
    */

    private fun mY() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/no;->akY:Z
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/a;->I(Z)V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/no;->akX:Lcom/google/android/gms/internal/nj;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/nj;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v2, 0x0
    //         :try_start_0
    //         new-instance v3, Ljava/util/ArrayList;
    //         invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/no;->akX:Lcom/google/android/gms/internal/nj;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/nj;->mW()Ljava/util/ArrayList;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :goto_1
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/nj$a;
    //         iget-object v1, v0, Lcom/google/android/gms/internal/nj$a;->akO:Lcom/google/android/gms/internal/pr$c;
    //         if-eqz v1, :cond_2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/no;->gS()Landroid/os/IInterface;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/nh;
    //         iget-object v5, p0, Lcom/google/android/gms/internal/no;->BZ:Ljava/lang/String;
    //         iget-object v6, v0, Lcom/google/android/gms/internal/nj$a;->akM:Lcom/google/android/gms/internal/nm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/nj$a;->akO:Lcom/google/android/gms/internal/pr$c;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/pn;->f(Lcom/google/android/gms/internal/pn;)[B
    //         move-result-object v0
    //         invoke-interface {v1, v5, v6, v0}, Lcom/google/android/gms/internal/nh;->a(Ljava/lang/String;Lcom/google/android/gms/internal/nm;[B)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "PlayLoggerImpl"
    //         const-string v1, "Couldn\'t send cached log events to AndroidLog service.  Retaining in memory cache."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         :goto_2
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    //         :cond_2
    //         :try_start_1
    //         iget-object v1, v0, Lcom/google/android/gms/internal/nj$a;->akM:Lcom/google/android/gms/internal/nm;
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/nm;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         iget-object v0, v0, Lcom/google/android/gms/internal/nj$a;->akN:Lcom/google/android/gms/internal/ni;
    //         invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         move-object v0, v2
    //         :goto_3
    //         move-object v2, v0
    //         goto :goto_1
    //         :cond_3
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v1
    //         if-nez v1, :cond_4
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/no;->gS()Landroid/os/IInterface;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/internal/nh;
    //         iget-object v5, p0, Lcom/google/android/gms/internal/no;->BZ:Ljava/lang/String;
    //         invoke-interface {v1, v5, v2, v3}, Lcom/google/android/gms/internal/nh;->a(Ljava/lang/String;Lcom/google/android/gms/internal/nm;Ljava/util/List;)V
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
    //         :cond_4
    //         iget-object v1, v0, Lcom/google/android/gms/internal/nj$a;->akM:Lcom/google/android/gms/internal/nm;
    //         iget-object v0, v0, Lcom/google/android/gms/internal/nj$a;->akN:Lcom/google/android/gms/internal/ni;
    //         invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         move-object v0, v1
    //         goto :goto_3
    //         :cond_5
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_6
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/no;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/nh;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/no;->BZ:Ljava/lang/String;
    //         invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/nh;->a(Ljava/lang/String;Lcom/google/android/gms/internal/nm;Ljava/util/List;)V
    //         :cond_6
    //         iget-object v0, p0, Lcom/google/android/gms/internal/no;->akX:Lcom/google/android/gms/internal/nj;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/nj;->clear()V
    //         :try_end_1
    //         .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_2
    */

    fun S(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/no;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/no;->akY:Z
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/no;->akY:Z
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/no;->akY:Z
    //         if-nez v0, :cond_0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/no;->mY()V
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

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e) { /* TODO(body): (Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const v1, 0x5e2978
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/no;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p1, p2, v1, v2, v0}, Lcom/google/android/gms/common/internal/l;->f(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    public fun b(p0: com.google.android.gms.internal.nm, p1: com.google.android.gms.internal.ni) { /* TODO(body): (Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/no;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/no;->akY:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/no;->c(Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;)V
    //         :goto_0
    //         monitor-exit v1
    //         return-void
    //         :cond_0
    //         invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/no;->d(Lcom/google/android/gms/internal/nm;Lcom/google/android/gms/internal/ni;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    protected fun bD(p0: android.os.IBinder): com.google.android.gms.internal.nh { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/nh;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/nh$a;->bC(Landroid/os/IBinder;)Lcom/google/android/gms/internal/nh;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.playlog.internal.IPlayLogService"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.playlog.service.START"
    //         return-object v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/no;->bD(Landroid/os/IBinder;)Lcom/google/android/gms/internal/nh;
    //         move-result-object v0
    //         return-object v0
    */

    public fun start() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/no;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/no;->isConnecting()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/no;->isConnected()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         monitor-exit v1
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/no;->akW:Lcom/google/android/gms/internal/nl;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/nl;->R(Z)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/no;->connect()V
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun stop() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/no;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/no;->akW:Lcom/google/android/gms/internal/nl;
    //         const/4 v2, 0x0
    //         invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/nl;->R(Z)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/no;->disconnect()V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
