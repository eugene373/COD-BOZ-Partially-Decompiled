package android.support.v4.widget

// Auto-emitted from smali source: DrawerLayout.java.
// 43 fields, 74 methods.

open class DrawerLayout: android.view.ViewGroup(), android.support.v4.widget.DrawerLayoutImpl {
    private val mChildAccessibilityDelegate: android.support.v4.widget.DrawerLayout.ChildAccessibilityDelegate
    private var mChildrenCanceledTouch: Boolean
    private var mDisallowInterceptRequested: Boolean
    private var mDrawStatusBarBackground: Boolean
    private var mDrawerState: Int
    private var mFirstLayout: Boolean
    private var mInLayout: Boolean
    private var mInitialMotionX: Float
    private var mInitialMotionY: Float
    private var mLastInsets: Object
    private val mLeftCallback: android.support.v4.widget.DrawerLayout.ViewDragCallback
    private val mLeftDragger: android.support.v4.widget.ViewDragHelper
    private var mListener: android.support.v4.widget.DrawerLayout.DrawerListener
    private var mLockModeLeft: Int
    private var mLockModeRight: Int
    private var mMinDrawerMargin: Int
    private val mRightCallback: android.support.v4.widget.DrawerLayout.ViewDragCallback
    private val mRightDragger: android.support.v4.widget.ViewDragHelper
    private var mScrimColor: Int
    private var mScrimOpacity: Float
    private var mScrimPaint: android.graphics.Paint
    private var mShadowLeft: android.graphics.drawable.Drawable
    private var mShadowRight: android.graphics.drawable.Drawable
    private var mStatusBarBackground: android.graphics.drawable.Drawable
    private var mTitleLeft: CharSequence
    private var mTitleRight: CharSequence

