package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 11 fields, 23 methods.

open class SessionReadRequest: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val KS: Long
    private val SB: java.util.List
    private val Sr: Long
    private val UN: String
    private var UO: Boolean
    private val UP: java.util.List
    private val Uk: java.util.List
    private val Uv: Boolean
    private val vL: String

    constructor(versionCode: Int, sessionName: String, sessionId: String, startTimeMillis: Long, endTimeMillis: Long, getSessionsFromAllApps: java.util.List, serverQueriesEnabled: java.util.List, p7: Boolean, p8: Boolean, p9: java.util.List)

    private constructor(builder: com.google.android.gms.fitness.request.SessionReadRequest.Builder)

    constructor(x0: com.google.android.gms.fitness.request.SessionReadRequest.Builder, x1: com.google.android.gms.fitness.request.SessionReadRequest.1)

    private fun a(p0: com.google.android.gms.fitness.request.SessionReadRequest): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/request/SessionReadRequest;)Z") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UN:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UN:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->vL:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->vL:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->KS:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->KS:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Sr:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Sr:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->SB:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->SB:Ljava/util/List;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Uk:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Uk:Ljava/util/List;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UO:Z
    //         iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UO:Z
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UP:Ljava/util/List;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UP:Ljava/util/List;
    //         invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Uv:Z
    //         iget-boolean v1, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Uv:Z
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
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/request/SessionReadRequest;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/SessionReadRequest;->a(Lcom/google/android/gms/fitness/request/SessionReadRequest;)Z
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
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Uk:Ljava/util/List;
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
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->SB:Ljava/util/List;
    //         return-object v0
    */

    public fun getEndTime(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Sr:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getExcludedPackages(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UP:Ljava/util/List;
    //         return-object v0
    */

    public fun getSessionId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->vL:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSessionName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UN:Ljava/lang/String;
    //         return-object v0
    */

    public fun getStartTime(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->KS:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x4
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UN:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->vL:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->KS:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Sr:J
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
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->KS:J
    //         return-wide v0
    */

    public fun iE(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Sr:J
    //         return-wide v0
    */

    public fun includeSessionsFromAllApps(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UO:Z
    //         return v0
    */

    public fun jl(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Uv:Z
    //         return v0
    */

    public fun jz(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UO:Z
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "sessionName"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UN:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "sessionId"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->vL:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "startTimeMillis"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->KS:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "endTimeMillis"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Sr:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataTypes"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->SB:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "dataSources"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Uk:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "sessionsFromAllApps"
    //         iget-boolean v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UO:Z
    //         invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "excludedPackages"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->UP:Ljava/util/List;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "useServer"
    //         iget-boolean v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest;->Uv:Z
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
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/request/t;->a(Lcom/google/android/gms/fitness/request/SessionReadRequest;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
