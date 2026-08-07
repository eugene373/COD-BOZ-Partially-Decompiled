package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 9 fields, 9 methods.

class RawDataPoint: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    val SG: Long
    val SH: Long
    val SI: Array<com.google.android.gms.fitness.data.Value>
    val SK: Long
    val SL: Long
    val Tm: Int
    val Tn: Int

    constructor(versionCode: Int, timestampNanos: Long, startTimeNanos: Long, values: Array<com.google.android.gms.fitness.data.Value>, dataSourceIndex: Int, originalDataSourceIndex: Int, rawTimestamp: Long, insertionTimeMillis: Long)

    constructor(dataPoint: com.google.android.gms.fitness.data.DataPoint, p1: java.util.List)

    private fun a(p0: com.google.android.gms.fitness.data.RawDataPoint): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/RawDataPoint;)Z") }
    /*
    //         .locals 4
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/RawDataPoint;->SG:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/RawDataPoint;->SG:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/RawDataPoint;->SH:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/RawDataPoint;->SH:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/RawDataPoint;->SI:[Lcom/google/android/gms/fitness/data/Value;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/RawDataPoint;->SI:[Lcom/google/android/gms/fitness/data/Value;
    //         invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/RawDataPoint;->Tm:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/RawDataPoint;->Tm:I
    //         if-ne v0, v1, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/RawDataPoint;->Tn:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/RawDataPoint;->Tn:I
    //         if-ne v0, v1, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/RawDataPoint;->SK:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/RawDataPoint;->SK:J
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

    public fun equals(o: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         if-eq p0, p1, :cond_0
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/RawDataPoint;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/RawDataPoint;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/RawDataPoint;->a(Lcom/google/android/gms/fitness/data/RawDataPoint;)Z
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
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/RawDataPoint;->SG:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/RawDataPoint;->SH:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         const-string v0, "RawDataPoint{%s@[%s, %s](%d,%d)}"
    //         const/4 v1, 0x5
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/data/RawDataPoint;->SI:[Lcom/google/android/gms/fitness/data/Value;
    //         invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/data/RawDataPoint;->SH:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/data/RawDataPoint;->SG:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x3
    //         iget v3, p0, Lcom/google/android/gms/fitness/data/RawDataPoint;->Tm:I
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x4
    //         iget v3, p0, Lcom/google/android/gms/fitness/data/RawDataPoint;->Tn:I
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/n;->a(Lcom/google/android/gms/fitness/data/RawDataPoint;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
