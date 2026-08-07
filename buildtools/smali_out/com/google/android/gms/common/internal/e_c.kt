package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 1 fields, 4 methods.

class e_c: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks {
    private val LH: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks

    public constructor(p0: com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks)

    public fun equals(other: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         instance-of v0, p1, Lcom/google/android/gms/common/internal/e$c;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e$c;->LH:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    //         check-cast p1, Lcom/google/android/gms/common/internal/e$c;
    //         .end local p1    # "other":Ljava/lang/Object;
    //         iget-object v1, p1, Lcom/google/android/gms/common/internal/e$c;->LH:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    //         invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "other":Ljava/lang/Object;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e$c;->LH:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    //         invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun onConnected(connectionHint: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e$c;->LH:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;->onConnected(Landroid/os/Bundle;)V
    //         return-void
    */

    public fun onConnectionSuspended(cause: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e$c;->LH:Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;->onDisconnected()V
    //         return-void
    */

}
