package com.google.android.gms.cast

// Auto-emitted from smali.
// 13 fields, 37 methods.

open class RemoteMediaPlayer: com.google.android.gms.cast.Cast.MessageReceivedCallback {
    private val FG: com.google.android.gms.internal.iq
    private val FH: com.google.android.gms.cast.RemoteMediaPlayer.a
    private var FI: com.google.android.gms.cast.RemoteMediaPlayer.OnMetadataUpdatedListener
    private var FJ: com.google.android.gms.cast.RemoteMediaPlayer.OnStatusUpdatedListener
    private val mw: Object

    public constructor()

    private fun onMetadataUpdated() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FI:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FI:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;
    //         invoke-interface {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;->onMetadataUpdated()V
    //         :cond_0
    //         return-void
    */

    private fun onStatusUpdated() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FJ:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FJ:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;
    //         invoke-interface {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;->onStatusUpdated()V
    //         :cond_0
    //         return-void
    */

    public fun getApproximateStreamPosition(): Long { return TODO("body: ()J") }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FG:Lcom/google/android/gms/internal/iq;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/iq;->getApproximateStreamPosition()J
    //         move-result-wide v2
    //         monitor-exit v1
    //         return-wide v2
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun getMediaInfo(): com.google.android.gms.cast.MediaInfo { return TODO("body: ()Lcom/google/android/gms/cast/MediaInfo;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FG:Lcom/google/android/gms/internal/iq;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/iq;->getMediaInfo()Lcom/google/android/gms/cast/MediaInfo;
    //         move-result-object v0
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun getMediaStatus(): com.google.android.gms.cast.MediaStatus { return TODO("body: ()Lcom/google/android/gms/cast/MediaStatus;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FG:Lcom/google/android/gms/internal/iq;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/iq;->getMediaStatus()Lcom/google/android/gms/cast/MediaStatus;
    //         move-result-object v0
    //         monitor-exit v1
    //         return-object v0
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun getNamespace(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FG:Lcom/google/android/gms/internal/iq;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/iq;->getNamespace()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getStreamDuration(): Long { return TODO("body: ()J") }
    /*
    //         .locals 4
    //         iget-object v1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->mw:Ljava/lang/Object;
    //         monitor-enter v1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FG:Lcom/google/android/gms/internal/iq;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/iq;->getStreamDuration()J
    //         move-result-wide v2
    //         monitor-exit v1
    //         return-wide v2
    //         :catchall_0
    //         move-exception v0
    //         monitor-exit v1
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v0
    */

    public fun load(apiClient: com.google.android.gms.common.api.GoogleApiClient, mediaInfo: com.google.android.gms.cast.MediaInfo): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 8
    //         const/4 v6, 0x0
    //         const/4 v3, 0x1
    //         const-wide/16 v4, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v7, v6
    //         invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun load(apiClient: com.google.android.gms.common.api.GoogleApiClient, mediaInfo: com.google.android.gms.cast.MediaInfo, autoplay: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;Z)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 8
    //         const/4 v6, 0x0
    //         const-wide/16 v4, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move v3, p3
    //         move-object v7, v6
    //         invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun load(apiClient: com.google.android.gms.common.api.GoogleApiClient, mediaInfo: com.google.android.gms.cast.MediaInfo, autoplay: Boolean, playPosition: Long): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 8
    //         const/4 v6, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move v3, p3
    //         move-wide v4, p4
    //         move-object v7, v6
    //         invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun load(apiClient: com.google.android.gms.common.api.GoogleApiClient, mediaInfo: com.google.android.gms.cast.MediaInfo, autoplay: Boolean, playPosition: Long, customData: org.json.JSONObject): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 8
    //         const/4 v6, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move v3, p3
    //         move-wide v4, p4
    //         move-object v7, p6
    //         invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun load(apiClient: com.google.android.gms.common.api.GoogleApiClient, mediaInfo: com.google.android.gms.cast.MediaInfo, autoplay: Boolean, playPosition: Long, activeTrackIds: LongArray, customData: org.json.JSONObject): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 10
    //         new-instance v1, Lcom/google/android/gms/cast/RemoteMediaPlayer$4;
    //         move-object v2, p0
    //         move-object v3, p1
    //         move-object v4, p2
    //         move v5, p3
    //         move-wide v6, p4
    //         move-object/from16 v8, p6
    //         move-object/from16 v9, p7
    //         invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/cast/RemoteMediaPlayer$4;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)V
    //         invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onMessageReceived(castDevice: com.google.android.gms.cast.CastDevice, namespace: String, message: String) { /* TODO(body): (Lcom/google/android/gms/cast/CastDevice;Ljava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FG:Lcom/google/android/gms/internal/iq;
    //         invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/iq;->aD(Ljava/lang/String;)V
    //         return-void
    */

    public fun pause(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->pause(Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun pause(apiClient: com.google.android.gms.common.api.GoogleApiClient, customData: org.json.JSONObject): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$5;
    //         invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$5;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun play(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->play(Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun play(apiClient: com.google.android.gms.common.api.GoogleApiClient, customData: org.json.JSONObject): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$7;
    //         invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$7;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun requestStatus(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$11;
    //         invoke-direct {v0, p0, p1}, Lcom/google/android/gms/cast/RemoteMediaPlayer$11;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun seek(apiClient: com.google.android.gms.common.api.GoogleApiClient, position: Long): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;J)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 6
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-wide v2, p2
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->seek(Lcom/google/android/gms/common/api/GoogleApiClient;JILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun seek(apiClient: com.google.android.gms.common.api.GoogleApiClient, position: Long, resumeState: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;JI)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-wide v2, p2
    //         move v4, p4
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->seek(Lcom/google/android/gms/common/api/GoogleApiClient;JILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun seek(apiClient: com.google.android.gms.common.api.GoogleApiClient, position: Long, resumeState: Int, customData: org.json.JSONObject): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;JILorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 8
    //         new-instance v1, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;
    //         move-object v2, p0
    //         move-object v3, p1
    //         move-wide v4, p2
    //         move v6, p4
    //         move-object v7, p5
    //         invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/cast/RemoteMediaPlayer$8;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;JILorg/json/JSONObject;)V
    //         invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setActiveMediaTracks(apiClient: com.google.android.gms.common.api.GoogleApiClient, trackIds: LongArray): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;[J)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$2;
    //         invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$2;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;[J)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setOnMetadataUpdatedListener(listener: com.google.android.gms.cast.RemoteMediaPlayer.OnMetadataUpdatedListener) { /* TODO(body): (Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FI:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnMetadataUpdatedListener;
    //         return-void
    */

    public fun setOnStatusUpdatedListener(listener: com.google.android.gms.cast.RemoteMediaPlayer.OnStatusUpdatedListener) { /* TODO(body): (Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FJ:Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;
    //         return-void
    */

    public fun setStreamMute(apiClient: com.google.android.gms.common.api.GoogleApiClient, muteState: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->setStreamMute(Lcom/google/android/gms/common/api/GoogleApiClient;ZLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setStreamMute(apiClient: com.google.android.gms.common.api.GoogleApiClient, muteState: Boolean, customData: org.json.JSONObject): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;ZLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$10;
    //         invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/cast/RemoteMediaPlayer$10;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;ZLorg/json/JSONObject;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setStreamVolume(apiClient: com.google.android.gms.common.api.GoogleApiClient, volume: Double): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;D)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalArgumentException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->setStreamVolume(Lcom/google/android/gms/common/api/GoogleApiClient;DLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setStreamVolume(apiClient: com.google.android.gms.common.api.GoogleApiClient, volume: Double, customData: org.json.JSONObject): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;DLorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
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
    //         new-instance v1, Lcom/google/android/gms/cast/RemoteMediaPlayer$9;
    //         move-object v2, p0
    //         move-object v3, p1
    //         move-wide v4, p2
    //         move-object v6, p4
    //         invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/cast/RemoteMediaPlayer$9;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;DLorg/json/JSONObject;)V
    //         invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setTextTrackStyle(apiClient: com.google.android.gms.common.api.GoogleApiClient, trackStyle: com.google.android.gms.cast.TextTrackStyle): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/TextTrackStyle;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         if-nez p2, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "trackStyle cannot be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$3;
    //         invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$3;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/TextTrackStyle;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun stop(apiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->stop(Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun stop(apiClient: com.google.android.gms.common.api.GoogleApiClient, customData: org.json.JSONObject): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/RemoteMediaPlayer$6;
    //         invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/cast/RemoteMediaPlayer$6;-><init>(Lcom/google/android/gms/cast/RemoteMediaPlayer;Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    @JvmField public val RESUME_STATE_PAUSE: Int = 0x2
    @JvmField public val RESUME_STATE_PLAY: Int = 0x1
    @JvmField public val RESUME_STATE_UNCHANGED: Int = 0x0
    @JvmField public val STATUS_CANCELED: Int = 0x835
    @JvmField public val STATUS_FAILED: Int = 0x834
    @JvmField public val STATUS_REPLACED: Int = 0x837
    @JvmField public val STATUS_SUCCEEDED: Int = 0x0
    @JvmField public val STATUS_TIMED_OUT: Int = 0x836

    @JvmStatic fun a(p0: com.google.android.gms.cast.RemoteMediaPlayer) { /* TODO(body): (Lcom/google/android/gms/cast/RemoteMediaPlayer;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->onStatusUpdated()V
    //         return-void
    */

    @JvmStatic fun b(p0: com.google.android.gms.cast.RemoteMediaPlayer) { /* TODO(body): (Lcom/google/android/gms/cast/RemoteMediaPlayer;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->onMetadataUpdated()V
    //         return-void
    */

    @JvmStatic fun c(p0: com.google.android.gms.cast.RemoteMediaPlayer): Object { return TODO("body: (Lcom/google/android/gms/cast/RemoteMediaPlayer;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->mw:Ljava/lang/Object;
    //         return-object v0
    */

    @JvmStatic fun d(p0: com.google.android.gms.cast.RemoteMediaPlayer): com.google.android.gms.cast.RemoteMediaPlayer.a { return TODO("body: (Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/cast/RemoteMediaPlayer$a;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FH:Lcom/google/android/gms/cast/RemoteMediaPlayer$a;
    //         return-object v0
    */

    @JvmStatic fun e(p0: com.google.android.gms.cast.RemoteMediaPlayer): com.google.android.gms.internal.iq { return TODO("body: (Lcom/google/android/gms/cast/RemoteMediaPlayer;)Lcom/google/android/gms/internal/iq;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/RemoteMediaPlayer;->FG:Lcom/google/android/gms/internal/iq;
    //         return-object v0
    */

    }
}
