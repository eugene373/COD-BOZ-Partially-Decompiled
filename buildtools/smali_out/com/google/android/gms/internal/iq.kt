package com.google.android.gms.internal

// Auto-emitted from smali.
// 21 fields, 29 methods.

open class iq: com.google.android.gms.internal.ii() {
    private var Hf: Long
    private var Hg: com.google.android.gms.cast.MediaStatus
    private val Hh: com.google.android.gms.internal.it
    private val Hi: com.google.android.gms.internal.it
    private val Hj: com.google.android.gms.internal.it
    private val Hk: com.google.android.gms.internal.it
    private val Hl: com.google.android.gms.internal.it
    private val Hm: com.google.android.gms.internal.it
    private val Hn: com.google.android.gms.internal.it
    private val Ho: com.google.android.gms.internal.it
    private val Hp: com.google.android.gms.internal.it
    private val Hq: com.google.android.gms.internal.it
    private val Hr: java.util.List
    private val Hs: Runnable
    private var Ht: Boolean
    private val mHandler: android.os.Handler

    public constructor()

    public constructor(p0: String)

    private fun H(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 4
    //         iget-boolean v0, p0, Lcom/google/android/gms/internal/iq;->Ht:Z
    //         if-eq v0, p1, :cond_0
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/iq;->Ht:Z
    //         if-eqz p1, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->mHandler:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hs:Ljava/lang/Runnable;
    //         sget-wide v2, Lcom/google/android/gms/internal/iq;->He:J
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->mHandler:Landroid/os/Handler;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hs:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    //         goto :goto_0
    */

    private fun a(p0: Long, p1: org.json.JSONObject) { /* TODO(body): (JLorg/json/JSONObject;)V */ }
    /*
    //         .locals 7
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hh:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/it;->p(J)Z
    //         move-result v3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hl:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/it;->fV()Z
    //         move-result v0
    //         if-eqz v0, :cond_7
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hl:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/it;->p(J)Z
    //         move-result v0
    //         if-nez v0, :cond_7
    //         move v0, v1
    //         :goto_0
    //         iget-object v4, p0, Lcom/google/android/gms/internal/iq;->Hm:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v4}, Lcom/google/android/gms/internal/it;->fV()Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         iget-object v4, p0, Lcom/google/android/gms/internal/iq;->Hm:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v4, p1, p2}, Lcom/google/android/gms/internal/it;->p(J)Z
    //         move-result v4
    //         if-eqz v4, :cond_1
    //         :cond_0
    //         iget-object v4, p0, Lcom/google/android/gms/internal/iq;->Hn:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v4}, Lcom/google/android/gms/internal/it;->fV()Z
    //         move-result v4
    //         if-eqz v4, :cond_8
    //         iget-object v4, p0, Lcom/google/android/gms/internal/iq;->Hn:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v4, p1, p2}, Lcom/google/android/gms/internal/it;->p(J)Z
    //         move-result v4
    //         if-nez v4, :cond_8
    //         :cond_1
    //         :goto_1
    //         if-eqz v0, :cond_b
    //         const/4 v0, 0x2
    //         :goto_2
    //         if-eqz v1, :cond_2
    //         or-int/lit8 v0, v0, 0x1
    //         :cond_2
    //         if-nez v3, :cond_3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         if-nez v1, :cond_9
    //         :cond_3
    //         new-instance v0, Lcom/google/android/gms/cast/MediaStatus;
    //         invoke-direct {v0, p3}, Lcom/google/android/gms/cast/MediaStatus;-><init>(Lorg/json/JSONObject;)V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/iq;->Hf:J
    //         const/4 v0, 0x7
    //         :goto_3
    //         and-int/lit8 v1, v0, 0x1
    //         if-eqz v1, :cond_4
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v4
    //         iput-wide v4, p0, Lcom/google/android/gms/internal/iq;->Hf:J
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->onStatusUpdated()V
    //         :cond_4
    //         and-int/lit8 v1, v0, 0x2
    //         if-eqz v1, :cond_5
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v4
    //         iput-wide v4, p0, Lcom/google/android/gms/internal/iq;->Hf:J
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->onStatusUpdated()V
    //         :cond_5
    //         and-int/lit8 v0, v0, 0x4
    //         if-eqz v0, :cond_6
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->onMetadataUpdated()V
    //         :cond_6
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hr:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_4
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_a
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v0, p1, p2, v2}, Lcom/google/android/gms/internal/it;->d(JI)Z
    //         goto :goto_4
    //         :cond_7
    //         move v0, v2
    //         goto :goto_0
    //         :cond_8
    //         move v1, v2
    //         goto :goto_1
    //         :cond_9
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         invoke-virtual {v1, p3, v0}, Lcom/google/android/gms/cast/MediaStatus;->a(Lorg/json/JSONObject;I)I
    //         move-result v0
    //         goto :goto_3
    //         :cond_a
    //         return-void
    //         :cond_b
    //         move v0, v2
    //         goto :goto_2
    */

    private fun fT() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/internal/iq;->H(Z)V
    //         const-wide/16 v0, 0x0
    //         iput-wide v0, p0, Lcom/google/android/gms/internal/iq;->Hf:J
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hh:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/it;->clear()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hl:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/it;->clear()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hm:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/it;->clear()V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.internal.is): Long { return TODO("body: (Lcom/google/android/gms/internal/is;)J") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fz()J
    //         move-result-wide v2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Ho:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/it;->a(JLcom/google/android/gms/internal/is;)V
    //         const/4 v1, 0x1
    //         invoke-direct {p0, v1}, Lcom/google/android/gms/internal/iq;->H(Z)V
    //         :try_start_0
    //         const-string v1, "requestId"
    //         invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         const-string v1, "type"
    //         const-string v4, "GET_STATUS"
    //         invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         if-eqz v1, :cond_0
    //         const-string v1, "mediaSessionId"
    //         iget-object v4, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         invoke-virtual {v4}, Lcom/google/android/gms/cast/MediaStatus;->fw()J
    //         move-result-wide v4
    //         invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/iq;->a(Ljava/lang/String;JLjava/lang/String;)V
    //         return-wide v2
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.internal.is, p1: Double, p2: org.json.JSONObject): Long { return TODO("body: (Lcom/google/android/gms/internal/is;DLorg/json/JSONObject;)J") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;,
    //                 Ljava/lang/IllegalStateException;,
    //                 Ljava/lang/IllegalArgumentException;
    //             }
    //         .end annotation
    //         invoke-static {p2, p3}, Ljava/lang/Double;->isInfinite(D)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Volume cannot be "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fz()J
    //         move-result-wide v2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hm:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/it;->a(JLcom/google/android/gms/internal/is;)V
    //         const/4 v1, 0x1
    //         invoke-direct {p0, v1}, Lcom/google/android/gms/internal/iq;->H(Z)V
    //         :try_start_0
    //         const-string v1, "requestId"
    //         invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         const-string v1, "type"
    //         const-string v4, "SET_VOLUME"
    //         invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "mediaSessionId"
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fw()J
    //         move-result-wide v4
    //         invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         new-instance v1, Lorg/json/JSONObject;
    //         invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    //         const-string v4, "level"
    //         invoke-virtual {v1, v4, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    //         const-string v4, "volume"
    //         invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         if-eqz p4, :cond_2
    //         const-string v1, "customData"
    //         invoke-virtual {v0, v1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_2
    //         :goto_0
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/iq;->a(Ljava/lang/String;JLjava/lang/String;)V
    //         return-wide v2
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.internal.is, p1: Long, p2: Int, p3: org.json.JSONObject): Long { return TODO("body: (Lcom/google/android/gms/internal/is;JILorg/json/JSONObject;)J") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;,
    //                 Ljava/lang/IllegalStateException;
    //             }
    //         .end annotation
    //         const/4 v6, 0x1
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fz()J
    //         move-result-wide v2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hl:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/it;->a(JLcom/google/android/gms/internal/is;)V
    //         invoke-direct {p0, v6}, Lcom/google/android/gms/internal/iq;->H(Z)V
    //         :try_start_0
    //         const-string v1, "requestId"
    //         invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         const-string v1, "type"
    //         const-string v4, "SEEK"
    //         invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "mediaSessionId"
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fw()J
    //         move-result-wide v4
    //         invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         const-string v1, "currentTime"
    //         invoke-static {p2, p3}, Lcom/google/android/gms/internal/ik;->o(J)D
    //         move-result-wide v4
    //         invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    //         if-ne p4, v6, :cond_2
    //         const-string v1, "resumeState"
    //         const-string v4, "PLAYBACK_START"
    //         invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_0
    //         :goto_0
    //         if-eqz p5, :cond_1
    //         const-string v1, "customData"
    //         invoke-virtual {v0, v1, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_1
    //         :goto_1
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/iq;->a(Ljava/lang/String;JLjava/lang/String;)V
    //         return-wide v2
    //         :cond_2
    //         const/4 v1, 0x2
    //         if-ne p4, v1, :cond_0
    //         :try_start_1
    //         const-string v1, "resumeState"
    //         const-string v4, "PLAYBACK_PAUSE"
    //         invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_1
    //         .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.internal.is, p1: com.google.android.gms.cast.MediaInfo, p2: Boolean, p3: Long, p4: LongArray, p5: org.json.JSONObject): Long { return TODO("body: (Lcom/google/android/gms/internal/is;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)J") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v1, Lorg/json/JSONObject;
    //         invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fz()J
    //         move-result-wide v2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hh:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v0, v2, v3, p1}, Lcom/google/android/gms/internal/it;->a(JLcom/google/android/gms/internal/is;)V
    //         const/4 v0, 0x1
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/internal/iq;->H(Z)V
    //         :try_start_0
    //         const-string v0, "requestId"
    //         invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         const-string v0, "type"
    //         const-string v4, "LOAD"
    //         invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v0, "media"
    //         invoke-virtual {p2}, Lcom/google/android/gms/cast/MediaInfo;->bK()Lorg/json/JSONObject;
    //         move-result-object v4
    //         invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v0, "autoplay"
    //         invoke-virtual {v1, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         const-string v0, "currentTime"
    //         invoke-static {p4, p5}, Lcom/google/android/gms/internal/ik;->o(J)D
    //         move-result-wide v4
    //         invoke-virtual {v1, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    //         if-eqz p6, :cond_1
    //         array-length v0, p6
    //         if-lez v0, :cond_1
    //         new-instance v4, Lorg/json/JSONArray;
    //         invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V
    //         const/4 v0, 0x0
    //         :goto_0
    //         array-length v5, p6
    //         if-ge v0, v5, :cond_0
    //         aget-wide v6, p6, v0
    //         invoke-virtual {v4, v0, v6, v7}, Lorg/json/JSONArray;->put(IJ)Lorg/json/JSONArray;
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         const-string v0, "activeTrackIds"
    //         invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_1
    //         if-eqz p7, :cond_2
    //         const-string v0, "customData"
    //         invoke-virtual {v1, v0, p7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_2
    //         :goto_1
    //         invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/iq;->a(Ljava/lang/String;JLjava/lang/String;)V
    //         return-wide v2
    //         :catch_0
    //         move-exception v0
    //         goto :goto_1
    */

    public fun a(p0: com.google.android.gms.internal.is, p1: com.google.android.gms.cast.TextTrackStyle): Long { return TODO("body: (Lcom/google/android/gms/internal/is;Lcom/google/android/gms/cast/TextTrackStyle;)J") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fz()J
    //         move-result-wide v2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hq:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/it;->a(JLcom/google/android/gms/internal/is;)V
    //         const/4 v1, 0x1
    //         invoke-direct {p0, v1}, Lcom/google/android/gms/internal/iq;->H(Z)V
    //         :try_start_0
    //         const-string v1, "requestId"
    //         invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         const-string v1, "type"
    //         const-string v4, "EDIT_TRACKS_INFO"
    //         invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         if-eqz p2, :cond_0
    //         const-string v1, "textTrackStyle"
    //         invoke-virtual {p2}, Lcom/google/android/gms/cast/TextTrackStyle;->bK()Lorg/json/JSONObject;
    //         move-result-object v4
    //         invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_0
    //         const-string v1, "mediaSessionId"
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fw()J
    //         move-result-wide v4
    //         invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/iq;->a(Ljava/lang/String;JLjava/lang/String;)V
    //         return-wide v2
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.internal.is, p1: org.json.JSONObject): Long { return TODO("body: (Lcom/google/android/gms/internal/is;Lorg/json/JSONObject;)J") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fz()J
    //         move-result-wide v2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hi:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/it;->a(JLcom/google/android/gms/internal/is;)V
    //         const/4 v1, 0x1
    //         invoke-direct {p0, v1}, Lcom/google/android/gms/internal/iq;->H(Z)V
    //         :try_start_0
    //         const-string v1, "requestId"
    //         invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         const-string v1, "type"
    //         const-string v4, "PAUSE"
    //         invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "mediaSessionId"
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fw()J
    //         move-result-wide v4
    //         invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         if-eqz p2, :cond_0
    //         const-string v1, "customData"
    //         invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/iq;->a(Ljava/lang/String;JLjava/lang/String;)V
    //         return-wide v2
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.internal.is, p1: Boolean, p2: org.json.JSONObject): Long { return TODO("body: (Lcom/google/android/gms/internal/is;ZLorg/json/JSONObject;)J") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;,
    //                 Ljava/lang/IllegalStateException;
    //             }
    //         .end annotation
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fz()J
    //         move-result-wide v2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hn:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/it;->a(JLcom/google/android/gms/internal/is;)V
    //         const/4 v1, 0x1
    //         invoke-direct {p0, v1}, Lcom/google/android/gms/internal/iq;->H(Z)V
    //         :try_start_0
    //         const-string v1, "requestId"
    //         invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         const-string v1, "type"
    //         const-string v4, "SET_VOLUME"
    //         invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "mediaSessionId"
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fw()J
    //         move-result-wide v4
    //         invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         new-instance v1, Lorg/json/JSONObject;
    //         invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    //         const-string v4, "muted"
    //         invoke-virtual {v1, v4, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //         const-string v4, "volume"
    //         invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         if-eqz p3, :cond_0
    //         const-string v1, "customData"
    //         invoke-virtual {v0, v1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/iq;->a(Ljava/lang/String;JLjava/lang/String;)V
    //         return-wide v2
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.internal.is, p1: LongArray): Long { return TODO("body: (Lcom/google/android/gms/internal/is;[J)J") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v1, Lorg/json/JSONObject;
    //         invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fz()J
    //         move-result-wide v2
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hp:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v0, v2, v3, p1}, Lcom/google/android/gms/internal/it;->a(JLcom/google/android/gms/internal/is;)V
    //         const/4 v0, 0x1
    //         invoke-direct {p0, v0}, Lcom/google/android/gms/internal/iq;->H(Z)V
    //         :try_start_0
    //         const-string v0, "requestId"
    //         invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         const-string v0, "type"
    //         const-string v4, "EDIT_TRACKS_INFO"
    //         invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v0, "mediaSessionId"
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fw()J
    //         move-result-wide v4
    //         invoke-virtual {v1, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         new-instance v4, Lorg/json/JSONArray;
    //         invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V
    //         const/4 v0, 0x0
    //         :goto_0
    //         array-length v5, p2
    //         if-ge v0, v5, :cond_0
    //         aget-wide v6, p2, v0
    //         invoke-virtual {v4, v0, v6, v7}, Lorg/json/JSONArray;->put(IJ)Lorg/json/JSONArray;
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         const-string v0, "activeTrackIds"
    //         invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/iq;->a(Ljava/lang/String;JLjava/lang/String;)V
    //         return-wide v2
    //         :catch_0
    //         move-exception v0
    //         goto :goto_1
    */

    public fun aD(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 8
    //         const/4 v7, 0x1
    //         const/4 v6, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Go:Lcom/google/android/gms/internal/ip;
    //         const-string v1, "message received: %s"
    //         new-array v2, v7, [Ljava/lang/Object;
    //         aput-object p1, v2, v6
    //         invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ip;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    //         :try_start_0
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    //         const-string v1, "type"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "requestId"
    //         const-wide/16 v4, -0x1
    //         invoke-virtual {v0, v2, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J
    //         move-result-wide v2
    //         const-string v4, "MEDIA_STATUS"
    //         invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         const-string v1, "status"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
    //         move-result v1
    //         if-lez v1, :cond_1
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
    //         move-result-object v0
    //         invoke-direct {p0, v2, v3, v0}, Lcom/google/android/gms/internal/iq;->a(JLorg/json/JSONObject;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->onStatusUpdated()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->onMetadataUpdated()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Ho:Lcom/google/android/gms/internal/it;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v2, v3, v1}, Lcom/google/android/gms/internal/it;->d(JI)Z
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Go:Lcom/google/android/gms/internal/ip;
    //         const-string v2, "Message is malformed (%s); ignoring: %s"
    //         const/4 v3, 0x2
    //         new-array v3, v3, [Ljava/lang/Object;
    //         invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
    //         move-result-object v0
    //         aput-object v0, v3, v6
    //         aput-object p1, v3, v7
    //         invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ip;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    //         goto :goto_0
    //         :cond_2
    //         :try_start_1
    //         const-string v4, "INVALID_PLAYER_STATE"
    //         invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_3
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Go:Lcom/google/android/gms/internal/ip;
    //         const-string v4, "received unexpected error: Invalid Player State."
    //         const/4 v5, 0x0
    //         new-array v5, v5, [Ljava/lang/Object;
    //         invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/ip;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    //         const-string v1, "customData"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hr:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :goto_1
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/it;
    //         const/16 v5, 0x834
    //         invoke-virtual {v0, v2, v3, v5, v1}, Lcom/google/android/gms/internal/it;->b(JILorg/json/JSONObject;)Z
    //         goto :goto_1
    //         :cond_3
    //         const-string v4, "LOAD_FAILED"
    //         invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_4
    //         const-string v1, "customData"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hh:Lcom/google/android/gms/internal/it;
    //         const/16 v4, 0x834
    //         invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/it;->b(JILorg/json/JSONObject;)Z
    //         goto :goto_0
    //         :cond_4
    //         const-string v4, "LOAD_CANCELLED"
    //         invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_5
    //         const-string v1, "customData"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hh:Lcom/google/android/gms/internal/it;
    //         const/16 v4, 0x835
    //         invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/it;->b(JILorg/json/JSONObject;)Z
    //         goto :goto_0
    //         :cond_5
    //         const-string v4, "INVALID_REQUEST"
    //         invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Go:Lcom/google/android/gms/internal/ip;
    //         const-string v4, "received unexpected error: Invalid Request."
    //         const/4 v5, 0x0
    //         new-array v5, v5, [Ljava/lang/Object;
    //         invoke-virtual {v1, v4, v5}, Lcom/google/android/gms/internal/ip;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    //         const-string v1, "customData"
    //         invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hr:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v4
    //         :goto_2
    //         invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/it;
    //         const/16 v5, 0x834
    //         invoke-virtual {v0, v2, v3, v5, v1}, Lcom/google/android/gms/internal/it;->b(JILorg/json/JSONObject;)Z
    //         :try_end_1
    //         .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_2
    */

    public fun b(p0: com.google.android.gms.internal.is, p1: org.json.JSONObject): Long { return TODO("body: (Lcom/google/android/gms/internal/is;Lorg/json/JSONObject;)J") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;
    //             }
    //         .end annotation
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fz()J
    //         move-result-wide v2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hk:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/it;->a(JLcom/google/android/gms/internal/is;)V
    //         const/4 v1, 0x1
    //         invoke-direct {p0, v1}, Lcom/google/android/gms/internal/iq;->H(Z)V
    //         :try_start_0
    //         const-string v1, "requestId"
    //         invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         const-string v1, "type"
    //         const-string v4, "STOP"
    //         invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "mediaSessionId"
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fw()J
    //         move-result-wide v4
    //         invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         if-eqz p2, :cond_0
    //         const-string v1, "customData"
    //         invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/iq;->a(Ljava/lang/String;JLjava/lang/String;)V
    //         return-wide v2
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun b(p0: Long, p1: Int) { /* TODO(body): (JI)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hr:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :goto_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/it;->d(JI)Z
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    public fun c(p0: com.google.android.gms.internal.is, p1: org.json.JSONObject): Long { return TODO("body: (Lcom/google/android/gms/internal/is;Lorg/json/JSONObject;)J") }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/io/IOException;,
    //                 Ljava/lang/IllegalStateException;
    //             }
    //         .end annotation
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fz()J
    //         move-result-wide v2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/iq;->Hj:Lcom/google/android/gms/internal/it;
    //         invoke-virtual {v1, v2, v3, p1}, Lcom/google/android/gms/internal/it;->a(JLcom/google/android/gms/internal/is;)V
    //         const/4 v1, 0x1
    //         invoke-direct {p0, v1}, Lcom/google/android/gms/internal/iq;->H(Z)V
    //         :try_start_0
    //         const-string v1, "requestId"
    //         invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         const-string v1, "type"
    //         const-string v4, "PLAY"
    //         invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "mediaSessionId"
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->fw()J
    //         move-result-wide v4
    //         invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         if-eqz p2, :cond_0
    //         const-string v1, "customData"
    //         invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {p0, v0, v2, v3, v1}, Lcom/google/android/gms/internal/iq;->a(Ljava/lang/String;JLjava/lang/String;)V
    //         return-wide v2
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun fA() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/iq;->fT()V
    //         return-void
    */

    public fun fw(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalStateException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "No current media session"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->fw()J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getApproximateStreamPosition(): Long { return TODO("body: ()J") }
    /*
    //         .locals 12
    //         const-wide/16 v2, 0x0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;
    //         move-result-object v8
    //         if-nez v8, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-wide v2
    //         :cond_1
    //         iget-wide v0, p0, Lcom/google/android/gms/internal/iq;->Hf:J
    //         cmp-long v0, v0, v2
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->getPlaybackRate()D
    //         move-result-wide v10
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->getStreamPosition()J
    //         move-result-wide v4
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->getPlayerState()I
    //         move-result v0
    //         const-wide/16 v6, 0x0
    //         cmpl-double v1, v10, v6
    //         if-eqz v1, :cond_2
    //         const/4 v1, 0x2
    //         if-eq v0, v1, :cond_3
    //         :cond_2
    //         move-wide v2, v4
    //         goto :goto_0
    //         :cond_3
    //         invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J
    //         move-result-wide v0
    //         iget-wide v6, p0, Lcom/google/android/gms/internal/iq;->Hf:J
    //         sub-long/2addr v0, v6
    //         cmp-long v6, v0, v2
    //         if-gez v6, :cond_7
    //         move-wide v6, v2
    //         :goto_1
    //         cmp-long v0, v6, v2
    //         if-nez v0, :cond_4
    //         move-wide v2, v4
    //         goto :goto_0
    //         :cond_4
    //         invoke-virtual {v8}, Lcom/google/android/gms/cast/MediaInfo;->getStreamDuration()J
    //         move-result-wide v0
    //         long-to-double v6, v6
    //         mul-double/2addr v6, v10
    //         double-to-long v6, v6
    //         add-long/2addr v4, v6
    //         cmp-long v6, v0, v2
    //         if-lez v6, :cond_5
    //         cmp-long v6, v4, v0
    //         if-lez v6, :cond_5
    //         :goto_2
    //         move-wide v2, v0
    //         goto :goto_0
    //         :cond_5
    //         cmp-long v0, v4, v2
    //         if-gez v0, :cond_6
    //         move-wide v0, v2
    //         goto :goto_2
    //         :cond_6
    //         move-wide v0, v4
    //         goto :goto_2
    //         :cond_7
    //         move-wide v6, v0
    //         goto :goto_1
    */

    public fun getMediaInfo(): com.google.android.gms.cast.MediaInfo { return TODO("body: ()Lcom/google/android/gms/cast/MediaInfo;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getMediaStatus(): com.google.android.gms.cast.MediaStatus { return TODO("body: ()Lcom/google/android/gms/cast/MediaStatus;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hg:Lcom/google/android/gms/cast/MediaStatus;
    //         return-object v0
    */

    public fun getStreamDuration(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/iq;->getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaInfo;->getStreamDuration()J
    //         move-result-wide v0
    //         :goto_0
    //         return-wide v0
    //         :cond_0
    //         const-wide/16 v0, 0x0
    //         goto :goto_0
    */

    protected fun onMetadataUpdated() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    protected fun onStatusUpdated() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    companion object {
    private val Hb: Long = 0L
    private val Hc: Long = 0L
    private val Hd: Long = 0L
    private val He: Long = 0L
    private val NAMESPACE: String = null!!

    @JvmStatic fun a(p0: com.google.android.gms.internal.iq): java.util.List { return TODO("body: (Lcom/google/android/gms/internal/iq;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/iq;->Hr:Ljava/util/List;
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.internal.iq, p1: Boolean): Boolean { return TODO("body: (Lcom/google/android/gms/internal/iq;Z)Z") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/google/android/gms/internal/iq;->Ht:Z
    //         return p1
    */

    @JvmStatic fun b(p0: com.google.android.gms.internal.iq, p1: Boolean) { /* TODO(body): (Lcom/google/android/gms/internal/iq;Z)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/internal/iq;->H(Z)V
    //         return-void
    */

    }
}
