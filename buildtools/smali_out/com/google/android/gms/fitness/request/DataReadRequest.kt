package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 16 fields, 27 methods.

open class DataReadRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val KS: Long
    private val SB: java.util.List
    private val SE: Int
    private val Sr: Long
    private val Uk: java.util.List
    private val Uo: java.util.List
    private val Up: java.util.List
    private val Uq: Long
    private val Ur: com.google.android.gms.fitness.data.DataSource
    private val Us: Int
    private val Ut: Boolean
    private val Uu: Boolean
    private val Uv: Boolean

    constructor(versionCode: Int, startTimeMillis: java.util.List, endTimeMillis: java.util.List, bucketType: Long, bucketDurationMillis: Long, activityDataSource: java.util.List, limit: java.util.List, disableTransformations: Int, flushBeforeRead: Long, serverQueriesEnabled: com.google.android.gms.fitness.data.DataSource, p10: Int, p11: Boolean, p12: Boolean, p13: Boolean)

    private constructor(builder: com.google.android.gms.fitness.request.DataReadRequest.Builder)

    constructor(x0: com.google.android.gms.fitness.request.DataReadRequest.Builder, x1: com.google.android.gms.fitness.request.DataReadRequest.1)

    private fun a(p0: com.google.android.gms.fitness.request.DataReadRequest): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest;)Z") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->SB:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->SB:Ljava/util/List;
    //         invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uk:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uk:Ljava/util/List;
    //         invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->KS:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->KS:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Sr:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->Sr:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->SE:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->SE:I
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Up:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->Up:Ljava/util/List;
    //         invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uo:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uo:Ljava/util/List;
    //         invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Ur:Lcom/google/android/gms/fitness/data/DataSource;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->Ur:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uq:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uq:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uv:Z
    //         iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uv:Z
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

    public fun equals(that: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p0, p1, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/request/DataReadRequest;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/request/DataReadRequest;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataReadRequest;->a(Lcom/google/android/gms/fitness/request/DataReadRequest;)Z
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

    public fun getActivityDataSource(): com.google.android.gms.fitness.data.DataSource { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Ur:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object v0
    */

    public fun getAggregatedDataSources(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataSource;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Up:Ljava/util/List;
    //         return-object v0
    */

    public fun getAggregatedDataTypes(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataType;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uo:Ljava/util/List;
    //         return-object v0
    */

    public fun getBucketDuration(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uq:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getBucketType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->SE:I
    //         return v0
    */

    public fun getDataSources(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataSource;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uk:Ljava/util/List;
    //         return-object v0
    */

    public fun getDataTypes(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataType;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->SB:Ljava/util/List;
    //         return-object v0
    */

    public fun getEndTime(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Sr:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getLimit(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Us:I
    //         return v0
    */

    public fun getStartTime(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->KS:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->SE:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->KS:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Sr:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun iD(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->KS:J
    //         return-wide v0
    */

    public fun iE(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Sr:J
    //         return-wide v0
    */

    public fun jk(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Ut:Z
    //         return v0
    */

    public fun jl(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uv:Z
    //         return v0
    */

    public fun jm(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uu:Z
    //         return v0
    */

    public fun jn(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uq:J
    //         return-wide v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v0, "DataReadRequest{"
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->SB:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->SB:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataType;->iQ()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v3, " "
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uk:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uk:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource;->toDebugString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v3, " "
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_1
    //         :cond_1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->SE:I
    //         if-eqz v0, :cond_3
    //         const-string v0, "bucket by "
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->SE:I
    //         invoke-static {v2}, Lcom/google/android/gms/fitness/data/Bucket;->cy(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uq:J
    //         const-wide/16 v4, 0x0
    //         cmp-long v0, v2, v4
    //         if-lez v0, :cond_2
    //         const-string v0, " >"
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uq:J
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v2, "ms"
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_2
    //         const-string v0, ": "
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uo:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uo:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_4
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataType;->iQ()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v3, " "
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_2
    //         :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Up:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Up:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_3
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource;->toDebugString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v3, " "
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         goto :goto_3
    //         :cond_5
    //         const-string v0, "(%tF %tT - %tF %tT)"
    //         const/4 v2, 0x4
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->KS:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x1
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->KS:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x2
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Sr:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         const/4 v3, 0x3
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Sr:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Ur:Lcom/google/android/gms/fitness/data/DataSource;
    //         if-eqz v0, :cond_6
    //         const-string v0, "activities: "
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Ur:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-virtual {v2}, Lcom/google/android/gms/fitness/data/DataSource;->toDebugString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_6
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest;->Uv:Z
    //         if-eqz v0, :cond_7
    //         const-string v0, " +server"
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         :cond_7
    //         const-string v0, "}"
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/g;->a(Lcom/google/android/gms/fitness/request/DataReadRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val NO_LIMIT: Int = 0
    }
}
