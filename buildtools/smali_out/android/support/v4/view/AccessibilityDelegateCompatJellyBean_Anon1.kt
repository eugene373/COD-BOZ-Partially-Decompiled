package android.support.v4.view

// Auto-emitted from smali source: AccessibilityDelegateCompatJellyBean.java.
// 1 fields, 10 methods.

class AccessibilityDelegateCompatJellyBean_Anon1: android.view.View.AccessibilityDelegate() {
    val val$bridge: android.support.v4.view.AccessibilityDelegateCompatJellyBean.AccessibilityDelegateBridgeJellyBean

    constructor(p0: android.support.v4.view.AccessibilityDelegateCompatJellyBean.AccessibilityDelegateBridgeJellyBean)

    public fun dispatchPopulateAccessibilityEvent(host: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun getAccessibilityNodeProvider(host: android.view.View): android.view.accessibility.AccessibilityNodeProvider { return TODO("body: (Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;
    //         invoke-interface {v0, p1}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;->getAccessibilityNodeProvider(Landroid/view/View;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/accessibility/AccessibilityNodeProvider;
    //         return-object v0
    */

    public fun onInitializeAccessibilityEvent(host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public fun onInitializeAccessibilityNodeInfo(host: android.view.View, info: android.view.accessibility.AccessibilityNodeInfo) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ljava/lang/Object;)V
    //         return-void
    */

    public fun onPopulateAccessibilityEvent(host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public fun onRequestSendAccessibilityEvent(host: android.view.ViewGroup, child: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;
    //         invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun performAccessibilityAction(host: android.view.View, action: Int, args: android.os.Bundle): Boolean { return TODO("body: (Landroid/view/View;ILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;
    //         invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    //         move-result v0
    //         return v0
    */

    public fun sendAccessibilityEvent(host: android.view.View, eventType: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;->sendAccessibilityEvent(Landroid/view/View;I)V
    //         return-void
    */

    public fun sendAccessibilityEventUnchecked(host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;->val$bridge:Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

}
