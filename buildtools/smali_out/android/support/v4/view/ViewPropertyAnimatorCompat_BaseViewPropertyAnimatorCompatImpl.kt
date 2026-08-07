package android.support.v4.view

// Auto-emitted from smali source: ViewPropertyAnimatorCompat.java.
// 1 fields, 38 methods.

open class ViewPropertyAnimatorCompat_BaseViewPropertyAnimatorCompatImpl: android.support.v4.view.ViewPropertyAnimatorCompat.ViewPropertyAnimatorCompatImpl {
    var mStarterMap: java.util.WeakHashMap

    constructor()

    private fun postStartMessage(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         .local v0, "starter":Ljava/lang/Runnable;
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->mStarterMap:Ljava/util/WeakHashMap;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->mStarterMap:Ljava/util/WeakHashMap;
    //         invoke-virtual {v1, p2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         .end local v0    # "starter":Ljava/lang/Runnable;
    //         check-cast v0, Ljava/lang/Runnable;
    //         .restart local v0    # "starter":Ljava/lang/Runnable;
    //         :cond_0
    //         if-nez v0, :cond_2
    //         new-instance v0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl$Starter;
    //         .end local v0    # "starter":Ljava/lang/Runnable;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, p1, p2, v1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl$Starter;-><init>(Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;Landroid/support/v4/view/ViewPropertyAnimatorCompat$1;)V
    //         .restart local v0    # "starter":Ljava/lang/Runnable;
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->mStarterMap:Ljava/util/WeakHashMap;
    //         if-nez v1, :cond_1
    //         new-instance v1, Ljava/util/WeakHashMap;
    //         invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V
    //         iput-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->mStarterMap:Ljava/util/WeakHashMap;
    //         :cond_1
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->mStarterMap:Ljava/util/WeakHashMap;
    //         invoke-virtual {v1, p2, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_2
    //         invoke-virtual {p2, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
    //         invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    //         return-void
    */

    private fun removeStartMessage(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 2
    //         const/4 v0, 0x0
    //         .local v0, "starter":Ljava/lang/Runnable;
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->mStarterMap:Ljava/util/WeakHashMap;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->mStarterMap:Ljava/util/WeakHashMap;
    //         invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         .end local v0    # "starter":Ljava/lang/Runnable;
    //         check-cast v0, Ljava/lang/Runnable;
    //         .restart local v0    # "starter":Ljava/lang/Runnable;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
    //         :cond_0
    //         return-void
    */

    private fun startAnimation(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V */ }
    /*
    //         .locals 5
    //         const/high16 v4, 0x7e000000
    //         invoke-virtual {p2, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
    //         move-result-object v2
    //         .local v2, "listenerTag":Ljava/lang/Object;
    //         const/4 v1, 0x0
    //         .local v1, "listener":Landroid/support/v4/view/ViewPropertyAnimatorListener;
    //         instance-of v4, v2, Landroid/support/v4/view/ViewPropertyAnimatorListener;
    //         if-eqz v4, :cond_0
    //         move-object v1, v2
    //         check-cast v1, Landroid/support/v4/view/ViewPropertyAnimatorListener;
    //         :cond_0
    //         invoke-static {p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->access$100(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)Ljava/lang/Runnable;
    //         move-result-object v3
    //         .local v3, "startAction":Ljava/lang/Runnable;
    //         invoke-static {p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->access$000(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)Ljava/lang/Runnable;
    //         move-result-object v0
    //         .local v0, "endAction":Ljava/lang/Runnable;
    //         if-eqz v3, :cond_1
    //         invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    //         :cond_1
    //         if-eqz v1, :cond_2
    //         invoke-interface {v1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorListener;->onAnimationStart(Landroid/view/View;)V
    //         invoke-interface {v1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorListener;->onAnimationEnd(Landroid/view/View;)V
    //         :cond_2
    //         if-eqz v0, :cond_3
    //         invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    //         :cond_3
    //         iget-object v4, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->mStarterMap:Ljava/util/WeakHashMap;
    //         if-eqz v4, :cond_4
    //         iget-object v4, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->mStarterMap:Ljava/util/WeakHashMap;
    //         invoke-virtual {v4, p2}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         :cond_4
    //         return-void
    */

    public fun alpha(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun alphaBy(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun cancel(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun getDuration(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View): Long { return TODO("body: (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)J") }
    /*
    //         .locals 2
    //         const-wide/16 v0, 0x0
    //         return-wide v0
    */

    public fun getInterpolator(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View): android.view.animation.Interpolator { return TODO("body: (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)Landroid/view/animation/Interpolator;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getStartDelay(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View): Long { return TODO("body: (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)J") }
    /*
    //         .locals 2
    //         const-wide/16 v0, 0x0
    //         return-wide v0
    */

    public fun rotation(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun rotationBy(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun rotationX(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun rotationXBy(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun rotationY(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun rotationYBy(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun scaleX(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun scaleXBy(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun scaleY(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun scaleYBy(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun setDuration(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Long) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;J)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setInterpolator(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: android.view.animation.Interpolator) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;Landroid/view/animation/Interpolator;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setListener(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, listener: android.support.v4.view.ViewPropertyAnimatorListener) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;Landroid/support/v4/view/ViewPropertyAnimatorListener;)V */ }
    /*
    //         .locals 1
    //         const/high16 v0, 0x7e000000
    //         invoke-virtual {p2, v0, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
    //         return-void
    */

    public fun setStartDelay(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Long) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;J)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setUpdateListener(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, listener: android.support.v4.view.ViewPropertyAnimatorUpdateListener) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;Landroid/support/v4/view/ViewPropertyAnimatorUpdateListener;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun start(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->removeStartMessage(Landroid/view/View;)V
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->startAnimation(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun translationX(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun translationXBy(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun translationY(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun translationYBy(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun withEndAction(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, runnable: Runnable) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p3}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->access$002(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun withLayer(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun withStartAction(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, runnable: Runnable) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p3}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->access$102(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun x(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun xBy(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun y(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

    public fun yBy(vpa: android.support.v4.view.ViewPropertyAnimatorCompat, view: android.view.View, value: Float) { /* TODO(body): (Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl;->postStartMessage(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         return-void
    */

}
