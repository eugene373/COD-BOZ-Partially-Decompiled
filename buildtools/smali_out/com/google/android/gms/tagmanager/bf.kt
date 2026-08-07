package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 8 fields, 2 methods.

open class bf: com.google.android.gms.tagmanager.cg {
    private val AN: Long
    private val AO: Int
    private var AP: Double
    private var AQ: Long
    private val AR: Object
    private val AS: String
    private val apL: Long
    private val yD: com.google.android.gms.internal.ju

    public constructor(p0: Int, p1: Long, p2: Long, p3: String, p4: com.google.android.gms.internal.ju)

    public fun eJ(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 12
    //         const/4 v0, 0x0
    //         const-wide/high16 v10, 0x3ff0000000000000L    # 1.0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/bf;->AR:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v2, p0, Lcom/google/android/gms/tagmanager/bf;->yD:Lcom/google/android/gms/internal/ju;
    //         invoke-interface {v2}, Lcom/google/android/gms/internal/ju;->currentTimeMillis()J
    //         move-result-wide v2
    //         iget-wide v4, p0, Lcom/google/android/gms/tagmanager/bf;->AQ:J
    //         sub-long v4, v2, v4
    //         iget-wide v6, p0, Lcom/google/android/gms/tagmanager/bf;->apL:J
    //         cmp-long v4, v4, v6
    //         if-gez v4, :cond_0
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Excessive "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/tagmanager/bf;->AS:Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " detected; call ignored."
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         monitor-exit v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-wide v4, p0, Lcom/google/android/gms/tagmanager/bf;->AP:D
    //         iget v6, p0, Lcom/google/android/gms/tagmanager/bf;->AO:I
    //         int-to-double v6, v6
    //         cmpg-double v4, v4, v6
    //         if-gez v4, :cond_1
    //         iget-wide v4, p0, Lcom/google/android/gms/tagmanager/bf;->AQ:J
    //         sub-long v4, v2, v4
    //         long-to-double v4, v4
    //         iget-wide v6, p0, Lcom/google/android/gms/tagmanager/bf;->AN:J
    //         long-to-double v6, v6
    //         div-double/2addr v4, v6
    //         const-wide/16 v6, 0x0
    //         cmpl-double v6, v4, v6
    //         if-lez v6, :cond_1
    //         iget v6, p0, Lcom/google/android/gms/tagmanager/bf;->AO:I
    //         int-to-double v6, v6
    //         iget-wide v8, p0, Lcom/google/android/gms/tagmanager/bf;->AP:D
    //         add-double/2addr v4, v8
    //         invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(DD)D
    //         move-result-wide v4
    //         iput-wide v4, p0, Lcom/google/android/gms/tagmanager/bf;->AP:D
    //         :cond_1
    //         iput-wide v2, p0, Lcom/google/android/gms/tagmanager/bf;->AQ:J
    //         iget-wide v2, p0, Lcom/google/android/gms/tagmanager/bf;->AP:D
    //         cmpl-double v2, v2, v10
    //         if-ltz v2, :cond_2
    //         iget-wide v2, p0, Lcom/google/android/gms/tagmanager/bf;->AP:D
    //         sub-double/2addr v2, v10
    //         iput-wide v2, p0, Lcom/google/android/gms/tagmanager/bf;->AP:D
    //         const/4 v0, 0x1
    //         monitor-exit v1
    //         goto :goto_0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    //         :cond_2
    //         :try_start_1
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Excessive "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/tagmanager/bf;->AS:Ljava/lang/String;
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " detected; call ignored."
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
    //         monitor-exit v1
    //         :try_end_1
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_0
    //         goto :goto_0
    */

}
