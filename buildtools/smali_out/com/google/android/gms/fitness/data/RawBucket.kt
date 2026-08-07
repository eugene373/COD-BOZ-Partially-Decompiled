package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 9 fields, 9 methods.

class RawBucket: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val KS: Long
    val SD: java.util.List
    val SE: Int
    val SF: Boolean
    val Sr: Long
    val St: com.google.android.gms.fitness.data.Session
    val Tl: Int

    constructor(versionCode: Int, startTimeMillis: Long, endTimeMillis: Long, session: com.google.android.gms.fitness.data.Session, activity: Int, bucketType: java.util.List, serverHasMoreData: Int, p7: Boolean)

    public constructor(bucket: com.google.android.gms.fitness.data.Bucket, p1: java.util.List, p2: java.util.List)

    private fun a(p0: com.google.android.gms.fitness.data.RawBucket): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/RawBucket;)Z") }
    /*
    //         .locals 4
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/RawBucket;->KS:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/RawBucket;->KS:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/RawBucket;->Sr:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/RawBucket;->Sr:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/RawBucket;->Tl:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/RawBucket;->Tl:I
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/RawBucket;->SD:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/RawBucket;->SD:Ljava/util/List;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/RawBucket;->SE:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/RawBucket;->SE:I
    //         if-ne v0, v1, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/data/RawBucket;->SF:Z
    //         iget-boolean v1, p1, Lcom/google/android/gms/fitness/data/RawBucket;->SF:Z
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
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/RawBucket;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/RawBucket;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/RawBucket;->a(Lcom/google/android/gms/fitness/data/RawBucket;)Z
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

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/RawBucket;->KS:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/RawBucket;->Sr:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/RawBucket;->SE:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "startTime"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/RawBucket;->KS:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "endTime"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/RawBucket;->Sr:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "activity"
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/RawBucket;->Tl:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataSets"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/RawBucket;->SD:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "bucketType"
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/RawBucket;->SE:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "serverHasMoreData"
    //         iget-boolean v2, p0, Lcom/google/android/gms/fitness/data/RawBucket;->SF:Z
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/m;->a(Lcom/google/android/gms/fitness/data/RawBucket;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
