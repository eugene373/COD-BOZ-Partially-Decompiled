package com.google.android.gms.plus

// Auto-emitted from smali.
// 2 fields, 3 methods.

open class PlusClient_Anon7: com.google.android.gms.common.api.BaseImplementation.b {
    val alf: com.google.android.gms.plus.PlusClient
    val alh: com.google.android.gms.plus.PlusClient.OnAccessRevokedListener

    constructor(p0: com.google.android.gms.plus.PlusClient, p1: com.google.android.gms.plus.PlusClient.OnAccessRevokedListener)

    public fun aA(p0: com.google.android.gms.common.api.Status) { /* TODO(body): (Lcom/google/android/gms/common/api/Status;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/plus/PlusClient$7;->alh:Lcom/google/android/gms/plus/PlusClient$OnAccessRevokedListener;
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatus()Lcom/google/android/gms/common/api/Status;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->gt()Lcom/google/android/gms/common/ConnectionResult;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Lcom/google/android/gms/plus/PlusClient$OnAccessRevokedListener;->onAccessRevoked(Lcom/google/android/gms/common/ConnectionResult;)V
    //         return-void
    */

    public fun b(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/plus/PlusClient$7;->aA(Lcom/google/android/gms/common/api/Status;)V
    //         return-void
    */

}
