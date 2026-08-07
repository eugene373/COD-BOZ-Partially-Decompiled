package android.support.v4.media

// Auto-emitted from smali source: MediaMetadataCompat.java.
// 35 fields, 19 methods.

class MediaMetadataCompat: android.os.Parcelable {
    private val mBundle: android.os.Bundle
    private var mMetadataObj: Object

    private constructor(bundle: android.os.Bundle)

    constructor(x0: android.os.Bundle, x1: android.support.v4.media.MediaMetadataCompat.1)

    private constructor(in: android.os.Parcel)

    constructor(x0: android.os.Parcel, x1: android.support.v4.media.MediaMetadataCompat.1)

    public fun containsKey(key: String): Boolean { return TODO("body: (Ljava/lang/String;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat;->mBundle:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         return v0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getBitmap(key: String): android.graphics.Bitmap { return TODO("body: (Ljava/lang/String;)Landroid/graphics/Bitmap;") }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         .local v1, "bmp":Landroid/graphics/Bitmap;
    //         :try_start_0
    //         iget-object v3, p0, Landroid/support/v4/media/MediaMetadataCompat;->mBundle:Landroid/os/Bundle;
    //         invoke-virtual {v3, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v3
    //         move-object v0, v3
    //         check-cast v0, Landroid/graphics/Bitmap;
    //         move-object v1, v0
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v1
    //         :catch_0
    //         move-exception v2
    //         .local v2, "e":Ljava/lang/Exception;
    //         const-string v3, "MediaMetadata"
    //         const-string v4, "Failed to retrieve a key as Bitmap."
    //         invoke-static {v3, v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    */

    public fun getLong(key: String): Long { return TODO("body: (Ljava/lang/String;)J") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat;->mBundle:Landroid/os/Bundle;
    //         const-wide/16 v2, 0x0
    //         invoke-virtual {v0, p1, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun getMediaMetadata(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 6
    //         iget-object v4, p0, Landroid/support/v4/media/MediaMetadataCompat;->mMetadataObj:Ljava/lang/Object;
    //         if-nez v4, :cond_0
    //         sget v4, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v5, 0x15
    //         if-ge v4, v5, :cond_1
    //         :cond_0
    //         iget-object v4, p0, Landroid/support/v4/media/MediaMetadataCompat;->mMetadataObj:Ljava/lang/Object;
    //         :goto_0
    //         return-object v4
    //         :cond_1
    //         invoke-static {}, Landroid/support/v4/media/MediaMetadataCompatApi21$Builder;->newInstance()Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "builderObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/support/v4/media/MediaMetadataCompat;->keySet()Ljava/util/Set;
    //         move-result-object v4
    //         invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         .local v1, "i$":Ljava/util/Iterator;
    //         :cond_2
    //         :goto_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v4
    //         if-eqz v4, :cond_3
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         .local v2, "key":Ljava/lang/String;
    //         sget-object v4, Landroid/support/v4/media/MediaMetadataCompat;->METADATA_KEYS_TYPE:Landroid/support/v4/util/ArrayMap;
    //         invoke-virtual {v4, v2}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Ljava/lang/Integer;
    //         .local v3, "type":Ljava/lang/Integer;
    //         if-eqz v3, :cond_2
    //         invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
    //         move-result v4
    //         packed-switch v4, :pswitch_data_0
    //         goto :goto_1
    //         :pswitch_0
    //         invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaMetadataCompat;->getLong(Ljava/lang/String;)J
    //         move-result-wide v4
    //         invoke-static {v0, v2, v4, v5}, Landroid/support/v4/media/MediaMetadataCompatApi21$Builder;->putLong(Ljava/lang/Object;Ljava/lang/String;J)V
    //         goto :goto_1
    //         :pswitch_1
    //         invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaMetadataCompat;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //         move-result-object v4
    //         invoke-static {v0, v2, v4}, Landroid/support/v4/media/MediaMetadataCompatApi21$Builder;->putBitmap(Ljava/lang/Object;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    //         goto :goto_1
    //         :pswitch_2
    //         invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaMetadataCompat;->getRating(Ljava/lang/String;)Landroid/support/v4/media/RatingCompat;
    //         move-result-object v4
    //         invoke-virtual {v4}, Landroid/support/v4/media/RatingCompat;->getRating()Ljava/lang/Object;
    //         move-result-object v4
    //         invoke-static {v0, v2, v4}, Landroid/support/v4/media/MediaMetadataCompatApi21$Builder;->putRating(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    //         goto :goto_1
    //         :pswitch_3
    //         invoke-virtual {p0, v2}, Landroid/support/v4/media/MediaMetadataCompat;->getText(Ljava/lang/String;)Ljava/lang/CharSequence;
    //         move-result-object v4
    //         invoke-static {v0, v2, v4}, Landroid/support/v4/media/MediaMetadataCompatApi21$Builder;->putText(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/CharSequence;)V
    //         goto :goto_1
    //         .end local v2    # "key":Ljava/lang/String;
    //         .end local v3    # "type":Ljava/lang/Integer;
    //         :cond_3
    //         invoke-static {v0}, Landroid/support/v4/media/MediaMetadataCompatApi21$Builder;->build(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v4
    //         iput-object v4, p0, Landroid/support/v4/media/MediaMetadataCompat;->mMetadataObj:Ljava/lang/Object;
    //         iget-object v4, p0, Landroid/support/v4/media/MediaMetadataCompat;->mMetadataObj:Ljava/lang/Object;
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_3
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun getRating(key: String): android.support.v4.media.RatingCompat { return TODO("body: (Ljava/lang/String;)Landroid/support/v4/media/RatingCompat;") }
    /*
    //         .locals 5
    //         const/4 v2, 0x0
    //         .local v2, "rating":Landroid/support/v4/media/RatingCompat;
    //         :try_start_0
    //         iget-object v3, p0, Landroid/support/v4/media/MediaMetadataCompat;->mBundle:Landroid/os/Bundle;
    //         invoke-virtual {v3, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v3
    //         move-object v0, v3
    //         check-cast v0, Landroid/support/v4/media/RatingCompat;
    //         move-object v2, v0
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-object v2
    //         :catch_0
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/Exception;
    //         const-string v3, "MediaMetadata"
    //         const-string v4, "Failed to retrieve a key as Rating."
    //         invoke-static {v3, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    */

    public fun getString(key: String): String { return TODO("body: (Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/media/MediaMetadataCompat;->mBundle:Landroid/os/Bundle;
    //         invoke-virtual {v1, p1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         .local v0, "text":Ljava/lang/CharSequence;
    //         if-eqz v0, :cond_0
    //         invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun getText(key: String): CharSequence { return TODO("body: (Ljava/lang/String;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat;->mBundle:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public fun keySet(): java.util.Set { return TODO("body: ()Ljava/util/Set;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat;->mBundle:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         return-object v0
    */

    public fun size(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat;->mBundle:Landroid/os/Bundle;
    //         invoke-virtual {v0}, Landroid/os/Bundle;->size()I
    //         move-result v0
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/media/MediaMetadataCompat;->mBundle:Landroid/os/Bundle;
    //         invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    private val METADATA_KEYS_TYPE: android.support.v4.util.ArrayMap = null!!
    @JvmField public val METADATA_KEY_ALBUM: String = "android.media.metadata.ALBUM"
    @JvmField public val METADATA_KEY_ALBUM_ART: String = "android.media.metadata.ALBUM_ART"
    @JvmField public val METADATA_KEY_ALBUM_ARTIST: String = "android.media.metadata.ALBUM_ARTIST"
    @JvmField public val METADATA_KEY_ALBUM_ART_URI: String = "android.media.metadata.ALBUM_ART_URI"
    @JvmField public val METADATA_KEY_ART: String = "android.media.metadata.ART"
    @JvmField public val METADATA_KEY_ARTIST: String = "android.media.metadata.ARTIST"
    @JvmField public val METADATA_KEY_ART_URI: String = "android.media.metadata.ART_URI"
    @JvmField public val METADATA_KEY_AUTHOR: String = "android.media.metadata.AUTHOR"
    @JvmField public val METADATA_KEY_COMPILATION: String = "android.media.metadata.COMPILATION"
    @JvmField public val METADATA_KEY_COMPOSER: String = "android.media.metadata.COMPOSER"
    @JvmField public val METADATA_KEY_DATE: String = "android.media.metadata.DATE"
    @JvmField public val METADATA_KEY_DISC_NUMBER: String = "android.media.metadata.DISC_NUMBER"
    @JvmField public val METADATA_KEY_DISPLAY_DESCRIPTION: String = "android.media.metadata.DISPLAY_DESCRIPTION"
    @JvmField public val METADATA_KEY_DISPLAY_ICON: String = "android.media.metadata.DISPLAY_ICON"
    @JvmField public val METADATA_KEY_DISPLAY_ICON_URI: String = "android.media.metadata.DISPLAY_ICON_URI"
    @JvmField public val METADATA_KEY_DISPLAY_SUBTITLE: String = "android.media.metadata.DISPLAY_SUBTITLE"
    @JvmField public val METADATA_KEY_DISPLAY_TITLE: String = "android.media.metadata.DISPLAY_TITLE"
    @JvmField public val METADATA_KEY_DURATION: String = "android.media.metadata.DURATION"
    @JvmField public val METADATA_KEY_GENRE: String = "android.media.metadata.GENRE"
    @JvmField public val METADATA_KEY_NUM_TRACKS: String = "android.media.metadata.NUM_TRACKS"
    @JvmField public val METADATA_KEY_RATING: String = "android.media.metadata.RATING"
    @JvmField public val METADATA_KEY_TITLE: String = "android.media.metadata.TITLE"
    @JvmField public val METADATA_KEY_TRACK_NUMBER: String = "android.media.metadata.TRACK_NUMBER"
    @JvmField public val METADATA_KEY_USER_RATING: String = "android.media.metadata.USER_RATING"
    @JvmField public val METADATA_KEY_WRITER: String = "android.media.metadata.WRITER"
    @JvmField public val METADATA_KEY_YEAR: String = "android.media.metadata.YEAR"
    private val METADATA_TYPE_BITMAP: Int = 0x2
    private val METADATA_TYPE_LONG: Int = 0x0
    private val METADATA_TYPE_RATING: Int = 0x3
    private val METADATA_TYPE_TEXT: Int = 0x1
    private val TAG: String = "MediaMetadata"

    public @JvmStatic fun fromMediaMetadata(metadataObj: Object): android.support.v4.media.MediaMetadataCompat { return TODO("body: (Ljava/lang/Object;)Landroid/support/v4/media/MediaMetadataCompat;") }
    /*
    //         .locals 8
    //         if-eqz p0, :cond_0
    //         sget v5, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v6, 0x15
    //         if-ge v5, v6, :cond_1
    //         :cond_0
    //         const/4 v3, 0x0
    //         :goto_0
    //         return-object v3
    //         :cond_1
    //         new-instance v0, Landroid/support/v4/media/MediaMetadataCompat$Builder;
    //         invoke-direct {v0}, Landroid/support/v4/media/MediaMetadataCompat$Builder;-><init>()V
    //         .local v0, "builder":Landroid/support/v4/media/MediaMetadataCompat$Builder;
    //         invoke-static {p0}, Landroid/support/v4/media/MediaMetadataCompatApi21;->keySet(Ljava/lang/Object;)Ljava/util/Set;
    //         move-result-object v5
    //         invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         .local v1, "i$":Ljava/util/Iterator;
    //         :cond_2
    //         :goto_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v5
    //         if-eqz v5, :cond_3
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         .local v2, "key":Ljava/lang/String;
    //         sget-object v5, Landroid/support/v4/media/MediaMetadataCompat;->METADATA_KEYS_TYPE:Landroid/support/v4/util/ArrayMap;
    //         invoke-virtual {v5, v2}, Landroid/support/v4/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v4
    //         check-cast v4, Ljava/lang/Integer;
    //         .local v4, "type":Ljava/lang/Integer;
    //         if-eqz v4, :cond_2
    //         invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
    //         move-result v5
    //         packed-switch v5, :pswitch_data_0
    //         goto :goto_1
    //         :pswitch_0
    //         invoke-static {p0, v2}, Landroid/support/v4/media/MediaMetadataCompatApi21;->getLong(Ljava/lang/Object;Ljava/lang/String;)J
    //         move-result-wide v6
    //         invoke-virtual {v0, v2, v6, v7}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putLong(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat$Builder;
    //         goto :goto_1
    //         :pswitch_1
    //         invoke-static {p0, v2}, Landroid/support/v4/media/MediaMetadataCompatApi21;->getBitmap(Ljava/lang/Object;Ljava/lang/String;)Landroid/graphics/Bitmap;
    //         move-result-object v5
    //         invoke-virtual {v0, v2, v5}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$Builder;
    //         goto :goto_1
    //         :pswitch_2
    //         invoke-static {p0, v2}, Landroid/support/v4/media/MediaMetadataCompatApi21;->getRating(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v5
    //         invoke-static {v5}, Landroid/support/v4/media/RatingCompat;->fromRating(Ljava/lang/Object;)Landroid/support/v4/media/RatingCompat;
    //         move-result-object v5
    //         invoke-virtual {v0, v2, v5}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putRating(Ljava/lang/String;Landroid/support/v4/media/RatingCompat;)Landroid/support/v4/media/MediaMetadataCompat$Builder;
    //         goto :goto_1
    //         :pswitch_3
    //         invoke-static {p0, v2}, Landroid/support/v4/media/MediaMetadataCompatApi21;->getText(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/CharSequence;
    //         move-result-object v5
    //         invoke-virtual {v0, v2, v5}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/support/v4/media/MediaMetadataCompat$Builder;
    //         goto :goto_1
    //         .end local v2    # "key":Ljava/lang/String;
    //         .end local v4    # "type":Ljava/lang/Integer;
    //         :cond_3
    //         invoke-virtual {v0}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->build()Landroid/support/v4/media/MediaMetadataCompat;
    //         move-result-object v3
    //         .local v3, "metadata":Landroid/support/v4/media/MediaMetadataCompat;
    //         iput-object p0, v3, Landroid/support/v4/media/MediaMetadataCompat;->mMetadataObj:Ljava/lang/Object;
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_3
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    }
}
