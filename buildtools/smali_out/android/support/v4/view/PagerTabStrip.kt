package android.support.v4.view

// Auto-emitted from smali source: PagerTabStrip.java.
// 24 fields, 16 methods.

open class PagerTabStrip: android.support.v4.view.PagerTitleStrip() {
    private var mDrawFullUnderline: Boolean
    private var mDrawFullUnderlineSet: Boolean
    private var mFullUnderlineHeight: Int
    private var mIgnoreTap: Boolean
    private var mIndicatorColor: Int
    private var mIndicatorHeight: Int
    private var mInitialMotionX: Float
    private var mInitialMotionY: Float
    private var mMinPaddingBottom: Int
    private var mMinStripHeight: Int
    private var mMinTextSpacing: Int
    private var mTabAlpha: Int
    private var mTabPadding: Int
    private val mTabPaint: android.graphics.Paint
    private val mTempRect: android.graphics.Rect
    private var mTouchSlop: Int

    public constructor(context: android.content.Context)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet)

    public fun getDrawFullUnderline(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
    //         return v0
    */

    fun getMinHeight(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         invoke-super {p0}, Landroid/support/v4/view/PagerTitleStrip;->getMinHeight()I
    //         move-result v0
    //         iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mMinStripHeight:I
    //         invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
    //         move-result v0
    //         return v0
    */

    public fun getTabIndicatorColor(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I
    //         return v0
    */

    protected fun onDraw(canvas: android.graphics.Canvas) { /* TODO(body): (Landroid/graphics/Canvas;)V */ }
    /*
    //         .locals 12
    //         const v11, 0xffffff
    //         invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->onDraw(Landroid/graphics/Canvas;)V
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getHeight()I
    //         move-result v7
    //         .local v7, "height":I
    //         move v6, v7
    //         .local v6, "bottom":I
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
    //         invoke-virtual {v0}, Landroid/widget/TextView;->getLeft()I
    //         move-result v0
    //         iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
    //         sub-int v8, v0, v1
    //         .local v8, "left":I
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
    //         invoke-virtual {v0}, Landroid/widget/TextView;->getRight()I
    //         move-result v0
    //         iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
    //         add-int v9, v0, v1
    //         .local v9, "right":I
    //         iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorHeight:I
    //         sub-int v10, v6, v0
    //         .local v10, "top":I
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;
    //         iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabAlpha:I
    //         shl-int/lit8 v1, v1, 0x18
    //         iget v2, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I
    //         and-int/2addr v2, v11
    //         or-int/2addr v1, v2
    //         invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
    //         int-to-float v1, v8
    //         int-to-float v2, v10
    //         int-to-float v3, v9
    //         int-to-float v4, v6
    //         iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;
    //         move-object v0, p1
    //         invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
    //         iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;
    //         const/high16 v1, -0x1000000
    //         iget v2, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I
    //         and-int/2addr v2, v11
    //         or-int/2addr v1, v2
    //         invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingLeft()I
    //         move-result v0
    //         int-to-float v1, v0
    //         iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mFullUnderlineHeight:I
    //         sub-int v0, v7, v0
    //         int-to-float v2, v0
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getWidth()I
    //         move-result v0
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingRight()I
    //         move-result v3
    //         sub-int/2addr v0, v3
    //         int-to-float v3, v0
    //         int-to-float v4, v7
    //         iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;
    //         move-object v0, p1
    //         invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
    //         :cond_0
    //         return-void
    */

    public fun onTouchEvent(ev: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 6
    //         const/4 v4, 0x1
    //         const/4 v3, 0x0
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
    //         move-result v0
    //         .local v0, "action":I
    //         if-eqz v0, :cond_0
    //         iget-boolean v5, p0, Landroid/support/v4/view/PagerTabStrip;->mIgnoreTap:Z
    //         if-eqz v5, :cond_0
    //         :goto_0
    //         return v3
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
    //         move-result v1
    //         .local v1, "x":F
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
    //         move-result v2
    //         .local v2, "y":F
    //         packed-switch v0, :pswitch_data_0
    //         :cond_1
    //         :goto_1
    //         move v3, v4
    //         goto :goto_0
    //         :pswitch_0
    //         iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mInitialMotionX:F
    //         iput v2, p0, Landroid/support/v4/view/PagerTabStrip;->mInitialMotionY:F
    //         iput-boolean v3, p0, Landroid/support/v4/view/PagerTabStrip;->mIgnoreTap:Z
    //         goto :goto_1
    //         :pswitch_1
    //         iget v3, p0, Landroid/support/v4/view/PagerTabStrip;->mInitialMotionX:F
    //         sub-float v3, v1, v3
    //         invoke-static {v3}, Ljava/lang/Math;->abs(F)F
    //         move-result v3
    //         iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTouchSlop:I
    //         int-to-float v5, v5
    //         cmpl-float v3, v3, v5
    //         if-gtz v3, :cond_2
    //         iget v3, p0, Landroid/support/v4/view/PagerTabStrip;->mInitialMotionY:F
    //         sub-float v3, v2, v3
    //         invoke-static {v3}, Ljava/lang/Math;->abs(F)F
    //         move-result v3
    //         iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTouchSlop:I
    //         int-to-float v5, v5
    //         cmpl-float v3, v3, v5
    //         if-lez v3, :cond_1
    //         :cond_2
    //         iput-boolean v4, p0, Landroid/support/v4/view/PagerTabStrip;->mIgnoreTap:Z
    //         goto :goto_1
    //         :pswitch_2
    //         iget-object v3, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
    //         invoke-virtual {v3}, Landroid/widget/TextView;->getLeft()I
    //         move-result v3
    //         iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
    //         sub-int/2addr v3, v5
    //         int-to-float v3, v3
    //         cmpg-float v3, v1, v3
    //         if-gez v3, :cond_3
    //         iget-object v3, p0, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         invoke-virtual {v5}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
    //         move-result v5
    //         add-int/lit8 v5, v5, -0x1
    //         invoke-virtual {v3, v5}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V
    //         goto :goto_1
    //         :cond_3
    //         iget-object v3, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
    //         invoke-virtual {v3}, Landroid/widget/TextView;->getRight()I
    //         move-result v3
    //         iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
    //         add-int/2addr v3, v5
    //         int-to-float v3, v3
    //         cmpl-float v3, v1, v3
    //         if-lez v3, :cond_1
    //         iget-object v3, p0, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         invoke-virtual {v5}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
    //         move-result v5
    //         add-int/lit8 v5, v5, 0x1
    //         invoke-virtual {v3, v5}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V
    //         goto :goto_1
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_2
    //             :pswitch_1
    //         .end packed-switch
    */

    public fun setBackgroundColor(color: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setBackgroundColor(I)V
    //         iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z
    //         if-nez v0, :cond_0
    //         const/high16 v0, -0x1000000
    //         and-int/2addr v0, p1
    //         if-nez v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         iput-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
    //         :cond_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setBackgroundDrawable(d: android.graphics.drawable.Drawable) { /* TODO(body): (Landroid/graphics/drawable/Drawable;)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    //         iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z
    //         if-nez v0, :cond_0
    //         if-nez p1, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         iput-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
    //         :cond_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setBackgroundResource(resId: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setBackgroundResource(I)V
    //         iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z
    //         if-nez v0, :cond_0
    //         if-nez p1, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         iput-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
    //         :cond_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setDrawFullUnderline(drawFull: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iput-boolean p1, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->invalidate()V
    //         return-void
    */

    public fun setPadding(left: Int, top: Int, right: Int, bottom: Int) { /* TODO(body): (IIII)V */ }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mMinPaddingBottom:I
    //         if-ge p4, v0, :cond_0
    //         iget p4, p0, Landroid/support/v4/view/PagerTabStrip;->mMinPaddingBottom:I
    //         :cond_0
    //         invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v4/view/PagerTitleStrip;->setPadding(IIII)V
    //         return-void
    */

    public fun setTabIndicatorColor(color: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iput p1, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;
    //         iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I
    //         invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->invalidate()V
    //         return-void
    */

    public fun setTabIndicatorColorResource(resId: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/view/PagerTabStrip;->setTabIndicatorColor(I)V
    //         return-void
    */

    public fun setTextSpacing(textSpacing: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mMinTextSpacing:I
    //         if-ge p1, v0, :cond_0
    //         iget p1, p0, Landroid/support/v4/view/PagerTabStrip;->mMinTextSpacing:I
    //         :cond_0
    //         invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setTextSpacing(I)V
    //         return-void
    */

    fun updateTextPositions(position: Int, positionOffset: Float, force: Boolean) { /* TODO(body): (IFZ)V */ }
    /*
    //         .locals 7
    //         iget-object v2, p0, Landroid/support/v4/view/PagerTabStrip;->mTempRect:Landroid/graphics/Rect;
    //         .local v2, "r":Landroid/graphics/Rect;
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getHeight()I
    //         move-result v0
    //         .local v0, "bottom":I
    //         iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
    //         invoke-virtual {v5}, Landroid/widget/TextView;->getLeft()I
    //         move-result v5
    //         iget v6, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
    //         sub-int v1, v5, v6
    //         .local v1, "left":I
    //         iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
    //         invoke-virtual {v5}, Landroid/widget/TextView;->getRight()I
    //         move-result v5
    //         iget v6, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
    //         add-int v3, v5, v6
    //         .local v3, "right":I
    //         iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorHeight:I
    //         sub-int v4, v0, v5
    //         .local v4, "top":I
    //         invoke-virtual {v2, v1, v4, v3, v0}, Landroid/graphics/Rect;->set(IIII)V
    //         invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V
    //         const/high16 v5, 0x3f000000    # 0.5f
    //         sub-float v5, p2, v5
    //         invoke-static {v5}, Ljava/lang/Math;->abs(F)F
    //         move-result v5
    //         const/high16 v6, 0x40000000    # 2.0f
    //         mul-float/2addr v5, v6
    //         const/high16 v6, 0x437f0000    # 255.0f
    //         mul-float/2addr v5, v6
    //         float-to-int v5, v5
    //         iput v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabAlpha:I
    //         iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
    //         invoke-virtual {v5}, Landroid/widget/TextView;->getLeft()I
    //         move-result v5
    //         iget v6, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
    //         sub-int v1, v5, v6
    //         iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
    //         invoke-virtual {v5}, Landroid/widget/TextView;->getRight()I
    //         move-result v5
    //         iget v6, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
    //         add-int v3, v5, v6
    //         invoke-virtual {v2, v1, v4, v3, v0}, Landroid/graphics/Rect;->union(IIII)V
    //         invoke-virtual {p0, v2}, Landroid/support/v4/view/PagerTabStrip;->invalidate(Landroid/graphics/Rect;)V
    //         return-void
    */

    companion object {
    private val FULL_UNDERLINE_HEIGHT: Int = 0x1
    private val INDICATOR_HEIGHT: Int = 0x3
    private val MIN_PADDING_BOTTOM: Int = 0x6
    private val MIN_STRIP_HEIGHT: Int = 0x20
    private val MIN_TEXT_SPACING: Int = 0x40
    private val TAB_PADDING: Int = 0x10
    private val TAB_SPACING: Int = 0x20
    private val TAG: String = "PagerTabStrip"
    }
}
