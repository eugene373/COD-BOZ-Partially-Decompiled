package android.support.v4.view

// Auto-emitted from smali source: ViewParentCompat.java.
// 0 fields, 2 methods.

open class ViewParentCompat_ViewParentCompatStubImpl: android.support.v4.view.ViewParentCompat.ViewParentCompatImpl {
    constructor()

    public fun requestSendAccessibilityEvent(parent: android.view.ViewParent, child: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Landroid/view/ViewParent;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 3
    //         if-nez p2, :cond_0
    //         const/4 v1, 0x0
    //         :goto_0
    //         return v1
    //         :cond_0
    //         invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         const-string v2, "accessibility"
    //         invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/accessibility/AccessibilityManager;
    //         .local v0, "manager":Landroid/view/accessibility/AccessibilityManager;
    //         invoke-virtual {v0, p3}, Landroid/view/accessibility/AccessibilityManager;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    //         const/4 v1, 0x1
    //         goto :goto_0
    */

}
