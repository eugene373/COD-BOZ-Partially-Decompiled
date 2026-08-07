package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityManagerCompat.java.
// 0 fields, 7 methods.

open class AccessibilityManagerCompat_AccessibilityManagerIcsImpl: android.support.v4.view.accessibility.AccessibilityManagerCompat.AccessibilityManagerStubImpl() {
    constructor()

    public fun addAccessibilityStateChangeListener(manager: android.view.accessibility.AccessibilityManager, listener: android.support.v4.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat): Boolean { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p2, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;->mListener:Ljava/lang/Object;
    //         invoke-static {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun getEnabledAccessibilityServiceList(manager: android.view.accessibility.AccessibilityManager, feedbackTypeFlags: Int): java.util.List { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;I)Ljava/util/List;") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs;->getEnabledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;I)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getInstalledAccessibilityServiceList(manager: android.view.accessibility.AccessibilityManager): java.util.List { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs;->getInstalledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun isTouchExplorationEnabled(manager: android.view.accessibility.AccessibilityManager): Boolean { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs;->isTouchExplorationEnabled(Landroid/view/accessibility/AccessibilityManager;)Z
    //         move-result v0
    //         return v0
    */

    public fun newAccessiblityStateChangeListener(listener: android.support.v4.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat): Object { return TODO("body: (Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1;
    //         invoke-direct {v0, p0, p1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl$1;-><init>(Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerIcsImpl;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)V
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs;->newAccessibilityStateChangeListener(Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun removeAccessibilityStateChangeListener(manager: android.view.accessibility.AccessibilityManager, listener: android.support.v4.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat): Boolean { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p2, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;->mListener:Ljava/lang/Object;
    //         invoke-static {p1, v0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

}
