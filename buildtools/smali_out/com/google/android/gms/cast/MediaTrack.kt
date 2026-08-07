package com.google.android.gms.cast

// Auto-emitted from smali.
// 19 fields, 21 methods.

class MediaTrack {
    private var Dj: Long
    private var FD: Int
    private var FE: Int
    private var Fc: String
    private var Fe: String
    private var Fg: String
    private var Fl: org.json.JSONObject
    private var mName: String

    constructor(id: Long, type: Int)

    constructor(json: org.json.JSONObject)

    private fun c(p0: org.json.JSONObject) { /* TODO(body): (Lorg/json/JSONObject;)V */ }
    /*
    //         .locals 6
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Lorg/json/JSONException;
    //             }
    //         .end annotation
    //         const/4 v5, 0x3
    //         const/4 v4, 0x2
    //         const/4 v3, 0x1
    //         const/4 v2, 0x0
    //         invoke-direct {p0}, Lcom/google/android/gms/cast/MediaTrack;->clear()V
    //         const-string v0, "trackId"
    //         invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         iput-wide v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Dj:J
    //         const-string v0, "type"
    //         invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "TEXT"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iput v3, p0, Lcom/google/android/gms/cast/MediaTrack;->FD:I
    //         :goto_0
    //         const-string v0, "trackContentId"
    //         invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fe:Ljava/lang/String;
    //         const-string v0, "trackContentType"
    //         invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fg:Ljava/lang/String;
    //         const-string v0, "name"
    //         invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->mName:Ljava/lang/String;
    //         const-string v0, "language"
    //         invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fc:Ljava/lang/String;
    //         const-string v0, "subtype"
    //         invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_8
    //         const-string v0, "subtype"
    //         invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "SUBTITLES"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         iput v3, p0, Lcom/google/android/gms/cast/MediaTrack;->FE:I
    //         :goto_1
    //         const-string v0, "customData"
    //         invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fl:Lorg/json/JSONObject;
    //         return-void
    //         :cond_0
    //         const-string v1, "AUDIO"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_1
    //         iput v4, p0, Lcom/google/android/gms/cast/MediaTrack;->FD:I
    //         goto :goto_0
    //         :cond_1
    //         const-string v1, "VIDEO"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         iput v5, p0, Lcom/google/android/gms/cast/MediaTrack;->FD:I
    //         goto :goto_0
    //         :cond_2
    //         new-instance v1, Lorg/json/JSONException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "invalid type: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_3
    //         const-string v1, "CAPTIONS"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_4
    //         iput v4, p0, Lcom/google/android/gms/cast/MediaTrack;->FE:I
    //         goto :goto_1
    //         :cond_4
    //         const-string v1, "DESCRIPTIONS"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_5
    //         iput v5, p0, Lcom/google/android/gms/cast/MediaTrack;->FE:I
    //         goto :goto_1
    //         :cond_5
    //         const-string v1, "CHAPTERS"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_6
    //         const/4 v0, 0x4
    //         iput v0, p0, Lcom/google/android/gms/cast/MediaTrack;->FE:I
    //         goto :goto_1
    //         :cond_6
    //         const-string v1, "METADATA"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_7
    //         const/4 v0, 0x5
    //         iput v0, p0, Lcom/google/android/gms/cast/MediaTrack;->FE:I
    //         goto :goto_1
    //         :cond_7
    //         new-instance v1, Lorg/json/JSONException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "invalid subtype: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_8
    //         const/4 v0, 0x0
    //         iput v0, p0, Lcom/google/android/gms/cast/MediaTrack;->FE:I
    //         goto/16 :goto_1
    */

    private fun clear() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         const-wide/16 v0, 0x0
    //         iput-wide v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Dj:J
    //         const/4 v0, 0x0
    //         iput v0, p0, Lcom/google/android/gms/cast/MediaTrack;->FD:I
    //         iput-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->Fe:Ljava/lang/String;
    //         iput-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->mName:Ljava/lang/String;
    //         iput-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->Fc:Ljava/lang/String;
    //         const/4 v0, -0x1
    //         iput v0, p0, Lcom/google/android/gms/cast/MediaTrack;->FE:I
    //         iput-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->Fl:Lorg/json/JSONObject;
    //         return-void
    */

