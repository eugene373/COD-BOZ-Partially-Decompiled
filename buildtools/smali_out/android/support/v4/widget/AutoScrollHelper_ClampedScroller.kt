package android.support.v4.widget

// Auto-emitted from smali source: AutoScrollHelper.java.
// 11 fields, 14 methods.

open class AutoScrollHelper_ClampedScroller {
    private var mDeltaTime: Long
    private var mDeltaX: Int
    private var mDeltaY: Int
    private var mEffectiveRampDown: Int
    private var mRampDownDuration: Int
    private var mRampUpDuration: Int
    private var mStartTime: Long
    private var mStopTime: Long
    private var mStopValue: Float
    private var mTargetVelocityX: Float
    private var mTargetVelocityY: Float

    public constructor()

    private fun getValueAt(currentTime: Long): Float { return TODO("body: (J)F") }
    /*
    //         .locals 11
    //         const/high16 v10, 0x3f800000    # 1.0f
    //         const/4 v4, 0x0
    //         iget-wide v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J
    //         cmp-long v5, p1, v6
    //         if-gez v5, :cond_0
    //         :goto_0
    //         return v4
    //         :cond_0
    //         iget-wide v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
    //         const-wide/16 v8, 0x0
    //         cmp-long v5, v6, v8
    //         if-ltz v5, :cond_1
    //         iget-wide v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
    //         cmp-long v5, p1, v6
    //         if-gez v5, :cond_2
    //         :cond_1
    //         iget-wide v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J
    //         sub-long v2, p1, v6
    //         .local v2, "elapsedSinceStart":J
    //         const/high16 v5, 0x3f000000    # 0.5f
    //         long-to-float v6, v2
    //         iget v7, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mRampUpDuration:I
    //         int-to-float v7, v7
    //         div-float/2addr v6, v7
    //         invoke-static {v6, v4, v10}, Landroid/support/v4/widget/AutoScrollHelper;->access$900(FFF)F
    //         move-result v4
    //         mul-float/2addr v4, v5
    //         goto :goto_0
    //         .end local v2    # "elapsedSinceStart":J
    //         :cond_2
    //         iget-wide v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
    //         sub-long v0, p1, v6
    //         .local v0, "elapsedSinceEnd":J
    //         iget v5, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopValue:F
    //         sub-float v5, v10, v5
    //         iget v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopValue:F
    //         long-to-float v7, v0
    //         iget v8, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mEffectiveRampDown:I
    //         int-to-float v8, v8
    //         div-float/2addr v7, v8
    //         invoke-static {v7, v4, v10}, Landroid/support/v4/widget/AutoScrollHelper;->access$900(FFF)F
    //         move-result v4
    //         mul-float/2addr v4, v6
    //         add-float/2addr v4, v5
    //         goto :goto_0
    */

    private fun interpolateValue(value: Float): Float { return TODO("body: (F)F") }
    /*
    //         .locals 2
    //         const/high16 v0, -0x3f800000    # -4.0f
    //         mul-float/2addr v0, p1
    //         mul-float/2addr v0, p1
    //         const/high16 v1, 0x40800000    # 4.0f
    //         mul-float/2addr v1, p1
    //         add-float/2addr v0, v1
    //         return v0
    */

    public fun computeScrollDelta() { /* TODO(body): ()V */ }
    /*
    //         .locals 10
    //         iget-wide v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J
    //         const-wide/16 v8, 0x0
    //         cmp-long v6, v6, v8
    //         if-nez v6, :cond_0
    //         new-instance v6, Ljava/lang/RuntimeException;
    //         const-string v7, "Cannot compute scroll delta before calling start()"
    //         invoke-direct {v6, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    //         throw v6
    //         :cond_0
    //         invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
    //         move-result-wide v0
    //         .local v0, "currentTime":J
    //         invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getValueAt(J)F
    //         move-result v5
    //         .local v5, "value":F
    //         invoke-direct {p0, v5}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->interpolateValue(F)F
    //         move-result v4
    //         .local v4, "scale":F
    //         iget-wide v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J
    //         sub-long v2, v0, v6
    //         .local v2, "elapsedSinceDelta":J
    //         iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J
    //         long-to-float v6, v2
    //         mul-float/2addr v6, v4
    //         iget v7, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityX:F
    //         mul-float/2addr v6, v7
    //         float-to-int v6, v6
    //         iput v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaX:I
    //         long-to-float v6, v2
    //         mul-float/2addr v6, v4
    //         iget v7, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityY:F
    //         mul-float/2addr v6, v7
    //         float-to-int v6, v6
    //         iput v6, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaY:I
    //         return-void
    */

    public fun getDeltaX(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaX:I
    //         return v0
    */

    public fun getDeltaY(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaY:I
    //         return v0
    */

    public fun getHorizontalDirection(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityX:F
    //         iget v1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityX:F
    //         invoke-static {v1}, Ljava/lang/Math;->abs(F)F
    //         move-result v1
    //         div-float/2addr v0, v1
    //         float-to-int v0, v0
    //         return v0
    */

    public fun getVerticalDirection(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityY:F
    //         iget v1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityY:F
    //         invoke-static {v1}, Ljava/lang/Math;->abs(F)F
    //         move-result v1
    //         div-float/2addr v0, v1
    //         float-to-int v0, v0
    //         return v0
    */

    public fun isFinished(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 6
    //         iget-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
    //         const-wide/16 v2, 0x0
    //         cmp-long v0, v0, v2
    //         if-lez v0, :cond_0
    //         invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
    //         move-result-wide v0
    //         iget-wide v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
    //         iget v4, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mEffectiveRampDown:I
    //         int-to-long v4, v4
    //         add-long/2addr v2, v4
    //         cmp-long v0, v0, v2
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun requestStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
    //         move-result-wide v0
    //         .local v0, "currentTime":J
    //         iget-wide v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J
    //         sub-long v2, v0, v2
    //         long-to-int v2, v2
    //         const/4 v3, 0x0
    //         iget v4, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mRampDownDuration:I
    //         invoke-static {v2, v3, v4}, Landroid/support/v4/widget/AutoScrollHelper;->access$800(III)I
    //         move-result v2
    //         iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mEffectiveRampDown:I
    //         invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getValueAt(J)F
    //         move-result v2
    //         iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopValue:F
    //         iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
    //         return-void
    */

    public fun setRampDownDuration(durationMillis: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mRampDownDuration:I
    //         return-void
    */

    public fun setRampUpDuration(durationMillis: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mRampUpDuration:I
    //         return-void
    */

    public fun setTargetVelocity(x: Float, y: Float) { /* TODO(body): (FF)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityX:F
    //         iput p2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mTargetVelocityY:F
    //         return-void
    */

    public fun start() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J
    //         move-result-wide v0
    //         iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J
    //         const-wide/16 v0, -0x1
    //         iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopTime:J
    //         iget-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStartTime:J
    //         iput-wide v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaTime:J
    //         const/high16 v0, 0x3f000000    # 0.5f
    //         iput v0, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mStopValue:F
    //         iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaX:I
    //         iput v2, p0, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->mDeltaY:I
    //         return-void
    */

}
