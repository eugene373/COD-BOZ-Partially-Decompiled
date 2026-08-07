package android.support.v4.media.routing

// Auto-emitted from smali source: MediaRouterJellybean.java.
// 1 fields, 9 methods.

open class MediaRouterJellybean_CallbackProxy: android.media.MediaRouter.Callback() {
    protected val mCallback: android.support.v4.media.routing.MediaRouterJellybean.Callback

    public constructor(p0: android.support.v4.media.routing.MediaRouterJellybean.Callback)

    public fun onRouteAdded(router: android.media.MediaRouter, route: android.media.MediaRouter.RouteInfo) { /* TODO(body): (Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;, "Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;->mCallback:Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;
    //         invoke-interface {v0, p2}, Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;->onRouteAdded(Ljava/lang/Object;)V
    //         return-void
    */

    public fun onRouteChanged(router: android.media.MediaRouter, route: android.media.MediaRouter.RouteInfo) { /* TODO(body): (Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;, "Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;->mCallback:Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;
    //         invoke-interface {v0, p2}, Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;->onRouteChanged(Ljava/lang/Object;)V
    //         return-void
    */

    public fun onRouteGrouped(router: android.media.MediaRouter, route: android.media.MediaRouter.RouteInfo, group: android.media.MediaRouter.RouteGroup, index: Int) { /* TODO(body): (Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;Landroid/media/MediaRouter$RouteGroup;I)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;, "Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;->mCallback:Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;
    //         invoke-interface {v0, p2, p3, p4}, Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;->onRouteGrouped(Ljava/lang/Object;Ljava/lang/Object;I)V
    //         return-void
    */

    public fun onRouteRemoved(router: android.media.MediaRouter, route: android.media.MediaRouter.RouteInfo) { /* TODO(body): (Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;, "Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;->mCallback:Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;
    //         invoke-interface {v0, p2}, Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;->onRouteRemoved(Ljava/lang/Object;)V
    //         return-void
    */

    public fun onRouteSelected(router: android.media.MediaRouter, type: Int, route: android.media.MediaRouter.RouteInfo) { /* TODO(body): (Landroid/media/MediaRouter;ILandroid/media/MediaRouter$RouteInfo;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;, "Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;->mCallback:Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;
    //         invoke-interface {v0, p2, p3}, Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;->onRouteSelected(ILjava/lang/Object;)V
    //         return-void
    */

    public fun onRouteUngrouped(router: android.media.MediaRouter, route: android.media.MediaRouter.RouteInfo, group: android.media.MediaRouter.RouteGroup) { /* TODO(body): (Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;Landroid/media/MediaRouter$RouteGroup;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;, "Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;->mCallback:Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;
    //         invoke-interface {v0, p2, p3}, Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;->onRouteUngrouped(Ljava/lang/Object;Ljava/lang/Object;)V
    //         return-void
    */

    public fun onRouteUnselected(router: android.media.MediaRouter, type: Int, route: android.media.MediaRouter.RouteInfo) { /* TODO(body): (Landroid/media/MediaRouter;ILandroid/media/MediaRouter$RouteInfo;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;, "Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;->mCallback:Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;
    //         invoke-interface {v0, p2, p3}, Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;->onRouteUnselected(ILjava/lang/Object;)V
    //         return-void
    */

    public fun onRouteVolumeChanged(router: android.media.MediaRouter, route: android.media.MediaRouter.RouteInfo) { /* TODO(body): (Landroid/media/MediaRouter;Landroid/media/MediaRouter$RouteInfo;)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;, "Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$CallbackProxy;->mCallback:Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;
    //         invoke-interface {v0, p2}, Landroid/support/v4/media/routing/MediaRouterJellybean$Callback;->onRouteVolumeChanged(Ljava/lang/Object;)V
    //         return-void
    */

}
