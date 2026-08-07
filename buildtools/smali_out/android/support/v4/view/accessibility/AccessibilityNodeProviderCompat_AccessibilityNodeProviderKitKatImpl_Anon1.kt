package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeProviderCompat.java.
// 2 fields, 5 methods.

open class AccessibilityNodeProviderCompat_AccessibilityNodeProviderKitKatImpl_Anon1: android.support.v4.view.accessibility.AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge {
    val this$0: android.support.v4.view.accessibility.AccessibilityNodeProviderCompat.AccessibilityNodeProviderKitKatImpl
    val val$compat: android.support.v4.view.accessibility.AccessibilityNodeProviderCompat

    constructor(p0: android.support.v4.view.accessibility.AccessibilityNodeProviderCompat.AccessibilityNodeProviderKitKatImpl, p1: android.support.v4.view.accessibility.AccessibilityNodeProviderCompat)

    public fun createAccessibilityNodeInfo(virtualViewId: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1;->val$compat:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
    //         invoke-virtual {v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->createAccessibilityNodeInfo(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v0
    //         .local v0, "compatInfo":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         if-nez v0, :cond_0
    //         const/4 v1, 0x0
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         invoke-virtual {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getInfo()Ljava/lang/Object;
    //         move-result-object v1
    //         goto :goto_0
    */

    public fun findAccessibilityNodeInfosByText(text: String, virtualViewId: Int): java.util.List { return TODO("body: (Ljava/lang/String;I)Ljava/util/List;") }
    /*
    //         .locals 6
    //         iget-object v5, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1;->val$compat:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
    //         invoke-virtual {v5, p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
    //         move-result-object v0
    //         .local v0, "compatInfos":Ljava/util/List;, "Ljava/util/List<Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;>;"
    //         new-instance v4, Ljava/util/ArrayList;
    //         invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
    //         .local v4, "infos":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Object;>;"
    //         invoke-interface {v0}, Ljava/util/List;->size()I
    //         move-result v3
    //         .local v3, "infoCount":I
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         if-ge v1, v3, :cond_0
    //         invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         .local v2, "infoCompat":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         invoke-virtual {v2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getInfo()Ljava/lang/Object;
    //         move-result-object v5
    //         invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         .end local v2    # "infoCompat":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         :cond_0
    //         return-object v4
    */

    public fun findFocus(focus: Int): Object { return TODO("body: (I)Ljava/lang/Object;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1;->val$compat:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
    //         invoke-virtual {v1, p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->findFocus(I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         move-result-object v0
    //         .local v0, "compatInfo":Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;
    //         if-nez v0, :cond_0
    //         const/4 v1, 0x0
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         invoke-virtual {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->getInfo()Ljava/lang/Object;
    //         move-result-object v1
    //         goto :goto_0
    */

    public fun performAction(virtualViewId: Int, action: Int, arguments: android.os.Bundle): Boolean { return TODO("body: (IILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1;->val$compat:Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
    //         invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->performAction(IILandroid/os/Bundle;)Z
    //         move-result v0
    //         return v0
    */

}
