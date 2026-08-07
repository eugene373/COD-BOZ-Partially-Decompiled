package com.facebook.widget

// Auto-emitted from smali source: ToolTipPopup.java.
// 5 fields, 9 methods.

open class ToolTipPopup_PopupContentView: android.widget.FrameLayout() {
    private var bodyFrame: android.view.View
    private var bottomArrow: android.widget.ImageView
    val this$0: com.facebook.widget.ToolTipPopup
    private var topArrow: android.widget.ImageView
    private var xOut: android.widget.ImageView

    public constructor(p0: com.facebook.widget.ToolTipPopup, p1: android.content.Context)

    private fun init() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$layout;->com_facebook_tooltip_bubble:I
    //         invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_tooltip_bubble_view_top_pointer:I
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/ImageView;
    //         iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->topArrow:Landroid/widget/ImageView;
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_tooltip_bubble_view_bottom_pointer:I
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/ImageView;
    //         iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->bottomArrow:Landroid/widget/ImageView;
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_body_frame:I
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->bodyFrame:Landroid/view/View;
    //         sget v0, Lcom/facebook/android/R$id;->com_facebook_button_xout:I
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->findViewById(I)Landroid/view/View;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/ImageView;
    //         iput-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->xOut:Landroid/widget/ImageView;
    //         return-void
    */

    public fun onMeasure(p0: Int, p1: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 0
    //         invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V
    //         return-void
    */

    public fun showBottomArrow() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->topArrow:Landroid/widget/ImageView;
    //         const/4 v1, 0x4
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->bottomArrow:Landroid/widget/ImageView;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
    //         return-void
    */

    public fun showTopArrow() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->topArrow:Landroid/widget/ImageView;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/ToolTipPopup$PopupContentView;->bottomArrow:Landroid/widget/ImageView;
    //         const/4 v1, 0x4
    //         invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
    //         return-void
    */

}
