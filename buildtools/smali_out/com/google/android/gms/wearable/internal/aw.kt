package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 4 fields, 29 methods.

open class aw: com.google.android.gms.common.internal.e() {
    private val aqA: java.util.concurrent.ExecutorService
    private val avQ: java.util.HashMap
    private val avR: java.util.HashMap
    private val avS: java.util.HashMap

    public constructor(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p3: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)

    private fun a(p0: android.os.ParcelFileDescriptor, p1: ByteArray): java.util.concurrent.FutureTask { return TODO("body: (Landroid/os/ParcelFileDescriptor;[B)Ljava/util/concurrent/FutureTask;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/os/ParcelFileDescriptor;",
    //                 "[B)",
    //                 "Ljava/util/concurrent/FutureTask",
    //                 "<",
    //                 "Ljava/lang/Boolean;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Ljava/util/concurrent/FutureTask;
    //         new-instance v1, Lcom/google/android/gms/wearable/internal/aw$2;
    //         invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/wearable/internal/aw$2;-><init>(Lcom/google/android/gms/wearable/internal/aw;Landroid/os/ParcelFileDescriptor;[B)V
    //         invoke-direct {v0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V
    //         return-object v0
    */

    protected fun a(p0: Int, p1: android.os.IBinder, p2: android.os.Bundle) { /* TODO(body): (ILandroid/os/IBinder;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 7
    //         const/4 v1, 0x2
    //         const-string v0, "WearableClient"
    //         invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "WearableClient"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onPostInitHandler: statusCode "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         if-nez p1, :cond_3
    //         :try_start_0
    //         new-instance v1, Lcom/google/android/gms/wearable/internal/aw$1;
    //         invoke-direct {v1, p0}, Lcom/google/android/gms/wearable/internal/aw$1;-><init>(Lcom/google/android/gms/wearable/internal/aw;)V
    //         const-string v0, "WearableClient"
    //         const/4 v2, 0x2
    //         invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const-string v0, "WearableClient"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "onPostInitHandler: service "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_1
    //         invoke-static {p2}, Lcom/google/android/gms/wearable/internal/af$a;->bT(Landroid/os/IBinder;)Lcom/google/android/gms/wearable/internal/af;
    //         move-result-object v2
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avQ:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_0
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         const-string v4, "WearableClient"
    //         const/4 v5, 0x2
    //         invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         const-string v4, "WearableClient"
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "onPostInitHandler: adding Data listener "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v6
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_2
    //         new-instance v4, Lcom/google/android/gms/wearable/internal/b;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/ax;
    //         invoke-direct {v4, v0}, Lcom/google/android/gms/wearable/internal/b;-><init>(Lcom/google/android/gms/wearable/internal/ax;)V
    //         invoke-interface {v2, v1, v4}, Lcom/google/android/gms/wearable/internal/af;->a(Lcom/google/android/gms/wearable/internal/ad;Lcom/google/android/gms/wearable/internal/b;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "WearableClient"
    //         const-string v2, "WearableClientImpl.onPostInitHandler: error while adding listener"
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         :cond_3
    //         const-string v0, "WearableClient"
    //         const-string v1, "WearableClientImpl.onPostInitHandler: done"
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/common/internal/e;->a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    //         return-void
    //         :cond_4
    //         :try_start_1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avR:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         const-string v4, "WearableClient"
    //         const/4 v5, 0x2
    //         invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
    //         move-result v4
    //         if-eqz v4, :cond_5
    //         const-string v4, "WearableClient"
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "onPostInitHandler: adding Message listener "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v6
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_5
    //         new-instance v4, Lcom/google/android/gms/wearable/internal/b;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/ax;
    //         invoke-direct {v4, v0}, Lcom/google/android/gms/wearable/internal/b;-><init>(Lcom/google/android/gms/wearable/internal/ax;)V
    //         invoke-interface {v2, v1, v4}, Lcom/google/android/gms/wearable/internal/af;->a(Lcom/google/android/gms/wearable/internal/ad;Lcom/google/android/gms/wearable/internal/b;)V
    //         goto :goto_1
    //         :cond_6
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avS:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_2
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         const-string v4, "WearableClient"
    //         const/4 v5, 0x2
    //         invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
    //         move-result v4
    //         if-eqz v4, :cond_7
    //         const-string v4, "WearableClient"
    //         new-instance v5, Ljava/lang/StringBuilder;
    //         invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v6, "onPostInitHandler: adding Node listener "
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v6
    //         invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v5
    //         invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_7
    //         new-instance v4, Lcom/google/android/gms/wearable/internal/b;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/ax;
    //         invoke-direct {v4, v0}, Lcom/google/android/gms/wearable/internal/b;-><init>(Lcom/google/android/gms/wearable/internal/ax;)V
    //         invoke-interface {v2, v1, v4}, Lcom/google/android/gms/wearable/internal/af;->a(Lcom/google/android/gms/wearable/internal/ad;Lcom/google/android/gms/wearable/internal/b;)V
    //         :try_end_1
    //         .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_2
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: android.net.Uri) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Landroid/net/Uri;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/wearable/DataApi$DataItemResult;",
    //                 ">;",
    //                 "Landroid/net/Uri;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/af;
    //         new-instance v1, Lcom/google/android/gms/wearable/internal/aw$3;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/wearable/internal/aw$3;-><init>(Lcom/google/android/gms/wearable/internal/aw;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1, p2}, Lcom/google/android/gms/wearable/internal/af;->a(Lcom/google/android/gms/wearable/internal/ad;Landroid/net/Uri;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.wearable.Asset) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/Asset;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;",
    //                 ">;",
    //                 "Lcom/google/android/gms/wearable/Asset;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/af;
    //         new-instance v1, Lcom/google/android/gms/wearable/internal/aw$8;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/wearable/internal/aw$8;-><init>(Lcom/google/android/gms/wearable/internal/aw;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1, p2}, Lcom/google/android/gms/wearable/internal/af;->a(Lcom/google/android/gms/wearable/internal/ad;Lcom/google/android/gms/wearable/Asset;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.wearable.DataApi.DataListener) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/DataApi$DataListener;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;",
    //                 "Lcom/google/android/gms/wearable/DataApi$DataListener;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/aw;->avQ:Ljava/util/HashMap;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avQ:Ljava/util/HashMap;
    //         invoke-virtual {v0, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/ae;
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/16 v1, 0xfa2
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         :goto_0
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/internal/aw;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/internal/ae;)V
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.wearable.DataApi.DataListener, p2: Array<android.content.IntentFilter>) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/DataApi$DataListener;[Landroid/content/IntentFilter;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;",
    //                 "Lcom/google/android/gms/wearable/DataApi$DataListener;",
    //                 "[",
    //                 "Landroid/content/IntentFilter;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {p2, p3}, Lcom/google/android/gms/wearable/internal/ax;->a(Lcom/google/android/gms/wearable/DataApi$DataListener;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/ax;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/internal/aw;->avQ:Ljava/util/HashMap;
    //         monitor-enter v2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avQ:Ljava/util/HashMap;
    //         invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/16 v1, 0xfa1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         monitor-exit v2
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avQ:Ljava/util/HashMap;
    //         invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/af;
    //         new-instance v2, Lcom/google/android/gms/wearable/internal/aw$11;
    //         invoke-direct {v2, p0, p2, p1}, Lcom/google/android/gms/wearable/internal/aw$11;-><init>(Lcom/google/android/gms/wearable/internal/aw;Lcom/google/android/gms/wearable/DataApi$DataListener;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         new-instance v3, Lcom/google/android/gms/wearable/internal/b;
    //         invoke-direct {v3, v1}, Lcom/google/android/gms/wearable/internal/b;-><init>(Lcom/google/android/gms/wearable/internal/ax;)V
    //         invoke-interface {v0, v2, v3}, Lcom/google/android/gms/wearable/internal/af;->a(Lcom/google/android/gms/wearable/internal/ad;Lcom/google/android/gms/wearable/internal/b;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.wearable.DataItemAsset) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/DataItemAsset;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;",
    //                 ">;",
    //                 "Lcom/google/android/gms/wearable/DataItemAsset;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-interface {p2}, Lcom/google/android/gms/wearable/DataItemAsset;->getId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/wearable/Asset;->createFromRef(Ljava/lang/String;)Lcom/google/android/gms/wearable/Asset;
    //         move-result-object v0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/internal/aw;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/Asset;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.wearable.MessageApi.MessageListener) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/MessageApi$MessageListener;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;",
    //                 "Lcom/google/android/gms/wearable/MessageApi$MessageListener;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/aw;->avR:Ljava/util/HashMap;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avR:Ljava/util/HashMap;
    //         invoke-virtual {v0, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/ae;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/16 v2, 0xfa2
    //         invoke-direct {v0, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         :goto_0
    //         monitor-exit v1
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/internal/aw;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/internal/ae;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.wearable.MessageApi.MessageListener, p2: Array<android.content.IntentFilter>) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/MessageApi$MessageListener;[Landroid/content/IntentFilter;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;",
    //                 "Lcom/google/android/gms/wearable/MessageApi$MessageListener;",
    //                 "[",
    //                 "Landroid/content/IntentFilter;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {p2, p3}, Lcom/google/android/gms/wearable/internal/ax;->a(Lcom/google/android/gms/wearable/MessageApi$MessageListener;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/ax;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/internal/aw;->avR:Ljava/util/HashMap;
    //         monitor-enter v2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avR:Ljava/util/HashMap;
    //         invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/16 v1, 0xfa1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         monitor-exit v2
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avR:Ljava/util/HashMap;
    //         invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/af;
    //         new-instance v2, Lcom/google/android/gms/wearable/internal/aw$12;
    //         invoke-direct {v2, p0, p2, p1}, Lcom/google/android/gms/wearable/internal/aw$12;-><init>(Lcom/google/android/gms/wearable/internal/aw;Lcom/google/android/gms/wearable/MessageApi$MessageListener;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         new-instance v3, Lcom/google/android/gms/wearable/internal/b;
    //         invoke-direct {v3, v1}, Lcom/google/android/gms/wearable/internal/b;-><init>(Lcom/google/android/gms/wearable/internal/ax;)V
    //         invoke-interface {v0, v2, v3}, Lcom/google/android/gms/wearable/internal/af;->a(Lcom/google/android/gms/wearable/internal/ad;Lcom/google/android/gms/wearable/internal/b;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.wearable.NodeApi.NodeListener) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/NodeApi$NodeListener;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;",
    //                 "Lcom/google/android/gms/wearable/NodeApi$NodeListener;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;,
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-static {p2}, Lcom/google/android/gms/wearable/internal/ax;->a(Lcom/google/android/gms/wearable/NodeApi$NodeListener;)Lcom/google/android/gms/wearable/internal/ax;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/internal/aw;->avS:Ljava/util/HashMap;
    //         monitor-enter v2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avS:Ljava/util/HashMap;
    //         invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/16 v1, 0xfa1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         monitor-exit v2
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avS:Ljava/util/HashMap;
    //         invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         monitor-exit v2
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/af;
    //         new-instance v2, Lcom/google/android/gms/wearable/internal/aw$13;
    //         invoke-direct {v2, p0, p2, p1}, Lcom/google/android/gms/wearable/internal/aw$13;-><init>(Lcom/google/android/gms/wearable/internal/aw;Lcom/google/android/gms/wearable/NodeApi$NodeListener;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         new-instance v3, Lcom/google/android/gms/wearable/internal/b;
    //         invoke-direct {v3, v1}, Lcom/google/android/gms/wearable/internal/b;-><init>(Lcom/google/android/gms/wearable/internal/ax;)V
    //         invoke-interface {v0, v2, v3}, Lcom/google/android/gms/wearable/internal/af;->a(Lcom/google/android/gms/wearable/internal/ad;Lcom/google/android/gms/wearable/internal/b;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v2
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.wearable.PutDataRequest) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/PutDataRequest;)V */ }
    /*
    //         .locals 11
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/wearable/DataApi$DataItemResult;",
    //                 ">;",
    //                 "Lcom/google/android/gms/wearable/PutDataRequest;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/4 v10, 0x1
    //         const/4 v9, 0x0
    //         invoke-virtual {p2}, Lcom/google/android/gms/wearable/PutDataRequest;->getAssets()Ljava/util/Map;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/Asset;
    //         invoke-virtual {v0}, Lcom/google/android/gms/wearable/Asset;->getData()[B
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/wearable/Asset;->getDigest()Ljava/lang/String;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/wearable/Asset;->getFd()Landroid/os/ParcelFileDescriptor;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/wearable/Asset;->getUri()Landroid/net/Uri;
    //         move-result-object v2
    //         if-nez v2, :cond_0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Put for "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {p2}, Lcom/google/android/gms/wearable/PutDataRequest;->getUri()Landroid/net/Uri;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " contains invalid asset: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_1
    //         invoke-virtual {p2}, Lcom/google/android/gms/wearable/PutDataRequest;->getUri()Landroid/net/Uri;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/wearable/PutDataRequest;->k(Landroid/net/Uri;)Lcom/google/android/gms/wearable/PutDataRequest;
    //         move-result-object v2
    //         invoke-virtual {p2}, Lcom/google/android/gms/wearable/PutDataRequest;->getData()[B
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/wearable/PutDataRequest;->setData([B)Lcom/google/android/gms/wearable/PutDataRequest;
    //         new-instance v3, Ljava/util/ArrayList;
    //         invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {p2}, Lcom/google/android/gms/wearable/PutDataRequest;->getAssets()Ljava/util/Map;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :goto_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/Map$Entry;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/wearable/Asset;
    //         invoke-virtual {v1}, Lcom/google/android/gms/wearable/Asset;->getData()[B
    //         move-result-object v5
    //         if-nez v5, :cond_2
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Ljava/lang/String;
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/Asset;
    //         invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/wearable/PutDataRequest;->putAsset(Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)Lcom/google/android/gms/wearable/PutDataRequest;
    //         goto :goto_0
    //         :cond_2
    //         :try_start_0
    //         invoke-static {}, Landroid/os/ParcelFileDescriptor;->createPipe()[Landroid/os/ParcelFileDescriptor;
    //         :try_end_0
    //         .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v5
    //         const-string v6, "WearableClient"
    //         const/4 v7, 0x3
    //         invoke-static {v6, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
    //         move-result v6
    //         if-eqz v6, :cond_3
    //         const-string v6, "WearableClient"
    //         new-instance v7, Ljava/lang/StringBuilder;
    //         invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v8, "processAssets: replacing data with FD in asset: "
    //         invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         const-string v8, " read:"
    //         invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         aget-object v8, v5, v9
    //         invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         const-string v8, " write:"
    //         invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         aget-object v8, v5, v10
    //         invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v7
    //         invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v7
    //         invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_3
    //         invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         aget-object v6, v5, v9
    //         invoke-static {v6}, Lcom/google/android/gms/wearable/Asset;->createFromFd(Landroid/os/ParcelFileDescriptor;)Lcom/google/android/gms/wearable/Asset;
    //         move-result-object v6
    //         invoke-virtual {v2, v0, v6}, Lcom/google/android/gms/wearable/PutDataRequest;->putAsset(Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)Lcom/google/android/gms/wearable/PutDataRequest;
    //         aget-object v0, v5, v10
    //         invoke-virtual {v1}, Lcom/google/android/gms/wearable/Asset;->getData()[B
    //         move-result-object v1
    //         invoke-direct {p0, v0, v1}, Lcom/google/android/gms/wearable/internal/aw;->a(Landroid/os/ParcelFileDescriptor;[B)Ljava/util/concurrent/FutureTask;
    //         move-result-object v0
    //         invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/aw;->aqA:Ljava/util/concurrent/ExecutorService;
    //         invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //         goto/16 :goto_0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Unable to create ParcelFileDescriptor for asset in request: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    //         :cond_4
    //         :try_start_1
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/af;
    //         new-instance v1, Lcom/google/android/gms/wearable/internal/aw$a;
    //         invoke-direct {v1, p1, v3}, Lcom/google/android/gms/wearable/internal/aw$a;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/util/List;)V
    //         invoke-interface {v0, v1, v2}, Lcom/google/android/gms/wearable/internal/af;->a(Lcom/google/android/gms/wearable/internal/ad;Lcom/google/android/gms/wearable/PutDataRequest;)V
    //         :try_end_1
    //         .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_1
    //         return-void
    //         :catch_1
    //         move-exception v0
    //         new-instance v1, Ljava/lang/IllegalStateException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Unable to putDataItem: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.wearable.internal.ae) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/internal/ae;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;",
    //                 "Lcom/google/android/gms/wearable/internal/ae;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/af;
    //         new-instance v1, Lcom/google/android/gms/wearable/internal/aw$14;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/wearable/internal/aw$14;-><init>(Lcom/google/android/gms/wearable/internal/aw;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         new-instance v2, Lcom/google/android/gms/wearable/internal/aq;
    //         invoke-direct {v2, p2}, Lcom/google/android/gms/wearable/internal/aq;-><init>(Lcom/google/android/gms/wearable/internal/ae;)V
    //         invoke-interface {v0, v1, v2}, Lcom/google/android/gms/wearable/internal/af;->a(Lcom/google/android/gms/wearable/internal/ad;Lcom/google/android/gms/wearable/internal/aq;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: String, p2: String, p3: ByteArray) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;[B)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;",
    //                 ">;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 "[B)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/af;
    //         new-instance v1, Lcom/google/android/gms/wearable/internal/aw$7;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/wearable/internal/aw$7;-><init>(Lcom/google/android/gms/wearable/internal/aw;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1, p2, p3, p4}, Lcom/google/android/gms/wearable/internal/af;->a(Lcom/google/android/gms/wearable/internal/ad;Ljava/lang/String;Ljava/lang/String;[B)V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e) { /* TODO(body): (Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const v0, 0x5e2978
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {p1, p2, v0, v1}, Lcom/google/android/gms/common/internal/l;->e(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;)V
    //         return-void
    */

    public fun b(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: android.net.Uri) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Landroid/net/Uri;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/wearable/DataItemBuffer;",
    //                 ">;",
    //                 "Landroid/net/Uri;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/af;
    //         new-instance v1, Lcom/google/android/gms/wearable/internal/aw$5;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/wearable/internal/aw$5;-><init>(Lcom/google/android/gms/wearable/internal/aw;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1, p2}, Lcom/google/android/gms/wearable/internal/af;->b(Lcom/google/android/gms/wearable/internal/ad;Landroid/net/Uri;)V
    //         return-void
    */

    public fun b(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: com.google.android.gms.wearable.NodeApi.NodeListener) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/NodeApi$NodeListener;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;",
    //                 "Lcom/google/android/gms/wearable/NodeApi$NodeListener;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/aw;->avS:Ljava/util/HashMap;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avS:Ljava/util/HashMap;
    //         invoke-virtual {v0, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/ae;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/16 v2, 0xfa2
    //         invoke-direct {v0, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V
    //         :goto_0
    //         monitor-exit v1
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/wearable/internal/aw;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/internal/ae;)V
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    protected fun bU(p0: android.os.IBinder): com.google.android.gms.wearable.internal.af { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/wearable/internal/af;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/wearable/internal/af$a;->bT(Landroid/os/IBinder;)Lcom/google/android/gms/wearable/internal/af;
    //         move-result-object v0
    //         return-object v0
    */

    public fun c(p0: com.google.android.gms.common.api.BaseImplementation.b, p1: android.net.Uri) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;Landroid/net/Uri;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/wearable/DataApi$DeleteDataItemsResult;",
    //                 ">;",
    //                 "Landroid/net/Uri;",
    //                 ")V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/af;
    //         new-instance v1, Lcom/google/android/gms/wearable/internal/aw$6;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/wearable/internal/aw$6;-><init>(Lcom/google/android/gms/wearable/internal/aw;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1, p2}, Lcom/google/android/gms/wearable/internal/af;->c(Lcom/google/android/gms/wearable/internal/ad;Landroid/net/Uri;)V
    //         return-void
    */

    public fun disconnect() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->disconnect()V
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avQ:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avR:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avS:Ljava/util/HashMap;
    //         invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    //         return-void
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.wearable.internal.IWearableService"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.wearable.BIND"
    //         return-object v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/aw;->bU(Landroid/os/IBinder;)Lcom/google/android/gms/wearable/internal/af;
    //         move-result-object v0
    //         return-object v0
    */

    public fun o(p0: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/wearable/DataItemBuffer;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/af;
    //         new-instance v1, Lcom/google/android/gms/wearable/internal/aw$4;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/wearable/internal/aw$4;-><init>(Lcom/google/android/gms/wearable/internal/aw;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/wearable/internal/af;->b(Lcom/google/android/gms/wearable/internal/ad;)V
    //         return-void
    */

    public fun p(p0: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/wearable/NodeApi$GetLocalNodeResult;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/af;
    //         new-instance v1, Lcom/google/android/gms/wearable/internal/aw$9;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/wearable/internal/aw$9;-><init>(Lcom/google/android/gms/wearable/internal/aw;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/wearable/internal/af;->c(Lcom/google/android/gms/wearable/internal/ad;)V
    //         return-void
    */

    public fun q(p0: com.google.android.gms.common.api.BaseImplementation.b) { /* TODO(body): (Lcom/google/android/gms/common/api/BaseImplementation$b;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/BaseImplementation$b",
    //                 "<",
    //                 "Lcom/google/android/gms/wearable/NodeApi$GetConnectedNodesResult;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/internal/aw;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wearable/internal/af;
    //         new-instance v1, Lcom/google/android/gms/wearable/internal/aw$10;
    //         invoke-direct {v1, p0, p1}, Lcom/google/android/gms/wearable/internal/aw$10;-><init>(Lcom/google/android/gms/wearable/internal/aw;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/wearable/internal/af;->d(Lcom/google/android/gms/wearable/internal/ad;)V
    //         return-void
    */

    companion object {
    @JvmStatic fun b(p0: com.google.android.gms.wearable.internal.aw): java.util.HashMap { return TODO("body: (Lcom/google/android/gms/wearable/internal/aw;)Ljava/util/HashMap;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avQ:Ljava/util/HashMap;
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.wearable.internal.aw): java.util.HashMap { return TODO("body: (Lcom/google/android/gms/wearable/internal/aw;)Ljava/util/HashMap;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avR:Ljava/util/HashMap;
    //         return-object v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.wearable.internal.aw): java.util.HashMap { return TODO("body: (Lcom/google/android/gms/wearable/internal/aw;)Ljava/util/HashMap;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aw;->avS:Ljava/util/HashMap;
    //         return-object v0
    */

    }
}
