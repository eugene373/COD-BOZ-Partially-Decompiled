package android.support.v4.view

// Auto-emitted from smali source: AccessibilityDelegateCompatIcs.java.
// 1 fields, 8 methods.

class AccessibilityDelegateCompatIcs_Anon1: android.view.View.AccessibilityDelegate() {
    val val$bridge: android.support.v4.view.AccessibilityDelegateCompatIcs.AccessibilityDelegateBridge

    constructor(p0: android.support.v4.view.AccessibilityDelegateCompatIcs.AccessibilityDelegateBridge)

    public fun dispatchPopulateAccessibilityEvent(host: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun onInitializeAccessibilityEvent(host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public fun onInitializeAccessibilityNodeInfo(host: android.view.View, info: android.view.accessibility.AccessibilityNodeInfo) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ljava/lang/Object;)V
    //         return-void
    */

    public fun onPopulateAccessibilityEvent(host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public fun onRequestSendAccessibilityEvent(host: android.view.ViewGroup, child: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;
    //         invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun sendAccessibilityEvent(host: android.view.View, eventType: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;->sendAccessibilityEvent(Landroid/view/View;I)V
    //         return-void
    */

    public fun sendAccessibilityEventUnchecked(host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

}
