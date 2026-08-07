package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 6 fields, 17 methods.

open class Subscription: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Sp: com.google.android.gms.fitness.data.DataType
    private val Sq: com.google.android.gms.fitness.data.DataSource
    private val Tt: Long
    private val Tu: Int

    constructor(versionCode: Int, dataSource: com.google.android.gms.fitness.data.DataSource, dataType: com.google.android.gms.fitness.data.DataType, samplingIntervalMicros: Long, accuracyMode: Int)

    private constructor(builder: com.google.android.gms.fitness.data.Subscription.a)

    constructor(x0: com.google.android.gms.fitness.data.Subscription.a, x1: com.google.android.gms.fitness.data.Subscription.1)

    private fun a(p0: com.google.android.gms.fitness.data.Subscription): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/Subscription;)Z") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/Subscription;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/Subscription;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Tt:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/Subscription;->Tt:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Tu:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/Subscription;->Tu:I
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
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/Subscription;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/Subscription;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/Subscription;->a(Lcom/google/android/gms/fitness/data/Subscription;)Z
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
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Tu:I
    //         return v0
    */

    public fun getDataSource(): com.google.android.gms.fitness.data.DataSource { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object v0
    */

    public fun getDataType(): com.google.android.gms.fitness.data.DataType { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x4
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->Tt:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->Tu:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun iX(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Tt:J
    //         return-wide v0
    */

    public fun iY(): com.google.android.gms.fitness.data.DataType { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource;->getDataType()Lcom/google/android/gms/fitness/data/DataType;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         goto :goto_0
    */

    public fun toDebugString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v1, "Subscription{%s}"
    //         const/4 v0, 0x1
    //         new-array v2, v0, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataType;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         :goto_0
    //         aput-object v0, v2, v3
    //         invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/DataSource;->toDebugString()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataSource"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataType"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "samplingIntervalMicros"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->Tt:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "accuracyMode"
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/Subscription;->Tu:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
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
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/s;->a(Lcom/google/android/gms/fitness/data/Subscription;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
