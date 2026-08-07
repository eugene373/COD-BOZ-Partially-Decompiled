package android.support.v4.media

// Auto-emitted from smali source: MediaMetadataCompatApi21.java.
// 0 fields, 6 methods.

open class MediaMetadataCompatApi21 {
    constructor()

    companion object {
    public @JvmStatic fun getBitmap(metadataObj: Object, key: String): android.graphics.Bitmap { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;)Landroid/graphics/Bitmap;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/MediaMetadata;
    //         .end local p0    # "metadataObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/MediaMetadata;->getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getLong(metadataObj: Object, key: String): Long { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;)J") }
    /*
    //         .locals 2
    //         check-cast p0, Landroid/media/MediaMetadata;
    //         .end local p0    # "metadataObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/MediaMetadata;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         return-wide v0
    */

    public @JvmStatic fun getRating(metadataObj: Object, key: String): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/MediaMetadata;
    //         .end local p0    # "metadataObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/MediaMetadata;->getRating(Ljava/lang/String;)Landroid/media/Rating;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getText(metadataObj: Object, key: String): CharSequence { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/MediaMetadata;
    //         .end local p0    # "metadataObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/MediaMetadata;->getText(Ljava/lang/String;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun keySet(metadataObj: Object): java.util.Set { return TODO("body: (Ljava/lang/Object;)Ljava/util/Set;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/MediaMetadata;
    //         .end local p0    # "metadataObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/MediaMetadata;->keySet()Ljava/util/Set;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
