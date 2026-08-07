package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 4 fields, 5 methods.

open class ag_Anon1: com.google.android.gms.wearable.internal.d() {
    val CY: ByteArray
    val avD: String
    val avE: String
    val avF: com.google.android.gms.wearable.internal.ag

    constructor(p0: com.google.android.gms.wearable.internal.ag, p1: String, p2: String, p3: ByteArray)

    protected fun a(p0: com.google.android.gms.common.api.Api.a) { /* TODO(body): (Lcom/google/android/gms/common/api/Api$a;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         check-cast p1, Lcom/google/android/gms/wearable/internal/aw;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ag$1;->a(Lcom/google/android/gms/wearable/internal/aw;)V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.wearable.internal.aw) { /* TODO(body): (Lcom/google/android/gms/wearable/internal/aw;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/wearable/internal/ag$1;->avD:Ljava/lang/String;
    //         iget-object v1, p0, Lcom/google/android/gms/wearable/internal/ag$1;->avE:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/google/android/gms/wearable/internal/ag$1;->CY:[B
    //         invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/wearable/internal/aw;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;Ljava/lang/String;[B)V
    //         return-void
    */

    protected fun aJ(p0: com.google.android.gms.common.api.Status): com.google.android.gms.wearable.MessageApi.SendMessageResult { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/ag$a;
    //         const/4 v1, -0x1
    //         invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/ag$a;-><init>(Lcom/google/android/gms/common/api/Status;I)V
    //         return-object v0
    */

    protected fun c(p0: com.google.android.gms.common.api.Status): com.google.android.gms.common.api.Result { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/ag$1;->aJ(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/MessageApi$SendMessageResult;
    //         move-result-object v0
    //         return-object v0
    */

}
