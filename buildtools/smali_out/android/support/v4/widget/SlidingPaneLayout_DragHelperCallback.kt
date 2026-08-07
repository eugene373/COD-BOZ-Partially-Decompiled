package android.support.v4.widget

// Auto-emitted from smali source: SlidingPaneLayout.java.
// 1 fields, 11 methods.

open class SlidingPaneLayout_DragHelperCallback: android.support.v4.widget.ViewDragHelper.Callback() {
    val this$0: android.support.v4.widget.SlidingPaneLayout

    private constructor(p0: android.support.v4.widget.SlidingPaneLayout)

    constructor(x0: android.support.v4.widget.SlidingPaneLayout, x1: android.support.v4.widget.SlidingPaneLayout.1)

    public fun clampViewPositionHorizontal(child: android.view.View, left: Int, dx: Int): Int { return TODO("body: (Landroid/view/View;II)I") }
    /*
    //         .locals 7
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
    //         move-result-object v4
    //         invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v1
    //         check-cast v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    //         .local v1, "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$700(Landroid/support/v4/widget/SlidingPaneLayout;)Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I
    //         move-result v4
    //         iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v5}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
    //         move-result v5
    //         iget v6, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
    //         add-int/2addr v5, v6
    //         iget-object v6, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v6}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
    //         move-result-object v6
    //         invoke-virtual {v6}, Landroid/view/View;->getWidth()I
    //         move-result v6
    //         add-int/2addr v5, v6
    //         sub-int v3, v4, v5
    //         .local v3, "startBound":I
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I
    //         move-result v4
    //         sub-int v0, v3, v4
    //         .local v0, "endBound":I
    //         invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I
    //         move-result v4
    //         invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I
    //         move-result v2
    //         .local v2, "newLeft":I
    //         :goto_0
    //         return v2
    //         .end local v0    # "endBound":I
    //         .end local v2    # "newLeft":I
    //         .end local v3    # "startBound":I
    //         :cond_0
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
    //         move-result v4
    //         iget v5, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
    //         add-int v3, v4, v5
    //         .restart local v3    # "startBound":I
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I
    //         move-result v4
    //         add-int v0, v3, v4
    //         .restart local v0    # "endBound":I
    //         invoke-static {p2, v3}, Ljava/lang/Math;->max(II)I
    //         move-result v4
    //         invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I
    //         move-result v2
    //         .restart local v2    # "newLeft":I
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
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I
    //         move-result v0
    //         return v0
    */

    public fun onEdgeDragStarted(edgeFlags: Int, pointerId: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
    //         move-result-object v1
    //         invoke-virtual {v0, v1, p2}, Landroid/support/v4/widget/ViewDragHelper;->captureChildView(Landroid/view/View;I)V
    //         return-void
    */

    public fun onViewCaptured(capturedChild: android.view.View, activePointerId: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->setAllChildrenVisible()V
    //         return-void
    */

    public fun onViewDragStateChanged(state: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F
    //         move-result v0
    //         const/4 v1, 0x0
    //         cmpl-float v0, v0, v1
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->updateObscuredViewsVisibility(Landroid/view/View;)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->dispatchOnPanelClosed(Landroid/view/View;)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$502(Landroid/support/v4/widget/SlidingPaneLayout;Z)Z
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->dispatchOnPanelOpened(Landroid/view/View;)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         const/4 v1, 0x1
    //         invoke-static {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$502(Landroid/support/v4/widget/SlidingPaneLayout;Z)Z
    //         goto :goto_0
    */

    public fun onViewPositionChanged(changedView: android.view.View, left: Int, top: Int, dx: Int, dy: Int) { /* TODO(body): (Landroid/view/View;IIII)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v0, p2}, Landroid/support/v4/widget/SlidingPaneLayout;->access$600(Landroid/support/v4/widget/SlidingPaneLayout;I)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidate()V
    //         return-void
    */

    public fun onViewReleased(releasedChild: android.view.View, xvel: Float, yvel: Float) { /* TODO(body): (Landroid/view/View;FF)V */ }
    /*
    //         .locals 8
    //         const/high16 v7, 0x3f000000    # 0.5f
    //         const/4 v6, 0x0
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v2
    //         check-cast v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    //         .local v2, "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$700(Landroid/support/v4/widget/SlidingPaneLayout;)Z
    //         move-result v4
    //         if-eqz v4, :cond_3
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
    //         move-result v4
    //         iget v5, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
    //         add-int v3, v4, v5
    //         .local v3, "startToRight":I
    //         cmpg-float v4, p2, v6
    //         if-ltz v4, :cond_0
    //         cmpl-float v4, p2, v6
    //         if-nez v4, :cond_1
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F
    //         move-result v4
    //         cmpl-float v4, v4, v7
    //         if-lez v4, :cond_1
    //         :cond_0
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I
    //         move-result v4
    //         add-int/2addr v3, v4
    //         :cond_1
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
    //         move-result-object v4
    //         invoke-virtual {v4}, Landroid/view/View;->getWidth()I
    //         move-result v0
    //         .local v0, "childWidth":I
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I
    //         move-result v4
    //         sub-int/2addr v4, v3
    //         sub-int v1, v4, v0
    //         .end local v0    # "childWidth":I
    //         .end local v3    # "startToRight":I
    //         .local v1, "left":I
    //         :cond_2
    //         :goto_0
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
    //         move-result-object v4
    //         invoke-virtual {p1}, Landroid/view/View;->getTop()I
    //         move-result v5
    //         invoke-virtual {v4, v1, v5}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidate()V
    //         return-void
    //         .end local v1    # "left":I
    //         :cond_3
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
    //         move-result v4
    //         iget v5, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
    //         add-int v1, v4, v5
    //         .restart local v1    # "left":I
    //         cmpl-float v4, p2, v6
    //         if-gtz v4, :cond_4
    //         cmpl-float v4, p2, v6
    //         if-nez v4, :cond_2
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F
    //         move-result v4
    //         cmpl-float v4, v4, v7
    //         if-lez v4, :cond_2
    //         :cond_4
    //         iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I
    //         move-result v4
    //         add-int/2addr v1, v4
    //         goto :goto_0
    */

    public fun tryCaptureView(child: android.view.View, pointerId: Int): Boolean { return TODO("body: (Landroid/view/View;I)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$100(Landroid/support/v4/widget/SlidingPaneLayout;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    //         iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z
    //         goto :goto_0
    */

}
