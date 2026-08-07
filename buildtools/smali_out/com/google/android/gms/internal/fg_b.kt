package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 6 methods.

class fg_b: com.google.android.gms.internal.fg(), com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener {
    private val mw: Object
    private val tu: com.google.android.gms.internal.ff.a
    private val tv: com.google.android.gms.internal.fh

    public constructor(p0: android.content.Context, p1: com.google.android.gms.internal.fi, p2: com.google.android.gms.internal.ff.a)

    public fun cC() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fg$b;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fg$b;->tv:Lcom/google/android/gms/internal/fh;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/fh;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fg$b;->tv:Lcom/google/android/gms/internal/fh;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/fh;->isConnecting()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fg$b;->tv:Lcom/google/android/gms/internal/fh;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/fh;->disconnect()V
    //         :cond_1
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun cD(): com.google.android.gms.internal.fm { return TODO("body: ()Lcom/google/android/gms/internal/fm;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/fg$b;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fg$b;->tv:Lcom/google/android/gms/internal/fh;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/fh;->cE()Lcom/google/android/gms/internal/fm;
    //         :try_end_0
    //         .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         move-result-object v0
    //         :try_start_1
    //         monitor-exit v1
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const/4 v0, 0x0
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         throw v0
    */

    public fun onConnected(connectionHint: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/fg$b;->start()V
    //         return-void
    */

    public fun onConnectionFailed(result: com.google.android.gms.common.ConnectionResult) { /* TODO(body): (Lcom/google/android/gms/common/ConnectionResult;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/fg$b;->tu:Lcom/google/android/gms/internal/ff$a;
    //         new-instance v1, Lcom/google/android/gms/internal/fk;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/internal/fk;-><init>(I)V
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ff$a;->a(Lcom/google/android/gms/internal/fk;)V
    //         return-void
    */

    public fun onDisconnected() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const-string v0, "Disconnected from remote ad request service."
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gs;->S(Ljava/lang/String;)V
    //         return-void
    */

}
