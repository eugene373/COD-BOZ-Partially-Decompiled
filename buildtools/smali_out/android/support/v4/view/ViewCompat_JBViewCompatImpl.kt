package android.support.v4.view

// Auto-emitted from smali source: ViewCompat.java.
// 0 fields, 16 methods.

open class ViewCompat_JBViewCompatImpl: android.support.v4.view.ViewCompat.ICSViewCompatImpl() {
    constructor()

    public fun getAccessibilityNodeProvider(view: android.view.View): android.support.v4.view.accessibility.AccessibilityNodeProviderCompat { return TODO("body: (Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;") }
    /*
    //         .locals 2
    //         invoke-static {p1}, Landroid/support/v4/view/ViewCompatJB;->getAccessibilityNodeProvider(Landroid/view/View;)Ljava/lang/Object;
    //         move-result-object v0
    //         .local v0, "compat":Ljava/lang/Object;
    //         if-eqz v0, :cond_0
    //         new-instance v1, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
    //         invoke-direct {v1, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;-><init>(Ljava/lang/Object;)V
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun getFitsSystemWindows(view: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/ViewCompatJB;->getFitsSystemWindows(Landroid/view/View;)Z
    //         move-result v0
    //         return v0
    */

    public fun getImportantForAccessibility(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/ViewCompatJB;->getImportantForAccessibility(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public fun getMinimumHeight(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/ViewCompatJB;->getMinimumHeight(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public fun getMinimumWidth(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/ViewCompatJB;->getMinimumWidth(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public fun getParentForAccessibility(view: android.view.View): android.view.ViewParent { return TODO("body: (Landroid/view/View;)Landroid/view/ViewParent;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/ViewCompatJB;->getParentForAccessibility(Landroid/view/View;)Landroid/view/ViewParent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun hasTransientState(view: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/ViewCompatJB;->hasTransientState(Landroid/view/View;)Z
    //         move-result v0
    //         return v0
    */

    public fun performAccessibilityAction(view: android.view.View, action: Int, arguments: android.os.Bundle): Boolean { return TODO("body: (Landroid/view/View;ILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2, p3}, Landroid/support/v4/view/ViewCompatJB;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    //         move-result v0
    //         return v0
    */

    public fun postInvalidateOnAnimation(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1}, Landroid/support/v4/view/ViewCompatJB;->postInvalidateOnAnimation(Landroid/view/View;)V
    //         return-void
    */

    public fun postInvalidateOnAnimation(view: android.view.View, left: Int, top: Int, right: Int, bottom: Int) { /* TODO(body): (Landroid/view/View;IIII)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2, p3, p4, p5}, Landroid/support/v4/view/ViewCompatJB;->postInvalidateOnAnimation(Landroid/view/View;IIII)V
    //         return-void
    */

    public fun postOnAnimation(view: android.view.View, action: Runnable) { /* TODO(body): (Landroid/view/View;Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/ViewCompatJB;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V
    //         return-void
    */

    public fun postOnAnimationDelayed(view: android.view.View, action: Runnable, delayMillis: Long) { /* TODO(body): (Landroid/view/View;Ljava/lang/Runnable;J)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1, p2, p3, p4}, Landroid/support/v4/view/ViewCompatJB;->postOnAnimationDelayed(Landroid/view/View;Ljava/lang/Runnable;J)V
    //         return-void
    */

    public fun requestApplyInsets(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1}, Landroid/support/v4/view/ViewCompatJB;->requestApplyInsets(Landroid/view/View;)V
    //         return-void
    */

    public fun setHasTransientState(view: android.view.View, hasTransientState: Boolean) { /* TODO(body): (Landroid/view/View;Z)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/ViewCompatJB;->setHasTransientState(Landroid/view/View;Z)V
    //         return-void
    */

    public fun setImportantForAccessibility(view: android.view.View, mode: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x4
    //         if-ne p2, v0, :cond_0
    //         const/4 p2, 0x2
    //         :cond_0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/ViewCompatJB;->setImportantForAccessibility(Landroid/view/View;I)V
    //         return-void
    */

}
