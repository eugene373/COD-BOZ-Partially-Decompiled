package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 6 methods.

open class nl: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener {
    private var akF: com.google.android.gms.internal.no
    private val akP: com.google.android.gms.internal.ng.a
    private var akQ: Boolean

    public constructor(p0: com.google.android.gms.internal.ng.a)

    public fun R(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/nl;->akQ:Z
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.no) { /* TODO(body): (Lcom/google/android/gms/internal/no;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/nl;->akF:Lcom/google/android/gms/internal/no;
    //         return-void
    */

    public fun onConnected(connectionHint: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nl;->akF:Lcom/google/android/gms/internal/no;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/no;->S(Z)V
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/nl;->akQ:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nl;->akP:Lcom/google/android/gms/internal/ng$a;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nl;->akP:Lcom/google/android/gms/internal/ng$a;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ng$a;->mU()V
    //         :cond_0
    //         iput-boolean v1, p0, Lcom/google/android/gms/internal/nl;->akQ:Z
    //         return-void
    */

    public fun onConnectionFailed(result: com.google.android.gms.common.ConnectionResult) { /* TODO(body): (Lcom/google/android/gms/common/ConnectionResult;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nl;->akF:Lcom/google/android/gms/internal/no;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/no;->S(Z)V
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/nl;->akQ:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nl;->akP:Lcom/google/android/gms/internal/ng$a;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nl;->akP:Lcom/google/android/gms/internal/ng$a;
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->getResolution()Landroid/app/PendingIntent;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ng$a;->b(Landroid/app/PendingIntent;)V
    //         :cond_0
    //         :goto_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/nl;->akQ:Z
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nl;->akP:Lcom/google/android/gms/internal/ng$a;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/ng$a;->mV()V
    //         goto :goto_0
    */

    public fun onDisconnected() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nl;->akF:Lcom/google/android/gms/internal/no;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/no;->S(Z)V
    //         return-void
    */

}
