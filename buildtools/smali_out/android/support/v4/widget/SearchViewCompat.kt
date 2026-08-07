package android.support.v4.widget

// Auto-emitted from smali source: SearchViewCompat.java.
// 1 fields, 19 methods.

open class SearchViewCompat {
    private constructor(context: android.content.Context)

    companion object {
    private val IMPL: android.support.v4.widget.SearchViewCompat.SearchViewCompatImpl = null!!

    public @JvmStatic fun getQuery(searchView: android.view.View): CharSequence { return TODO("body: (Landroid/view/View;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->getQuery(Landroid/view/View;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun isIconified(searchView: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->isIconified(Landroid/view/View;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isQueryRefinementEnabled(searchView: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->isQueryRefinementEnabled(Landroid/view/View;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isSubmitButtonEnabled(searchView: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->isSubmitButtonEnabled(Landroid/view/View;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun newSearchView(context: android.content.Context): android.view.View { return TODO("body: (Landroid/content/Context;)Landroid/view/View;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->newSearchView(Landroid/content/Context;)Landroid/view/View;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun setIconified(searchView: android.view.View, iconify: Boolean) { /* TODO(body): (Landroid/view/View;Z)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setIconified(Landroid/view/View;Z)V
    //         return-void
    */

    public @JvmStatic fun setImeOptions(searchView: android.view.View, imeOptions: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setImeOptions(Landroid/view/View;I)V
    //         return-void
    */

    public @JvmStatic fun setInputType(searchView: android.view.View, inputType: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setInputType(Landroid/view/View;I)V
    //         return-void
    */

    public @JvmStatic fun setMaxWidth(searchView: android.view.View, maxpixels: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setMaxWidth(Landroid/view/View;I)V
    //         return-void
    */

    public @JvmStatic fun setOnCloseListener(searchView: android.view.View, listener: android.support.v4.widget.SearchViewCompat.OnCloseListenerCompat) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/widget/SearchViewCompat$OnCloseListenerCompat;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         iget-object v1, p1, Landroid/support/v4/widget/SearchViewCompat$OnCloseListenerCompat;->mListener:Ljava/lang/Object;
    //         invoke-interface {v0, p0, v1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setOnCloseListener(Ljava/lang/Object;Ljava/lang/Object;)V
    //         return-void
    */

    public @JvmStatic fun setOnQueryTextListener(searchView: android.view.View, listener: android.support.v4.widget.SearchViewCompat.OnQueryTextListenerCompat) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/widget/SearchViewCompat$OnQueryTextListenerCompat;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         iget-object v1, p1, Landroid/support/v4/widget/SearchViewCompat$OnQueryTextListenerCompat;->mListener:Ljava/lang/Object;
    //         invoke-interface {v0, p0, v1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setOnQueryTextListener(Ljava/lang/Object;Ljava/lang/Object;)V
    //         return-void
    */

    public @JvmStatic fun setQuery(searchView: android.view.View, query: CharSequence, submit: Boolean) { /* TODO(body): (Landroid/view/View;Ljava/lang/CharSequence;Z)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setQuery(Landroid/view/View;Ljava/lang/CharSequence;Z)V
    //         return-void
    */

    public @JvmStatic fun setQueryHint(searchView: android.view.View, hint: CharSequence) { /* TODO(body): (Landroid/view/View;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setQueryHint(Landroid/view/View;Ljava/lang/CharSequence;)V
    //         return-void
    */

    public @JvmStatic fun setQueryRefinementEnabled(searchView: android.view.View, enable: Boolean) { /* TODO(body): (Landroid/view/View;Z)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setQueryRefinementEnabled(Landroid/view/View;Z)V
    //         return-void
    */

    public @JvmStatic fun setSearchableInfo(searchView: android.view.View, searchableComponent: android.content.ComponentName) { /* TODO(body): (Landroid/view/View;Landroid/content/ComponentName;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setSearchableInfo(Landroid/view/View;Landroid/content/ComponentName;)V
    //         return-void
    */

    public @JvmStatic fun setSubmitButtonEnabled(searchView: android.view.View, enabled: Boolean) { /* TODO(body): (Landroid/view/View;Z)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/SearchViewCompat;->IMPL:Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SearchViewCompat$SearchViewCompatImpl;->setSubmitButtonEnabled(Landroid/view/View;Z)V
    //         return-void
    */

    }
}
