package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 2 fields, 5 methods.

open class f_Anon4: com.google.android.gms.wearable.internal.d() {
    val aky: android.net.Uri
    val avn: com.google.android.gms.wearable.internal.f

    constructor(p0: com.google.android.gms.wearable.internal.f, p1: android.net.Uri)

    protected fun a(p0: com.google.android.gms.common.api.Api.a) { /* TODO(body): (Lcom/google/android/gms/common/api/Api$a;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         check-cast p1, Lcom/google/android/gms/wearable/internal/aw;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/f$4;->a(Lcom/google/android/gms/wearable/internal/aw;)V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.wearable.internal.aw) { /* TODO(body): (Lcom/google/android/gms/wearable/internal/aw;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/f$4;->aky:Landroid/net/Uri;
    //         invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/wearable/internal/aw;->b(Lcom/google/android/gms/common/api/BaseImplementation$b;Landroid/net/Uri;)V
    //         return-void
    */

    protected fun aG(p0: com.google.android.gms.common.api.Status): com.google.android.gms.wearable.DataItemBuffer { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/DataItemBuffer;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/wearable/DataItemBuffer;
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I
    //         move-result v1
    //         invoke-static {v1}, Lcom/google/android/gms/common/data/DataHolder;->as(I)Lcom/google/android/gms/common/data/DataHolder;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/wearable/DataItemBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V
    //         return-object v0
    */

    protected fun c(p0: com.google.android.gms.common.api.Status): com.google.android.gms.common.api.Result { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/f$4;->aG(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/DataItemBuffer;
    //         move-result-object v0
    //         return-object v0
    */

}
