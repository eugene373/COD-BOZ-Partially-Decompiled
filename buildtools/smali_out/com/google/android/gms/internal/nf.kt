package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 9 methods.

open class nf: com.google.android.gms.internal.ng.a {
    private val akD: com.google.android.gms.internal.ng
    private var akE: Boolean

    public constructor(p0: android.content.Context, p1: Int)

    public constructor(p0: android.content.Context, p1: Int, p2: String)

    public constructor(p0: android.content.Context, p1: Int, p2: String, p3: String, p4: Boolean)

    private fun mT() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/nf;->akE:Z
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "Cannot reuse one-time logger after sending."
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public fun a(p0: String, p1: ByteArray, p2: Array<String>) { /* TODO(body): (Ljava/lang/String;[B[Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/nf;->mT()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nf;->akD:Lcom/google/android/gms/internal/ng;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ng;->b(Ljava/lang/String;[B[Ljava/lang/String;)V
    //         return-void
    */

    public fun b(p0: android.app.PendingIntent) { /* TODO(body): (Landroid/app/PendingIntent;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "OneTimePlayLogger"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "logger connection failed: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    public fun mU() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nf;->akD:Lcom/google/android/gms/internal/ng;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ng;->stop()V
    //         return-void
    */

    public fun mV() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "OneTimePlayLogger"
    //         const-string v1, "logger connection failed"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         return-void
    */

    public fun send() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/nf;->mT()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/nf;->akD:Lcom/google/android/gms/internal/ng;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ng;->start()V
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Lcom/google/android/gms/internal/nf;->akE:Z
    //         return-void
    */

}
