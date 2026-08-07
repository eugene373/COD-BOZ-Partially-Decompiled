package android.support.v4.media.routing

// Auto-emitted from smali source: MediaRouterJellybeanMr2.java.
// 0 fields, 3 methods.

open class MediaRouterJellybeanMr2: android.support.v4.media.routing.MediaRouterJellybeanMr1() {
    constructor()

    companion object {
    public @JvmStatic fun addCallback(routerObj: Object, types: Int, callbackObj: Object, flags: Int) { /* TODO(body): (Ljava/lang/Object;ILjava/lang/Object;I)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/media/MediaRouter;
    //         .end local p0    # "routerObj":Ljava/lang/Object;
    //         check-cast p2, Landroid/media/MediaRouter$Callback;
    //         .end local p2    # "callbackObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/media/MediaRouter;->addCallback(ILandroid/media/MediaRouter$Callback;I)V
    //         return-void
    */

    public @JvmStatic fun getDefaultRoute(routerObj: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/media/MediaRouter;
    //         .end local p0    # "routerObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/media/MediaRouter;->getDefaultRoute()Landroid/media/MediaRouter$RouteInfo;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
