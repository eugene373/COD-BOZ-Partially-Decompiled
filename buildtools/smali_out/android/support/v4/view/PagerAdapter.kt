package android.support.v4.view

// Auto-emitted from smali source: PagerAdapter.java.
// 3 fields, 21 methods.

open class PagerAdapter {
    private var mObservable: android.database.DataSetObservable

    public constructor()

    public fun destroyItem(container: android.view.View, position: Int, object: Object) { /* TODO(body): (Landroid/view/View;ILjava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Required method destroyItem was not overridden"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun destroyItem(container: android.view.ViewGroup, position: Int, object: Object) { /* TODO(body): (Landroid/view/ViewGroup;ILjava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/View;ILjava/lang/Object;)V
    //         return-void
    */

    public fun finishUpdate(container: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun finishUpdate(container: android.view.ViewGroup) { /* TODO(body): (Landroid/view/ViewGroup;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/View;)V
    //         return-void
    */

    public fun getCount(): Int

    public fun getItemPosition(object: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, -0x1
    //         return v0
    */

    public fun getPageTitle(position: Int): CharSequence { return TODO("body: (I)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getPageWidth(position: Int): Float { return TODO("body: (I)F") }
    /*
    //         .locals 1
    //         const/high16 v0, 0x3f800000    # 1.0f
    //         return v0
    */

    public fun instantiateItem(container: android.view.View, position: Int): Object { return TODO("body: (Landroid/view/View;I)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         const-string v1, "Required method instantiateItem was not overridden"
    //         invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun instantiateItem(container: android.view.ViewGroup, position: Int): Object { return TODO("body: (Landroid/view/ViewGroup;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1, p2}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/View;I)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun isViewFromObject(p0: android.view.View, p1: Object): Boolean

    public fun notifyDataSetChanged() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/PagerAdapter;->mObservable:Landroid/database/DataSetObservable;
    //         invoke-virtual {v0}, Landroid/database/DataSetObservable;->notifyChanged()V
    //         return-void
    */

    public fun registerDataSetObserver(observer: android.database.DataSetObserver) { /* TODO(body): (Landroid/database/DataSetObserver;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/PagerAdapter;->mObservable:Landroid/database/DataSetObservable;
    //         invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->registerObserver(Ljava/lang/Object;)V
    //         return-void
    */

    public fun restoreState(state: android.os.Parcelable, loader: ClassLoader) { /* TODO(body): (Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun saveState(): android.os.Parcelable { return TODO("body: ()Landroid/os/Parcelable;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun setPrimaryItem(container: android.view.View, position: Int, object: Object) { /* TODO(body): (Landroid/view/View;ILjava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setPrimaryItem(container: android.view.ViewGroup, position: Int, object: Object) { /* TODO(body): (Landroid/view/ViewGroup;ILjava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/view/PagerAdapter;->setPrimaryItem(Landroid/view/View;ILjava/lang/Object;)V
    //         return-void
    */

    public fun startUpdate(container: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun startUpdate(container: android.view.ViewGroup) { /* TODO(body): (Landroid/view/ViewGroup;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/View;)V
    //         return-void
    */

    public fun unregisterDataSetObserver(observer: android.database.DataSetObserver) { /* TODO(body): (Landroid/database/DataSetObserver;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/PagerAdapter;->mObservable:Landroid/database/DataSetObservable;
    //         invoke-virtual {v0, p1}, Landroid/database/DataSetObservable;->unregisterObserver(Ljava/lang/Object;)V
    //         return-void
    */

    companion object {
    @JvmField public val POSITION_NONE: Int = 0
    @JvmField public val POSITION_UNCHANGED: Int = 0
    }
}
