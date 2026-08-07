package com.google.android.gms.cast

// Auto-emitted from smali.
// 1 fields, 9 methods.

open class MediaInfo_Builder {
    private val Fm: com.google.android.gms.cast.MediaInfo

    public constructor(contentId: String)

    public fun build(): com.google.android.gms.cast.MediaInfo { return TODO("body: ()Lcom/google/android/gms/cast/MediaInfo;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalArgumentException;
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo$Builder;->Fm:Lcom/google/android/gms/cast/MediaInfo;
    //         invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaInfo;->fv()V
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo$Builder;->Fm:Lcom/google/android/gms/cast/MediaInfo;
    //         return-object v0
    */

    public fun setContentType(contentType: String): com.google.android.gms.cast.MediaInfo.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/cast/MediaInfo$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo$Builder;->Fm:Lcom/google/android/gms/cast/MediaInfo;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaInfo;->setContentType(Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setCustomData(customData: org.json.JSONObject): com.google.android.gms.cast.MediaInfo.Builder { return TODO("body: (Lorg/json/JSONObject;)Lcom/google/android/gms/cast/MediaInfo$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo$Builder;->Fm:Lcom/google/android/gms/cast/MediaInfo;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaInfo;->setCustomData(Lorg/json/JSONObject;)V
    //         return-object p0
    */

    public fun setMediaTracks(p0: java.util.List): com.google.android.gms.cast.MediaInfo.Builder { return TODO("body: (Ljava/util/List;)Lcom/google/android/gms/cast/MediaInfo$Builder;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Lcom/google/android/gms/cast/MediaTrack;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/cast/MediaInfo$Builder;"
    //             }
    //         .end annotation
    //         .local p1, "mediaTracks":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/cast/MediaTrack;>;"
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo$Builder;->Fm:Lcom/google/android/gms/cast/MediaInfo;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaInfo;->c(Ljava/util/List;)V
    //         return-object p0
    */

    public fun setMetadata(metadata: com.google.android.gms.cast.MediaMetadata): com.google.android.gms.cast.MediaInfo.Builder { return TODO("body: (Lcom/google/android/gms/cast/MediaMetadata;)Lcom/google/android/gms/cast/MediaInfo$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo$Builder;->Fm:Lcom/google/android/gms/cast/MediaInfo;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaInfo;->a(Lcom/google/android/gms/cast/MediaMetadata;)V
    //         return-object p0
    */

    public fun setStreamDuration(duration: Long): com.google.android.gms.cast.MediaInfo.Builder { return TODO("body: (J)Lcom/google/android/gms/cast/MediaInfo$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo$Builder;->Fm:Lcom/google/android/gms/cast/MediaInfo;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/cast/MediaInfo;->m(J)V
    //         return-object p0
    */

    public fun setStreamType(streamType: Int): com.google.android.gms.cast.MediaInfo.Builder { return TODO("body: (I)Lcom/google/android/gms/cast/MediaInfo$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo$Builder;->Fm:Lcom/google/android/gms/cast/MediaInfo;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaInfo;->setStreamType(I)V
    //         return-object p0
    */

    public fun setTextTrackStyle(textTrackStyle: com.google.android.gms.cast.TextTrackStyle): com.google.android.gms.cast.MediaInfo.Builder { return TODO("body: (Lcom/google/android/gms/cast/TextTrackStyle;)Lcom/google/android/gms/cast/MediaInfo$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo$Builder;->Fm:Lcom/google/android/gms/cast/MediaInfo;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaInfo;->setTextTrackStyle(Lcom/google/android/gms/cast/TextTrackStyle;)V
    //         return-object p0
    */

}
