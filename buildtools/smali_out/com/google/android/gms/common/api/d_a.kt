package com.google.android.gms.common.api

// Auto-emitted from smali.
// 3 fields, 9 methods.

open class d_a: android.support.v4.content.Loader(), com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    public val JG: com.google.android.gms.common.api.GoogleApiClient
    private var JH: Boolean
    private var JI: com.google.android.gms.common.ConnectionResult

    public constructor(p0: android.content.Context, p1: com.google.android.gms.common.api.GoogleApiClient)

    private fun a(p0: com.google.android.gms.common.ConnectionResult) { /* TODO(body): (Lcom/google/android/gms/common/ConnectionResult;)V */ }
    /*
    //         .locals 1
    //         iput-object p1, p0, Lcom/google/android/gms/common/api/d$a;->JI:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/d$a;->isStarted()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/d$a;->isAbandoned()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/d$a;->deliverResult(Ljava/lang/Object;)V
    //         :cond_0
    //         return-void
    */

    public fun gv() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/api/d$a;->JH:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/api/d$a;->JH:Z
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/d$a;->isStarted()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/common/api/d$a;->isAbandoned()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$a;->JG:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V
    //         :cond_0
    //         return-void
    */

    public fun onConnected(connectionHint: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/api/d$a;->JH:Z
    //         sget-object v0, Lcom/google/android/gms/common/ConnectionResult;->HE:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/d$a;->a(Lcom/google/android/gms/common/ConnectionResult;)V
    //         return-void
    */

    public fun onConnectionFailed(result: com.google.android.gms.common.ConnectionResult) { /* TODO(body): (Lcom/google/android/gms/common/ConnectionResult;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/api/d$a;->JH:Z
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/d$a;->a(Lcom/google/android/gms/common/ConnectionResult;)V
    //         return-void
    */

    public fun onConnectionSuspended(cause: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    protected fun onReset() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/common/api/d$a;->JI:Lcom/google/android/gms/common/ConnectionResult;
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/common/api/d$a;->JH:Z
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$a;->JG:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$a;->JG:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->unregisterConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$a;->JG:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V
    //         return-void
    */

    protected fun onStartLoading() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/support/v4/content/Loader;->onStartLoading()V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$a;->JG:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$a;->JG:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->registerConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$a;->JI:Lcom/google/android/gms/common/ConnectionResult;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$a;->JI:Lcom/google/android/gms/common/ConnectionResult;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/d$a;->deliverResult(Ljava/lang/Object;)V
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$a;->JG:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$a;->JG:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnecting()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-boolean v0, p0, Lcom/google/android/gms/common/api/d$a;->JH:Z
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$a;->JG:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V
    //         :cond_1
    //         return-void
    */

    protected fun onStopLoading() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/d$a;->JG:Lcom/google/android/gms/common/api/GoogleApiClient;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V
    //         return-void
    */

}
