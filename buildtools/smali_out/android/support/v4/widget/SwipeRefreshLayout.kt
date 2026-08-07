package android.support.v4.widget

// Auto-emitted from smali source: SwipeRefreshLayout.java.
// 51 fields, 56 methods.

open class SwipeRefreshLayout: android.view.ViewGroup() {
    private var mActivePointerId: Int
    private var mAlphaMaxAnimation: android.view.animation.Animation
    private var mAlphaStartAnimation: android.view.animation.Animation
    private val mAnimateToCorrectPosition: android.view.animation.Animation
    private val mAnimateToStartPosition: android.view.animation.Animation
    private var mCircleHeight: Int
    private var mCircleView: android.support.v4.widget.CircleImageView
    private var mCircleViewIndex: Int
    private var mCircleWidth: Int
    private var mCurrentTargetOffsetTop: Int
    private val mDecelerateInterpolator: android.view.animation.DecelerateInterpolator
    protected var mFrom: Int
    private var mInitialMotionY: Float
    private var mIsBeingDragged: Boolean
    private var mListener: android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
    private var mMediumAnimationDuration: Int
    private var mNotify: Boolean
    private var mOriginalOffsetCalculated: Boolean
    protected var mOriginalOffsetTop: Int
    private var mProgress: android.support.v4.widget.MaterialProgressDrawable
    private var mRefreshListener: android.view.animation.Animation.AnimationListener
    private var mRefreshing: Boolean
    private var mReturningToStart: Boolean
    private var mScale: Boolean
    private var mScaleAnimation: android.view.animation.Animation
    private var mScaleDownAnimation: android.view.animation.Animation
    private var mScaleDownToStartAnimation: android.view.animation.Animation
    private var mSpinnerFinalOffset: Float
    private var mStartingScale: Float
    private var mTarget: android.view.View
    private var mTotalDragDistance: Float
    private var mTouchSlop: Int
    private var mUsingCustomStart: Boolean

