package com.google.android.gms.fitness.data

// Auto-emitted from smali.
// 11 fields, 25 methods.

open class Session: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val KS: Long
    private val SC: Int
    private val SP: com.google.android.gms.fitness.data.a
    private val Sr: Long
    private val Tq: String
    private val Tr: String
    private val mName: String

    constructor(versionCode: Int, startTimeMillis: Long, endTimeMillis: Long, name: String, identifier: String, description: String, activityType: Int, application: com.google.android.gms.fitness.data.a)

    private constructor(builder: com.google.android.gms.fitness.data.Session.Builder)

    constructor(x0: com.google.android.gms.fitness.data.Session.Builder, x1: com.google.android.gms.fitness.data.Session.1)

    private fun a(p0: com.google.android.gms.fitness.data.Session): Boolean { return TODO("body: (Lcom/google/android/gms/fitness/data/Session;)Z") }
    /*
    //         .locals 4
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->KS:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/Session;->KS:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->Sr:J
    //         iget-wide v2, p1, Lcom/google/android/gms/fitness/data/Session;->Sr:J
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->mName:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/Session;->mName:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->Tq:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/Session;->Tq:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->Tr:Ljava/lang/String;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/Session;->Tr:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->SP:Lcom/google/android/gms/fitness/data/a;
    //         iget-object v1, p1, Lcom/google/android/gms/fitness/data/Session;->SP:Lcom/google/android/gms/fitness/data/a;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Session;->SC:I
    //         iget v1, p1, Lcom/google/android/gms/fitness/data/Session;->SC:I
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
    //         instance-of v0, p1, Lcom/google/android/gms/fitness/data/Session;
    //         if-eqz v0, :cond_1
    //         check-cast p1, Lcom/google/android/gms/fitness/data/Session;
    //         .end local p1    # "o":Ljava/lang/Object;
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/data/Session;->a(Lcom/google/android/gms/fitness/data/Session;)Z
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
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Session;->SC:I
    //         invoke-static {v0}, Lcom/google/android/gms/fitness/FitnessActivities;->getName(I)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getAppPackageName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->SP:Lcom/google/android/gms/fitness/data/a;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->SP:Lcom/google/android/gms/fitness/data/a;
    //         invoke-virtual {v0}, Lcom/google/android/gms/fitness/data/a;->getPackageName()Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getDescription(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->Tr:Ljava/lang/String;
    //         return-object v0
    */

    public fun getEndTime(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->Sr:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getIdentifier(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->Tq:Ljava/lang/String;
    //         return-object v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->mName:Ljava/lang/String;
    //         return-object v0
    */

    public fun getStartTime(timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 3
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->KS:J
    //         sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Session;->BR:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Session;->KS:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Session;->Sr:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Session;->Tq:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun iB(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/fitness/data/Session;->SC:I
    //         return v0
    */

    public fun iD(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->KS:J
    //         return-wide v0
    */

    public fun iE(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->Sr:J
    //         return-wide v0
    */

    public fun iM(): com.google.android.gms.fitness.data.a { return TODO("body: ()Lcom/google/android/gms/fitness/data/a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session;->SP:Lcom/google/android/gms/fitness/data/a;
    //         return-object v0
    */

    public fun isOngoing(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session;->Sr:J
    //         const-wide/16 v2, 0x0
    //         cmp-long v0, v0, v2
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         invoke-static {p0}, Lcom/google/android/gms/common/internal/n;->h(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "startTime"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Session;->KS:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "endTime"
    //         iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Session;->Sr:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "name"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Session;->mName:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "identifier"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Session;->Tq:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "description"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Session;->Tr:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "activity"
    //         iget v2, p0, Lcom/google/android/gms/fitness/data/Session;->SC:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         const-string v1, "application"
    //         iget-object v2, p0, Lcom/google/android/gms/fitness/data/Session;->SP:Lcom/google/android/gms/fitness/data/a;
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/n$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/n$a;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/internal/n$a;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/fitness/data/p;->a(Lcom/google/android/gms/fitness/data/Session;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    @JvmField public val EXTRA_SESSION: String = "vnd.google.fitness.session"
    @JvmField public val MIME_TYPE_PREFIX: String = "vnd.google.fitness.session/"

    public @JvmStatic fun extract(intent: android.content.Intent): com.google.android.gms.fitness.data.Session { return TODO("body: (Landroid/content/Intent;)Lcom/google/android/gms/fitness/data/Session;") }
    /*
    //         .locals 2
    //         if-nez p0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "vnd.google.fitness.session"
    //         sget-object v1, Lcom/google/android/gms/fitness/data/Session;->CREATOR:Landroid/os/Parcelable$Creator;
    //         invoke-static {p0, v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/c;->a(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/fitness/data/Session;
    //         goto :goto_0
    */

    public @JvmStatic fun getMimeType(activity: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v1, "vnd.google.fitness.session/"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
