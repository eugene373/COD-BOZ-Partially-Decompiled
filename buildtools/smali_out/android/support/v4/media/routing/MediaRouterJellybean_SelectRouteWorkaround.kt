package android.support.v4.media.routing

// Auto-emitted from smali source: MediaRouterJellybean.java.
// 1 fields, 2 methods.

class MediaRouterJellybean_SelectRouteWorkaround {
    private var mSelectRouteIntMethod: java.lang.reflect.Method

    public constructor()

    public fun selectRoute(routerObj: Object, types: Int, routeObj: Object) { /* TODO(body): (Ljava/lang/Object;ILjava/lang/Object;)V */ }
    /*
    //         .locals 8
    //         move-object v3, p1
    //         check-cast v3, Landroid/media/MediaRouter;
    //         .local v3, "router":Landroid/media/MediaRouter;
    //         move-object v1, p3
    //         check-cast v1, Landroid/media/MediaRouter$RouteInfo;
    //         .local v1, "route":Landroid/media/MediaRouter$RouteInfo;
    //         invoke-virtual {v1}, Landroid/media/MediaRouter$RouteInfo;->getSupportedTypes()I
    //         move-result v2
    //         .local v2, "routeTypes":I
    //         const/high16 v4, 0x800000
    //         and-int/2addr v4, v2
    //         if-nez v4, :cond_0
    //         iget-object v4, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$SelectRouteWorkaround;->mSelectRouteIntMethod:Ljava/lang/reflect/Method;
    //         if-eqz v4, :cond_1
    //         :try_start_0
    //         iget-object v4, p0, Landroid/support/v4/media/routing/MediaRouterJellybean$SelectRouteWorkaround;->mSelectRouteIntMethod:Ljava/lang/reflect/Method;
    //         const/4 v5, 0x2
    //         new-array v5, v5, [Ljava/lang/Object;
    //         const/4 v6, 0x0
    //         invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v7
    //         aput-object v7, v5, v6
    //         const/4 v6, 0x1
    //         aput-object v1, v5, v6
    //         invoke-virtual {v4, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "ex":Ljava/lang/IllegalAccessException;
    //         const-string v4, "MediaRouterJellybean"
    //         const-string v5, "Cannot programmatically select non-user route.  Media routing may not work."
    //         invoke-static {v4, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         .end local v0    # "ex":Ljava/lang/IllegalAccessException;
    //         :cond_0
    //         :goto_1
    //         invoke-virtual {v3, p2, v1}, Landroid/media/MediaRouter;->selectRoute(ILandroid/media/MediaRouter$RouteInfo;)V
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         .local v0, "ex":Ljava/lang/reflect/InvocationTargetException;
    //         const-string v4, "MediaRouterJellybean"
    //         const-string v5, "Cannot programmatically select non-user route.  Media routing may not work."
    //         invoke-static {v4, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_1
    //         .end local v0    # "ex":Ljava/lang/reflect/InvocationTargetException;
    //         :cond_1
    //         const-string v4, "MediaRouterJellybean"
    //         const-string v5, "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work."
    //         invoke-static {v4, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_1
    */

}
