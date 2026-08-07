package com.google.android.gms.cast

// Auto-emitted from smali.
// 1 fields, 9 methods.

open class MediaTrack_Builder {
    private val FF: com.google.android.gms.cast.MediaTrack

    public constructor(trackId: Long, trackType: Int)

    public fun build(): com.google.android.gms.cast.MediaTrack { return TODO("body: ()Lcom/google/android/gms/cast/MediaTrack;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack$Builder;->FF:Lcom/google/android/gms/cast/MediaTrack;
    //         return-object v0
    */

    public fun setContentId(contentId: String): com.google.android.gms.cast.MediaTrack.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/cast/MediaTrack$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack$Builder;->FF:Lcom/google/android/gms/cast/MediaTrack;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaTrack;->setContentId(Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setContentType(contentType: String): com.google.android.gms.cast.MediaTrack.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/cast/MediaTrack$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack$Builder;->FF:Lcom/google/android/gms/cast/MediaTrack;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaTrack;->setContentType(Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setCustomData(customData: org.json.JSONObject): com.google.android.gms.cast.MediaTrack.Builder { return TODO("body: (Lorg/json/JSONObject;)Lcom/google/android/gms/cast/MediaTrack$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack$Builder;->FF:Lcom/google/android/gms/cast/MediaTrack;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaTrack;->setCustomData(Lorg/json/JSONObject;)V
    //         return-object p0
    */

    public fun setLanguage(language: String): com.google.android.gms.cast.MediaTrack.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/cast/MediaTrack$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack$Builder;->FF:Lcom/google/android/gms/cast/MediaTrack;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaTrack;->setLanguage(Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setLanguage(locale: java.util.Locale): com.google.android.gms.cast.MediaTrack.Builder { return TODO("body: (Ljava/util/Locale;)Lcom/google/android/gms/cast/MediaTrack$Builder;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack$Builder;->FF:Lcom/google/android/gms/cast/MediaTrack;
    //         invoke-static {p1}, Lcom/google/android/gms/internal/ik;->b(Ljava/util/Locale;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/MediaTrack;->setLanguage(Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setName(trackName: String): com.google.android.gms.cast.MediaTrack.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/cast/MediaTrack$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack$Builder;->FF:Lcom/google/android/gms/cast/MediaTrack;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaTrack;->setName(Ljava/lang/String;)V
    //         return-object p0
    */

    public fun setSubtype(subtype: Int): com.google.android.gms.cast.MediaTrack.Builder { return TODO("body: (I)Lcom/google/android/gms/cast/MediaTrack$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack$Builder;->FF:Lcom/google/android/gms/cast/MediaTrack;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/MediaTrack;->aa(I)V
    //         return-object p0
    */

}