    fun aa(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Ljava/lang/IllegalArgumentException;
    //             }
    //         .end annotation
    //         const/4 v0, -0x1
    //         if-le p1, v0, :cond_0
    //         const/4 v0, 0x5
    //         if-le p1, v0, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "invalid subtype "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         if-eqz p1, :cond_2
    //         iget v0, p0, Lcom/google/android/gms/cast/MediaTrack;->FD:I
    //         const/4 v1, 0x1
    //         if-eq v0, v1, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "subtypes are only valid for text tracks"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         iput p1, p0, Lcom/google/android/gms/cast/MediaTrack;->FE:I
    //         return-void
    */

    public fun bK(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 4
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         :try_start_0
    //         const-string v1, "trackId"
    //         iget-wide v2, p0, Lcom/google/android/gms/cast/MediaTrack;->Dj:J
    //         invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    //         iget v1, p0, Lcom/google/android/gms/cast/MediaTrack;->FD:I
    //         packed-switch v1, :pswitch_data_0
    //         :goto_0
    //         iget-object v1, p0, Lcom/google/android/gms/cast/MediaTrack;->Fe:Ljava/lang/String;
    //         if-eqz v1, :cond_0
    //         const-string v1, "trackContentId"
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->Fe:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/cast/MediaTrack;->Fg:Ljava/lang/String;
    //         if-eqz v1, :cond_1
    //         const-string v1, "trackContentType"
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->Fg:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_1
    //         iget-object v1, p0, Lcom/google/android/gms/cast/MediaTrack;->mName:Ljava/lang/String;
    //         if-eqz v1, :cond_2
    //         const-string v1, "name"
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->mName:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/cast/MediaTrack;->Fc:Ljava/lang/String;
    //         invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-nez v1, :cond_3
    //         const-string v1, "language"
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->Fc:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_3
    //         iget v1, p0, Lcom/google/android/gms/cast/MediaTrack;->FE:I
    //         packed-switch v1, :pswitch_data_1
    //         :goto_1
    //         iget-object v1, p0, Lcom/google/android/gms/cast/MediaTrack;->Fl:Lorg/json/JSONObject;
    //         if-eqz v1, :cond_4
    //         const-string v1, "customData"
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->Fl:Lorg/json/JSONObject;
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :cond_4
    //         :goto_2
    //         return-object v0
    //         :pswitch_0
    //         const-string v1, "type"
    //         const-string v2, "TEXT"
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_2
    //         :pswitch_1
    //         const-string v1, "type"
    //         const-string v2, "AUDIO"
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         goto :goto_0
    //         :pswitch_2
    //         const-string v1, "type"
    //         const-string v2, "VIDEO"
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         goto :goto_0
    //         :pswitch_3
    //         const-string v1, "subtype"
    //         const-string v2, "SUBTITLES"
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         goto :goto_1
    //         :pswitch_4
    //         const-string v1, "subtype"
    //         const-string v2, "CAPTIONS"
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         goto :goto_1
    //         :pswitch_5
    //         const-string v1, "subtype"
    //         const-string v2, "DESCRIPTIONS"
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         goto :goto_1
    //         :pswitch_6
    //         const-string v1, "subtype"
    //         const-string v2, "CHAPTERS"
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         goto :goto_1
    //         :pswitch_7
    //         const-string v1, "subtype"
    //         const-string v2, "METADATA"
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_1
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    //         :pswitch_data_1
    //         .packed-switch 0x1
    //             :pswitch_3
    //             :pswitch_4
    //             :pswitch_5
    //             :pswitch_6
    //             :pswitch_7
    //         .end packed-switch
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
    //         instance-of v0, p1, Lcom/google/android/gms/cast/MediaTrack;
    //         if-eqz v0, :cond_0
    //         check-cast p1, Lcom/google/android/gms/cast/MediaTrack;
    //         .end local p1    # "other":Ljava/lang/Object;
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fl:Lorg/json/JSONObject;
    //         if-nez v0, :cond_3
    //         move v0, v1
    //         :goto_1
    //         iget-object v3, p1, Lcom/google/android/gms/cast/MediaTrack;->Fl:Lorg/json/JSONObject;
    //         if-nez v3, :cond_4
    //         move v3, v1
    //         :goto_2
    //         if-ne v0, v3, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fl:Lorg/json/JSONObject;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p1, Lcom/google/android/gms/cast/MediaTrack;->Fl:Lorg/json/JSONObject;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fl:Lorg/json/JSONObject;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/MediaTrack;->Fl:Lorg/json/JSONObject;
    //         invoke-static {v0, v3}, Lcom/google/android/gms/internal/jz;->d(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :cond_2
    //         iget-wide v4, p0, Lcom/google/android/gms/cast/MediaTrack;->Dj:J
    //         iget-wide v6, p1, Lcom/google/android/gms/cast/MediaTrack;->Dj:J
    //         cmp-long v0, v4, v6
    //         if-nez v0, :cond_5
    //         iget v0, p0, Lcom/google/android/gms/cast/MediaTrack;->FD:I
    //         iget v3, p1, Lcom/google/android/gms/cast/MediaTrack;->FD:I
    //         if-ne v0, v3, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fe:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/MediaTrack;->Fe:Ljava/lang/String;
    //         invoke-static {v0, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fg:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/MediaTrack;->Fg:Ljava/lang/String;
    //         invoke-static {v0, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->mName:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/MediaTrack;->mName:Ljava/lang/String;
    //         invoke-static {v0, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fc:Ljava/lang/String;
    //         iget-object v3, p1, Lcom/google/android/gms/cast/MediaTrack;->Fc:Ljava/lang/String;
    //         invoke-static {v0, v3}, Lcom/google/android/gms/internal/ik;->a(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_5
    //         iget v0, p0, Lcom/google/android/gms/cast/MediaTrack;->FE:I
    //         iget v3, p1, Lcom/google/android/gms/cast/MediaTrack;->FE:I
    //         if-ne v0, v3, :cond_5
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

    public fun getContentId(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fe:Ljava/lang/String;
    //         return-object v0
    */

    public fun getContentType(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fg:Ljava/lang/String;
    //         return-object v0
    */

    public fun getCustomData(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fl:Lorg/json/JSONObject;
    //         return-object v0
    */

    public fun getId(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Dj:J
    //         return-wide v0
    */

    public fun getLanguage(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->Fc:Ljava/lang/String;
    //         return-object v0
    */

    public fun getName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/cast/MediaTrack;->mName:Ljava/lang/String;
    //         return-object v0
    */

    public fun getSubtype(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/cast/MediaTrack;->FE:I
    //         return v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/cast/MediaTrack;->FD:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/16 v0, 0x8
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-wide v2, p0, Lcom/google/android/gms/cast/MediaTrack;->Dj:J
    //         invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/cast/MediaTrack;->FD:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->Fe:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x3
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->Fg:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x4
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->mName:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x5
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->Fc:Ljava/lang/String;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x6
    //         iget v2, p0, Lcom/google/android/gms/cast/MediaTrack;->FE:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x7
    //         iget-object v2, p0, Lcom/google/android/gms/cast/MediaTrack;->Fl:Lorg/json/JSONObject;
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun setContentId(contentId: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/cast/MediaTrack;->Fe:Ljava/lang/String;
    //         return-void
    */

    public fun setContentType(contentType: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/cast/MediaTrack;->Fg:Ljava/lang/String;
    //         return-void
    */

    fun setCustomData(customData: org.json.JSONObject) { /* TODO(body): (Lorg/json/JSONObject;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/cast/MediaTrack;->Fl:Lorg/json/JSONObject;
    //         return-void
    */

    fun setLanguage(language: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/cast/MediaTrack;->Fc:Ljava/lang/String;
    //         return-void
    */

    fun setName(name: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/cast/MediaTrack;->mName:Ljava/lang/String;
    //         return-void
    */

    companion object {
    @JvmField public val SUBTYPE_CAPTIONS: Int = 0x2
    @JvmField public val SUBTYPE_CHAPTERS: Int = 0x4
    @JvmField public val SUBTYPE_DESCRIPTIONS: Int = 0x3
    @JvmField public val SUBTYPE_METADATA: Int = 0x5
    @JvmField public val SUBTYPE_NONE: Int = 0x0
    @JvmField public val SUBTYPE_SUBTITLES: Int = 0x1
    @JvmField public val SUBTYPE_UNKNOWN: Int = 0
    @JvmField public val TYPE_AUDIO: Int = 0x2
    @JvmField public val TYPE_TEXT: Int = 0x1
    @JvmField public val TYPE_UNKNOWN: Int = 0x0
    @JvmField public val TYPE_VIDEO: Int = 0x3
    }
}
