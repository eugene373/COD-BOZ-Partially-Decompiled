package android.support.v4.view

// Auto-emitted from smali source: AccessibilityDelegateCompat.java.
// 0 fields, 4 methods.

open class AccessibilityDelegateCompat_AccessibilityDelegateJellyBeanImpl: android.support.v4.view.AccessibilityDelegateCompat.AccessibilityDelegateIcsImpl() {
    constructor()

    public fun getAccessibilityNodeProvider(delegate: Object, host: android.view.View): android.support.v4.view.accessibility.AccessibilityNodeProviderCompat { return TODO("body: (Ljava/lang/Object;Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;") }
    /*
    //         .locals 2
    //         invoke-static {p1, p2}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean;->getAccessibilityNodeProvider(Ljava/lang/Object;Landroid/view/View;)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "provider":Ljava/lang/Object;
    //         if-eqz v0, :cond_0
    //         new-instance v1, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
    //         invoke-direct {v1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;-><init>(Ljava/lang/Object;)V
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun newAccessiblityDelegateBridge(compat: android.support.v4.view.AccessibilityDelegateCompat): Object { return TODO("body: (Landroid/support/v4/view/AccessibilityDelegateCompat;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;
    //         invoke-direct {v0, p0, p1}, Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl$1;-><init>(Landroid/support/v4/view/AccessibilityDelegateCompat$AccessibilityDelegateJellyBeanImpl;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
    //         invoke-static {v0}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean;->newAccessibilityDelegateBridge(Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun performAccessibilityAction(delegate: Object, host: android.view.View, action: Int, args: android.os.Bundle): Boolean { return TODO("body: (Ljava/lang/Object;Landroid/view/View;ILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2, p3, p4}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean;->performAccessibilityAction(Ljava/lang/Object;Landroid/view/View;ILandroid/os/Bundle;)Z
    //         move-result v0
    //         return v0
    */

}
