package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 11 fields, 17 methods.

open class SensorRequest {
    private val Sp: com.google.android.gms.fitness.data.DataType
    private val Sq: com.google.android.gms.fitness.data.DataSource
    private val Tt: Long
    private val Tu: Int
    private val UD: Long
    private val UE: Long
    private val UI: com.google.android.gms.location.LocationRequest
    private val UJ: Long

    private constructor(dataSource: com.google.android.gms.fitness.data.DataSource, locationRequest: com.google.android.gms.location.LocationRequest)

    private constructor(builder: com.google.android.gms.fitness.request.SensorRequest.Builder)

    constructor(x0: com.google.android.gms.fitness.request.SensorRequest.Builder, x1: com.google.android.gms.fitness.request.SensorRequest.1)

    private fun a(p0: com.google.android.gms.fitness.request.SensorRequest): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/request/SensorRequest;)Z") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/SensorRequest;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/SensorRequest;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Tt:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SensorRequest;->Tt:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->UE:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SensorRequest;->UE:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->UD:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SensorRequest;->UD:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Tu:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/request/SensorRequest;->Tu:I
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->UI:Lcom/google/android/gms/location/LocationRequest;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/SensorRequest;->UI:Lcom/google/android/gms/location/LocationRequest;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->UJ:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SensorRequest;->UJ:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun equals(that: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p0, p1, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/request/SensorRequest;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/request/SensorRequest;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/SensorRequest;->a(Lcom/google/android/gms/fitness/request/SensorRequest;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getAccuracyMode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Tu:I
    //         return v0
    */

    public fun getDataSource(): com.google.android.gms.fitness.data.DataSource { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object v0
    */

    public fun getDataType(): com.google.android.gms.fitness.data.DataType { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object v0
    */

    public fun getFastestRate(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->UE:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getMaxDeliveryLatency(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->UD:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getSamplingRate(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Tt:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/16 v0, 0x8
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Tt:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->UE:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->UD:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         iget v2, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Tu:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x6
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->UI:Lcom/google/android/gms/location/LocationRequest;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x7
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->UJ:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun jx(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->UJ:J
    //         return-wide v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataSource"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataType"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "samplingRateMicros"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->Tt:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "deliveryLatencyMicros"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->UD:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "timeOutMicros"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SensorRequest;->UJ:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmField public val ACCURACY_MODE_DEFAULT: Int = 0x2
    @JvmField public val ACCURACY_MODE_HIGH: Int = 0x3
    @JvmField public val ACCURACY_MODE_LOW: Int = 0x1

    private @JvmStatic fun a(p0: com.google.android.gms.location.LocationRequest): Int { return TODO("body: (Lcom/google/android/gms/location/LocationRequest;)I") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/google/android/gms/location/LocationRequest;->getPriority()I
    //         move-result v0
    //         sparse-switch v0, :sswitch_data_0
    //         const/4 v0, 0x2
    //         :goto_0
    //         return v0
    //         :sswitch_0
    //         const/4 v0, 0x3
    //         goto :goto_0
    //         :sswitch_1
    //         const/4 v0, 0x1
    //         goto :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x64 -> :sswitch_0
    //             0x68 -> :sswitch_1
    //         .end sparse-switch
    */

    public @JvmStatic fun da(p0: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 0
    //         packed-switch p0, :pswitch_data_0
    //         :pswitch_0
    //         const/4 p0, 0x2
    //         :pswitch_1
    //         return p0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    public @JvmStatic fun fromLocationRequest(dataSource: com.google.android.gms.fitness.data.DataSource, locationRequest: com.google.android.gms.location.LocationRequest): com.google.android.gms.fitness.request.SensorRequest { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/fitness/request/SensorRequest;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/fitness/request/SensorRequest;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/fitness/request/SensorRequest;-><init>(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/location/LocationRequest;)V
    //         return-object v0
    */

    }
}
