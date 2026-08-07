package android.support.v4.view

// Auto-emitted from smali source: AccessibilityDelegateCompat.java.
// 0 fields, 11 methods.

interface AccessibilityDelegateCompat_AccessibilityDelegateImpl {
    public fun dispatchPopulateAccessibilityEvent(p0: Object, p1: android.view.View, p2: android.view.accessibility.AccessibilityEvent): Boolean

    public fun getAccessibilityNodeProvider(p0: Object, p1: android.view.View): android.support.v4.view.accessibility.AccessibilityNodeProviderCompat

    public fun newAccessiblityDelegateBridge(p0: android.support.v4.view.AccessibilityDelegateCompat): Object

    public fun newAccessiblityDelegateDefaultImpl(): Object

    public fun onInitializeAccessibilityEvent(p0: Object, p1: android.view.View, p2: android.view.accessibility.AccessibilityEvent)

    public fun onInitializeAccessibilityNodeInfo(p0: Object, p1: android.view.View, p2: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat)

    public fun onPopulateAccessibilityEvent(p0: Object, p1: android.view.View, p2: android.view.accessibility.AccessibilityEvent)

    public fun onRequestSendAccessibilityEvent(p0: Object, p1: android.view.ViewGroup, p2: android.view.View, p3: android.view.accessibility.AccessibilityEvent): Boolean

    public fun performAccessibilityAction(p0: Object, p1: android.view.View, p2: Int, p3: android.os.Bundle): Boolean

    public fun sendAccessibilityEvent(p0: Object, p1: android.view.View, p2: Int)

    public fun sendAccessibilityEventUnchecked(p0: Object, p1: android.view.View, p2: android.view.accessibility.AccessibilityEvent)

}
