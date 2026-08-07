package android.support.v4.hardware.display

// Auto-emitted from smali source: DisplayManagerCompat.java.
// 2 fields, 6 methods.

open class DisplayManagerCompat {
    constructor()

    public fun getDisplay(p0: Int): android.view.Display

    public fun getDisplays(): Array<android.view.Display>

    public fun getDisplays(p0: String): Array<android.view.Display>

    companion object {
    @JvmField public val DISPLAY_CATEGORY_PRESENTATION: String = "android.hardware.display.category.PRESENTATION"
    private val sInstances: java.util.WeakHashMap = null!!

    public @JvmStatic fun getInstance(context: android.content.Context): android.support.v4.hardware.display.DisplayManagerCompat { return TODO("body: (Landroid/content/Context;)Landroid/support/v4/hardware/display/DisplayManagerCompat;") }
    /*
    //         .locals 4
    //         sget-object v3, Landroid/support/v4/hardware/display/DisplayManagerCompat;->sInstances:Ljava/util/WeakHashMap;
    //         monitor-enter v3
    //         :try_start_0
    //         sget-object v2, Landroid/support/v4/hardware/display/DisplayManagerCompat;->sInstances:Ljava/util/WeakHashMap;
    //         invoke-virtual {v2, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/hardware/display/DisplayManagerCompat;
    //         .local v0, "instance":Landroid/support/v4/hardware/display/DisplayManagerCompat;
    //         if-nez v0, :cond_0
    //         sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    //         .local v1, "version":I
    //         const/16 v2, 0x11
    //         if-lt v1, v2, :cond_1
    //         new-instance v0, Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;
    //         .end local v0    # "instance":Landroid/support/v4/hardware/display/DisplayManagerCompat;
    //         invoke-direct {v0, p0}, Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;-><init>(Landroid/content/Context;)V
    //         .restart local v0    # "instance":Landroid/support/v4/hardware/display/DisplayManagerCompat;
    //         :goto_0
    //         sget-object v2, Landroid/support/v4/hardware/display/DisplayManagerCompat;->sInstances:Ljava/util/WeakHashMap;
    //         invoke-virtual {v2, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         .end local v1    # "version":I
    //         :cond_0
    //         monitor-exit v3
    //         return-object v0
    //         .restart local v1    # "version":I
    //         :cond_1
    //         new-instance v0, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;
    //         .end local v0    # "instance":Landroid/support/v4/hardware/display/DisplayManagerCompat;
    //         invoke-direct {v0, p0}, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;-><init>(Landroid/content/Context;)V
    //         .restart local v0    # "instance":Landroid/support/v4/hardware/display/DisplayManagerCompat;
    //         goto :goto_0
    //         .end local v0    # "instance":Landroid/support/v4/hardware/display/DisplayManagerCompat;
    //         .end local v1    # "version":I
    //         :catchall_0
    //         move-exception v2
    //         monitor-exit v3
    //         :try_end_0
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         throw v2
    */

    }
}
