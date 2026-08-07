package com.google.android.gms.analytics

// Auto-emitted from smali.
// 1 fields, 3 methods.

open class r_b: java.util.TimerTask() {
    val yF: com.google.android.gms.analytics.r

    private constructor(p0: com.google.android.gms.analytics.r)

    constructor(p0: com.google.android.gms.analytics.r, p1: com.google.android.gms.analytics.r.1)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r$b;->yF:Lcom/google/android/gms/analytics/r;
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/r;->b(Lcom/google/android/gms/analytics/r;)Lcom/google/android/gms/analytics/r$a;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/analytics/r$a;->yI:Lcom/google/android/gms/analytics/r$a;
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r$b;->yF:Lcom/google/android/gms/analytics/r;
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/r;->e(Lcom/google/android/gms/analytics/r;)Ljava/util/Queue;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r$b;->yF:Lcom/google/android/gms/analytics/r;
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/r;->f(Lcom/google/android/gms/analytics/r;)J
    //         move-result-wide v0
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/r$b;->yF:Lcom/google/android/gms/analytics/r;
    //         invoke-static {v2}, Lcom/google/android/gms/analytics/r;->g(Lcom/google/android/gms/analytics/r;)J
    //         move-result-wide v2
    //         add-long/2addr v0, v2
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/r$b;->yF:Lcom/google/android/gms/analytics/r;
    //         invoke-static {v2}, Lcom/google/android/gms/analytics/r;->h(Lcom/google/android/gms/analytics/r;)Lcom/google/android/gms/internal/ju;
    //         move-result-object v2
    //         invoke-interface {v2}, Lcom/google/android/gms/internal/ju;->elapsedRealtime()J
    //         move-result-wide v2
    //         cmp-long v0, v0, v2
    //         if-gez v0, :cond_0
    //         const-string v0, "Disconnecting due to inactivity"
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->V(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r$b;->yF:Lcom/google/android/gms/analytics/r;
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/r;->i(Lcom/google/android/gms/analytics/r;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/r$b;->yF:Lcom/google/android/gms/analytics/r;
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/r;->j(Lcom/google/android/gms/analytics/r;)Ljava/util/Timer;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/analytics/r$b;
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/r$b;->yF:Lcom/google/android/gms/analytics/r;
    //         invoke-direct {v1, v2}, Lcom/google/android/gms/analytics/r$b;-><init>(Lcom/google/android/gms/analytics/r;)V
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/r$b;->yF:Lcom/google/android/gms/analytics/r;
    //         invoke-static {v2}, Lcom/google/android/gms/analytics/r;->g(Lcom/google/android/gms/analytics/r;)J
    //         move-result-wide v2
    //         invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    //         goto :goto_0
    */

}
