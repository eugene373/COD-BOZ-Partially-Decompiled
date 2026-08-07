package android.support.v4.hardware.display

// Auto-emitted from smali source: DisplayManagerCompat.java.
// 1 fields, 4 methods.

open class DisplayManagerCompat_JellybeanMr1Impl: android.support.v4.hardware.display.DisplayManagerCompat() {
    private val mDisplayManagerObj: Object

    public constructor(context: android.content.Context)

    public fun getDisplay(displayId: Int): android.view.Display { return TODO("body: (I)Landroid/view/Display;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;->mDisplayManagerObj:Ljava/lang/Object;
    //         invoke-static {v0, p1}, Landroid/support/v4/hardware/display/DisplayManagerJellybeanMr1;->getDisplay(Ljava/lang/Object;I)Landroid/view/Display;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDisplays(): Array<android.view.Display> { return TODO("body: ()[Landroid/view/Display;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;->mDisplayManagerObj:Ljava/lang/Object;
    //         invoke-static {v0}, Landroid/support/v4/hardware/display/DisplayManagerJellybeanMr1;->getDisplays(Ljava/lang/Object;)[Landroid/view/Display;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDisplays(category: String): Array<android.view.Display> { return TODO("body: (Ljava/lang/String;)[Landroid/view/Display;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;->mDisplayManagerObj:Ljava/lang/Object;
    //         invoke-static {v0, p1}, Landroid/support/v4/hardware/display/DisplayManagerJellybeanMr1;->getDisplays(Ljava/lang/Object;Ljava/lang/String;)[Landroid/view/Display;
    //         move-result-object v0
    //         return-object v0
    */

}
