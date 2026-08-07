package com.google.android.gms.fitness.request

// Auto-emitted from smali.
// 9 fields, 19 methods.

open class SessionReadRequest_Builder {
    private var KS: Long
    private var SB: java.util.List
    private var Sr: Long
    private var UN: String
    private var UO: Boolean
    private var UP: java.util.List
    private var Uk: java.util.List
    private var Uv: Boolean
    private var vL: String

    public constructor()

    public fun build(): com.google.android.gms.fitness.request.SessionReadRequest { return TODO("body: ()Lcom/google/android/gms/fitness/request/SessionReadRequest;") }
    /*
    //         .locals 10
    //         const-wide/16 v8, 0x0
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->KS:J
    //         cmp-long v0, v4, v8
    //         if-lez v0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Invalid start time: %s"
    //         new-array v4, v1, [Ljava/lang/Object;
    //         iget-wide v6, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->KS:J
    //         invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v5
    //         aput-object v5, v4, v2
    //         invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->Sr:J
    //         cmp-long v0, v4, v8
    //         if-lez v0, :cond_1
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->Sr:J
    //         iget-wide v6, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->KS:J
    //         cmp-long v0, v4, v6
    //         if-lez v0, :cond_1
    //         move v0, v1
    //         :goto_1
    //         const-string v3, "Invalid end time: %s"
    //         new-array v1, v1, [Ljava/lang/Object;
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->Sr:J
    //         invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v4
    //         aput-object v4, v1, v2
    //         invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         new-instance v0, Lcom/google/android/gms/fitness/request/SessionReadRequest;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/SessionReadRequest;-><init>(Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;Lcom/google/android/gms/fitness/request/SessionReadRequest$1;)V
    //         return-object v0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v0, v2
    //         goto :goto_1
    */

    public fun enableServerQueries(): com.google.android.gms.fitness.request.SessionReadRequest.Builder { return TODO("body: ()Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->Uv:Z
    //         return-object p0
    */

    public fun excludePackage(appPackageName: String): com.google.android.gms.fitness.request.SessionReadRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;") }
    /*
    //         .locals 1
    //         const-string v0, "Attempting to use a null package name"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->UP:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->UP:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         return-object p0
    */

    public fun read(dataSource: com.google.android.gms.fitness.data.DataSource): com.google.android.gms.fitness.request.SessionReadRequest.Builder { return TODO("body: (Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;") }
    /*
    //         .locals 1
    //         const-string v0, "Attempting to add a null data source"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->Uk:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->Uk:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         return-object p0
    */

    public fun read(dataType: com.google.android.gms.fitness.data.DataType): com.google.android.gms.fitness.request.SessionReadRequest.Builder { return TODO("body: (Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;") }
    /*
    //         .locals 1
    //         const-string v0, "Attempting to use a null data type"
    //         invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->SB:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->SB:Ljava/util/List;
    //         invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         :cond_0
    //         return-object p0
    */

    public fun readSessionsFromAllApps(): com.google.android.gms.fitness.request.SessionReadRequest.Builder { return TODO("body: ()Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->UO:Z
    //         return-object p0
    */

    public fun setSessionId(sessionId: String): com.google.android.gms.fitness.request.SessionReadRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->vL:Ljava/lang/String;
    //         return-object p0
    */

    public fun setSessionName(sessionName: String): com.google.android.gms.fitness.request.SessionReadRequest.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->UN:Ljava/lang/String;
    //         return-object p0
    */

    public fun setTimeInterval(startTime: Long, endTime: Long, timeUnit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.request.SessionReadRequest.Builder { return TODO("body: (JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;") }
    /*
    //         .locals 3
    //         invoke-virtual {p5, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->KS:J
    //         invoke-virtual {p5, p3, p4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->Sr:J
    //         return-object p0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.fitness.request.SessionReadRequest.Builder): String { return TODO("body: (Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->UN:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.fitness.request.SessionReadRequest.Builder): String { return TODO("body: (Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->vL:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.fitness.request.SessionReadRequest.Builder): Long { return TODO("body: (Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->KS:J
    //         return-wide v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.fitness.request.SessionReadRequest.Builder): Long { return TODO("body: (Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->Sr:J
    //         return-wide v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.fitness.request.SessionReadRequest.Builder): java.util.List { return TODO("body: (Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->SB:Ljava/util/List;
    //         return-object v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.fitness.request.SessionReadRequest.Builder): java.util.List { return TODO("body: (Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->Uk:Ljava/util/List;
    //         return-object v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.fitness.request.SessionReadRequest.Builder): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->UO:Z
    //         return v0
    */

    @JvmStatic fun h(p0: com.google.android.gms.fitness.request.SessionReadRequest.Builder): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->Uv:Z
    //         return v0
    */

    @JvmStatic fun i(p0: com.google.android.gms.fitness.request.SessionReadRequest.Builder): java.util.List { return TODO("body: (Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$Builder;->UP:Ljava/util/List;
    //         return-object v0
    */

    }
}
