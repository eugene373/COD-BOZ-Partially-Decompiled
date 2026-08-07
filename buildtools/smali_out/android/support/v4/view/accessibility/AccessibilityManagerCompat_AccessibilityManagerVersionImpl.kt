package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityManagerCompat.java.
// 0 fields, 6 methods.

interface AccessibilityManagerCompat_AccessibilityManagerVersionImpl {
    public fun addAccessibilityStateChangeListener(p0: android.view.accessibility.AccessibilityManager, p1: android.support.v4.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat): Boolean

    public fun getEnabledAccessibilityServiceList(p0: android.view.accessibility.AccessibilityManager, p1: Int): java.util.List

    public fun getInstalledAccessibilityServiceList(p0: android.view.accessibility.AccessibilityManager): java.util.List

    public fun isTouchExplorationEnabled(p0: android.view.accessibility.AccessibilityManager): Boolean

    public fun newAccessiblityStateChangeListener(p0: android.support.v4.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat): Object

    public fun removeAccessibilityStateChangeListener(p0: android.view.accessibility.AccessibilityManager, p1: android.support.v4.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat): Boolean

}
