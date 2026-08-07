package android.support.v4.media.routing

// Auto-emitted from smali source: MediaRouterJellybean.java.
// 1 fields, 2 methods.

class MediaRouterJellybean_GetDefaultRouteWorkaround {
    private var mGetSystemAudioRouteMethod: java.lang.reflect.Method

    public constructor()

    public fun getDefaultRoute(routerObj: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         move-object v0, p1
    //         check-cast v0, Landroid/media/MediaRouter;
    //         .local v0, "router":Landroid/media/MediaRouter;
    //         iget-object v1, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$GetDefaultRouteWorkaround;->mGetSystemAudioRouteMethod:Ljava/lang/reflect/Method;
    //         if-eqz v1, :cond_0
    //         :try_start_0
    //         iget-object v1, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$GetDefaultRouteWorkaround;->mGetSystemAudioRouteMethod:Ljava/lang/reflect/Method;
    //         const/4 v2, 0x0
    //         new-array v2, v2, [Ljava/lang/Object;
    //         invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v1
    //         :goto_0
    //         return-object v1
    //         :catch_0
    //         move-exception v1
    //         :cond_0
    //         :goto_1
    //         invoke-virtual {v0, v3}, Landroid/media/MediaRouter;->getRouteAt(I)Landroid/media/MediaRouter$RouteInfo;
    //         move-result-object v1
    //         goto :goto_0
    //         :catch_1
    //         move-exception v1
    //         goto :goto_1
    */

}
