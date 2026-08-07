package com.google.android.gms.common.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

class e_g: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    private val LJ: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener

    public constructor(p0: com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)

    public fun equals(other: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         instance-of v0, p1, Lcom/google/android/gms/common/internal/e$g;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e$g;->LJ:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    //         check-cast p1, Lcom/google/android/gms/common/internal/e$g;
    //         .end local p1    # "other":Ljava/lang/Object;
    //         iget-object v1, p1, Lcom/google/android/gms/common/internal/e$g;->LJ:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    //         invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "other":Ljava/lang/Object;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e$g;->LJ:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    //         invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun onConnectionFailed(result: com.google.android.gms.common.ConnectionResult) { /* TODO(body): (Lcom/google/android/gms/common/ConnectionResult;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/internal/e$g;->LJ:Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    //         return-void
    */

}
