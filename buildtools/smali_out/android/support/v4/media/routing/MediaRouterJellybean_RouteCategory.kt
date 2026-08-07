package android.support.v4.media.routing

// Auto-emitted from smali source: MediaRouterJellybean.java.
// 0 fields, 5 methods.

class MediaRouterJellybean_RouteCategory {
    public constructor()

    companion object {
    public @JvmStatic fun getName(categoryObj: Object, context: android.content.Context): CharSequence { return TODO("body: (Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/MediaRouter$RouteCategory;
    //         .end local p0    # "categoryObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/MediaRouter$RouteCategory;->getName(Landroid/content/Context;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getRoutes(categoryObj: Object): java.util.List { return TODO("body: (Ljava/lang/Object;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         .local v0, "out":Ljava/util/ArrayList;
    //         check-cast p0, Landroid/media/MediaRouter$RouteCategory;
    //         .end local p0    # "categoryObj":Ljava/lang/Object;
    //         invoke-virtual {p0, v0}, Landroid/media/MediaRouter$RouteCategory;->getRoutes(Ljava/util/List;)Ljava/util/List;
    //         return-object v0
    */

    public @JvmStatic fun getSupportedTypes(categoryObj: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/MediaRouter$RouteCategory;
    //         .end local p0    # "categoryObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/MediaRouter$RouteCategory;->getSupportedTypes()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isGroupable(categoryObj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/MediaRouter$RouteCategory;
    //         .end local p0    # "categoryObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/MediaRouter$RouteCategory;->isGroupable()Z
    //         move-result v0
    //         return v0
    */

    }
}
