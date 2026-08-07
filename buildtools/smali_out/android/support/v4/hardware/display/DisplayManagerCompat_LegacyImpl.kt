package android.support.v4.hardware.display

// Auto-emitted from smali source: DisplayManagerCompat.java.
// 1 fields, 4 methods.

open class DisplayManagerCompat_LegacyImpl: android.support.v4.hardware.display.DisplayManagerCompat() {
    private val mWindowManager: android.view.WindowManager

    public constructor(context: android.content.Context)

    public fun getDisplay(displayId: Int): android.view.Display { return TODO("body: (I)Landroid/view/Display;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;->mWindowManager:Landroid/view/WindowManager;
    //         invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
    //         move-result-object v0
    //         .local v0, "display":Landroid/view/Display;
    //         invoke-virtual {v0}, Landroid/view/Display;->getDisplayId()I
    //         move-result v1
    //         if-ne v1, p1, :cond_0
    //         .end local v0    # "display":Landroid/view/Display;
    //         :goto_0
    //         return-object v0
    //         .restart local v0    # "display":Landroid/view/Display;
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun getDisplays(): Array<android.view.Display> { return TODO("body: ()[Landroid/view/Display;") }
    /*
    //         .locals 3
    //         const/4 v0, 0x1
    //         new-array v0, v0, [Landroid/view/Display;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;->mWindowManager:Landroid/view/WindowManager;
    //         invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
    //         move-result-object v2
    //         aput-object v2, v0, v1
    //         return-object v0
    */

    public fun getDisplays(category: String): Array<android.view.Display> { return TODO("body: (Ljava/lang/String;)[Landroid/view/Display;") }
    /*
    //         .locals 1
    //         if-nez p1, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;->getDisplays()[Landroid/view/Display;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         new-array v0, v0, [Landroid/view/Display;
    //         goto :goto_0
    */

}
