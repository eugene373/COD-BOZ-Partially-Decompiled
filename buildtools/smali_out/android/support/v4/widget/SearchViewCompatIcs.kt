package android.support.v4.widget

// Auto-emitted from smali source: SearchViewCompatIcs.java.
// 0 fields, 4 methods.

open class SearchViewCompatIcs {
    constructor()

    companion object {
    public @JvmStatic fun newSearchView(context: android.content.Context): android.view.View { return TODO("body: (Landroid/content/Context;)Landroid/view/View;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/widget/SearchViewCompatIcs$MySearchView;
    //         invoke-direct {v0, p0}, Landroid/support/v4/widget/SearchViewCompatIcs$MySearchView;-><init>(Landroid/content/Context;)V
    //         return-object v0
    */

    public @JvmStatic fun setImeOptions(searchView: android.view.View, imeOptions: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Landroid/view/View;
    //         invoke-virtual {p0, p1}, Landroid/widget/SearchView;->setImeOptions(I)V
    //         return-void
    */

    public @JvmStatic fun setInputType(searchView: android.view.View, inputType: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/SearchView;
    //         .end local p0    # "searchView":Landroid/view/View;
    //         invoke-virtual {p0, p1}, Landroid/widget/SearchView;->setInputType(I)V
    //         return-void
    */

    }
}
