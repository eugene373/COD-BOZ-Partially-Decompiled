package android.support.v4.view

// Auto-emitted from smali source: ViewCompatICS.java.
// 0 fields, 7 methods.

open class ViewCompatICS {
    constructor()

    companion object {
    public @JvmStatic fun canScrollHorizontally(v: android.view.View, direction: Int): Boolean { return TODO("body: (Landroid/view/View;I)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Landroid/view/View;->canScrollHorizontally(I)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun canScrollVertically(v: android.view.View, direction: Int): Boolean { return TODO("body: (Landroid/view/View;I)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Landroid/view/View;->canScrollVertically(I)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun onInitializeAccessibilityEvent(v: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public @JvmStatic fun onInitializeAccessibilityNodeInfo(v: android.view.View, info: Object) { /* TODO(body): (Landroid/view/View;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p1    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    //         return-void
    */

    public @JvmStatic fun onPopulateAccessibilityEvent(v: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1}, Landroid/view/View;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public @JvmStatic fun setAccessibilityDelegate(v: android.view.View, delegate: Object) { /* TODO(body): (Landroid/view/View;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Landroid/view/View$AccessibilityDelegate;
    //         .end local p1    # "delegate":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V
    //         return-void
    */

    }
}
