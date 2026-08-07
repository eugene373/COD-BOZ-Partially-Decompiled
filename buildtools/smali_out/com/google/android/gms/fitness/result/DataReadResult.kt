package com.google.android.gms.fitness.result

// Auto-emitted from smali.
// 8 fields, 24 methods.

open class DataReadResult: com.google.android.gms.common.api.Result, com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val CM: com.google.android.gms.common.api.Status
    private val SD: java.util.List
    private val SN: java.util.List
    private val UV: java.util.List
    private var UW: Int
    private val UX: java.util.List

    constructor(versionCode: Int, status: java.util.List, batchCount: com.google.android.gms.common.api.Status, p3: java.util.List, p4: Int, p5: java.util.List, p6: java.util.List)

    public constructor(status: java.util.List, p1: java.util.List, p2: com.google.android.gms.common.api.Status)

    private fun a(p0: com.google.android.gms.fitness.data.Bucket, p1: java.util.List) { /* TODO(body): (Lcom/google/android/gms/fitness/data/Bucket;Ljava/util/List;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/fitness/data/Bucket;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/Bucket;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/Bucket;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/fitness/data/Bucket;->b(Lcom/google/android/gms/fitness/data/Bucket;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/Bucket;->getDataSets()Ljava/util/List;
    //         move-result-object v1
    //         invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/fitness/data/DataSet;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/Bucket;->getDataSets()Ljava/util/List;
    //         move-result-object v3
    //         invoke-direct {p0, v1, v3}, Lcom/google/android/gms/fitness/result/DataReadResult;->a(Lcom/google/android/gms/fitness/data/DataSet;Ljava/util/List;)V
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UV:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_2
    //         return-void
    */

    private fun a(p0: com.google.android.gms.fitness.data.DataSet, p1: java.util.List) { /* TODO(body): (Lcom/google/android/gms/fitness/data/DataSet;Ljava/util/List;)V */ }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/fitness/data/DataSet;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataSet;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataSet;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSet;->getDataSource()Lcom/google/android/gms/fitness/data/DataSource;
    //         move-result-object v2
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataSet;->getDataSource()Lcom/google/android/gms/fitness/data/DataSource;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Lcom/google/android/gms/fitness/data/DataSource;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataSet;->getDataPoints()Ljava/util/List;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/data/DataSet;->a(Ljava/lang/Iterable;)V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    */

    private fun c(p0: com.google.android.gms.fitness.result.DataReadResult): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/result/DataReadResult;)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/result/DataReadResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/Status;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SD:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/result/DataReadResult;->SD:Ljava/util/List;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UV:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/result/DataReadResult;->UV:Ljava/util/List;
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

    public fun b(p0: com.google.android.gms.fitness.result.DataReadResult) { /* TODO(body): (Lcom/google/android/gms/fitness/result/DataReadResult;)V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/result/DataReadResult;->getDataSets()Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataSet;
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SD:Ljava/util/List;
    //         invoke-direct {p0, v0, v2}, Lcom/google/android/gms/fitness/result/DataReadResult;->a(Lcom/google/android/gms/fitness/data/DataSet;Ljava/util/List;)V
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/result/DataReadResult;->getBuckets()Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/Bucket;
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UV:Ljava/util/List;
    //         invoke-direct {p0, v0, v2}, Lcom/google/android/gms/fitness/result/DataReadResult;->a(Lcom/google/android/gms/fitness/data/Bucket;Ljava/util/List;)V
    //         goto :goto_1
    //         :cond_1
    //         return-void
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
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/result/DataReadResult;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/result/DataReadResult;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/result/DataReadResult;->c(Lcom/google/android/gms/fitness/result/DataReadResult;)Z
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

    public fun getBuckets(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/Bucket;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UV:Ljava/util/List;
    //         return-object v0
    */

    public fun getDataSet(dataSource: com.google.android.gms.fitness.data.DataSource): com.google.android.gms.fitness.data.DataSet { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet;") }
    /*
    //         .locals 5
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SD:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataSet;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSet;->getDataSource()Lcom/google/android/gms/fitness/data/DataSource;
    //         move-result-object v2
    //         invoke-virtual {p1, v2}, Lcom/google/android/gms/fitness/data/DataSource;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         return-object v0
    //         :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Attempting to read data for %s, which was not requested"
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataSource;->getStreamIdentifier()Ljava/lang/String;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getDataSet(dataType: com.google.android.gms.fitness.data.DataType): com.google.android.gms.fitness.data.DataSet { return TODO("body: (Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSet;") }
    /*
    //         .locals 5
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SD:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataSet;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSet;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v2
    //         invoke-virtual {p1, v2}, Lcom/google/android/gms/fitness/data/DataType;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         return-object v0
    //         :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Attempting to read data for %s, which was not requested"
    //         const/4 v2, 0x1
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataType;->getName()Ljava/lang/String;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getDataSets(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataSet;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SD:Ljava/util/List;
    //         return-object v0
    */

    public fun getStatus(): com.google.android.gms.common.api.Status { return TODO("body: ()Lcom/google/android/gms/common/api/Status;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SD:Ljava/util/List;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UV:Ljava/util/List;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
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
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SN:Ljava/util/List;
    //         return-object v0
    */

    public fun jH(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UW:I
    //         return v0
    */

    fun jI(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/RawBucket;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UV:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UV:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/Bucket;
    //         new-instance v3, Lcom/google/android/gms/fitness/data/RawBucket;
    //         iget-object v4, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SN:Ljava/util/List;
    //         iget-object v5, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UX:Ljava/util/List;
    //         invoke-direct {v3, v0, v4, v5}, Lcom/google/android/gms/fitness/data/RawBucket;-><init>(Lcom/google/android/gms/fitness/data/Bucket;Ljava/util/List;Ljava/util/List;)V
    //         invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    fun jJ(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/RawDataSet;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SD:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SD:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataSet;
    //         new-instance v3, Lcom/google/android/gms/fitness/data/RawDataSet;
    //         iget-object v4, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SN:Ljava/util/List;
    //         iget-object v5, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UX:Ljava/util/List;
    //         invoke-direct {v3, v0, v4, v5}, Lcom/google/android/gms/fitness/data/RawDataSet;-><init>(Lcom/google/android/gms/fitness/data/DataSet;Ljava/util/List;Ljava/util/List;)V
    //         invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    fun jK(): java.util.List { return TODO("body: ()Ljava/util/List;") }
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
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UX:Ljava/util/List;
    //         return-object v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 5
    //         const/4 v4, 0x5
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "status"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->CM:Lcom/google/android/gms/common/api/Status;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v1
    //         const-string v2, "dataSets"
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SD:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-le v0, v4, :cond_0
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SD:Ljava/util/List;
    //         invoke-interface {v3}, Ljava/util/List;->size()I
    //         move-result v3
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v3, " data sets"
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v1
    //         const-string v2, "buckets"
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UV:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v0
    //         if-le v0, v4, :cond_1
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UV:Ljava/util/List;
    //         invoke-interface {v3}, Ljava/util/List;->size()I
    //         move-result v3
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         const-string v3, " buckets"
    //         invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_1
    //         invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->SD:Ljava/util/List;
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/result/DataReadResult;->UV:Ljava/util/List;
    //         goto :goto_1
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/result/b;->a(Lcom/google/android/gms/fitness/result/DataReadResult;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    public @JvmStatic fun a(p0: com.google.android.gms.common.api.Status, p1: com.google.android.gms.fitness.request.DataReadRequest): com.google.android.gms.fitness.result.DataReadResult { return TODO("body: (Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/fitness/request/DataReadRequest;)Lcom/google/android/gms/fitness/result/DataReadResult;") }
    /*
    //         .locals 4
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/request/DataReadRequest;->getDataSources()Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataSet;->create(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet;
    //         move-result-object v0
    //         invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/fitness/request/DataReadRequest;->getDataTypes()Ljava/util/List;
    //         move-result-object v0
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataType;
    //         new-instance v3, Lcom/google/android/gms/fitness/data/DataSource$Builder;
    //         invoke-direct {v3}, Lcom/google/android/gms/fitness/data/DataSource$Builder;-><init>()V
    //         invoke-virtual {v3, v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setDataType(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSource$Builder;
    //         move-result-object v0
    //         const/4 v3, 0x1
    //         invoke-virtual {v0, v3}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setType(I)Lcom/google/android/gms/fitness/data/DataSource$Builder;
    //         move-result-object v0
    //         const-string v3, "Default"
    //         invoke-virtual {v0, v3}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->setName(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/DataSource$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource$Builder;->build()Lcom/google/android/gms/fitness/data/DataSource;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataSet;->create(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/data/DataSet;
    //         move-result-object v0
    //         invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_1
    //         :cond_1
    //         new-instance v0, Lcom/google/android/gms/fitness/result/DataReadResult;
    //         invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
    //         move-result-object v2
    //         invoke-direct {v0, v1, v2, p0}, Lcom/google/android/gms/fitness/result/DataReadResult;-><init>(Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/common/api/Status;)V
    //         return-object v0
    */

    }
}
