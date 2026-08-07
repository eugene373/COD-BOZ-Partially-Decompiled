package com.google.android.gms.cast

// Auto-emitted from smali.
// 12 fields, 21 methods.

class MediaInfo {
    private val Fe: String
    private var Ff: Int
    private var Fg: String
    private var Fh: com.google.android.gms.cast.MediaMetadata
    private var Fi: Long
    private var Fj: java.util.List
    private var Fk: com.google.android.gms.cast.TextTrackStyle
    private var Fl: org.json.JSONObject

    constructor(contentId: String)

    constructor(json: org.json.JSONObject)

    fun a(p0: com.google.android.gms.cast.MediaMetadata) { /* TODO(body): (Lcom/google/android/gms/cast/MediaMetadata;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/cast/MediaInfo;->Fh:Lcom/google/android/gms/cast/MediaMetadata;
    //         return-void
    */

    public fun bK(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 4
    //         new-instance v1, Lorg/json/JSONObject;
    //         invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    //         :try_start_0
    //         const-string v0, "contentId"
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->Fe:Ljava/lang/String;
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         iget v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Ff:I
    //         packed-switch v0, :pswitch_data_0
    //         const-string v0, "NONE"
    //         :goto_0
    //         const-string v2, "streamType"
    //         invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fg:Ljava/lang/String;
    //         if-eqz v0, :cond_0
    //         const-string v0, "contentType"
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->Fg:Ljava/lang/String;
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fh:Lcom/google/android/gms/cast/MediaMetadata;
    //         if-eqz v0, :cond_1
    //         const-string v0, "metadata"
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->Fh:Lcom/google/android/gms/cast/MediaMetadata;
    //         invoke-virtual {v2}, Lcom/google/android/gms/cast/MediaMetadata;->bK()Lorg/json/JSONObject;
    //         move-result-object v2
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_1
    //         const-string v0, "duration"
    //         iget-wide v2, p0, Lcom/google/android/gms/cast/MediaInfo;->Fi:J
    //         invoke-static {v2, v3}, Lcom/google/android/gms/internal/ik;->o(J)D
    //         move-result-wide v2
    //         invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fj:Ljava/util/List;
    //         if-eqz v0, :cond_4
    //         new-instance v2, Lorg/json/JSONArray;
    //         invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fj:Ljava/util/List;
    //         invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
    //         move-result-object v3
    //         :goto_1
    //         invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/cast/MediaTrack;
    //         invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaTrack;->bK()Lorg/json/JSONObject;
    //         move-result-object v0
    //         invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    //         goto :goto_1
    //         :catch_0
    //         move-exception v0
    //         :cond_2
    //         :goto_2
    //         return-object v1
    //         :pswitch_0
    //         const-string v0, "BUFFERED"
    //         goto :goto_0
    //         :pswitch_1
    //         const-string v0, "LIVE"
    //         goto :goto_0
    //         :cond_3
    //         const-string v0, "tracks"
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_4
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fk:Lcom/google/android/gms/cast/TextTrackStyle;
    //         if-eqz v0, :cond_5
    //         const-string v0, "textTrackStyle"
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->Fk:Lcom/google/android/gms/cast/TextTrackStyle;
    //         invoke-virtual {v2}, Lcom/google/android/gms/cast/TextTrackStyle;->bK()Lorg/json/JSONObject;
    //         move-result-object v2
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fl:Lorg/json/JSONObject;
    //         if-eqz v0, :cond_2
    //         const-string v0, "customData"
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->Fl:Lorg/json/JSONObject;
    //         invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_2
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    fun c(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/cast/MediaTrack;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         iput-object p1, p0, Lcom/google/android/gms/cast/MediaInfo;->Fj:Ljava/util/List;
    //         return-void
    */

    public fun equals(other: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 8
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         if-ne p0, p1, :cond_1
    //         move v2, v1
    //         .end local p1    # "other":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v2
    //         .restart local p1    # "other":Ljava/lang/Object;
    //         :cond_1
    //         instance-of v0, p1, Lcom/google/android/gms/cast/MediaInfo;
    //         if-eqz v0, :cond_0
    //         check-cast p1, Lcom/google/android/gms/cast/MediaInfo;
    //         .end local p1    # "other":Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fl:Lorg/json/JSONObject;
    //         if-nez v0, :cond_3
    //         move v0, v1
    //         :goto_1
    //         iget-object v3, p1, Lcom/google/android/gms/cast/MediaInfo;->Fl:Lorg/json/JSONObject;
    //         if-nez v3, :cond_4
    //         move v3, v1
    //         :goto_2
    //         if-ne v0, v3, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fl:Lorg/json/JSONObject;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p1, Lcom/google/android/gms/cast/MediaInfo;->Fl:Lorg/json/JSONObject;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fl:Lorg/json/JSONObject;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/MediaInfo;->Fl:Lorg/json/JSONObject;
    //         invoke-static {v0, v3}, Lcom/google/android/gms/internal/jz;->d(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fe:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/MediaInfo;->Fe:Ljava/lang/String;
    //         invoke-static {v0, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         iget v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Ff:I
    //         iget v3, p1, Lcom/google/android/gms/cast/MediaInfo;->Ff:I
    //         if-ne v0, v3, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fg:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/MediaInfo;->Fg:Ljava/lang/String;
    //         invoke-static {v0, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fh:Lcom/google/android/gms/cast/MediaMetadata;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/MediaInfo;->Fh:Lcom/google/android/gms/cast/MediaMetadata;
    //         invoke-static {v0, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         iget-wide v4, p0, Lcom/google/android/gms/cast/MediaInfo;->Fi:J
    //         iget-wide v6, p1, Lcom/google/android/gms/cast/MediaInfo;->Fi:J
    //         cmp-long v0, v4, v6
    //         if-nez v0, :cond_5
    //         :goto_3
    //         move v2, v1
    //         goto :goto_0
    //         :cond_3
    //         move v0, v2
    //         goto :goto_1
    //         :cond_4
    //         move v3, v2
    //         goto :goto_2
    //         :cond_5
    //         move v1, v2
    //         goto :goto_3
    */

    fun fv() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalArgumentException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fe:Ljava/lang/String;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "content ID cannot be null or empty"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fg:Ljava/lang/String;
    //         invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "content type cannot be null or empty"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iget v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Ff:I
    //         const/4 v1, -0x1
    //         if-ne v0, v1, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "a valid stream type must be specified"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         return-void
    */

    public fun getContentId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fe:Ljava/lang/String;
    //         return-object v0
    */

    public fun getContentType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fg:Ljava/lang/String;
    //         return-object v0
    */

    public fun getCustomData(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fl:Lorg/json/JSONObject;
    //         return-object v0
    */

    public fun getMediaTracks(): java.util.List { return TODO("body: ()Ljava/util/List;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/cast/MediaTrack;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fj:Ljava/util/List;
    //         return-object v0
    */

    public fun getMetadata(): com.google.android.gms.cast.MediaMetadata { return TODO("body: ()Lcom/google/android/gms/cast/MediaMetadata;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fh:Lcom/google/android/gms/cast/MediaMetadata;
    //         return-object v0
    */

    public fun getStreamDuration(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fi:J
    //         return-wide v0
    */

    public fun getStreamType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Ff:I
    //         return v0
    */

    public fun getTextTrackStyle(): com.google.android.gms.cast.TextTrackStyle { return TODO("body: ()Lcom/google/android/gms/cast/TextTrackStyle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->Fk:Lcom/google/android/gms/cast/TextTrackStyle;
    //         return-object v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v0, 0x6
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->Fe:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/cast/MediaInfo;->Ff:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->Fg:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->Fh:Lcom/google/android/gms/cast/MediaMetadata;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         iget-wide v2, p0, Lcom/google/android/gms/cast/MediaInfo;->Fi:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->Fl:Lorg/json/JSONObject;
    //         invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    fun m(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalArgumentException;
    //             }
    //         .end annotation
    //         const-wide/16 v0, 0x0
    //         cmp-long v0, p1, v0
    //         if-gez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Stream duration cannot be negative"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iput-wide p1, p0, Lcom/google/android/gms/cast/MediaInfo;->Fi:J
    //         return-void
    */

    fun setContentType(contentType: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "content type cannot be null or empty"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         iput-object p1, p0, Lcom/google/android/gms/cast/MediaInfo;->Fg:Ljava/lang/String;
    //         return-void
    */

    fun setCustomData(customData: org.json.JSONObject) { /* TODO(body): (Lorg/json/JSONObject;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/cast/MediaInfo;->Fl:Lorg/json/JSONObject;
    //         return-void
    */

    fun setStreamType(streamType: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         const/4 v0, -0x1
    //         if-lt p1, v0, :cond_0
    //         const/4 v0, 0x2
    //         if-le p1, v0, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "invalid stream type"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         iput p1, p0, Lcom/google/android/gms/cast/MediaInfo;->Ff:I
    //         return-void
    */

    public fun setTextTrackStyle(textTrackStyle: com.google.android.gms.cast.TextTrackStyle) { /* TODO(body): (Lcom/google/android/gms/cast/TextTrackStyle;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/cast/MediaInfo;->Fk:Lcom/google/android/gms/cast/TextTrackStyle;
    //         return-void
    */

    companion object {
    @JvmField public val STREAM_TYPE_BUFFERED: Int = 0x1
    @JvmField public val STREAM_TYPE_INVALID: Int = 0
    @JvmField public val STREAM_TYPE_LIVE: Int = 0x2
    @JvmField public val STREAM_TYPE_NONE: Int = 0
    }
}
