package android.support.v4.widget

// Auto-emitted from smali source: ScrollerCompatGingerbread.java.
// 0 fields, 16 methods.

open class ScrollerCompatGingerbread {
    constructor()

    companion object {
    public @JvmStatic fun abortAnimation(scroller: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/OverScroller;
    //         .end local p0    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/widget/OverScroller;->abortAnimation()V
    //         return-void
    */

    public @JvmStatic fun computeScrollOffset(scroller: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/OverScroller;
    //         .end local p0    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/widget/OverScroller;->computeScrollOffset()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun createScroller(context: android.content.Context, interpolator: android.view.animation.Interpolator): Object { return TODO("body: (Landroid/content/Context;Landroid/view/animation/Interpolator;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         new-instance v0, Landroid/widget/OverScroller;
    //         invoke-direct {v0, p0, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Landroid/widget/OverScroller;
    //         invoke-direct {v0, p0}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V
    //         goto :goto_0
    */

    public @JvmStatic fun fling(scroller: Object, startX: Int, startY: Int, velX: Int, velY: Int, minX: Int, maxX: Int, minY: Int, maxY: Int) { /* TODO(body): (Ljava/lang/Object;IIIIIIII)V */ }
    /*
    //         .locals 9
    //         move-object v0, p0
    //         check-cast v0, Landroid/widget/OverScroller;
    //         move v1, p1
    //         move v2, p2
    //         move v3, p3
    //         move v4, p4
    //         move v5, p5
    //         move v6, p6
    //         move/from16 v7, p7
    //         move/from16 v8, p8
    //         invoke-virtual/range {v0 .. v8}, Landroid/widget/OverScroller;->fling(IIIIIIII)V
    //         return-void
    */

    public @JvmStatic fun fling(scroller: Object, startX: Int, startY: Int, velX: Int, velY: Int, minX: Int, maxX: Int, minY: Int, maxY: Int, overX: Int, overY: Int) { /* TODO(body): (Ljava/lang/Object;IIIIIIIIII)V */ }
    /*
    //         .locals 11
    //         move-object v0, p0
    //         check-cast v0, Landroid/widget/OverScroller;
    //         move v1, p1
    //         move v2, p2
    //         move v3, p3
    //         move v4, p4
    //         move/from16 v5, p5
    //         move/from16 v6, p6
    //         move/from16 v7, p7
    //         move/from16 v8, p8
    //         move/from16 v9, p9
    //         move/from16 v10, p10
    //         invoke-virtual/range {v0 .. v10}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V
    //         return-void
    */

    public @JvmStatic fun getCurrX(scroller: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/OverScroller;
    //         .end local p0    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/widget/OverScroller;->getCurrX()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getCurrY(scroller: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/OverScroller;
    //         .end local p0    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/widget/OverScroller;->getCurrY()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getFinalX(scroller: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/OverScroller;
    //         .end local p0    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/widget/OverScroller;->getFinalX()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getFinalY(scroller: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/OverScroller;
    //         .end local p0    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/widget/OverScroller;->getFinalY()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isFinished(scroller: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/OverScroller;
    //         .end local p0    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/widget/OverScroller;->isFinished()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isOverScrolled(scroller: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/OverScroller;
    //         .end local p0    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/widget/OverScroller;->isOverScrolled()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun notifyHorizontalEdgeReached(scroller: Object, startX: Int, finalX: Int, overX: Int) { /* TODO(body): (Ljava/lang/Object;III)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/OverScroller;
    //         .end local p0    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/widget/OverScroller;->notifyHorizontalEdgeReached(III)V
    //         return-void
    */

    public @JvmStatic fun notifyVerticalEdgeReached(scroller: Object, startY: Int, finalY: Int, overY: Int) { /* TODO(body): (Ljava/lang/Object;III)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/OverScroller;
    //         .end local p0    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/widget/OverScroller;->notifyVerticalEdgeReached(III)V
    //         return-void
    */

    public @JvmStatic fun startScroll(scroller: Object, startX: Int, startY: Int, dx: Int, dy: Int) { /* TODO(body): (Ljava/lang/Object;IIII)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/OverScroller;
    //         .end local p0    # "scroller":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/OverScroller;->startScroll(IIII)V
    //         return-void
    */

    public @JvmStatic fun startScroll(scroller: Object, startX: Int, startY: Int, dx: Int, dy: Int, duration: Int) { /* TODO(body): (Ljava/lang/Object;IIIII)V */ }
    /*
    //         .locals 6
    //         move-object v0, p0
    //         check-cast v0, Landroid/widget/OverScroller;
    //         move v1, p1
    //         move v2, p2
    //         move v3, p3
    //         move v4, p4
    //         move v5, p5
    //         invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V
    //         return-void
    */

    }
}
