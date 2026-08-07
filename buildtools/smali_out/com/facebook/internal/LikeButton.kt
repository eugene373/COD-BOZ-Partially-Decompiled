package com.facebook.internal

// Auto-emitted from smali source: LikeButton.java.
// 1 fields, 4 methods.

open class LikeButton: android.widget.Button() {
    private var isLiked: Boolean

    public constructor(p0: android.content.Context, p1: Boolean)

    private fun initialize() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const/16 v0, 0x10
    //         invoke-virtual {p0, v0}, Lcom/facebook/internal/LikeButton;->setGravity(I)V
    //         invoke-virtual {p0}, Lcom/facebook/internal/LikeButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$color;->com_facebook_likebutton_text_color:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/internal/LikeButton;->setTextColor(I)V
    //         const/4 v0, 0x0
    //         invoke-virtual {p0}, Lcom/facebook/internal/LikeButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         sget v2, Lcom/facebook/android/R$dimen;->com_facebook_likebutton_text_size:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F
    //         move-result v1
    //         invoke-virtual {p0, v0, v1}, Lcom/facebook/internal/LikeButton;->setTextSize(IF)V
    //         sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;
    //         invoke-virtual {p0, v0}, Lcom/facebook/internal/LikeButton;->setTypeface(Landroid/graphics/Typeface;)V
    //         invoke-virtual {p0}, Lcom/facebook/internal/LikeButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$dimen;->com_facebook_likebutton_compound_drawable_padding:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/internal/LikeButton;->setCompoundDrawablePadding(I)V
    //         invoke-virtual {p0}, Lcom/facebook/internal/LikeButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$dimen;->com_facebook_likebutton_padding_left:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v0
    //         invoke-virtual {p0}, Lcom/facebook/internal/LikeButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v1
    //         sget v2, Lcom/facebook/android/R$dimen;->com_facebook_likebutton_padding_top:I
    //         invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v1
    //         invoke-virtual {p0}, Lcom/facebook/internal/LikeButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v2
    //         sget v3, Lcom/facebook/android/R$dimen;->com_facebook_likebutton_padding_right:I
    //         invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v2
    //         invoke-virtual {p0}, Lcom/facebook/internal/LikeButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v3
    //         sget v4, Lcom/facebook/android/R$dimen;->com_facebook_likebutton_padding_bottom:I
    //         invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    //         move-result v3
    //         invoke-virtual {p0, v0, v1, v2, v3}, Lcom/facebook/internal/LikeButton;->setPadding(IIII)V
    //         invoke-direct {p0}, Lcom/facebook/internal/LikeButton;->updateForLikeStatus()V
    //         return-void
    */

    private fun updateForLikeStatus() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         iget-boolean v0, p0, Lcom/facebook/internal/LikeButton;->isLiked:Z
    //         if-eqz v0, :cond_0
    //         sget v0, Lcom/facebook/android/R$drawable;->com_facebook_button_like_selected:I
    //         invoke-virtual {p0, v0}, Lcom/facebook/internal/LikeButton;->setBackgroundResource(I)V
    //         sget v0, Lcom/facebook/android/R$drawable;->com_facebook_button_like_icon_selected:I
    //         invoke-virtual {p0, v0, v1, v1, v1}, Lcom/facebook/internal/LikeButton;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
    //         invoke-virtual {p0}, Lcom/facebook/internal/LikeButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$string;->com_facebook_like_button_liked:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/internal/LikeButton;->setText(Ljava/lang/CharSequence;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         sget v0, Lcom/facebook/android/R$drawable;->com_facebook_button_like:I
    //         invoke-virtual {p0, v0}, Lcom/facebook/internal/LikeButton;->setBackgroundResource(I)V
    //         sget v0, Lcom/facebook/android/R$drawable;->com_facebook_button_like_icon:I
    //         invoke-virtual {p0, v0, v1, v1, v1}, Lcom/facebook/internal/LikeButton;->setCompoundDrawablesWithIntrinsicBounds(IIII)V
    //         invoke-virtual {p0}, Lcom/facebook/internal/LikeButton;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         sget v1, Lcom/facebook/android/R$string;->com_facebook_like_button_not_liked:I
    //         invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/facebook/internal/LikeButton;->setText(Ljava/lang/CharSequence;)V
    //         goto :goto_0
    */

    public fun setLikeState(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-boolean v0, p0, Lcom/facebook/internal/LikeButton;->isLiked:Z
    //         if-eq p1, v0, :cond_0
    //         iput-boolean p1, p0, Lcom/facebook/internal/LikeButton;->isLiked:Z
    //         invoke-direct {p0}, Lcom/facebook/internal/LikeButton;->updateForLikeStatus()V
    //         :cond_0
    //         return-void
    */

}
