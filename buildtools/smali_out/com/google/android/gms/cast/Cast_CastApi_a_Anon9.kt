package com.google.android.gms.cast

// Auto-emitted from smali.
// 2 fields, 3 methods.

open class Cast_CastApi_a_Anon9: com.google.android.gms.cast.Cast.b() {
    val EG: com.google.android.gms.cast.Cast.CastApi.a
    val EJ: String

    constructor(p0: com.google.android.gms.cast.Cast.CastApi.a, p1: String)

    protected fun a(p0: com.google.android.gms.common.api.Api.a) { /* TODO(body): (Lcom/google/android/gms/common/api/Api$a;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         check-cast p1, Lcom/google/android/gms/internal/ij;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/Cast$CastApi$a$9;->a(Lcom/google/android/gms/internal/ij;)V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.internal.ij) { /* TODO(body): (Lcom/google/android/gms/internal/ij;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const/16 v1, 0x7d1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/Cast$CastApi$a$9;->EJ:Ljava/lang/String;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "IllegalArgument: sessionId cannot be null or empty"
    //         invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/cast/Cast$CastApi$a$9;->e(ILjava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/Cast$CastApi$a$9;->EJ:Ljava/lang/String;
    //         invoke-virtual {p1, v0, p0}, Lcom/google/android/gms/internal/ij;->a(Ljava/lang/String;Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    //         :try_end_0
    //         .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {p0, v1}, Lcom/google/android/gms/cast/Cast$CastApi$a$9;->V(I)V
    //         goto :goto_0
    */

}
