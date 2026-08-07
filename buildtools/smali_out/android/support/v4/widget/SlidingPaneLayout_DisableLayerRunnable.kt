package android.support.v4.widget

// Auto-emitted from smali source: SlidingPaneLayout.java.
// 2 fields, 2 methods.

open class SlidingPaneLayout_DisableLayerRunnable: Runnable {
    val mChildView: android.view.View
    val this$0: android.support.v4.widget.SlidingPaneLayout

    constructor(childView: android.support.v4.widget.SlidingPaneLayout, p1: android.view.View)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;->mChildView:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         if-ne v0, v1, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;->mChildView:Landroid/view/View;
    //         const/4 v1, 0x0
    //         const/4 v2, 0x0
    //         invoke-static {v0, v1, v2}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;->mChildView:Landroid/view/View;
    //         invoke-static {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$1000(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$1100(Landroid/support/v4/widget/SlidingPaneLayout;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    //         return-void
    */

}
