package com.google.android.gms.cast

// Auto-emitted from smali.
// 27 fields, 13 methods.

class MediaStatus {
    private var FA: Double
    private var FB: Boolean
    private var FC: LongArray
    private var Fl: org.json.JSONObject
    private var Fm: com.google.android.gms.cast.MediaInfo
    private var Fu: Long
    private var Fv: Double
    private var Fw: Int
    private var Fx: Int
    private var Fy: Long
    private var Fz: Long

    public constructor(json: org.json.JSONObject)

    public fun a(p0: org.json.JSONObject, p1: Int): Int { return TODO("body: (Lorg/json/JSONObject;I)I") }
    /*
    //         .locals 12
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const/4 v6, 0x4
    //         const/4 v5, 0x3
    //         const/4 v4, 0x2
    //         const/4 v2, 0x0
    //         const/4 v1, 0x1
    //         const-string v0, "mediaSessionId"
    //         invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
    //         move-result-wide v8
    //         iget-wide v10, p0, Lcom/google/android/gms/cast/MediaStatus;->Fu:J
    //         cmp-long v0, v8, v10
    //         if-eqz v0, :cond_19
    //         iput-wide v8, p0, Lcom/google/android/gms/cast/MediaStatus;->Fu:J
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "playerState"
    //         invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         const-string v3, "playerState"
    //         invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v7, "IDLE"
    //         invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v7
    //         if-eqz v7, :cond_7
    //         move v3, v1
    //         :goto_1
    //         iget v7, p0, Lcom/google/android/gms/cast/MediaStatus;->Fw:I
    //         if-eq v3, v7, :cond_0
    //         iput v3, p0, Lcom/google/android/gms/cast/MediaStatus;->Fw:I
    //         or-int/lit8 v0, v0, 0x2
    //         :cond_0
    //         if-ne v3, v1, :cond_1
    //         const-string v3, "idleReason"
    //         invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         const-string v3, "idleReason"
    //         invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         const-string v7, "CANCELLED"
    //         invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v7
    //         if-eqz v7, :cond_a
    //         :goto_2
    //         iget v3, p0, Lcom/google/android/gms/cast/MediaStatus;->Fx:I
    //         if-eq v4, v3, :cond_1
    //         iput v4, p0, Lcom/google/android/gms/cast/MediaStatus;->Fx:I
    //         or-int/lit8 v0, v0, 0x2
    //         :cond_1
    //         const-string v3, "playbackRate"
    //         invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_2
    //         const-string v3, "playbackRate"
    //         invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D
    //         move-result-wide v4
    //         iget-wide v6, p0, Lcom/google/android/gms/cast/MediaStatus;->Fv:D
    //         cmpl-double v3, v6, v4
    //         if-eqz v3, :cond_2
    //         iput-wide v4, p0, Lcom/google/android/gms/cast/MediaStatus;->Fv:D
    //         or-int/lit8 v0, v0, 0x2
    //         :cond_2
    //         const-string v3, "currentTime"
    //         invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_3
    //         and-int/lit8 v3, p2, 0x2
    //         if-nez v3, :cond_3
    //         const-string v3, "currentTime"
    //         invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D
    //         move-result-wide v4
    //         invoke-static {v4, v5}, Lcom/google/android/gms/internal/ik;->b(D)J
    //         move-result-wide v4
    //         iget-wide v6, p0, Lcom/google/android/gms/cast/MediaStatus;->Fy:J
    //         cmp-long v3, v4, v6
    //         if-eqz v3, :cond_3
    //         iput-wide v4, p0, Lcom/google/android/gms/cast/MediaStatus;->Fy:J
    //         or-int/lit8 v0, v0, 0x2
    //         :cond_3
    //         const-string v3, "supportedMediaCommands"
    //         invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_4
    //         const-string v3, "supportedMediaCommands"
    //         invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
    //         move-result-wide v4
    //         iget-wide v6, p0, Lcom/google/android/gms/cast/MediaStatus;->Fz:J
    //         cmp-long v3, v4, v6
    //         if-eqz v3, :cond_4
    //         iput-wide v4, p0, Lcom/google/android/gms/cast/MediaStatus;->Fz:J
    //         or-int/lit8 v0, v0, 0x2
    //         :cond_4
    //         const-string v3, "volume"
    //         invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_6
    //         and-int/lit8 v3, p2, 0x1
    //         if-nez v3, :cond_6
    //         const-string v3, "volume"
    //         invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v3
    //         const-string v4, "level"
    //         invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D
    //         move-result-wide v4
    //         iget-wide v6, p0, Lcom/google/android/gms/cast/MediaStatus;->FA:D
    //         cmpl-double v6, v4, v6
    //         if-eqz v6, :cond_5
    //         iput-wide v4, p0, Lcom/google/android/gms/cast/MediaStatus;->FA:D
    //         or-int/lit8 v0, v0, 0x2
    //         :cond_5
    //         const-string v4, "muted"
    //         invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z
    //         move-result v3
    //         iget-boolean v4, p0, Lcom/google/android/gms/cast/MediaStatus;->FB:Z
    //         if-eq v3, v4, :cond_6
    //         iput-boolean v3, p0, Lcom/google/android/gms/cast/MediaStatus;->FB:Z
    //         or-int/lit8 v0, v0, 0x2
    //         :cond_6
    //         const/4 v3, 0x0
    //         const-string v4, "activeTrackIds"
    //         invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v4
    //         if-eqz v4, :cond_14
    //         const-string v3, "activeTrackIds"
    //         invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
    //         move-result-object v5
    //         invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
    //         move-result v6
    //         new-array v3, v6, [J
    //         move v4, v2
    //         :goto_3
    //         if-ge v4, v6, :cond_d
    //         invoke-virtual {v5, v4}, Lorg/json/JSONArray;->getLong(I)J
    //         move-result-wide v8
    //         aput-wide v8, v3, v4
    //         add-int/lit8 v4, v4, 0x1
    //         goto :goto_3
    //         :cond_7
    //         const-string v7, "PLAYING"
    //         invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v7
    //         if-eqz v7, :cond_8
    //         move v3, v4
    //         goto/16 :goto_1
    //         :cond_8
    //         const-string v7, "PAUSED"
    //         invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v7
    //         if-eqz v7, :cond_9
    //         move v3, v5
    //         goto/16 :goto_1
    //         :cond_9
    //         const-string v7, "BUFFERING"
    //         invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_18
    //         move v3, v6
    //         goto/16 :goto_1
    //         :cond_a
    //         const-string v4, "INTERRUPTED"
    //         invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_b
    //         move v4, v5
    //         goto/16 :goto_2
    //         :cond_b
    //         const-string v4, "FINISHED"
    //         invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-eqz v4, :cond_c
    //         move v4, v1
    //         goto/16 :goto_2
    //         :cond_c
    //         const-string v4, "ERROR"
    //         invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v3
    //         if-eqz v3, :cond_17
    //         move v4, v6
    //         goto/16 :goto_2
    //         :cond_d
    //         iget-object v4, p0, Lcom/google/android/gms/cast/MediaStatus;->FC:[J
    //         if-nez v4, :cond_13
    //         :cond_e
    //         :goto_4
    //         if-eqz v1, :cond_f
    //         iput-object v3, p0, Lcom/google/android/gms/cast/MediaStatus;->FC:[J
    //         :cond_f
    //         move v2, v1
    //         move-object v1, v3
    //         :goto_5
    //         if-eqz v2, :cond_10
    //         iput-object v1, p0, Lcom/google/android/gms/cast/MediaStatus;->FC:[J
    //         or-int/lit8 v0, v0, 0x2
    //         :cond_10
    //         const-string v1, "customData"
    //         invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_11
    //         const-string v1, "customData"
    //         invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/google/android/gms/cast/MediaStatus;->Fl:Lorg/json/JSONObject;
    //         or-int/lit8 v0, v0, 0x2
    //         :cond_11
    //         const-string v1, "media"
    //         invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_12
    //         const-string v1, "media"
    //         invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v1
    //         new-instance v2, Lcom/google/android/gms/cast/MediaInfo;
    //         invoke-direct {v2, v1}, Lcom/google/android/gms/cast/MediaInfo;-><init>(Lorg/json/JSONObject;)V
    //         iput-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->Fm:Lcom/google/android/gms/cast/MediaInfo;
    //         or-int/lit8 v0, v0, 0x2
    //         const-string v2, "metadata"
    //         invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_12
    //         or-int/lit8 v0, v0, 0x4
    //         :cond_12
    //         return v0
    //         :cond_13
    //         iget-object v4, p0, Lcom/google/android/gms/cast/MediaStatus;->FC:[J
    //         array-length v4, v4
    //         if-ne v4, v6, :cond_e
    //         move v4, v2
    //         :goto_6
    //         if-ge v4, v6, :cond_16
    //         iget-object v5, p0, Lcom/google/android/gms/cast/MediaStatus;->FC:[J
    //         aget-wide v8, v5, v4
    //         aget-wide v10, v3, v4
    //         cmp-long v5, v8, v10
    //         if-nez v5, :cond_e
    //         add-int/lit8 v4, v4, 0x1
    //         goto :goto_6
    //         :cond_14
    //         iget-object v4, p0, Lcom/google/android/gms/cast/MediaStatus;->FC:[J
    //         if-eqz v4, :cond_15
    //         move v2, v1
    //         move-object v1, v3
    //         goto :goto_5
    //         :cond_15
    //         move-object v1, v3
    //         goto :goto_5
    //         :cond_16
    //         move v1, v2
    //         goto :goto_4
    //         :cond_17
    //         move v4, v2
    //         goto/16 :goto_2
    //         :cond_18
    //         move v3, v2
    //         goto/16 :goto_1
    //         :cond_19
    //         move v0, v2
    //         goto/16 :goto_0
    */

