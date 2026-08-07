package android.support.v4.view

// Auto-emitted from smali source: MenuItemCompat.java.
// 7 fields, 12 methods.

open class MenuItemCompat {
    public constructor()

    companion object {
    val IMPL: android.support.v4.view.MenuItemCompat.MenuVersionImpl = null!!
    @JvmField public val SHOW_AS_ACTION_ALWAYS: Int = 0x2
    @JvmField public val SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW: Int = 0x8
    @JvmField public val SHOW_AS_ACTION_IF_ROOM: Int = 0x1
    @JvmField public val SHOW_AS_ACTION_NEVER: Int = 0x0
    @JvmField public val SHOW_AS_ACTION_WITH_TEXT: Int = 0x4
    private val TAG: String = "MenuItemCompat"

    public @JvmStatic fun collapseActionView(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         instance-of v0, p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         if-eqz v0, :cond_0
    //         check-cast p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         .end local p0    # "item":Landroid/view/MenuItem;
    //         invoke-interface {p0}, Landroid/support/v4/internal/view/SupportMenuItem;->collapseActionView()Z
    //         move-result v0
    //         .restart local p0    # "item":Landroid/view/MenuItem;
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/view/MenuItemCompat;->IMPL:Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;->collapseActionView(Landroid/view/MenuItem;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public @JvmStatic fun expandActionView(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         instance-of v0, p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         if-eqz v0, :cond_0
    //         check-cast p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         .end local p0    # "item":Landroid/view/MenuItem;
    //         invoke-interface {p0}, Landroid/support/v4/internal/view/SupportMenuItem;->expandActionView()Z
    //         move-result v0
    //         .restart local p0    # "item":Landroid/view/MenuItem;
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/view/MenuItemCompat;->IMPL:Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;->expandActionView(Landroid/view/MenuItem;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public @JvmStatic fun getActionProvider(item: android.view.MenuItem): android.support.v4.view.ActionProvider { return TODO("body: (Landroid/view/MenuItem;)Landroid/support/v4/view/ActionProvider;") }
    /*
    //         .locals 2
    //         instance-of v0, p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         if-eqz v0, :cond_0
    //         check-cast p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         .end local p0    # "item":Landroid/view/MenuItem;
    //         invoke-interface {p0}, Landroid/support/v4/internal/view/SupportMenuItem;->getSupportActionProvider()Landroid/support/v4/view/ActionProvider;
    //         move-result-object v0
    //         .restart local p0    # "item":Landroid/view/MenuItem;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         const-string v0, "MenuItemCompat"
    //         const-string v1, "getActionProvider: item does not implement SupportMenuItem; returning null"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun getActionView(item: android.view.MenuItem): android.view.View { return TODO("body: (Landroid/view/MenuItem;)Landroid/view/View;") }
    /*
    //         .locals 1
    //         instance-of v0, p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         if-eqz v0, :cond_0
    //         check-cast p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         .end local p0    # "item":Landroid/view/MenuItem;
    //         invoke-interface {p0}, Landroid/support/v4/internal/view/SupportMenuItem;->getActionView()Landroid/view/View;
    //         move-result-object v0
    //         .restart local p0    # "item":Landroid/view/MenuItem;
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/view/MenuItemCompat;->IMPL:Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;->getActionView(Landroid/view/MenuItem;)Landroid/view/View;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun isActionViewExpanded(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         instance-of v0, p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         if-eqz v0, :cond_0
    //         check-cast p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         .end local p0    # "item":Landroid/view/MenuItem;
    //         invoke-interface {p0}, Landroid/support/v4/internal/view/SupportMenuItem;->isActionViewExpanded()Z
    //         move-result v0
    //         .restart local p0    # "item":Landroid/view/MenuItem;
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/view/MenuItemCompat;->IMPL:Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;->isActionViewExpanded(Landroid/view/MenuItem;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public @JvmStatic fun setActionProvider(item: android.view.MenuItem, provider: android.support.v4.view.ActionProvider): android.view.MenuItem { return TODO("body: (Landroid/view/MenuItem;Landroid/support/v4/view/ActionProvider;)Landroid/view/MenuItem;") }
    /*
    //         .locals 2
    //         instance-of v0, p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         if-eqz v0, :cond_0
    //         check-cast p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         .end local p0    # "item":Landroid/view/MenuItem;
    //         invoke-interface {p0, p1}, Landroid/support/v4/internal/view/SupportMenuItem;->setSupportActionProvider(Landroid/support/v4/view/ActionProvider;)Landroid/support/v4/internal/view/SupportMenuItem;
    //         move-result-object p0
    //         :goto_0
    //         return-object p0
    //         .restart local p0    # "item":Landroid/view/MenuItem;
    //         :cond_0
    //         const-string v0, "MenuItemCompat"
    //         const-string v1, "setActionProvider: item does not implement SupportMenuItem; ignoring"
    //         invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    public @JvmStatic fun setActionView(item: android.view.MenuItem, resId: Int): android.view.MenuItem { return TODO("body: (Landroid/view/MenuItem;I)Landroid/view/MenuItem;") }
    /*
    //         .locals 1
    //         instance-of v0, p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         if-eqz v0, :cond_0
    //         check-cast p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         .end local p0    # "item":Landroid/view/MenuItem;
    //         invoke-interface {p0, p1}, Landroid/support/v4/internal/view/SupportMenuItem;->setActionView(I)Landroid/view/MenuItem;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         .restart local p0    # "item":Landroid/view/MenuItem;
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/view/MenuItemCompat;->IMPL:Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;->setActionView(Landroid/view/MenuItem;I)Landroid/view/MenuItem;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun setActionView(item: android.view.MenuItem, view: android.view.View): android.view.MenuItem { return TODO("body: (Landroid/view/MenuItem;Landroid/view/View;)Landroid/view/MenuItem;") }
    /*
    //         .locals 1
    //         instance-of v0, p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         if-eqz v0, :cond_0
    //         check-cast p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         .end local p0    # "item":Landroid/view/MenuItem;
    //         invoke-interface {p0, p1}, Landroid/support/v4/internal/view/SupportMenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         .restart local p0    # "item":Landroid/view/MenuItem;
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/view/MenuItemCompat;->IMPL:Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;->setActionView(Landroid/view/MenuItem;Landroid/view/View;)Landroid/view/MenuItem;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun setOnActionExpandListener(item: android.view.MenuItem, listener: android.support.v4.view.MenuItemCompat.OnActionExpandListener): android.view.MenuItem { return TODO("body: (Landroid/view/MenuItem;Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)Landroid/view/MenuItem;") }
    /*
    //         .locals 1
    //         instance-of v0, p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         if-eqz v0, :cond_0
    //         check-cast p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         .end local p0    # "item":Landroid/view/MenuItem;
    //         invoke-interface {p0, p1}, Landroid/support/v4/internal/view/SupportMenuItem;->setSupportOnActionExpandListener(Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)Landroid/support/v4/internal/view/SupportMenuItem;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         .restart local p0    # "item":Landroid/view/MenuItem;
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/view/MenuItemCompat;->IMPL:Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;->setOnActionExpandListener(Landroid/view/MenuItem;Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)Landroid/view/MenuItem;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun setShowAsAction(item: android.view.MenuItem, actionEnum: Int) { /* TODO(body): (Landroid/view/MenuItem;I)V */ }
    /*
    //         .locals 1
    //         instance-of v0, p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         if-eqz v0, :cond_0
    //         check-cast p0, Landroid/support/v4/internal/view/SupportMenuItem;
    //         .end local p0    # "item":Landroid/view/MenuItem;
    //         invoke-interface {p0, p1}, Landroid/support/v4/internal/view/SupportMenuItem;->setShowAsAction(I)V
    //         :goto_0
    //         return-void
    //         .restart local p0    # "item":Landroid/view/MenuItem;
    //         :cond_0
    //         sget-object v0, Landroid/support/v4/view/MenuItemCompat;->IMPL:Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;->setShowAsAction(Landroid/view/MenuItem;I)V
    //         goto :goto_0
    */

    }
}
