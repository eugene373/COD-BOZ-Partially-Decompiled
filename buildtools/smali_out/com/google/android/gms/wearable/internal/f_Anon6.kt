package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 2 fields, 5 methods.

open class f_Anon6: com.google.android.gms.wearable.internal.d() {
    val avn: com.google.android.gms.wearable.internal.f
    val avo: com.google.android.gms.wearable.Asset

    constructor(p0: com.google.android.gms.wearable.internal.f, p1: com.google.android.gms.wearable.Asset)

    protected fun a(p0: com.google.android.gms.common.api.Api.a) { /* TODO(body): (Lcom/google/android/gms/common/api/Api$a;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         check-cast p1, Lcom/google/android/gms/wearable/internal/aw;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/f$6;->a(Lcom/google/android/gms/wearable/internal/aw;)V
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
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/f$6;->avo:Lcom/google/android/gms/wearable/Asset;
    //         invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/wearable/internal/aw;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/Asset;)V
    //         return-void
    */

    protected fun aI(p0: com.google.android.gms.common.api.Status): com.google.android.gms.wearable.DataApi.GetFdForAssetResult { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/f$c;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/f$c;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/os/ParcelFileDescriptor;)V
    //         return-object v0
    */

    protected fun c(p0: com.google.android.gms.common.api.Status): com.google.android.gms.common.api.Result { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/f$6;->aI(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;
    //         move-result-object v0
    //         return-object v0
    */

}
