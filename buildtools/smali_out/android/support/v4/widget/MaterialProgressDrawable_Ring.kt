package android.support.v4.widget

// Auto-emitted from smali source: MaterialProgressDrawable.java.
// 23 fields, 31 methods.

open class MaterialProgressDrawable_Ring {
    private var mAlpha: Int
    private var mArrow: android.graphics.Path
    private var mArrowHeight: Int
    private val mArrowPaint: android.graphics.Paint
    private var mArrowScale: Float
    private var mArrowWidth: Int
    private var mBackgroundColor: Int
    private val mCallback: android.graphics.drawable.Drawable.Callback
    private val mCirclePaint: android.graphics.Paint
    private var mColorIndex: Int
    private var mColors: IntArray
    private var mEndTrim: Float
    private val mPaint: android.graphics.Paint
    private var mRingCenterRadius: Double
    private var mRotation: Float
    private var mShowArrow: Boolean
    private var mStartTrim: Float
    private var mStartingEndTrim: Float
    private var mStartingRotation: Float
    private var mStartingStartTrim: Float
    private var mStrokeInset: Float
    private var mStrokeWidth: Float
    private val mTempBounds: android.graphics.RectF

    public constructor(callback: android.graphics.drawable.Drawable.Callback)

    private fun drawTriangle(c: android.graphics.Canvas, startAngle: Float, sweepAngle: Float, bounds: android.graphics.Rect) { /* TODO(body): (Landroid/graphics/Canvas;FFLandroid/graphics/Rect;)V */ }
    /*
    //         .locals 8
    //         iget-boolean v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mShowArrow:Z
    //         if-eqz v3, :cond_0
    //         iget-object v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrow:Landroid/graphics/Path;
    //         if-nez v3, :cond_1
    //         new-instance v3, Landroid/graphics/Path;
    //         invoke-direct {v3}, Landroid/graphics/Path;-><init>()V
    //         iput-object v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrow:Landroid/graphics/Path;
    //         iget-object v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrow:Landroid/graphics/Path;
    //         sget-object v4, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;
    //         invoke-virtual {v3, v4}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V
    //         :goto_0
    //         iget v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStrokeInset:F
    //         float-to-int v3, v3
    //         div-int/lit8 v3, v3, 0x2
    //         int-to-float v3, v3
    //         iget v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrowScale:F
    //         mul-float v0, v3, v4
    //         .local v0, "inset":F
    //         iget-wide v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mRingCenterRadius:D
    //         const-wide/16 v6, 0x0
    //         invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D
    //         move-result-wide v6
    //         mul-double/2addr v4, v6
    //         invoke-virtual {p4}, Landroid/graphics/Rect;->exactCenterX()F
    //         move-result v3
    //         float-to-double v6, v3
    //         add-double/2addr v4, v6
    //         double-to-float v1, v4
    //         .local v1, "x":F
    //         iget-wide v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mRingCenterRadius:D
    //         const-wide/16 v6, 0x0
    //         invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D
    //         move-result-wide v6
    //         mul-double/2addr v4, v6
    //         invoke-virtual {p4}, Landroid/graphics/Rect;->exactCenterY()F
    //         move-result v3
    //         float-to-double v6, v3
    //         add-double/2addr v4, v6
    //         double-to-float v2, v4
    //         .local v2, "y":F
    //         iget-object v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrow:Landroid/graphics/Path;
    //         const/4 v4, 0x0
    //         const/4 v5, 0x0
    //         invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V
    //         iget-object v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrow:Landroid/graphics/Path;
    //         iget v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrowWidth:I
    //         int-to-float v4, v4
    //         iget v5, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrowScale:F
    //         mul-float/2addr v4, v5
    //         const/4 v5, 0x0
    //         invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V
    //         iget-object v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrow:Landroid/graphics/Path;
    //         iget v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrowWidth:I
    //         int-to-float v4, v4
    //         iget v5, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrowScale:F
    //         mul-float/2addr v4, v5
    //         const/high16 v5, 0x40000000    # 2.0f
    //         div-float/2addr v4, v5
    //         iget v5, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrowHeight:I
    //         int-to-float v5, v5
    //         iget v6, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrowScale:F
    //         mul-float/2addr v5, v6
    //         invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->lineTo(FF)V
    //         iget-object v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrow:Landroid/graphics/Path;
    //         sub-float v4, v1, v0
    //         invoke-virtual {v3, v4, v2}, Landroid/graphics/Path;->offset(FF)V
    //         iget-object v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrow:Landroid/graphics/Path;
    //         invoke-virtual {v3}, Landroid/graphics/Path;->close()V
    //         iget-object v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrowPaint:Landroid/graphics/Paint;
    //         iget-object v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mColors:[I
    //         iget v5, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mColorIndex:I
    //         aget v4, v4, v5
    //         invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V
    //         add-float v3, p2, p3
    //         const/high16 v4, 0x40a00000    # 5.0f
    //         sub-float/2addr v3, v4
    //         invoke-virtual {p4}, Landroid/graphics/Rect;->exactCenterX()F
    //         move-result v4
    //         invoke-virtual {p4}, Landroid/graphics/Rect;->exactCenterY()F
    //         move-result v5
    //         invoke-virtual {p1, v3, v4, v5}, Landroid/graphics/Canvas;->rotate(FFF)V
    //         iget-object v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrow:Landroid/graphics/Path;
    //         iget-object v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrowPaint:Landroid/graphics/Paint;
    //         invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    //         .end local v0    # "inset":F
    //         .end local v1    # "x":F
    //         .end local v2    # "y":F
    //         :cond_0
    //         return-void
    //         :cond_1
    //         iget-object v3, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrow:Landroid/graphics/Path;
    //         invoke-virtual {v3}, Landroid/graphics/Path;->reset()V
    //         goto/16 :goto_0
    */

