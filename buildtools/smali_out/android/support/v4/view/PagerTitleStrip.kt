package android.support.v4.view

// Auto-emitted from smali source: PagerTitleStrip.java.
// 20 fields, 20 methods.

open class PagerTitleStrip: android.view.ViewGroup(), android.support.v4.view.ViewPager.Decor {
    var mCurrText: android.widget.TextView
    private var mGravity: Int
    private var mLastKnownCurrentPage: Int
    private var mLastKnownPositionOffset: Float
    var mNextText: android.widget.TextView
    private var mNonPrimaryAlpha: Int
    private val mPageListener: android.support.v4.view.PagerTitleStrip.PageListener
    var mPager: android.support.v4.view.ViewPager
    var mPrevText: android.widget.TextView
    private var mScaledTextSpacing: Int
    var mTextColor: Int
    private var mUpdatingPositions: Boolean
    private var mUpdatingText: Boolean
    private var mWatchingAdapter: java.lang.ref.WeakReference

    public constructor(context: android.content.Context)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet)

    fun getMinHeight(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         .local v1, "minHeight":I
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getBackground()Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         .local v0, "bg":Landroid/graphics/drawable/Drawable;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
    //         move-result v1
    //         :cond_0
    //         return v1
    */

    public fun getTextSpacing(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
    //         return v0
    */

    protected fun onAttachedToWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getParent()Landroid/view/ViewParent;
    //         move-result-object v2
    //         .local v2, "parent":Landroid/view/ViewParent;
    //         instance-of v3, v2, Landroid/support/v4/view/ViewPager;
    //         if-nez v3, :cond_0
    //         new-instance v3, Ljava/lang/IllegalStateException;
    //         const-string v4, "PagerTitleStrip must be a direct child of a ViewPager."
    //         invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v3
    //         :cond_0
    //         move-object v1, v2
    //         check-cast v1, Landroid/support/v4/view/ViewPager;
    //         .local v1, "pager":Landroid/support/v4/view/ViewPager;
    //         invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;
    //         move-result-object v0
    //         .local v0, "adapter":Landroid/support/v4/view/PagerAdapter;
    //         iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
    //         invoke-virtual {v1, v3}, Landroid/support/v4/view/ViewPager;->setInternalPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;
    //         iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
    //         invoke-virtual {v1, v3}, Landroid/support/v4/view/ViewPager;->setOnAdapterChangeListener(Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;)V
    //         iput-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;
    //         if-eqz v3, :cond_1
    //         iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, Landroid/support/v4/view/PagerAdapter;
    //         :goto_0
    //         invoke-virtual {p0, v3, v0}, Landroid/support/v4/view/PagerTitleStrip;->updateAdapter(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
    //         return-void
    //         :cond_1
    //         const/4 v3, 0x0
    //         goto :goto_0
    */

    protected fun onDetachedFromWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;
    //         move-result-object v0
    //         invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/PagerTitleStrip;->updateAdapter(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setInternalPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnAdapterChangeListener(Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;)V
    //         iput-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         :cond_0
    //         return-void
    */

    protected fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) { /* TODO(body): (ZIIII)V */ }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         if-eqz v1, :cond_1
    //         iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
    //         cmpl-float v1, v1, v0
    //         if-ltz v1, :cond_0
    //         iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
    //         .local v0, "offset":F
    //         :cond_0
    //         iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
    //         const/4 v2, 0x1
    //         invoke-virtual {p0, v1, v0, v2}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V
    //         .end local v0    # "offset":F
    //         :cond_1
    //         return-void
    */

    protected fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 12
    //         invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
    //         move-result v8
    //         .local v8, "widthMode":I
    //         invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
    //         move-result v3
    //         .local v3, "heightMode":I
    //         invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
    //         move-result v9
    //         .local v9, "widthSize":I
    //         invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
    //         move-result v4
    //         .local v4, "heightSize":I
    //         const/high16 v10, 0x40000000    # 2.0f
    //         if-eq v8, v10, :cond_0
    //         new-instance v10, Ljava/lang/IllegalStateException;
    //         const-string v11, "Must measure with an exact width"
    //         invoke-direct {v10, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v10
    //         :cond_0
    //         move v0, v4
    //         .local v0, "childHeight":I
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getMinHeight()I
    //         move-result v5
    //         .local v5, "minHeight":I
    //         const/4 v6, 0x0
    //         .local v6, "padding":I
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I
    //         move-result v10
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I
    //         move-result v11
    //         add-int v6, v10, v11
    //         sub-int/2addr v0, v6
    //         int-to-float v10, v9
    //         const v11, 0x3f4ccccd    # 0.8f
    //         mul-float/2addr v10, v11
    //         float-to-int v10, v10
    //         const/high16 v11, -0x80000000
    //         invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result v2
    //         .local v2, "childWidthSpec":I
    //         const/high16 v10, -0x80000000
    //         invoke-static {v0, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result v1
    //         .local v1, "childHeightSpec":I
    //         iget-object v10, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
    //         invoke-virtual {v10, v2, v1}, Landroid/widget/TextView;->measure(II)V
    //         iget-object v10, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
    //         invoke-virtual {v10, v2, v1}, Landroid/widget/TextView;->measure(II)V
    //         iget-object v10, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
    //         invoke-virtual {v10, v2, v1}, Landroid/widget/TextView;->measure(II)V
    //         const/high16 v10, 0x40000000    # 2.0f
    //         if-ne v3, v10, :cond_1
    //         invoke-virtual {p0, v9, v4}, Landroid/support/v4/view/PagerTitleStrip;->setMeasuredDimension(II)V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v10, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
    //         invoke-virtual {v10}, Landroid/widget/TextView;->getMeasuredHeight()I
    //         move-result v7
    //         .local v7, "textHeight":I
    //         add-int v10, v7, v6
    //         invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I
    //         move-result v10
    //         invoke-virtual {p0, v9, v10}, Landroid/support/v4/view/PagerTitleStrip;->setMeasuredDimension(II)V
    //         goto :goto_0
    */

    public fun requestLayout() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingText:Z
    //         if-nez v0, :cond_0
    //         invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V
    //         :cond_0
    //         return-void
    */

    public fun setGravity(gravity: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mGravity:I
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V
    //         return-void
    */

    public fun setNonPrimaryAlpha(alpha: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 4
    //         const/high16 v1, 0x437f0000    # 255.0f
    //         mul-float/2addr v1, p1
    //         float-to-int v1, v1
    //         and-int/lit16 v1, v1, 0xff
    //         iput v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNonPrimaryAlpha:I
    //         iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNonPrimaryAlpha:I
    //         shl-int/lit8 v1, v1, 0x18
    //         iget v2, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I
    //         const v3, 0xffffff
    //         and-int/2addr v2, v3
    //         or-int v0, v1, v2
    //         .local v0, "transparentColor":I
    //         iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
    //         invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
    //         iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
    //         invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
    //         return-void
    */

    public fun setTextColor(color: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 4
    //         iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I
    //         iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
    //         invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V
    //         iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNonPrimaryAlpha:I
    //         shl-int/lit8 v1, v1, 0x18
    //         iget v2, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I
    //         const v3, 0xffffff
    //         and-int/2addr v2, v3
    //         or-int v0, v1, v2
    //         .local v0, "transparentColor":I
    //         iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
    //         invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
    //         iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
    //         invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
    //         return-void
    */

    public fun setTextSize(unit: Int, size: Float) { /* TODO(body): (IF)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
    //         invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
    //         invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
    //         invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V
    //         return-void
    */

    public fun setTextSpacing(spacingPixels: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V
    //         return-void
    */

    fun updateAdapter(oldAdapter: android.support.v4.view.PagerAdapter, newAdapter: android.support.v4.view.PagerAdapter) { /* TODO(body): (Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
    //         invoke-virtual {p1, v0}, Landroid/support/v4/view/PagerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;
    //         :cond_0
    //         if-eqz p2, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
    //         invoke-virtual {p2, v0}, Landroid/support/v4/view/PagerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
    //         new-instance v0, Ljava/lang/ref/WeakReference;
    //         invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
    //         iput-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         if-eqz v0, :cond_2
    //         const/4 v0, -0x1
    //         iput v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
    //         const/high16 v0, -0x40800000    # -1.0f
    //         iput v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
    //         iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
    //         move-result v0
    //         invoke-virtual {p0, v0, p2}, Landroid/support/v4/view/PagerTitleStrip;->updateText(ILandroid/support/v4/view/PagerAdapter;)V
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V
    //         :cond_2
    //         return-void
    */

    fun updateText(currentItem: Int, adapter: android.support.v4.view.PagerAdapter) { /* TODO(body): (ILandroid/support/v4/view/PagerAdapter;)V */ }
    /*
    //         .locals 10
    //         const/4 v7, 0x1
    //         const/high16 v9, -0x80000000
    //         const/4 v6, 0x0
    //         if-eqz p2, :cond_3
    //         invoke-virtual {p2}, Landroid/support/v4/view/PagerAdapter;->getCount()I
    //         move-result v3
    //         .local v3, "itemCount":I
    //         :goto_0
    //         iput-boolean v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingText:Z
    //         const/4 v4, 0x0
    //         .local v4, "text":Ljava/lang/CharSequence;
    //         if-lt p1, v7, :cond_0
    //         if-eqz p2, :cond_0
    //         add-int/lit8 v7, p1, -0x1
    //         invoke-virtual {p2, v7}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;
    //         move-result-object v4
    //         :cond_0
    //         iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
    //         invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         iget-object v8, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
    //         if-eqz p2, :cond_4
    //         if-ge p1, v3, :cond_4
    //         invoke-virtual {p2, p1}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;
    //         move-result-object v7
    //         :goto_1
    //         invoke-virtual {v8, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         const/4 v4, 0x0
    //         add-int/lit8 v7, p1, 0x1
    //         if-ge v7, v3, :cond_1
    //         if-eqz p2, :cond_1
    //         add-int/lit8 v7, p1, 0x1
    //         invoke-virtual {p2, v7}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;
    //         move-result-object v4
    //         :cond_1
    //         iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
    //         invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getWidth()I
    //         move-result v7
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingLeft()I
    //         move-result v8
    //         sub-int/2addr v7, v8
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingRight()I
    //         move-result v8
    //         sub-int v5, v7, v8
    //         .local v5, "width":I
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getHeight()I
    //         move-result v7
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I
    //         move-result v8
    //         sub-int/2addr v7, v8
    //         invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I
    //         move-result v8
    //         sub-int v0, v7, v8
    //         .local v0, "childHeight":I
    //         int-to-float v7, v5
    //         const v8, 0x3f4ccccd    # 0.8f
    //         mul-float/2addr v7, v8
    //         float-to-int v7, v7
    //         invoke-static {v7, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result v2
    //         .local v2, "childWidthSpec":I
    //         invoke-static {v0, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result v1
    //         .local v1, "childHeightSpec":I
    //         iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
    //         invoke-virtual {v7, v2, v1}, Landroid/widget/TextView;->measure(II)V
    //         iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
    //         invoke-virtual {v7, v2, v1}, Landroid/widget/TextView;->measure(II)V
    //         iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
    //         invoke-virtual {v7, v2, v1}, Landroid/widget/TextView;->measure(II)V
    //         iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
    //         iget-boolean v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingPositions:Z
    //         if-nez v7, :cond_2
    //         iget v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
    //         invoke-virtual {p0, p1, v7, v6}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V
    //         :cond_2
    //         iput-boolean v6, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingText:Z
    //         return-void
    //         .end local v0    # "childHeight":I
    //         .end local v1    # "childHeightSpec":I
    //         .end local v2    # "childWidthSpec":I
    //         .end local v3    # "itemCount":I
    //         .end local v4    # "text":Ljava/lang/CharSequence;
    //         .end local v5    # "width":I
    //         :cond_3
    //         move v3, v6
    //         goto :goto_0
    //         .restart local v3    # "itemCount":I
    //         .restart local v4    # "text":Ljava/lang/CharSequence;
    //         :cond_4
    //         const/4 v7, 0x0
    //         goto :goto_1
    */

    fun updateTextPositions(position: Int, positionOffset: Float, force: Boolean) { /* TODO(body): (IFZ)V */ }
    /*
    //         .locals 45
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
    //         move/from16 v42, v0
    //         move/from16 v0, p1
    //         move/from16 v1, v42
    //         if-eq v0, v1, :cond_2
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
    //         move-object/from16 v42, v0
    //         invoke-virtual/range {v42 .. v42}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;
    //         move-result-object v42
    //         move-object/from16 v0, p0
    //         move/from16 v1, p1
    //         move-object/from16 v2, v42
    //         invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/PagerTitleStrip;->updateText(ILandroid/support/v4/view/PagerAdapter;)V
    //         :cond_0
    //         const/16 v42, 0x1
    //         move/from16 v0, v42
    //         move-object/from16 v1, p0
    //         iput-boolean v0, v1, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingPositions:Z
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
    //         move-object/from16 v42, v0
    //         invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredWidth()I
    //         move-result v36
    //         .local v36, "prevWidth":I
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
    //         move-object/from16 v42, v0
    //         invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredWidth()I
    //         move-result v18
    //         .local v18, "currWidth":I
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
    //         move-object/from16 v42, v0
    //         invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredWidth()I
    //         move-result v26
    //         .local v26, "nextWidth":I
    //         div-int/lit8 v19, v18, 0x2
    //         .local v19, "halfCurrWidth":I
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getWidth()I
    //         move-result v38
    //         .local v38, "stripWidth":I
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getHeight()I
    //         move-result v37
    //         .local v37, "stripHeight":I
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingLeft()I
    //         move-result v29
    //         .local v29, "paddingLeft":I
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingRight()I
    //         move-result v30
    //         .local v30, "paddingRight":I
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I
    //         move-result v31
    //         .local v31, "paddingTop":I
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I
    //         move-result v28
    //         .local v28, "paddingBottom":I
    //         add-int v39, v29, v19
    //         .local v39, "textPaddedLeft":I
    //         add-int v40, v30, v19
    //         .local v40, "textPaddedRight":I
    //         sub-int v42, v38, v39
    //         sub-int v10, v42, v40
    //         .local v10, "contentWidth":I
    //         const/high16 v42, 0x3f000000    # 0.5f
    //         add-float v14, p2, v42
    //         .local v14, "currOffset":F
    //         const/high16 v42, 0x3f800000    # 1.0f
    //         cmpl-float v42, v14, v42
    //         if-lez v42, :cond_1
    //         const/high16 v42, 0x3f800000    # 1.0f
    //         sub-float v14, v14, v42
    //         :cond_1
    //         sub-int v42, v38, v40
    //         int-to-float v0, v10
    //         move/from16 v43, v0
    //         mul-float v43, v43, v14
    //         move/from16 v0, v43
    //         float-to-int v0, v0
    //         move/from16 v43, v0
    //         sub-int v12, v42, v43
    //         .local v12, "currCenter":I
    //         div-int/lit8 v42, v18, 0x2
    //         sub-int v13, v12, v42
    //         .local v13, "currLeft":I
    //         add-int v15, v13, v18
    //         .local v15, "currRight":I
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
    //         move-object/from16 v42, v0
    //         invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getBaseline()I
    //         move-result v32
    //         .local v32, "prevBaseline":I
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
    //         move-object/from16 v42, v0
    //         invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getBaseline()I
    //         move-result v11
    //         .local v11, "currBaseline":I
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
    //         move-object/from16 v42, v0
    //         invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getBaseline()I
    //         move-result v22
    //         .local v22, "nextBaseline":I
    //         move/from16 v0, v32
    //         invoke-static {v0, v11}, Ljava/lang/Math;->max(II)I
    //         move-result v42
    //         move/from16 v0, v42
    //         move/from16 v1, v22
    //         invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
    //         move-result v20
    //         .local v20, "maxBaseline":I
    //         sub-int v35, v20, v32
    //         .local v35, "prevTopOffset":I
    //         sub-int v17, v20, v11
    //         .local v17, "currTopOffset":I
    //         sub-int v25, v20, v22
    //         .local v25, "nextTopOffset":I
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
    //         move-object/from16 v42, v0
    //         invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredHeight()I
    //         move-result v42
    //         add-int v7, v35, v42
    //         .local v7, "alignedPrevHeight":I
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
    //         move-object/from16 v42, v0
    //         invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredHeight()I
    //         move-result v42
    //         add-int v5, v17, v42
    //         .local v5, "alignedCurrHeight":I
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
    //         move-object/from16 v42, v0
    //         invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredHeight()I
    //         move-result v42
    //         add-int v6, v25, v42
    //         .local v6, "alignedNextHeight":I
    //         invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I
    //         move-result v42
    //         move/from16 v0, v42
    //         invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I
    //         move-result v21
    //         .local v21, "maxTextHeight":I
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mGravity:I
    //         move/from16 v42, v0
    //         and-int/lit8 v41, v42, 0x70
    //         .local v41, "vgrav":I
    //         sparse-switch v41, :sswitch_data_0
    //         add-int v34, v31, v35
    //         .local v34, "prevTop":I
    //         add-int v16, v31, v17
    //         .local v16, "currTop":I
    //         add-int v24, v31, v25
    //         .local v24, "nextTop":I
    //         :goto_0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
    //         move-object/from16 v42, v0
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
    //         move-object/from16 v43, v0
    //         invoke-virtual/range {v43 .. v43}, Landroid/widget/TextView;->getMeasuredHeight()I
    //         move-result v43
    //         add-int v43, v43, v16
    //         move-object/from16 v0, v42
    //         move/from16 v1, v16
    //         move/from16 v2, v43
    //         invoke-virtual {v0, v13, v1, v15, v2}, Landroid/widget/TextView;->layout(IIII)V
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
    //         move/from16 v42, v0
    //         sub-int v42, v13, v42
    //         sub-int v42, v42, v36
    //         move/from16 v0, v29
    //         move/from16 v1, v42
    //         invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
    //         move-result v33
    //         .local v33, "prevLeft":I
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
    //         move-object/from16 v42, v0
    //         add-int v43, v33, v36
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
    //         move-object/from16 v44, v0
    //         invoke-virtual/range {v44 .. v44}, Landroid/widget/TextView;->getMeasuredHeight()I
    //         move-result v44
    //         add-int v44, v44, v34
    //         move-object/from16 v0, v42
    //         move/from16 v1, v33
    //         move/from16 v2, v34
    //         move/from16 v3, v43
    //         move/from16 v4, v44
    //         invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->layout(IIII)V
    //         sub-int v42, v38, v30
    //         sub-int v42, v42, v26
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
    //         move/from16 v43, v0
    //         add-int v43, v43, v15
    //         invoke-static/range {v42 .. v43}, Ljava/lang/Math;->max(II)I
    //         move-result v23
    //         .local v23, "nextLeft":I
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
    //         move-object/from16 v42, v0
    //         add-int v43, v23, v26
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
    //         move-object/from16 v44, v0
    //         invoke-virtual/range {v44 .. v44}, Landroid/widget/TextView;->getMeasuredHeight()I
    //         move-result v44
    //         add-int v44, v44, v24
    //         move-object/from16 v0, v42
    //         move/from16 v1, v23
    //         move/from16 v2, v24
    //         move/from16 v3, v43
    //         move/from16 v4, v44
    //         invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->layout(IIII)V
    //         move/from16 v0, p2
    //         move-object/from16 v1, p0
    //         iput v0, v1, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
    //         const/16 v42, 0x0
    //         move/from16 v0, v42
    //         move-object/from16 v1, p0
    //         iput-boolean v0, v1, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingPositions:Z
    //         .end local v5    # "alignedCurrHeight":I
    //         .end local v6    # "alignedNextHeight":I
    //         .end local v7    # "alignedPrevHeight":I
    //         .end local v10    # "contentWidth":I
    //         .end local v11    # "currBaseline":I
    //         .end local v12    # "currCenter":I
    //         .end local v13    # "currLeft":I
    //         .end local v14    # "currOffset":F
    //         .end local v15    # "currRight":I
    //         .end local v16    # "currTop":I
    //         .end local v17    # "currTopOffset":I
    //         .end local v18    # "currWidth":I
    //         .end local v19    # "halfCurrWidth":I
    //         .end local v20    # "maxBaseline":I
    //         .end local v21    # "maxTextHeight":I
    //         .end local v22    # "nextBaseline":I
    //         .end local v23    # "nextLeft":I
    //         .end local v24    # "nextTop":I
    //         .end local v25    # "nextTopOffset":I
    //         .end local v26    # "nextWidth":I
    //         .end local v28    # "paddingBottom":I
    //         .end local v29    # "paddingLeft":I
    //         .end local v30    # "paddingRight":I
    //         .end local v31    # "paddingTop":I
    //         .end local v32    # "prevBaseline":I
    //         .end local v33    # "prevLeft":I
    //         .end local v34    # "prevTop":I
    //         .end local v35    # "prevTopOffset":I
    //         .end local v36    # "prevWidth":I
    //         .end local v37    # "stripHeight":I
    //         .end local v38    # "stripWidth":I
    //         .end local v39    # "textPaddedLeft":I
    //         .end local v40    # "textPaddedRight":I
    //         .end local v41    # "vgrav":I
    //         :goto_1
    //         return-void
    //         :cond_2
    //         if-nez p3, :cond_0
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
    //         move/from16 v42, v0
    //         cmpl-float v42, p2, v42
    //         if-nez v42, :cond_0
    //         goto :goto_1
    //         .restart local v5    # "alignedCurrHeight":I
    //         .restart local v6    # "alignedNextHeight":I
    //         .restart local v7    # "alignedPrevHeight":I
    //         .restart local v10    # "contentWidth":I
    //         .restart local v11    # "currBaseline":I
    //         .restart local v12    # "currCenter":I
    //         .restart local v13    # "currLeft":I
    //         .restart local v14    # "currOffset":F
    //         .restart local v15    # "currRight":I
    //         .restart local v17    # "currTopOffset":I
    //         .restart local v18    # "currWidth":I
    //         .restart local v19    # "halfCurrWidth":I
    //         .restart local v20    # "maxBaseline":I
    //         .restart local v21    # "maxTextHeight":I
    //         .restart local v22    # "nextBaseline":I
    //         .restart local v25    # "nextTopOffset":I
    //         .restart local v26    # "nextWidth":I
    //         .restart local v28    # "paddingBottom":I
    //         .restart local v29    # "paddingLeft":I
    //         .restart local v30    # "paddingRight":I
    //         .restart local v31    # "paddingTop":I
    //         .restart local v32    # "prevBaseline":I
    //         .restart local v35    # "prevTopOffset":I
    //         .restart local v36    # "prevWidth":I
    //         .restart local v37    # "stripHeight":I
    //         .restart local v38    # "stripWidth":I
    //         .restart local v39    # "textPaddedLeft":I
    //         .restart local v40    # "textPaddedRight":I
    //         .restart local v41    # "vgrav":I
    //         :sswitch_0
    //         sub-int v42, v37, v31
    //         sub-int v27, v42, v28
    //         .local v27, "paddedHeight":I
    //         sub-int v42, v27, v21
    //         div-int/lit8 v9, v42, 0x2
    //         .local v9, "centeredTop":I
    //         add-int v34, v9, v35
    //         .restart local v34    # "prevTop":I
    //         add-int v16, v9, v17
    //         .restart local v16    # "currTop":I
    //         add-int v24, v9, v25
    //         .restart local v24    # "nextTop":I
    //         goto/16 :goto_0
    //         .end local v9    # "centeredTop":I
    //         .end local v16    # "currTop":I
    //         .end local v24    # "nextTop":I
    //         .end local v27    # "paddedHeight":I
    //         .end local v34    # "prevTop":I
    //         :sswitch_1
    //         sub-int v42, v37, v28
    //         sub-int v8, v42, v21
    //         .local v8, "bottomGravTop":I
    //         add-int v34, v8, v35
    //         .restart local v34    # "prevTop":I
    //         add-int v16, v8, v17
    //         .restart local v16    # "currTop":I
    //         add-int v24, v8, v25
    //         .restart local v24    # "nextTop":I
    //         goto/16 :goto_0
    //         nop
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x10 -> :sswitch_0
    //             0x50 -> :sswitch_1
    //         .end sparse-switch
    */

    companion object {
    private val ATTRS: IntArray = null!!
    private val IMPL: android.support.v4.view.PagerTitleStrip.PagerTitleStripImpl = null!!
    private val SIDE_ALPHA: Float = 0.0f
    private val TAG: String = "PagerTitleStrip"
    private val TEXT_ATTRS: IntArray = null!!
    private val TEXT_SPACING: Int = 0x10

    private @JvmStatic fun setSingleLineAllCaps(text: android.widget.TextView) { /* TODO(body): (Landroid/widget/TextView;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/PagerTitleStrip;->IMPL:Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;->setSingleLineAllCaps(Landroid/widget/TextView;)V
    //         return-void
    */

    }
}
