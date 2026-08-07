package com.google.android.gms.internal

// Auto-emitted from smali.
// 5 fields, 4 methods.

open class ge {
    private val mw: Object
    private val vA: String
    private val vx: com.google.android.gms.internal.gb
    private var wc: Int
    private var wd: Int

    constructor(p0: com.google.android.gms.internal.gb, p1: String)

    public constructor(p0: String)

    public fun d(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ge;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iput p1, p0, Lcom/google/android/gms/internal/ge;->wc:I
    //         iput p2, p0, Lcom/google/android/gms/internal/ge;->wd:I
    //         iget-object v0, p0, Lcom/google/android/gms/internal/ge;->vx:Lcom/google/android/gms/internal/gb;
    //         iget-object v2, p0, Lcom/google/android/gms/internal/ge;->vA:Ljava/lang/String;
    //         invoke-virtual {v0, v2, p0}, Lcom/google/android/gms/internal/gb;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ge;)V
    //         monitor-exit v1
    //         return-void
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun toBundle(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/google/android/gms/internal/ge;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v2, "pmnli"
    //         iget v3, p0, Lcom/google/android/gms/internal/ge;->wc:I
    //         invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v2, "pmnll"
    //         iget v3, p0, Lcom/google/android/gms/internal/ge;->wd:I
    //         invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
