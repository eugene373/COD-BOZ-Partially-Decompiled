package android.support.v4.view

// Auto-emitted from smali source: AccessibilityDelegateCompatJellyBean.java.
// 0 fields, 4 methods.

open class AccessibilityDelegateCompatJellyBean {
    constructor()

    companion object {
    public @JvmStatic fun getAccessibilityNodeProvider(delegate: Object, host: android.view.View): Object { return TODO("body: (Ljava/lang/Object;Landroid/view/View;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/View$AccessibilityDelegate;
    //         .end local p0    # "delegate":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/View$AccessibilityDelegate;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun newAccessibilityDelegateBridge(bridge: android.support.v4.view.AccessibilityDelegateCompatJellyBean.AccessibilityDelegateBridgeJellyBean): Object { return TODO("body: (Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;
    //         invoke-direct {v0, p0}, Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$1;-><init>(Landroid/support/v4/view/AccessibilityDelegateCompatJellyBean$AccessibilityDelegateBridgeJellyBean;)V
    //         return-object v0
    */

    public @JvmStatic fun performAccessibilityAction(delegate: Object, host: android.view.View, action: Int, args: android.os.Bundle): Boolean { return TODO("body: (Ljava/lang/Object;Landroid/view/View;ILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/View$AccessibilityDelegate;
    //         .end local p0    # "delegate":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    //         move-result v0
    //         return v0
    */

    }
}
