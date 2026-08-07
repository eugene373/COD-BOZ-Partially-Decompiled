package com.google.android.gms.analytics

// Auto-emitted from smali.
// 1 fields, 9 methods.

open class k: com.google.android.gms.analytics.Logger {
    private var xW: Int

    constructor()

    private fun ae(p0: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/Thread;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v1, ": "
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun error(exception: Exception) { /* TODO(body): (Ljava/lang/Exception;)V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/analytics/k;->xW:I
    //         const/4 v1, 0x3
    //         if-gt v0, v1, :cond_0
    //         const-string v0, "GAV4"
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         :cond_0
    //         return-void
    */

    public fun error(msg: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/analytics/k;->xW:I
    //         const/4 v1, 0x3
    //         if-gt v0, v1, :cond_0
    //         const-string v0, "GAV4"
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/k;->ae(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         return-void
    */

    public fun getLogLevel(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/analytics/k;->xW:I
    //         return v0
    */

    public fun info(msg: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/analytics/k;->xW:I
    //         const/4 v1, 0x1
    //         if-gt v0, v1, :cond_0
    //         const-string v0, "GAV4"
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/k;->ae(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         return-void
    */

    public fun setLogLevel(level: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/analytics/k;->xW:I
    //         return-void
    */

    public fun verbose(msg: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/analytics/k;->xW:I
    //         if-gtz v0, :cond_0
    //         const-string v0, "GAV4"
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/k;->ae(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         return-void
    */

    public fun warn(msg: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Lcom/google/android/gms/analytics/k;->xW:I
    //         const/4 v1, 0x2
    //         if-gt v0, v1, :cond_0
    //         const-string v0, "GAV4"
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/analytics/k;->ae(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_0
    //         return-void
    */

}
