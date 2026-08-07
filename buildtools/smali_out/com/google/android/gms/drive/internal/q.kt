package com.google.android.gms.drive.internal

// Auto-emitted from smali.
// 8 fields, 16 methods.

open class q: com.google.android.gms.common.internal.e() {
    private val Dd: String
    private val IM: String
    private val OA: android.os.Bundle
    private val OB: Boolean
    private var OC: com.google.android.gms.drive.DriveId
    private var OD: com.google.android.gms.drive.DriveId
    val OE: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    val OF: java.util.Map

    public constructor(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p4: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, p5: Array<String>, p6: android.os.Bundle)

    protected fun T(p0: android.os.IBinder): com.google.android.gms.drive.internal.ab { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/drive/internal/ab;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/drive/internal/ab$a;->U(Landroid/os/IBinder;)Lcom/google/android/gms/drive/internal/ab;
    //         move-result-object v0
    //         return-object v0
    */

    fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.DriveId, p2: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "Lcom/google/android/gms/drive/DriveId;",
    //                 "I)",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-static {p3, p2}, Lcom/google/android/gms/drive/events/d;->a(ILcom/google/android/gms/drive/DriveId;)Z
    //         move-result v0
    //         const-string v1, "id"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         const-string v0, "eventService"
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/q;->isConnected()Z
    //         move-result v0
    //         const-string v1, "Client must be connected"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/internal/q;->OB:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/drive/internal/q$3;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/drive/internal/q$3;-><init>(Lcom/google/android/gms/drive/internal/q;Lcom/google/android/gms/drive/DriveId;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.DriveId, p2: Int, p3: com.google.android.gms.drive.events.c): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/events/c;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "Lcom/google/android/gms/drive/DriveId;",
    //                 "I",
    //                 "Lcom/google/android/gms/drive/events/c;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-static {p3, p2}, Lcom/google/android/gms/drive/events/d;->a(ILcom/google/android/gms/drive/DriveId;)Z
    //         move-result v0
    //         const-string v1, "id"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         const-string v0, "listener"
    //         invoke-static {p4, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/q;->isConnected()Z
    //         move-result v0
    //         const-string v1, "Client must be connected"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-object v2, p0, Lcom/google/android/gms/drive/internal/q;->OF:Ljava/util/Map;
    //         monitor-enter v2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/q;->OF:Ljava/util/Map;
    //         invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map;
    //         if-nez v0, :cond_2
    //         new-instance v0, Ljava/util/HashMap;
    //         invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/q;->OF:Ljava/util/Map;
    //         invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         move-object v1, v0
    //         :goto_0
    //         invoke-interface {v1, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/y;
    //         if-nez v0, :cond_1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/y;
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/q;->getLooper()Landroid/os/Looper;
    //         move-result-object v3
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/q;->getContext()Landroid/content/Context;
    //         move-result-object v4
    //         invoke-direct {v0, v3, v4, p3, p4}, Lcom/google/android/gms/drive/internal/y;-><init>(Landroid/os/Looper;Landroid/content/Context;ILcom/google/android/gms/drive/events/c;)V
    //         invoke-interface {v1, p4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_0
    //         invoke-virtual {v0, p3}, Lcom/google/android/gms/drive/internal/y;->bq(I)V
    //         new-instance v1, Lcom/google/android/gms/drive/internal/q$1;
    //         invoke-direct {v1, p0, p2, p3, v0}, Lcom/google/android/gms/drive/internal/q$1;-><init>(Lcom/google/android/gms/drive/internal/q;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/internal/y;)V
    //         invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         monitor-exit v2
    //         :goto_1
    //         return-object v0
    //         :cond_1
    //         invoke-virtual {v0, p3}, Lcom/google/android/gms/drive/internal/y;->br(I)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         new-instance v0, Lcom/google/android/gms/drive/internal/o$m;
    //         sget-object v1, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v0, p1, v1}, Lcom/google/android/gms/drive/internal/o$m;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/Status;)V
    //         monitor-exit v2
    //         goto :goto_1
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_2
    //         move-object v1, v0
    //         goto :goto_0
    */

    protected fun a(p0: Int, p1: android.os.IBinder, p2: android.os.Bundle) { /* TODO(body): (ILandroid/os/IBinder;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         if-eqz p3, :cond_0
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
    //         move-result-object v0
    //         invoke-virtual {p3, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V
    //         const-string v0, "com.google.android.gms.drive.root_id"
    //         invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/DriveId;
    //         iput-object v0, p0, Lcom/google/android/gms/drive/internal/q;->OC:Lcom/google/android/gms/drive/DriveId;
    //         const-string v0, "com.google.android.gms.drive.appdata_id"
    //         invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/DriveId;
    //         iput-object v0, p0, Lcom/google/android/gms/drive/internal/q;->OD:Lcom/google/android/gms/drive/DriveId;
    //         :cond_0
    //         invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/common/internal/e;->a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e) { /* TODO(body): (Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V */ }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/q;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {p2}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-static {v3}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/q;->gR()[Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         new-instance v6, Landroid/os/Bundle;
    //         invoke-direct {v6}, Landroid/os/Bundle;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/q;->IM:Ljava/lang/String;
    //         invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "proxy_package_name"
    //         iget-object v1, p0, Lcom/google/android/gms/drive/internal/q;->IM:Ljava/lang/String;
    //         invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/q;->OA:Landroid/os/Bundle;
    //         invoke-virtual {v6, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
    //         const v2, 0x5e2978
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/q;->gR()[Ljava/lang/String;
    //         move-result-object v4
    //         iget-object v5, p0, Lcom/google/android/gms/drive/internal/q;->Dd:Ljava/lang/String;
    //         move-object v0, p1
    //         move-object v1, p2
    //         invoke-interface/range {v0 .. v6}, Lcom/google/android/gms/common/internal/l;->a(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-void
    */

    fun b(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.DriveId, p2: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "Lcom/google/android/gms/drive/DriveId;",
    //                 "I)",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-static {p3, p2}, Lcom/google/android/gms/drive/events/d;->a(ILcom/google/android/gms/drive/DriveId;)Z
    //         move-result v0
    //         const-string v1, "id"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         const-string v0, "eventService"
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/q;->isConnected()Z
    //         move-result v0
    //         const-string v1, "Client must be connected"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         new-instance v0, Lcom/google/android/gms/drive/internal/q$4;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/drive/internal/q$4;-><init>(Lcom/google/android/gms/drive/internal/q;Lcom/google/android/gms/drive/DriveId;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    fun b(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.drive.DriveId, p2: Int, p3: com.google.android.gms.drive.events.c): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/events/c;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "Lcom/google/android/gms/drive/DriveId;",
    //                 "I",
    //                 "Lcom/google/android/gms/drive/events/c;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;"
    //             }
    //         .end annotation
    //         invoke-static {p3, p2}, Lcom/google/android/gms/drive/events/d;->a(ILcom/google/android/gms/drive/DriveId;)Z
    //         move-result v0
    //         const-string v1, "id"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/q;->isConnected()Z
    //         move-result v0
    //         const-string v1, "Client must be connected"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         const-string v0, "listener"
    //         invoke-static {p4, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v2, p0, Lcom/google/android/gms/drive/internal/q;->OF:Ljava/util/Map;
    //         monitor-enter v2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/q;->OF:Ljava/util/Map;
    //         invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/drive/internal/o$m;
    //         sget-object v1, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v0, p1, v1}, Lcom/google/android/gms/drive/internal/o$m;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/Status;)V
    //         monitor-exit v2
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-interface {v0, p4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/drive/internal/y;
    //         if-nez v1, :cond_1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/o$m;
    //         sget-object v1, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v0, p1, v1}, Lcom/google/android/gms/drive/internal/o$m;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/Status;)V
    //         monitor-exit v2
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_1
    //         :try_start_1
    //         invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/q;->OF:Ljava/util/Map;
    //         invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_2
    //         new-instance v0, Lcom/google/android/gms/drive/internal/q$2;
    //         invoke-direct {v0, p0, p2, p3, v1}, Lcom/google/android/gms/drive/internal/q$2;-><init>(Lcom/google/android/gms/drive/internal/q;Lcom/google/android/gms/drive/DriveId;ILcom/google/android/gms/drive/internal/y;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    */

    public fun disconnect() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/q;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/ab;
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         new-instance v1, Lcom/google/android/gms/drive/internal/DisconnectRequest;
    //         invoke-direct {v1}, Lcom/google/android/gms/drive/internal/DisconnectRequest;-><init>()V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/drive/internal/ab;->a(Lcom/google/android/gms/drive/internal/DisconnectRequest;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->disconnect()V
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/q;->OF:Ljava/util/Map;
    //         invoke-interface {v0}, Ljava/util/Map;->clear()V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.drive.internal.IDriveService"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.drive.ApiService.START"
    //         return-object v0
    */

    public fun hY(): com.google.android.gms.drive.internal.ab { return TODO("body: ()Lcom/google/android/gms/drive/internal/ab;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/drive/internal/q;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/drive/internal/ab;
    //         return-object v0
    */

    public fun hZ(): com.google.android.gms.drive.DriveId { return TODO("body: ()Lcom/google/android/gms/drive/DriveId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/q;->OC:Lcom/google/android/gms/drive/DriveId;
    //         return-object v0
    */

    public fun ia(): com.google.android.gms.drive.DriveId { return TODO("body: ()Lcom/google/android/gms/drive/DriveId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/drive/internal/q;->OD:Lcom/google/android/gms/drive/DriveId;
    //         return-object v0
    */

    public fun ib(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/drive/internal/q;->OB:Z
    //         return v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/q;->T(Landroid/os/IBinder;)Lcom/google/android/gms/drive/internal/ab;
    //         move-result-object v0
    //         return-object v0
    */

}
