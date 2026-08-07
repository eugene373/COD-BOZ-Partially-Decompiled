package android.support.v4.view

// Auto-emitted from smali source: ViewPager.java.
// 1 fields, 4 methods.

open class ViewPager_PagerObserver: android.database.DataSetObserver() {
    val this$0: android.support.v4.view.ViewPager

    private constructor(p0: android.support.v4.view.ViewPager)

    constructor(x0: android.support.v4.view.ViewPager, x1: android.support.v4.view.ViewPager.1)

    public fun onChanged() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/ViewPager$PagerObserver;->this$0:Landroid/support/v4/view/ViewPager;
    //         invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->dataSetChanged()V
    //         return-void
    */

    public fun onInvalidated() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/ViewPager$PagerObserver;->this$0:Landroid/support/v4/view/ViewPager;
    //         invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->dataSetChanged()V
    //         return-void
    */

}
