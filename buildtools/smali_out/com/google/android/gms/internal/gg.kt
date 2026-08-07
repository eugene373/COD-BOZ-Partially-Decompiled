package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 6 methods.

open class gg {
    private val mk: Runnable
    private var wf: Thread

    public constructor()

    public fun cancel() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/gg;->onStop()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gg;->wf:Ljava/lang/Thread;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gg;->wf:Ljava/lang/Thread;
    //         invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    //         :cond_0
    //         return-void
    */

    public fun co()

    public fun onStop()

    public fun start() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/gg;->mk:Ljava/lang/Runnable;
    //         invoke-static {v0}, Lcom/google/android/gms/internal/gi;->a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //         return-void
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.gg, p1: Thread): Thread { return TODO("body: (Lcom/google/android/gms/internal/gg;Ljava/lang/Thread;)Ljava/lang/Thread;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/internal/gg;->wf:Ljava/lang/Thread;
    //         return-object p1
    */

    }
}
