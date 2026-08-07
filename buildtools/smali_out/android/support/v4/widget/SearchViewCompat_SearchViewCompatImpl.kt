package android.support.v4.widget

// Auto-emitted from smali source: SearchViewCompat.java.
// 0 fields, 18 methods.

interface SearchViewCompat_SearchViewCompatImpl {
    public fun getQuery(p0: android.view.View): CharSequence

    public fun isIconified(p0: android.view.View): Boolean

    public fun isQueryRefinementEnabled(p0: android.view.View): Boolean

    public fun isSubmitButtonEnabled(p0: android.view.View): Boolean

    public fun newOnCloseListener(p0: android.support.v4.widget.SearchViewCompat.OnCloseListenerCompat): Object

    public fun newOnQueryTextListener(p0: android.support.v4.widget.SearchViewCompat.OnQueryTextListenerCompat): Object

    public fun newSearchView(p0: android.content.Context): android.view.View

    public fun setIconified(p0: android.view.View, p1: Boolean)

    public fun setImeOptions(p0: android.view.View, p1: Int)

    public fun setInputType(p0: android.view.View, p1: Int)

    public fun setMaxWidth(p0: android.view.View, p1: Int)

    public fun setOnCloseListener(p0: Object, p1: Object)

    public fun setOnQueryTextListener(p0: Object, p1: Object)

    public fun setQuery(p0: android.view.View, p1: CharSequence, p2: Boolean)

    public fun setQueryHint(p0: android.view.View, p1: CharSequence)

    public fun setQueryRefinementEnabled(p0: android.view.View, p1: Boolean)

    public fun setSearchableInfo(p0: android.view.View, p1: android.content.ComponentName)

    public fun setSubmitButtonEnabled(p0: android.view.View, p1: Boolean)

}
