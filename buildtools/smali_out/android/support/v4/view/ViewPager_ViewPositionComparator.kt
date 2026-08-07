package android.support.v4.view

// Auto-emitted from smali source: ViewPager.java.
// 0 fields, 3 methods.

open class ViewPager_ViewPositionComparator: java.util.Comparator {
    constructor()

    public fun compare(lhs: android.view.View, rhs: android.view.View): Int { return TODO("body: (Landroid/view/View;Landroid/view/View;)I") }
    /*
    //         .locals 4
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;
    //         .local v0, "llp":Landroid/support/v4/view/ViewPager$LayoutParams;
    //         invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v1
    //         check-cast v1, Landroid/support/v4/view/ViewPager$LayoutParams;
    //         .local v1, "rlp":Landroid/support/v4/view/ViewPager$LayoutParams;
    //         iget-boolean v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
    //         iget-boolean v3, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
    //         if-eq v2, v3, :cond_1
    //         iget-boolean v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
    //         if-eqz v2, :cond_0
    //         const/4 v2, 0x1
    //         :goto_0
    //         return v2
    //         :cond_0
    //         const/4 v2, -0x1
    //         goto :goto_0
    //         :cond_1
    //         iget v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->position:I
    //         iget v3, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->position:I
    //         sub-int/2addr v2, v3
    //         goto :goto_0
    */

    public fun compare(x0: Object, x1: Object): Int { return TODO("body: (Ljava/lang/Object;Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p1, Landroid/view/View;
    //         .end local p1    # "x0":Ljava/lang/Object;
    //         check-cast p2, Landroid/view/View;
    //         .end local p2    # "x1":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/support/v4/view/ViewPager$ViewPositionComparator;->compare(Landroid/view/View;Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

}
