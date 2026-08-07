package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeInfoCompatJellyBean.java.
// 0 fields, 14 methods.

open class AccessibilityNodeInfoCompatJellyBean {
    constructor()

    companion object {
    public @JvmStatic fun addChild(info: Object, child: android.view.View, virtualDescendantId: Int) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;I)V
    //         return-void
    */

    public @JvmStatic fun findFocus(info: Object, focus: Int): Object { return TODO("body: (Ljava/lang/Object;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun focusSearch(info: Object, direction: Int): Object { return TODO("body: (Ljava/lang/Object;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->focusSearch(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getMovementGranularities(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getMovementGranularities()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isAccessibilityFocused(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isAccessibilityFocused()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isVisibleToUser(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isVisibleToUser()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun obtain(root: android.view.View, virtualDescendantId: Int): Object { return TODO("body: (Landroid/view/View;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;I)Landroid/view/accessibility/AccessibilityNodeInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun performAction(info: Object, action: Int, arguments: android.os.Bundle): Boolean { return TODO("body: (Ljava/lang/Object;ILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(ILandroid/os/Bundle;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun setAccesibilityFocused(info: Object, focused: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityFocused(Z)V
    //         return-void
    */

    public @JvmStatic fun setMovementGranularities(info: Object, granularities: Int) { /* TODO(body): (Ljava/lang/Object;I)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setMovementGranularities(I)V
    //         return-void
    */

    public @JvmStatic fun setParent(info: Object, root: android.view.View, virtualDescendantId: Int) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V
    //         return-void
    */

    public @JvmStatic fun setSource(info: Object, root: android.view.View, virtualDescendantId: Int) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;I)V
    //         return-void
    */

    public @JvmStatic fun setVisibleToUser(info: Object, visibleToUser: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V
    //         return-void
    */

    }
}
