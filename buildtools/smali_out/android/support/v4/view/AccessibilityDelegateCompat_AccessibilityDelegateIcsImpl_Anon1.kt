package android.support.v4.view

// Auto-emitted from smali source: AccessibilityDelegateCompat.java.
// 2 fields, 8 methods.

open class AccessibilityDelegateCompat_AccessibilityDelegateIcsImpl_Anon1: android.support.v4.view.AccessibilityDelegateCompatIcs.AccessibilityDelegateBridge {
    val this$0: android.support.v4.view.AccessibilityDelegateCompat.AccessibilityDelegateIcsImpl
    val val$compat: android.support.v4.view.AccessibilityDelegateCompat

    constructor(p0: android.support.v4.view.AccessibilityDelegateCompat.AccessibilityDelegateIcsImpl, p1: android.support.v4.view.AccessibilityDelegateCompat)

    public fun dispatchPopulateAccessibilityEvent(host: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun onInitializeAccessibilityEvent(host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public fun onInitializeAccessibilityNodeInfo(host: android.view.View, info: Object) { /* TODO(body): (Landroid/view/View;Ljava/lang/Object;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
    //         new-instance v1, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         invoke-direct {v1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;-><init>(Ljava/lang/Object;)V
    //         invoke-virtual {v0, p1, v1}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    //         return-void
    */

    public fun onPopulateAccessibilityEvent(host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public fun onRequestSendAccessibilityEvent(host: android.view.ViewGroup, child: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
    //         invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompat;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun sendAccessibilityEvent(host: android.view.View, eventType: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->sendAccessibilityEvent(Landroid/view/View;I)V
    //         return-void
    */

    public fun sendAccessibilityEventUnchecked(host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;->val$compat:Landroid/support/v4/view/AccessibilityDelegateCompat;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompat;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

}
