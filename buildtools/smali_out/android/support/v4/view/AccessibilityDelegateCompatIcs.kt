package android.support.v4.view

// Auto-emitted from smali source: AccessibilityDelegateCompatIcs.java.
// 0 fields, 10 methods.

open class AccessibilityDelegateCompatIcs {
    constructor()

    companion object {
    public @JvmStatic fun dispatchPopulateAccessibilityEvent(delegate: Object, host: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/View$AccessibilityDelegate;
    //         .end local p0    # "delegate":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun newAccessibilityDelegateBridge(bridge: android.support.v4.view.AccessibilityDelegateCompatIcs.AccessibilityDelegateBridge): Object { return TODO("body: (Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$1;
    //         invoke-direct {v0, p0}, Landroid/support/v4/view/AccessibilityDelegateCompatIcs$1;-><init>(Landroid/support/v4/view/AccessibilityDelegateCompatIcs$AccessibilityDelegateBridge;)V
    //         return-object v0
    */

    public @JvmStatic fun newAccessibilityDelegateDefaultImpl(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/view/View$AccessibilityDelegate;
    //         invoke-direct {v0}, Landroid/view/View$AccessibilityDelegate;-><init>()V
    //         return-object v0
    */

    public @JvmStatic fun onInitializeAccessibilityEvent(delegate: Object, host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/View$AccessibilityDelegate;
    //         .end local p0    # "delegate":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public @JvmStatic fun onInitializeAccessibilityNodeInfo(delegate: Object, host: android.view.View, info: Object) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/View$AccessibilityDelegate;
    //         .end local p0    # "delegate":Ljava/lang/Object;
    //         check-cast p2, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p2    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    //         return-void
    */

    public @JvmStatic fun onPopulateAccessibilityEvent(delegate: Object, host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/View$AccessibilityDelegate;
    //         .end local p0    # "delegate":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public @JvmStatic fun onRequestSendAccessibilityEvent(delegate: Object, host: android.view.ViewGroup, child: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Ljava/lang/Object;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/View$AccessibilityDelegate;
    //         .end local p0    # "delegate":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun sendAccessibilityEvent(delegate: Object, host: android.view.View, eventType: Int) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/View$AccessibilityDelegate;
    //         .end local p0    # "delegate":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEvent(Landroid/view/View;I)V
    //         return-void
    */

    public @JvmStatic fun sendAccessibilityEventUnchecked(delegate: Object, host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/View$AccessibilityDelegate;
    //         .end local p0    # "delegate":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    }
}
