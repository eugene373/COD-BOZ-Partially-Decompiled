package android.support.v4.widget

// Auto-emitted from smali source: SlidingPaneLayout.java.
// 2 fields, 6 methods.

open class SlidingPaneLayout_AccessibilityDelegate: android.support.v4.view.AccessibilityDelegateCompat() {
    private val mTmpRect: android.graphics.Rect
    val this$0: android.support.v4.widget.SlidingPaneLayout

    constructor(p0: android.support.v4.widget.SlidingPaneLayout)

    private fun copyNodeInfoNoChildren(dest: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat, src: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat) { /* TODO(body): (Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->mTmpRect:Landroid/graphics/Rect;
    //         .local v0, "rect":Landroid/graphics/Rect;
    //         invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getBoundsInParent(Landroid/graphics/Rect;)V
    //         invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInParent(Landroid/graphics/Rect;)V
    //         invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getBoundsInScreen(Landroid/graphics/Rect;)V
    //         invoke-virtual {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setBoundsInScreen(Landroid/graphics/Rect;)V
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isVisibleToUser()Z
    //         move-result v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setVisibleToUser(Z)V
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getPackageName()Ljava/lang/CharSequence;
    //         move-result-object v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setPackageName(Ljava/lang/CharSequence;)V
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getClassName()Ljava/lang/CharSequence;
    //         move-result-object v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getContentDescription()Ljava/lang/CharSequence;
    //         move-result-object v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setContentDescription(Ljava/lang/CharSequence;)V
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isEnabled()Z
    //         move-result v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setEnabled(Z)V
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isClickable()Z
    //         move-result v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClickable(Z)V
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isFocusable()Z
    //         move-result v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setFocusable(Z)V
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isFocused()Z
    //         move-result v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setFocused(Z)V
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isAccessibilityFocused()Z
    //         move-result v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setAccessibilityFocused(Z)V
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isSelected()Z
    //         move-result v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setSelected(Z)V
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->isLongClickable()Z
    //         move-result v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setLongClickable(Z)V
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getActions()I
    //         move-result v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addAction(I)V
    //         invoke-virtual {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getMovementGranularities()I
    //         move-result v1
    //         invoke-virtual {p1, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setMovementGranularities(I)V
    //         return-void
    */

    public fun filter(child: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->isDimmed(Landroid/view/View;)Z
    //         move-result v0
    //         return v0
    */

    public fun onInitializeAccessibilityEvent(host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         const-class v0, Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V
    //         return-void
    */

    public fun onInitializeAccessibilityNodeInfo(host: android.view.View, info: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V */ }
    /*
    //         .locals 6
    //         invoke-static {p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->obtain(Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v4
    //         .local v4, "superNode":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         invoke-super {p0, p1, v4}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    //         invoke-direct {p0, p2, v4}, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->copyNodeInfoNoChildren(Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    //         invoke-virtual {v4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->recycle()V
    //         const-class v5, Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p2, v5}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setClassName(Ljava/lang/CharSequence;)V
    //         invoke-virtual {p2, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setSource(Landroid/view/View;)V
    //         invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getParentForAccessibility(Landroid/view/View;)Landroid/view/ViewParent;
    //         move-result-object v3
    //         .local v3, "parent":Landroid/view/ViewParent;
    //         instance-of v5, v3, Landroid/view/View;
    //         if-eqz v5, :cond_0
    //         check-cast v3, Landroid/view/View;
    //         .end local v3    # "parent":Landroid/view/ViewParent;
    //         invoke-virtual {p2, v3}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->setParent(Landroid/view/View;)V
    //         :cond_0
    //         iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v5}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
    //         move-result v1
    //         .local v1, "childCount":I
    //         const/4 v2, 0x0
    //         .local v2, "i":I
    //         :goto_0
    //         if-ge v2, v1, :cond_2
    //         iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
    //         invoke-virtual {v5, v2}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "child":Landroid/view/View;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->filter(Landroid/view/View;)Z
    //         move-result v5
    //         if-nez v5, :cond_1
    //         invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
    //         move-result v5
    //         if-nez v5, :cond_1
    //         const/4 v5, 0x1
    //         invoke-static {v0, v5}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
    //         invoke-virtual {p2, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->addChild(Landroid/view/View;)V
    //         :cond_1
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_0
    //         .end local v0    # "child":Landroid/view/View;
    //         :cond_2
    //         return-void
    */

    public fun onRequestSendAccessibilityEvent(host: android.view.ViewGroup, child: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p2}, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;->filter(Landroid/view/View;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    //         move-result v0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
