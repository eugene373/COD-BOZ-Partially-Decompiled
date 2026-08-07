package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 7 fields, 16 methods.

open class Session_Builder {
    private var KS: Long
    private var SC: Int
    private var SP: com.google.android.gms.fitness.data.a
    private var Sr: Long
    private var Tq: String
    private var Tr: String
    private var mName: String

    public constructor()

    public fun build(): com.google.android.gms.fitness.data.Session { return TODO("body: ()Lcom/google/android/gms/fitness/data/Session;") }
    /*
    //         .locals 8
    //         const-wide/16 v6, 0x0
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->KS:J
    //         cmp-long v0, v4, v6
    //         if-lez v0, :cond_3
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Start time should be specified."
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->Sr:J
    //         cmp-long v0, v4, v6
    //         if-eqz v0, :cond_0
    //         iget-wide v4, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->Sr:J
    //         iget-wide v6, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->KS:J
    //         cmp-long v0, v4, v6
    //         if-lez v0, :cond_1
    //         :cond_0
    //         move v2, v1
    //         :cond_1
    //         const-string v0, "End time should be later than start time."
    //         invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->Tq:Ljava/lang/String;
    //         if-nez v0, :cond_2
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->mName:Ljava/lang/String;
    //         if-nez v0, :cond_4
    //         const-string v0, ""
    //         :goto_1
    //         invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->KS:J
    //         invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->Tq:Ljava/lang/String;
    //         :cond_2
    //         new-instance v0, Lcom/google/android/gms/fitness/data/Session;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/data/Session;-><init>(Lcom/google/android/gms/fitness/data/Session$Builder;Lcom/google/android/gms/fitness/data/Session$1;)V
    //         return-object v0
    //         :cond_3
    //         move v0, v2
    //         goto :goto_0
    //         :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->mName:Ljava/lang/String;
    //         goto :goto_1
    */

    public fun cK(p0: Int): com.google.android.gms.fitness.data.Session.Builder { return TODO("body: (I)Lcom/google/android/gms/fitness/data/Session$Builder;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->SC:I
    //         return-object p0
    */

    public fun setActivity(activity: String): com.google.android.gms.fitness.data.Session.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Session$Builder;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/fitness/FitnessActivities;->bp(Ljava/lang/String;)I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/data/Session$Builder;->cK(I)Lcom/google/android/gms/fitness/data/Session$Builder;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setDescription(description: String): com.google.android.gms.fitness.data.Session.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Session$Builder;") }
    /*
    //         .locals 5
    //         const/16 v4, 0x3e8
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-gt v0, v4, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Session description cannot exceed %d characters"
    //         new-array v1, v1, [Ljava/lang/Object;
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v1, v2
    //         invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->Tr:Ljava/lang/String;
    //         return-object p0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    */

    public fun setEndTime(time: Long, timeUnit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.data.Session.Builder { return TODO("body: (JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/Session$Builder;") }
    /*
    //         .locals 3
    //         const-wide/16 v0, 0x0
    //         cmp-long v0, p1, v0
    //         if-ltz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "End time should be positive."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->Sr:J
    //         return-object p0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setIdentifier(identifier: String): com.google.android.gms.fitness.data.Session.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Session$Builder;") }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         invoke-static {p1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/o;->K(Z)V
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->Tq:Ljava/lang/String;
    //         return-object p0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setName(name: String): com.google.android.gms.fitness.data.Session.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Session$Builder;") }
    /*
    //         .locals 5
    //         const/16 v4, 0x64
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         invoke-virtual {p1}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-gt v0, v4, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "Session name cannot exceed %d characters"
    //         new-array v1, v1, [Ljava/lang/Object;
    //         invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v1, v2
    //         invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    //         iput-object p1, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->mName:Ljava/lang/String;
    //         return-object p0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    */

    public fun setStartTime(time: Long, timeUnit: java.util.concurrent.TimeUnit): com.google.android.gms.fitness.data.Session.Builder { return TODO("body: (JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/Session$Builder;") }
    /*
    //         .locals 3
    //         const-wide/16 v0, 0x0
    //         cmp-long v0, p1, v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         const-string v1, "Start time should be positive."
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->KS:J
    //         return-object p0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.fitness.data.Session.Builder): Long { return TODO("body: (Lcom/google/android/gms/fitness/data/Session$Builder;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->KS:J
    //         return-wide v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.fitness.data.Session.Builder): Long { return TODO("body: (Lcom/google/android/gms/fitness/data/Session$Builder;)J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->Sr:J
    //         return-wide v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.fitness.data.Session.Builder): String { return TODO("body: (Lcom/google/android/gms/fitness/data/Session$Builder;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->mName:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.fitness.data.Session.Builder): String { return TODO("body: (Lcom/google/android/gms/fitness/data/Session$Builder;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->Tq:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.fitness.data.Session.Builder): String { return TODO("body: (Lcom/google/android/gms/fitness/data/Session$Builder;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->Tr:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.fitness.data.Session.Builder): Int { return TODO("body: (Lcom/google/android/gms/fitness/data/Session$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->SC:I
    //         return v0
    */

    @JvmStatic fun g(p0: com.google.android.gms.fitness.data.Session.Builder): com.google.android.gms.fitness.data.a { return TODO("body: (Lcom/google/android/gms/fitness/data/Session$Builder;)Lcom/google/android/gms/fitness/data/a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$Builder;->SP:Lcom/google/android/gms/fitness/data/a;
    //         return-object v0
    */

    }
}
