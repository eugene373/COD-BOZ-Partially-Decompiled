package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 4 methods.

class do_a {
    private val mk: Runnable
    private var sc: Boolean

    public constructor(p0: com.google.android.gms.internal.do)

    public fun cancel() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/do$a;->sc:Z
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/do$a;->mk:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    //         return-void
    */

    public fun cj() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         sget-object v0, Lcom/google/android/gms/internal/gr;->wC:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/do$a;->mk:Ljava/lang/Runnable;
    //         const-wide/16 v2, 0xfa
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    //         return-void
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.internal.do.a): Boolean { return TODO("body: (Lcom/google/android/gms/internal/do$a;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/do$a;->sc:Z
    //         return v0
    */

    }
}
