package com.google.android.gms.fitness

// Auto-emitted from smali.
// 21 fields, 5 methods.

open class Fitness {
    private constructor()

    companion object {
    @JvmField public val ACTION_TRACK: String = "vnd.google.fitness.TRACK"
    @JvmField public val ACTION_VIEW: String = "vnd.google.fitness.VIEW"
    @JvmField public val ACTION_VIEW_GOAL: String = "vnd.google.fitness.VIEW_GOAL"
    @JvmField public val API: com.google.android.gms.common.api.Api = null!!
    @JvmField public val BleApi: com.google.android.gms.fitness.BleApi = null!!
    @JvmField public val CU: com.google.android.gms.common.api.Api.c = null!!
    private val CV: com.google.android.gms.common.api.Api.b = null!!
    @JvmField public val ConfigApi: com.google.android.gms.fitness.ConfigApi = null!!
    @JvmField public val EXTRA_END_TIME: String = "vnd.google.fitness.end_time"
    @JvmField public val EXTRA_START_TIME: String = "vnd.google.fitness.start_time"
    @JvmField public val HistoryApi: com.google.android.gms.fitness.HistoryApi = null!!
    @JvmField public val RecordingApi: com.google.android.gms.fitness.RecordingApi = null!!
    @JvmField public val SCOPE_ACTIVITY_READ: com.google.android.gms.common.api.Scope = null!!
    @JvmField public val SCOPE_ACTIVITY_READ_WRITE: com.google.android.gms.common.api.Scope = null!!
    @JvmField public val SCOPE_BODY_READ: com.google.android.gms.common.api.Scope = null!!
    @JvmField public val SCOPE_BODY_READ_WRITE: com.google.android.gms.common.api.Scope = null!!
    @JvmField public val SCOPE_LOCATION_READ: com.google.android.gms.common.api.Scope = null!!
    @JvmField public val SCOPE_LOCATION_READ_WRITE: com.google.android.gms.common.api.Scope = null!!
    @JvmField public val SensorsApi: com.google.android.gms.fitness.SensorsApi = null!!
    @JvmField public val SessionsApi: com.google.android.gms.fitness.SessionsApi = null!!
    @JvmField public val Sn: com.google.android.gms.internal.kv = null!!

    public @JvmStatic fun getEndTime(intent: android.content.Intent, timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Landroid/content/Intent;Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 5
    //         const-wide/16 v0, -0x1
    //         const-string v2, "vnd.google.fitness.end_time"
    //         invoke-virtual {p0, v2, v0, v1}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J
    //         move-result-wide v2
    //         cmp-long v4, v2, v0
    //         if-nez v4, :cond_0
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v2, v3, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         goto :goto_0
    */

    public @JvmStatic fun getStartTime(intent: android.content.Intent, timeUnit: java.util.concurrent.TimeUnit): Long { return TODO("body: (Landroid/content/Intent;Ljava/util/concurrent/TimeUnit;)J") }
    /*
    //         .locals 5
    //         const-wide/16 v0, -0x1
    //         const-string v2, "vnd.google.fitness.start_time"
    //         invoke-virtual {p0, v2, v0, v1}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J
    //         move-result-wide v2
    //         cmp-long v4, v2, v0
    //         if-nez v4, :cond_0
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;
    //         invoke-virtual {p1, v2, v3, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J
    //         move-result-wide v0
    //         goto :goto_0
    */

    private @JvmStatic fun iy(): com.google.android.gms.fitness.BleApi { return TODO("body: ()Lcom/google/android/gms/fitness/BleApi;") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x12
    //         if-lt v0, v1, :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/kx;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/kx;-><init>()V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/le;
    //         invoke-direct {v0}, Lcom/google/android/gms/internal/le;-><init>()V
    //         goto :goto_0
    */

    }
}
