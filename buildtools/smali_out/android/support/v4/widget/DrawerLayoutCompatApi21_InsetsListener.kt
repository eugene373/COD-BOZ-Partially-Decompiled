package android.support.v4.widget

// Auto-emitted from smali source: DrawerLayoutCompatApi21.java.
// 0 fields, 2 methods.

open class DrawerLayoutCompatApi21_InsetsListener: android.view.View.OnApplyWindowInsetsListener {
    constructor()

    public fun onApplyWindowInsets(v: android.view.View, insets: android.view.WindowInsets): android.view.WindowInsets { return TODO("body: (Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;") }
    /*
    //         .locals 2
    //         move-object v0, p1
    //         check-cast v0, Landroid/support/v4/widget/DrawerLayoutImpl;
    //         .local v0, "drawerLayout":Landroid/support/v4/widget/DrawerLayoutImpl;
    //         invoke-virtual {p2}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
    //         move-result v1
    //         if-lez v1, :cond_0
    //         const/4 v1, 0x1
    //         :goto_0
    //         invoke-interface {v0, p2, v1}, Landroid/support/v4/widget/DrawerLayoutImpl;->setChildInsets(Ljava/lang/Object;Z)V
    //         invoke-virtual {p2}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;
    //         move-result-object v1
    //         return-object v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

}
