package android.support.v4.widget

// Auto-emitted from smali source: DrawerLayout.java.
// 4 fields, 17 methods.

open class DrawerLayout_ViewDragCallback: android.support.v4.widget.ViewDragHelper.Callback() {
    private val mAbsGravity: Int
    private var mDragger: android.support.v4.widget.ViewDragHelper
    private val mPeekRunnable: Runnable
    val this$0: android.support.v4.widget.DrawerLayout

    public constructor(gravity: android.support.v4.widget.DrawerLayout, p1: Int)

    private fun closeOtherDrawer() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v0, 0x3
    //         iget v2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I
    //         if-ne v2, v0, :cond_0
    //         const/4 v0, 0x5
    //         .local v0, "otherGrav":I
    //         :cond_0
    //         iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v2, v0}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
    //         move-result-object v1
    //         .local v1, "toClose":Landroid/view/View;
    //         if-eqz v1, :cond_1
    //         iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v2, v1}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(Landroid/view/View;)V
    //         :cond_1
    //         return-void
    */

    private fun peekDrawer() { /* TODO(body): ()V */ }
    /*
    //         .locals 9
    //         const/4 v8, 0x3
    //         const/4 v6, 0x1
    //         const/4 v5, 0x0
    //         iget-object v7, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v7}, Landroid/support/v4/widget/ViewDragHelper;->getEdgeSize()I
    //         move-result v3
    //         .local v3, "peekDistance":I
    //         iget v7, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I
    //         if-ne v7, v8, :cond_4
    //         move v1, v6
    //         .local v1, "leftEdge":Z
    //         :goto_0
    //         if-eqz v1, :cond_5
    //         iget-object v7, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v7, v8}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
    //         move-result-object v4
    //         .local v4, "toCapture":Landroid/view/View;
    //         if-eqz v4, :cond_0
    //         invoke-virtual {v4}, Landroid/view/View;->getWidth()I
    //         move-result v5
    //         neg-int v5, v5
    //         :cond_0
    //         add-int v0, v5, v3
    //         .local v0, "childLeft":I
    //         :goto_1
    //         if-eqz v4, :cond_3
    //         if-eqz v1, :cond_1
    //         invoke-virtual {v4}, Landroid/view/View;->getLeft()I
    //         move-result v5
    //         if-lt v5, v0, :cond_2
    //         :cond_1
    //         if-nez v1, :cond_3
    //         invoke-virtual {v4}, Landroid/view/View;->getLeft()I
    //         move-result v5
    //         if-le v5, v0, :cond_3
    //         :cond_2
    //         iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v5, v4}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
    //         move-result v5
    //         if-nez v5, :cond_3
    //         invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v2
    //         check-cast v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .local v2, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v4}, Landroid/view/View;->getTop()I
    //         move-result v7
    //         invoke-virtual {v5, v4, v0, v7}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
    //         iput-boolean v6, v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
    //         iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v5}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
    //         invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->closeOtherDrawer()V
    //         iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v5}, Landroid/support/v4/widget/DrawerLayout;->cancelChildViewTouch()V
    //         .end local v2    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         :cond_3
    //         return-void
    //         .end local v0    # "childLeft":I
    //         .end local v1    # "leftEdge":Z
    //         .end local v4    # "toCapture":Landroid/view/View;
    //         :cond_4
    //         move v1, v5
    //         goto :goto_0
    //         .restart local v1    # "leftEdge":Z
    //         :cond_5
    //         iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         const/4 v7, 0x5
    //         invoke-virtual {v5, v7}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
    //         move-result-object v4
    //         .restart local v4    # "toCapture":Landroid/view/View;
    //         iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v5}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
    //         move-result v5
    //         sub-int v0, v5, v3
    //         .restart local v0    # "childLeft":I
    //         goto :goto_1
    */

    public fun clampViewPositionHorizontal(child: android.view.View, left: Int, dx: Int): Int { return TODO("body: (Landroid/view/View;II)I") }
    /*
    //         .locals 3
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         const/4 v2, 0x3
    //         invoke-virtual {v1, p1, v2}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p1}, Landroid/view/View;->getWidth()I
    //         move-result v1
    //         neg-int v1, v1
    //         const/4 v2, 0x0
    //         invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I
    //         move-result v2
    //         invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I
    //         move-result v1
    //         :goto_0
    //         return v1
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v1}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
    //         move-result v0
    //         .local v0, "width":I
    //         invoke-virtual {p1}, Landroid/view/View;->getWidth()I
    //         move-result v1
    //         sub-int v1, v0, v1
    //         invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I
    //         move-result v2
    //         invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I
    //         move-result v1
    //         goto :goto_0
    */

