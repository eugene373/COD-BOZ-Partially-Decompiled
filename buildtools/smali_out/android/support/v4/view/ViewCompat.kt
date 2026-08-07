package android.support.v4.view

// Auto-emitted from smali source: ViewCompat.java.
// 24 fields, 80 methods.

open class ViewCompat {
    public constructor()

    companion object {
    @JvmField public val ACCESSIBILITY_LIVE_REGION_ASSERTIVE: Int = 0x2
    @JvmField public val ACCESSIBILITY_LIVE_REGION_NONE: Int = 0x0
    @JvmField public val ACCESSIBILITY_LIVE_REGION_POLITE: Int = 0x1
    private val FAKE_FRAME_TIME: Long = 0xaL
    val IMPL: android.support.v4.view.ViewCompat.ViewCompatImpl = null!!
    @JvmField public val IMPORTANT_FOR_ACCESSIBILITY_AUTO: Int = 0x0
    @JvmField public val IMPORTANT_FOR_ACCESSIBILITY_NO: Int = 0x2
    @JvmField public val IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS: Int = 0x4
    @JvmField public val IMPORTANT_FOR_ACCESSIBILITY_YES: Int = 0x1
    @JvmField public val LAYER_TYPE_HARDWARE: Int = 0x2
    @JvmField public val LAYER_TYPE_NONE: Int = 0x0
    @JvmField public val LAYER_TYPE_SOFTWARE: Int = 0x1
    @JvmField public val LAYOUT_DIRECTION_INHERIT: Int = 0x2
    @JvmField public val LAYOUT_DIRECTION_LOCALE: Int = 0x3
    @JvmField public val LAYOUT_DIRECTION_LTR: Int = 0x0
    @JvmField public val LAYOUT_DIRECTION_RTL: Int = 0x1
    @JvmField public val MEASURED_HEIGHT_STATE_SHIFT: Int = 0x10
    @JvmField public val MEASURED_SIZE_MASK: Int = 0xffffff
    @JvmField public val MEASURED_STATE_MASK: Int = 0
    @JvmField public val MEASURED_STATE_TOO_SMALL: Int = 0x1000000
    @JvmField public val OVER_SCROLL_ALWAYS: Int = 0x0
    @JvmField public val OVER_SCROLL_IF_CONTENT_SCROLLS: Int = 0x1
    @JvmField public val OVER_SCROLL_NEVER: Int = 0x2
    private val TAG: String = "ViewCompat"

    public @JvmStatic fun animate(view: android.view.View): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->animate(Landroid/view/View;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun canScrollHorizontally(v: android.view.View, direction: Int): Boolean { return TODO("body: (Landroid/view/View;I)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->canScrollHorizontally(Landroid/view/View;I)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun canScrollVertically(v: android.view.View, direction: Int): Boolean { return TODO("body: (Landroid/view/View;I)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->canScrollVertically(Landroid/view/View;I)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun dispatchFinishTemporaryDetach(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->dispatchFinishTemporaryDetach(Landroid/view/View;)V
    //         return-void
    */

    public @JvmStatic fun dispatchStartTemporaryDetach(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->dispatchStartTemporaryDetach(Landroid/view/View;)V
    //         return-void
    */

    public @JvmStatic fun getAccessibilityLiveRegion(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getAccessibilityLiveRegion(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getAccessibilityNodeProvider(view: android.view.View): android.support.v4.view.accessibility.AccessibilityNodeProviderCompat { return TODO("body: (Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getAlpha(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getAlpha(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getElevation(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getElevation(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getFitsSystemWindows(v: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getFitsSystemWindows(Landroid/view/View;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getImportantForAccessibility(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getImportantForAccessibility(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getLabelFor(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getLabelFor(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getLayerType(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getLayerType(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getLayoutDirection(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getLayoutDirection(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getMeasuredHeightAndState(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getMeasuredHeightAndState(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getMeasuredState(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getMeasuredState(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getMeasuredWidthAndState(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getMeasuredWidthAndState(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getMinimumHeight(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getMinimumHeight(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getMinimumWidth(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getMinimumWidth(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getOverScrollMode(v: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getOverScrollMode(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getPaddingEnd(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getPaddingEnd(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getPaddingStart(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getPaddingStart(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getParentForAccessibility(view: android.view.View): android.view.ViewParent { return TODO("body: (Landroid/view/View;)Landroid/view/ViewParent;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getParentForAccessibility(Landroid/view/View;)Landroid/view/ViewParent;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getPivotX(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getPivotX(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getPivotY(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getPivotY(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getRotation(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getRotation(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getRotationX(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getRotationX(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getRotationY(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getRotationY(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getScaleX(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getScaleX(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getScaleY(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getScaleY(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getTransitionName(view: android.view.View): String { return TODO("body: (Landroid/view/View;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getTransitionName(Landroid/view/View;)Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getTranslationX(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getTranslationX(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getTranslationY(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getTranslationY(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getTranslationZ(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getTranslationZ(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getWindowSystemUiVisibility(view: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getWindowSystemUiVisibility(Landroid/view/View;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getX(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getX(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getY(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->getY(Landroid/view/View;)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun hasAccessibilityDelegate(v: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->hasAccessibilityDelegate(Landroid/view/View;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun hasTransientState(view: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->hasTransientState(Landroid/view/View;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isOpaque(view: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->isOpaque(Landroid/view/View;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun jumpDrawablesToCurrentState(v: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->jumpDrawablesToCurrentState(Landroid/view/View;)V
    //         return-void
    */

    public @JvmStatic fun onInitializeAccessibilityEvent(v: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public @JvmStatic fun onInitializeAccessibilityNodeInfo(v: android.view.View, info: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;)V
    //         return-void
    */

    public @JvmStatic fun onPopulateAccessibilityEvent(v: android.view.View, event: android.view.accessibility.AccessibilityEvent) { /* TODO(body): (Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    //         return-void
    */

    public @JvmStatic fun performAccessibilityAction(view: android.view.View, action: Int, arguments: android.os.Bundle): Boolean { return TODO("body: (Landroid/view/View;ILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun postInvalidateOnAnimation(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->postInvalidateOnAnimation(Landroid/view/View;)V
    //         return-void
    */

    public @JvmStatic fun postInvalidateOnAnimation(view: android.view.View, left: Int, top: Int, right: Int, bottom: Int) { /* TODO(body): (Landroid/view/View;IIII)V */ }
    /*
    //         .locals 6
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         move-object v1, p0
    //         move v2, p1
    //         move v3, p2
    //         move v4, p3
    //         move v5, p4
    //         invoke-interface/range {v0 .. v5}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->postInvalidateOnAnimation(Landroid/view/View;IIII)V
    //         return-void
    */

    public @JvmStatic fun postOnAnimation(view: android.view.View, action: Runnable) { /* TODO(body): (Landroid/view/View;Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V
    //         return-void
    */

    public @JvmStatic fun postOnAnimationDelayed(view: android.view.View, action: Runnable, delayMillis: Long) { /* TODO(body): (Landroid/view/View;Ljava/lang/Runnable;J)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1, p2, p3}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->postOnAnimationDelayed(Landroid/view/View;Ljava/lang/Runnable;J)V
    //         return-void
    */

    public @JvmStatic fun requestApplyInsets(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->requestApplyInsets(Landroid/view/View;)V
    //         return-void
    */

    public @JvmStatic fun resolveSizeAndState(size: Int, measureSpec: Int, childMeasuredState: Int): Int { return TODO("body: (III)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->resolveSizeAndState(III)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun setAccessibilityDelegate(v: android.view.View, delegate: android.support.v4.view.AccessibilityDelegateCompat) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
    //         return-void
    */

    public @JvmStatic fun setAccessibilityLiveRegion(view: android.view.View, mode: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setAccessibilityLiveRegion(Landroid/view/View;I)V
    //         return-void
    */

    public @JvmStatic fun setAlpha(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setAlpha(Landroid/view/View;F)V
    //         return-void
    */

    public @JvmStatic fun setChildrenDrawingOrderEnabled(viewGroup: android.view.ViewGroup, enabled: Boolean) { /* TODO(body): (Landroid/view/ViewGroup;Z)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setChildrenDrawingOrderEnabled(Landroid/view/ViewGroup;Z)V
    //         return-void
    */

    public @JvmStatic fun setElevation(view: android.view.View, elevation: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setElevation(Landroid/view/View;F)V
    //         return-void
    */

    public @JvmStatic fun setHasTransientState(view: android.view.View, hasTransientState: Boolean) { /* TODO(body): (Landroid/view/View;Z)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setHasTransientState(Landroid/view/View;Z)V
    //         return-void
    */

    public @JvmStatic fun setImportantForAccessibility(view: android.view.View, mode: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setImportantForAccessibility(Landroid/view/View;I)V
    //         return-void
    */

    public @JvmStatic fun setLabelFor(view: android.view.View, labeledId: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setLabelFor(Landroid/view/View;I)V
    //         return-void
    */

    public @JvmStatic fun setLayerPaint(view: android.view.View, paint: android.graphics.Paint) { /* TODO(body): (Landroid/view/View;Landroid/graphics/Paint;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setLayerPaint(Landroid/view/View;Landroid/graphics/Paint;)V
    //         return-void
    */

    public @JvmStatic fun setLayerType(view: android.view.View, layerType: Int, paint: android.graphics.Paint) { /* TODO(body): (Landroid/view/View;ILandroid/graphics/Paint;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
    //         return-void
    */

    public @JvmStatic fun setLayoutDirection(view: android.view.View, layoutDirection: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setLayoutDirection(Landroid/view/View;I)V
    //         return-void
    */

    public @JvmStatic fun setOnApplyWindowInsetsListener(v: android.view.View, listener: android.support.v4.view.OnApplyWindowInsetsListener) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/view/OnApplyWindowInsetsListener;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setOnApplyWindowInsetsListener(Landroid/view/View;Landroid/support/v4/view/OnApplyWindowInsetsListener;)V
    //         return-void
    */

    public @JvmStatic fun setOverScrollMode(v: android.view.View, overScrollMode: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setOverScrollMode(Landroid/view/View;I)V
    //         return-void
    */

    public @JvmStatic fun setPaddingRelative(view: android.view.View, start: Int, top: Int, end: Int, bottom: Int) { /* TODO(body): (Landroid/view/View;IIII)V */ }
    /*
    //         .locals 6
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         move-object v1, p0
    //         move v2, p1
    //         move v3, p2
    //         move v4, p3
    //         move v5, p4
    //         invoke-interface/range {v0 .. v5}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setPaddingRelative(Landroid/view/View;IIII)V
    //         return-void
    */

    public @JvmStatic fun setPivotX(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setPivotX(Landroid/view/View;F)V
    //         return-void
    */

    public @JvmStatic fun setPivotY(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setPivotX(Landroid/view/View;F)V
    //         return-void
    */

    public @JvmStatic fun setRotation(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setRotation(Landroid/view/View;F)V
    //         return-void
    */

    public @JvmStatic fun setRotationX(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setRotationX(Landroid/view/View;F)V
    //         return-void
    */

    public @JvmStatic fun setRotationY(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setRotationY(Landroid/view/View;F)V
    //         return-void
    */

    public @JvmStatic fun setScaleX(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setScaleX(Landroid/view/View;F)V
    //         return-void
    */

    public @JvmStatic fun setScaleY(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setScaleY(Landroid/view/View;F)V
    //         return-void
    */

    public @JvmStatic fun setTransitionName(view: android.view.View, transitionName: String) { /* TODO(body): (Landroid/view/View;Ljava/lang/String;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setTransitionName(Landroid/view/View;Ljava/lang/String;)V
    //         return-void
    */

    public @JvmStatic fun setTranslationX(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setTranslationX(Landroid/view/View;F)V
    //         return-void
    */

    public @JvmStatic fun setTranslationY(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setTranslationY(Landroid/view/View;F)V
    //         return-void
    */

    public @JvmStatic fun setTranslationZ(view: android.view.View, translationZ: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setTranslationZ(Landroid/view/View;F)V
    //         return-void
    */

    public @JvmStatic fun setX(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setX(Landroid/view/View;F)V
    //         return-void
    */

    public @JvmStatic fun setY(view: android.view.View, value: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/ViewCompat;->IMPL:Landroid/support/v4/view/ViewCompat$ViewCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewCompat$ViewCompatImpl;->setY(Landroid/view/View;F)V
    //         return-void
    */

    }
}
