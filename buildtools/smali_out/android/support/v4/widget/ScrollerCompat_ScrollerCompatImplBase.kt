package android.support.v4.widget

// Auto-emitted from smali source: ScrollerCompat.java.
// 0 fields, 17 methods.

open class ScrollerCompat_ScrollerCompatImplBase: android.support.v4.widget.ScrollerCompat.ScrollerCompatImpl {
    constructor()

    public fun abortAnimation(scroller: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Landroid/widget/Scroller;
    //         .end local p1    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p1}, Landroid/widget/Scroller;->abortAnimation()V
    //         return-void
    */

    public fun computeScrollOffset(scroller: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         move-object v0, p1
    //         check-cast v0, Landroid/widget/Scroller;
    //         .local v0, "s":Landroid/widget/Scroller;
    //         invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z
    //         move-result v1
    //         return v1
    */

    public fun createScroller(context: android.content.Context, interpolator: android.view.animation.Interpolator): Object { return TODO("body: (Landroid/content/Context;Landroid/view/animation/Interpolator;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         if-eqz p2, :cond_0
    //         new-instance v0, Landroid/widget/Scroller;
    //         invoke-direct {v0, p1, p2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Landroid/widget/Scroller;
    //         invoke-direct {v0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V
    //         goto :goto_0
    */

    public fun fling(scroller: Object, startX: Int, startY: Int, velX: Int, velY: Int, minX: Int, maxX: Int, minY: Int, maxY: Int) { /* TODO(body): (Ljava/lang/Object;IIIIIIII)V */ }
    /*
    //         .locals 9
    //         move-object v0, p1
    //         check-cast v0, Landroid/widget/Scroller;
    //         move v1, p2
    //         move v2, p3
    //         move v3, p4
    //         move v4, p5
    //         move v5, p6
    //         move/from16 v6, p7
    //         move/from16 v7, p8
    //         move/from16 v8, p9
    //         invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V
    //         return-void
    */

    public fun fling(scroller: Object, startX: Int, startY: Int, velX: Int, velY: Int, minX: Int, maxX: Int, minY: Int, maxY: Int, overX: Int, overY: Int) { /* TODO(body): (Ljava/lang/Object;IIIIIIIIII)V */ }
    /*
    //         .locals 9
    //         move-object v0, p1
    //         check-cast v0, Landroid/widget/Scroller;
    //         move v1, p2
    //         move v2, p3
    //         move v3, p4
    //         move v4, p5
    //         move v5, p6
    //         move/from16 v6, p7
    //         move/from16 v7, p8
    //         move/from16 v8, p9
    //         invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V
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
    //         check-cast p1, Landroid/widget/Scroller;
    //         .end local p1    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrX()I
    //         move-result v0
    //         return v0
    */

    public fun getCurrY(scroller: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p1, Landroid/widget/Scroller;
    //         .end local p1    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrY()I
    //         move-result v0
    //         return v0
    */

    public fun getFinalX(scroller: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p1, Landroid/widget/Scroller;
    //         .end local p1    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p1}, Landroid/widget/Scroller;->getFinalX()I
    //         move-result v0
    //         return v0
    */

    public fun getFinalY(scroller: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p1, Landroid/widget/Scroller;
    //         .end local p1    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p1}, Landroid/widget/Scroller;->getFinalY()I
    //         move-result v0
    //         return v0
    */

    public fun isFinished(scroller: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p1, Landroid/widget/Scroller;
    //         .end local p1    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p1}, Landroid/widget/Scroller;->isFinished()Z
    //         move-result v0
    //         return v0
    */

    public fun isOverScrolled(scroller: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun notifyHorizontalEdgeReached(scroller: Object, startX: Int, finalX: Int, overX: Int) { /* TODO(body): (Ljava/lang/Object;III)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun notifyVerticalEdgeReached(scroller: Object, startY: Int, finalY: Int, overY: Int) { /* TODO(body): (Ljava/lang/Object;III)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun startScroll(scroller: Object, startX: Int, startY: Int, dx: Int, dy: Int) { /* TODO(body): (Ljava/lang/Object;IIII)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Landroid/widget/Scroller;
    //         .end local p1    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p1, p2, p3, p4, p5}, Landroid/widget/Scroller;->startScroll(IIII)V
    //         return-void
    */

    public fun startScroll(scroller: Object, startX: Int, startY: Int, dx: Int, dy: Int, duration: Int) { /* TODO(body): (Ljava/lang/Object;IIIII)V */ }
    /*
    //         .locals 6
    //         move-object v0, p1
    //         check-cast v0, Landroid/widget/Scroller;
    //         move v1, p2
    //         move v2, p3
    //         move v3, p4
    //         move v4, p5
    //         move v5, p6
    //         invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V
    //         return-void
    */

}
