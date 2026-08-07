package android.support.v4.widget

// Auto-emitted from smali source: AutoScrollHelper.java.
// 34 fields, 40 methods.

open class AutoScrollHelper: android.view.View.OnTouchListener {
    private var mActivationDelay: Int
    private var mAlreadyDelayed: Boolean
    private var mAnimating: Boolean
    private val mEdgeInterpolator: android.view.animation.Interpolator
    private var mEdgeType: Int
    private var mEnabled: Boolean
    private var mExclusive: Boolean
    private var mMaximumEdges: FloatArray
    private var mMaximumVelocity: FloatArray
    private var mMinimumVelocity: FloatArray
    private var mNeedsCancel: Boolean
    private var mNeedsReset: Boolean
    private var mRelativeEdges: FloatArray
    private var mRelativeVelocity: FloatArray
    private var mRunnable: Runnable
    private val mScroller: android.support.v4.widget.AutoScrollHelper.ClampedScroller
    private val mTarget: android.view.View

    public constructor(target: android.view.View)

    private fun cancelTargetTouch() { /* TODO(body): ()V */ }
    /*
    //         .locals 9
    //         const/4 v5, 0x0
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v0
    //         .local v0, "eventTime":J
    //         const/4 v4, 0x3
    //         const/4 v7, 0x0
    //         move-wide v2, v0
    //         move v6, v5
    //         invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;
    //         move-result-object v8
    //         .local v8, "cancel":Landroid/view/MotionEvent;
    //         iget-object v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;
    //         invoke-virtual {v2, v8}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z
    //         invoke-virtual {v8}, Landroid/view/MotionEvent;->recycle()V
    //         return-void
    */

    private fun computeTargetVelocity(direction: Int, coordinate: Float, srcSize: Float, dstSize: Float): Float { return TODO("body: (IFFF)F") }
    /*
    //         .locals 9
    //         const/4 v7, 0x0
    //         iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeEdges:[F
    //         aget v3, v8, p1
    //         .local v3, "relativeEdge":F
    //         iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumEdges:[F
    //         aget v0, v8, p1
    //         .local v0, "maximumEdge":F
    //         invoke-direct {p0, v3, p3, v0, p2}, Landroid/support/v4/widget/AutoScrollHelper;->getEdgeValue(FFFF)F
    //         move-result v6
    //         .local v6, "value":F
    //         cmpl-float v8, v6, v7
    //         if-nez v8, :cond_0
    //         :goto_0
    //         return v7
    //         :cond_0
    //         iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeVelocity:[F
    //         aget v4, v8, p1
    //         .local v4, "relativeVelocity":F
    //         iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMinimumVelocity:[F
    //         aget v2, v8, p1
    //         .local v2, "minimumVelocity":F
    //         iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumVelocity:[F
    //         aget v1, v8, p1
    //         .local v1, "maximumVelocity":F
    //         mul-float v5, v4, p4
    //         .local v5, "targetVelocity":F
    //         cmpl-float v7, v6, v7
    //         if-lez v7, :cond_1
    //         mul-float v7, v6, v5
    //         invoke-static {v7, v2, v1}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F
    //         move-result v7
    //         goto :goto_0
    //         :cond_1
    //         neg-float v7, v6
    //         mul-float/2addr v7, v5
    //         invoke-static {v7, v2, v1}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F
    //         move-result v7
    //         neg-float v7, v7
    //         goto :goto_0
    */

