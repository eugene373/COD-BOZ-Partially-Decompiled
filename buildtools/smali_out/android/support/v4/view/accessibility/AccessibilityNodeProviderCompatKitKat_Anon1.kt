package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeProviderCompatKitKat.java.
// 1 fields, 5 methods.

class AccessibilityNodeProviderCompatKitKat_Anon1: android.view.accessibility.AccessibilityNodeProvider() {
    val val$bridge: android.support.v4.view.accessibility.AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge

    constructor(p0: android.support.v4.view.accessibility.AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge)

    public fun createAccessibilityNodeInfo(virtualViewId: Int): android.view.accessibility.AccessibilityNodeInfo { return TODO("body: (I)Landroid/view/accessibility/AccessibilityNodeInfo;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$1;->val$bridge:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge;
    //         invoke-interface {v0, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge;->createAccessibilityNodeInfo(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         return-object v0
    */

    public fun findAccessibilityNodeInfosByText(text: String, virtualViewId: Int): java.util.List { return TODO("body: (Ljava/lang/String;I)Ljava/util/List;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$1;->val$bridge:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge;->findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun findFocus(focus: Int): android.view.accessibility.AccessibilityNodeInfo { return TODO("body: (I)Landroid/view/accessibility/AccessibilityNodeInfo;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$1;->val$bridge:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge;
    //         invoke-interface {v0, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge;->findFocus(I)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         return-object v0
    */

    public fun performAction(virtualViewId: Int, action: Int, arguments: android.os.Bundle): Boolean { return TODO("body: (IILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$1;->val$bridge:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge;
    //         invoke-interface {v0, p1, p2, p3}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge;->performAction(IILandroid/os/Bundle;)Z
    //         move-result v0
    //         return v0
    */

}
