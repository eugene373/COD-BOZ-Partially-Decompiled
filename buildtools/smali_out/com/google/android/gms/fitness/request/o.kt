package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 15 fields, 21 methods.

open class o: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val Sp: com.google.android.gms.fitness.data.DataType
    private val Sq: com.google.android.gms.fitness.data.DataSource
    private val Tt: Long
    private val Tu: Int
    private var UA: com.google.android.gms.fitness.data.k
    var UB: Int
    var UC: Int
    private val UD: Long
    private val UE: Long
    private val UF: java.util.List
    private val UG: Long
    private val UH: java.util.List
    private val mPendingIntent: android.app.PendingIntent

    constructor(p0: Int, p1: com.google.android.gms.fitness.data.DataSource, p2: com.google.android.gms.fitness.data.DataType, p3: android.os.IBinder, p4: Int, p5: Int, p6: Long, p7: Long, p8: android.app.PendingIntent, p9: Long, p10: Int, p11: java.util.List, p12: Long)

    private constructor(p0: com.google.android.gms.fitness.data.DataSource, p1: com.google.android.gms.fitness.data.DataType, p2: com.google.android.gms.fitness.data.k, p3: android.app.PendingIntent, p4: Long, p5: Long, p6: Long, p7: Int, p8: java.util.List, p9: java.util.List, p10: Long)

    public constructor(p0: com.google.android.gms.fitness.request.SensorRequest, p1: com.google.android.gms.fitness.data.k, p2: android.app.PendingIntent)

    private fun a(p0: com.google.android.gms.fitness.request.o): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/request/o;)Z") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/o;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/o;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->Tt:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/o;->Tt:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->UE:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/o;->UE:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->UD:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/o;->UD:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/o;->Tu:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/request/o;->Tu:I
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->UF:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/o;->UF:Ljava/util/List;
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
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/request/o;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/request/o;
    //         .end local p1    # "that":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/o;->a(Lcom/google/android/gms/fitness/request/o;)Z
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
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/o;->Tu:I
    //         return v0
    */

    public fun getDataSource(): com.google.android.gms.fitness.data.DataSource { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataSource;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         return-object v0
    */

    public fun getDataType(): com.google.android.gms.fitness.data.DataType { return TODO("body: ()Lcom/google/android/gms/fitness/data/DataType;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/o;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/16 v0, 0x8
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/o;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/o;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/o;->UA:Lcom/google/android/gms/fitness/data/k;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/o;->Tt:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/o;->UE:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/o;->UD:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x6
    //         iget v2, p0, Lcom/google/android/gms/fitness/request/o;->Tu:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x7
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/o;->UF:Ljava/util/List;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun iX(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->Tt:J
    //         return-wide v0
    */

    public fun jr(): android.app.PendingIntent { return TODO("body: ()Landroid/app/PendingIntent;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->mPendingIntent:Landroid/app/PendingIntent;
    //         return-object v0
    */

    public fun js(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->UE:J
    //         return-wide v0
    */

    public fun jt(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->UD:J
    //         return-wide v0
    */

    public fun ju(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/location/LocationRequest;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->UF:Ljava/util/List;
    //         return-object v0
    */

    public fun jv(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/o;->UG:J
    //         return-wide v0
    */

    fun jw(): android.os.IBinder { return TODO("body: ()Landroid/os/IBinder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->UA:Lcom/google/android/gms/fitness/data/k;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/o;->UA:Lcom/google/android/gms/fitness/data/k;
    //         invoke-interface {v0}, Lcom/google/android/gms/fitness/data/k;->asBinder()Landroid/os/IBinder;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 6
    //         const-string v0, "SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}"
    //         const/4 v1, 0x5
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/request/o;->Sp:Lcom/google/android/gms/fitness/data/DataType;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget-object v3, p0, Lcom/google/android/gms/fitness/request/o;->Sq:Lcom/google/android/gms/fitness/data/DataSource;
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/o;->Tt:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x3
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/o;->UE:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x4
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/o;->UD:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(parcel: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/p;->a(Lcom/google/android/gms/fitness/request/o;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
