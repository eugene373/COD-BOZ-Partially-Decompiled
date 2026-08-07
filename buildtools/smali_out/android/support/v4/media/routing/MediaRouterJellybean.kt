package android.support.v4.media.routing

// Auto-emitted from smali source: MediaRouterJellybean.java.
// 5 fields, 14 methods.

open class MediaRouterJellybean {
    constructor()

    companion object {
    @JvmField public val ALL_ROUTE_TYPES: Int = 0x800003
    @JvmField public val ROUTE_TYPE_LIVE_AUDIO: Int = 0x1
    @JvmField public val ROUTE_TYPE_LIVE_VIDEO: Int = 0x2
    @JvmField public val ROUTE_TYPE_USER: Int = 0x800000
    private val TAG: String = "MediaRouterJellybean"

    public @JvmStatic fun addCallback(routerObj: Object, types: Int, callbackObj: Object) { /* TODO(body): (Ljava/lang/Object;ILjava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/MediaRouter;
    //         .end local p0    # "routerObj":Ljava/lang/Object;
    //         check-cast p2, Landroid/media/MediaRouter$Callback;
    //         .end local p2    # "callbackObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/media/MediaRouter;->addCallback(ILandroid/media/MediaRouter$Callback;)V
    //         return-void
    */

    public @JvmStatic fun addUserRoute(routerObj: Object, routeObj: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/MediaRouter;
    //         .end local p0    # "routerObj":Ljava/lang/Object;
    //         check-cast p1, Landroid/media/MediaRouter$UserRouteInfo;
    //         .end local p1    # "routeObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/MediaRouter;->addUserRoute(Landroid/media/MediaRouter$UserRouteInfo;)V
    //         return-void
    */

    public @JvmStatic fun createCallback(callback: android.support.v4.media.routing.MediaRouterJellybean.Callback): Object { return TODO("body: (Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;
    //         invoke-direct {v0, p0}, Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;-><init>(Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;)V
    //         return-object v0
    */

    public @JvmStatic fun createRouteCategory(routerObj: Object, name: String, isGroupable: Boolean): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;Z)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/MediaRouter;
    //         .end local p0    # "routerObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/media/MediaRouter;->createRouteCategory(Ljava/lang/CharSequence;Z)Landroid/media/MediaRouter$RouteCategory;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun createUserRoute(routerObj: Object, categoryObj: Object): Object { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/MediaRouter;
    //         .end local p0    # "routerObj":Ljava/lang/Object;
    //         check-cast p1, Landroid/media/MediaRouter$RouteCategory;
    //         .end local p1    # "categoryObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/MediaRouter;->createUserRoute(Landroid/media/MediaRouter$RouteCategory;)Landroid/media/MediaRouter$UserRouteInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun createVolumeCallback(callback: android.support.v4.media.routing.MediaRouterJellybean.VolumeCallback): Object { return TODO("body: (Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallback;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallbackProxy;
    //         invoke-direct {v0, p0}, Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallbackProxy;-><init>(Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallback;)V
    //         return-object v0
    */

    public @JvmStatic fun getCategories(routerObj: Object): java.util.List { return TODO("body: (Ljava/lang/Object;)Ljava/util/List;") }
    /*
    //         .locals 5
    //         move-object v3, p0
    //         check-cast v3, Landroid/media/MediaRouter;
    //         .local v3, "router":Landroid/media/MediaRouter;
    //         invoke-virtual {v3}, Landroid/media/MediaRouter;->getCategoryCount()I
    //         move-result v0
    //         .local v0, "count":I
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         .local v2, "out":Ljava/util/List;
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         if-ge v1, v0, :cond_0
    //         invoke-virtual {v3, v1}, Landroid/media/MediaRouter;->getCategoryAt(I)Landroid/media/MediaRouter$RouteCategory;
    //         move-result-object v4
    //         invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object v2
    */

    public @JvmStatic fun getMediaRouter(context: android.content.Context): Object { return TODO("body: (Landroid/content/Context;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const-string v0, "media_router"
    //         invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getRoutes(routerObj: Object): java.util.List { return TODO("body: (Ljava/lang/Object;)Ljava/util/List;") }
    /*
    //         .locals 5
    //         move-object v3, p0
    //         check-cast v3, Landroid/media/MediaRouter;
    //         .local v3, "router":Landroid/media/MediaRouter;
    //         invoke-virtual {v3}, Landroid/media/MediaRouter;->getRouteCount()I
    //         move-result v0
    //         .local v0, "count":I
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V
    //         .local v2, "out":Ljava/util/List;
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         if-ge v1, v0, :cond_0
    //         invoke-virtual {v3, v1}, Landroid/media/MediaRouter;->getRouteAt(I)Landroid/media/MediaRouter$RouteInfo;
    //         move-result-object v4
    //         invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_0
    //         return-object v2
    */

    public @JvmStatic fun getSelectedRoute(routerObj: Object, type: Int): Object { return TODO("body: (Ljava/lang/Object;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/MediaRouter;
    //         .end local p0    # "routerObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/MediaRouter;->getSelectedRoute(I)Landroid/media/MediaRouter$RouteInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun removeCallback(routerObj: Object, callbackObj: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/MediaRouter;
    //         .end local p0    # "routerObj":Ljava/lang/Object;
    //         check-cast p1, Landroid/media/MediaRouter$Callback;
    //         .end local p1    # "callbackObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/MediaRouter;->removeCallback(Landroid/media/MediaRouter$Callback;)V
    //         return-void
    */

    public @JvmStatic fun removeUserRoute(routerObj: Object, routeObj: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/MediaRouter;
    //         .end local p0    # "routerObj":Ljava/lang/Object;
    //         check-cast p1, Landroid/media/MediaRouter$UserRouteInfo;
    //         .end local p1    # "routeObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/media/MediaRouter;->removeUserRoute(Landroid/media/MediaRouter$UserRouteInfo;)V
    //         return-void
    */

    public @JvmStatic fun selectRoute(routerObj: Object, types: Int, routeObj: Object) { /* TODO(body): (Ljava/lang/Object;ILjava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/MediaRouter;
    //         .end local p0    # "routerObj":Ljava/lang/Object;
    //         check-cast p2, Landroid/media/MediaRouter$RouteInfo;
    //         .end local p2    # "routeObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/media/MediaRouter;->selectRoute(ILandroid/media/MediaRouter$RouteInfo;)V
    //         return-void
    */

    }
}
