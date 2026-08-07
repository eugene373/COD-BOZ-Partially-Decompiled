package android.support.v4.view

// Auto-emitted from smali source: AccessibilityDelegateCompat.java.
// 0 fields, 12 methods.

open class AccessibilityDelegateCompat_AccessibilityDelegateStubImpl: android.support.v4.view.AccessibilityDelegateCompat.AccessibilityDelegateImpl {
    constructor()

    public fun dispatchPopulateAccessibilityEvent(delegate: Object, host: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAccessibilityNodeProvider(delegate: Object, host: android.view.View): android.support.v4.view.accessibility.AccessibilityNodeProviderCompat { return TODO("body: (Ljava/lang/Object;Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun newAccessiblityDelegateBridge(listener: android.support.v4.view.AccessibilityDelegateCompat): Object { return TODO("body: (Landroid/support/v4/view/AccessibilityDelegateCompat;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun newAccessiblityDelegateDefaultImpl(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun onInitializeAccessibilityEvent(delegate: Object, host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onInitializeAccessibilityNodeInfo(delegate: Object, host: android.view.View, info: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onPopulateAccessibilityEvent(delegate: Object, host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onRequestSendAccessibilityEvent(delegate: Object, host: android.view.ViewGroup, child: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Ljava/lang/Object;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun performAccessibilityAction(delegate: Object, host: android.view.View, action: Int, args: android.os.Bundle): Boolean { return TODO("body: (Ljava/lang/Object;Landroid/view/View;ILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun sendAccessibilityEvent(delegate: Object, host: android.view.View, eventType: Int) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun sendAccessibilityEventUnchecked(delegate: Object, host: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
