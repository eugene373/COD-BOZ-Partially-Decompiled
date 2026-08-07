package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 11 fields, 42 methods.

open class e: com.google.android.gms.common.api.Api.a, com.google.android.gms.common.internal.f.b {
    private val Ds: Array<String>
    private val IH: android.os.Looper
    private val IX: com.google.android.gms.common.internal.f
    private val LA: java.util.ArrayList
    private var LB: com.google.android.gms.common.internal.e.f
    private var LC: Int
    var LD: Boolean
    private var Lz: android.os.IInterface
    private val mContext: android.content.Context
    val mHandler: android.os.Handler

    protected constructor(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p3: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, p4: Array<String>)

    protected constructor(p0: android.content.Context, p1: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, p2: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, p3: Array<String>)

    private fun az(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x3
    //         iget v0, p0, Lcom/google/android/gms/common/internal/e;->LC:I
    //         iput p1, p0, Lcom/google/android/gms/common/internal/e;->LC:I
    //         if-eq v0, p1, :cond_0
    //         if-ne p1, v1, :cond_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/internal/e;->onConnected()V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         if-ne p1, v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/internal/e;->onDisconnected()V
    //         goto :goto_0
    */

    protected fun N(p0: android.os.IBinder) { /* TODO(body): (Landroid/os/IBinder;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         invoke-static {p1}, Lcom/google/android/gms/common/internal/l$a;->Q(Landroid/os/IBinder;)Lcom/google/android/gms/common/internal/l;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/common/internal/e$e;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/common/internal/e$e;-><init>(Lcom/google/android/gms/common/internal/e;)V
    //         invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/common/internal/e;->a(Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "GmsClient"
    //         const-string v1, "service died"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    protected fun a(p0: Int, p1: android.os.IBinder, p2: android.os.Bundle) { /* TODO(body): (ILandroid/os/IBinder;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->mHandler:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/e;->mHandler:Landroid/os/Handler;
    //         const/4 v2, 0x1
    //         new-instance v3, Lcom/google/android/gms/common/internal/e$h;
    //         invoke-direct {v3, p0, p1, p2, p3}, Lcom/google/android/gms/common/internal/e$h;-><init>(Lcom/google/android/gms/common/internal/e;ILandroid/os/IBinder;Landroid/os/Bundle;)V
    //         invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    //         return-void
    */

    public fun a(p0: com.google.android.gms.common.internal.e.b) { /* TODO(body): (Lcom/google/android/gms/common/internal/e$b;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/internal/e",
    //                 "<TT;>.b<*>;)V"
    //             }
    //         .end annotation
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/e;->LA:Ljava/util/ArrayList;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->LA:Ljava/util/ArrayList;
    //         invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->mHandler:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/e;->mHandler:Landroid/os/Handler;
    //         const/4 v2, 0x2
    //         invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e)

    public fun aA(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->mHandler:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/e;->mHandler:Landroid/os/Handler;
    //         const/4 v2, 0x4
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    //         return-void
    */

    protected fun c(p0: Array<String>) { /* TODO(body): ([Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun connect() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x3
    //         const/4 v1, 0x1
    //         iput-boolean v1, p0, Lcom/google/android/gms/common/internal/e;->LD:Z
    //         const/4 v0, 0x2
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/common/internal/e;->az(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->mContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-direct {p0, v1}, Lcom/google/android/gms/common/internal/e;->az(I)V
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/e;->mHandler:Landroid/os/Handler;
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/e;->mHandler:Landroid/os/Handler;
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         invoke-virtual {v2, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->LB:Lcom/google/android/gms/common/internal/e$f;
    //         if-eqz v0, :cond_2
    //         const-string v0, "GmsClient"
    //         const-string v1, "Calling connect() while still connected, missing disconnect()."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/common/internal/e;->Lz:Landroid/os/IInterface;
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->mContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/g;->J(Landroid/content/Context;)Lcom/google/android/gms/common/internal/g;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/internal/e;->getStartServiceAction()Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/e;->LB:Lcom/google/android/gms/common/internal/e$f;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/g;->b(Ljava/lang/String;Lcom/google/android/gms/common/internal/e$f;)V
    //         :cond_2
    //         new-instance v0, Lcom/google/android/gms/common/internal/e$f;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/common/internal/e$f;-><init>(Lcom/google/android/gms/common/internal/e;)V
    //         iput-object v0, p0, Lcom/google/android/gms/common/internal/e;->LB:Lcom/google/android/gms/common/internal/e$f;
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->mContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/g;->J(Landroid/content/Context;)Lcom/google/android/gms/common/internal/g;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/internal/e;->getStartServiceAction()Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/e;->LB:Lcom/google/android/gms/common/internal/e$f;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/g;->a(Ljava/lang/String;Lcom/google/android/gms/common/internal/e$f;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "GmsClient"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "unable to connect to service: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/internal/e;->getStartServiceAction()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->mHandler:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/e;->mHandler:Landroid/os/Handler;
    //         const/16 v2, 0x9
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    //         goto :goto_0
    */

    protected fun dJ() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/internal/e;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Not connected. Call connect() and wait for onConnected() to be called."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public fun disconnect() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/internal/e;->LD:Z
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/e;->LA:Ljava/util/ArrayList;
    //         monitor-enter v2
    //         :try_start_0
    //         iget-object v1, p0, Lcom/google/android/gms/common/internal/e;->LA:Ljava/util/ArrayList;
    //         invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
    //         move-result v3
    //         move v1, v0
    //         :goto_0
    //         if-ge v1, v3, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->LA:Ljava/util/ArrayList;
    //         invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/common/internal/e$b;
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/e$b;->gV()V
    //         add-int/lit8 v0, v1, 0x1
    //         move v1, v0
    //         goto :goto_0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->LA:Ljava/util/ArrayList;
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         const/4 v0, 0x1
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/common/internal/e;->az(I)V
    //         iput-object v4, p0, Lcom/google/android/gms/common/internal/e;->Lz:Landroid/os/IInterface;
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->LB:Lcom/google/android/gms/common/internal/e$f;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->mContext:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/g;->J(Landroid/content/Context;)Lcom/google/android/gms/common/internal/g;
    //         move-result-object v0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/internal/e;->getStartServiceAction()Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/common/internal/e;->LB:Lcom/google/android/gms/common/internal/e$f;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/g;->b(Ljava/lang/String;Lcom/google/android/gms/common/internal/e$f;)V
    //         iput-object v4, p0, Lcom/google/android/gms/common/internal/e;->LB:Lcom/google/android/gms/common/internal/e$f;
    //         :cond_1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun fC(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun gR(): Array<String> { return TODO("body: ()[Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->Ds:[Ljava/lang/String;
    //         return-object v0
    */

    public fun gS(): android.os.IInterface { return TODO("body: ()Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TT;"
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/internal/e;->dJ()V
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->Lz:Landroid/os/IInterface;
    //         return-object v0
    */

    public fun getContext(): android.content.Context { return TODO("body: ()Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->mContext:Landroid/content/Context;
    //         return-object v0
    */

    public fun getLooper(): android.os.Looper { return TODO("body: ()Landroid/os/Looper;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->IH:Landroid/os/Looper;
    //         return-object v0
    */

    protected fun getServiceDescriptor(): String

    protected fun getStartServiceAction(): String

    public fun gq(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/internal/e;->LD:Z
    //         return v0
    */

    public fun isConnected(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/common/internal/e;->LC:I
    //         const/4 v1, 0x3
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isConnecting(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/common/internal/e;->LC:I
    //         const/4 v1, 0x2
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isConnectionCallbacksRegistered(listener: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks): Boolean { return TODO("body: (Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)Z") }
    /*
    //         .locals 2
    //         .local p0, "this":Lcom/google/android/gms/common/internal/e;, "Lcom/google/android/gms/common/internal/e<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->IX:Lcom/google/android/gms/common/internal/f;
    //         new-instance v1, Lcom/google/android/gms/common/internal/e$c;
    //         invoke-direct {v1, p1}, Lcom/google/android/gms/common/internal/e$c;-><init>(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/f;->isConnectionCallbacksRegistered(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Z
    //         move-result v0
    //         return v0
    */

    public fun isConnectionFailedListenerRegistered(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener): Boolean { return TODO("body: (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z") }
    /*
    //         .locals 1
    //         .local p0, "this":Lcom/google/android/gms/common/internal/e;, "Lcom/google/android/gms/common/internal/e<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->IX:Lcom/google/android/gms/common/internal/f;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->isConnectionFailedListenerRegistered(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)Z
    //         move-result v0
    //         return v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface

    protected fun onConnected() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    protected fun onDisconnected() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun registerConnectionCallbacks(listener: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Lcom/google/android/gms/common/internal/e;, "Lcom/google/android/gms/common/internal/e<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->IX:Lcom/google/android/gms/common/internal/f;
    //         new-instance v1, Lcom/google/android/gms/common/internal/e$c;
    //         invoke-direct {v1, p1}, Lcom/google/android/gms/common/internal/e$c;-><init>(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/f;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    //         return-void
    */

    public fun registerConnectionCallbacks(listener: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Lcom/google/android/gms/common/internal/e;, "Lcom/google/android/gms/common/internal/e<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->IX:Lcom/google/android/gms/common/internal/f;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    //         return-void
    */

    public fun registerConnectionFailedListener(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Lcom/google/android/gms/common/internal/e;, "Lcom/google/android/gms/common/internal/e<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->IX:Lcom/google/android/gms/common/internal/f;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    //         return-void
    */

    public fun registerConnectionFailedListener(listener: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Lcom/google/android/gms/common/internal/e;, "Lcom/google/android/gms/common/internal/e<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->IX:Lcom/google/android/gms/common/internal/f;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->registerConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    //         return-void
    */

    public fun unregisterConnectionCallbacks(listener: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V */ }
    /*
    //         .locals 2
    //         .local p0, "this":Lcom/google/android/gms/common/internal/e;, "Lcom/google/android/gms/common/internal/e<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->IX:Lcom/google/android/gms/common/internal/f;
    //         new-instance v1, Lcom/google/android/gms/common/internal/e$c;
    //         invoke-direct {v1, p1}, Lcom/google/android/gms/common/internal/e$c;-><init>(Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;)V
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/f;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    //         return-void
    */

    public fun unregisterConnectionFailedListener(listener: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener) { /* TODO(body): (Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Lcom/google/android/gms/common/internal/e;, "Lcom/google/android/gms/common/internal/e<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->IX:Lcom/google/android/gms/common/internal/f;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->unregisterConnectionFailedListener(Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;)V
    //         return-void
    */

    companion object {
    @JvmField public val LE: Array<String> = null!!

    @JvmStatic fun a(p0: com.google.android.gms.common.internal.e, p1: android.os.IInterface): android.os.IInterface { return TODO("body: (Lcom/google/android/gms/common/internal/e;Landroid/os/IInterface;)Landroid/os/IInterface;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/common/internal/e;->Lz:Landroid/os/IInterface;
    //         return-object p1
    */

    @JvmStatic fun a(p0: com.google.android.gms.common.internal.e, p1: com.google.android.gms.common.internal.e.f): com.google.android.gms.common.internal.e.f { return TODO("body: (Lcom/google/android/gms/common/internal/e;Lcom/google/android/gms/common/internal/e$f;)Lcom/google/android/gms/common/internal/e$f;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/common/internal/e;->LB:Lcom/google/android/gms/common/internal/e$f;
    //         return-object p1
    */

    @JvmStatic fun a(p0: com.google.android.gms.common.internal.e): com.google.android.gms.common.internal.f { return TODO("body: (Lcom/google/android/gms/common/internal/e;)Lcom/google/android/gms/common/internal/f;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->IX:Lcom/google/android/gms/common/internal/f;
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.common.internal.e, p1: Int) { /* TODO(body): (Lcom/google/android/gms/common/internal/e;I)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/common/internal/e;->az(I)V
    //         return-void
    */

    @JvmStatic fun b(p0: com.google.android.gms.common.internal.e): java.util.ArrayList { return TODO("body: (Lcom/google/android/gms/common/internal/e;)Ljava/util/ArrayList;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->LA:Ljava/util/ArrayList;
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.common.internal.e): android.os.IInterface { return TODO("body: (Lcom/google/android/gms/common/internal/e;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->Lz:Landroid/os/IInterface;
    //         return-object v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.common.internal.e): com.google.android.gms.common.internal.e.f { return TODO("body: (Lcom/google/android/gms/common/internal/e;)Lcom/google/android/gms/common/internal/e$f;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->LB:Lcom/google/android/gms/common/internal/e$f;
    //         return-object v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.common.internal.e): android.content.Context { return TODO("body: (Lcom/google/android/gms/common/internal/e;)Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e;->mContext:Landroid/content/Context;
    //         return-object v0
    */

    }
}
