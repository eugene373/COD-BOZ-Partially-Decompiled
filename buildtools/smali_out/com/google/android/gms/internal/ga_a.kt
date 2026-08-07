package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 5 methods.

class ga_a {
    private var vH: Long
    private var vI: Long

    public constructor()

    public fun cR(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/ga$a;->vI:J
    //         return-wide v0
    */

    public fun cS() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/ga$a;->vI:J
    //         return-void
    */

    public fun cT() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/ga$a;->vH:J
    //         return-void
    */

    public fun toBundle(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "topen"
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ga$a;->vH:J
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         const-string v1, "tclose"
    //         iget-wide v2, p0, Lcom/google/android/gms/internal/ga$a;->vI:J
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         return-object v0
    */

}