    public fun fw(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/cast/MediaStatus;->Fu:J
    //         return-wide v0
    */

    public fun getActiveTrackIds(): LongArray { return TODO("body: ()[J") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->FC:[J
    //         return-object v0
    */

    public fun getCustomData(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->Fl:Lorg/json/JSONObject;
    //         return-object v0
    */

    public fun getIdleReason(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->Fx:I
    //         return v0
    */

    public fun getMediaInfo(): com.google.android.gms.cast.MediaInfo { return TODO("body: ()Lcom/google/android/gms/cast/MediaInfo;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->Fm:Lcom/google/android/gms/cast/MediaInfo;
    //         return-object v0
    */

    public fun getPlaybackRate(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/cast/MediaStatus;->Fv:D
    //         return-wide v0
    */

    public fun getPlayerState(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->Fw:I
    //         return v0
    */

    public fun getStreamPosition(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/cast/MediaStatus;->Fy:J
    //         return-wide v0
    */

    public fun getStreamVolume(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/cast/MediaStatus;->FA:D
    //         return-wide v0
    */

    public fun isMediaCommandSupported(mediaCommand: Long): Boolean { return TODO("body: (J)Z") }
    /*
    //         .locals 5
    //         iget-wide v0, p0, Lcom/google/android/gms/cast/MediaStatus;->Fz:J
    //         and-long/2addr v0, p1
    //         const-wide/16 v2, 0x0
    //         cmp-long v0, v0, v2
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isMute(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/google/android/gms/cast/MediaStatus;->FB:Z
    //         return v0
    */

    companion object {
    @JvmField public val COMMAND_PAUSE: Long = 0x1L
    @JvmField public val COMMAND_SEEK: Long = 0x2L
    @JvmField public val COMMAND_SET_VOLUME: Long = 0x4L
    @JvmField public val COMMAND_SKIP_BACKWARD: Long = 0x20L
    @JvmField public val COMMAND_SKIP_FORWARD: Long = 0x10L
    @JvmField public val COMMAND_TOGGLE_MUTE: Long = 0x8L
    @JvmField public val IDLE_REASON_CANCELED: Int = 0x2
    @JvmField public val IDLE_REASON_ERROR: Int = 0x4
    @JvmField public val IDLE_REASON_FINISHED: Int = 0x1
    @JvmField public val IDLE_REASON_INTERRUPTED: Int = 0x3
    @JvmField public val IDLE_REASON_NONE: Int = 0x0
    @JvmField public val PLAYER_STATE_BUFFERING: Int = 0x4
    @JvmField public val PLAYER_STATE_IDLE: Int = 0x1
    @JvmField public val PLAYER_STATE_PAUSED: Int = 0x3
    @JvmField public val PLAYER_STATE_PLAYING: Int = 0x2
    @JvmField public val PLAYER_STATE_UNKNOWN: Int = 0
    }
}
