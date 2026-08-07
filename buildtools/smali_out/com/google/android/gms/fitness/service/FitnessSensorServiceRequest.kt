package com.google.android.gms.fitness.service

// Auto-emitted from smali.
// 7 fields, 16 methods.

open class FitnessSensorServiceRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Sq: com.google.android.gms.fitness.data.DataSource
    private val UA: com.google.android.gms.fitness.data.k
    private val Vc: Long
    private val Vd: Long

    constructor(versionCode: Int, dataSource: com.google.android.gms.fitness.data.DataSource, listenerBinder: android.os.IBinder, samplingRateMicros: Long, batchIntervalMicros: Long)

    private fun a(p0: com.google.android.gms.fitness.service.FitnessSensorServiceRequest): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;)Z") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Vc:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Vc:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Vd:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Vd:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(that: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p0, p1, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->a(Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;)Z
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

    public fun getBatchInterval(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Vd:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getDataSource(): com.google.android.gms.fitness.data.DataSource { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object v0
    */

    public fun getDispatcher(): com.google.android.gms.fitness.service.SensorEventDispatcher { return TODO("body: ()Lcom/google/android/gms/fitness/service/SensorEventDispatcher;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/fitness/service/b;
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->UA:Lcom/google/android/gms/fitness/data/k;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/fitness/service/b;-><init>(Lcom/google/android/gms/fitness/data/k;)V
    //         return-object v0
    */

    public fun getSamplingRate(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 4
    //         const-wide/16 v0, -0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Vc:J
    //         cmp-long v2, v2, v0
    //         if-nez v2, :cond_0
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Vc:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         goto :goto_0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Vc:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Vd:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun iX(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Vc:J
    //         return-wide v0
    */

    public fun jN(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Vd:J
    //         return-wide v0
    */

    fun jw(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->UA:Lcom/google/android/gms/fitness/data/k;
    //         invoke-interface {v0}, Lcom/google/android/gms/fitness/data/k;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "FitnessSensorServiceRequest{%s}"
    //         const/4 v1, 0x1
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/service/a;->a(Lcom/google/android/gms/fitness/service/FitnessSensorServiceRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val UNSPECIFIED: Int = 0
    }
}
