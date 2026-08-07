package android.support.v4.view

// Auto-emitted from smali source: ViewCompat.java.
// 0 fields, 78 methods.

interface ViewCompat_ViewCompatImpl {
    public fun animate(p0: android.view.View): android.support.v4.view.ViewPropertyAnimatorCompat

    public fun canScrollHorizontally(p0: android.view.View, p1: Int): Boolean

    public fun canScrollVertically(p0: android.view.View, p1: Int): Boolean

    public fun dispatchFinishTemporaryDetach(p0: android.view.View)

    public fun dispatchStartTemporaryDetach(p0: android.view.View)

    public fun getAccessibilityLiveRegion(p0: android.view.View): Int

    public fun getAccessibilityNodeProvider(p0: android.view.View): android.support.v4.view.accessibility.AccessibilityNodeProviderCompat

    public fun getAlpha(p0: android.view.View): Float

    public fun getElevation(p0: android.view.View): Float

    public fun getFitsSystemWindows(p0: android.view.View): Boolean

    public fun getImportantForAccessibility(p0: android.view.View): Int

    public fun getLabelFor(p0: android.view.View): Int

    public fun getLayerType(p0: android.view.View): Int

    public fun getLayoutDirection(p0: android.view.View): Int

    public fun getMeasuredHeightAndState(p0: android.view.View): Int

    public fun getMeasuredState(p0: android.view.View): Int

    public fun getMeasuredWidthAndState(p0: android.view.View): Int

    public fun getMinimumHeight(p0: android.view.View): Int

    public fun getMinimumWidth(p0: android.view.View): Int

    public fun getOverScrollMode(p0: android.view.View): Int

    public fun getPaddingEnd(p0: android.view.View): Int

    public fun getPaddingStart(p0: android.view.View): Int

    public fun getParentForAccessibility(p0: android.view.View): android.view.ViewParent

    public fun getPivotX(p0: android.view.View): Float

    public fun getPivotY(p0: android.view.View): Float

    public fun getRotation(p0: android.view.View): Float

    public fun getRotationX(p0: android.view.View): Float

    public fun getRotationY(p0: android.view.View): Float

    public fun getScaleX(p0: android.view.View): Float

    public fun getScaleY(p0: android.view.View): Float

    public fun getTransitionName(p0: android.view.View): String

    public fun getTranslationX(p0: android.view.View): Float

    public fun getTranslationY(p0: android.view.View): Float

    public fun getTranslationZ(p0: android.view.View): Float

    public fun getWindowSystemUiVisibility(p0: android.view.View): Int

    public fun getX(p0: android.view.View): Float

    public fun getY(p0: android.view.View): Float

    public fun hasAccessibilityDelegate(p0: android.view.View): Boolean

    public fun hasTransientState(p0: android.view.View): Boolean

    public fun isOpaque(p0: android.view.View): Boolean

    public fun jumpDrawablesToCurrentState(p0: android.view.View)

    public fun onInitializeAccessibilityEvent(p0: android.view.View, p1: android.view.accessibility.AccessibilityEvent)

    public fun onInitializeAccessibilityNodeInfo(p0: android.view.View, p1: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat)

    public fun onPopulateAccessibilityEvent(p0: android.view.View, p1: android.view.accessibility.AccessibilityEvent)

    public fun performAccessibilityAction(p0: android.view.View, p1: Int, p2: android.os.Bundle): Boolean

    public fun postInvalidateOnAnimation(p0: android.view.View)

    public fun postInvalidateOnAnimation(p0: android.view.View, p1: Int, p2: Int, p3: Int, p4: Int)

    public fun postOnAnimation(p0: android.view.View, p1: Runnable)

    public fun postOnAnimationDelayed(p0: android.view.View, p1: Runnable, p2: Long)

    public fun requestApplyInsets(p0: android.view.View)

    public fun resolveSizeAndState(p0: Int, p1: Int, p2: Int): Int

    public fun setAccessibilityDelegate(p0: android.view.View, p1: android.support.v4.view.AccessibilityDelegateCompat)

    public fun setAccessibilityLiveRegion(p0: android.view.View, p1: Int)

    public fun setAlpha(p0: android.view.View, p1: Float)

    public fun setChildrenDrawingOrderEnabled(p0: android.view.ViewGroup, p1: Boolean)

    public fun setElevation(p0: android.view.View, p1: Float)

    public fun setHasTransientState(p0: android.view.View, p1: Boolean)

    public fun setImportantForAccessibility(p0: android.view.View, p1: Int)

    public fun setLabelFor(p0: android.view.View, p1: Int)

    public fun setLayerPaint(p0: android.view.View, p1: android.graphics.Paint)

    public fun setLayerType(p0: android.view.View, p1: Int, p2: android.graphics.Paint)

    public fun setLayoutDirection(p0: android.view.View, p1: Int)

    public fun setOnApplyWindowInsetsListener(p0: android.view.View, p1: android.support.v4.view.OnApplyWindowInsetsListener)

    public fun setOverScrollMode(p0: android.view.View, p1: Int)

    public fun setPaddingRelative(p0: android.view.View, p1: Int, p2: Int, p3: Int, p4: Int)

    public fun setPivotX(p0: android.view.View, p1: Float)

    public fun setPivotY(p0: android.view.View, p1: Float)

    public fun setRotation(p0: android.view.View, p1: Float)

    public fun setRotationX(p0: android.view.View, p1: Float)

    public fun setRotationY(p0: android.view.View, p1: Float)

    public fun setScaleX(p0: android.view.View, p1: Float)

    public fun setScaleY(p0: android.view.View, p1: Float)

    public fun setTransitionName(p0: android.view.View, p1: String)

    public fun setTranslationX(p0: android.view.View, p1: Float)

    public fun setTranslationY(p0: android.view.View, p1: Float)

    public fun setTranslationZ(p0: android.view.View, p1: Float)

    public fun setX(p0: android.view.View, p1: Float)

    public fun setY(p0: android.view.View, p1: Float)

}
