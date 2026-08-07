package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 5 methods.

open class kz_Anon3: com.google.android.gms.internal.kk.a() {
    val TI: com.google.android.gms.internal.kz
    val TK: com.google.android.gms.fitness.request.DataReadRequest

    constructor(p0: com.google.android.gms.internal.kz, p1: com.google.android.gms.fitness.request.DataReadRequest)

    protected fun a(p0: com.google.android.gms.common.api.Api.a) { /* TODO(body): (Lcom/google/android/gms/common/api/Api$a;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         check-cast p1, Lcom/google/android/gms/internal/kk;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/kz$3;->a(Lcom/google/android/gms/internal/kk;)V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.internal.kk) { /* TODO(body): (Lcom/google/android/gms/internal/kk;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/internal/kz$a;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/kz$a;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/internal/kz$1;)V
    //         invoke-interface {p1}, Lcom/google/android/gms/internal/kk;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {p1}, Lcom/google/android/gms/internal/kk;->jb()Lcom/google/android/gms/internal/kp;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/internal/kz$3;->TK:Lcom/google/android/gms/fitness/request/DataReadRequest;
    //         invoke-interface {v2, v3, v0, v1}, Lcom/google/android/gms/internal/kp;->a(Lcom/google/android/gms/fitness/request/DataReadRequest;Lcom/google/android/gms/internal/km;Ljava/lang/String;)V
    //         return-void
    */

    protected fun c(p0: com.google.android.gms.common.api.Status): com.google.android.gms.common.api.Result { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/kz$3;->y(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DataReadResult;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun y(p0: com.google.android.gms.common.api.Status): com.google.android.gms.fitness.result.DataReadResult { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/DataReadResult;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/kz$3;->TK:Lcom/google/android/gms/fitness/request/DataReadRequest;
    //         invoke-static {p1, v0}, Lcom/google/android/gms/fitness/result/DataReadResult;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/fitness/request/DataReadRequest;)Lcom/google/android/gms/fitness/result/DataReadResult;
    //         move-result-object v0
    //         return-object v0
    */

}
