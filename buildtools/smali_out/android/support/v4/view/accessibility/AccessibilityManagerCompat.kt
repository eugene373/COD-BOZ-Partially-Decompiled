package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityManagerCompat.java.
// 1 fields, 8 methods.

open class AccessibilityManagerCompat {
    public constructor()

    companion object {
    private val IMPL: android.support.v4.view.accessibility.AccessibilityManagerCompat.AccessibilityManagerVersionImpl = null!!

    public @JvmStatic fun addAccessibilityStateChangeListener(manager: android.view.accessibility.AccessibilityManager, listener: android.support.v4.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat): Boolean { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;->addAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getEnabledAccessibilityServiceList(manager: android.view.accessibility.AccessibilityManager, feedbackTypeFlags: Int): java.util.List { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;I)Ljava/util/List;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;->getEnabledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;I)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getInstalledAccessibilityServiceList(manager: android.view.accessibility.AccessibilityManager): java.util.List { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;->getInstalledAccessibilityServiceList(Landroid/view/accessibility/AccessibilityManager;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun isTouchExplorationEnabled(manager: android.view.accessibility.AccessibilityManager): Boolean { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;->isTouchExplorationEnabled(Landroid/view/accessibility/AccessibilityManager;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun removeAccessibilityStateChangeListener(manager: android.view.accessibility.AccessibilityManager, listener: android.support.v4.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerCompat): Boolean { return TODO("body: (Landroid/view/accessibility/AccessibilityManager;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityManagerVersionImpl;->removeAccessibilityStateChangeListener(Landroid/view/accessibility/AccessibilityManager;Landroid/support/v4/view/accessibility/AccessibilityManagerCompat$AccessibilityStateChangeListenerCompat;)Z
    //         move-result v0
    //         return v0
    */

    }
}
