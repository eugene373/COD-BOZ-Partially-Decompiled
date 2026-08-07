package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 7 fields, 25 methods.

class DataSet: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private var SF: Boolean
    private val SM: java.util.List
    private val SN: java.util.List
    private val Sp: com.google.android.gms.fitness.data.DataType
    private val Sq: com.google.android.gms.fitness.data.DataSource

    constructor(versionCode: Int, dataSource: com.google.android.gms.fitness.data.DataSource, dataType: com.google.android.gms.fitness.data.DataType, serverHasMoreData: java.util.List, p4: java.util.List, p5: Boolean)

    private constructor(dataSource: com.google.android.gms.fitness.data.DataSource, dataType: com.google.android.gms.fitness.data.DataType)

    public constructor(dataSet: com.google.android.gms.fitness.data.RawDataSet, p1: java.util.List, p2: java.util.List)

    private fun a(p0: com.google.android.gms.fitness.data.DataSet): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSet;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/DataSet;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/DataSet;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->SM:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/DataSet;->SM:Ljava/util/List;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->SF:Z
    //         iget-boolean v1, p1, Lcom/google/android/gms/fitness/data/DataSet;->SF:Z
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun a(p0: Iterable) { /* TODO(body): (Ljava/lang/Iterable;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Iterable",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataPoint;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataPoint;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/data/DataSet;->b(Lcom/google/android/gms/fitness/data/DataPoint;)V
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public fun add(dataPoint: com.google.android.gms.fitness.data.DataPoint) { /* TODO(body): (Lcom/google/android/gms/fitness/data/DataPoint;)V */ }
    /*
    //         .locals 8
    //         const/4 v6, 0x2
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataPoint;->getDataSource()Lcom/google/android/gms/fitness/data/DataSource;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource;->getStreamIdentifier()Ljava/lang/String;
    //         move-result-object v3
    //         iget-object v4, p0, Lcom/google/android/gms/fitness/data/DataSet;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-virtual {v4}, Lcom/google/android/gms/fitness/data/DataSource;->getStreamIdentifier()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         const-string v4, "Conflicting data sources found %s vs %s"
    //         new-array v5, v6, [Ljava/lang/Object;
    //         aput-object v0, v5, v2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         aput-object v0, v5, v1
    //         invoke-static {v3, v4, v5}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataPoint;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataType;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/DataSet;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-virtual {v3}, Lcom/google/android/gms/fitness/data/DataType;->getName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         const-string v3, "Conflicting data types found %s vs %s"
    //         new-array v4, v6, [Ljava/lang/Object;
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataPoint;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         iget-object v5, p0, Lcom/google/android/gms/fitness/data/DataSet;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         aput-object v5, v4, v1
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/fitness/data/DataPoint;->getTimestamp(Ljava/util/concurrent/TimeUnit;)J
    //         move-result-wide v4
    //         const-wide/16 v6, 0x0
    //         cmp-long v0, v4, v6
    //         if-lez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Data point does not have the timestamp set: %s"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         aput-object p1, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/fitness/data/DataPoint;->getStartTime(Ljava/util/concurrent/TimeUnit;)J
    //         move-result-wide v4
    //         sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0}, Lcom/google/android/gms/fitness/data/DataPoint;->getEndTime(Ljava/util/concurrent/TimeUnit;)J
    //         move-result-wide v6
    //         cmp-long v0, v4, v6
    //         if-gtz v0, :cond_1
    //         move v0, v1
    //         :goto_1
    //         const-string v3, "Data point with start time greater than end time found: %s"
    //         new-array v1, v1, [Ljava/lang/Object;
    //         aput-object p1, v1, v2
    //         invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/fitness/data/DataSet;->b(Lcom/google/android/gms/fitness/data/DataPoint;)V
    //         return-void
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    */

    public fun addAll(p0: Iterable) { /* TODO(body): (Ljava/lang/Iterable;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/lang/Iterable",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataPoint;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .local p1, "dataPoints":Ljava/lang/Iterable;, "Ljava/lang/Iterable<Lcom/google/android/gms/fitness/data/DataPoint;>;"
    //         invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataPoint;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/data/DataSet;->add(Lcom/google/android/gms/fitness/data/DataPoint;)V
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public fun b(p0: com.google.android.gms.fitness.data.DataPoint) { /* TODO(body): (Lcom/google/android/gms/fitness/data/DataPoint;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->SM:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataPoint;->getOriginalDataSource()Lcom/google/android/gms/fitness/data/DataSource;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSet;->SN:Ljava/util/List;
    //         invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/fitness/data/DataSet;->SN:Ljava/util/List;
    //         invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         return-void
    */

    public fun createDataPoint(): com.google.android.gms.fitness.data.DataPoint { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataPoint;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataPoint;->create(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataPoint;
    //         move-result-object v0
    //         return-object v0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    fun e(p0: java.util.List): java.util.List { return TODO("body: (Ljava/util/List;)Ljava/util/List;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataSource;",
    //                 ">;)",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/RawDataPoint;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->SM:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->SM:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataPoint;
    //         new-instance v3, Lcom/google/android/gms/fitness/data/RawDataPoint;
    //         invoke-direct {v3, v0, p1}, Lcom/google/android/gms/fitness/data/RawDataPoint;-><init>(Lcom/google/android/gms/fitness/data/DataPoint;Ljava/util/List;)V
    //         invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p1, p0, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/DataSet;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/DataSet;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/DataSet;->a(Lcom/google/android/gms/fitness/data/DataSet;)Z
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

    public fun getDataPoints(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataPoint;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->SM:Ljava/util/List;
    //         invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDataSource(): com.google.android.gms.fitness.data.DataSource { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object v0
    */

    public fun getDataType(): com.google.android.gms.fitness.data.DataType { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSet;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/DataSet;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun iC(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->SF:Z
    //         return v0
    */

    fun iK(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/RawDataPoint;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->SN:Ljava/util/List;
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/data/DataSet;->e(Ljava/util/List;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    fun iL(): java.util.List { return TODO("body: ()Ljava/util/List;") }
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
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/DataSet;->SN:Ljava/util/List;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 8
    //         const/4 v5, 0x2
    //         const/4 v7, 0x1
    //         const/4 v6, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/data/DataSet;->iK()Ljava/util/List;
    //         move-result-object v0
    //         const-string v1, "DataSet{%s %s}"
    //         new-array v2, v5, [Ljava/lang/Object;
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/DataSet;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-virtual {v3}, Lcom/google/android/gms/fitness/data/DataSource;->toDebugString()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v2, v6
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/DataSet;->SM:Ljava/util/List;
    //         invoke-interface {v3}, Ljava/util/List;->size()I
    //         move-result v3
    //         const/16 v4, 0xa
    //         if-ge v3, v4, :cond_0
    //         :goto_0
    //         aput-object v0, v2, v7
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         const-string v3, "%d data points, first 5: %s"
    //         new-array v4, v5, [Ljava/lang/Object;
    //         iget-object v5, p0, Lcom/google/android/gms/fitness/data/DataSet;->SM:Ljava/util/List;
    //         invoke-interface {v5}, Ljava/util/List;->size()I
    //         move-result v5
    //         invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v5
    //         aput-object v5, v4, v6
    //         const/4 v5, 0x5
    //         invoke-interface {v0, v6, v5}, Ljava/util/List;->subList(II)Ljava/util/List;
    //         move-result-object v0
    //         aput-object v0, v4, v7
    //         invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/f;->a(Lcom/google/android/gms/fitness/data/DataSet;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    private @JvmStatic fun b(p0: java.util.List, p1: Int): Object { return TODO("body: (Ljava/util/List;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "<T:",
    //                 "Ljava/lang/Object;",
    //                 ">(",
    //                 "Ljava/util/List",
    //                 "<TT;>;I)TT;"
    //             }
    //         .end annotation
    //         if-ltz p1, :cond_0
    //         invoke-interface {p0}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-ge p1, v0, :cond_0
    //         invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun create(dataSource: com.google.android.gms.fitness.data.DataSource): com.google.android.gms.fitness.data.DataSet { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet;") }
    /*
    //         .locals 2
    //         const-string v0, "DataSource should be specified"
    //         invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         new-instance v0, Lcom/google/android/gms/fitness/data/DataSet;
    //         invoke-virtual {p0}, Lcom/google/android/gms/fitness/data/DataSource;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v1
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/data/DataSet;-><init>(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;)V
    //         return-object v0
    */

    }
}
