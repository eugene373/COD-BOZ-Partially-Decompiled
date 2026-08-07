package android.support.v4.view

// Auto-emitted from smali source: AccessibilityDelegateCompat.java.
// 0 fields, 10 methods.

open class AccessibilityDelegateCompat_AccessibilityDelegateIcsImpl: android.support.v4.view.AccessibilityDelegateCompat.AccessibilityDelegateStubImpl() {
    constructor()

    public fun dispatchPopulateAccessibilityEvent(delegate: Object, host: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs;->dispatchPopulateAccessibilityEvent(Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun newAccessiblityDelegateBridge(compat: android.support.v4.view.AccessibilityDelegateCompat): Object { return TODO("body: (Landroid/support/v4/view/AccessibilityDelegateCompat;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;
    //         invoke-direct {v0, p0, p1}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl$1;-><init>(Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateIcsImpl;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
    //         invoke-static {v0}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs;->newAccessibilityDelegateBridge(Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun newAccessiblityDelegateDefaultImpl(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs;->newAccessibilityDelegateDefaultImpl()Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onInitializeAccessibilityEvent(delegate: Object, host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs;->onInitializeAccessibilityEvent(Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public fun onInitializeAccessibilityNodeInfo(delegate: Object, host: android.view.View, info: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p3}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getInfo()Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-static {p1, p2, v0}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs;->onInitializeAccessibilityNodeInfo(Ljava/lang/Object;Landroid/view/View;Ljava/lang/Object;)V
    //         return-void
    */

    public fun onPopulateAccessibilityEvent(delegate: Object, host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs;->onPopulateAccessibilityEvent(Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public fun onRequestSendAccessibilityEvent(delegate: Object, host: android.view.ViewGroup, child: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Ljava/lang/Object;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2, p3, p4}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs;->onRequestSendAccessibilityEvent(Ljava/lang/Object;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun sendAccessibilityEvent(delegate: Object, host: android.view.View, eventType: Int) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs;->sendAccessibilityEvent(Ljava/lang/Object;Landroid/view/View;I)V
    //         return-void
    */

    public fun sendAccessibilityEventUnchecked(delegate: Object, host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2, p3}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs;->sendAccessibilityEventUnchecked(Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

}
