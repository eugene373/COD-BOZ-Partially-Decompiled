package android.support.v4.media.routing

// Auto-emitted from smali source: MediaRouterJellybeanMr1.java.
// 2 fields, 2 methods.

class MediaRouterJellybeanMr1_IsConnectingWorkaround {
    private var mGetStatusCodeMethod: java.lang.reflect.Method
    private var mStatusConnecting: Int

    public constructor()

    public fun isConnecting(routeObj: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 5
    //         const/4 v3, 0x0
    //         move-object v0, p1
    //         check-cast v0, Landroid/media/MediaRouter$RouteInfo;
    //         .local v0, "route":Landroid/media/MediaRouter$RouteInfo;
    //         iget-object v2, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$IsConnectingWorkaround;->mGetStatusCodeMethod:Ljava/lang/reflect/Method;
    //         if-eqz v2, :cond_1
    //         :try_start_0
    //         iget-object v2, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$IsConnectingWorkaround;->mGetStatusCodeMethod:Ljava/lang/reflect/Method;
    //         const/4 v4, 0x0
    //         new-array v4, v4, [Ljava/lang/Object;
    //         invoke-virtual {v2, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/Integer;
    //         invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
    //         move-result v1
    //         .local v1, "statusCode":I
    //         iget v2, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$IsConnectingWorkaround;->mStatusConnecting:I
    //         :try_end_0
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    //         if-ne v1, v2, :cond_0
    //         const/4 v2, 0x1
    //         .end local v1    # "statusCode":I
    //         :goto_0
    //         return v2
    //         .restart local v1    # "statusCode":I
    //         :cond_0
    //         move v2, v3
    //         goto :goto_0
    //         .end local v1    # "statusCode":I
    //         :catch_0
    //         move-exception v2
    //         :cond_1
    //         :goto_1
    //         move v2, v3
    //         goto :goto_0
    //         :catch_1
    //         move-exception v2
    //         goto :goto_1
    */

}
