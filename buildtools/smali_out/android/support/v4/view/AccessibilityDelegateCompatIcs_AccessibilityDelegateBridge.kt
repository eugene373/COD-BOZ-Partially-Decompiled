package android.support.v4.view

// Auto-emitted from smali source: AccessibilityDelegateCompatIcs.java.
// 0 fields, 7 methods.

interface AccessibilityDelegateCompatIcs_AccessibilityDelegateBridge {
    public fun dispatchPopulateAccessibilityEvent(p0: android.view.View, p1: android.view.accessibility.AccessibilityEvent): Boolean

    public fun onInitializeAccessibilityEvent(p0: android.view.View, p1: android.view.accessibility.AccessibilityEvent)

    public fun onInitializeAccessibilityNodeInfo(p0: android.view.View, p1: Object)

    public fun onPopulateAccessibilityEvent(p0: android.view.View, p1: android.view.accessibility.AccessibilityEvent)

    public fun onRequestSendAccessibilityEvent(p0: android.view.ViewGroup, p1: android.view.View, p2: android.view.accessibility.AccessibilityEvent): Boolean

    public fun sendAccessibilityEvent(p0: android.view.View, p1: Int)

    public fun sendAccessibilityEventUnchecked(p0: android.view.View, p1: android.view.accessibility.AccessibilityEvent)

}