    private fun invalidateSelf() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mCallback:Landroid/graphics/drawable/Drawable$Callback;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    //         return-void
    */

    public fun draw(c: android.graphics.Canvas, bounds: android.graphics.Rect) { /* TODO(body): (Landroid/graphics/Canvas;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 8
    //         const/high16 v5, 0x43b40000    # 360.0f
    //         iget-object v1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mTempBounds:Landroid/graphics/RectF;
    //         .local v1, "arcBounds":Landroid/graphics/RectF;
    //         invoke-virtual {v1, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStrokeInset:F
    //         iget v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStrokeInset:F
    //         invoke-virtual {v1, v0, v4}, Landroid/graphics/RectF;->inset(FF)V
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStartTrim:F
    //         iget v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mRotation:F
    //         add-float/2addr v0, v4
    //         mul-float v2, v0, v5
    //         .local v2, "startAngle":F
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mEndTrim:F
    //         iget v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mRotation:F
    //         add-float/2addr v0, v4
    //         mul-float v6, v0, v5
    //         .local v6, "endAngle":F
    //         sub-float v3, v6, v2
    //         .local v3, "sweepAngle":F
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mPaint:Landroid/graphics/Paint;
    //         iget-object v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mColors:[I
    //         iget v5, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mColorIndex:I
    //         aget v4, v4, v5
    //         invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V
    //         const/4 v4, 0x0
    //         iget-object v5, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mPaint:Landroid/graphics/Paint;
    //         move-object v0, p1
    //         invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V
    //         invoke-direct {p0, p1, v2, v3, p2}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->drawTriangle(Landroid/graphics/Canvas;FFLandroid/graphics/Rect;)V
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mAlpha:I
    //         const/16 v4, 0xff
    //         if-ge v0, v4, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mCirclePaint:Landroid/graphics/Paint;
    //         iget v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mBackgroundColor:I
    //         invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mCirclePaint:Landroid/graphics/Paint;
    //         iget v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mAlpha:I
    //         rsub-int v4, v4, 0xff
    //         invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setAlpha(I)V
    //         invoke-virtual {p2}, Landroid/graphics/Rect;->exactCenterX()F
    //         move-result v0
    //         invoke-virtual {p2}, Landroid/graphics/Rect;->exactCenterY()F
    //         move-result v4
    //         invoke-virtual {p2}, Landroid/graphics/Rect;->width()I
    //         move-result v5
    //         div-int/lit8 v5, v5, 0x2
    //         int-to-float v5, v5
    //         iget-object v7, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mCirclePaint:Landroid/graphics/Paint;
    //         invoke-virtual {p1, v0, v4, v5, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
    //         :cond_0
    //         return-void
    */

    public fun getAlpha(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mAlpha:I
    //         return v0
    */

    public fun getCenterRadius(): Double { return TODO("body: ()D") }
    /*
    //         .locals 2
    //         iget-wide v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mRingCenterRadius:D
    //         return-wide v0
    */

    public fun getEndTrim(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mEndTrim:F
    //         return v0
    */

    public fun getInsets(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStrokeInset:F
    //         return v0
    */

    public fun getRotation(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mRotation:F
    //         return v0
    */

    public fun getStartTrim(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStartTrim:F
    //         return v0
    */

    public fun getStartingEndTrim(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStartingEndTrim:F
    //         return v0
    */

    public fun getStartingRotation(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStartingRotation:F
    //         return v0
    */

    public fun getStartingStartTrim(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStartingStartTrim:F
    //         return v0
    */

    public fun getStrokeWidth(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStrokeWidth:F
    //         return v0
    */

    public fun goToNextColor() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mColorIndex:I
    //         add-int/lit8 v0, v0, 0x1
    //         iget-object v1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mColors:[I
    //         array-length v1, v1
    //         rem-int/2addr v0, v1
    //         iput v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mColorIndex:I
    //         return-void
    */

    public fun resetOriginals() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStartingStartTrim:F
    //         iput v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStartingEndTrim:F
    //         iput v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStartingRotation:F
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setStartTrim(F)V
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setEndTrim(F)V
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setRotation(F)V
    //         return-void
    */

    public fun setAlpha(alpha: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mAlpha:I
    //         return-void
    */

    public fun setArrowDimensions(width: Float, height: Float) { /* TODO(body): (FF)V */ }
    /*
    //         .locals 1
    //         float-to-int v0, p1
    //         iput v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrowWidth:I
    //         float-to-int v0, p2
    //         iput v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrowHeight:I
    //         return-void
    */

    public fun setArrowScale(scale: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrowScale:F
    //         cmpl-float v0, p1, v0
    //         if-eqz v0, :cond_0
    //         iput p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mArrowScale:F
    //         invoke-direct {p0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->invalidateSelf()V
    //         :cond_0
    //         return-void
    */

    public fun setBackgroundColor(color: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mBackgroundColor:I
    //         return-void
    */

    public fun setCenterRadius(centerRadius: Double) { /* TODO(body): (D)V */ }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mRingCenterRadius:D
    //         return-void
    */

    public fun setColorFilter(filter: android.graphics.ColorFilter) { /* TODO(body): (Landroid/graphics/ColorFilter;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mPaint:Landroid/graphics/Paint;
    //         invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
    //         invoke-direct {p0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->invalidateSelf()V
    //         return-void
    */

    public fun setColorIndex(index: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mColorIndex:I
    //         return-void
    */

    public fun setColors(colors: IntArray) { /* TODO(body): ([I)V */ }
    /*
    //         .locals 1
    //         .end param
    //         iput-object p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mColors:[I
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setColorIndex(I)V
    //         return-void
    */

    public fun setEndTrim(endTrim: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mEndTrim:F
    //         invoke-direct {p0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->invalidateSelf()V
    //         return-void
    */

    public fun setInsets(width: Int, height: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 7
    //         const/high16 v6, 0x40000000    # 2.0f
    //         invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I
    //         move-result v2
    //         int-to-float v1, v2
    //         .local v1, "minEdge":F
    //         iget-wide v2, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mRingCenterRadius:D
    //         const-wide/16 v4, 0x0
    //         cmpg-double v2, v2, v4
    //         if-lez v2, :cond_0
    //         const/4 v2, 0x0
    //         cmpg-float v2, v1, v2
    //         if-gez v2, :cond_1
    //         :cond_0
    //         iget v2, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStrokeWidth:F
    //         div-float/2addr v2, v6
    //         float-to-double v2, v2
    //         invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D
    //         move-result-wide v2
    //         double-to-float v0, v2
    //         .local v0, "insets":F
    //         :goto_0
    //         iput v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStrokeInset:F
    //         return-void
    //         .end local v0    # "insets":F
    //         :cond_1
    //         div-float v2, v1, v6
    //         float-to-double v2, v2
    //         iget-wide v4, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mRingCenterRadius:D
    //         sub-double/2addr v2, v4
    //         double-to-float v0, v2
    //         .restart local v0    # "insets":F
    //         goto :goto_0
    */

    public fun setRotation(rotation: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mRotation:F
    //         invoke-direct {p0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->invalidateSelf()V
    //         return-void
    */

    public fun setShowArrow(show: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mShowArrow:Z
    //         if-eq v0, p1, :cond_0
    //         iput-boolean p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mShowArrow:Z
    //         invoke-direct {p0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->invalidateSelf()V
    //         :cond_0
    //         return-void
    */

    public fun setStartTrim(startTrim: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStartTrim:F
    //         invoke-direct {p0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->invalidateSelf()V
    //         return-void
    */

    public fun setStrokeWidth(strokeWidth: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 1
    //         iput p1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStrokeWidth:F
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mPaint:Landroid/graphics/Paint;
    //         invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
    //         invoke-direct {p0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->invalidateSelf()V
    //         return-void
    */

    public fun storeOriginals() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStartTrim:F
    //         iput v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStartingStartTrim:F
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mEndTrim:F
    //         iput v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStartingEndTrim:F
    //         iget v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mRotation:F
    //         iput v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->mStartingRotation:F
    //         return-void
    */

}
