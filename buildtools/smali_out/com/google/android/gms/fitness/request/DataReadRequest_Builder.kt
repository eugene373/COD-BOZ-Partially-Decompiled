package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 13 fields, 28 methods.

open class DataReadRequest_Builder {
    private var KS: Long
    private var SB: java.util.List
    private var SE: Int
    private var Sr: Long
    private var Uk: java.util.List
    private var Uo: java.util.List
    private var Up: java.util.List
    private var Uq: Long
    private var Ur: com.google.android.gms.fitness.data.DataSource
    private var Us: Int
    private var Ut: Boolean
    private var Uu: Boolean
    private var Uv: Boolean

    public constructor()

    public fun aggregate(dataSource: com.google.android.gms.fitness.data.DataSource, outputDataType: com.google.android.gms.fitness.data.DataType): com.google.android.gms.fitness.request.DataReadRequest.Builder { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;") }
    /*
    //         .locals 6
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         const-string v0, "Attempting to add a null data source"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uk:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Cannot add the same data source for aggregated and detailed"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataSource;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v0
    //         sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->AGGREGATE_INPUT_TYPES:Ljava/util/Set;
    //         invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v3
    //         const-string v4, "Unsupported input data type specified for aggregation: %s"
    //         new-array v5, v1, [Ljava/lang/Object;
    //         aput-object v0, v5, v2
    //         invoke-static {v3, v4, v5}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataType;->getAggregatesForInput(Lcom/google/android/gms/fitness/data/DataType;)Ljava/util/List;
    //         move-result-object v3
    //         invoke-interface {v3, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v3
    //         const-string v4, "Invalid output aggregate data type specified: %s -> %s"
    //         const/4 v5, 0x2
    //         new-array v5, v5, [Ljava/lang/Object;
    //         aput-object v0, v5, v2
    //         aput-object p2, v5, v1
    //         invoke-static {v3, v4, v5}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Up:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Up:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         return-object p0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_0
    */

    public fun aggregate(inputDataType: com.google.android.gms.fitness.data.DataType, outputDataType: com.google.android.gms.fitness.data.DataType): com.google.android.gms.fitness.request.DataReadRequest.Builder { return TODO("body: (Lcom/google/android/gms/fitness/data/DataType;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;") }
    /*
    //         .locals 5
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         const-string v0, "Attempting to use a null data type"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SB:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Cannot add the same data type as aggregated and detailed"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         sget-object v0, Lcom/google/android/gms/fitness/data/DataType;->AGGREGATE_INPUT_TYPES:Ljava/util/Set;
    //         invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         const-string v3, "Unsupported input data type specified for aggregation: %s"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         aput-object p1, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         invoke-static {p1}, Lcom/google/android/gms/fitness/data/DataType;->getAggregatesForInput(Lcom/google/android/gms/fitness/data/DataType;)Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         const-string v3, "Invalid output aggregate data type specified: %s -> %s"
    //         const/4 v4, 0x2
    //         new-array v4, v4, [Ljava/lang/Object;
    //         aput-object p1, v4, v2
    //         aput-object p2, v4, v1
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uo:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uo:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         return-object p0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_0
    */

    public fun bucketByActivitySegment(minDuration: Int, timeUnit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.request.DataReadRequest.Builder { return TODO("body: (ILjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;") }
    /*
    //         .locals 6
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Bucketing strategy already set to %s"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         iget v5, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         if-lez p1, :cond_1
    //         move v0, v1
    //         :goto_1
    //         const-string v3, "Must specify a valid minimum duration for an activity segment: %d"
    //         new-array v1, v1, [Ljava/lang/Object;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v1, v2
    //         invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         const/4 v0, 0x4
    //         iput v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         int-to-long v0, p1
    //         invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uq:J
    //         return-object p0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    */

    public fun bucketByActivitySegment(minDuration: Int, timeUnit: java.util.concurrent.TimeUnit, activityDataSource: com.google.android.gms.fitness.data.DataSource): com.google.android.gms.fitness.request.DataReadRequest.Builder { return TODO("body: (ILjava/util/concurrent/TimeUnit;Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;") }
    /*
    //         .locals 6
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Bucketing strategy already set to %s"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         iget v5, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         if-lez p1, :cond_1
    //         move v0, v1
    //         :goto_1
    //         const-string v3, "Must specify a valid minimum duration for an activity segment: %d"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         if-eqz p3, :cond_2
    //         move v0, v1
    //         :goto_2
    //         const-string v3, "Invalid activity data source specified"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         invoke-virtual {p3}, Lcom/google/android/gms/fitness/data/DataSource;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v0
    //         sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->TYPE_ACTIVITY_SEGMENT:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-virtual {v0, v3}, Lcom/google/android/gms/fitness/data/DataType;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         const-string v3, "Invalid activity data source specified: %s"
    //         new-array v1, v1, [Ljava/lang/Object;
    //         aput-object p3, v1, v2
    //         invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iput-object p3, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Ur:Lcom/google/android/gms/fitness/data/DataSource;
    //         const/4 v0, 0x4
    //         iput v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         int-to-long v0, p1
    //         invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uq:J
    //         return-object p0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    //         :cond_2
    //         move v0, v2
    //         goto :goto_2
    */

    public fun bucketByActivityType(minDuration: Int, timeUnit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.request.DataReadRequest.Builder { return TODO("body: (ILjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;") }
    /*
    //         .locals 6
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Bucketing strategy already set to %s"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         iget v5, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         if-lez p1, :cond_1
    //         move v0, v1
    //         :goto_1
    //         const-string v3, "Must specify a valid minimum duration for an activity segment: %d"
    //         new-array v1, v1, [Ljava/lang/Object;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v1, v2
    //         invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         const/4 v0, 0x3
    //         iput v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         int-to-long v0, p1
    //         invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uq:J
    //         return-object p0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    */

    public fun bucketByActivityType(minDuration: Int, timeUnit: java.util.concurrent.TimeUnit, activityDataSource: com.google.android.gms.fitness.data.DataSource): com.google.android.gms.fitness.request.DataReadRequest.Builder { return TODO("body: (ILjava/util/concurrent/TimeUnit;Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;") }
    /*
    //         .locals 6
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Bucketing strategy already set to %s"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         iget v5, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         if-lez p1, :cond_1
    //         move v0, v1
    //         :goto_1
    //         const-string v3, "Must specify a valid minimum duration for an activity segment: %d"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         if-eqz p3, :cond_2
    //         move v0, v1
    //         :goto_2
    //         const-string v3, "Invalid activity data source specified"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         invoke-virtual {p3}, Lcom/google/android/gms/fitness/data/DataSource;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v0
    //         sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->TYPE_ACTIVITY_SEGMENT:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-virtual {v0, v3}, Lcom/google/android/gms/fitness/data/DataType;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         const-string v3, "Invalid activity data source specified: %s"
    //         new-array v1, v1, [Ljava/lang/Object;
    //         aput-object p3, v1, v2
    //         invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iput-object p3, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Ur:Lcom/google/android/gms/fitness/data/DataSource;
    //         const/4 v0, 0x3
    //         iput v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         int-to-long v0, p1
    //         invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uq:J
    //         return-object p0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    //         :cond_2
    //         move v0, v2
    //         goto :goto_2
    */

    public fun bucketBySession(minDuration: Int, timeUnit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.request.DataReadRequest.Builder { return TODO("body: (ILjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;") }
    /*
    //         .locals 6
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Bucketing strategy already set to %s"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         iget v5, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         if-lez p1, :cond_1
    //         move v0, v1
    //         :goto_1
    //         const-string v3, "Must specify a valid minimum duration for an activity segment: %d"
    //         new-array v1, v1, [Ljava/lang/Object;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v1, v2
    //         invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         const/4 v0, 0x2
    //         iput v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         int-to-long v0, p1
    //         invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uq:J
    //         return-object p0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    */

    public fun bucketByTime(duration: Int, timeUnit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.request.DataReadRequest.Builder { return TODO("body: (ILjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;") }
    /*
    //         .locals 6
    //         const/4 v2, 0x0
    //         const/4 v1, 0x1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         if-nez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Bucketing strategy already set to %s"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         iget v5, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         if-lez p1, :cond_1
    //         move v0, v1
    //         :goto_1
    //         const-string v3, "Must specify a valid minimum duration for an activity segment: %d"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iput v1, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         int-to-long v0, p1
    //         invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uq:J
    //         return-object p0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    */

    public fun build(): com.google.android.gms.fitness.request.DataReadRequest { return TODO("body: ()Lcom/google/android/gms/fitness/request/DataReadRequest;") }
    /*
    //         .locals 10
    //         const-wide/16 v8, 0x0
    //         const/4 v2, 0x1
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uk:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SB:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Up:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uo:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-nez v0, :cond_3
    //         :cond_0
    //         move v0, v2
    //         :goto_0
    //         const-string v3, "Must add at least one data source (aggregated or detailed)"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->KS:J
    //         cmp-long v0, v4, v8
    //         if-lez v0, :cond_4
    //         move v0, v2
    //         :goto_1
    //         const-string v3, "Invalid start time: %s"
    //         new-array v4, v2, [Ljava/lang/Object;
    //         iget-wide v6, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->KS:J
    //         invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v5
    //         aput-object v5, v4, v1
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Sr:J
    //         cmp-long v0, v4, v8
    //         if-lez v0, :cond_5
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Sr:J
    //         iget-wide v6, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->KS:J
    //         cmp-long v0, v4, v6
    //         if-lez v0, :cond_5
    //         move v0, v2
    //         :goto_2
    //         const-string v3, "Invalid end time: %s"
    //         new-array v4, v2, [Ljava/lang/Object;
    //         iget-wide v6, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Sr:J
    //         invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v5
    //         aput-object v5, v4, v1
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Up:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uo:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->isEmpty()Z
    //         move-result v0
    //         if-eqz v0, :cond_6
    //         move v0, v2
    //         :goto_3
    //         if-eqz v0, :cond_1
    //         iget v3, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         if-eqz v3, :cond_2
    //         :cond_1
    //         if-nez v0, :cond_7
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         if-eqz v0, :cond_7
    //         :cond_2
    //         :goto_4
    //         const-string v0, "Must specify a valid bucketing strategy while requesting aggregation"
    //         invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         new-instance v0, Lcom/google/android/gms/fitness/request/DataReadRequest;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/DataReadRequest;-><init>(Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;Lcom/google/android/gms/fitness/request/DataReadRequest$1;)V
    //         return-object v0
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    //         :cond_4
    //         move v0, v1
    //         goto :goto_1
    //         :cond_5
    //         move v0, v1
    //         goto :goto_2
    //         :cond_6
    //         move v0, v1
    //         goto :goto_3
    //         :cond_7
    //         move v2, v1
    //         goto :goto_4
    */

    public fun enableServerQueries(): com.google.android.gms.fitness.request.DataReadRequest.Builder { return TODO("body: ()Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uv:Z
    //         return-object p0
    */

    public fun read(dataSource: com.google.android.gms.fitness.data.DataSource): com.google.android.gms.fitness.request.DataReadRequest.Builder { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;") }
    /*
    //         .locals 2
    //         const-string v0, "Attempting to add a null data source"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Up:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Cannot add the same data source as aggregated and detailed"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uk:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uk:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         return-object p0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun read(dataType: com.google.android.gms.fitness.data.DataType): com.google.android.gms.fitness.request.DataReadRequest.Builder { return TODO("body: (Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;") }
    /*
    //         .locals 2
    //         const-string v0, "Attempting to use a null data type"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uo:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Cannot add the same data type as aggregated and detailed"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SB:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SB:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         return-object p0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setLimit(limit: Int): com.google.android.gms.fitness.request.DataReadRequest.Builder { return TODO("body: (I)Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;") }
    /*
    //         .locals 5
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         if-lez p1, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Invalid limit %d is specified"
    //         new-array v1, v1, [Ljava/lang/Object;
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v1, v2
    //         invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iput p1, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Us:I
    //         return-object p0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    */

    public fun setTimeRange(start: Long, end: Long, timeUnit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.request.DataReadRequest.Builder { return TODO("body: (JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;") }
    /*
    //         .locals 3
    //         invoke-virtual {p5, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->KS:J
    //         invoke-virtual {p5, p3, p4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Sr:J
    //         return-object p0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.fitness.request.DataReadRequest.Builder): java.util.List { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SB:Ljava/util/List;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.fitness.request.DataReadRequest.Builder): java.util.List { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uk:Ljava/util/List;
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.fitness.request.DataReadRequest.Builder): Long { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->KS:J
    //         return-wide v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.fitness.request.DataReadRequest.Builder): Long { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Sr:J
    //         return-wide v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.fitness.request.DataReadRequest.Builder): java.util.List { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uo:Ljava/util/List;
    //         return-object v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.fitness.request.DataReadRequest.Builder): java.util.List { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Up:Ljava/util/List;
    //         return-object v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.fitness.request.DataReadRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->SE:I
    //         return v0
    */

    @JvmStatic fun h(p0: com.google.android.gms.fitness.request.DataReadRequest.Builder): Long { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uq:J
    //         return-wide v0
    */

    @JvmStatic fun i(p0: com.google.android.gms.fitness.request.DataReadRequest.Builder): com.google.android.gms.fitness.data.DataSource { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;)Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Ur:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object v0
    */

    @JvmStatic fun j(p0: com.google.android.gms.fitness.request.DataReadRequest.Builder): Int { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Us:I
    //         return v0
    */

    @JvmStatic fun k(p0: com.google.android.gms.fitness.request.DataReadRequest.Builder): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Ut:Z
    //         return v0
    */

    @JvmStatic fun l(p0: com.google.android.gms.fitness.request.DataReadRequest.Builder): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uu:Z
    //         return v0
    */

    @JvmStatic fun m(p0: com.google.android.gms.fitness.request.DataReadRequest.Builder): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$Builder;->Uv:Z
    //         return v0
    */

    }
}
