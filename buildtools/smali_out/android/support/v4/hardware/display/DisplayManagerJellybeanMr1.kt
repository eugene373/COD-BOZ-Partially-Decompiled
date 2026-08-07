package android.support.v4.hardware.display

// Auto-emitted from smali source: DisplayManagerJellybeanMr1.java.
// 0 fields, 5 methods.

class DisplayManagerJellybeanMr1 {
    constructor()

    companion object {
    public @JvmStatic fun getDisplay(displayManagerObj: Object, displayId: Int): android.view.Display { return TODO("body: (Ljava/lang/Object;I)Landroid/view/Display;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/hardware/display/DisplayManager;
    //         .end local p0    # "displayManagerObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getDisplayManager(context: android.content.Context): Object { return TODO("body: (Landroid/content/Context;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const-string v0, "display"
    //         invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getDisplays(displayManagerObj: Object): Array<android.view.Display> { return TODO("body: (Ljava/lang/Object;)[Landroid/view/Display;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/hardware/display/DisplayManager;
    //         .end local p0    # "displayManagerObj":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getDisplays(displayManagerObj: Object, category: String): Array<android.view.Display> { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;)[Landroid/view/Display;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/hardware/display/DisplayManager;
    //         .end local p0    # "displayManagerObj":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/hardware/display/DisplayManager;->getDisplays(Ljava/lang/String;)[Landroid/view/Display;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
