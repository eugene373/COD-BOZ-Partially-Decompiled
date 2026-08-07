package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 9 fields, 22 methods.

open class DataDeleteRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val KS: Long
    private val SB: java.util.List
    private val Sr: Long
    private val Uk: java.util.List
    private val Ul: java.util.List
    private val Um: Boolean
    private val Un: Boolean

    constructor(versionCode: Int, startTimeMillis: Long, endTimeMillis: Long, deleteAllData: java.util.List, deleteAllSessions: java.util.List, p5: java.util.List, p6: Boolean, p7: Boolean)

    private constructor(builder: com.google.android.gms.fitness.request.DataDeleteRequest.Builder)

    constructor(x0: com.google.android.gms.fitness.request.DataDeleteRequest.Builder, x1: com.google.android.gms.fitness.request.DataDeleteRequest.1)

    private fun a(p0: com.google.android.gms.fitness.request.DataDeleteRequest): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/request/DataDeleteRequest;)Z") }
    /*
    //         .locals 4
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->KS:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->KS:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Sr:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Sr:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Uk:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Uk:Ljava/util/List;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->SB:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->SB:Ljava/util/List;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Ul:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Ul:Ljava/util/List;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Um:Z
    //         iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Um:Z
    //         if-ne v0, v1, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Un:Z
    //         iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Un:Z
    //         if-ne v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun deleteAllData(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Um:Z
    //         return v0
    */

    public fun deleteAllSessions(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Un:Z
    //         return v0
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
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/request/DataDeleteRequest;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->a(Lcom/google/android/gms/fitness/request/DataDeleteRequest;)Z
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
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Uk:Ljava/util/List;
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
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->SB:Ljava/util/List;
    //         return-object v0
    */

    public fun getEndTime(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Sr:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getSessions(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/data/Session;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Ul:Ljava/util/List;
    //         return-object v0
    */

    public fun getStartTime(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->KS:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x2
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->KS:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Sr:J
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
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->KS:J
    //         return-wide v0
    */

    public fun iE(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Sr:J
    //         return-wide v0
    */

    public fun jg(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Um:Z
    //         return v0
    */

    public fun jh(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Un:Z
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "startTimeMillis"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->KS:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "endTimeMillis"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Sr:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataSources"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Uk:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dateTypes"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->SB:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "sessions"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Ul:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "deleteAllData"
    //         iget-boolean v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Um:Z
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "deleteAllSessions"
    //         iget-boolean v2, p0, Lcom/google/android/gms/fitness/request/DataDeleteRequest;->Un:Z
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
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/d;->a(Lcom/google/android/gms/fitness/request/DataDeleteRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
