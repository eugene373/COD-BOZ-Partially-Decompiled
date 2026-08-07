package com.google.android.gms.common.api

// Auto-emitted from smali.
// 2 fields, 4 methods.

class c {
    private val Js: com.google.android.gms.common.api.c.a
    private var mListener: Object

    constructor(p0: android.os.Looper, p1: Object)

    public fun a(p0: com.google.android.gms.common.api.c.b) { /* TODO(body): (Lcom/google/android/gms/common/api/c$b;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/c$b",
    //                 "<T",
    //                 "L;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const-string v0, "Notifier must not be null"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/c;->Js:Lcom/google/android/gms/common/api/c$a;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/common/api/c$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/common/api/c;->Js:Lcom/google/android/gms/common/api/c$a;
    //         invoke-virtual {v1, v0}, Lcom/google/android/gms/common/api/c$a;->sendMessage(Landroid/os/Message;)Z
    //         return-void
    */

    fun b(p0: com.google.android.gms.common.api.c.b) { /* TODO(body): (Lcom/google/android/gms/common/api/c$b;)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/c$b",
    //                 "<T",
    //                 "L;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/common/api/c;->mListener:Ljava/lang/Object;
    //         if-nez v0, :cond_0
    //         invoke-interface {p1}, Lcom/google/android/gms/common/api/c$b;->gr()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_0
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/c$b;->d(Ljava/lang/Object;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "ListenerHolder"
    //         const-string v2, "Notifying listener failed"
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         invoke-interface {p1}, Lcom/google/android/gms/common/api/c$b;->gr()V
    //         goto :goto_0
    */

    public fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/common/api/c;->mListener:Ljava/lang/Object;
    //         return-void
    */

}