    public fun clampViewPositionVertical(child: android.view.View, top: Int, dy: Int): Int { return TODO("body: (Landroid/view/View;II)I") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/view/View;->getTop()I
    //         move-result v0
    //         return v0
    */

    public fun getViewHorizontalDragRange(child: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1}, Landroid/view/View;->getWidth()I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun onEdgeDragStarted(edgeFlags: Int, pointerId: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 3
    //         and-int/lit8 v1, p1, 0x1
    //         const/4 v2, 0x1
    //         if-ne v1, v2, :cond_1
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         const/4 v2, 0x3
    //         invoke-virtual {v1, v2}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "toCapture":Landroid/view/View;
    //         :goto_0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v1, v0}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
    //         move-result v1
    //         if-nez v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v1, v0, p2}, Landroid/support/v4/widget/ViewDragHelper;->captureChildView(Landroid/view/View;I)V
    //         :cond_0
    //         return-void
    //         .end local v0    # "toCapture":Landroid/view/View;
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         const/4 v2, 0x5
    //         invoke-virtual {v1, v2}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
    //         move-result-object v0
    //         .restart local v0    # "toCapture":Landroid/view/View;
    //         goto :goto_0
    */

    public fun onEdgeLock(edgeFlags: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun onEdgeTouched(edgeFlags: Int, pointerId: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mPeekRunnable:Ljava/lang/Runnable;
    //         const-wide/16 v2, 0xa0
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/widget/DrawerLayout;->postDelayed(Ljava/lang/Runnable;J)Z
    //         return-void
    */

    public fun onViewCaptured(capturedChild: android.view.View, activePointerId: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .local v0, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         const/4 v1, 0x0
    //         iput-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
    //         invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->closeOtherDrawer()V
    //         return-void
    */

    public fun onViewDragStateChanged(state: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         iget v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I
    //         iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v2}, Landroid/support/v4/widget/ViewDragHelper;->getCapturedView()Landroid/view/View;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, p1, v2}, Landroid/support/v4/widget/DrawerLayout;->updateDrawerState(IILandroid/view/View;)V
    //         return-void
    */

    public fun onViewPositionChanged(changedView: android.view.View, left: Int, top: Int, dx: Int, dy: Int) { /* TODO(body): (Landroid/view/View;IIII)V */ }
    /*
    //         .locals 5
    //         invoke-virtual {p1}, Landroid/view/View;->getWidth()I
    //         move-result v0
    //         .local v0, "childWidth":I
    //         iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         const/4 v4, 0x3
    //         invoke-virtual {v3, p1, v4}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         add-int v3, v0, p2
    //         int-to-float v3, v3
    //         int-to-float v4, v0
    //         div-float v1, v3, v4
    //         .local v1, "offset":F
    //         :goto_0
    //         iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v3, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->setDrawerViewOffset(Landroid/view/View;F)V
    //         const/4 v3, 0x0
    //         cmpl-float v3, v1, v3
    //         if-nez v3, :cond_1
    //         const/4 v3, 0x4
    //         :goto_1
    //         invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V
    //         iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v3}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
    //         return-void
    //         .end local v1    # "offset":F
    //         :cond_0
    //         iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v3}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
    //         move-result v2
    //         .local v2, "width":I
    //         sub-int v3, v2, p2
    //         int-to-float v3, v3
    //         int-to-float v4, v0
    //         div-float v1, v3, v4
    //         .restart local v1    # "offset":F
    //         goto :goto_0
    //         .end local v2    # "width":I
    //         :cond_1
    //         const/4 v3, 0x0
    //         goto :goto_1
    */

    public fun onViewReleased(releasedChild: android.view.View, xvel: Float, yvel: Float) { /* TODO(body): (Landroid/view/View;FF)V */ }
    /*
    //         .locals 8
    //         const/high16 v7, 0x3f000000    # 0.5f
    //         const/4 v6, 0x0
    //         iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v4, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewOffset(Landroid/view/View;)F
    //         move-result v2
    //         .local v2, "offset":F
    //         invoke-virtual {p1}, Landroid/view/View;->getWidth()I
    //         move-result v0
    //         .local v0, "childWidth":I
    //         iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         const/4 v5, 0x3
    //         invoke-virtual {v4, p1, v5}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
    //         move-result v4
    //         if-eqz v4, :cond_2
    //         cmpl-float v4, p2, v6
    //         if-gtz v4, :cond_0
    //         cmpl-float v4, p2, v6
    //         if-nez v4, :cond_1
    //         cmpl-float v4, v2, v7
    //         if-lez v4, :cond_1
    //         :cond_0
    //         const/4 v1, 0x0
    //         .local v1, "left":I
    //         :goto_0
    //         iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {p1}, Landroid/view/View;->getTop()I
    //         move-result v5
    //         invoke-virtual {v4, v1, v5}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z
    //         iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v4}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
    //         return-void
    //         .end local v1    # "left":I
    //         :cond_1
    //         neg-int v1, v0
    //         goto :goto_0
    //         :cond_2
    //         iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v4}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
    //         move-result v3
    //         .local v3, "width":I
    //         cmpg-float v4, p2, v6
    //         if-ltz v4, :cond_3
    //         cmpl-float v4, p2, v6
    //         if-nez v4, :cond_4
    //         cmpl-float v4, v2, v7
    //         if-lez v4, :cond_4
    //         :cond_3
    //         sub-int v1, v3, v0
    //         .restart local v1    # "left":I
    //         :goto_1
    //         goto :goto_0
    //         .end local v1    # "left":I
    //         :cond_4
    //         move v1, v3
    //         goto :goto_1
    */

    public fun removeCallbacks() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mPeekRunnable:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->removeCallbacks(Ljava/lang/Runnable;)Z
    //         return-void
    */

    public fun setDragger(dragger: android.support.v4.widget.ViewDragHelper) { /* TODO(body): (Landroid/support/v4/widget/ViewDragHelper;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         return-void
    */

    public fun tryCaptureView(child: android.view.View, pointerId: Int): Boolean { return TODO("body: (Landroid/view/View;I)Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         iget v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I
    //         invoke-virtual {v0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
