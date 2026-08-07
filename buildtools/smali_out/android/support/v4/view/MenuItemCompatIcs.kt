package android.support.v4.view

// Auto-emitted from smali source: MenuItemCompatIcs.java.
// 0 fields, 5 methods.

open class MenuItemCompatIcs {
    constructor()

    companion object {
    public @JvmStatic fun collapseActionView(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         invoke-interface {p0}, Landroid/view/MenuItem;->collapseActionView()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun expandActionView(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         invoke-interface {p0}, Landroid/view/MenuItem;->expandActionView()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isActionViewExpanded(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         invoke-interface {p0}, Landroid/view/MenuItem;->isActionViewExpanded()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun setOnActionExpandListener(item: android.view.MenuItem, listener: android.support.v4.view.MenuItemCompatIcs.SupportActionExpandProxy): android.view.MenuItem { return TODO("body: (Landroid/view/MenuItem;Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;)Landroid/view/MenuItem;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;
    //         invoke-direct {v0, p1}, Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;-><init>(Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;)V
    //         invoke-interface {p0, v0}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
