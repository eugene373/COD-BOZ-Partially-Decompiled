package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 13 fields, 24 methods.

open class Bucket: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val KS: Long
    private val SC: Int
    private val SD: java.util.List
    private val SE: Int
    private var SF: Boolean
    private val Sr: Long
    private val St: com.google.android.gms.fitness.data.Session

    constructor(versionCode: Int, startTimeMillis: Long, endTimeMillis: Long, session: com.google.android.gms.fitness.data.Session, activityType: Int, bucketType: java.util.List, serverHasMoreData: Int, p7: Boolean)

    public constructor(bucket: com.google.android.gms.fitness.data.RawBucket, p1: java.util.List, p2: java.util.List)

    private fun a(p0: com.google.android.gms.fitness.data.Bucket): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/Bucket;)Z") }
    /*
    //         .locals 4
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->KS:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/Bucket;->KS:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->Sr:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/Bucket;->Sr:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->SC:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/Bucket;->SC:I
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->SD:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/Bucket;->SD:Ljava/util/List;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->SE:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/Bucket;->SE:I
    //         if-ne v0, v1, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->SF:Z
    //         iget-boolean v1, p1, Lcom/google/android/gms/fitness/data/Bucket;->SF:Z
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun b(p0: com.google.android.gms.fitness.data.Bucket): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/Bucket;)Z") }
    /*
    //         .locals 4
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->KS:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/Bucket;->KS:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->Sr:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/Bucket;->Sr:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->SC:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/Bucket;->SC:I
    //         if-ne v0, v1, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->SE:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/Bucket;->SE:I
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
    //         if-eq p1, p0, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/Bucket;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/Bucket;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/Bucket;->a(Lcom/google/android/gms/fitness/data/Bucket;)Z
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

    public fun getActivity(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->SC:I
    //         invoke-static {v0}, Lcom/google/android/gms/fitness/FitnessActivities;->getName(I)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getBucketType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->SE:I
    //         return v0
    */

    public fun getDataSet(dataType: com.google.android.gms.fitness.data.DataType): com.google.android.gms.fitness.data.DataSet { return TODO("body: (Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/data/DataSet;") }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->SD:Ljava/util/List;
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
    //         invoke-virtual {v2, p1}, Lcom/google/android/gms/fitness/data/DataType;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
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
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->SD:Ljava/util/List;
    //         return-object v0
    */

    public fun getEndTime(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->Sr:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getSession(): com.google.android.gms.fitness.data.Session { return TODO("body: ()Lcom/google/android/gms/fitness/data/Session;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->St:Lcom/google/android/gms/fitness/data/Session;
    //         return-object v0
    */

    public fun getStartTime(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->KS:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x4
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Bucket;->KS:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Bucket;->Sr:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/Bucket;->SC:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/Bucket;->SE:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun iB(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->SC:I
    //         return v0
    */

    public fun iC(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 3
    //         const/4 v1, 0x1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->SF:Z
    //         if-eqz v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->SD:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :cond_1
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/DataSet;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSet;->iC()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         move v0, v1
    //         goto :goto_0
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun iD(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->KS:J
    //         return-wide v0
    */

    public fun iE(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Bucket;->Sr:J
    //         return-wide v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "startTime"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Bucket;->KS:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "endTime"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Bucket;->Sr:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "activity"
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/Bucket;->SC:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataSets"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Bucket;->SD:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "bucketType"
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/Bucket;->SE:I
    //         invoke-static {v2}, Lcom/google/android/gms/fitness/data/Bucket;->cy(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "serverHasMoreData"
    //         iget-boolean v2, p0, Lcom/google/android/gms/fitness/data/Bucket;->SF:Z
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/d;->a(Lcom/google/android/gms/fitness/data/Bucket;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val TYPE_ACTIVITY_SEGMENT: Int = 0x4
    @JvmField public val TYPE_ACTIVITY_TYPE: Int = 0x3
    @JvmField public val TYPE_SESSION: Int = 0x2
    @JvmField public val TYPE_TIME: Int = 0x1

    private @JvmStatic fun a(p0: java.util.List, p1: java.util.List, p2: java.util.List): java.util.List { return TODO("body: (Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/RawDataSet;",
    //                 ">;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataSource;",
    //                 ">;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataType;",
    //                 ">;)",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/DataSet;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v1, Ljava/util/ArrayList;
    //         invoke-interface {p0}, Ljava/util/List;->size()I
    //         move-result v0
    //         invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v2
    //         :goto_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/RawDataSet;
    //         new-instance v3, Lcom/google/android/gms/fitness/data/DataSet;
    //         invoke-direct {v3, v0, p1, p2}, Lcom/google/android/gms/fitness/data/DataSet;-><init>(Lcom/google/android/gms/fitness/data/RawDataSet;Ljava/util/List;Ljava/util/List;)V
    //         invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         goto :goto_0
    //         :cond_0
    //         return-object v1
    */

    public @JvmStatic fun cy(p0: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         packed-switch p0, :pswitch_data_0
    //         const-string v0, "bug"
    //         :goto_0
    //         return-object v0
    //         :pswitch_0
    //         const-string v0, "time"
    //         goto :goto_0
    //         :pswitch_1
    //         const-string v0, "type"
    //         goto :goto_0
    //         :pswitch_2
    //         const-string v0, "segment"
    //         goto :goto_0
    //         :pswitch_3
    //         const-string v0, "session"
    //         goto :goto_0
    //         :pswitch_4
    //         const-string v0, "unknown"
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_4
    //             :pswitch_0
    //             :pswitch_3
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    }
}
