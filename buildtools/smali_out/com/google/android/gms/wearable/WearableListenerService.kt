package com.google.android.gms.wearable

// Auto-emitted from smali.
// 7 fields, 15 methods.

open class WearableListenerService: android.app.Service(), com.google.android.gms.wearable.DataApi.DataListener, com.google.android.gms.wearable.MessageApi.MessageListener, com.google.android.gms.wearable.NodeApi.NodeListener {
    private var BZ: String
    private var LZ: android.os.IBinder
    private var NX: Int
    private var avc: android.os.Handler
    private var avd: Object
    private var ave: Boolean

    public constructor()

    private fun bc(p0: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         const-string v2, "com.google.android.gms"
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/WearableListenerService;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;
    //         move-result-object v3
    //         if-eqz v3, :cond_0
    //         move v0, v1
    //         :goto_0
    //         array-length v4, v3
    //         if-ge v0, v4, :cond_0
    //         aget-object v4, v3, v0
    //         invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_1
    //         const/4 v1, 0x1
    //         :cond_0
    //         return v1
    //         :cond_1
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    */

    private fun pU() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/SecurityException;
    //             }
    //         .end annotation
    //         invoke-static {}, Landroid/os/Binder;->getCallingUid()I
    //         move-result v0
    //         iget v1, p0, Lcom/google/android/gms/wearable/WearableListenerService;->NX:I
    //         if-ne v0, v1, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/WearableListenerService;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         const-string v2, "com.google.android.gms"
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->b(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/wearable/WearableListenerService;->bc(I)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         iput v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->NX:I
    //         goto :goto_0
    //         :cond_1
    //         new-instance v0, Ljava/lang/SecurityException;
    //         const-string v1, "Caller is not GooglePlayServices"
    //         invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun onBind(intent: android.content.Intent): android.os.IBinder { return TODO("body: (Landroid/content/Intent;)Landroid/os/IBinder;") }
    /*
    //         .locals 2
    //         const-string v0, "com.google.android.gms.wearable.BIND_LISTENER"
    //         invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->LZ:Landroid/os/IBinder;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun onCreate() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         invoke-super {p0}, Landroid/app/Service;->onCreate()V
    //         const-string v0, "WearableLS"
    //         const/4 v1, 0x3
    //         invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "WearableLS"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onCreate: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/WearableListenerService;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/wearable/WearableListenerService;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->BZ:Ljava/lang/String;
    //         new-instance v0, Landroid/os/HandlerThread;
    //         const-string v1, "WearableListenerService"
    //         invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
    //         new-instance v1, Landroid/os/Handler;
    //         invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
    //         iput-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService;->avc:Landroid/os/Handler;
    //         new-instance v0, Lcom/google/android/gms/wearable/WearableListenerService$a;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/wearable/WearableListenerService$a;-><init>(Lcom/google/android/gms/wearable/WearableListenerService;Lcom/google/android/gms/wearable/WearableListenerService$1;)V
    //         iput-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->LZ:Landroid/os/IBinder;
    //         return-void
    */

    public fun onDataChanged(dataEvents: com.google.android.gms.wearable.DataEventBuffer) { /* TODO(body): (Lcom/google/android/gms/wearable/DataEventBuffer;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService;->avd:Ljava/lang/Object;
    //         monitor-enter v1
    //         const/4 v0, 0x1
    //         :try_start_0
    //         iput-boolean v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->ave:Z
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->avc:Landroid/os/Handler;
    //         invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/os/Looper;->quit()V
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         invoke-super {p0}, Landroid/app/Service;->onDestroy()V
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         :try_start_1
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun onMessageReceived(messageEvent: com.google.android.gms.wearable.MessageEvent) { /* TODO(body): (Lcom/google/android/gms/wearable/MessageEvent;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onPeerConnected(peer: com.google.android.gms.wearable.Node) { /* TODO(body): (Lcom/google/android/gms/wearable/Node;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onPeerDisconnected(peer: com.google.android.gms.wearable.Node) { /* TODO(body): (Lcom/google/android/gms/wearable/Node;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    companion object {
    @JvmField public val BIND_LISTENER_INTENT_ACTION: String = "com.google.android.gms.wearable.BIND_LISTENER"

    @JvmStatic fun a(p0: com.google.android.gms.wearable.WearableListenerService): String { return TODO("body: (Lcom/google/android/gms/wearable/WearableListenerService;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->BZ:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.wearable.WearableListenerService) { /* TODO(body): (Lcom/google/android/gms/wearable/WearableListenerService;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/SecurityException;
    //             }
    //         .end annotation
    //         invoke-direct {p0}, Lcom/google/android/gms/wearable/WearableListenerService;->pU()V
    //         return-void
    */

    @JvmStatic fun c(p0: com.google.android.gms.wearable.WearableListenerService): Object { return TODO("body: (Lcom/google/android/gms/wearable/WearableListenerService;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->avd:Ljava/lang/Object;
    //         return-object v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.wearable.WearableListenerService): Boolean { return TODO("body: (Lcom/google/android/gms/wearable/WearableListenerService;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->ave:Z
    //         return v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.wearable.WearableListenerService): android.os.Handler { return TODO("body: (Lcom/google/android/gms/wearable/WearableListenerService;)Landroid/os/Handler;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService;->avc:Landroid/os/Handler;
    //         return-object v0
    */

    }
}
