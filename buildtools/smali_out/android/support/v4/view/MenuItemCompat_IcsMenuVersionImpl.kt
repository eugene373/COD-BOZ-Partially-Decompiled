package android.support.v4.view

// Auto-emitted from smali source: MenuItemCompat.java.
// 0 fields, 5 methods.

open class MenuItemCompat_IcsMenuVersionImpl: android.support.v4.view.MenuItemCompat.HoneycombMenuVersionImpl() {
    constructor()

    public fun collapseActionView(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/MenuItemCompatIcs;->collapseActionView(Landroid/view/MenuItem;)Z
    //         move-result v0
    //         return v0
    */

    public fun expandActionView(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/MenuItemCompatIcs;->expandActionView(Landroid/view/MenuItem;)Z
    //         move-result v0
    //         return v0
    */

    public fun isActionViewExpanded(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/MenuItemCompatIcs;->isActionViewExpanded(Landroid/view/MenuItem;)Z
    //         move-result v0
    //         return v0
    */

    public fun setOnActionExpandListener(item: android.view.MenuItem, listener: android.support.v4.view.MenuItemCompat.OnActionExpandListener): android.view.MenuItem { return TODO("body: (Landroid/view/MenuItem;Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)Landroid/view/MenuItem;") }
    /*
    //         .locals 1
    //         if-nez p2, :cond_0
    //         const/4 v0, 0x0
    //         invoke-static {p1, v0}, Landroid/support/v4/view/MenuItemCompatIcs;->setOnActionExpandListener(Landroid/view/MenuItem;Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;)Landroid/view/MenuItem;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl$1;
    //         invoke-direct {v0, p0, p2}, Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl$1;-><init>(Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl;Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)V
    //         invoke-static {p1, v0}, Landroid/support/v4/view/MenuItemCompatIcs;->setOnActionExpandListener(Landroid/view/MenuItem;Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;)Landroid/view/MenuItem;
    //         move-result-object v0
    //         goto :goto_0
    */

}