    public constructor(context: android.content.Context)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet)

    private fun animateOffsetToCorrectPosition(from: Int, listener: android.view.animation.Animation.AnimationListener) { /* TODO(body): (ILandroid/view/animation/Animation$AnimationListener;)V */ }
    /*
    //         .locals 4
    //         iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFrom:I
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToCorrectPosition:Landroid/view/animation/Animation;
    //         invoke-virtual {v0}, Landroid/view/animation/Animation;->reset()V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToCorrectPosition:Landroid/view/animation/Animation;
    //         const-wide/16 v2, 0xc8
    //         invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToCorrectPosition:Landroid/view/animation/Animation;
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;
    //         invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
    //         if-eqz p2, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0, p2}, Landroid/support/v4/widget/CircleImageView;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/CircleImageView;->clearAnimation()V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToCorrectPosition:Landroid/view/animation/Animation;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/CircleImageView;->startAnimation(Landroid/view/animation/Animation;)V
    //         return-void
    */

    private fun animateOffsetToStartPosition(from: Int, listener: android.view.animation.Animation.AnimationListener) { /* TODO(body): (ILandroid/view/animation/Animation$AnimationListener;)V */ }
    /*
    //         .locals 4
    //         iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScale:Z
    //         if-eqz v0, :cond_0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/SwipeRefreshLayout;->startScaleDownReturnToStartAnimation(ILandroid/view/animation/Animation$AnimationListener;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFrom:I
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;
    //         invoke-virtual {v0}, Landroid/view/animation/Animation;->reset()V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;
    //         const-wide/16 v2, 0xc8
    //         invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;
    //         invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
    //         if-eqz p2, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0, p2}, Landroid/support/v4/widget/CircleImageView;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/CircleImageView;->clearAnimation()V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/CircleImageView;->startAnimation(Landroid/view/animation/Animation;)V
    //         goto :goto_0
    */

    private fun createProgressView() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const v3, -0x50506
    //         new-instance v0, Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         const/high16 v2, 0x41a00000    # 20.0f
    //         invoke-direct {v0, v1, v3, v2}, Landroid/support/v4/widget/CircleImageView;-><init>(Landroid/content/Context;IF)V
    //         iput-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         new-instance v0, Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-direct {v0, v1, p0}, Landroid/support/v4/widget/MaterialProgressDrawable;-><init>(Landroid/content/Context;Landroid/view/View;)V
    //         iput-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {v0, v3}, Landroid/support/v4/widget/MaterialProgressDrawable;->setBackgroundColor(I)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/CircleImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         const/16 v1, 0x8
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/CircleImageView;->setVisibility(I)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->addView(Landroid/view/View;)V
    //         return-void
    */

    private fun ensureTarget() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
    //         if-nez v2, :cond_0
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I
    //         move-result v2
    //         if-ge v1, v2, :cond_0
    //         invoke-virtual {p0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v0
    //         .local v0, "child":Landroid/view/View;
    //         iget-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         iput-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
    //         .end local v0    # "child":Landroid/view/View;
    //         .end local v1    # "i":I
    //         :cond_0
    //         return-void
    //         .restart local v0    # "child":Landroid/view/View;
    //         .restart local v1    # "i":I
    //         :cond_1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    */

    private fun getMotionEventY(ev: android.view.MotionEvent, activePointerId: Int): Float { return TODO("body: (Landroid/view/MotionEvent;I)F") }
    /*
    //         .locals 2
    //         invoke-static {p1, p2}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
    //         move-result v0
    //         .local v0, "index":I
    //         if-gez v0, :cond_0
    //         const/high16 v1, -0x40800000    # -1.0f
    //         :goto_0
    //         return v1
    //         :cond_0
    //         invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
    //         move-result v1
    //         goto :goto_0
    */

    private fun isAlphaUsedForScale(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0xb
    //         if-ge v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun isAnimationRunning(animation: android.view.animation.Animation): Boolean { return TODO("body: (Landroid/view/animation/Animation;)Z") }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p1}, Landroid/view/animation/Animation;->hasStarted()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1}, Landroid/view/animation/Animation;->hasEnded()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun moveToStart(interpolatedTime: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 5
    //         const/4 v1, 0x0
    //         .local v1, "targetTop":I
    //         iget v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFrom:I
    //         iget v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mOriginalOffsetTop:I
    //         iget v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFrom:I
    //         sub-int/2addr v3, v4
    //         int-to-float v3, v3
    //         mul-float/2addr v3, p1
    //         float-to-int v3, v3
    //         add-int v1, v2, v3
    //         iget-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v2}, Landroid/support/v4/widget/CircleImageView;->getTop()I
    //         move-result v2
    //         sub-int v0, v1, v2
    //         .local v0, "offset":I
    //         const/4 v2, 0x0
    //         invoke-direct {p0, v0, v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(IZ)V
    //         return-void
    */

    private fun onSecondaryPointerUp(ev: android.view.MotionEvent) { /* TODO(body): (Landroid/view/MotionEvent;)V */ }
    /*
    //         .locals 4
    //         invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
    //         move-result v2
    //         .local v2, "pointerIndex":I
    //         invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
    //         move-result v1
    //         .local v1, "pointerId":I
    //         iget v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
    //         if-ne v1, v3, :cond_0
    //         if-nez v2, :cond_1
    //         const/4 v0, 0x1
    //         .local v0, "newPointerIndex":I
    //         :goto_0
    //         invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
    //         move-result v3
    //         iput v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
    //         .end local v0    # "newPointerIndex":I
    //         :cond_0
    //         return-void
    //         :cond_1
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun setAnimationProgress(progress: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isAlphaUsedForScale()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/high16 v0, 0x437f0000    # 255.0f
    //         mul-float/2addr v0, p1
    //         float-to-int v0, v0
    //         invoke-direct {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setColorViewAlpha(I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-static {v0, p1}, Landroid/support/v4/view/ViewCompat;->setScaleX(Landroid/view/View;F)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-static {v0, p1}, Landroid/support/v4/view/ViewCompat;->setScaleY(Landroid/view/View;F)V
    //         goto :goto_0
    */

    private fun setColorViewAlpha(targetAlpha: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/CircleImageView;->getBackground()Landroid/graphics/drawable/Drawable;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/MaterialProgressDrawable;->setAlpha(I)V
    //         return-void
    */

    private fun setRefreshing(refreshing: Boolean, notify: Boolean) { /* TODO(body): (ZZ)V */ }
    /*
    //         .locals 2
    //         iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z
    //         if-eq v0, p1, :cond_0
    //         iput-boolean p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mNotify:Z
    //         invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->ensureTarget()V
    //         iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z
    //         iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z
    //         if-eqz v0, :cond_1
    //         iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshListener:Landroid/view/animation/Animation$AnimationListener;
    //         invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->animateOffsetToCorrectPosition(ILandroid/view/animation/Animation$AnimationListener;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshListener:Landroid/view/animation/Animation$AnimationListener;
    //         invoke-direct {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->startScaleDownAnimation(Landroid/view/animation/Animation$AnimationListener;)V
    //         goto :goto_0
    */

    private fun setTargetOffsetTopAndBottom(offset: Int, requiresUpdate: Boolean) { /* TODO(body): (IZ)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/CircleImageView;->bringToFront()V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/CircleImageView;->offsetTopAndBottom(I)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/CircleImageView;->getTop()I
    //         move-result v0
    //         iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I
    //         if-eqz p2, :cond_0
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0xb
    //         if-ge v0, v1, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->invalidate()V
    //         :cond_0
    //         return-void
    */

    private fun startAlphaAnimation(startingAlpha: Int, endingAlpha: Int): android.view.animation.Animation { return TODO("body: (II)Landroid/view/animation/Animation;") }
    /*
    //         .locals 4
    //         const/4 v1, 0x0
    //         iget-boolean v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScale:Z
    //         if-eqz v2, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isAlphaUsedForScale()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         move-object v0, v1
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v0, Landroid/support/v4/widget/SwipeRefreshLayout$4;
    //         invoke-direct {v0, p0, p1, p2}, Landroid/support/v4/widget/SwipeRefreshLayout$4;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;II)V
    //         .local v0, "alpha":Landroid/view/animation/Animation;
    //         const-wide/16 v2, 0x12c
    //         invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V
    //         iget-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v2, v1}, Landroid/support/v4/widget/CircleImageView;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v1}, Landroid/support/v4/widget/CircleImageView;->clearAnimation()V
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v1, v0}, Landroid/support/v4/widget/CircleImageView;->startAnimation(Landroid/view/animation/Animation;)V
    //         goto :goto_0
    */

    private fun startProgressAlphaMaxAnimation() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/MaterialProgressDrawable;->getAlpha()I
    //         move-result v0
    //         const/16 v1, 0xff
    //         invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->startAlphaAnimation(II)Landroid/view/animation/Animation;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAlphaMaxAnimation:Landroid/view/animation/Animation;
    //         return-void
    */

    private fun startProgressAlphaStartAnimation() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/MaterialProgressDrawable;->getAlpha()I
    //         move-result v0
    //         const/16 v1, 0x4c
    //         invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->startAlphaAnimation(II)Landroid/view/animation/Animation;
    //         move-result-object v0
    //         iput-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAlphaStartAnimation:Landroid/view/animation/Animation;
    //         return-void
    */

    private fun startScaleDownAnimation(listener: android.view.animation.Animation.AnimationListener) { /* TODO(body): (Landroid/view/animation/Animation$AnimationListener;)V */ }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/support/v4/widget/SwipeRefreshLayout$3;
    //         invoke-direct {v0, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$3;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
    //         iput-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScaleDownAnimation:Landroid/view/animation/Animation;
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScaleDownAnimation:Landroid/view/animation/Animation;
    //         const-wide/16 v2, 0x96
    //         invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/CircleImageView;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/CircleImageView;->clearAnimation()V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScaleDownAnimation:Landroid/view/animation/Animation;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/CircleImageView;->startAnimation(Landroid/view/animation/Animation;)V
    //         return-void
    */

    private fun startScaleDownReturnToStartAnimation(from: Int, listener: android.view.animation.Animation.AnimationListener) { /* TODO(body): (ILandroid/view/animation/Animation$AnimationListener;)V */ }
    /*
    //         .locals 4
    //         iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFrom:I
    //         invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isAlphaUsedForScale()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/MaterialProgressDrawable;->getAlpha()I
    //         move-result v0
    //         int-to-float v0, v0
    //         iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mStartingScale:F
    //         :goto_0
    //         new-instance v0, Landroid/support/v4/widget/SwipeRefreshLayout$8;
    //         invoke-direct {v0, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$8;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
    //         iput-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScaleDownToStartAnimation:Landroid/view/animation/Animation;
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScaleDownToStartAnimation:Landroid/view/animation/Animation;
    //         const-wide/16 v2, 0x96
    //         invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V
    //         if-eqz p2, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0, p2}, Landroid/support/v4/widget/CircleImageView;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/CircleImageView;->clearAnimation()V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScaleDownToStartAnimation:Landroid/view/animation/Animation;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/CircleImageView;->startAnimation(Landroid/view/animation/Animation;)V
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->getScaleX(Landroid/view/View;)F
    //         move-result v0
    //         iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mStartingScale:F
    //         goto :goto_0
    */

    private fun startScaleUpAnimation(listener: android.view.animation.Animation.AnimationListener) { /* TODO(body): (Landroid/view/animation/Animation$AnimationListener;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/CircleImageView;->setVisibility(I)V
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0xb
    //         if-lt v0, v1, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         const/16 v1, 0xff
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/MaterialProgressDrawable;->setAlpha(I)V
    //         :cond_0
    //         new-instance v0, Landroid/support/v4/widget/SwipeRefreshLayout$2;
    //         invoke-direct {v0, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$2;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
    //         iput-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScaleAnimation:Landroid/view/animation/Animation;
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScaleAnimation:Landroid/view/animation/Animation;
    //         iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mMediumAnimationDuration:I
    //         int-to-long v2, v1
    //         invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V
    //         if-eqz p1, :cond_1
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/CircleImageView;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/CircleImageView;->clearAnimation()V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScaleAnimation:Landroid/view/animation/Animation;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/CircleImageView;->startAnimation(Landroid/view/animation/Animation;)V
    //         return-void
    */

    public fun canChildScrollUp(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 5
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v4, 0xe
    //         if-ge v3, v4, :cond_3
    //         iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
    //         instance-of v3, v3, Landroid/widget/AbsListView;
    //         if-eqz v3, :cond_2
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
    //         check-cast v0, Landroid/widget/AbsListView;
    //         .local v0, "absListView":Landroid/widget/AbsListView;
    //         invoke-virtual {v0}, Landroid/widget/AbsListView;->getChildCount()I
    //         move-result v3
    //         if-lez v3, :cond_1
    //         invoke-virtual {v0}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I
    //         move-result v3
    //         if-gtz v3, :cond_0
    //         invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;
    //         move-result-object v3
    //         invoke-virtual {v3}, Landroid/view/View;->getTop()I
    //         move-result v3
    //         invoke-virtual {v0}, Landroid/widget/AbsListView;->getPaddingTop()I
    //         move-result v4
    //         if-ge v3, v4, :cond_1
    //         .end local v0    # "absListView":Landroid/widget/AbsListView;
    //         :cond_0
    //         :goto_0
    //         return v1
    //         .restart local v0    # "absListView":Landroid/widget/AbsListView;
    //         :cond_1
    //         move v1, v2
    //         goto :goto_0
    //         .end local v0    # "absListView":Landroid/widget/AbsListView;
    //         :cond_2
    //         iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
    //         invoke-virtual {v3}, Landroid/view/View;->getScrollY()I
    //         move-result v3
    //         if-gtz v3, :cond_0
    //         move v1, v2
    //         goto :goto_0
    //         :cond_3
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
    //         const/4 v2, -0x1
    //         invoke-static {v1, v2}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z
    //         move-result v1
    //         goto :goto_0
    */

    protected fun getChildDrawingOrder(childCount: Int, i: Int): Int { return TODO("body: (II)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleViewIndex:I
    //         if-gez v0, :cond_1
    //         .end local p2    # "i":I
    //         :cond_0
    //         :goto_0
    //         return p2
    //         .restart local p2    # "i":I
    //         :cond_1
    //         add-int/lit8 v0, p1, -0x1
    //         if-ne p2, v0, :cond_2
    //         iget p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleViewIndex:I
    //         goto :goto_0
    //         :cond_2
    //         iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleViewIndex:I
    //         if-lt p2, v0, :cond_0
    //         add-int/lit8 p2, p2, 0x1
    //         goto :goto_0
    */

    public fun isRefreshing(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z
    //         return v0
    */

    public fun onInterceptTouchEvent(ev: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 10
    //         const/4 v9, 0x1
    //         const/4 v8, -0x1
    //         const/high16 v7, -0x40800000    # -1.0f
    //         const/4 v4, 0x0
    //         invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->ensureTarget()V
    //         invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
    //         move-result v0
    //         .local v0, "action":I
    //         iget-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z
    //         if-eqz v5, :cond_0
    //         if-nez v0, :cond_0
    //         iput-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isEnabled()Z
    //         move-result v5
    //         if-eqz v5, :cond_1
    //         iget-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z
    //         if-nez v5, :cond_1
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->canChildScrollUp()Z
    //         move-result v5
    //         if-nez v5, :cond_1
    //         iget-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z
    //         if-eqz v5, :cond_2
    //         :cond_1
    //         :goto_0
    //         return v4
    //         :cond_2
    //         packed-switch v0, :pswitch_data_0
    //         :cond_3
    //         :goto_1
    //         :pswitch_0
    //         iget-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
    //         goto :goto_0
    //         :pswitch_1
    //         iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mOriginalOffsetTop:I
    //         iget-object v6, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v6}, Landroid/support/v4/widget/CircleImageView;->getTop()I
    //         move-result v6
    //         sub-int/2addr v5, v6
    //         invoke-direct {p0, v5, v9}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(IZ)V
    //         invoke-static {p1, v4}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
    //         move-result v5
    //         iput v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
    //         iput-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
    //         iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
    //         invoke-direct {p0, p1, v5}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMotionEventY(Landroid/view/MotionEvent;I)F
    //         move-result v1
    //         .local v1, "initialMotionY":F
    //         cmpl-float v5, v1, v7
    //         if-eqz v5, :cond_1
    //         iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mInitialMotionY:F
    //         .end local v1    # "initialMotionY":F
    //         :pswitch_2
    //         iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
    //         if-ne v5, v8, :cond_4
    //         sget-object v5, Landroid/support/v4/widget/SwipeRefreshLayout;->LOG_TAG:Ljava/lang/String;
    //         const-string v6, "Got ACTION_MOVE event but don\'t have an active pointer id."
    //         invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :cond_4
    //         iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
    //         invoke-direct {p0, p1, v5}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMotionEventY(Landroid/view/MotionEvent;I)F
    //         move-result v2
    //         .local v2, "y":F
    //         cmpl-float v5, v2, v7
    //         if-eqz v5, :cond_1
    //         iget v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mInitialMotionY:F
    //         sub-float v3, v2, v4
    //         .local v3, "yDiff":F
    //         iget v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTouchSlop:I
    //         int-to-float v4, v4
    //         cmpl-float v4, v3, v4
    //         if-lez v4, :cond_3
    //         iget-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
    //         if-nez v4, :cond_3
    //         iput-boolean v9, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
    //         iget-object v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         const/16 v5, 0x4c
    //         invoke-virtual {v4, v5}, Landroid/support/v4/widget/MaterialProgressDrawable;->setAlpha(I)V
    //         goto :goto_1
    //         .end local v2    # "y":F
    //         .end local v3    # "yDiff":F
    //         :pswitch_3
    //         invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V
    //         goto :goto_1
    //         :pswitch_4
    //         iput-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
    //         iput v8, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
    //         goto :goto_1
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_1
    //             :pswitch_4
    //             :pswitch_2
    //             :pswitch_4
    //             :pswitch_0
    //             :pswitch_0
    //             :pswitch_3
    //         .end packed-switch
    */

    protected fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) { /* TODO(body): (ZIIII)V */ }
    /*
    //         .locals 14
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredWidth()I
    //         move-result v8
    //         .local v8, "width":I
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredHeight()I
    //         move-result v7
    //         .local v7, "height":I
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I
    //         move-result v9
    //         if-nez v9, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v9, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
    //         if-nez v9, :cond_2
    //         invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->ensureTarget()V
    //         :cond_2
    //         iget-object v9, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
    //         if-eqz v9, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
    //         .local v0, "child":Landroid/view/View;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingLeft()I
    //         move-result v2
    //         .local v2, "childLeft":I
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I
    //         move-result v3
    //         .local v3, "childTop":I
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingLeft()I
    //         move-result v9
    //         sub-int v9, v8, v9
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingRight()I
    //         move-result v10
    //         sub-int v4, v9, v10
    //         .local v4, "childWidth":I
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I
    //         move-result v9
    //         sub-int v9, v7, v9
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingBottom()I
    //         move-result v10
    //         sub-int v1, v9, v10
    //         .local v1, "childHeight":I
    //         add-int v9, v2, v4
    //         add-int v10, v3, v1
    //         invoke-virtual {v0, v2, v3, v9, v10}, Landroid/view/View;->layout(IIII)V
    //         iget-object v9, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v9}, Landroid/support/v4/widget/CircleImageView;->getMeasuredWidth()I
    //         move-result v6
    //         .local v6, "circleWidth":I
    //         iget-object v9, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v9}, Landroid/support/v4/widget/CircleImageView;->getMeasuredHeight()I
    //         move-result v5
    //         .local v5, "circleHeight":I
    //         iget-object v9, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         div-int/lit8 v10, v8, 0x2
    //         div-int/lit8 v11, v6, 0x2
    //         sub-int/2addr v10, v11
    //         iget v11, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I
    //         div-int/lit8 v12, v8, 0x2
    //         div-int/lit8 v13, v6, 0x2
    //         add-int/2addr v12, v13
    //         iget v13, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I
    //         add-int/2addr v13, v5
    //         invoke-virtual {v9, v10, v11, v12, v13}, Landroid/support/v4/widget/CircleImageView;->layout(IIII)V
    //         goto :goto_0
    */

    public fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 6
    //         const/high16 v5, 0x40000000    # 2.0f
    //         invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
    //         if-nez v1, :cond_0
    //         invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->ensureTarget()V
    //         :cond_0
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
    //         if-nez v1, :cond_2
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredWidth()I
    //         move-result v2
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingLeft()I
    //         move-result v3
    //         sub-int/2addr v2, v3
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingRight()I
    //         move-result v3
    //         sub-int/2addr v2, v3
    //         invoke-static {v2, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result v2
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredHeight()I
    //         move-result v3
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I
    //         move-result v4
    //         sub-int/2addr v3, v4
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingBottom()I
    //         move-result v4
    //         sub-int/2addr v3, v4
    //         invoke-static {v3, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result v3
    //         invoke-virtual {v1, v2, v3}, Landroid/view/View;->measure(II)V
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         iget v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleWidth:I
    //         invoke-static {v2, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result v2
    //         iget v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleHeight:I
    //         invoke-static {v3, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result v3
    //         invoke-virtual {v1, v2, v3}, Landroid/support/v4/widget/CircleImageView;->measure(II)V
    //         iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mUsingCustomStart:Z
    //         if-nez v1, :cond_3
    //         iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mOriginalOffsetCalculated:Z
    //         if-nez v1, :cond_3
    //         const/4 v1, 0x1
    //         iput-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mOriginalOffsetCalculated:Z
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v1}, Landroid/support/v4/widget/CircleImageView;->getMeasuredHeight()I
    //         move-result v1
    //         neg-int v1, v1
    //         iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mOriginalOffsetTop:I
    //         iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I
    //         :cond_3
    //         const/4 v1, -0x1
    //         iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleViewIndex:I
    //         const/4 v0, 0x0
    //         .local v0, "index":I
    //         :goto_1
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I
    //         move-result v1
    //         if-ge v0, v1, :cond_1
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildAt(I)Landroid/view/View;
    //         move-result-object v1
    //         iget-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         if-ne v1, v2, :cond_4
    //         iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleViewIndex:I
    //         goto :goto_0
    //         :cond_4
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_1
    */

    public fun onTouchEvent(ev: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 28
    //         invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
    //         move-result v4
    //         .local v4, "action":I
    //         move-object/from16 v0, p0
    //         iget-boolean v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z
    //         move/from16 v21, v0
    //         if-eqz v21, :cond_0
    //         if-nez v4, :cond_0
    //         const/16 v21, 0x0
    //         move/from16 v0, v21
    //         move-object/from16 v1, p0
    //         iput-boolean v0, v1, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z
    //         :cond_0
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isEnabled()Z
    //         move-result v21
    //         if-eqz v21, :cond_1
    //         move-object/from16 v0, p0
    //         iget-boolean v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z
    //         move/from16 v21, v0
    //         if-nez v21, :cond_1
    //         invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->canChildScrollUp()Z
    //         move-result v21
    //         if-eqz v21, :cond_2
    //         :cond_1
    //         const/16 v21, 0x0
    //         :goto_0
    //         return v21
    //         :cond_2
    //         packed-switch v4, :pswitch_data_0
    //         :cond_3
    //         :goto_1
    //         :pswitch_0
    //         const/16 v21, 0x1
    //         goto :goto_0
    //         :pswitch_1
    //         const/16 v21, 0x0
    //         move-object/from16 v0, p1
    //         move/from16 v1, v21
    //         invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
    //         move-result v21
    //         move/from16 v0, v21
    //         move-object/from16 v1, p0
    //         iput v0, v1, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
    //         const/16 v21, 0x0
    //         move/from16 v0, v21
    //         move-object/from16 v1, p0
    //         iput-boolean v0, v1, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
    //         goto :goto_1
    //         :pswitch_2
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
    //         move/from16 v21, v0
    //         move-object/from16 v0, p1
    //         move/from16 v1, v21
    //         invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
    //         move-result v13
    //         .local v13, "pointerIndex":I
    //         if-gez v13, :cond_4
    //         sget-object v21, Landroid/support/v4/widget/SwipeRefreshLayout;->LOG_TAG:Ljava/lang/String;
    //         const-string v22, "Got ACTION_MOVE event but have an invalid active pointer id."
    //         invoke-static/range {v21 .. v22}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         const/16 v21, 0x0
    //         goto :goto_0
    //         :cond_4
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v13}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
    //         move-result v20
    //         .local v20, "y":F
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mInitialMotionY:F
    //         move/from16 v21, v0
    //         sub-float v21, v20, v21
    //         const/high16 v22, 0x3f000000    # 0.5f
    //         mul-float v12, v21, v22
    //         .local v12, "overscrollTop":F
    //         move-object/from16 v0, p0
    //         iget-boolean v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
    //         move/from16 v21, v0
    //         if-eqz v21, :cond_3
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         move-object/from16 v21, v0
    //         const/16 v22, 0x1
    //         invoke-virtual/range {v21 .. v22}, Landroid/support/v4/widget/MaterialProgressDrawable;->showArrow(Z)V
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTotalDragDistance:F
    //         move/from16 v21, v0
    //         div-float v11, v12, v21
    //         .local v11, "originalDragPercent":F
    //         const/16 v21, 0x0
    //         cmpg-float v21, v11, v21
    //         if-gez v21, :cond_5
    //         const/16 v21, 0x0
    //         goto :goto_0
    //         :cond_5
    //         const/high16 v21, 0x3f800000    # 1.0f
    //         invoke-static {v11}, Ljava/lang/Math;->abs(F)F
    //         move-result v22
    //         invoke-static/range {v21 .. v22}, Ljava/lang/Math;->min(FF)F
    //         move-result v6
    //         .local v6, "dragPercent":F
    //         float-to-double v0, v6
    //         move-wide/from16 v22, v0
    //         const-wide v24, 0x3fd999999999999aL    # 0.4
    //         sub-double v22, v22, v24
    //         const-wide/16 v24, 0x0
    //         invoke-static/range {v22 .. v25}, Ljava/lang/Math;->max(DD)D
    //         move-result-wide v22
    //         move-wide/from16 v0, v22
    //         double-to-float v0, v0
    //         move/from16 v21, v0
    //         const/high16 v22, 0x40a00000    # 5.0f
    //         mul-float v21, v21, v22
    //         const/high16 v22, 0x40400000    # 3.0f
    //         div-float v5, v21, v22
    //         .local v5, "adjustedPercent":F
    //         invoke-static {v12}, Ljava/lang/Math;->abs(F)F
    //         move-result v21
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTotalDragDistance:F
    //         move/from16 v22, v0
    //         sub-float v8, v21, v22
    //         .local v8, "extraOS":F
    //         move-object/from16 v0, p0
    //         iget-boolean v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mUsingCustomStart:Z
    //         move/from16 v21, v0
    //         if-eqz v21, :cond_b
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mSpinnerFinalOffset:F
    //         move/from16 v21, v0
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mOriginalOffsetTop:I
    //         move/from16 v22, v0
    //         move/from16 v0, v22
    //         int-to-float v0, v0
    //         move/from16 v22, v0
    //         sub-float v15, v21, v22
    //         .local v15, "slingshotDist":F
    //         :goto_2
    //         const/16 v21, 0x0
    //         const/high16 v22, 0x40000000    # 2.0f
    //         mul-float v22, v22, v15
    //         move/from16 v0, v22
    //         invoke-static {v8, v0}, Ljava/lang/Math;->min(FF)F
    //         move-result v22
    //         div-float v22, v22, v15
    //         invoke-static/range {v21 .. v22}, Ljava/lang/Math;->max(FF)F
    //         move-result v19
    //         .local v19, "tensionSlingshotPercent":F
    //         const/high16 v21, 0x40800000    # 4.0f
    //         div-float v21, v19, v21
    //         move/from16 v0, v21
    //         float-to-double v0, v0
    //         move-wide/from16 v22, v0
    //         const/high16 v21, 0x40800000    # 4.0f
    //         div-float v21, v19, v21
    //         move/from16 v0, v21
    //         float-to-double v0, v0
    //         move-wide/from16 v24, v0
    //         const-wide/high16 v26, 0x4000000000000000L    # 2.0
    //         invoke-static/range {v24 .. v27}, Ljava/lang/Math;->pow(DD)D
    //         move-result-wide v24
    //         sub-double v22, v22, v24
    //         move-wide/from16 v0, v22
    //         double-to-float v0, v0
    //         move/from16 v21, v0
    //         const/high16 v22, 0x40000000    # 2.0f
    //         mul-float v18, v21, v22
    //         .local v18, "tensionPercent":F
    //         mul-float v21, v15, v18
    //         const/high16 v22, 0x40000000    # 2.0f
    //         mul-float v7, v21, v22
    //         .local v7, "extraMove":F
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mOriginalOffsetTop:I
    //         move/from16 v21, v0
    //         mul-float v22, v15, v6
    //         add-float v22, v22, v7
    //         move/from16 v0, v22
    //         float-to-int v0, v0
    //         move/from16 v22, v0
    //         add-int v17, v21, v22
    //         .local v17, "targetY":I
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         move-object/from16 v21, v0
    //         invoke-virtual/range {v21 .. v21}, Landroid/support/v4/widget/CircleImageView;->getVisibility()I
    //         move-result v21
    //         if-eqz v21, :cond_6
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         move-object/from16 v21, v0
    //         const/16 v22, 0x0
    //         invoke-virtual/range {v21 .. v22}, Landroid/support/v4/widget/CircleImageView;->setVisibility(I)V
    //         :cond_6
    //         move-object/from16 v0, p0
    //         iget-boolean v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScale:Z
    //         move/from16 v21, v0
    //         if-nez v21, :cond_7
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         move-object/from16 v21, v0
    //         const/high16 v22, 0x3f800000    # 1.0f
    //         invoke-static/range {v21 .. v22}, Landroid/support/v4/view/ViewCompat;->setScaleX(Landroid/view/View;F)V
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         move-object/from16 v21, v0
    //         const/high16 v22, 0x3f800000    # 1.0f
    //         invoke-static/range {v21 .. v22}, Landroid/support/v4/view/ViewCompat;->setScaleY(Landroid/view/View;F)V
    //         :cond_7
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTotalDragDistance:F
    //         move/from16 v21, v0
    //         cmpg-float v21, v12, v21
    //         if-gez v21, :cond_c
    //         move-object/from16 v0, p0
    //         iget-boolean v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScale:Z
    //         move/from16 v21, v0
    //         if-eqz v21, :cond_8
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTotalDragDistance:F
    //         move/from16 v21, v0
    //         div-float v21, v12, v21
    //         move-object/from16 v0, p0
    //         move/from16 v1, v21
    //         invoke-direct {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setAnimationProgress(F)V
    //         :cond_8
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         move-object/from16 v21, v0
    //         invoke-virtual/range {v21 .. v21}, Landroid/support/v4/widget/MaterialProgressDrawable;->getAlpha()I
    //         move-result v21
    //         const/16 v22, 0x4c
    //         move/from16 v0, v21
    //         move/from16 v1, v22
    //         if-le v0, v1, :cond_9
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAlphaStartAnimation:Landroid/view/animation/Animation;
    //         move-object/from16 v21, v0
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, v21
    //         invoke-direct {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->isAnimationRunning(Landroid/view/animation/Animation;)Z
    //         move-result v21
    //         if-nez v21, :cond_9
    //         invoke-direct/range {p0 .. p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->startProgressAlphaStartAnimation()V
    //         :cond_9
    //         const v21, 0x3f4ccccd    # 0.8f
    //         mul-float v16, v5, v21
    //         .local v16, "strokeStart":F
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         move-object/from16 v21, v0
    //         const/16 v22, 0x0
    //         const v23, 0x3f4ccccd    # 0.8f
    //         move/from16 v0, v23
    //         move/from16 v1, v16
    //         invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F
    //         move-result v23
    //         invoke-virtual/range {v21 .. v23}, Landroid/support/v4/widget/MaterialProgressDrawable;->setStartEndTrim(FF)V
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         move-object/from16 v21, v0
    //         const/high16 v22, 0x3f800000    # 1.0f
    //         move/from16 v0, v22
    //         invoke-static {v0, v5}, Ljava/lang/Math;->min(FF)F
    //         move-result v22
    //         invoke-virtual/range {v21 .. v22}, Landroid/support/v4/widget/MaterialProgressDrawable;->setArrowScale(F)V
    //         .end local v16    # "strokeStart":F
    //         :cond_a
    //         :goto_3
    //         const/high16 v21, -0x41800000    # -0.25f
    //         const v22, 0x3ecccccd    # 0.4f
    //         mul-float v22, v22, v5
    //         add-float v21, v21, v22
    //         const/high16 v22, 0x40000000    # 2.0f
    //         mul-float v22, v22, v18
    //         add-float v21, v21, v22
    //         const/high16 v22, 0x3f000000    # 0.5f
    //         mul-float v14, v21, v22
    //         .local v14, "rotation":F
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         move-object/from16 v21, v0
    //         move-object/from16 v0, v21
    //         invoke-virtual {v0, v14}, Landroid/support/v4/widget/MaterialProgressDrawable;->setProgressRotation(F)V
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I
    //         move/from16 v21, v0
    //         sub-int v21, v17, v21
    //         const/16 v22, 0x1
    //         move-object/from16 v0, p0
    //         move/from16 v1, v21
    //         move/from16 v2, v22
    //         invoke-direct {v0, v1, v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(IZ)V
    //         goto/16 :goto_1
    //         .end local v7    # "extraMove":F
    //         .end local v14    # "rotation":F
    //         .end local v15    # "slingshotDist":F
    //         .end local v17    # "targetY":I
    //         .end local v18    # "tensionPercent":F
    //         .end local v19    # "tensionSlingshotPercent":F
    //         :cond_b
    //         move-object/from16 v0, p0
    //         iget v15, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mSpinnerFinalOffset:F
    //         goto/16 :goto_2
    //         .restart local v7    # "extraMove":F
    //         .restart local v15    # "slingshotDist":F
    //         .restart local v17    # "targetY":I
    //         .restart local v18    # "tensionPercent":F
    //         .restart local v19    # "tensionSlingshotPercent":F
    //         :cond_c
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         move-object/from16 v21, v0
    //         invoke-virtual/range {v21 .. v21}, Landroid/support/v4/widget/MaterialProgressDrawable;->getAlpha()I
    //         move-result v21
    //         const/16 v22, 0xff
    //         move/from16 v0, v21
    //         move/from16 v1, v22
    //         if-ge v0, v1, :cond_a
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAlphaMaxAnimation:Landroid/view/animation/Animation;
    //         move-object/from16 v21, v0
    //         move-object/from16 v0, p0
    //         move-object/from16 v1, v21
    //         invoke-direct {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->isAnimationRunning(Landroid/view/animation/Animation;)Z
    //         move-result v21
    //         if-nez v21, :cond_a
    //         invoke-direct/range {p0 .. p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->startProgressAlphaMaxAnimation()V
    //         goto :goto_3
    //         .end local v5    # "adjustedPercent":F
    //         .end local v6    # "dragPercent":F
    //         .end local v7    # "extraMove":F
    //         .end local v8    # "extraOS":F
    //         .end local v11    # "originalDragPercent":F
    //         .end local v12    # "overscrollTop":F
    //         .end local v13    # "pointerIndex":I
    //         .end local v15    # "slingshotDist":F
    //         .end local v17    # "targetY":I
    //         .end local v18    # "tensionPercent":F
    //         .end local v19    # "tensionSlingshotPercent":F
    //         .end local v20    # "y":F
    //         :pswitch_3
    //         invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
    //         move-result v9
    //         .local v9, "index":I
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v9}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
    //         move-result v21
    //         move/from16 v0, v21
    //         move-object/from16 v1, p0
    //         iput v0, v1, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
    //         goto/16 :goto_1
    //         .end local v9    # "index":I
    //         :pswitch_4
    //         invoke-direct/range {p0 .. p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V
    //         goto/16 :goto_1
    //         :pswitch_5
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
    //         move/from16 v21, v0
    //         const/16 v22, -0x1
    //         move/from16 v0, v21
    //         move/from16 v1, v22
    //         if-ne v0, v1, :cond_e
    //         const/16 v21, 0x1
    //         move/from16 v0, v21
    //         if-ne v4, v0, :cond_d
    //         sget-object v21, Landroid/support/v4/widget/SwipeRefreshLayout;->LOG_TAG:Ljava/lang/String;
    //         const-string v22, "Got ACTION_UP event but don\'t have an active pointer id."
    //         invoke-static/range {v21 .. v22}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         :cond_d
    //         const/16 v21, 0x0
    //         goto/16 :goto_0
    //         :cond_e
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
    //         move/from16 v21, v0
    //         move-object/from16 v0, p1
    //         move/from16 v1, v21
    //         invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
    //         move-result v13
    //         .restart local v13    # "pointerIndex":I
    //         move-object/from16 v0, p1
    //         invoke-static {v0, v13}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
    //         move-result v20
    //         .restart local v20    # "y":F
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mInitialMotionY:F
    //         move/from16 v21, v0
    //         sub-float v21, v20, v21
    //         const/high16 v22, 0x3f000000    # 0.5f
    //         mul-float v12, v21, v22
    //         .restart local v12    # "overscrollTop":F
    //         const/16 v21, 0x0
    //         move/from16 v0, v21
    //         move-object/from16 v1, p0
    //         iput-boolean v0, v1, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTotalDragDistance:F
    //         move/from16 v21, v0
    //         cmpl-float v21, v12, v21
    //         if-lez v21, :cond_f
    //         const/16 v21, 0x1
    //         const/16 v22, 0x1
    //         move-object/from16 v0, p0
    //         move/from16 v1, v21
    //         move/from16 v2, v22
    //         invoke-direct {v0, v1, v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(ZZ)V
    //         :goto_4
    //         const/16 v21, -0x1
    //         move/from16 v0, v21
    //         move-object/from16 v1, p0
    //         iput v0, v1, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
    //         const/16 v21, 0x0
    //         goto/16 :goto_0
    //         :cond_f
    //         const/16 v21, 0x0
    //         move/from16 v0, v21
    //         move-object/from16 v1, p0
    //         iput-boolean v0, v1, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         move-object/from16 v21, v0
    //         const/16 v22, 0x0
    //         const/16 v23, 0x0
    //         invoke-virtual/range {v21 .. v23}, Landroid/support/v4/widget/MaterialProgressDrawable;->setStartEndTrim(FF)V
    //         const/4 v10, 0x0
    //         .local v10, "listener":Landroid/view/animation/Animation$AnimationListener;
    //         move-object/from16 v0, p0
    //         iget-boolean v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScale:Z
    //         move/from16 v21, v0
    //         if-nez v21, :cond_10
    //         new-instance v10, Landroid/support/v4/widget/SwipeRefreshLayout$5;
    //         .end local v10    # "listener":Landroid/view/animation/Animation$AnimationListener;
    //         move-object/from16 v0, p0
    //         invoke-direct {v10, v0}, Landroid/support/v4/widget/SwipeRefreshLayout$5;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
    //         .restart local v10    # "listener":Landroid/view/animation/Animation$AnimationListener;
    //         :cond_10
    //         move-object/from16 v0, p0
    //         iget v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I
    //         move/from16 v21, v0
    //         move-object/from16 v0, p0
    //         move/from16 v1, v21
    //         invoke-direct {v0, v1, v10}, Landroid/support/v4/widget/SwipeRefreshLayout;->animateOffsetToStartPosition(ILandroid/view/animation/Animation$AnimationListener;)V
    //         move-object/from16 v0, p0
    //         iget-object v0, v0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         move-object/from16 v21, v0
    //         const/16 v22, 0x0
    //         invoke-virtual/range {v21 .. v22}, Landroid/support/v4/widget/MaterialProgressDrawable;->showArrow(Z)V
    //         goto :goto_4
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x0
    //             :pswitch_1
    //             :pswitch_5
    //             :pswitch_2
    //             :pswitch_5
    //             :pswitch_0
    //             :pswitch_3
    //             :pswitch_4
    //         .end packed-switch
    */

    public fun requestDisallowInterceptTouchEvent(b: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setColorScheme(colors: IntArray) { /* TODO(body): ([I)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setColorSchemeResources([I)V
    //         return-void
    */

    public fun setColorSchemeColors(colors: IntArray) { /* TODO(body): ([I)V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->ensureTarget()V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/MaterialProgressDrawable;->setColorSchemeColors([I)V
    //         return-void
    */

    public fun setColorSchemeResources(colorResIds: IntArray) { /* TODO(body): ([I)V */ }
    /*
    //         .locals 4
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;
    //         move-result-object v2
    //         .local v2, "res":Landroid/content/res/Resources;
    //         array-length v3, p1
    //         new-array v0, v3, [I
    //         .local v0, "colorRes":[I
    //         const/4 v1, 0x0
    //         .local v1, "i":I
    //         :goto_0
    //         array-length v3, p1
    //         if-ge v1, v3, :cond_0
    //         aget v3, p1, v1
    //         invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I
    //         move-result v3
    //         aput v3, v0, v1
    //         add-int/lit8 v1, v1, 0x1
    //         goto :goto_0
    //         :cond_0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setColorSchemeColors([I)V
    //         return-void
    */

    public fun setDistanceToTriggerSync(distance: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         int-to-float v0, p1
    //         iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTotalDragDistance:F
    //         return-void
    */

    public fun setOnRefreshListener(listener: android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener) { /* TODO(body): (Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mListener:Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
    //         return-void
    */

    public fun setProgressBackgroundColor(colorRes: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/widget/CircleImageView;->setBackgroundColor(I)V
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getColor(I)I
    //         move-result v1
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/MaterialProgressDrawable;->setBackgroundColor(I)V
    //         return-void
    */

    public fun setProgressViewEndTarget(scale: Boolean, end: Int) { /* TODO(body): (ZI)V */ }
    /*
    //         .locals 1
    //         int-to-float v0, p2
    //         iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mSpinnerFinalOffset:F
    //         iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScale:Z
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/CircleImageView;->invalidate()V
    //         return-void
    */

    public fun setProgressViewOffset(scale: Boolean, start: Int, end: Int) { /* TODO(body): (ZII)V */ }
    /*
    //         .locals 2
    //         iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mScale:Z
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         const/16 v1, 0x8
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/CircleImageView;->setVisibility(I)V
    //         iput p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I
    //         iput p2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mOriginalOffsetTop:I
    //         int-to-float v0, p3
    //         iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mSpinnerFinalOffset:F
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mUsingCustomStart:Z
    //         iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/CircleImageView;->invalidate()V
    //         return-void
    */

    public fun setRefreshing(refreshing: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x0
    //         if-eqz p1, :cond_1
    //         iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z
    //         if-eq v1, p1, :cond_1
    //         iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z
    //         const/4 v0, 0x0
    //         .local v0, "endTarget":I
    //         iget-boolean v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mUsingCustomStart:Z
    //         if-nez v1, :cond_0
    //         iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mSpinnerFinalOffset:F
    //         iget v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mOriginalOffsetTop:I
    //         int-to-float v2, v2
    //         add-float/2addr v1, v2
    //         float-to-int v0, v1
    //         :goto_0
    //         iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I
    //         sub-int v1, v0, v1
    //         const/4 v2, 0x1
    //         invoke-direct {p0, v1, v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(IZ)V
    //         iput-boolean v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mNotify:Z
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshListener:Landroid/view/animation/Animation$AnimationListener;
    //         invoke-direct {p0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->startScaleUpAnimation(Landroid/view/animation/Animation$AnimationListener;)V
    //         .end local v0    # "endTarget":I
    //         :goto_1
    //         return-void
    //         .restart local v0    # "endTarget":I
    //         :cond_0
    //         iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mSpinnerFinalOffset:F
    //         float-to-int v0, v1
    //         goto :goto_0
    //         .end local v0    # "endTarget":I
    //         :cond_1
    //         invoke-direct {p0, p1, v3}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(ZZ)V
    //         goto :goto_1
    */

    public fun setSize(size: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         if-eqz p1, :cond_0
    //         const/4 v1, 0x1
    //         if-eq p1, v1, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
    //         move-result-object v0
    //         .local v0, "metrics":Landroid/util/DisplayMetrics;
    //         if-nez p1, :cond_1
    //         const/high16 v1, 0x42600000    # 56.0f
    //         iget v2, v0, Landroid/util/DisplayMetrics;->density:F
    //         mul-float/2addr v1, v2
    //         float-to-int v1, v1
    //         iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleWidth:I
    //         iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleHeight:I
    //         :goto_1
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         const/4 v2, 0x0
    //         invoke-virtual {v1, v2}, Landroid/support/v4/widget/CircleImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {v1, p1}, Landroid/support/v4/widget/MaterialProgressDrawable;->updateSizes(I)V
    //         iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleView:Landroid/support/v4/widget/CircleImageView;
    //         iget-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgress:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {v1, v2}, Landroid/support/v4/widget/CircleImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    //         goto :goto_0
    //         :cond_1
    //         const/high16 v1, 0x42200000    # 40.0f
    //         iget v2, v0, Landroid/util/DisplayMetrics;->density:F
    //         mul-float/2addr v1, v2
    //         float-to-int v1, v1
    //         iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleWidth:I
    //         iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCircleHeight:I
    //         goto :goto_1
    */

    companion object {
    private val ALPHA_ANIMATION_DURATION: Int = 0x12c
    private val ANIMATE_TO_START_DURATION: Int = 0xc8
    private val ANIMATE_TO_TRIGGER_DURATION: Int = 0xc8
    private val CIRCLE_BG_LIGHT: Int = 0
    private val CIRCLE_DIAMETER: Int = 0x28
    private val CIRCLE_DIAMETER_LARGE: Int = 0x38
    private val DECELERATE_INTERPOLATION_FACTOR: Float = 0.0f
    @JvmField public val DEFAULT: Int = 0x1
    private val DEFAULT_CIRCLE_TARGET: Int = 0x40
    private val DRAG_RATE: Float = 0.0f
    private val INVALID_POINTER: Int = 0
    @JvmField public val LARGE: Int = 0x0
    private val LAYOUT_ATTRS: IntArray = null!!
    private val LOG_TAG: String = null!!
    private val MAX_ALPHA: Int = 0xff
    private val MAX_PROGRESS_ANGLE: Float = 0.0f
    private val SCALE_DOWN_DURATION: Int = 0x96
    private val STARTING_PROGRESS_ALPHA: Int = 0x4c
    }
}
