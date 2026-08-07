package android.support.v4.widget

// Auto-emitted from smali source: ScrollerCompat.java.
// 0 fields, 17 methods.

open class ScrollerCompat_ScrollerCompatImplGingerbread: android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl {
    constructor()

    public fun abortAnimation(scroller: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->abortAnimation(Ljava/lang/Object;)V
    //         return-void
    */

    public fun computeScrollOffset(scroller: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->computeScrollOffset(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun createScroller(context: android.content.Context, interpolator: android.view.animation.Interpolator): Object { return TODO("body: (Landroid/content/Context;Landroid/view/animation/Interpolator;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->createScroller(Landroid/content/Context;Landroid/view/animation/Interpolator;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun fling(scroller: Object, startX: Int, startY: Int, velX: Int, velY: Int, minX: Int, maxX: Int, minY: Int, maxY: Int) { /* TODO(body): (Ljava/lang/Object;IIIIIIII)V */ }
    /*
    //         .locals 0
    //         invoke-static/range {p1 .. p9}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->fling(Ljava/lang/Object;IIIIIIII)V
    //         return-void
    */

    public fun fling(scroller: Object, startX: Int, startY: Int, velX: Int, velY: Int, minX: Int, maxX: Int, minY: Int, maxY: Int, overX: Int, overY: Int) { /* TODO(body): (Ljava/lang/Object;IIIIIIIIII)V */ }
    /*
    //         .locals 0
    //         invoke-static/range {p1 .. p11}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->fling(Ljava/lang/Object;IIIIIIIIII)V
    //         return-void
    */

    public fun getCurrVelocity(scroller: Object): Float { return TODO("body: (Ljava/lang/Object;)F") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getCurrX(scroller: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->getCurrX(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getCurrY(scroller: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->getCurrY(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getFinalX(scroller: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->getFinalX(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getFinalY(scroller: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->getFinalY(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun isFinished(scroller: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->isFinished(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isOverScrolled(scroller: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->isOverScrolled(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun notifyHorizontalEdgeReached(scroller: Object, startX: Int, finalX: Int, overX: Int) { /* TODO(body): (Ljava/lang/Object;III)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2, p3, p4}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->notifyHorizontalEdgeReached(Ljava/lang/Object;III)V
    //         return-void
    */

    public fun notifyVerticalEdgeReached(scroller: Object, startY: Int, finalY: Int, overY: Int) { /* TODO(body): (Ljava/lang/Object;III)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2, p3, p4}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->notifyVerticalEdgeReached(Ljava/lang/Object;III)V
    //         return-void
    */

    public fun startScroll(scroller: Object, startX: Int, startY: Int, dx: Int, dy: Int) { /* TODO(body): (Ljava/lang/Object;IIII)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2, p3, p4, p5}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->startScroll(Ljava/lang/Object;IIII)V
    //         return-void
    */

    public fun startScroll(scroller: Object, startX: Int, startY: Int, dx: Int, dy: Int, duration: Int) { /* TODO(body): (Ljava/lang/Object;IIIII)V */ }
    /*
    //         .locals 0
    //         invoke-static/range {p1 .. p6}, Landroid/support/v4/widget/ScrollerCompatGingerbread;->startScroll(Ljava/lang/Object;IIIII)V
    //         return-void
    */

}
