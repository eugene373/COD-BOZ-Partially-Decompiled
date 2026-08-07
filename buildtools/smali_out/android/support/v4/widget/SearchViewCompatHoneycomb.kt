package android.support.v4.widget

// Auto-emitted from smali source: SearchViewCompatHoneycomb.java.
// 0 fields, 17 methods.

open class SearchViewCompatHoneycomb {
    constructor()

    companion object {
    public @JvmStatic fun getQuery(searchView: android.view.View): CharSequence { return TODO("body: (Landroid/view/View;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Landroid/view/View;
    //         invoke-virtual {p0}, Landroid/widget/SearchView;->getQuery()Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun isIconified(searchView: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Landroid/view/View;
    //         invoke-virtual {p0}, Landroid/widget/SearchView;->isIconified()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isQueryRefinementEnabled(searchView: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Landroid/view/View;
    //         invoke-virtual {p0}, Landroid/widget/SearchView;->isQueryRefinementEnabled()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isSubmitButtonEnabled(searchView: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Landroid/view/View;
    //         invoke-virtual {p0}, Landroid/widget/SearchView;->isSubmitButtonEnabled()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun newOnCloseListener(listener: android.support.v4.widget.SearchViewCompatHoneycomb.OnCloseListenerCompatBridge): Object { return TODO("body: (Landroid/support/v4/widget/SearchViewCompatHoneycomb$OnCloseListenerCompatBridge;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/widget/SearchViewCompatHoneycomb$2;
    //         invoke-direct {v0, p0}, Landroid/support/v4/widget/SearchViewCompatHoneycomb$2;-><init>(Landroid/support/v4/widget/SearchViewCompatHoneycomb$OnCloseListenerCompatBridge;)V
    //         return-object v0
    */

    public @JvmStatic fun newOnQueryTextListener(listener: android.support.v4.widget.SearchViewCompatHoneycomb.OnQueryTextListenerCompatBridge): Object { return TODO("body: (Landroid/support/v4/widget/SearchViewCompatHoneycomb$OnQueryTextListenerCompatBridge;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/widget/SearchViewCompatHoneycomb$1;
    //         invoke-direct {v0, p0}, Landroid/support/v4/widget/SearchViewCompatHoneycomb$1;-><init>(Landroid/support/v4/widget/SearchViewCompatHoneycomb$OnQueryTextListenerCompatBridge;)V
    //         return-object v0
    */

    public @JvmStatic fun newSearchView(context: android.content.Context): android.view.View { return TODO("body: (Landroid/content/Context;)Landroid/view/View;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/widget/SearchView;
    //         invoke-direct {v0, p0}, Landroid/widget/SearchView;-><init>(Landroid/content/Context;)V
    //         return-object v0
    */

    public @JvmStatic fun setIconified(searchView: android.view.View, iconify: Boolean) { /* TODO(body): (Landroid/view/View;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Landroid/view/View;
    //         invoke-virtual {p0, p1}, Landroid/widget/SearchView;->setIconified(Z)V
    //         return-void
    */

    public @JvmStatic fun setMaxWidth(searchView: android.view.View, maxpixels: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Landroid/view/View;
    //         invoke-virtual {p0, p1}, Landroid/widget/SearchView;->setMaxWidth(I)V
    //         return-void
    */

    public @JvmStatic fun setOnCloseListener(searchView: Object, listener: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Ljava/lang/Object;
    //         check-cast p1, Landroid/widget/SearchView$OnCloseListener;
    //         .end local p1    # "listener":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/widget/SearchView;->setOnCloseListener(Landroid/widget/SearchView$OnCloseListener;)V
    //         return-void
    */

    public @JvmStatic fun setOnQueryTextListener(searchView: Object, listener: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Ljava/lang/Object;
    //         check-cast p1, Landroid/widget/SearchView$OnQueryTextListener;
    //         .end local p1    # "listener":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V
    //         return-void
    */

    public @JvmStatic fun setQuery(searchView: android.view.View, query: CharSequence, submit: Boolean) { /* TODO(body): (Landroid/view/View;Ljava/lang/CharSequence;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Landroid/view/View;
    //         invoke-virtual {p0, p1, p2}, Landroid/widget/SearchView;->setQuery(Ljava/lang/CharSequence;Z)V
    //         return-void
    */

    public @JvmStatic fun setQueryHint(searchView: android.view.View, hint: CharSequence) { /* TODO(body): (Landroid/view/View;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Landroid/view/View;
    //         invoke-virtual {p0, p1}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V
    //         return-void
    */

    public @JvmStatic fun setQueryRefinementEnabled(searchView: android.view.View, enable: Boolean) { /* TODO(body): (Landroid/view/View;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Landroid/view/View;
    //         invoke-virtual {p0, p1}, Landroid/widget/SearchView;->setQueryRefinementEnabled(Z)V
    //         return-void
    */

    public @JvmStatic fun setSearchableInfo(searchView: android.view.View, searchableComponent: android.content.ComponentName) { /* TODO(body): (Landroid/view/View;Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 4
    //         move-object v1, p0
    //         check-cast v1, Landroid/widget/SearchView;
    //         .local v1, "sv":Landroid/widget/SearchView;
    //         invoke-virtual {v1}, Landroid/widget/SearchView;->getContext()Landroid/content/Context;
    //         move-result-object v2
    //         const-string v3, "search"
    //         invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/SearchManager;
    //         .local v0, "searchManager":Landroid/app/SearchManager;
    //         invoke-virtual {v0, p1}, Landroid/app/SearchManager;->getSearchableInfo(Landroid/content/ComponentName;)Landroid/app/SearchableInfo;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Landroid/widget/SearchView;->setSearchableInfo(Landroid/app/SearchableInfo;)V
    //         return-void
    */

    public @JvmStatic fun setSubmitButtonEnabled(searchView: android.view.View, enabled: Boolean) { /* TODO(body): (Landroid/view/View;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Landroid/view/View;
    //         invoke-virtual {p0, p1}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V
    //         return-void
    */

    }
}
