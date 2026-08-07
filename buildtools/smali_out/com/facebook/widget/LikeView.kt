package com.facebook.widget

// Auto-emitted from smali source: LikeView.java.
// 16 fields, 31 methods.

open class LikeView: android.widget.FrameLayout() {
    private var auxiliaryViewPosition: com.facebook.widget.LikeView.AuxiliaryViewPosition
    private var broadcastReceiver: android.content.BroadcastReceiver
    private var containerView: android.widget.LinearLayout
    private var creationCallback: com.facebook.widget.LikeView.LikeActionControllerCreationCallback
    private var edgePadding: Int
    private var foregroundColor: Int
    private var horizontalAlignment: com.facebook.widget.LikeView.HorizontalAlignment
    private var internalPadding: Int
    private var likeActionController: com.facebook.internal.LikeActionController
    private var likeBoxCountView: com.facebook.internal.LikeBoxCountView
    private var likeButton: com.facebook.internal.LikeButton
    private var likeViewStyle: com.facebook.widget.LikeView.Style
    private var objectId: String
    private var onErrorListener: com.facebook.widget.LikeView.OnErrorListener
    private var socialSentenceView: android.widget.TextView

    public constructor(p0: android.content.Context)

    public constructor(p0: android.content.Context, p1: android.util.AttributeSet)

    private fun associateWithLikeActionController(p0: com.facebook.internal.LikeActionController) { /* TODO(body): (Lcom/facebook/internal/LikeActionController;)V */ }
    /*
    //         .locals 3
    //         iput-object p1, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         new-instance v0, Lcom/facebook/widget/LikeView$LikeControllerBroadcastReceiver;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/facebook/widget/LikeView$LikeControllerBroadcastReceiver;-><init>(Lcom/facebook/widget/LikeView;Lcom/facebook/widget/LikeView$1;)V
    //         iput-object v0, p0, Lcom/facebook/widget/LikeView;->broadcastReceiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {p0}, Lcom/facebook/widget/LikeView;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;
    //         move-result-object v0
    //         new-instance v1, Landroid/content/IntentFilter;
    //         invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V
    //         const-string v2, "com.facebook.sdk.LikeActionController.UPDATED"
    //         invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         const-string v2, "com.facebook.sdk.LikeActionController.DID_ERROR"
    //         invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         const-string v2, "com.facebook.sdk.LikeActionController.DID_RESET"
    //         invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         iget-object v2, p0, Lcom/facebook/widget/LikeView;->broadcastReceiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v0, v2, v1}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    //         return-void
    */

