package com.facebook.widget

// Auto-emitted from smali source: ToolTipPopup.java.
// 9 fields, 11 methods.

open class ToolTipPopup {
    private val mAnchorViewRef: java.lang.ref.WeakReference
    private val mContext: android.content.Context
    private var mNuxDisplayTime: Long
    private var mPopupContent: com.facebook.widget.ToolTipPopup.PopupContentView
    private var mPopupWindow: android.widget.PopupWindow
    private val mScrollListener: android.view.ViewTreeObserver.OnScrollChangedListener
    private var mStyle: com.facebook.widget.ToolTipPopup.Style
    private val mText: String

    public constructor(p0: String, p1: android.view.View)

    private fun registerObserver() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/facebook/widget/ToolTipPopup;->unregisterObserver()V
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/ToolTipPopup;->mScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;
    //         invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V
    //         :cond_0
    //         return-void
    */

    private fun unregisterObserver() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/ToolTipPopup;->mScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;
    //         invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V
    //         :cond_0
    //         return-void
    */

    private fun updateArrows() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;
    //         invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;
    //         invoke-virtual {v0}, Landroid/widget/PopupWindow;->isAboveAnchor()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         invoke-virtual {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->showBottomArrow()V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         invoke-virtual {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->showTopArrow()V
    //         goto :goto_0
    */

    public fun dismiss() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/facebook/widget/ToolTipPopup;->unregisterObserver()V
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;
    //         invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    //         :cond_0
    //         return-void
    */

    public fun setNuxDisplayTime(p0: Long) { /* TODO(body): (J)V */ }
    /*
    //         .locals 1
    //         iput-wide p1, p0, Lcom/facebook/widget/ToolTipPopup;->mNuxDisplayTime:J
    //         return-void
    */

    public fun setStyle(p0: com.facebook.widget.ToolTipPopup.Style) { /* TODO(body): (Lcom/facebook/widget/ToolTipPopup$Style;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/ToolTipPopup;->mStyle:Lcom/facebook/widget/ToolTipPopup$Style;
    //         return-void
    */

    public fun show() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const/high16 v3, -0x80000000
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         new-instance v0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         iget-object v1, p0, Lcom/facebook/widget/ToolTipPopup;->mContext:Landroid/content/Context;
    //         invoke-direct {v0, p0, v1}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;-><init>(Lcom/facebook/widget/ToolTipPopup;Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         sget v1, Lcom/facebook/android/R$id;->com_facebook_tooltip_bubble_view_text_body:I
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/TextView;
    //         iget-object v1, p0, Lcom/facebook/widget/ToolTipPopup;->mText:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mStyle:Lcom/facebook/widget/ToolTipPopup$Style;
    //         sget-object v1, Lcom/facebook/widget/ToolTipPopup$Style;->BLUE:Lcom/facebook/widget/ToolTipPopup$Style;
    //         if-ne v0, v1, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$300(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/view/View;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_blue_background:I
    //         invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$400(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_blue_bottomnub:I
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$500(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_blue_topnub:I
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$600(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_blue_xout:I
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
    //         :goto_0
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mContext:Landroid/content/Context;
    //         check-cast v0, Landroid/app/Activity;
    //         invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/view/View;->getWidth()I
    //         move-result v1
    //         invoke-virtual {v0}, Landroid/view/View;->getHeight()I
    //         move-result v0
    //         invoke-direct {p0}, Lcom/facebook/widget/ToolTipPopup;->registerObserver()V
    //         iget-object v2, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result v1
    //         invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
    //         move-result v0
    //         invoke-virtual {v2, v1, v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->onMeasure(II)V
    //         new-instance v0, Landroid/widget/PopupWindow;
    //         iget-object v1, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         iget-object v2, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         invoke-virtual {v2}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->getMeasuredWidth()I
    //         move-result v2
    //         iget-object v3, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         invoke-virtual {v3}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->getMeasuredHeight()I
    //         move-result v3
    //         invoke-direct {v0, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V
    //         iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;
    //         iget-object v1, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mAnchorViewRef:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;)V
    //         invoke-direct {p0}, Lcom/facebook/widget/ToolTipPopup;->updateArrows()V
    //         iget-wide v0, p0, Lcom/facebook/widget/ToolTipPopup;->mNuxDisplayTime:J
    //         const-wide/16 v2, 0x0
    //         cmp-long v0, v0, v2
    //         if-lez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         new-instance v1, Lcom/facebook/widget/ToolTipPopup$2;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/ToolTipPopup$2;-><init>(Lcom/facebook/widget/ToolTipPopup;)V
    //         iget-wide v2, p0, Lcom/facebook/widget/ToolTipPopup;->mNuxDisplayTime:J
    //         invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->postDelayed(Ljava/lang/Runnable;J)Z
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupWindow:Landroid/widget/PopupWindow;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchable(Z)V
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         new-instance v1, Lcom/facebook/widget/ToolTipPopup$3;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/ToolTipPopup$3;-><init>(Lcom/facebook/widget/ToolTipPopup;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    //         :cond_1
    //         return-void
    //         :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$300(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/view/View;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_black_background:I
    //         invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$400(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_black_bottomnub:I
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$500(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_black_topnub:I
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup;->mPopupContent:Lcom/facebook/widget/ToolTipPopup$PopupContentView;
    //         invoke-static {v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->access$600(Lcom/facebook/widget/ToolTipPopup$PopupContentView;)Landroid/widget/ImageView;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$drawable;->com_facebook_tooltip_black_xout:I
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V
    //         goto/16 :goto_0
    */

    companion object {
    @JvmField public val DEFAULT_POPUP_DISPLAY_TIME: Long = 0x1770L
    }
}
