package android.support.v4.app

// Auto-emitted from smali source: FragmentManager.java.
// 2 fields, 4 methods.

open class FragmentManagerImpl_Anon5: android.view.animation.Animation.AnimationListener {
    val this$0: android.support.v4.app.FragmentManagerImpl
    val val$fragment: android.support.v4.app.Fragment

    constructor(p0: android.support.v4.app.FragmentManagerImpl, p1: android.support.v4.app.Fragment)

    public fun onAnimationEnd(animation: android.view.animation.Animation) { /* TODO(body): (Landroid/view/animation/Animation;)V */ }
    /*
    //         .locals 6
    //         const/4 v3, 0x0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl$5;->val$fragment:Landroid/support/v4/app/Fragment;
    //         iget-object v0, v0, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl$5;->val$fragment:Landroid/support/v4/app/Fragment;
    //         const/4 v1, 0x0
    //         iput-object v1, v0, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
    //         iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl$5;->this$0:Landroid/support/v4/app/FragmentManagerImpl;
    //         iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl$5;->val$fragment:Landroid/support/v4/app/Fragment;
    //         iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl$5;->val$fragment:Landroid/support/v4/app/Fragment;
    //         iget v2, v2, Landroid/support/v4/app/Fragment;->mStateAfterAnimating:I
    //         move v4, v3
    //         move v5, v3
    //         invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;IIIZ)V
    //         :cond_0
    //         return-void
    */

    public fun onAnimationRepeat(animation: android.view.animation.Animation) { /* TODO(body): (Landroid/view/animation/Animation;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onAnimationStart(animation: android.view.animation.Animation) { /* TODO(body): (Landroid/view/animation/Animation;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
