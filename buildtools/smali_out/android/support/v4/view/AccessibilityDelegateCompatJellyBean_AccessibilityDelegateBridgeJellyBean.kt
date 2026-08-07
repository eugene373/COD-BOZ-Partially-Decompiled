package android.support.v4.view

// Auto-emitted from smali source: AccessibilityDelegateCompatJellyBean.java.
// 0 fields, 9 methods.

interface AccessibilityDelegateCompatJellyBean_AccessibilityDelegateBridgeJellyBean {
    public fun dispatchPopulateAccessibilityEvent(p0: android.view.View, p1: android.view.accessibility.AccessibilityEvent): Boolean

    public fun getAccessibilityNodeProvider(p0: android.view.View): Object

    public fun onInitializeAccessibilityEvent(p0: android.view.View, p1: android.view.accessibility.AccessibilityEvent)

    public fun onInitializeAccessibilityNodeInfo(p0: android.view.View, p1: Object)

    public fun onPopulateAccessibilityEvent(p0: android.view.View, p1: android.view.accessibility.AccessibilityEvent)

    public fun onRequestSendAccessibilityEvent(p0: android.view.ViewGroup, p1: android.view.View, p2: android.view.accessibility.AccessibilityEvent): Boolean

    public fun performAccessibilityAction(p0: android.view.View, p1: Int, p2: android.os.Bundle): Boolean

    public fun sendAccessibilityEvent(p0: android.view.View, p1: Int)

    public fun sendAccessibilityEventUnchecked(p0: android.view.View, p1: android.view.accessibility.AccessibilityEvent)

}