    private fun constrainEdgeValue(current: Float, leading: Float): Float { return TODO("body: (FF)F") }
    /*
    //         .locals 4
    //         const/high16 v1, 0x3f800000    # 1.0f
    //         const/4 v0, 0x0
    //         cmpl-float v2, p2, v0
    //         if-nez v2, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v0
    //         :cond_1
    //         iget v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeType:I
    //         packed-switch v2, :pswitch_data_0
    //         goto :goto_0
    //         :pswitch_0
    //         cmpg-float v2, p1, p2
    //         if-gez v2, :cond_0
    //         cmpl-float v2, p1, v0
    //         if-ltz v2, :cond_2
    //         div-float v0, p1, p2
    //         sub-float v0, v1, v0
    //         goto :goto_0
    //         :cond_2
    //         iget-boolean v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z
    //         if-eqz v2, :cond_0
    //         iget v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeType:I
    //         const/4 v3, 0x1
    //         if-ne v2, v3, :cond_0
    //         move v0, v1
    //         goto :goto_0
    //         :pswitch_1
    //         cmpg-float v1, p1, v0
    //         if-gez v1, :cond_0
    //         neg-float v0, p2
    //         div-float v0, p1, v0
    //         goto :goto_0
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    private fun getEdgeValue(relativeValue: Float, size: Float, maxValue: Float, current: Float): Float { return TODO("body: (FFFF)F") }
    /*
    //         .locals 7
    //         const/4 v5, 0x0
    //         mul-float v6, p1, p2
    //         invoke-static {v6, v5, p3}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F
    //         move-result v0
    //         .local v0, "edgeSize":F
    //         invoke-direct {p0, p4, v0}, Landroid/support/v4/widget/AutoScrollHelper;->constrainEdgeValue(FF)F
    //         move-result v3
    //         .local v3, "valueLeading":F
    //         sub-float v6, p2, p4
    //         invoke-direct {p0, v6, v0}, Landroid/support/v4/widget/AutoScrollHelper;->constrainEdgeValue(FF)F
    //         move-result v4
    //         .local v4, "valueTrailing":F
    //         sub-float v2, v4, v3
    //         .local v2, "value":F
    //         cmpg-float v6, v2, v5
    //         if-gez v6, :cond_1
    //         iget-object v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeInterpolator:Landroid/view/animation/Interpolator;
    //         neg-float v6, v2
    //         invoke-interface {v5, v6}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
    //         move-result v5
    //         neg-float v1, v5
    //         .local v1, "interpolated":F
    //         :goto_0
    //         const/high16 v5, -0x40800000    # -1.0f
    //         const/high16 v6, 0x3f800000    # 1.0f
    //         invoke-static {v1, v5, v6}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F
    //         move-result v5
    //         .end local v1    # "interpolated":F
    //         :cond_0
    //         return v5
    //         :cond_1
    //         cmpl-float v6, v2, v5
    //         if-lez v6, :cond_0
    //         iget-object v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeInterpolator:Landroid/view/animation/Interpolator;
    //         invoke-interface {v5, v2}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
    //         move-result v1
    //         .restart local v1    # "interpolated":F
    //         goto :goto_0
    */

    private fun requestStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsReset:Z
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->requestStop()V
    //         goto :goto_0
    */

