package android.support.v4.media.routing

// Auto-emitted from smali source: MediaRouterJellybean.java.
// 1 fields, 3 methods.

open class MediaRouterJellybean_VolumeCallbackProxy: android.media.MediaRouter.VolumeCallback() {
    protected val mCallback: android.support.v4.media.routing.MediaRouterJellybean.VolumeCallback

    public constructor(p0: android.support.v4.media.routing.MediaRouterJellybean.VolumeCallback)

    public fun onVolumeSetRequest(route: android.media.MediaRouter.RouteInfo, volume: Int) { /* TODO(body): (Landroid/media/MediaRouter$RouteInfo;I)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallbackProxy;, "Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallbackProxy;->mCallback:Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallback;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallback;->onVolumeSetRequest(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun onVolumeUpdateRequest(route: android.media.MediaRouter.RouteInfo, direction: Int) { /* TODO(body): (Landroid/media/MediaRouter$RouteInfo;I)V */ }
    /*
    //         .locals 1
    //         .local p0, "this":Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallbackProxy;, "Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallbackProxy<TT;>;"
    //         iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallbackProxy;->mCallback:Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallback;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/media/routing/MediaRouterJellybean$VolumeCallback;->onVolumeUpdateRequest(Ljava/lang/Object;I)V
    //         return-void
    */

}
