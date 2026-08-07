package android.support.v4.view

// Auto-emitted from smali source: ViewPropertyAnimatorCompatJB.java.
// 0 fields, 5 methods.

open class ViewPropertyAnimatorCompatJB {
    constructor()

    companion object {
    public @JvmStatic fun setListener(view: android.view.View, listener: android.support.v4.view.ViewPropertyAnimatorListener) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/view/ViewPropertyAnimatorListener;)V */ }
    /*
    //         .locals 2
    //         if-eqz p1, :cond_0
    //         invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
    //         move-result-object v0
    //         new-instance v1, Landroid/support/v4/view/ViewPropertyAnimatorCompatJB$1;
    //         invoke-direct {v1, p1, p0}, Landroid/support/v4/view/ViewPropertyAnimatorCompatJB$1;-><init>(Landroid/support/v4/view/ViewPropertyAnimatorListener;Landroid/view/View;)V
    //         invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
    //         goto :goto_0
    */

    public @JvmStatic fun withEndAction(view: android.view.View, runnable: Runnable) { /* TODO(body): (Landroid/view/View;Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;
    //         return-void
    */

    public @JvmStatic fun withLayer(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->withLayer()Landroid/view/ViewPropertyAnimator;
    //         return-void
    */

    public @JvmStatic fun withStartAction(view: android.view.View, runnable: Runnable) { /* TODO(body): (Landroid/view/View;Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;
    //         return-void
    */

    }
}
