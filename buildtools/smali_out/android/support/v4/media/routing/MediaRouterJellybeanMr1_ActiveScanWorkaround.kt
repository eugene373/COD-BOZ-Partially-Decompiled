package android.support.v4.media.routing

// Auto-emitted from smali source: MediaRouterJellybeanMr1.java.
// 5 fields, 3 methods.

class MediaRouterJellybeanMr1_ActiveScanWorkaround: Runnable {
    private var mActivelyScanningWifiDisplays: Boolean
    private val mDisplayManager: android.hardware.display.DisplayManager
    private val mHandler: android.os.Handler
    private var mScanWifiDisplaysMethod: java.lang.reflect.Method

    public constructor(context: android.content.Context, handler: android.os.Handler)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-boolean v1, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$ActiveScanWorkaround;->mActivelyScanningWifiDisplays:Z
    //         if-eqz v1, :cond_0
    //         :try_start_0
    //         iget-object v1, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$ActiveScanWorkaround;->mScanWifiDisplaysMethod:Ljava/lang/reflect/Method;
    //         iget-object v2, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$ActiveScanWorkaround;->mDisplayManager:Landroid/hardware/display/DisplayManager;
    //         const/4 v3, 0x0
    //         new-array v3, v3, [Ljava/lang/Object;
    //         invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //         :try_end_0
    //         .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    //         :goto_0
    //         iget-object v1, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$ActiveScanWorkaround;->mHandler:Landroid/os/Handler;
    //         const-wide/16 v2, 0x3a98
    //         invoke-virtual {v1, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    //         :cond_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "ex":Ljava/lang/IllegalAccessException;
    //         const-string v1, "MediaRouterJellybeanMr1"
    //         const-string v2, "Cannot scan for wifi displays."
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    //         .end local v0    # "ex":Ljava/lang/IllegalAccessException;
    //         :catch_1
    //         move-exception v0
    //         .local v0, "ex":Ljava/lang/reflect/InvocationTargetException;
    //         const-string v1, "MediaRouterJellybeanMr1"
    //         const-string v2, "Cannot scan for wifi displays."
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         goto :goto_0
    */

    public fun setActiveScanRouteTypes(routeTypes: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         and-int/lit8 v0, p1, 0x2
    //         if-eqz v0, :cond_2
    //         iget-boolean v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$ActiveScanWorkaround;->mActivelyScanningWifiDisplays:Z
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$ActiveScanWorkaround;->mScanWifiDisplaysMethod:Ljava/lang/reflect/Method;
    //         if-eqz v0, :cond_1
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$ActiveScanWorkaround;->mActivelyScanningWifiDisplays:Z
    //         iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$ActiveScanWorkaround;->mHandler:Landroid/os/Handler;
    //         invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const-string v0, "MediaRouterJellybeanMr1"
    //         const-string v1, "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device."
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :cond_2
    //         iget-boolean v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$ActiveScanWorkaround;->mActivelyScanningWifiDisplays:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$ActiveScanWorkaround;->mActivelyScanningWifiDisplays:Z
    //         iget-object v0, p0, Landroid/support/v4/media/routing/MediaRouterJellybeanMr1$ActiveScanWorkaround;->mHandler:Landroid/os/Handler;
    //         invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    //         goto :goto_0
    */

    companion object {
    private val WIFI_DISPLAY_SCAN_INTERVAL: Int = 0x3a98
    }
}
