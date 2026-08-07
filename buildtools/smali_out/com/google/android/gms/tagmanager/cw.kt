package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 5 fields, 3 methods.

open class cw: com.google.android.gms.tagmanager.cg {
    private val AN: Long
    private val AO: Int
    private var AP: Double
    private val AR: Object
    private var arp: Long

    public constructor()

    public constructor(p0: Int, p1: Long)

    public fun eJ(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 12
    //         const-wide/high16 v10, 0x3ff0000000000000L    # 1.0
    //         iget-object v1, p0, Lcom/google/android/gms/tagmanager/cw;->AR:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         iget-wide v4, p0, Lcom/google/android/gms/tagmanager/cw;->AP:D
    //         iget v0, p0, Lcom/google/android/gms/tagmanager/cw;->AO:I
    //         int-to-double v6, v0
    //         cmpg-double v0, v4, v6
    //         if-gez v0, :cond_0
    //         iget-wide v4, p0, Lcom/google/android/gms/tagmanager/cw;->arp:J
    //         sub-long v4, v2, v4
    //         long-to-double v4, v4
    //         iget-wide v6, p0, Lcom/google/android/gms/tagmanager/cw;->AN:J
    //         long-to-double v6, v6
    //         div-double/2addr v4, v6
    //         const-wide/16 v6, 0x0
    //         cmpl-double v0, v4, v6
    //         if-lez v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/tagmanager/cw;->AO:I
    //         int-to-double v6, v0
    //         iget-wide v8, p0, Lcom/google/android/gms/tagmanager/cw;->AP:D
    //         add-double/2addr v4, v8
    //         invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(DD)D
    //         move-result-wide v4
    //         iput-wide v4, p0, Lcom/google/android/gms/tagmanager/cw;->AP:D
    //         :cond_0
    //         iput-wide v2, p0, Lcom/google/android/gms/tagmanager/cw;->arp:J
    //         iget-wide v2, p0, Lcom/google/android/gms/tagmanager/cw;->AP:D
    //         cmpl-double v0, v2, v10
    //         if-ltz v0, :cond_1
    //         iget-wide v2, p0, Lcom/google/android/gms/tagmanager/cw;->AP:D
    //         sub-double/2addr v2, v10
    //         iput-wide v2, p0, Lcom/google/android/gms/tagmanager/cw;->AP:D
    //         const/4 v0, 0x1
    //         monitor-exit v1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const-string v0, "No more tokens available."
    //         invoke-static {v0}, Lcom/google/android/gms/tagmanager/bh;->W(Ljava/lang/String;)V
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
