package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 9 fields, 32 methods.

class DataPoint: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var SG: Long
    private var SH: Long
    private val SI: Array<com.google.android.gms.fitness.data.Value>
    private var SJ: com.google.android.gms.fitness.data.DataSource
    private var SK: Long
    private var SL: Long
    private val Sq: com.google.android.gms.fitness.data.DataSource

    constructor(versionCode: Int, dataSource: com.google.android.gms.fitness.data.DataSource, timestampNanos: Long, startTimeNanos: Long, values: Array<com.google.android.gms.fitness.data.Value>, originalDataSource: com.google.android.gms.fitness.data.DataSource, rawTimestamp: Long, insertionTimeMillis: Long)

    private constructor(dataSource: com.google.android.gms.fitness.data.DataSource)

    constructor(rawDataPoint: java.util.List, p1: com.google.android.gms.fitness.data.RawDataPoint)

    private fun a(p0: com.google.android.gms.fitness.data.DataPoint): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/DataPoint;)Z") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/DataPoint;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SG:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/DataPoint;->SG:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SH:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/DataPoint;->SH:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SI:[Lcom/google/android/gms/fitness/data/Value;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/DataPoint;->SI:[Lcom/google/android/gms/fitness/data/Value;
    //         invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SJ:Lcom/google/android/gms/fitness/data/DataSource;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/DataPoint;->SJ:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun cA(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 8
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/data/DataPoint;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataType;->getFields()Ljava/util/List;
    //         move-result-object v3
    //         invoke-interface {v3}, Ljava/util/List;->size()I
    //         move-result v4
    //         if-ne p1, v4, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v5, "Attempting to insert %s values, but needed %s: %s"
    //         const/4 v6, 0x3
    //         new-array v6, v6, [Ljava/lang/Object;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v7
    //         aput-object v7, v6, v2
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v6, v1
    //         const/4 v1, 0x2
    //         aput-object v3, v6, v1
    //         invoke-static {v0, v5, v6}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         return-void
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    */

    private fun iF(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/data/DataPoint;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v0
    //         sget-object v1, Lcom/google/android/gms/fitness/data/DataType;->TYPE_LOCATION_SAMPLE:Lcom/google/android/gms/fitness/data/DataType;
    //         if-ne v0, v1, :cond_0
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

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p0, p1, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/DataPoint;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/DataPoint;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/DataPoint;->a(Lcom/google/android/gms/fitness/data/DataPoint;)Z
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

    public fun getDataSource(): com.google.android.gms.fitness.data.DataSource { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object v0
    */

    public fun getDataType(): com.google.android.gms.fitness.data.DataType { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getEndTime(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SG:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getOriginalDataSource(): com.google.android.gms.fitness.data.DataSource { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SJ:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object v0
    */

    public fun getStartTime(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SH:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getTimestamp(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SG:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getTimestampNanos(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SG:J
    //         return-wide v0
    */

    public fun getValue(field: com.google.android.gms.fitness.data.Field): com.google.android.gms.fitness.data.Value { return TODO("body: (Lcom/google/android/gms/fitness/data/Field;)Lcom/google/android/gms/fitness/data/Value;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/data/DataPoint;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/data/DataType;->indexOf(Lcom/google/android/gms/fitness/data/Field;)I
    //         move-result v0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SI:[Lcom/google/android/gms/fitness/data/Value;
    //         aget-object v0, v1, v0
    //         return-object v0
    */

    public fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataPoint;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SG:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SH:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun iG(): Array<com.google.android.gms.fitness.data.Value> { return TODO("body: ()[Lcom/google/android/gms/fitness/data/Value;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SI:[Lcom/google/android/gms/fitness/data/Value;
    //         return-object v0
    */

    public fun iH(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SK:J
    //         return-wide v0
    */

    public fun iI(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SL:J
    //         return-wide v0
    */

    public fun iJ(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SH:J
    //         return-wide v0
    */

    public fun setFloatValues(values: FloatArray): com.google.android.gms.fitness.data.DataPoint { return TODO("body: ([F)Lcom/google/android/gms/fitness/data/DataPoint;") }
    /*
    //         .locals 3
    //         array-length v0, p1
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/fitness/data/DataPoint;->cA(I)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         array-length v1, p1
    //         if-ge v0, v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SI:[Lcom/google/android/gms/fitness/data/Value;
    //         aget-object v1, v1, v0
    //         aget v2, p1, v0
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/fitness/data/Value;->setFloat(F)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object p0
    */

    public fun setIntValues(values: IntArray): com.google.android.gms.fitness.data.DataPoint { return TODO("body: ([I)Lcom/google/android/gms/fitness/data/DataPoint;") }
    /*
    //         .locals 3
    //         array-length v0, p1
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/fitness/data/DataPoint;->cA(I)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         array-length v1, p1
    //         if-ge v0, v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SI:[Lcom/google/android/gms/fitness/data/Value;
    //         aget-object v1, v1, v0
    //         aget v2, p1, v0
    //         invoke-virtual {v1, v2}, Lcom/google/android/gms/fitness/data/Value;->setInt(I)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object p0
    */

    public fun setTimeInterval(startTime: Long, endTime: Long, timeUnit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.data.DataPoint { return TODO("body: (JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint;") }
    /*
    //         .locals 3
    //         invoke-virtual {p5, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SH:J
    //         invoke-virtual {p5, p3, p4}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SG:J
    //         return-object p0
    */

    public fun setTimestamp(timestamp: Long, timeUnit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.data.DataPoint { return TODO("body: (JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/DataPoint;") }
    /*
    //         .locals 5
    //         invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SG:J
    //         invoke-direct {p0}, Lcom/google/android/gms/fitness/data/DataPoint;->iF()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p3}, Lcom/google/android/gms/internal/kj;->a(Ljava/util/concurrent/TimeUnit;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "Fitness"
    //         const-string v1, "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds."
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SG:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;
    //         sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/kj;->a(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SG:J
    //         :cond_0
    //         return-object p0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         const-string v0, "DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}"
    //         const/4 v1, 0x7
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SI:[Lcom/google/android/gms/fitness/data/Value;
    //         invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SH:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SG:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x3
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SK:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x4
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SL:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x5
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/DataPoint;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x6
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/DataPoint;->SJ:Lcom/google/android/gms/fitness/data/DataSource;
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/e;->a(Lcom/google/android/gms/fitness/data/DataPoint;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    private @JvmStatic fun a(p0: java.util.List, p1: Int): com.google.android.gms.fitness.data.DataSource { return TODO("body: (Ljava/util/List;I)Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataSource;",
    //                 ">;I)",
    //                 "Lcom/google/android/gms/fitness/data/DataSource;"
    //             }
    //         .end annotation
    //         if-ltz p1, :cond_0
    //         invoke-interface {p0}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-ge p1, v0, :cond_0
    //         invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun create(dataSource: com.google.android.gms.fitness.data.DataSource): com.google.android.gms.fitness.data.DataPoint { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/fitness/data/DataPoint;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/fitness/data/DataPoint;-><init>(Lcom/google/android/gms/fitness/data/DataSource;)V
    //         return-object v0
    */

    public @JvmStatic fun extract(intent: android.content.Intent): com.google.android.gms.fitness.data.DataPoint { return TODO("body: (Landroid/content/Intent;)Lcom/google/android/gms/fitness/data/DataPoint;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "com.google.android.gms.fitness.EXTRA_DATA_POINT"
    //         sget-object v1, Lcom/google/android/gms/fitness/data/DataPoint;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-static {p0, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataPoint;
    //         goto :goto_0
    */

    }
}
