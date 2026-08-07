package com.google.android.gms.internal

// Auto-emitted from smali.
// 3 fields, 5 methods.

open class ld_Anon2: com.google.android.gms.internal.kk.a() {
    val TZ: com.google.android.gms.internal.ld
    val Ua: String
    val val$name: String

    constructor(p0: com.google.android.gms.internal.ld, p1: String, p2: String)

    protected fun B(p0: com.google.android.gms.common.api.Status): com.google.android.gms.fitness.result.SessionStopResult { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/SessionStopResult;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/fitness/result/SessionStopResult;->I(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/SessionStopResult;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun a(p0: com.google.android.gms.common.api.Api.a) { /* TODO(body): (Lcom/google/android/gms/common/api/Api$a;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         check-cast p1, Lcom/google/android/gms/internal/kk;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ld$2;->a(Lcom/google/android/gms/internal/kk;)V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.internal.kk) { /* TODO(body): (Lcom/google/android/gms/internal/kk;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/internal/ld$b;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ld$b;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/internal/ld$1;)V
    //         invoke-interface {p1}, Lcom/google/android/gms/internal/kk;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {p1}, Lcom/google/android/gms/internal/kk;->jb()Lcom/google/android/gms/internal/kp;
    //         move-result-object v2
    //         new-instance v3, Lcom/google/android/gms/fitness/request/y$a;
    //         invoke-direct {v3}, Lcom/google/android/gms/fitness/request/y$a;-><init>()V
    //         iget-object v4, p0, Lcom/google/android/gms/internal/ld$2;->val$name:Ljava/lang/String;
    //         invoke-virtual {v3, v4}, Lcom/google/android/gms/fitness/request/y$a;->bu(Ljava/lang/String;)Lcom/google/android/gms/fitness/request/y$a;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/google/android/gms/internal/ld$2;->Ua:Ljava/lang/String;
    //         invoke-virtual {v3, v4}, Lcom/google/android/gms/fitness/request/y$a;->bv(Ljava/lang/String;)Lcom/google/android/gms/fitness/request/y$a;
    //         move-result-object v3
    //         invoke-virtual {v3}, Lcom/google/android/gms/fitness/request/y$a;->jB()Lcom/google/android/gms/fitness/request/y;
    //         move-result-object v3
    //         invoke-interface {v2, v3, v0, v1}, Lcom/google/android/gms/internal/kp;->a(Lcom/google/android/gms/fitness/request/y;Lcom/google/android/gms/internal/ks;Ljava/lang/String;)V
    //         return-void
    */

    protected fun c(p0: com.google.android.gms.common.api.Status): com.google.android.gms.common.api.Result { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ld$2;->B(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/SessionStopResult;
    //         move-result-object v0
    //         return-object v0
    */

}
