package com.google.android.gms.appstate

// Auto-emitted from smali.
// 1 fields, 5 methods.

class AppStateManager_Anon5: com.google.android.gms.appstate.AppStateManager.b() {
    val CX: Int

    constructor(p0: Int)

    protected fun a(p0: com.google.android.gms.common.api.Api.a) { /* TODO(body): (Lcom/google/android/gms/common/api/Api$a;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         check-cast p1, Lcom/google/android/gms/internal/ib;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/appstate/AppStateManager$5;->a(Lcom/google/android/gms/internal/ib;)V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.internal.ib) { /* TODO(body): (Lcom/google/android/gms/internal/ib;)V */ }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/appstate/AppStateManager$5;->CX:I
    //         invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/internal/ib;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;I)V
    //         return-void
    */

    public fun c(p0: com.google.android.gms.common.api.Status): com.google.android.gms.common.api.Result { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/appstate/AppStateManager$5;->g(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/appstate/AppStateManager$StateDeletedResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun g(p0: com.google.android.gms.common.api.Status): com.google.android.gms.appstate.AppStateManager.StateDeletedResult { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/appstate/AppStateManager$StateDeletedResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/appstate/AppStateManager$5$1;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/appstate/AppStateManager$5$1;-><init>(Lcom/google/android/gms/appstate/AppStateManager$5;Lcom/google/android/gms/common/api/Status;)V
    //         return-object v0
    */

}
