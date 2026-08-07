package com.google.android.gms.internal

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class ab_a {
    private val mHandler: android.os.Handler

    public constructor(p0: android.os.Handler)

    public fun postDelayed(runnable: Runnable, timeFromNowInMillis: Long): Boolean { return TODO("body: (Ljava/lang/Runnable;J)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ab$a;->mHandler:Landroid/os/Handler;
    //         invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    //         move-result v0
    //         return v0
    */

    public fun removeCallbacks(runnable: Runnable) { /* TODO(body): (Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ab$a;->mHandler:Landroid/os/Handler;
    //         invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    //         return-void
    */

}