    private fun shouldAnimate(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         iget-object v1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
    //         .local v1, "scroller":Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
    //         invoke-virtual {v1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getVerticalDirection()I
    //         move-result v2
    //         .local v2, "verticalDirection":I
    //         invoke-virtual {v1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getHorizontalDirection()I
    //         move-result v0
    //         .local v0, "horizontalDirection":I
    //         if-eqz v2, :cond_0
    //         invoke-virtual {p0, v2}, Landroid/support/v4/widget/AutoScrollHelper;->canTargetScrollVertically(I)Z
    //         move-result v3
    //         if-nez v3, :cond_1
    //         :cond_0
    //         if-eqz v0, :cond_2
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/AutoScrollHelper;->canTargetScrollHorizontally(I)Z
    //         move-result v3
    //         if-eqz v3, :cond_2
    //         :cond_1
    //         const/4 v3, 0x1
    //         :goto_0
    //         return v3
    //         :cond_2
    //         const/4 v3, 0x0
    //         goto :goto_0
    */

    private fun startAnimating() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x1
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRunnable:Ljava/lang/Runnable;
    //         if-nez v0, :cond_0
    //         new-instance v0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;-><init>(Landroid/support/v4/widget/AutoScrollHelper;Landroid/support/v4/widget/AutoScrollHelper$1;)V
    //         iput-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRunnable:Ljava/lang/Runnable;
    //         :cond_0
    //         iput-boolean v4, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z
    //         iput-boolean v4, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsReset:Z
    //         iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAlreadyDelayed:Z
    //         if-nez v0, :cond_1
    //         iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mActivationDelay:I
    //         if-lez v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;
    //         iget-object v1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRunnable:Ljava/lang/Runnable;
    //         iget v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mActivationDelay:I
    //         int-to-long v2, v2
    //         invoke-static {v0, v1, v2, v3}, Landroid/support/v4/view/ViewCompat;->postOnAnimationDelayed(Landroid/view/View;Ljava/lang/Runnable;J)V
    //         :goto_0
    //         iput-boolean v4, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAlreadyDelayed:Z
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRunnable:Ljava/lang/Runnable;
    //         invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    //         goto :goto_0
    */

    public fun canTargetScrollHorizontally(p0: Int): Boolean

    public fun canTargetScrollVertically(p0: Int): Boolean

    public fun isEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEnabled:Z
    //         return v0
    */

    public fun isExclusive(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mExclusive:Z
    //         return v0
    */

    public fun onTouch(v: android.view.View, event: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/View;Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 8
    //         const/4 v3, 0x1
    //         const/4 v4, 0x0
    //         iget-boolean v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEnabled:Z
    //         if-nez v5, :cond_0
    //         :goto_0
    //         return v4
    //         :cond_0
    //         invoke-static {p2}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
    //         move-result v0
    //         .local v0, "action":I
    //         packed-switch v0, :pswitch_data_0
    //         :cond_1
    //         :goto_1
    //         iget-boolean v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mExclusive:Z
    //         if-eqz v5, :cond_2
    //         iget-boolean v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z
    //         if-eqz v5, :cond_2
    //         :goto_2
    //         move v4, v3
    //         goto :goto_0
    //         :pswitch_0
    //         iput-boolean v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsCancel:Z
    //         iput-boolean v4, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAlreadyDelayed:Z
    //         :pswitch_1
    //         invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
    //         move-result v5
    //         invoke-virtual {p1}, Landroid/view/View;->getWidth()I
    //         move-result v6
    //         int-to-float v6, v6
    //         iget-object v7, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;
    //         invoke-virtual {v7}, Landroid/view/View;->getWidth()I
    //         move-result v7
    //         int-to-float v7, v7
    //         invoke-direct {p0, v4, v5, v6, v7}, Landroid/support/v4/widget/AutoScrollHelper;->computeTargetVelocity(IFFF)F
    //         move-result v1
    //         .local v1, "xTargetVelocity":F
    //         invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
    //         move-result v5
    //         invoke-virtual {p1}, Landroid/view/View;->getHeight()I
    //         move-result v6
    //         int-to-float v6, v6
    //         iget-object v7, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;
    //         invoke-virtual {v7}, Landroid/view/View;->getHeight()I
    //         move-result v7
    //         int-to-float v7, v7
    //         invoke-direct {p0, v3, v5, v6, v7}, Landroid/support/v4/widget/AutoScrollHelper;->computeTargetVelocity(IFFF)F
    //         move-result v2
    //         .local v2, "yTargetVelocity":F
    //         iget-object v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
    //         invoke-virtual {v5, v1, v2}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->setTargetVelocity(FF)V
    //         iget-boolean v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z
    //         if-nez v5, :cond_1
    //         invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->shouldAnimate()Z
    //         move-result v5
    //         if-eqz v5, :cond_1
    //         invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->startAnimating()V
    //         goto :goto_1
    //         .end local v1    # "xTargetVelocity":F
    //         .end local v2    # "yTargetVelocity":F
    //         :pswitch_2
    //         invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->requestStop()V
    //         goto :goto_1
    //         :cond_2
    //         move v3, v4
    //         goto :goto_2
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_2
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun scrollTargetBy(p0: Int, p1: Int)

    public fun setActivationDelay(delayMillis: Int): android.support.v4.widget.AutoScrollHelper { return TODO("body: (I)Landroid/support/v4/widget/AutoScrollHelper;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mActivationDelay:I
    //         return-object p0
    */

    public fun setEdgeType(type: Int): android.support.v4.widget.AutoScrollHelper { return TODO("body: (I)Landroid/support/v4/widget/AutoScrollHelper;") }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeType:I
    //         return-object p0
    */

    public fun setEnabled(enabled: Boolean): android.support.v4.widget.AutoScrollHelper { return TODO("body: (Z)Landroid/support/v4/widget/AutoScrollHelper;") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEnabled:Z
    //         if-eqz v0, :cond_0
    //         if-nez p1, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->requestStop()V
    //         :cond_0
    //         iput-boolean p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEnabled:Z
    //         return-object p0
    */

    public fun setExclusive(exclusive: Boolean): android.support.v4.widget.AutoScrollHelper { return TODO("body: (Z)Landroid/support/v4/widget/AutoScrollHelper;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mExclusive:Z
    //         return-object p0
    */

    public fun setMaximumEdges(horizontalMax: Float, verticalMax: Float): android.support.v4.widget.AutoScrollHelper { return TODO("body: (FF)Landroid/support/v4/widget/AutoScrollHelper;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumEdges:[F
    //         const/4 v1, 0x0
    //         aput p1, v0, v1
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumEdges:[F
    //         const/4 v1, 0x1
    //         aput p2, v0, v1
    //         return-object p0
    */

    public fun setMaximumVelocity(horizontalMax: Float, verticalMax: Float): android.support.v4.widget.AutoScrollHelper { return TODO("body: (FF)Landroid/support/v4/widget/AutoScrollHelper;") }
    /*
    //         .locals 4
    //         const/high16 v3, 0x447a0000    # 1000.0f
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumVelocity:[F
    //         const/4 v1, 0x0
    //         div-float v2, p1, v3
    //         aput v2, v0, v1
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumVelocity:[F
    //         const/4 v1, 0x1
    //         div-float v2, p2, v3
    //         aput v2, v0, v1
    //         return-object p0
    */

    public fun setMinimumVelocity(horizontalMin: Float, verticalMin: Float): android.support.v4.widget.AutoScrollHelper { return TODO("body: (FF)Landroid/support/v4/widget/AutoScrollHelper;") }
    /*
    //         .locals 4
    //         const/high16 v3, 0x447a0000    # 1000.0f
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMinimumVelocity:[F
    //         const/4 v1, 0x0
    //         div-float v2, p1, v3
    //         aput v2, v0, v1
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMinimumVelocity:[F
    //         const/4 v1, 0x1
    //         div-float v2, p2, v3
    //         aput v2, v0, v1
    //         return-object p0
    */

    public fun setRampDownDuration(durationMillis: Int): android.support.v4.widget.AutoScrollHelper { return TODO("body: (I)Landroid/support/v4/widget/AutoScrollHelper;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->setRampDownDuration(I)V
    //         return-object p0
    */

    public fun setRampUpDuration(durationMillis: Int): android.support.v4.widget.AutoScrollHelper { return TODO("body: (I)Landroid/support/v4/widget/AutoScrollHelper;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->setRampUpDuration(I)V
    //         return-object p0
    */

    public fun setRelativeEdges(horizontal: Float, vertical: Float): android.support.v4.widget.AutoScrollHelper { return TODO("body: (FF)Landroid/support/v4/widget/AutoScrollHelper;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeEdges:[F
    //         const/4 v1, 0x0
    //         aput p1, v0, v1
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeEdges:[F
    //         const/4 v1, 0x1
    //         aput p2, v0, v1
    //         return-object p0
    */

    public fun setRelativeVelocity(horizontal: Float, vertical: Float): android.support.v4.widget.AutoScrollHelper { return TODO("body: (FF)Landroid/support/v4/widget/AutoScrollHelper;") }
    /*
    //         .locals 4
    //         const/high16 v3, 0x447a0000    # 1000.0f
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeVelocity:[F
    //         const/4 v1, 0x0
    //         div-float v2, p1, v3
    //         aput v2, v0, v1
    //         iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeVelocity:[F
    //         const/4 v1, 0x1
    //         div-float v2, p2, v3
    //         aput v2, v0, v1
    //         return-object p0
    */

    companion object {
    private val DEFAULT_ACTIVATION_DELAY: Int = 0
    private val DEFAULT_EDGE_TYPE: Int = 0x1
    private val DEFAULT_MAXIMUM_EDGE: Float = 0.0f
    private val DEFAULT_MAXIMUM_VELOCITY_DIPS: Int = 0x627
    private val DEFAULT_MINIMUM_VELOCITY_DIPS: Int = 0x13b
    private val DEFAULT_RAMP_DOWN_DURATION: Int = 0x1f4
    private val DEFAULT_RAMP_UP_DURATION: Int = 0x1f4
    private val DEFAULT_RELATIVE_EDGE: Float = 0.0f
    private val DEFAULT_RELATIVE_VELOCITY: Float = 0.0f
    @JvmField public val EDGE_TYPE_INSIDE: Int = 0x0
    @JvmField public val EDGE_TYPE_INSIDE_EXTEND: Int = 0x1
    @JvmField public val EDGE_TYPE_OUTSIDE: Int = 0x2
    private val HORIZONTAL: Int = 0x0
    @JvmField public val NO_MAX: Float = 0.0f
    @JvmField public val NO_MIN: Float = 0.0f
    @JvmField public val RELATIVE_UNSPECIFIED: Float = 0.0f
    private val VERTICAL: Int = 0x1

    private @JvmStatic fun constrain(value: Float, min: Float, max: Float): Float { return TODO("body: (FFF)F") }
    /*
    //         .locals 1
    //         cmpl-float v0, p0, p2
    //         if-lez v0, :cond_0
    //         .end local p2    # "max":F
    //         :goto_0
    //         return p2
    //         .restart local p2    # "max":F
    //         :cond_0
    //         cmpg-float v0, p0, p1
    //         if-gez v0, :cond_1
    //         move p2, p1
    //         goto :goto_0
    //         :cond_1
    //         move p2, p0
    //         goto :goto_0
    */

    private @JvmStatic fun constrain(value: Int, min: Int, max: Int): Int { return TODO("body: (III)I") }
    /*
    //         .locals 0
    //         if-le p0, p2, :cond_0
    //         .end local p2    # "max":I
    //         :goto_0
    //         return p2
    //         .restart local p2    # "max":I
    //         :cond_0
    //         if-ge p0, p1, :cond_1
    //         move p2, p1
    //         goto :goto_0
    //         :cond_1
    //         move p2, p0
    //         goto :goto_0
    */

    }
}
