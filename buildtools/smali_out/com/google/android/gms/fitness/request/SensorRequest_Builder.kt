package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 8 fields, 16 methods.

open class SensorRequest_Builder {
    private var Sp: com.google.android.gms.fitness.data.DataType
    private var Sq: com.google.android.gms.fitness.data.DataSource
    private var Tt: Long
    private var Tu: Int
    private var UD: Long
    private var UE: Long
    private var UJ: Long
    private var UK: Boolean

    public constructor()

    public fun build(): com.google.android.gms.fitness.request.SensorRequest { return TODO("body: ()Lcom/google/android/gms/fitness/request/SensorRequest;") }
    /*
    //         .locals 4
    //         const/4 v2, 0x1
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         if-eqz v0, :cond_3
    //         :cond_0
    //         move v0, v2
    //         :goto_0
    //         const-string v3, "Must call setDataSource() or setDataType()"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-virtual {v3}, Lcom/google/android/gms/fitness/data/DataSource;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v3
    //         invoke-virtual {v0, v3}, Lcom/google/android/gms/fitness/data/DataType;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         :cond_1
    //         move v1, v2
    //         :cond_2
    //         const-string v0, "Specified data type is incompatible with specified data source"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         new-instance v0, Lcom/google/android/gms/fitness/request/SensorRequest;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/SensorRequest;-><init>(Lcom/google/android/gms/fitness/request/SensorRequest$Builder;Lcom/google/android/gms/fitness/request/SensorRequest$1;)V
    //         return-object v0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    public fun setAccuracyMode(accuracyMode: Int): com.google.android.gms.fitness.request.SensorRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/fitness/request/SensorRequest$Builder;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/fitness/request/SensorRequest;->da(I)I
    //         move-result v0
    //         iput v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Tu:I
    //         return-object p0
    */

    public fun setDataSource(dataSource: com.google.android.gms.fitness.data.DataSource): com.google.android.gms.fitness.request.SensorRequest.Builder { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/SensorRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object p0
    */

    public fun setDataType(dataType: com.google.android.gms.fitness.data.DataType): com.google.android.gms.fitness.request.SensorRequest.Builder { return TODO("body: (Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/SensorRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object p0
    */

    public fun setFastestRate(fastestInterval: Int, unit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.request.SensorRequest.Builder { return TODO("body: (ILjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/SensorRequest$Builder;") }
    /*
    //         .locals 3
    //         const/4 v1, 0x1
    //         if-ltz p1, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v2, "Cannot use a negative interval"
    //         invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iput-boolean v1, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->UK:Z
    //         int-to-long v0, p1
    //         invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->UE:J
    //         return-object p0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setMaxDeliveryLatency(interval: Int, unit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.request.SensorRequest.Builder { return TODO("body: (ILjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/SensorRequest$Builder;") }
    /*
    //         .locals 2
    //         if-ltz p1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Cannot use a negative delivery interval"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         int-to-long v0, p1
    //         invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->UD:J
    //         return-object p0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setSamplingRate(interval: Long, unit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.request.SensorRequest.Builder { return TODO("body: (JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/SensorRequest$Builder;") }
    /*
    //         .locals 5
    //         const-wide/16 v0, 0x0
    //         cmp-long v0, p1, v0
    //         if-ltz v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Cannot use a negative sampling interval"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Tt:J
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->UK:Z
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Tt:J
    //         const-wide/16 v2, 0x2
    //         div-long/2addr v0, v2
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->UE:J
    //         :cond_0
    //         return-object p0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setTimeout(timeout: Long, timeUnit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.request.SensorRequest.Builder { return TODO("body: (JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/SensorRequest$Builder;") }
    /*
    //         .locals 7
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         const-wide/16 v4, 0x0
    //         cmp-long v0, p1, v4
    //         if-lez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Invalid time out value specified: %d"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         if-eqz p3, :cond_1
    //         :goto_1
    //         const-string v0, "Invalid time unit specified"
    //         invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->UJ:J
    //         return-object p0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v1, v2
    //         goto :goto_1
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.fitness.request.SensorRequest.Builder): com.google.android.gms.fitness.data.DataSource { return TODO("body: (Lcom/google/android/gms/fitness/request/SensorRequest$Builder;)Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.fitness.request.SensorRequest.Builder): com.google.android.gms.fitness.data.DataType { return TODO("body: (Lcom/google/android/gms/fitness/request/SensorRequest$Builder;)Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.fitness.request.SensorRequest.Builder): Long { return TODO("body: (Lcom/google/android/gms/fitness/request/SensorRequest$Builder;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Tt:J
    //         return-wide v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.fitness.request.SensorRequest.Builder): Long { return TODO("body: (Lcom/google/android/gms/fitness/request/SensorRequest$Builder;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->UE:J
    //         return-wide v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.fitness.request.SensorRequest.Builder): Long { return TODO("body: (Lcom/google/android/gms/fitness/request/SensorRequest$Builder;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->UD:J
    //         return-wide v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.fitness.request.SensorRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/fitness/request/SensorRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->Tu:I
    //         return v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.fitness.request.SensorRequest.Builder): Long { return TODO("body: (Lcom/google/android/gms/fitness/request/SensorRequest$Builder;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest$Builder;->UJ:J
    //         return-wide v0
    */

    }
}
