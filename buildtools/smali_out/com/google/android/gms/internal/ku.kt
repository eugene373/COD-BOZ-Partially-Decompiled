package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 8 methods.

open class ku: com.google.android.gms.common.api.PendingResult {
    private val Tx: com.google.android.gms.common.api.Result

    constructor(p0: com.google.android.gms.common.api.Result)

    public fun a(p0: com.google.android.gms.common.api.PendingResult.a) { /* TODO(body): (Lcom/google/android/gms/common/api/PendingResult$a;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ku;->Tx:Lcom/google/android/gms/common/api/Result;
    //         invoke-interface {v0}, Lcom/google/android/gms/common/api/Result;->getStatus()Lcom/google/android/gms/common/api/Status;
    //         move-result-object v0
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/PendingResult$a;->n(Lcom/google/android/gms/common/api/Status;)V
    //         return-void
    */

    public fun await(): com.google.android.gms.common.api.Result { return TODO("body: ()Lcom/google/android/gms/common/api/Result;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()TT;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ku;->Tx:Lcom/google/android/gms/common/api/Result;
    //         return-object v0
    */

    public fun await(time: Long, units: java.util.concurrent.TimeUnit): com.google.android.gms.common.api.Result { return TODO("body: (JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/common/api/Result;") }
    /*
    //         .locals 1
    //         .local p0, "this":Lcom/google/android/gms/internal/ku;, "Lcom/google/android/gms/internal/ku<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ku;->Tx:Lcom/google/android/gms/common/api/Result;
    //         return-object v0
    */

    public fun cancel() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun isCanceled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun setResultCallback(p0: com.google.android.gms.common.api.ResultCallback) { /* TODO(body): (Lcom/google/android/gms/common/api/ResultCallback;)V */ }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/ResultCallback",
    //                 "<TT;>;)V"
    //             }
    //         .end annotation
    //         .local p0, "this":Lcom/google/android/gms/internal/ku;, "Lcom/google/android/gms/internal/ku<TT;>;"
    //         .local p1, "callback":Lcom/google/android/gms/common/api/ResultCallback;, "Lcom/google/android/gms/common/api/ResultCallback<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ku;->Tx:Lcom/google/android/gms/common/api/Result;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/ResultCallback;->onResult(Lcom/google/android/gms/common/api/Result;)V
    //         return-void
    */

    public fun setResultCallback(time: com.google.android.gms.common.api.ResultCallback, units: Long, p2: java.util.concurrent.TimeUnit) { /* TODO(body): (Lcom/google/android/gms/common/api/ResultCallback;JLjava/util/concurrent/TimeUnit;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Lcom/google/android/gms/internal/ku;, "Lcom/google/android/gms/internal/ku<TT;>;"
    //         .local p1, "callback":Lcom/google/android/gms/common/api/ResultCallback;, "Lcom/google/android/gms/common/api/ResultCallback<TT;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ku;->Tx:Lcom/google/android/gms/common/api/Result;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/ResultCallback;->onResult(Lcom/google/android/gms/common/api/Result;)V
    //         return-void
    */

}
