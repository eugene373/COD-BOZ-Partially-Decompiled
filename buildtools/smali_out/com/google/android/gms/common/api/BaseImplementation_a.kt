package com.google.android.gms.common.api

// Auto-emitted from smali.
// 2 fields, 9 methods.

open class BaseImplementation_a: com.google.android.gms.common.api.BaseImplementation.AbstractPendingResult(), com.google.android.gms.common.api.b.c {
    private val Ip: com.google.android.gms.common.api.Api.c
    private var Iz: com.google.android.gms.common.api.b.a

    protected constructor(p0: com.google.android.gms.common.api.Api.c)

    private fun a(p0: android.os.RemoteException) { /* TODO(body): (Landroid/os/RemoteException;)V */ }
    /*
    //         .locals 4
    //         new-instance v0, Lcom/google/android/gms/common/api/Status;
    //         const/16 v1, 0x8
    //         invoke-virtual {p1}, Landroid/os/RemoteException;->getLocalizedMessage()Ljava/lang/String;
    //         move-result-object v2
    //         const/4 v3, 0x0
    //         invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$a;->m(Lcom/google/android/gms/common/api/Status;)V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.common.api.Api.a)

    public fun a(p0: com.google.android.gms.common.api.b.a) { /* TODO(body): (Lcom/google/android/gms/common/api/b$a;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/common/api/BaseImplementation$a;->Iz:Lcom/google/android/gms/common/api/b$a;
    //         return-void
    */

    public fun b(p0: com.google.android.gms.common.api.Api.a) { /* TODO(body): (Lcom/google/android/gms/common/api/Api$a;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(TA;)V"
    //             }
    //         .end annotation
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/DeadObjectException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$a;->mHandler:Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;
    //         invoke-interface {p1}, Lcom/google/android/gms/common/api/Api$a;->getLooper()Landroid/os/Looper;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;-><init>(Landroid/os/Looper;)V
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$a;->a(Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;)V
    //         :cond_0
    //         :try_start_0
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/BaseImplementation$a;->a(Lcom/google/android/gms/common/api/Api$a;)V
    //         :try_end_0
    //         .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$a;->a(Landroid/os/RemoteException;)V
    //         throw v0
    //         :catch_1
    //         move-exception v0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$a;->a(Landroid/os/RemoteException;)V
    //         goto :goto_0
    */

    public fun ge(): com.google.android.gms.common.api.Api.c { return TODO("body: ()Lcom/google/android/gms/common/api/Api$c;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Lcom/google/android/gms/common/api/Api$c",
    //                 "<TA;>;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$a;->Ip:Lcom/google/android/gms/common/api/Api$c;
    //         return-object v0
    */

    protected fun gg() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Lcom/google/android/gms/common/api/BaseImplementation$AbstractPendingResult;->gg()V
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$a;->Iz:Lcom/google/android/gms/common/api/b$a;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$a;->Iz:Lcom/google/android/gms/common/api/b$a;
    //         invoke-interface {v0, p0}, Lcom/google/android/gms/common/api/b$a;->b(Lcom/google/android/gms/common/api/b$c;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/common/api/BaseImplementation$a;->Iz:Lcom/google/android/gms/common/api/b$a;
    //         :cond_0
    //         return-void
    */

    public fun gj(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun m(p0: com.google.android.gms.common.api.Status) { /* TODO(body): (Lcom/google/android/gms/common/api/Status;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Failed result must not be success"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/BaseImplementation$a;->c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/BaseImplementation$a;->b(Lcom/google/android/gms/common/api/Result;)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
