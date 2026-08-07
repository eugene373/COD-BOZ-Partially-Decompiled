package android.support.v4.widget

// Auto-emitted from smali source: MaterialProgressDrawable.java.
// 32 fields, 29 methods.

open class MaterialProgressDrawable: android.graphics.drawable.Drawable(), android.graphics.drawable.Animatable {
    private val COLORS: IntArray
    private var mAnimation: android.view.animation.Animation
    private val mAnimators: java.util.ArrayList
    private val mCallback: android.graphics.drawable.Drawable.Callback
    var mFinishing: Boolean
    private var mHeight: Double
    private var mParent: android.view.View
    private var mResources: android.content.res.Resources
    private val mRing: android.support.v4.widget.MaterialProgressDrawable.Ring
    private var mRotation: Float
    private var mRotationCount: Float
    private var mWidth: Double

    public constructor(context: android.content.Context, parent: android.view.View)

    private fun applyFinishTranslation(interpolatedTime: Float, ring: android.support.v4.widget.MaterialProgressDrawable.Ring) { /* TODO(body): (FLandroid/support/v4/widget/MaterialProgressDrawable$Ring;)V */ }
    /*
    //         .locals 8
    //         invoke-virtual {p2}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getStartingRotation()F
    //         move-result v3
    //         const v4, 0x3f4ccccd    # 0.8f
    //         div-float/2addr v3, v4
    //         float-to-double v4, v3
    //         invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D
    //         move-result-wide v4
    //         const-wide/high16 v6, 0x3ff0000000000000L    # 1.0
    //         add-double/2addr v4, v6
    //         double-to-float v2, v4
    //         .local v2, "targetRotation":F
    //         invoke-virtual {p2}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getStartingStartTrim()F
    //         move-result v3
    //         invoke-virtual {p2}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getStartingEndTrim()F
    //         move-result v4
    //         invoke-virtual {p2}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getStartingStartTrim()F
    //         move-result v5
    //         sub-float/2addr v4, v5
    //         mul-float/2addr v4, p1
    //         add-float v1, v3, v4
    //         .local v1, "startTrim":F
    //         invoke-virtual {p2, v1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setStartTrim(F)V
    //         invoke-virtual {p2}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getStartingRotation()F
    //         move-result v3
    //         invoke-virtual {p2}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getStartingRotation()F
    //         move-result v4
    //         sub-float v4, v2, v4
    //         mul-float/2addr v4, p1
    //         add-float v0, v3, v4
    //         .local v0, "rotation":F
    //         invoke-virtual {p2, v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setRotation(F)V
    //         return-void
    */

