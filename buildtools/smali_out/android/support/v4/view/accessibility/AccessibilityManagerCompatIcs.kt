package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityManagerCompatIcs.java.
// 0 fields, 7 methods.

open class AccessibilityManagerCompatIcs {
    constructor()

    companion object {
    public @JvmStatic fun addAccessibilityStateChangeListener(manager: android.view.accessibility.AccessibilityManager, listener: Object): Boolean { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p1, Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;
    //         .end local p1    # "listener":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityManager;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getEnabledAccessibilityServiceList(manager: android.view.accessibility.AccessibilityManager, feedbackTypeFlags: Int): java.util.List { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;I)Ljava/util/List;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getInstalledAccessibilityServiceList(manager: android.view.accessibility.AccessibilityManager): java.util.List { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityManager;->getInstalledAccessibilityServiceList()Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun isTouchExplorationEnabled(manager: android.view.accessibility.AccessibilityManager): Boolean { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun newAccessibilityStateChangeListener(bridge: android.support.v4.view.accessibility.AccessibilityManagerCompatIcs.AccessibilityStateChangeListenerBridge): Object { return TODO("body: (Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs$1;
    //         invoke-direct {v0, p0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs$1;-><init>(Landroid/support/v4/view/accessibility/AccessibilityManagerCompatIcs$AccessibilityStateChangeListenerBridge;)V
    //         return-object v0
    */

    public @JvmStatic fun removeAccessibilityStateChangeListener(manager: android.view.accessibility.AccessibilityManager, listener: Object): Boolean { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p1, Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;
    //         .end local p1    # "listener":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityManager;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;)Z
    //         move-result v0
    //         return v0
    */

    }
}