    private fun getAnalyticsParameters(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "style"
    //         iget-object v2, p0, Lcom/facebook/widget/LikeView;->likeViewStyle:Lcom/facebook/widget/LikeView$Style;
    //         invoke-virtual {v2}, Lcom/facebook/widget/LikeView$Style;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "auxiliary_position"
    //         iget-object v2, p0, Lcom/facebook/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         invoke-virtual {v2}, Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "horizontal_alignment"
    //         iget-object v2, p0, Lcom/facebook/widget/LikeView;->horizontalAlignment:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         invoke-virtual {v2}, Lcom/facebook/widget/LikeView$HorizontalAlignment;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "object_id"
    //         iget-object v2, p0, Lcom/facebook/widget/LikeView;->objectId:Ljava/lang/String;
    //         const-string v3, ""
    //         invoke-static {v2, v3}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         return-object v0
    */

    private fun initialize(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, -0x2
    //         invoke-virtual {p0}, Lcom/facebook/widget/LikeView;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$dimen;->com_facebook_likeview_edge_padding:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v0
    //         iput v0, p0, Lcom/facebook/widget/LikeView;->edgePadding:I
    //         invoke-virtual {p0}, Lcom/facebook/widget/LikeView;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$dimen;->com_facebook_likeview_internal_padding:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v0
    //         iput v0, p0, Lcom/facebook/widget/LikeView;->internalPadding:I
    //         iget v0, p0, Lcom/facebook/widget/LikeView;->foregroundColor:I
    //         const/4 v1, -0x1
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/LikeView;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$color;->com_facebook_likeview_text_color:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
    //         move-result v0
    //         iput v0, p0, Lcom/facebook/widget/LikeView;->foregroundColor:I
    //         :cond_0
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/LikeView;->setBackgroundColor(I)V
    //         new-instance v0, Landroid/widget/LinearLayout;
    //         invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/facebook/widget/LikeView;->containerView:Landroid/widget/LinearLayout;
    //         new-instance v0, Landroid/widget/FrameLayout$LayoutParams;
    //         invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->containerView:Landroid/widget/LinearLayout;
    //         invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    //         invoke-direct {p0, p1}, Lcom/facebook/widget/LikeView;->initializeLikeButton(Landroid/content/Context;)V
    //         invoke-direct {p0, p1}, Lcom/facebook/widget/LikeView;->initializeSocialSentenceView(Landroid/content/Context;)V
    //         invoke-direct {p0, p1}, Lcom/facebook/widget/LikeView;->initializeLikeCountView(Landroid/content/Context;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->containerView:Landroid/widget/LinearLayout;
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->likeButton:Lcom/facebook/internal/LikeButton;
    //         invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->containerView:Landroid/widget/LinearLayout;
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;
    //         invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->containerView:Landroid/widget/LinearLayout;
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->likeBoxCountView:Lcom/facebook/internal/LikeBoxCountView;
    //         invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->containerView:Landroid/widget/LinearLayout;
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/LikeView;->addView(Landroid/view/View;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->objectId:Ljava/lang/String;
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/LikeView;->setObjectIdForced(Ljava/lang/String;)V
    //         invoke-direct {p0}, Lcom/facebook/widget/LikeView;->updateLikeStateAndLayout()V
    //         return-void
    */

    private fun initializeLikeButton(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, -0x2
    //         new-instance v1, Lcom/facebook/internal/LikeButton;
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController;->isObjectLiked()Z
    //         move-result v0
    //         :goto_0
    //         invoke-direct {v1, p1, v0}, Lcom/facebook/internal/LikeButton;-><init>(Landroid/content/Context;Z)V
    //         iput-object v1, p0, Lcom/facebook/widget/LikeView;->likeButton:Lcom/facebook/internal/LikeButton;
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeButton:Lcom/facebook/internal/LikeButton;
    //         new-instance v1, Lcom/facebook/widget/LikeView$1;
    //         invoke-direct {v1, p0}, Lcom/facebook/widget/LikeView$1;-><init>(Lcom/facebook/widget/LikeView;)V
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/LikeButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    //         new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
    //         invoke-direct {v0, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->likeButton:Lcom/facebook/internal/LikeButton;
    //         invoke-virtual {v1, v0}, Lcom/facebook/internal/LikeButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    private fun initializeLikeCountView(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 2
    //         const/4 v1, -0x1
    //         new-instance v0, Lcom/facebook/internal/LikeBoxCountView;
    //         invoke-direct {v0, p1}, Lcom/facebook/internal/LikeBoxCountView;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/facebook/widget/LikeView;->likeBoxCountView:Lcom/facebook/internal/LikeBoxCountView;
    //         new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
    //         invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->likeBoxCountView:Lcom/facebook/internal/LikeBoxCountView;
    //         invoke-virtual {v1, v0}, Lcom/facebook/internal/LikeBoxCountView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    //         return-void
    */

    private fun initializeSocialSentenceView(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/widget/TextView;
    //         invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
    //         iput-object v0, p0, Lcom/facebook/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;
    //         const/4 v1, 0x0
    //         invoke-virtual {p0}, Lcom/facebook/widget/LikeView;->getResources()Landroid/content/res/Resources;
    //         move-result-object v2
    //         sget v3, Lcom/facebook/android/R$dimen;->com_facebook_likeview_text_size:I
    //         invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F
    //         move-result v2
    //         invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;
    //         const/4 v1, 0x2
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;
    //         iget v1, p0, Lcom/facebook/widget/LikeView;->foregroundColor:I
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;
    //         const/16 v1, 0x11
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V
    //         new-instance v0, Landroid/widget/LinearLayout$LayoutParams;
    //         const/4 v1, -0x2
    //         const/4 v2, -0x1
    //         invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;
    //         invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    //         return-void
    */

    private fun parseAttributes(p0: android.util.AttributeSet) { /* TODO(body): (Landroid/util/AttributeSet;)V */ }
    /*
    //         .locals 3
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/LikeView;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-virtual {p0}, Lcom/facebook/widget/LikeView;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         sget-object v1, Lcom/facebook/android/R$styleable;->com_facebook_like_view:[I
    //         invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_like_view_object_id:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         invoke-static {v1, v2}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/widget/LikeView;->objectId:Ljava/lang/String;
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_like_view_style:I
    //         sget-object v2, Lcom/facebook/widget/LikeView$Style;->DEFAULT:Lcom/facebook/widget/LikeView$Style;
    //         invoke-static {v2}, Lcom/facebook/widget/LikeView$Style;->access$000(Lcom/facebook/widget/LikeView$Style;)I
    //         move-result v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I
    //         move-result v1
    //         invoke-static {v1}, Lcom/facebook/widget/LikeView$Style;->fromInt(I)Lcom/facebook/widget/LikeView$Style;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/widget/LikeView;->likeViewStyle:Lcom/facebook/widget/LikeView$Style;
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->likeViewStyle:Lcom/facebook/widget/LikeView$Style;
    //         if-nez v1, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Unsupported value for LikeView \'style\'"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_like_view_auxiliary_view_position:I
    //         sget-object v2, Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;->DEFAULT:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         invoke-static {v2}, Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;->access$100(Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;)I
    //         move-result v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I
    //         move-result v1
    //         invoke-static {v1}, Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;->fromInt(I)Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         if-nez v1, :cond_3
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Unsupported value for LikeView \'auxiliary_view_position\'"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_3
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_like_view_horizontal_alignment:I
    //         sget-object v2, Lcom/facebook/widget/LikeView$HorizontalAlignment;->DEFAULT:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         invoke-static {v2}, Lcom/facebook/widget/LikeView$HorizontalAlignment;->access$200(Lcom/facebook/widget/LikeView$HorizontalAlignment;)I
    //         move-result v2
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I
    //         move-result v1
    //         invoke-static {v1}, Lcom/facebook/widget/LikeView$HorizontalAlignment;->fromInt(I)Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         move-result-object v1
    //         iput-object v1, p0, Lcom/facebook/widget/LikeView;->horizontalAlignment:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->horizontalAlignment:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         if-nez v1, :cond_4
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Unsupported value for LikeView \'horizontal_alignment\'"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_4
    //         sget v1, Lcom/facebook/android/R$styleable;->com_facebook_like_view_foreground_color:I
    //         const/4 v2, -0x1
    //         invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I
    //         move-result v1
    //         iput v1, p0, Lcom/facebook/widget/LikeView;->foregroundColor:I
    //         invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
    //         goto :goto_0
    */

    private fun setObjectIdForced(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/facebook/widget/LikeView;->tearDownObjectAssociations()V
    //         iput-object p1, p0, Lcom/facebook/widget/LikeView;->objectId:Ljava/lang/String;
    //         invoke-static {p1}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;-><init>(Lcom/facebook/widget/LikeView;Lcom/facebook/widget/LikeView$1;)V
    //         iput-object v0, p0, Lcom/facebook/widget/LikeView;->creationCallback:Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;
    //         invoke-virtual {p0}, Lcom/facebook/widget/LikeView;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->creationCallback:Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;
    //         invoke-static {v0, p1, v1}, Lcom/facebook/internal/LikeActionController;->getControllerForObjectId(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/internal/LikeActionController$CreationCallback;)V
    //         goto :goto_0
    */

    private fun tearDownObjectAssociations() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->broadcastReceiver:Landroid/content/BroadcastReceiver;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/LikeView;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->broadcastReceiver:Landroid/content/BroadcastReceiver;
    //         invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    //         iput-object v2, p0, Lcom/facebook/widget/LikeView;->broadcastReceiver:Landroid/content/BroadcastReceiver;
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->creationCallback:Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->creationCallback:Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;
    //         invoke-virtual {v0}, Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;->cancel()V
    //         iput-object v2, p0, Lcom/facebook/widget/LikeView;->creationCallback:Lcom/facebook/widget/LikeView$LikeActionControllerCreationCallback;
    //         :cond_1
    //         iput-object v2, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         return-void
    */

    private fun toggleLike() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p0}, Lcom/facebook/widget/LikeView;->getContext()Landroid/content/Context;
    //         move-result-object v0
    //         check-cast v0, Landroid/app/Activity;
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         invoke-direct {p0}, Lcom/facebook/widget/LikeView;->getAnalyticsParameters()Landroid/os/Bundle;
    //         move-result-object v2
    //         invoke-virtual {v1, v0, v2}, Lcom/facebook/internal/LikeActionController;->toggleLike(Landroid/app/Activity;Landroid/os/Bundle;)V
    //         :cond_0
    //         return-void
    */

    private fun updateBoxCountCaretPosition() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/facebook/widget/LikeView$2;->$SwitchMap$com$facebook$widget$LikeView$AuxiliaryViewPosition:[I
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         invoke-virtual {v1}, Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;->ordinal()I
    //         move-result v1
    //         aget v0, v0, v1
    //         packed-switch v0, :pswitch_data_0
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeBoxCountView:Lcom/facebook/internal/LikeBoxCountView;
    //         sget-object v1, Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->BOTTOM:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/LikeBoxCountView;->setCaretPosition(Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;)V
    //         goto :goto_0
    //         :pswitch_1
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeBoxCountView:Lcom/facebook/internal/LikeBoxCountView;
    //         sget-object v1, Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->TOP:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/LikeBoxCountView;->setCaretPosition(Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;)V
    //         goto :goto_0
    //         :pswitch_2
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->likeBoxCountView:Lcom/facebook/internal/LikeBoxCountView;
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->horizontalAlignment:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         sget-object v2, Lcom/facebook/widget/LikeView$HorizontalAlignment;->RIGHT:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         if-ne v0, v2, :cond_0
    //         sget-object v0, Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->RIGHT:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;
    //         :goto_1
    //         invoke-virtual {v1, v0}, Lcom/facebook/internal/LikeBoxCountView;->setCaretPosition(Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;)V
    //         goto :goto_0
    //         :cond_0
    //         sget-object v0, Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;->LEFT:Lcom/facebook/internal/LikeBoxCountView$LikeBoxCountViewCaretPosition;
    //         goto :goto_1
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    private fun updateLayout() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         const/16 v6, 0x8
    //         const/4 v3, 0x1
    //         const/4 v4, 0x0
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->containerView:Landroid/widget/LinearLayout;
    //         invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/FrameLayout$LayoutParams;
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->likeButton:Lcom/facebook/internal/LikeButton;
    //         invoke-virtual {v1}, Lcom/facebook/internal/LikeButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v1
    //         check-cast v1, Landroid/widget/LinearLayout$LayoutParams;
    //         iget-object v2, p0, Lcom/facebook/widget/LikeView;->horizontalAlignment:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         sget-object v5, Lcom/facebook/widget/LikeView$HorizontalAlignment;->LEFT:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         if-ne v2, v5, :cond_3
    //         const/4 v2, 0x3
    //         :goto_0
    //         or-int/lit8 v5, v2, 0x30
    //         iput v5, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I
    //         iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;
    //         invoke-virtual {v0, v6}, Landroid/widget/TextView;->setVisibility(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeBoxCountView:Lcom/facebook/internal/LikeBoxCountView;
    //         invoke-virtual {v0, v6}, Lcom/facebook/internal/LikeBoxCountView;->setVisibility(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeViewStyle:Lcom/facebook/widget/LikeView$Style;
    //         sget-object v1, Lcom/facebook/widget/LikeView$Style;->STANDARD:Lcom/facebook/widget/LikeView$Style;
    //         if-ne v0, v1, :cond_5
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         if-eqz v0, :cond_5
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController;->getSocialSentence()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_5
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;
    //         move-object v1, v0
    //         :goto_1
    //         invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V
    //         invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         check-cast v0, Landroid/widget/LinearLayout$LayoutParams;
    //         iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->containerView:Landroid/widget/LinearLayout;
    //         iget-object v2, p0, Lcom/facebook/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         sget-object v5, Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;->INLINE:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         if-ne v2, v5, :cond_0
    //         move v3, v4
    //         :cond_0
    //         invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         sget-object v2, Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;->TOP:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         if-eq v0, v2, :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         sget-object v2, Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;->INLINE:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         if-ne v0, v2, :cond_6
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->horizontalAlignment:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         sget-object v2, Lcom/facebook/widget/LikeView$HorizontalAlignment;->RIGHT:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         if-ne v0, v2, :cond_6
    //         :cond_1
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->containerView:Landroid/widget/LinearLayout;
    //         iget-object v2, p0, Lcom/facebook/widget/LikeView;->likeButton:Lcom/facebook/internal/LikeButton;
    //         invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->containerView:Landroid/widget/LinearLayout;
    //         iget-object v2, p0, Lcom/facebook/widget/LikeView;->likeButton:Lcom/facebook/internal/LikeButton;
    //         invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
    //         :goto_2
    //         sget-object v0, Lcom/facebook/widget/LikeView$2;->$SwitchMap$com$facebook$widget$LikeView$AuxiliaryViewPosition:[I
    //         iget-object v2, p0, Lcom/facebook/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         invoke-virtual {v2}, Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;->ordinal()I
    //         move-result v2
    //         aget v0, v0, v2
    //         packed-switch v0, :pswitch_data_0
    //         :cond_2
    //         :goto_3
    //         return-void
    //         :cond_3
    //         iget-object v2, p0, Lcom/facebook/widget/LikeView;->horizontalAlignment:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         sget-object v5, Lcom/facebook/widget/LikeView$HorizontalAlignment;->CENTER:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         if-ne v2, v5, :cond_4
    //         move v2, v3
    //         goto :goto_0
    //         :cond_4
    //         const/4 v2, 0x5
    //         goto :goto_0
    //         :cond_5
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeViewStyle:Lcom/facebook/widget/LikeView$Style;
    //         sget-object v1, Lcom/facebook/widget/LikeView$Style;->BOX_COUNT:Lcom/facebook/widget/LikeView$Style;
    //         if-ne v0, v1, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         invoke-virtual {v0}, Lcom/facebook/internal/LikeActionController;->getLikeCountString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_2
    //         invoke-direct {p0}, Lcom/facebook/widget/LikeView;->updateBoxCountCaretPosition()V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeBoxCountView:Lcom/facebook/internal/LikeBoxCountView;
    //         move-object v1, v0
    //         goto :goto_1
    //         :cond_6
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->containerView:Landroid/widget/LinearLayout;
    //         invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->containerView:Landroid/widget/LinearLayout;
    //         invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V
    //         goto :goto_2
    //         :pswitch_0
    //         iget v0, p0, Lcom/facebook/widget/LikeView;->edgePadding:I
    //         iget v2, p0, Lcom/facebook/widget/LikeView;->edgePadding:I
    //         iget v3, p0, Lcom/facebook/widget/LikeView;->edgePadding:I
    //         iget v4, p0, Lcom/facebook/widget/LikeView;->internalPadding:I
    //         invoke-virtual {v1, v0, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V
    //         goto :goto_3
    //         :pswitch_1
    //         iget v0, p0, Lcom/facebook/widget/LikeView;->edgePadding:I
    //         iget v2, p0, Lcom/facebook/widget/LikeView;->internalPadding:I
    //         iget v3, p0, Lcom/facebook/widget/LikeView;->edgePadding:I
    //         iget v4, p0, Lcom/facebook/widget/LikeView;->edgePadding:I
    //         invoke-virtual {v1, v0, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V
    //         goto :goto_3
    //         :pswitch_2
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->horizontalAlignment:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         sget-object v2, Lcom/facebook/widget/LikeView$HorizontalAlignment;->RIGHT:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         if-ne v0, v2, :cond_7
    //         iget v0, p0, Lcom/facebook/widget/LikeView;->edgePadding:I
    //         iget v2, p0, Lcom/facebook/widget/LikeView;->edgePadding:I
    //         iget v3, p0, Lcom/facebook/widget/LikeView;->internalPadding:I
    //         iget v4, p0, Lcom/facebook/widget/LikeView;->edgePadding:I
    //         invoke-virtual {v1, v0, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V
    //         goto :goto_3
    //         :cond_7
    //         iget v0, p0, Lcom/facebook/widget/LikeView;->internalPadding:I
    //         iget v2, p0, Lcom/facebook/widget/LikeView;->edgePadding:I
    //         iget v3, p0, Lcom/facebook/widget/LikeView;->edgePadding:I
    //         iget v4, p0, Lcom/facebook/widget/LikeView;->edgePadding:I
    //         invoke-virtual {v1, v0, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V
    //         goto :goto_3
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //             :pswitch_2
    //         .end packed-switch
    */

    private fun updateLikeStateAndLayout() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeButton:Lcom/facebook/internal/LikeButton;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/LikeButton;->setLikeState(Z)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;
    //         invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeBoxCountView:Lcom/facebook/internal/LikeBoxCountView;
    //         invoke-virtual {v0, v2}, Lcom/facebook/internal/LikeBoxCountView;->setText(Ljava/lang/String;)V
    //         :goto_0
    //         invoke-direct {p0}, Lcom/facebook/widget/LikeView;->updateLayout()V
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeButton:Lcom/facebook/internal/LikeButton;
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         invoke-virtual {v1}, Lcom/facebook/internal/LikeActionController;->isObjectLiked()Z
    //         move-result v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/LikeButton;->setLikeState(Z)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         invoke-virtual {v1}, Lcom/facebook/internal/LikeActionController;->getSocialSentence()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeBoxCountView:Lcom/facebook/internal/LikeBoxCountView;
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->likeActionController:Lcom/facebook/internal/LikeActionController;
    //         invoke-virtual {v1}, Lcom/facebook/internal/LikeActionController;->getLikeCountString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Lcom/facebook/internal/LikeBoxCountView;->setText(Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun getOnErrorListener(): com.facebook.widget.LikeView.OnErrorListener { return TODO("body: ()Lcom/facebook/widget/LikeView$OnErrorListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->onErrorListener:Lcom/facebook/widget/LikeView$OnErrorListener;
    //         return-object v0
    */

    protected fun onDetachedFromWindow() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, v0}, Lcom/facebook/widget/LikeView;->setObjectId(Ljava/lang/String;)V
    //         invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V
    //         return-void
    */

    public fun setAuxiliaryViewPosition(p0: com.facebook.widget.LikeView.AuxiliaryViewPosition) { /* TODO(body): (Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_1
    //         :goto_0
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         if-eq v0, p1, :cond_0
    //         iput-object p1, p0, Lcom/facebook/widget/LikeView;->auxiliaryViewPosition:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         invoke-direct {p0}, Lcom/facebook/widget/LikeView;->updateLayout()V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         sget-object p1, Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;->DEFAULT:Lcom/facebook/widget/LikeView$AuxiliaryViewPosition;
    //         goto :goto_0
    */

    public fun setForegroundColor(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/facebook/widget/LikeView;->foregroundColor:I
    //         if-eq v0, p1, :cond_0
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->socialSentenceView:Landroid/widget/TextView;
    //         invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V
    //         :cond_0
    //         return-void
    */

    public fun setHorizontalAlignment(p0: com.facebook.widget.LikeView.HorizontalAlignment) { /* TODO(body): (Lcom/facebook/widget/LikeView$HorizontalAlignment;)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_1
    //         :goto_0
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->horizontalAlignment:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         if-eq v0, p1, :cond_0
    //         iput-object p1, p0, Lcom/facebook/widget/LikeView;->horizontalAlignment:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         invoke-direct {p0}, Lcom/facebook/widget/LikeView;->updateLayout()V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         sget-object p1, Lcom/facebook/widget/LikeView$HorizontalAlignment;->DEFAULT:Lcom/facebook/widget/LikeView$HorizontalAlignment;
    //         goto :goto_0
    */

    public fun setLikeViewStyle(p0: com.facebook.widget.LikeView.Style) { /* TODO(body): (Lcom/facebook/widget/LikeView$Style;)V */ }
    /*
    //         .locals 1
    //         if-eqz p1, :cond_1
    //         :goto_0
    //         iget-object v0, p0, Lcom/facebook/widget/LikeView;->likeViewStyle:Lcom/facebook/widget/LikeView$Style;
    //         if-eq v0, p1, :cond_0
    //         iput-object p1, p0, Lcom/facebook/widget/LikeView;->likeViewStyle:Lcom/facebook/widget/LikeView$Style;
    //         invoke-direct {p0}, Lcom/facebook/widget/LikeView;->updateLayout()V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         sget-object p1, Lcom/facebook/widget/LikeView$Style;->DEFAULT:Lcom/facebook/widget/LikeView$Style;
    //         goto :goto_0
    */

    public fun setObjectId(p0: String) { /* TODO(body): (Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         invoke-static {p1, v0}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/widget/LikeView;->objectId:Ljava/lang/String;
    //         invoke-static {v0, v1}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         invoke-direct {p0, v0}, Lcom/facebook/widget/LikeView;->setObjectIdForced(Ljava/lang/String;)V
    //         invoke-direct {p0}, Lcom/facebook/widget/LikeView;->updateLikeStateAndLayout()V
    //         :cond_0
    //         return-void
    */

    public fun setOnErrorListener(p0: com.facebook.widget.LikeView.OnErrorListener) { /* TODO(body): (Lcom/facebook/widget/LikeView$OnErrorListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/facebook/widget/LikeView;->onErrorListener:Lcom/facebook/widget/LikeView$OnErrorListener;
    //         return-void
    */

    companion object {
    private val NO_FOREGROUND_COLOR: Int = 0

    public @JvmStatic fun handleOnActivityResult(p0: android.content.Context, p1: Int, p2: Int, p3: android.content.Intent): Boolean { return TODO("body: (Landroid/content/Context;IILandroid/content/Intent;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1, p2, p3}, Lcom/facebook/internal/LikeActionController;->handleOnActivityResult(Landroid/content/Context;IILandroid/content/Intent;)Z
    //         move-result v0
    //         return v0
    */

    }
}
