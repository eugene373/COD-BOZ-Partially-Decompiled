package android.support.v4.widget

// Auto-emitted from smali source: ScrollerCompat.java.
// 4 fields, 19 methods.

open class ScrollerCompat {
    var mImpl: android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl
    var mScroller: Object

    private constructor(apiVersion: Int, context: android.content.Context, interpolator: android.view.animation.Interpolator)

    constructor(context: android.content.Context, interpolator: android.view.animation.Interpolator)

    public fun abortAnimation() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->abortAnimation(Ljava/lang/Object;)V
    //         return-void
    */

    public fun computeScrollOffset(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->computeScrollOffset(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun fling(startX: Int, startY: Int, velocityX: Int, velocityY: Int, minX: Int, maxX: Int, minY: Int, maxY: Int) { /* TODO(body): (IIIIIIII)V */ }
    /*
    //         .locals 10
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         move v2, p1
    //         move v3, p2
    //         move v4, p3
    //         move v5, p4
    //         move v6, p5
    //         move/from16 v7, p6
    //         move/from16 v8, p7
    //         move/from16 v9, p8
    //         invoke-interface/range {v0 .. v9}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->fling(Ljava/lang/Object;IIIIIIII)V
    //         return-void
    */

    public fun fling(startX: Int, startY: Int, velocityX: Int, velocityY: Int, minX: Int, maxX: Int, minY: Int, maxY: Int, overX: Int, overY: Int) { /* TODO(body): (IIIIIIIIII)V */ }
    /*
    //         .locals 12
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         move v2, p1
    //         move v3, p2
    //         move v4, p3
    //         move/from16 v5, p4
    //         move/from16 v6, p5
    //         move/from16 v7, p6
    //         move/from16 v8, p7
    //         move/from16 v9, p8
    //         move/from16 v10, p9
    //         move/from16 v11, p10
    //         invoke-interface/range {v0 .. v11}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->fling(Ljava/lang/Object;IIIIIIIIII)V
    //         return-void
    */

    public fun getCurrVelocity(): Float { return TODO("body: ()F") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->getCurrVelocity(Ljava/lang/Object;)F
    //         move-result v0
    //         return v0
    */

    public fun getCurrX(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->getCurrX(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getCurrY(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->getCurrY(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getFinalX(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->getFinalX(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getFinalY(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->getFinalY(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun isFinished(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->isFinished(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isOverScrolled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->isOverScrolled(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun notifyHorizontalEdgeReached(startX: Int, finalX: Int, overX: Int) { /* TODO(body): (III)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1, p2, p3}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->notifyHorizontalEdgeReached(Ljava/lang/Object;III)V
    //         return-void
    */

    public fun notifyVerticalEdgeReached(startY: Int, finalY: Int, overY: Int) { /* TODO(body): (III)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1, p2, p3}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->notifyVerticalEdgeReached(Ljava/lang/Object;III)V
    //         return-void
    */

    public fun startScroll(startX: Int, startY: Int, dx: Int, dy: Int) { /* TODO(body): (IIII)V */ }
    /*
    //         .locals 6
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         move v2, p1
    //         move v3, p2
    //         move v4, p3
    //         move v5, p4
    //         invoke-interface/range {v0 .. v5}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->startScroll(Ljava/lang/Object;IIII)V
    //         return-void
    */

    public fun startScroll(startX: Int, startY: Int, dx: Int, dy: Int, duration: Int) { /* TODO(body): (IIIII)V */ }
    /*
    //         .locals 7
    //         iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;
    //         move v2, p1
    //         move v3, p2
    //         move v4, p3
    //         move v5, p4
    //         move v6, p5
    //         invoke-interface/range {v0 .. v6}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->startScroll(Ljava/lang/Object;IIIII)V
    //         return-void
    */

    companion object {
    val CHASE_FRAME_TIME: Int = 0x10
    private val TAG: String = "ScrollerCompat"

    public @JvmStatic fun create(context: android.content.Context): android.support.v4.widget.ScrollerCompat { return TODO("body: (Landroid/content/Context;)Landroid/support/v4/widget/ScrollerCompat;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {p0, v0}, Landroid/support/v4/widget/ScrollerCompat;->create(Landroid/content/Context;Landroid/view/animation/Interpolator;)Landroid/support/v4/widget/ScrollerCompat;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun create(context: android.content.Context, interpolator: android.view.animation.Interpolator): android.support.v4.widget.ScrollerCompat { return TODO("body: (Landroid/content/Context;Landroid/view/animation/Interpolator;)Landroid/support/v4/widget/ScrollerCompat;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/widget/ScrollerCompat;
    //         invoke-direct {v0, p0, p1}, Landroid/support/v4/widget/ScrollerCompat;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
    //         return-object v0
    */

    }
}
