package android.support.v4.widget

// Auto-emitted from smali source: ContentLoadingProgressBar.java.
// 8 fields, 11 methods.

open class ContentLoadingProgressBar: android.widget.ProgressBar() {
    private val mDelayedHide: Runnable
    private val mDelayedShow: Runnable
    private var mDismissed: Boolean
    private var mPostedHide: Boolean
    private var mPostedShow: Boolean
    private var mStartTime: Long

    public constructor(context: android.content.Context)

    public constructor(context: android.content.Context, attrs: android.util.AttributeSet)

    private fun removeCallbacks() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedHide:Ljava/lang/Runnable;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z
    //         iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedShow:Ljava/lang/Runnable;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z
    //         return-void
    */

    public fun hide() { /* TODO(body): ()V */ }
    /*
    //         .locals 10
    //         const-wide/16 v8, 0x1f4
    //         const/4 v6, 0x1
    //         iput-boolean v6, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDismissed:Z
    //         iget-object v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedShow:Ljava/lang/Runnable;
    //         invoke-virtual {p0, v2}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z
    //         invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    //         move-result-wide v2
    //         iget-wide v4, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mStartTime:J
    //         sub-long v0, v2, v4
    //         .local v0, "diff":J
    //         cmp-long v2, v0, v8
    //         if-gez v2, :cond_0
    //         iget-wide v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mStartTime:J
    //         const-wide/16 v4, -0x1
    //         cmp-long v2, v2, v4
    //         if-nez v2, :cond_2
    //         :cond_0
    //         const/16 v2, 0x8
    //         invoke-virtual {p0, v2}, Landroid/support/v4/widget/ContentLoadingProgressBar;->setVisibility(I)V
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         iget-boolean v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedHide:Z
    //         if-nez v2, :cond_1
    //         iget-object v2, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedHide:Ljava/lang/Runnable;
    //         sub-long v4, v8, v0
    //         invoke-virtual {p0, v2, v4, v5}, Landroid/support/v4/widget/ContentLoadingProgressBar;->postDelayed(Ljava/lang/Runnable;J)Z
    //         iput-boolean v6, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedHide:Z
    //         goto :goto_0
    */

    public fun onAttachedToWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-super {p0}, Landroid/widget/ProgressBar;->onAttachedToWindow()V
    //         invoke-direct {p0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks()V
    //         return-void
    */

    public fun onDetachedFromWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-super {p0}, Landroid/widget/ProgressBar;->onDetachedFromWindow()V
    //         invoke-direct {p0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks()V
    //         return-void
    */

    public fun show() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const-wide/16 v0, -0x1
    //         iput-wide v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mStartTime:J
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDismissed:Z
    //         iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedHide:Ljava/lang/Runnable;
    //         invoke-virtual {p0, v0}, Landroid/support/v4/widget/ContentLoadingProgressBar;->removeCallbacks(Ljava/lang/Runnable;)Z
    //         iget-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedShow:Z
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mDelayedShow:Ljava/lang/Runnable;
    //         const-wide/16 v2, 0x1f4
    //         invoke-virtual {p0, v0, v2, v3}, Landroid/support/v4/widget/ContentLoadingProgressBar;->postDelayed(Ljava/lang/Runnable;J)Z
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar;->mPostedShow:Z
    //         :cond_0
    //         return-void
    */

    companion object {
    private val MIN_DELAY: Int = 0x1f4
    private val MIN_SHOW_TIME: Int = 0x1f4
    }
}
