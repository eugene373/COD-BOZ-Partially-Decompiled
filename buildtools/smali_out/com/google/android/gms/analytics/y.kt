package com.google.android.gms.analytics

// Auto-emitted from smali.
// 6 fields, 3 methods.

open class y: com.google.android.gms.analytics.ac {
    private val AN: Long
    private val AO: Int
    private var AP: Double
    private var AQ: Long
    private val AR: Object
    private val AS: String

    public constructor(p0: Int, p1: Long, p2: String)

    public constructor(p0: String)

    public fun eJ(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 12
    //         const-wide/high16 v10, 0x3ff0000000000000L    # 1.0
    //         iget-object v1, p0, Lcom/google/android/gms/analytics/y;->AR:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         iget-wide v4, p0, Lcom/google/android/gms/analytics/y;->AP:D
    //         iget v0, p0, Lcom/google/android/gms/analytics/y;->AO:I
    //         int-to-double v6, v0
    //         cmpg-double v0, v4, v6
    //         if-gez v0, :cond_0
    //         iget-wide v4, p0, Lcom/google/android/gms/analytics/y;->AQ:J
    //         sub-long v4, v2, v4
    //         long-to-double v4, v4
    //         iget-wide v6, p0, Lcom/google/android/gms/analytics/y;->AN:J
    //         long-to-double v6, v6
    //         div-double/2addr v4, v6
    //         const-wide/16 v6, 0x0
    //         cmpl-double v0, v4, v6
    //         if-lez v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/analytics/y;->AO:I
    //         int-to-double v6, v0
    //         iget-wide v8, p0, Lcom/google/android/gms/analytics/y;->AP:D
    //         add-double/2addr v4, v8
    //         invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(DD)D
    //         move-result-wide v4
    //         iput-wide v4, p0, Lcom/google/android/gms/analytics/y;->AP:D
    //         :cond_0
    //         iput-wide v2, p0, Lcom/google/android/gms/analytics/y;->AQ:J
    //         iget-wide v2, p0, Lcom/google/android/gms/analytics/y;->AP:D
    //         cmpl-double v0, v2, v10
    //         if-ltz v0, :cond_1
    //         iget-wide v2, p0, Lcom/google/android/gms/analytics/y;->AP:D
    //         sub-double/2addr v2, v10
    //         iput-wide v2, p0, Lcom/google/android/gms/analytics/y;->AP:D
    //         const/4 v0, 0x1
    //         monitor-exit v1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Excessive "
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/y;->AS:Ljava/lang/String;
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, " detected; call ignored."
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/analytics/z;->W(Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

}