    public constructor(context: android.content.Context)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet, defStyle: Int)

    private fun findVisibleDrawer(): android.view.View { return TODO("body: ()Landroid/view/View;") }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
    //         move-result v1
    //         .local v1, "childCount":I
    //         const/4 v2, 0x0
    //         .local v2, "i":I
    //         :goto_0
    //         if-ge v2, v1, :cond_1
    //         invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "child":Landroid/view/View;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerVisible(Landroid/view/View;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         .end local v0    # "child":Landroid/view/View;
    //         :goto_1
    //         return-object v0
    //         .restart local v0    # "child":Landroid/view/View;
    //         :cond_0
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_0
    //         .end local v0    # "child":Landroid/view/View;
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    private fun hasPeekingDrawer(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
    //         move-result v0
    //         .local v0, "childCount":I
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         if-ge v1, v0, :cond_1
    //         invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v3
    //         invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v2
    //         check-cast v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .local v2, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget-boolean v3, v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
    //         if-eqz v3, :cond_0
    //         const/4 v3, 0x1
    //         .end local v2    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         :goto_1
    //         return v3
    //         .restart local v2    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         :cond_0
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         .end local v2    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         :cond_1
    //         const/4 v3, 0x0
    //         goto :goto_1
    */

    private fun hasVisibleDrawer(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->findVisibleDrawer()Landroid/view/View;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun updateChildrenImportantForAccessibility(drawerView: android.view.View, isDrawerOpen: Boolean) { /* TODO(body): (Landroid/view/View;Z)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
    //         move-result v1
    //         .local v1, "childCount":I
    //         const/4 v2, 0x0
    //         .local v2, "i":I
    //         :goto_0
    //         if-ge v2, v1, :cond_3
    //         invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "child":Landroid/view/View;
    //         if-nez p2, :cond_0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
    //         move-result v3
    //         if-eqz v3, :cond_1
    //         :cond_0
    //         if-eqz p2, :cond_2
    //         if-ne v0, p1, :cond_2
    //         :cond_1
    //         const/4 v3, 0x1
    //         invoke-static {v0, v3}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
    //         :goto_1
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_0
    //         :cond_2
    //         const/4 v3, 0x4
    //         invoke-static {v0, v3}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
    //         goto :goto_1
    //         .end local v0    # "child":Landroid/view/View;
    //         :cond_3
    //         return-void
    */

    public fun addView(child: android.view.View, index: Int, params: android.view.ViewGroup.LayoutParams) { /* TODO(body): (Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V */ }
    /*
    //         .locals 2
    //         invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->findOpenDrawer()Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "openDrawer":Landroid/view/View;
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         :cond_0
    //         const/4 v1, 0x4
    //         invoke-static {p1, v1}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
    //         :goto_0
    //         sget-boolean v1, Landroid/support/v4/widget/DrawerLayout;->CAN_HIDE_DESCENDANTS:Z
    //         if-nez v1, :cond_1
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mChildAccessibilityDelegate:Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;
    //         invoke-static {p1, v1}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
    //         :cond_1
    //         return-void
    //         :cond_2
    //         const/4 v1, 0x1
    //         invoke-static {p1, v1}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
    //         goto :goto_0
    */

    fun cancelChildViewTouch() { /* TODO(body): ()V */ }
    /*
    //         .locals 11
    //         const/4 v5, 0x0
    //         iget-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
    //         if-nez v2, :cond_1
    //         invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
    //         move-result-wide v0
    //         .local v0, "now":J
    //         const/4 v4, 0x3
    //         const/4 v7, 0x0
    //         move-wide v2, v0
    //         move v6, v5
    //         invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;
    //         move-result-object v8
    //         .local v8, "cancelEvent":Landroid/view/MotionEvent;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
    //         move-result v9
    //         .local v9, "childCount":I
    //         const/4 v10, 0x0
    //         .local v10, "i":I
    //         :goto_0
    //         if-ge v10, v9, :cond_0
    //         invoke-virtual {p0, v10}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v2
    //         invoke-virtual {v2, v8}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    //         add-int/lit8 v10, v10, 0x1
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {v8}, Landroid/view/MotionEvent;->recycle()V
    //         const/4 v2, 0x1
    //         iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
    //         .end local v0    # "now":J
    //         .end local v8    # "cancelEvent":Landroid/view/MotionEvent;
    //         .end local v9    # "childCount":I
    //         .end local v10    # "i":I
    //         :cond_1
    //         return-void
    */

    fun checkDrawerViewAbsoluteGravity(drawerView: android.view.View, checkFor: Int): Boolean { return TODO("body: (Landroid/view/View;I)Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewAbsoluteGravity(Landroid/view/View;)I
    //         move-result v0
    //         .local v0, "absGravity":I
    //         and-int v1, v0, p2
    //         if-ne v1, p2, :cond_0
    //         const/4 v1, 0x1
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    protected fun checkLayoutParams(p: android.view.ViewGroup.LayoutParams): Boolean { return TODO("body: (Landroid/view/ViewGroup$LayoutParams;)Z") }
    /*
    //         .locals 1
    //         instance-of v0, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         if-eqz v0, :cond_0
    //         invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun closeDrawer(gravity: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "drawerView":Landroid/view/View;
    //         if-nez v0, :cond_0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "No drawer view found with gravity "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->gravityToString(I)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(Landroid/view/View;)V
    //         return-void
    */

    public fun closeDrawer(drawerView: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "View "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " is not a sliding drawer"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         iget-boolean v1, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
    //         if-eqz v1, :cond_1
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .local v0, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         const/4 v1, 0x0
    //         iput v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
    //         const/4 v1, 0x0
    //         iput-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
    //         .end local v0    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         :goto_0
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x3
    //         invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {p1}, Landroid/view/View;->getWidth()I
    //         move-result v2
    //         neg-int v2, v2
    //         invoke-virtual {p1}, Landroid/view/View;->getTop()I
    //         move-result v3
    //         invoke-virtual {v1, p1, v2, v3}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
    //         goto :goto_0
    //         :cond_2
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
    //         move-result v2
    //         invoke-virtual {p1}, Landroid/view/View;->getTop()I
    //         move-result v3
    //         invoke-virtual {v1, p1, v2, v3}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
    //         goto :goto_0
    */

    public fun closeDrawers() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
    //         return-void
    */

    fun closeDrawers(peekingOnly: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 9
    //         const/4 v5, 0x0
    //         .local v5, "needsInvalidate":Z
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
    //         move-result v1
    //         .local v1, "childCount":I
    //         const/4 v3, 0x0
    //         .local v3, "i":I
    //         :goto_0
    //         if-ge v3, v1, :cond_3
    //         invoke-virtual {p0, v3}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "child":Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v4
    //         check-cast v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .local v4, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
    //         move-result v6
    //         if-eqz v6, :cond_0
    //         if-eqz p1, :cond_1
    //         iget-boolean v6, v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
    //         if-nez v6, :cond_1
    //         :cond_0
    //         :goto_1
    //         add-int/lit8 v3, v3, 0x1
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {v0}, Landroid/view/View;->getWidth()I
    //         move-result v2
    //         .local v2, "childWidth":I
    //         const/4 v6, 0x3
    //         invoke-virtual {p0, v0, v6}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
    //         move-result v6
    //         if-eqz v6, :cond_2
    //         iget-object v6, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         neg-int v7, v2
    //         invoke-virtual {v0}, Landroid/view/View;->getTop()I
    //         move-result v8
    //         invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
    //         move-result v6
    //         or-int/2addr v5, v6
    //         :goto_2
    //         const/4 v6, 0x0
    //         iput-boolean v6, v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
    //         goto :goto_1
    //         :cond_2
    //         iget-object v6, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
    //         move-result v7
    //         invoke-virtual {v0}, Landroid/view/View;->getTop()I
    //         move-result v8
    //         invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
    //         move-result v6
    //         or-int/2addr v5, v6
    //         goto :goto_2
    //         .end local v0    # "child":Landroid/view/View;
    //         .end local v2    # "childWidth":I
    //         .end local v4    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         :cond_3
    //         iget-object v6, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
    //         invoke-virtual {v6}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->removeCallbacks()V
    //         iget-object v6, p0, Landroid/support/v4/widget/DrawerLayout;->mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
    //         invoke-virtual {v6}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->removeCallbacks()V
    //         if-eqz v5, :cond_4
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
    //         :cond_4
    //         return-void
    */

    public fun computeScroll() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         const/4 v6, 0x1
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
    //         move-result v0
    //         .local v0, "childCount":I
    //         const/4 v3, 0x0
    //         .local v3, "scrimOpacity":F
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         if-ge v1, v0, :cond_0
    //         invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v4
    //         invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v4
    //         check-cast v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget v2, v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
    //         .local v2, "onscreen":F
    //         invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F
    //         move-result v3
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         .end local v2    # "onscreen":F
    //         :cond_0
    //         iput v3, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimOpacity:F
    //         iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v4, v6}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z
    //         move-result v4
    //         iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v5, v6}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z
    //         move-result v5
    //         or-int/2addr v4, v5
    //         if-eqz v4, :cond_1
    //         invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
    //         :cond_1
    //         return-void
    */

    fun dispatchOnDrawerClosed(drawerView: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .local v0, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget-boolean v2, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
    //         if-eqz v2, :cond_1
    //         iput-boolean v3, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
    //         iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
    //         if-eqz v2, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
    //         invoke-interface {v2, p1}, Landroid/support/v4/widget/DrawerLayout$DrawerListener;->onDrawerClosed(Landroid/view/View;)V
    //         :cond_0
    //         invoke-direct {p0, p1, v3}, Landroid/support/v4/widget/DrawerLayout;->updateChildrenImportantForAccessibility(Landroid/view/View;Z)V
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->hasWindowFocus()Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getRootView()Landroid/view/View;
    //         move-result-object v1
    //         .local v1, "rootView":Landroid/view/View;
    //         if-eqz v1, :cond_1
    //         const/16 v2, 0x20
    //         invoke-virtual {v1, v2}, Landroid/view/View;->sendAccessibilityEvent(I)V
    //         .end local v1    # "rootView":Landroid/view/View;
    //         :cond_1
    //         return-void
    */

    fun dispatchOnDrawerOpened(drawerView: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .local v0, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
    //         if-nez v1, :cond_1
    //         iput-boolean v2, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
    //         invoke-interface {v1, p1}, Landroid/support/v4/widget/DrawerLayout$DrawerListener;->onDrawerOpened(Landroid/view/View;)V
    //         :cond_0
    //         invoke-direct {p0, p1, v2}, Landroid/support/v4/widget/DrawerLayout;->updateChildrenImportantForAccessibility(Landroid/view/View;Z)V
    //         invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z
    //         :cond_1
    //         return-void
    */

    fun dispatchOnDrawerSlide(drawerView: android.view.View, slideOffset: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
    //         invoke-interface {v0, p1, p2}, Landroid/support/v4/widget/DrawerLayout$DrawerListener;->onDrawerSlide(Landroid/view/View;F)V
    //         :cond_0
    //         return-void
    */

    protected fun drawChild(canvas: android.graphics.Canvas, child: android.view.View, drawingTime: Long): Boolean { return TODO("body: (Landroid/graphics/Canvas;Landroid/view/View;J)Z") }
    /*
    //         .locals 29
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
    //         move-result v18
    //         .local v18, "height":I
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, p2
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
    //         move-result v17
    //         .local v17, "drawingContent":Z
    //         const/4 v13, 0x0
    //         .local v13, "clipLeft":I
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
    //         move-result v14
    //         .local v14, "clipRight":I
    //         invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I
    //         move-result v21
    //         .local v21, "restoreCount":I
    //         if-eqz v17, :cond_4
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
    //         move-result v10
    //         .local v10, "childCount":I
    //         const/16 v19, 0x0
    //         .local v19, "i":I
    //         :goto_0
    //         move/from16 v0, v19
    //         if-ge v0, v10, :cond_3
    //         move-object/from16 v0, p0
    //         move/from16 v1, v19
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v25
    //         .local v25, "v":Landroid/view/View;
    //         move-object/from16 v0, v25
    //         move-object/from16 v1, p2
    //         if-eq v0, v1, :cond_0
    //         invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getVisibility()I
    //         move-result v2
    //         if-nez v2, :cond_0
    //         invoke-static/range {v25 .. v25}, Landroid/support/v4/widget/DrawerLayout;->hasOpaqueBackground(Landroid/view/View;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, v25
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getHeight()I
    //         move-result v2
    //         move/from16 v0, v18
    //         if-ge v2, v0, :cond_1
    //         :cond_0
    //         :goto_1
    //         add-int/lit8 v19, v19, 0x1
    //         goto :goto_0
    //         :cond_1
    //         const/4 v2, 0x3
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, v25
    //         invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getRight()I
    //         move-result v27
    //         .local v27, "vright":I
    //         move/from16 v0, v27
    //         if-le v0, v13, :cond_0
    //         move/from16 v13, v27
    //         goto :goto_1
    //         .end local v27    # "vright":I
    //         :cond_2
    //         invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getLeft()I
    //         move-result v26
    //         .local v26, "vleft":I
    //         move/from16 v0, v26
    //         if-ge v0, v14, :cond_0
    //         move/from16 v14, v26
    //         goto :goto_1
    //         .end local v25    # "v":Landroid/view/View;
    //         .end local v26    # "vleft":I
    //         :cond_3
    //         const/4 v2, 0x0
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
    //         move-result v3
    //         move-object/from16 v0, p1
    //         invoke-virtual {v0, v13, v2, v14, v3}, Landroid/graphics/Canvas;->clipRect(IIII)Z
    //         .end local v10    # "childCount":I
    //         .end local v19    # "i":I
    //         :cond_4
    //         invoke-super/range {p0 .. p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    //         move-result v22
    //         .local v22, "result":Z
    //         move-object/from16 v0, p1
    //         move/from16 v1, v21
    //         invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V
    //         move-object/from16 v0, p0
    //         iget v2, v0, Landroid/support/v4/widget/DrawerLayout;->mScrimOpacity:F
    //         const/4 v3, 0x0
    //         cmpl-float v2, v2, v3
    //         if-lez v2, :cond_6
    //         if-eqz v17, :cond_6
    //         move-object/from16 v0, p0
    //         iget v2, v0, Landroid/support/v4/widget/DrawerLayout;->mScrimColor:I
    //         const/high16 v3, -0x1000000
    //         and-int/2addr v2, v3
    //         ushr-int/lit8 v9, v2, 0x18
    //         .local v9, "baseAlpha":I
    //         int-to-float v2, v9
    //         move-object/from16 v0, p0
    //         iget v3, v0, Landroid/support/v4/widget/DrawerLayout;->mScrimOpacity:F
    //         mul-float/2addr v2, v3
    //         float-to-int v0, v2
    //         move/from16 v20, v0
    //         .local v20, "imag":I
    //         shl-int/lit8 v2, v20, 0x18
    //         move-object/from16 v0, p0
    //         iget v3, v0, Landroid/support/v4/widget/DrawerLayout;->mScrimColor:I
    //         const v4, 0xffffff
    //         and-int/2addr v3, v4
    //         or-int v15, v2, v3
    //         .local v15, "color":I
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mScrimPaint:Landroid/graphics/Paint;
    //         invoke-virtual {v2, v15}, Landroid/graphics/Paint;->setColor(I)V
    //         int-to-float v3, v13
    //         const/4 v4, 0x0
    //         int-to-float v5, v14
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
    //         move-result v2
    //         int-to-float v6, v2
    //         move-object/from16 v0, p0
    //         iget-object v7, v0, Landroid/support/v4/widget/DrawerLayout;->mScrimPaint:Landroid/graphics/Paint;
    //         move-object/from16 v2, p1
    //         invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
    //         .end local v9    # "baseAlpha":I
    //         .end local v15    # "color":I
    //         .end local v20    # "imag":I
    //         :cond_5
    //         :goto_2
    //         return v22
    //         :cond_6
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
    //         if-eqz v2, :cond_7
    //         const/4 v2, 0x3
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, p2
    //         invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
    //         move-result v2
    //         if-eqz v2, :cond_7
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
    //         move-result v23
    //         .local v23, "shadowWidth":I
    //         invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getRight()I
    //         move-result v12
    //         .local v12, "childRight":I
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v2}, Landroid/support/v4/widget/ViewDragHelper;->getEdgeSize()I
    //         move-result v16
    //         .local v16, "drawerPeekDistance":I
    //         const/4 v2, 0x0
    //         int-to-float v3, v12
    //         move/from16 v0, v16
    //         int-to-float v4, v0
    //         div-float/2addr v3, v4
    //         const/high16 v4, 0x3f800000    # 1.0f
    //         invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F
    //         move-result v3
    //         invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F
    //         move-result v8
    //         .local v8, "alpha":F
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTop()I
    //         move-result v3
    //         add-int v4, v12, v23
    //         invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getBottom()I
    //         move-result v5
    //         invoke-virtual {v2, v12, v3, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
    //         const/high16 v3, 0x437f0000    # 255.0f
    //         mul-float/2addr v3, v8
    //         float-to-int v3, v3
    //         invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
    //         move-object/from16 v0, p1
    //         invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    //         goto :goto_2
    //         .end local v8    # "alpha":F
    //         .end local v12    # "childRight":I
    //         .end local v16    # "drawerPeekDistance":I
    //         .end local v23    # "shadowWidth":I
    //         :cond_7
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
    //         if-eqz v2, :cond_5
    //         const/4 v2, 0x5
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, p2
    //         invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
    //         move-result v2
    //         if-eqz v2, :cond_5
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
    //         move-result v23
    //         .restart local v23    # "shadowWidth":I
    //         invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getLeft()I
    //         move-result v11
    //         .local v11, "childLeft":I
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
    //         move-result v2
    //         sub-int v24, v2, v11
    //         .local v24, "showing":I
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v2}, Landroid/support/v4/widget/ViewDragHelper;->getEdgeSize()I
    //         move-result v16
    //         .restart local v16    # "drawerPeekDistance":I
    //         const/4 v2, 0x0
    //         move/from16 v0, v24
    //         int-to-float v3, v0
    //         move/from16 v0, v16
    //         int-to-float v4, v0
    //         div-float/2addr v3, v4
    //         const/high16 v4, 0x3f800000    # 1.0f
    //         invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F
    //         move-result v3
    //         invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F
    //         move-result v8
    //         .restart local v8    # "alpha":F
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
    //         sub-int v3, v11, v23
    //         invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTop()I
    //         move-result v4
    //         invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getBottom()I
    //         move-result v5
    //         invoke-virtual {v2, v3, v4, v11, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
    //         const/high16 v3, 0x437f0000    # 255.0f
    //         mul-float/2addr v3, v8
    //         float-to-int v3, v3
    //         invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
    //         move-object/from16 v0, p0
    //         iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
    //         move-object/from16 v0, p1
    //         invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    //         goto/16 :goto_2
    */

    fun findDrawerWithGravity(gravity: Int): android.view.View { return TODO("body: (I)Landroid/view/View;") }
    /*
    //         .locals 6
    //         invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
    //         move-result v5
    //         invoke-static {p1, v5}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
    //         move-result v5
    //         and-int/lit8 v0, v5, 0x7
    //         .local v0, "absHorizGravity":I
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
    //         move-result v3
    //         .local v3, "childCount":I
    //         const/4 v4, 0x0
    //         .local v4, "i":I
    //         :goto_0
    //         if-ge v4, v3, :cond_1
    //         invoke-virtual {p0, v4}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v1
    //         .local v1, "child":Landroid/view/View;
    //         invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewAbsoluteGravity(Landroid/view/View;)I
    //         move-result v2
    //         .local v2, "childAbsGravity":I
    //         and-int/lit8 v5, v2, 0x7
    //         if-ne v5, v0, :cond_0
    //         .end local v1    # "child":Landroid/view/View;
    //         .end local v2    # "childAbsGravity":I
    //         :goto_1
    //         return-object v1
    //         .restart local v1    # "child":Landroid/view/View;
    //         .restart local v2    # "childAbsGravity":I
    //         :cond_0
    //         add-int/lit8 v4, v4, 0x1
    //         goto :goto_0
    //         .end local v1    # "child":Landroid/view/View;
    //         .end local v2    # "childAbsGravity":I
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_1
    */

    fun findOpenDrawer(): android.view.View { return TODO("body: ()Landroid/view/View;") }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
    //         move-result v1
    //         .local v1, "childCount":I
    //         const/4 v2, 0x0
    //         .local v2, "i":I
    //         :goto_0
    //         if-ge v2, v1, :cond_1
    //         invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "child":Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v3
    //         check-cast v3, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget-boolean v3, v3, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
    //         if-eqz v3, :cond_0
    //         .end local v0    # "child":Landroid/view/View;
    //         :goto_1
    //         return-object v0
    //         .restart local v0    # "child":Landroid/view/View;
    //         :cond_0
    //         add-int/lit8 v2, v2, 0x1
    //         goto :goto_0
    //         .end local v0    # "child":Landroid/view/View;
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

    protected fun generateDefaultLayoutParams(): android.view.ViewGroup.LayoutParams { return TODO("body: ()Landroid/view/ViewGroup$LayoutParams;") }
    /*
    //         .locals 2
    //         const/4 v1, -0x1
    //         new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         invoke-direct {v0, v1, v1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(II)V
    //         return-object v0
    */

    public fun generateLayoutParams(attrs: android.util.AttributeSet): android.view.ViewGroup.LayoutParams { return TODO("body: (Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    //         return-object v0
    */

    protected fun generateLayoutParams(p: android.view.ViewGroup.LayoutParams): android.view.ViewGroup.LayoutParams { return TODO("body: (Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;") }
    /*
    //         .locals 1
    //         instance-of v0, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         check-cast p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .end local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
    //         invoke-direct {v0, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/support/v4/widget/DrawerLayout$LayoutParams;)V
    //         :goto_0
    //         return-object v0
    //         .restart local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
    //         :cond_0
    //         instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;
    //         if-eqz v0, :cond_1
    //         new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;
    //         .end local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
    //         invoke-direct {v0, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    //         goto :goto_0
    //         .restart local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
    //         :cond_1
    //         new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         invoke-direct {v0, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
    //         goto :goto_0
    */

    public fun getDrawerLockMode(edgeGravity: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
    //         move-result v1
    //         invoke-static {p1, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
    //         move-result v0
    //         .local v0, "absGravity":I
    //         const/4 v1, 0x3
    //         if-ne v0, v1, :cond_0
    //         iget v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeLeft:I
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x5
    //         if-ne v0, v1, :cond_1
    //         iget v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeRight:I
    //         goto :goto_0
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun getDrawerLockMode(drawerView: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 2
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewAbsoluteGravity(Landroid/view/View;)I
    //         move-result v0
    //         .local v0, "absGravity":I
    //         const/4 v1, 0x3
    //         if-ne v0, v1, :cond_0
    //         iget v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeLeft:I
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x5
    //         if-ne v0, v1, :cond_1
    //         iget v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeRight:I
    //         goto :goto_0
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun getDrawerTitle(edgeGravity: Int): CharSequence { return TODO("body: (I)Ljava/lang/CharSequence;") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
    //         move-result v1
    //         invoke-static {p1, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
    //         move-result v0
    //         .local v0, "absGravity":I
    //         const/4 v1, 0x3
    //         if-ne v0, v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mTitleLeft:Ljava/lang/CharSequence;
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const/4 v1, 0x5
    //         if-ne v0, v1, :cond_1
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mTitleRight:Ljava/lang/CharSequence;
    //         goto :goto_0
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    fun getDrawerViewAbsoluteGravity(drawerView: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v1
    //         check-cast v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget v0, v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
    //         .local v0, "gravity":I
    //         invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
    //         move-result v1
    //         invoke-static {v0, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
    //         move-result v1
    //         return v1
    */

    fun getDrawerViewOffset(drawerView: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
    //         return v0
    */

    fun isContentView(child: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun isDrawerOpen(drawerGravity: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "drawerView":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(Landroid/view/View;)Z
    //         move-result v1
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun isDrawerOpen(drawer: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 3
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "View "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " is not a drawer"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget-boolean v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
    //         return v0
    */

    fun isDrawerView(child: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 3
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v2
    //         check-cast v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget v1, v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
    //         .local v1, "gravity":I
    //         invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
    //         move-result v2
    //         invoke-static {v1, v2}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
    //         move-result v0
    //         .local v0, "absGravity":I
    //         and-int/lit8 v2, v0, 0x7
    //         if-eqz v2, :cond_0
    //         const/4 v2, 0x1
    //         :goto_0
    //         return v2
    //         :cond_0
    //         const/4 v2, 0x0
    //         goto :goto_0
    */

    public fun isDrawerVisible(drawerGravity: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 2
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "drawerView":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerVisible(Landroid/view/View;)Z
    //         move-result v1
    //         :goto_0
    //         return v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun isDrawerVisible(drawer: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 3
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "View "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " is not a drawer"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
    //         const/4 v1, 0x0
    //         cmpl-float v0, v0, v1
    //         if-lez v0, :cond_1
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    fun moveDrawerToOffset(drawerView: android.view.View, slideOffset: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 6
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewOffset(Landroid/view/View;)F
    //         move-result v2
    //         .local v2, "oldOffset":F
    //         invoke-virtual {p1}, Landroid/view/View;->getWidth()I
    //         move-result v4
    //         .local v4, "width":I
    //         int-to-float v5, v4
    //         mul-float/2addr v5, v2
    //         float-to-int v3, v5
    //         .local v3, "oldPos":I
    //         int-to-float v5, v4
    //         mul-float/2addr v5, p2
    //         float-to-int v1, v5
    //         .local v1, "newPos":I
    //         sub-int v0, v1, v3
    //         .local v0, "dx":I
    //         const/4 v5, 0x3
    //         invoke-virtual {p0, p1, v5}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
    //         move-result v5
    //         if-eqz v5, :cond_0
    //         .end local v0    # "dx":I
    //         :goto_0
    //         invoke-virtual {p1, v0}, Landroid/view/View;->offsetLeftAndRight(I)V
    //         invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/DrawerLayout;->setDrawerViewOffset(Landroid/view/View;F)V
    //         return-void
    //         .restart local v0    # "dx":I
    //         :cond_0
    //         neg-int v0, v0
    //         goto :goto_0
    */

    protected fun onAttachedToWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
    //         return-void
    */

    protected fun onDetachedFromWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
    //         return-void
    */

    public fun onDraw(c: android.graphics.Canvas) { /* TODO(body): (Landroid/graphics/Canvas;)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V
    //         iget-boolean v1, p0, Landroid/support/v4/widget/DrawerLayout;->mDrawStatusBarBackground:Z
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;
    //         if-eqz v1, :cond_0
    //         sget-object v1, Landroid/support/v4/widget/DrawerLayout;->IMPL:Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl;
    //         iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mLastInsets:Ljava/lang/Object;
    //         invoke-interface {v1, v2}, Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl;->getTopInset(Ljava/lang/Object;)I
    //         move-result v0
    //         .local v0, "inset":I
    //         if-lez v0, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
    //         move-result v2
    //         invoke-virtual {v1, v3, v3, v2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    //         .end local v0    # "inset":I
    //         :cond_0
    //         return-void
    */

    public fun onInterceptTouchEvent(ev: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 11
    //         const/4 v7, 0x1
    //         const/4 v6, 0x0
    //         invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
    //         move-result v0
    //         .local v0, "action":I
    //         iget-object v8, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v8, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    //         move-result v8
    //         iget-object v9, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v9, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    //         move-result v9
    //         or-int v2, v8, v9
    //         .local v2, "interceptForDrag":Z
    //         const/4 v3, 0x0
    //         .local v3, "interceptForTap":Z
    //         packed-switch v0, :pswitch_data_0
    //         :cond_0
    //         :goto_0
    //         if-nez v2, :cond_1
    //         if-nez v3, :cond_1
    //         invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->hasPeekingDrawer()Z
    //         move-result v8
    //         if-nez v8, :cond_1
    //         iget-boolean v8, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
    //         if-eqz v8, :cond_2
    //         :cond_1
    //         move v6, v7
    //         :cond_2
    //         return v6
    //         :pswitch_0
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
    //         move-result v4
    //         .local v4, "x":F
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
    //         move-result v5
    //         .local v5, "y":F
    //         iput v4, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionX:F
    //         iput v5, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionY:F
    //         iget v8, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimOpacity:F
    //         const/4 v9, 0x0
    //         cmpl-float v8, v8, v9
    //         if-lez v8, :cond_3
    //         iget-object v8, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         float-to-int v9, v4
    //         float-to-int v10, v5
    //         invoke-virtual {v8, v9, v10}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;
    //         move-result-object v1
    //         .local v1, "child":Landroid/view/View;
    //         if-eqz v1, :cond_3
    //         invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
    //         move-result v8
    //         if-eqz v8, :cond_3
    //         const/4 v3, 0x1
    //         .end local v1    # "child":Landroid/view/View;
    //         :cond_3
    //         iput-boolean v6, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
    //         iput-boolean v6, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
    //         goto :goto_0
    //         .end local v4    # "x":F
    //         .end local v5    # "y":F
    //         :pswitch_1
    //         iget-object v8, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         const/4 v9, 0x3
    //         invoke-virtual {v8, v9}, Landroid/support/v4/widget/ViewDragHelper;->checkTouchSlop(I)Z
    //         move-result v8
    //         if-eqz v8, :cond_0
    //         iget-object v8, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
    //         invoke-virtual {v8}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->removeCallbacks()V
    //         iget-object v8, p0, Landroid/support/v4/widget/DrawerLayout;->mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
    //         invoke-virtual {v8}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->removeCallbacks()V
    //         goto :goto_0
    //         :pswitch_2
    //         invoke-virtual {p0, v7}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
    //         iput-boolean v6, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
    //         iput-boolean v6, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_0
    //             :pswitch_2
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    public fun onKeyDown(keyCode: Int, event: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x4
    //         if-ne p1, v0, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->hasVisibleDrawer()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-static {p2}, Landroid/support/v4/view/KeyEventCompat;->startTracking(Landroid/view/KeyEvent;)V
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyDown(ILandroid/view/KeyEvent;)Z
    //         move-result v0
    //         goto :goto_0
    */

    public fun onKeyUp(keyCode: Int, event: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    /*
    //         .locals 2
    //         const/4 v1, 0x4
    //         if-ne p1, v1, :cond_2
    //         invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->findVisibleDrawer()Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "visibleDrawer":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
    //         move-result v1
    //         if-nez v1, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers()V
    //         :cond_0
    //         if-eqz v0, :cond_1
    //         const/4 v1, 0x1
    //         .end local v0    # "visibleDrawer":Landroid/view/View;
    //         :goto_0
    //         return v1
    //         .restart local v0    # "visibleDrawer":Landroid/view/View;
    //         :cond_1
    //         const/4 v1, 0x0
    //         goto :goto_0
    //         .end local v0    # "visibleDrawer":Landroid/view/View;
    //         :cond_2
    //         invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyUp(ILandroid/view/KeyEvent;)Z
    //         move-result v1
    //         goto :goto_0
    */

    protected fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) { /* TODO(body): (ZIIII)V */ }
    /*
    //         .locals 23
    //         const/16 v18, 0x1
    //         move/from16 v0, v18
    //         move-object/from16 v1, p0
    //         iput-boolean v0, v1, Landroid/support/v4/widget/DrawerLayout;->mInLayout:Z
    //         sub-int v17, p4, p2
    //         .local v17, "width":I
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
    //         move-result v6
    //         .local v6, "childCount":I
    //         const/4 v12, 0x0
    //         .local v12, "i":I
    //         :goto_0
    //         if-ge v12, v6, :cond_9
    //         move-object/from16 v0, p0
    //         invoke-virtual {v0, v12}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v5
    //         .local v5, "child":Landroid/view/View;
    //         invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
    //         move-result v18
    //         const/16 v19, 0x8
    //         move/from16 v0, v18
    //         move/from16 v1, v19
    //         if-ne v0, v1, :cond_1
    //         :cond_0
    //         :goto_1
    //         add-int/lit8 v12, v12, 0x1
    //         goto :goto_0
    //         :cond_1
    //         invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v13
    //         check-cast v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .local v13, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         move-object/from16 v0, p0
    //         invoke-virtual {v0, v5}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
    //         move-result v18
    //         if-eqz v18, :cond_2
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I
    //         move/from16 v18, v0
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
    //         move/from16 v19, v0
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I
    //         move/from16 v20, v0
    //         invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
    //         move-result v21
    //         add-int v20, v20, v21
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
    //         move/from16 v21, v0
    //         invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
    //         move-result v22
    //         add-int v21, v21, v22
    //         move/from16 v0, v18
    //         move/from16 v1, v19
    //         move/from16 v2, v20
    //         move/from16 v3, v21
    //         invoke-virtual {v5, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V
    //         goto :goto_1
    //         :cond_2
    //         invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
    //         move-result v10
    //         .local v10, "childWidth":I
    //         invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
    //         move-result v7
    //         .local v7, "childHeight":I
    //         const/16 v18, 0x3
    //         move-object/from16 v0, p0
    //         move/from16 v1, v18
    //         invoke-virtual {v0, v5, v1}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
    //         move-result v18
    //         if-eqz v18, :cond_4
    //         neg-int v0, v10
    //         move/from16 v18, v0
    //         int-to-float v0, v10
    //         move/from16 v19, v0
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
    //         move/from16 v20, v0
    //         mul-float v19, v19, v20
    //         move/from16 v0, v19
    //         float-to-int v0, v0
    //         move/from16 v19, v0
    //         add-int v8, v18, v19
    //         .local v8, "childLeft":I
    //         add-int v18, v10, v8
    //         move/from16 v0, v18
    //         int-to-float v0, v0
    //         move/from16 v18, v0
    //         int-to-float v0, v10
    //         move/from16 v19, v0
    //         div-float v14, v18, v19
    //         .local v14, "newOffset":F
    //         :goto_2
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
    //         move/from16 v18, v0
    //         cmpl-float v18, v14, v18
    //         if-eqz v18, :cond_5
    //         const/4 v4, 0x1
    //         .local v4, "changeOffset":Z
    //         :goto_3
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
    //         move/from16 v18, v0
    //         and-int/lit8 v16, v18, 0x70
    //         .local v16, "vgrav":I
    //         sparse-switch v16, :sswitch_data_0
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
    //         move/from16 v18, v0
    //         add-int v19, v8, v10
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
    //         move/from16 v20, v0
    //         add-int v20, v20, v7
    //         move/from16 v0, v18
    //         move/from16 v1, v19
    //         move/from16 v2, v20
    //         invoke-virtual {v5, v8, v0, v1, v2}, Landroid/view/View;->layout(IIII)V
    //         :goto_4
    //         if-eqz v4, :cond_3
    //         move-object/from16 v0, p0
    //         invoke-virtual {v0, v5, v14}, Landroid/support/v4/widget/DrawerLayout;->setDrawerViewOffset(Landroid/view/View;F)V
    //         :cond_3
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
    //         move/from16 v18, v0
    //         const/16 v19, 0x0
    //         cmpl-float v18, v18, v19
    //         if-lez v18, :cond_8
    //         const/4 v15, 0x0
    //         .local v15, "newVisibility":I
    //         :goto_5
    //         invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
    //         move-result v18
    //         move/from16 v0, v18
    //         if-eq v0, v15, :cond_0
    //         invoke-virtual {v5, v15}, Landroid/view/View;->setVisibility(I)V
    //         goto/16 :goto_1
    //         .end local v4    # "changeOffset":Z
    //         .end local v8    # "childLeft":I
    //         .end local v14    # "newOffset":F
    //         .end local v15    # "newVisibility":I
    //         .end local v16    # "vgrav":I
    //         :cond_4
    //         int-to-float v0, v10
    //         move/from16 v18, v0
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
    //         move/from16 v19, v0
    //         mul-float v18, v18, v19
    //         move/from16 v0, v18
    //         float-to-int v0, v0
    //         move/from16 v18, v0
    //         sub-int v8, v17, v18
    //         .restart local v8    # "childLeft":I
    //         sub-int v18, v17, v8
    //         move/from16 v0, v18
    //         int-to-float v0, v0
    //         move/from16 v18, v0
    //         int-to-float v0, v10
    //         move/from16 v19, v0
    //         div-float v14, v18, v19
    //         .restart local v14    # "newOffset":F
    //         goto :goto_2
    //         :cond_5
    //         const/4 v4, 0x0
    //         goto :goto_3
    //         .restart local v4    # "changeOffset":Z
    //         .restart local v16    # "vgrav":I
    //         :sswitch_0
    //         sub-int v11, p5, p3
    //         .local v11, "height":I
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
    //         move/from16 v18, v0
    //         sub-int v18, v11, v18
    //         invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
    //         move-result v19
    //         sub-int v18, v18, v19
    //         add-int v19, v8, v10
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
    //         move/from16 v20, v0
    //         sub-int v20, v11, v20
    //         move/from16 v0, v18
    //         move/from16 v1, v19
    //         move/from16 v2, v20
    //         invoke-virtual {v5, v8, v0, v1, v2}, Landroid/view/View;->layout(IIII)V
    //         goto :goto_4
    //         .end local v11    # "height":I
    //         :sswitch_1
    //         sub-int v11, p5, p3
    //         .restart local v11    # "height":I
    //         sub-int v18, v11, v7
    //         div-int/lit8 v9, v18, 0x2
    //         .local v9, "childTop":I
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
    //         move/from16 v18, v0
    //         move/from16 v0, v18
    //         if-ge v9, v0, :cond_7
    //         iget v9, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
    //         :cond_6
    //         :goto_6
    //         add-int v18, v8, v10
    //         add-int v19, v9, v7
    //         move/from16 v0, v18
    //         move/from16 v1, v19
    //         invoke-virtual {v5, v8, v9, v0, v1}, Landroid/view/View;->layout(IIII)V
    //         goto :goto_4
    //         :cond_7
    //         add-int v18, v9, v7
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
    //         move/from16 v19, v0
    //         sub-int v19, v11, v19
    //         move/from16 v0, v18
    //         move/from16 v1, v19
    //         if-le v0, v1, :cond_6
    //         iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
    //         move/from16 v18, v0
    //         sub-int v18, v11, v18
    //         sub-int v9, v18, v7
    //         goto :goto_6
    //         .end local v9    # "childTop":I
    //         .end local v11    # "height":I
    //         :cond_8
    //         const/4 v15, 0x4
    //         goto :goto_5
    //         .end local v4    # "changeOffset":Z
    //         .end local v5    # "child":Landroid/view/View;
    //         .end local v7    # "childHeight":I
    //         .end local v8    # "childLeft":I
    //         .end local v10    # "childWidth":I
    //         .end local v13    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .end local v14    # "newOffset":F
    //         .end local v16    # "vgrav":I
    //         :cond_9
    //         const/16 v18, 0x0
    //         move/from16 v0, v18
    //         move-object/from16 v1, p0
    //         iput-boolean v0, v1, Landroid/support/v4/widget/DrawerLayout;->mInLayout:Z
    //         const/16 v18, 0x0
    //         move/from16 v0, v18
    //         move-object/from16 v1, p0
    //         iput-boolean v0, v1, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
    //         return-void
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x10 -> :sswitch_1
    //             0x50 -> :sswitch_0
    //         .end sparse-switch
    */

    protected fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 23
    //         invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
    //         move-result v18
    //         .local v18, "widthMode":I
    //         invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
    //         move-result v13
    //         .local v13, "heightMode":I
    //         invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
    //         move-result v19
    //         .local v19, "widthSize":I
    //         invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
    //         move-result v14
    //         .local v14, "heightSize":I
    //         const/high16 v20, 0x40000000    # 2.0f
    //         move/from16 v0, v18
    //         move/from16 v1, v20
    //         if-ne v0, v1, :cond_0
    //         const/high16 v20, 0x40000000    # 2.0f
    //         move/from16 v0, v20
    //         if-eq v13, v0, :cond_2
    //         :cond_0
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->isInEditMode()Z
    //         move-result v20
    //         if-eqz v20, :cond_5
    //         const/high16 v20, -0x80000000
    //         move/from16 v0, v18
    //         move/from16 v1, v20
    //         if-ne v0, v1, :cond_3
    //         const/high16 v18, 0x40000000    # 2.0f
    //         :cond_1
    //         :goto_0
    //         const/high16 v20, -0x80000000
    //         move/from16 v0, v20
    //         if-ne v13, v0, :cond_4
    //         const/high16 v13, 0x40000000    # 2.0f
    //         :cond_2
    //         :goto_1
    //         move-object/from16 v0, p0
    //         move/from16 v1, v19
    //         invoke-virtual {v0, v1, v14}, Landroid/support/v4/widget/DrawerLayout;->setMeasuredDimension(II)V
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/DrawerLayout;->mLastInsets:Ljava/lang/Object;
    //         move-object/from16 v20, v0
    //         if-eqz v20, :cond_6
    //         invoke-static/range {p0 .. p0}, Landroid/support/v4/view/ViewCompat;->getFitsSystemWindows(Landroid/view/View;)Z
    //         move-result v20
    //         if-eqz v20, :cond_6
    //         const/4 v3, 0x1
    //         .local v3, "applyInsets":Z
    //         :goto_2
    //         invoke-static/range {p0 .. p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
    //         move-result v16
    //         .local v16, "layoutDirection":I
    //         const/4 v12, 0x0
    //         .local v12, "foundDrawers":I
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
    //         move-result v6
    //         .local v6, "childCount":I
    //         const/4 v15, 0x0
    //         .local v15, "i":I
    //         :goto_3
    //         if-ge v15, v6, :cond_d
    //         move-object/from16 v0, p0
    //         invoke-virtual {v0, v15}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v5
    //         .local v5, "child":Landroid/view/View;
    //         invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
    //         move-result v20
    //         const/16 v21, 0x8
    //         move/from16 v0, v20
    //         move/from16 v1, v21
    //         if-ne v0, v1, :cond_7
    //         :goto_4
    //         add-int/lit8 v15, v15, 0x1
    //         goto :goto_3
    //         .end local v3    # "applyInsets":Z
    //         .end local v5    # "child":Landroid/view/View;
    //         .end local v6    # "childCount":I
    //         .end local v12    # "foundDrawers":I
    //         .end local v15    # "i":I
    //         .end local v16    # "layoutDirection":I
    //         :cond_3
    //         if-nez v18, :cond_1
    //         const/high16 v18, 0x40000000    # 2.0f
    //         const/16 v19, 0x12c
    //         goto :goto_0
    //         :cond_4
    //         if-nez v13, :cond_2
    //         const/high16 v13, 0x40000000    # 2.0f
    //         const/16 v14, 0x12c
    //         goto :goto_1
    //         :cond_5
    //         new-instance v20, Ljava/lang/IllegalArgumentException;
    //         const-string v21, "DrawerLayout must be measured with MeasureSpec.EXACTLY."
    //         invoke-direct/range {v20 .. v21}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v20
    //         :cond_6
    //         const/4 v3, 0x0
    //         goto :goto_2
    //         .restart local v3    # "applyInsets":Z
    //         .restart local v5    # "child":Landroid/view/View;
    //         .restart local v6    # "childCount":I
    //         .restart local v12    # "foundDrawers":I
    //         .restart local v15    # "i":I
    //         .restart local v16    # "layoutDirection":I
    //         :cond_7
    //         invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v17
    //         check-cast v17, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .local v17, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         if-eqz v3, :cond_8
    //         move-object/from16 v0, v17
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
    //         move/from16 v20, v0
    //         move/from16 v0, v20
    //         move/from16 v1, v16
    //         invoke-static {v0, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
    //         move-result v4
    //         .local v4, "cgrav":I
    //         invoke-static {v5}, Landroid/support/v4/view/ViewCompat;->getFitsSystemWindows(Landroid/view/View;)Z
    //         move-result v20
    //         if-eqz v20, :cond_9
    //         sget-object v20, Landroid/support/v4/widget/DrawerLayout;->IMPL:Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl;
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/DrawerLayout;->mLastInsets:Ljava/lang/Object;
    //         move-object/from16 v21, v0
    //         move-object/from16 v0, v20
    //         move-object/from16 v1, v21
    //         invoke-interface {v0, v5, v1, v4}, Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl;->dispatchChildInsets(Landroid/view/View;Ljava/lang/Object;I)V
    //         .end local v4    # "cgrav":I
    //         :cond_8
    //         :goto_5
    //         move-object/from16 v0, p0
    //         invoke-virtual {v0, v5}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
    //         move-result v20
    //         if-eqz v20, :cond_a
    //         move-object/from16 v0, v17
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I
    //         move/from16 v20, v0
    //         sub-int v20, v19, v20
    //         move-object/from16 v0, v17
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->rightMargin:I
    //         move/from16 v21, v0
    //         sub-int v20, v20, v21
    //         const/high16 v21, 0x40000000    # 2.0f
    //         invoke-static/range {v20 .. v21}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result v9
    //         .local v9, "contentWidthSpec":I
    //         move-object/from16 v0, v17
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
    //         move/from16 v20, v0
    //         sub-int v20, v14, v20
    //         move-object/from16 v0, v17
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
    //         move/from16 v21, v0
    //         sub-int v20, v20, v21
    //         const/high16 v21, 0x40000000    # 2.0f
    //         invoke-static/range {v20 .. v21}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result v8
    //         .local v8, "contentHeightSpec":I
    //         invoke-virtual {v5, v9, v8}, Landroid/view/View;->measure(II)V
    //         goto :goto_4
    //         .end local v8    # "contentHeightSpec":I
    //         .end local v9    # "contentWidthSpec":I
    //         .restart local v4    # "cgrav":I
    //         :cond_9
    //         sget-object v20, Landroid/support/v4/widget/DrawerLayout;->IMPL:Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl;
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/DrawerLayout;->mLastInsets:Ljava/lang/Object;
    //         move-object/from16 v21, v0
    //         move-object/from16 v0, v20
    //         move-object/from16 v1, v17
    //         move-object/from16 v2, v21
    //         invoke-interface {v0, v1, v2, v4}, Landroid/support/v4/widget/DrawerLayout$DrawerLayoutCompatImpl;->applyMarginInsets(Landroid/view/ViewGroup$MarginLayoutParams;Ljava/lang/Object;I)V
    //         goto :goto_5
    //         .end local v4    # "cgrav":I
    //         :cond_a
    //         move-object/from16 v0, p0
    //         invoke-virtual {v0, v5}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
    //         move-result v20
    //         if-eqz v20, :cond_c
    //         move-object/from16 v0, p0
    //         invoke-virtual {v0, v5}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewAbsoluteGravity(Landroid/view/View;)I
    //         move-result v20
    //         and-int/lit8 v7, v20, 0x7
    //         .local v7, "childGravity":I
    //         and-int v20, v12, v7
    //         if-eqz v20, :cond_b
    //         new-instance v20, Ljava/lang/IllegalStateException;
    //         new-instance v21, Ljava/lang/StringBuilder;
    //         invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v22, "Child drawer has absolute gravity "
    //         invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v21
    //         invoke-static {v7}, Landroid/support/v4/widget/DrawerLayout;->gravityToString(I)Ljava/lang/String;
    //         move-result-object v22
    //         invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v21
    //         const-string v22, " but this "
    //         invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v21
    //         const-string v22, "DrawerLayout"
    //         invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v21
    //         const-string v22, " already has a "
    //         invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v21
    //         const-string v22, "drawer view along that edge"
    //         invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v21
    //         invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v21
    //         invoke-direct/range {v20 .. v21}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v20
    //         :cond_b
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout;->mMinDrawerMargin:I
    //         move/from16 v20, v0
    //         move-object/from16 v0, v17
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I
    //         move/from16 v21, v0
    //         add-int v20, v20, v21
    //         move-object/from16 v0, v17
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->rightMargin:I
    //         move/from16 v21, v0
    //         add-int v20, v20, v21
    //         move-object/from16 v0, v17
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->width:I
    //         move/from16 v21, v0
    //         move/from16 v0, p1
    //         move/from16 v1, v20
    //         move/from16 v2, v21
    //         invoke-static {v0, v1, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildMeasureSpec(III)I
    //         move-result v11
    //         .local v11, "drawerWidthSpec":I
    //         move-object/from16 v0, v17
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
    //         move/from16 v20, v0
    //         move-object/from16 v0, v17
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
    //         move/from16 v21, v0
    //         add-int v20, v20, v21
    //         move-object/from16 v0, v17
    //         iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->height:I
    //         move/from16 v21, v0
    //         move/from16 v0, p2
    //         move/from16 v1, v20
    //         move/from16 v2, v21
    //         invoke-static {v0, v1, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildMeasureSpec(III)I
    //         move-result v10
    //         .local v10, "drawerHeightSpec":I
    //         invoke-virtual {v5, v11, v10}, Landroid/view/View;->measure(II)V
    //         goto/16 :goto_4
    //         .end local v7    # "childGravity":I
    //         .end local v10    # "drawerHeightSpec":I
    //         .end local v11    # "drawerWidthSpec":I
    //         :cond_c
    //         new-instance v20, Ljava/lang/IllegalStateException;
    //         new-instance v21, Ljava/lang/StringBuilder;
    //         invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v22, "Child "
    //         invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v21
    //         move-object/from16 v0, v21
    //         invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v21
    //         const-string v22, " at index "
    //         invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v21
    //         move-object/from16 v0, v21
    //         invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v21
    //         const-string v22, " does not have a valid layout_gravity - must be Gravity.LEFT, "
    //         invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v21
    //         const-string v22, "Gravity.RIGHT or Gravity.NO_GRAVITY"
    //         invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v21
    //         invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v21
    //         invoke-direct/range {v20 .. v21}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v20
    //         .end local v5    # "child":Landroid/view/View;
    //         .end local v17    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         :cond_d
    //         return-void
    */

    protected fun onRestoreInstanceState(state: android.os.Parcelable) { /* TODO(body): (Landroid/os/Parcelable;)V */ }
    /*
    //         .locals 4
    //         move-object v0, p1
    //         check-cast v0, Landroid/support/v4/widget/DrawerLayout$SavedState;
    //         .local v0, "ss":Landroid/support/v4/widget/DrawerLayout$SavedState;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout$SavedState;->getSuperState()Landroid/os/Parcelable;
    //         move-result-object v2
    //         invoke-super {p0, v2}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V
    //         iget v2, v0, Landroid/support/v4/widget/DrawerLayout$SavedState;->openDrawerGravity:I
    //         if-eqz v2, :cond_0
    //         iget v2, v0, Landroid/support/v4/widget/DrawerLayout$SavedState;->openDrawerGravity:I
    //         invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
    //         move-result-object v1
    //         .local v1, "toOpen":Landroid/view/View;
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V
    //         .end local v1    # "toOpen":Landroid/view/View;
    //         :cond_0
    //         iget v2, v0, Landroid/support/v4/widget/DrawerLayout$SavedState;->lockModeLeft:I
    //         const/4 v3, 0x3
    //         invoke-virtual {p0, v2, v3}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
    //         iget v2, v0, Landroid/support/v4/widget/DrawerLayout$SavedState;->lockModeRight:I
    //         const/4 v3, 0x5
    //         invoke-virtual {p0, v2, v3}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
    //         return-void
    */

    protected fun onSaveInstanceState(): android.os.Parcelable { return TODO("body: ()Landroid/os/Parcelable;") }
    /*
    //         .locals 4
    //         invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;
    //         move-result-object v2
    //         .local v2, "superState":Landroid/os/Parcelable;
    //         new-instance v1, Landroid/support/v4/widget/DrawerLayout$SavedState;
    //         invoke-direct {v1, v2}, Landroid/support/v4/widget/DrawerLayout$SavedState;-><init>(Landroid/os/Parcelable;)V
    //         .local v1, "ss":Landroid/support/v4/widget/DrawerLayout$SavedState;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->findOpenDrawer()Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "openDrawer":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v3
    //         check-cast v3, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget v3, v3, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
    //         iput v3, v1, Landroid/support/v4/widget/DrawerLayout$SavedState;->openDrawerGravity:I
    //         :cond_0
    //         iget v3, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeLeft:I
    //         iput v3, v1, Landroid/support/v4/widget/DrawerLayout$SavedState;->lockModeLeft:I
    //         iget v3, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeRight:I
    //         iput v3, v1, Landroid/support/v4/widget/DrawerLayout$SavedState;->lockModeRight:I
    //         return-object v1
    */

    public fun onTouchEvent(ev: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 13
    //         iget-object v10, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v10, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V
    //         iget-object v10, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v10, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
    //         move-result v0
    //         .local v0, "action":I
    //         const/4 v7, 0x1
    //         .local v7, "wantTouchEvents":Z
    //         and-int/lit16 v10, v0, 0xff
    //         packed-switch v10, :pswitch_data_0
    //         :goto_0
    //         :pswitch_0
    //         return v7
    //         :pswitch_1
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
    //         move-result v8
    //         .local v8, "x":F
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
    //         move-result v9
    //         .local v9, "y":F
    //         iput v8, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionX:F
    //         iput v9, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionY:F
    //         const/4 v10, 0x0
    //         iput-boolean v10, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
    //         const/4 v10, 0x0
    //         iput-boolean v10, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
    //         goto :goto_0
    //         .end local v8    # "x":F
    //         .end local v9    # "y":F
    //         :pswitch_2
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
    //         move-result v8
    //         .restart local v8    # "x":F
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
    //         move-result v9
    //         .restart local v9    # "y":F
    //         const/4 v4, 0x1
    //         .local v4, "peekingOnly":Z
    //         iget-object v10, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         float-to-int v11, v8
    //         float-to-int v12, v9
    //         invoke-virtual {v10, v11, v12}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;
    //         move-result-object v6
    //         .local v6, "touchedView":Landroid/view/View;
    //         if-eqz v6, :cond_0
    //         invoke-virtual {p0, v6}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
    //         move-result v10
    //         if-eqz v10, :cond_0
    //         iget v10, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionX:F
    //         sub-float v1, v8, v10
    //         .local v1, "dx":F
    //         iget v10, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionY:F
    //         sub-float v2, v9, v10
    //         .local v2, "dy":F
    //         iget-object v10, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v10}, Landroid/support/v4/widget/ViewDragHelper;->getTouchSlop()I
    //         move-result v5
    //         .local v5, "slop":I
    //         mul-float v10, v1, v1
    //         mul-float v11, v2, v2
    //         add-float/2addr v10, v11
    //         mul-int v11, v5, v5
    //         int-to-float v11, v11
    //         cmpg-float v10, v10, v11
    //         if-gez v10, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->findOpenDrawer()Landroid/view/View;
    //         move-result-object v3
    //         .local v3, "openDrawer":Landroid/view/View;
    //         if-eqz v3, :cond_0
    //         invoke-virtual {p0, v3}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
    //         move-result v10
    //         const/4 v11, 0x2
    //         if-ne v10, v11, :cond_1
    //         const/4 v4, 0x1
    //         .end local v1    # "dx":F
    //         .end local v2    # "dy":F
    //         .end local v3    # "openDrawer":Landroid/view/View;
    //         .end local v5    # "slop":I
    //         :cond_0
    //         :goto_1
    //         invoke-virtual {p0, v4}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
    //         const/4 v10, 0x0
    //         iput-boolean v10, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
    //         goto :goto_0
    //         .restart local v1    # "dx":F
    //         .restart local v2    # "dy":F
    //         .restart local v3    # "openDrawer":Landroid/view/View;
    //         .restart local v5    # "slop":I
    //         :cond_1
    //         const/4 v4, 0x0
    //         goto :goto_1
    //         .end local v1    # "dx":F
    //         .end local v2    # "dy":F
    //         .end local v3    # "openDrawer":Landroid/view/View;
    //         .end local v4    # "peekingOnly":Z
    //         .end local v5    # "slop":I
    //         .end local v6    # "touchedView":Landroid/view/View;
    //         .end local v8    # "x":F
    //         .end local v9    # "y":F
    //         :pswitch_3
    //         const/4 v10, 0x1
    //         invoke-virtual {p0, v10}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
    //         const/4 v10, 0x0
    //         iput-boolean v10, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
    //         const/4 v10, 0x0
    //         iput-boolean v10, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_1
    //             :pswitch_2
    //             :pswitch_0
    //             :pswitch_3
    //         .end packed-switch
    */

    public fun openDrawer(gravity: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "drawerView":Landroid/view/View;
    //         if-nez v0, :cond_0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "No drawer view found with gravity "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->gravityToString(I)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V
    //         return-void
    */

    public fun openDrawer(drawerView: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 4
    //         const/4 v2, 0x1
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "View "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " is not a sliding drawer"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         iget-boolean v1, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
    //         if-eqz v1, :cond_1
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .local v0, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         const/high16 v1, 0x3f800000    # 1.0f
    //         iput v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
    //         iput-boolean v2, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
    //         invoke-direct {p0, p1, v2}, Landroid/support/v4/widget/DrawerLayout;->updateChildrenImportantForAccessibility(Landroid/view/View;Z)V
    //         .end local v0    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         :goto_0
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x3
    //         invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
    //         move-result v1
    //         if-eqz v1, :cond_2
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         const/4 v2, 0x0
    //         invoke-virtual {p1}, Landroid/view/View;->getTop()I
    //         move-result v3
    //         invoke-virtual {v1, p1, v2, v3}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
    //         goto :goto_0
    //         :cond_2
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
    //         move-result v2
    //         invoke-virtual {p1}, Landroid/view/View;->getWidth()I
    //         move-result v3
    //         sub-int/2addr v2, v3
    //         invoke-virtual {p1}, Landroid/view/View;->getTop()I
    //         move-result v3
    //         invoke-virtual {v1, p1, v2, v3}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
    //         goto :goto_0
    */

    public fun requestDisallowInterceptTouchEvent(disallowIntercept: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V
    //         iput-boolean p1, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
    //         :cond_0
    //         return-void
    */

    public fun requestLayout() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mInLayout:Z
    //         if-nez v0, :cond_0
    //         invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V
    //         :cond_0
    //         return-void
    */

    public fun setChildInsets(insets: Object, draw: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 1
    //         iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout;->mLastInsets:Ljava/lang/Object;
    //         iput-boolean p2, p0, Landroid/support/v4/widget/DrawerLayout;->mDrawStatusBarBackground:Z
    //         if-nez p2, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getBackground()Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->setWillNotDraw(Z)V
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->requestLayout()V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setDrawerListener(listener: android.support.v4.widget.DrawerLayout.DrawerListener) { /* TODO(body): (Landroid/support/v4/widget/DrawerLayout$DrawerListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
    //         return-void
    */

    public fun setDrawerLockMode(lockMode: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x3
    //         invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
    //         const/4 v0, 0x5
    //         invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
    //         return-void
    */

    public fun setDrawerLockMode(lockMode: Int, edgeGravity: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x3
    //         invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
    //         move-result v4
    //         invoke-static {p2, v4}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
    //         move-result v0
    //         .local v0, "absGravity":I
    //         if-ne v0, v5, :cond_3
    //         iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeLeft:I
    //         :cond_0
    //         :goto_0
    //         if-eqz p1, :cond_1
    //         if-ne v0, v5, :cond_4
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         .local v1, "helper":Landroid/support/v4/widget/ViewDragHelper;
    //         :goto_1
    //         invoke-virtual {v1}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
    //         .end local v1    # "helper":Landroid/support/v4/widget/ViewDragHelper;
    //         :cond_1
    //         packed-switch p1, :pswitch_data_0
    //         :cond_2
    //         :goto_2
    //         return-void
    //         :cond_3
    //         const/4 v4, 0x5
    //         if-ne v0, v4, :cond_0
    //         iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeRight:I
    //         goto :goto_0
    //         :cond_4
    //         iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         goto :goto_1
    //         :pswitch_0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
    //         move-result-object v3
    //         .local v3, "toOpen":Landroid/view/View;
    //         if-eqz v3, :cond_2
    //         invoke-virtual {p0, v3}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V
    //         goto :goto_2
    //         .end local v3    # "toOpen":Landroid/view/View;
    //         :pswitch_1
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
    //         move-result-object v2
    //         .local v2, "toClose":Landroid/view/View;
    //         if-eqz v2, :cond_2
    //         invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(Landroid/view/View;)V
    //         goto :goto_2
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_1
    //             :pswitch_0
    //         .end packed-switch
    */

    public fun setDrawerLockMode(lockMode: Int, drawerView: android.view.View) { /* TODO(body): (ILandroid/view/View;)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p0, p2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "View "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " is not a "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, "drawer with appropriate layout_gravity"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v1
    //         check-cast v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget v0, v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
    //         .local v0, "gravity":I
    //         invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
    //         return-void
    */

    public fun setDrawerShadow(resId: Int, gravity: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         invoke-virtual {p0, v0, p2}, Landroid/support/v4/widget/DrawerLayout;->setDrawerShadow(Landroid/graphics/drawable/Drawable;I)V
    //         return-void
    */

    public fun setDrawerShadow(shadowDrawable: android.graphics.drawable.Drawable, gravity: Int) { /* TODO(body): (Landroid/graphics/drawable/Drawable;I)V */ }
    /*
    //         .locals 3
    //         invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
    //         move-result v1
    //         invoke-static {p2, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
    //         move-result v0
    //         .local v0, "absGravity":I
    //         and-int/lit8 v1, v0, 0x3
    //         const/4 v2, 0x3
    //         if-ne v1, v2, :cond_0
    //         iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
    //         :cond_0
    //         and-int/lit8 v1, v0, 0x5
    //         const/4 v2, 0x5
    //         if-ne v1, v2, :cond_1
    //         iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
    //         :cond_1
    //         return-void
    */

    public fun setDrawerTitle(edgeGravity: Int, title: CharSequence) { /* TODO(body): (ILjava/lang/CharSequence;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
    //         move-result v1
    //         invoke-static {p1, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
    //         move-result v0
    //         .local v0, "absGravity":I
    //         const/4 v1, 0x3
    //         if-ne v0, v1, :cond_1
    //         iput-object p2, p0, Landroid/support/v4/widget/DrawerLayout;->mTitleLeft:Ljava/lang/CharSequence;
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x5
    //         if-ne v0, v1, :cond_0
    //         iput-object p2, p0, Landroid/support/v4/widget/DrawerLayout;->mTitleRight:Ljava/lang/CharSequence;
    //         goto :goto_0
    */

    fun setDrawerViewOffset(drawerView: android.view.View, slideOffset: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .local v0, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
    //         cmpl-float v1, p2, v1
    //         if-nez v1, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iput p2, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
    //         invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/DrawerLayout;->dispatchOnDrawerSlide(Landroid/view/View;F)V
    //         goto :goto_0
    */

    public fun setScrimColor(color: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimColor:I
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
    //         return-void
    */

    public fun setStatusBarBackground(resId: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-static {v0, p1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         :goto_0
    //         iput-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setStatusBarBackground(bg: android.graphics.drawable.Drawable) { /* TODO(body): (Landroid/graphics/drawable/Drawable;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;
    //         return-void
    */

    public fun setStatusBarBackgroundColor(color: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/graphics/drawable/ColorDrawable;
    //         invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V
    //         iput-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;
    //         return-void
    */

    fun updateDrawerState(forGravity: Int, activeState: Int, activeDrawer: android.view.View) { /* TODO(body): (IILandroid/view/View;)V */ }
    /*
    //         .locals 7
    //         const/4 v6, 0x2
    //         const/4 v5, 0x1
    //         iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v4}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I
    //         move-result v0
    //         .local v0, "leftState":I
    //         iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
    //         invoke-virtual {v4}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I
    //         move-result v2
    //         .local v2, "rightState":I
    //         if-eq v0, v5, :cond_0
    //         if-ne v2, v5, :cond_3
    //         :cond_0
    //         const/4 v3, 0x1
    //         .local v3, "state":I
    //         :goto_0
    //         if-eqz p3, :cond_1
    //         if-nez p2, :cond_1
    //         invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v1
    //         check-cast v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         .local v1, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         iget v4, v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
    //         const/4 v5, 0x0
    //         cmpl-float v4, v4, v5
    //         if-nez v4, :cond_6
    //         invoke-virtual {p0, p3}, Landroid/support/v4/widget/DrawerLayout;->dispatchOnDrawerClosed(Landroid/view/View;)V
    //         .end local v1    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         :cond_1
    //         :goto_1
    //         iget v4, p0, Landroid/support/v4/widget/DrawerLayout;->mDrawerState:I
    //         if-eq v3, v4, :cond_2
    //         iput v3, p0, Landroid/support/v4/widget/DrawerLayout;->mDrawerState:I
    //         iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
    //         if-eqz v4, :cond_2
    //         iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
    //         invoke-interface {v4, v3}, Landroid/support/v4/widget/DrawerLayout$DrawerListener;->onDrawerStateChanged(I)V
    //         :cond_2
    //         return-void
    //         .end local v3    # "state":I
    //         :cond_3
    //         if-eq v0, v6, :cond_4
    //         if-ne v2, v6, :cond_5
    //         :cond_4
    //         const/4 v3, 0x2
    //         .restart local v3    # "state":I
    //         goto :goto_0
    //         .end local v3    # "state":I
    //         :cond_5
    //         const/4 v3, 0x0
    //         .restart local v3    # "state":I
    //         goto :goto_0
    //         .restart local v1    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    //         :cond_6
    //         iget v4, v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
    //         const/high16 v5, 0x3f800000    # 1.0f
    //         cmpl-float v4, v4, v5
    //         if-nez v4, :cond_1
    //         invoke-virtual {p0, p3}, Landroid/support/v4/widget/DrawerLayout;->dispatchOnDrawerOpened(Landroid/view/View;)V
    //         goto :goto_1
    */

    companion object {
    private val ALLOW_EDGE_LOCK: Boolean = false
    private val CAN_HIDE_DESCENDANTS: Boolean = false
    private val CHILDREN_DISALLOW_INTERCEPT: Boolean = true
    private val DEFAULT_SCRIM_COLOR: Int = 0
    val IMPL: android.support.v4.widget.DrawerLayout.DrawerLayoutCompatImpl = null!!
    private val LAYOUT_ATTRS: IntArray = null!!
    @JvmField public val LOCK_MODE_LOCKED_CLOSED: Int = 0x1
    @JvmField public val LOCK_MODE_LOCKED_OPEN: Int = 0x2
    @JvmField public val LOCK_MODE_UNLOCKED: Int = 0x0
    private val MIN_DRAWER_MARGIN: Int = 0x40
    private val MIN_FLING_VELOCITY: Int = 0x190
    private val PEEK_DELAY: Int = 0xa0
    @JvmField public val STATE_DRAGGING: Int = 0x1
    @JvmField public val STATE_IDLE: Int = 0x0
    @JvmField public val STATE_SETTLING: Int = 0x2
    private val TAG: String = "DrawerLayout"
    private val TOUCH_SLOP_SENSITIVITY: Float = 0.0f

    @JvmStatic fun gravityToString(gravity: Int): String { return TODO("body: (I)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         and-int/lit8 v0, p0, 0x3
    //         const/4 v1, 0x3
    //         if-ne v0, v1, :cond_0
    //         const-string v0, "LEFT"
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         and-int/lit8 v0, p0, 0x5
    //         const/4 v1, 0x5
    //         if-ne v0, v1, :cond_1
    //         const-string v0, "RIGHT"
    //         goto :goto_0
    //         :cond_1
    //         invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
    //         move-result-object v0
    //         goto :goto_0
    */

    private @JvmStatic fun hasOpaqueBackground(v: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         .local v0, "bg":Landroid/graphics/drawable/Drawable;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
    //         move-result v2
    //         const/4 v3, -0x1
    //         if-ne v2, v3, :cond_0
    //         const/4 v1, 0x1
    //         :cond_0
    //         return v1
    */

    private @JvmStatic fun includeChildForAccessibility(child: android.view.View): Boolean { return TODO("body: (Landroid/view/View;)Z") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I
    //         move-result v0
    //         const/4 v1, 0x4
    //         if-eq v0, v1, :cond_0
    //         invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I
    //         move-result v0
    //         const/4 v1, 0x2
    //         if-eq v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
