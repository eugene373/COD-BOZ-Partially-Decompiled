package android.support.v4.widget

// Auto-emitted from smali source: MaterialProgressDrawable.java.
// 2 fields, 4 methods.

open class MaterialProgressDrawable_Anon2: android.view.animation.Animation.AnimationListener {
    val this$0: android.support.v4.widget.MaterialProgressDrawable
    val val$ring: android.support.v4.widget.MaterialProgressDrawable.Ring

    constructor(p0: android.support.v4.widget.MaterialProgressDrawable, p1: android.support.v4.widget.MaterialProgressDrawable.Ring)

    public fun onAnimationEnd(animation: android.view.animation.Animation) { /* TODO(body): (Landroid/view/animation/Animation;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onAnimationRepeat(animation: android.view.animation.Animation) { /* TODO(body): (Landroid/view/animation/Animation;)V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->storeOriginals()V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->goToNextColor()V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         iget-object v1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->getEndTrim()F
    //         move-result v1
    //         invoke-virtual {v0, v1}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setStartTrim(F)V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         iget-boolean v0, v0, Landroid/support/v4/widget/MaterialProgressDrawable;->mFinishing:Z
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         iput-boolean v2, v0, Landroid/support/v4/widget/MaterialProgressDrawable;->mFinishing:Z
    //         const-wide/16 v0, 0x535
    //         invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->val$ring:Landroid/support/v4/widget/MaterialProgressDrawable$Ring;
    //         invoke-virtual {v0, v2}, Landroid/support/v4/widget/MaterialProgressDrawable$Ring;->setShowArrow(Z)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         iget-object v1, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-static {v1}, Landroid/support/v4/widget/MaterialProgressDrawable;->access$500(Landroid/support/v4/widget/MaterialProgressDrawable;)F
    //         move-result v1
    //         const/high16 v2, 0x3f800000    # 1.0f
    //         add-float/2addr v1, v2
    //         const/high16 v2, 0x40a00000    # 5.0f
    //         rem-float/2addr v1, v2
    //         invoke-static {v0, v1}, Landroid/support/v4/widget/MaterialProgressDrawable;->access$502(Landroid/support/v4/widget/MaterialProgressDrawable;F)F
    //         goto :goto_0
    */

    public fun onAnimationStart(animation: android.view.animation.Animation) { /* TODO(body): (Landroid/view/animation/Animation;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$2;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Landroid/support/v4/widget/MaterialProgressDrawable;->access$502(Landroid/support/v4/widget/MaterialProgressDrawable;F)F
    //         return-void
    */

}
