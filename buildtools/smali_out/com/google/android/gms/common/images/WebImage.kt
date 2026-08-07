package com.google.android.gms.common.images

// Auto-emitted from smali.
// 5 fields, 16 methods.

class WebImage: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    private val BR: Int
    private val KQ: android.net.Uri
    private val lf: Int
    private val lg: Int

    constructor(versionCode: Int, url: android.net.Uri, width: Int, height: Int)

    public constructor(url: android.net.Uri)

    public constructor(url: android.net.Uri, width: Int, height: Int)

    public constructor(json: org.json.JSONObject)

    public fun bK(): org.json.JSONObject { return TODO("body: ()Lorg/json/JSONObject;") }
    /*
    //         .locals 3
    //         new-instance v0, Lorg/json/JSONObject;
    //         invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    //         :try_start_0
    //         const-string v1, "url"
    //         iget-object v2, p0, Lcom/google/android/gms/common/images/WebImage;->KQ:Landroid/net/Uri;
    //         invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //         const-string v1, "width"
    //         iget v2, p0, Lcom/google/android/gms/common/images/WebImage;->lf:I
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         const-string v1, "height"
    //         iget v2, p0, Lcom/google/android/gms/common/images/WebImage;->lg:I
    //         invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun equals(other: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         const/4 v1, 0x0
    //         if-ne p0, p1, :cond_1
    //         .end local p1    # "other":Ljava/lang/Object;
    //         :cond_0
    //         :goto_0
    //         return v0
    //         .restart local p1    # "other":Ljava/lang/Object;
    //         :cond_1
    //         if-eqz p1, :cond_2
    //         instance-of v2, p1, Lcom/google/android/gms/common/images/WebImage;
    //         if-nez v2, :cond_3
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_3
    //         check-cast p1, Lcom/google/android/gms/common/images/WebImage;
    //         .end local p1    # "other":Ljava/lang/Object;
    //         iget-object v2, p0, Lcom/google/android/gms/common/images/WebImage;->KQ:Landroid/net/Uri;
    //         iget-object v3, p1, Lcom/google/android/gms/common/images/WebImage;->KQ:Landroid/net/Uri;
    //         invoke-static {v2, v3}, Lcom/google/android/gms/common/internal/n;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_4
    //         iget v2, p0, Lcom/google/android/gms/common/images/WebImage;->lf:I
    //         iget v3, p1, Lcom/google/android/gms/common/images/WebImage;->lf:I
    //         if-ne v2, v3, :cond_4
    //         iget v2, p0, Lcom/google/android/gms/common/images/WebImage;->lg:I
    //         iget v3, p1, Lcom/google/android/gms/common/images/WebImage;->lg:I
    //         if-eq v2, v3, :cond_0
    //         :cond_4
    //         move v0, v1
    //         goto :goto_0
    */

    public fun getHeight(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/images/WebImage;->lg:I
    //         return v0
    */

    public fun getUrl(): android.net.Uri { return TODO("body: ()Landroid/net/Uri;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/common/images/WebImage;->KQ:Landroid/net/Uri;
    //         return-object v0
    */

    fun getVersionCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/images/WebImage;->BR:I
    //         return v0
    */

    public fun getWidth(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/common/images/WebImage;->lf:I
    //         return v0
    */

    public fun hashCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 3
    //         const/4 v0, 0x3
    //         new-array v0, v0, [Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/google/android/gms/common/images/WebImage;->KQ:Landroid/net/Uri;
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x1
    //         iget v2, p0, Lcom/google/android/gms/common/images/WebImage;->lf:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         const/4 v1, 0x2
    //         iget v2, p0, Lcom/google/android/gms/common/images/WebImage;->lg:I
    //         invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         invoke-static {v0}, Lcom/google/android/gms/common/internal/n;->hashCode([Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 4
    //         const-string v0, "Image %dx%d %s"
    //         const/4 v1, 0x3
    //         new-array v1, v1, [Ljava/lang/Object;
    //         const/4 v2, 0x0
    //         iget v3, p0, Lcom/google/android/gms/common/images/WebImage;->lf:I
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x1
    //         iget v3, p0, Lcom/google/android/gms/common/images/WebImage;->lg:I
    //         invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         const/4 v2, 0x2
    //         iget-object v3, p0, Lcom/google/android/gms/common/images/WebImage;->KQ:Landroid/net/Uri;
    //         invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         aput-object v3, v1, v2
    //         invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun writeToParcel(out: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/common/images/b;->a(Lcom/google/android/gms/common/images/WebImage;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    private @JvmStatic fun d(p0: org.json.JSONObject): android.net.Uri { return TODO("body: (Lorg/json/JSONObject;)Landroid/net/Uri;") }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         const-string v1, "url"
    //         invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         :try_start_0
    //         const-string v1, "url"
    //         invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         :try_end_0
    //         .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :cond_0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v1
    //         goto :goto_0
    */

    }
}