    private fun getRotation(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRotation:F
    //         return v0
    */

    private fun setSizeParameters(progressCircleWidth: Double, progressCircleHeight: Double, centerRadius: Double, strokeWidth: Double, arrowWidth: Float, arrowHeight: Float) { /* TODO(body): (DDDDFF)V */ }
    /*
    //         .locals 7
    //         iget-object v1, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         .local v1, "ring":Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         iget-object v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mResources:Landroid/content/res/Resources;
    //         invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
    //         move-result-object v0
    //         .local v0, "metrics":Landroid/util/DisplayMetrics;
    //         iget v2, v0, Landroid/util/DisplayMetrics;->density:F
    //         .local v2, "screenDensity":F
    //         float-to-double v4, v2
    //         mul-double/2addr v4, p1
    //         iput-wide v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mWidth:D
    //         float-to-double v4, v2
    //         mul-double/2addr v4, p3
    //         iput-wide v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mHeight:D
    //         double-to-float v3, p7
    //         mul-float/2addr v3, v2
    //         invoke-virtual {v1, v3}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setStrokeWidth(F)V
    //         float-to-double v4, v2
    //         mul-double/2addr v4, p5
    //         invoke-virtual {v1, v4, v5}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setCenterRadius(D)V
    //         const/4 v3, 0x0
    //         invoke-virtual {v1, v3}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setColorIndex(I)V
    //         mul-float v3, p9, v2
    //         mul-float v4, p10, v2
    //         invoke-virtual {v1, v3, v4}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setArrowDimensions(FF)V
    //         iget-wide v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mWidth:D
    //         double-to-int v3, v4
    //         iget-wide v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mHeight:D
    //         double-to-int v4, v4
    //         invoke-virtual {v1, v3, v4}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setInsets(II)V
    //         return-void
    */

    private fun setupAnimators() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v1, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         .local v1, "ring":Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         new-instance v0, Landroid/support/v4/widget/MaterialProgressDrawable$1;
    //         invoke-direct {v0, p0, v1}, Landroid/support/v4/widget/MaterialProgressDrawable$1;-><init>(Landroid/support/v4/widget/MaterialProgressDrawable;Landroid/support/v4/widget/MaterialProgressDrawable$Ring;)V
    //         .local v0, "animation":Landroid/view/animation/Animation;
    //         const/4 v2, -0x1
    //         invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setRepeatCount(I)V
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setRepeatMode(I)V
    //         sget-object v2, Landroid/support/v4/widget/MaterialProgressDrawable;->LINEAR_INTERPOLATOR:Landroid/view/animation/Interpolator;
    //         invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
    //         new-instance v2, Landroid/support/v4/widget/MaterialProgressDrawable$2;
    //         invoke-direct {v2, p0, v1}, Landroid/support/v4/widget/MaterialProgressDrawable$2;-><init>(Landroid/support/v4/widget/MaterialProgressDrawable;Landroid/support/v4/widget/MaterialProgressDrawable$Ring;)V
    //         invoke-virtual {v0, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
    //         iput-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mAnimation:Landroid/view/animation/Animation;
    //         return-void
    */

    public fun draw(c: android.graphics.Canvas) { /* TODO(body): (Landroid/graphics/Canvas;)V */ }
    /*
    //         .locals 5
    //         invoke-virtual {p0}, Landroid/support/v4/widget/MaterialProgressDrawable;->getBounds()Landroid/graphics/Rect;
    //         move-result-object v0
    //         .local v0, "bounds":Landroid/graphics/Rect;
    //         invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
    //         move-result v1
    //         .local v1, "saveCount":I
    //         iget v2, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRotation:F
    //         invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F
    //         move-result v3
    //         invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F
    //         move-result v4
    //         invoke-virtual {p1, v2, v3, v4}, Landroid/graphics/Canvas;->rotate(FFF)V
    //         iget-object v2, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v2, p1, v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->draw(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
    //         invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V
    //         return-void
    */

    public fun getAlpha(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getAlpha()I
    //         move-result v0
    //         return v0
    */

    public fun getIntrinsicHeight(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mHeight:D
    //         double-to-int v0, v0
    //         return v0
    */

    public fun getIntrinsicWidth(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mWidth:D
    //         double-to-int v0, v0
    //         return v0
    */

    public fun getOpacity(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, -0x3
    //         return v0
    */

    public fun isRunning(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 5
    //         iget-object v2, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mAnimators:Ljava/util/ArrayList;
    //         .local v2, "animators":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/animation/Animation;>;"
    //         invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
    //         move-result v0
    //         .local v0, "N":I
    //         const/4 v3, 0x0
    //         .local v3, "i":I
    //         :goto_0
    //         if-ge v3, v0, :cond_1
    //         invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Landroid/view/animation/Animation;
    //         .local v1, "animator":Landroid/view/animation/Animation;
    //         invoke-virtual {v1}, Landroid/view/animation/Animation;->hasStarted()Z
    //         move-result v4
    //         if-eqz v4, :cond_0
    //         invoke-virtual {v1}, Landroid/view/animation/Animation;->hasEnded()Z
    //         move-result v4
    //         if-nez v4, :cond_0
    //         const/4 v4, 0x1
    //         .end local v1    # "animator":Landroid/view/animation/Animation;
    //         :goto_1
    //         return v4
    //         .restart local v1    # "animator":Landroid/view/animation/Animation;
    //         :cond_0
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_0
    //         .end local v1    # "animator":Landroid/view/animation/Animation;
    //         :cond_1
    //         const/4 v4, 0x0
    //         goto :goto_1
    */

    public fun setAlpha(alpha: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setAlpha(I)V
    //         return-void
    */

    public fun setArrowScale(scale: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setArrowScale(F)V
    //         return-void
    */

    public fun setBackgroundColor(color: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setBackgroundColor(I)V
    //         return-void
    */

    public fun setColorFilter(colorFilter: android.graphics.ColorFilter) { /* TODO(body): (Landroid/graphics/ColorFilter;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setColorFilter(Landroid/graphics/ColorFilter;)V
    //         return-void
    */

    public fun setColorSchemeColors(colors: IntArray) { /* TODO(body): ([I)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setColors([I)V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setColorIndex(I)V
    //         return-void
    */

    public fun setProgressRotation(rotation: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setRotation(F)V
    //         return-void
    */

    fun setRotation(rotation: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRotation:F
    //         invoke-virtual {p0}, Landroid/support/v4/widget/MaterialProgressDrawable;->invalidateSelf()V
    //         return-void
    */

    public fun setStartEndTrim(startAngle: Float, endAngle: Float) { /* TODO(body): (FF)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setStartTrim(F)V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0, p2}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setEndTrim(F)V
    //         return-void
    */

    public fun showArrow(show: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setShowArrow(Z)V
    //         return-void
    */

    public fun start() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mAnimation:Landroid/view/animation/Animation;
    //         invoke-virtual {v0}, Landroid/view/animation/Animation;->reset()V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->storeOriginals()V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getEndTrim()F
    //         move-result v0
    //         iget-object v1, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getStartTrim()F
    //         move-result v1
    //         cmpl-float v0, v0, v1
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mFinishing:Z
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mAnimation:Landroid/view/animation/Animation;
    //         const-wide/16 v2, 0x29a
    //         invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mParent:Landroid/view/View;
    //         iget-object v1, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mAnimation:Landroid/view/animation/Animation;
    //         invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setColorIndex(I)V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->resetOriginals()V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mAnimation:Landroid/view/animation/Animation;
    //         const-wide/16 v2, 0x535
    //         invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mParent:Landroid/view/View;
    //         iget-object v1, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mAnimation:Landroid/view/animation/Animation;
    //         invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
    //         goto :goto_0
    */

    public fun stop() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mParent:Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/MaterialProgressDrawable;->setRotation(F)V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setShowArrow(Z)V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setColorIndex(I)V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable;->mRing:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->resetOriginals()V
    //         return-void
    */

    public fun updateSizes(size: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 14
    //         .end param
    //         const-wide/high16 v2, 0x404c000000000000L    # 56.0
    //         const-wide/high16 v12, 0x4044000000000000L    # 40.0
    //         if-nez p1, :cond_0
    //         const-wide/high16 v6, 0x4029000000000000L    # 12.5
    //         const-wide/high16 v8, 0x4008000000000000L    # 3.0
    //         const/high16 v10, 0x41400000    # 12.0f
    //         const/high16 v11, 0x40c00000    # 6.0f
    //         move-object v1, p0
    //         move-wide v4, v2
    //         invoke-direct/range {v1 .. v11}, Landroid/support/v4/widget/MaterialProgressDrawable;->setSizeParameters(DDDDFF)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-wide v6, 0x4021800000000000L    # 8.75
    //         const-wide/high16 v8, 0x4004000000000000L    # 2.5
    //         const/high16 v10, 0x41200000    # 10.0f
    //         const/high16 v11, 0x40a00000    # 5.0f
    //         move-object v1, p0
    //         move-wide v2, v12
    //         move-wide v4, v12
    //         invoke-direct/range {v1 .. v11}, Landroid/support/v4/widget/MaterialProgressDrawable;->setSizeParameters(DDDDFF)V
    //         goto :goto_0
    */

    companion object {
    private val ANIMATION_DURATION: Int = 0x535
    private val ARROW_HEIGHT: Int = 0x5
    private val ARROW_HEIGHT_LARGE: Int = 0x6
    private val ARROW_OFFSET_ANGLE: Float = 0.0f
    private val ARROW_WIDTH: Int = 0xa
    private val ARROW_WIDTH_LARGE: Int = 0xc
    private val CENTER_RADIUS: Float = 0.0f
    private val CENTER_RADIUS_LARGE: Float = 0.0f
    private val CIRCLE_DIAMETER: Int = 0x28
    private val CIRCLE_DIAMETER_LARGE: Int = 0x38
    val DEFAULT: Int = 0x1
    private val EASE_INTERPOLATOR: android.view.animation.Interpolator = null!!
    private val END_CURVE_INTERPOLATOR: android.view.animation.Interpolator = null!!
    val LARGE: Int = 0x0
    private val LINEAR_INTERPOLATOR: android.view.animation.Interpolator = null!!
    private val MAX_PROGRESS_ARC: Float = 0.0f
    private val NUM_POINTS: Float = 0.0f
    private val START_CURVE_INTERPOLATOR: android.view.animation.Interpolator = null!!
    private val STROKE_WIDTH: Float = 0.0f
    private val STROKE_WIDTH_LARGE: Float = 0.0f
    }
}
