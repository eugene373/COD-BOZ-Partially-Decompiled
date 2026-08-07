package android.support.v4.view

// Auto-emitted from smali source: MenuItemCompatIcs.java.
// 1 fields, 3 methods.

open class MenuItemCompatIcs_OnActionExpandListenerWrapper: android.view.MenuItem.OnActionExpandListener {
    private var mWrapped: android.support.v4.view.MenuItemCompatIcs.SupportActionExpandProxy

    public constructor(wrapped: android.support.v4.view.MenuItemCompatIcs.SupportActionExpandProxy)

    public fun onMenuItemActionCollapse(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;->mWrapped:Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;
    //         invoke-interface {v0, p1}, Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    //         move-result v0
    //         return v0
    */

    public fun onMenuItemActionExpand(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;->mWrapped:Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;
    //         invoke-interface {v0, p1}, Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    //         move-result v0
    //         return v0
    */

}
