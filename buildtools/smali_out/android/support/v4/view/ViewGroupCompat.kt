package android.support.v4.view

// Auto-emitted from smali source: ViewGroupCompat.java.
// 3 fields, 8 methods.

open class ViewGroupCompat {
    private constructor()

    companion object {
    val IMPL: android.support.v4.view.ViewGroupCompat.ViewGroupCompatImpl = null!!
    @JvmField public val LAYOUT_MODE_CLIP_BOUNDS: Int = 0x0
    @JvmField public val LAYOUT_MODE_OPTICAL_BOUNDS: Int = 0x1

    public @JvmStatic fun getLayoutMode(group: android.view.ViewGroup): Int { return TODO("body: (Landroid/view/ViewGroup;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;->getLayoutMode(Landroid/view/ViewGroup;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isTransitionGroup(group: android.view.ViewGroup): Boolean { return TODO("body: (Landroid/view/ViewGroup;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;->isTransitionGroup(Landroid/view/ViewGroup;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun onRequestSendAccessibilityEvent(group: android.view.ViewGroup, child: android.view.View, event: android.view.accessibility.AccessibilityEvent): Boolean { return TODO("body: (Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
    //         invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun setLayoutMode(group: android.view.ViewGroup, mode: Int) { /* TODO(body): (Landroid/view/ViewGroup;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;->setLayoutMode(Landroid/view/ViewGroup;I)V
    //         return-void
    */

    public @JvmStatic fun setMotionEventSplittingEnabled(group: android.view.ViewGroup, split: Boolean) { /* TODO(body): (Landroid/view/ViewGroup;Z)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;->setMotionEventSplittingEnabled(Landroid/view/ViewGroup;Z)V
    //         return-void
    */

    public @JvmStatic fun setTransitionGroup(group: android.view.ViewGroup, isTransitionGroup: Boolean) { /* TODO(body): (Landroid/view/ViewGroup;Z)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;->setTransitionGroup(Landroid/view/ViewGroup;Z)V
    //         return-void
    */

    }
}
