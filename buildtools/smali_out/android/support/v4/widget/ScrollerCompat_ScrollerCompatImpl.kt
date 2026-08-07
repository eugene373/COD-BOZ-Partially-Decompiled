package android.support.v4.widget

// Auto-emitted from smali source: ScrollerCompat.java.
// 0 fields, 16 methods.

interface ScrollerCompat_ScrollerCompatImpl {
    public fun abortAnimation(p0: Object)

    public fun computeScrollOffset(p0: Object): Boolean

    public fun createScroller(p0: android.content.Context, p1: android.view.animation.Interpolator): Object

    public fun fling(p0: Object, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int)

    public fun fling(p0: Object, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Int, p8: Int, p9: Int, p10: Int)

    public fun getCurrVelocity(p0: Object): Float

    public fun getCurrX(p0: Object): Int

    public fun getCurrY(p0: Object): Int

    public fun getFinalX(p0: Object): Int

    public fun getFinalY(p0: Object): Int

    public fun isFinished(p0: Object): Boolean

    public fun isOverScrolled(p0: Object): Boolean

    public fun notifyHorizontalEdgeReached(p0: Object, p1: Int, p2: Int, p3: Int)

    public fun notifyVerticalEdgeReached(p0: Object, p1: Int, p2: Int, p3: Int)

    public fun startScroll(p0: Object, p1: Int, p2: Int, p3: Int, p4: Int)

    public fun startScroll(p0: Object, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int)

}
