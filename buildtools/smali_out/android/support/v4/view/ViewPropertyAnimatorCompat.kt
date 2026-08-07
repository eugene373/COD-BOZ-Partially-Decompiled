package android.support.v4.view

// Auto-emitted from smali source: ViewPropertyAnimatorCompat.java.
// 7 fields, 41 methods.

open class ViewPropertyAnimatorCompat {
    private var mEndAction: Runnable
    private var mOldLayerType: Int
    private var mStartAction: Runnable
    private var mView: java.lang.ref.WeakReference

    constructor(view: android.view.View)

    public fun alpha(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->alpha(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun alphaBy(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->alphaBy(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun cancel() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->cancel(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         :cond_0
    //         return-void
    */

    public fun getDuration(): Long { return TODO("body: ()J") }
    /*
    //         .locals 4
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->getDuration(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)J
    //         move-result-wide v2
    //         :goto_0
    //         return-wide v2
    //         :cond_0
    //         const-wide/16 v2, 0x0
    //         goto :goto_0
    */

    public fun getInterpolator(): android.view.animation.Interpolator { return TODO("body: ()Landroid/view/animation/Interpolator;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->getInterpolator(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)Landroid/view/animation/Interpolator;
    //         move-result-object v1
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun getStartDelay(): Long { return TODO("body: ()J") }
    /*
    //         .locals 4
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->getStartDelay(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)J
    //         move-result-wide v2
    //         :goto_0
    //         return-wide v2
    //         :cond_0
    //         const-wide/16 v2, 0x0
    //         goto :goto_0
    */

    public fun rotation(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->rotation(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun rotationBy(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->rotationBy(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun rotationX(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->rotationX(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun rotationXBy(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->rotationXBy(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun rotationY(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->rotationY(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun rotationYBy(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->rotationYBy(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun scaleX(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->scaleX(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun scaleXBy(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->scaleXBy(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun scaleY(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->scaleY(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun scaleYBy(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->scaleYBy(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun setDuration(value: Long): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (J)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 3
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->setDuration(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;J)V
    //         :cond_0
    //         return-object p0
    */

    public fun setInterpolator(value: android.view.animation.Interpolator): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (Landroid/view/animation/Interpolator;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->setInterpolator(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;Landroid/view/animation/Interpolator;)V
    //         :cond_0
    //         return-object p0
    */

    public fun setListener(listener: android.support.v4.view.ViewPropertyAnimatorListener): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (Landroid/support/v4/view/ViewPropertyAnimatorListener;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->setListener(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;Landroid/support/v4/view/ViewPropertyAnimatorListener;)V
    //         :cond_0
    //         return-object p0
    */

    public fun setStartDelay(value: Long): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (J)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 3
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1, p2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->setStartDelay(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;J)V
    //         :cond_0
    //         return-object p0
    */

    public fun setUpdateListener(listener: android.support.v4.view.ViewPropertyAnimatorUpdateListener): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (Landroid/support/v4/view/ViewPropertyAnimatorUpdateListener;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->setUpdateListener(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;Landroid/support/v4/view/ViewPropertyAnimatorUpdateListener;)V
    //         :cond_0
    //         return-object p0
    */

    public fun start() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->start(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         :cond_0
    //         return-void
    */

    public fun translationX(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->translationX(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun translationXBy(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->translationXBy(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun translationY(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->translationY(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun translationYBy(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->translationYBy(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun withEndAction(runnable: Runnable): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (Ljava/lang/Runnable;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->withEndAction(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;Ljava/lang/Runnable;)V
    //         :cond_0
    //         return-object p0
    */

    public fun withLayer(): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: ()Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->withLayer(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;)V
    //         :cond_0
    //         return-object p0
    */

    public fun withStartAction(runnable: Runnable): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (Ljava/lang/Runnable;)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->withStartAction(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;Ljava/lang/Runnable;)V
    //         :cond_0
    //         return-object p0
    */

    public fun x(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->x(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun xBy(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->xBy(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun y(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->y(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    public fun yBy(value: Float): android.support.v4.view.ViewPropertyAnimatorCompat { return TODO("body: (F)Landroid/support/v4/view/ViewPropertyAnimatorCompat;") }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->mView:Ljava/lang/ref/WeakReference;
    //         invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         .local v0, "view":Landroid/view/View;
    //         if-eqz v0, :cond_0
    //         sget-object v1, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->IMPL:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;
    //         invoke-interface {v1, p0, v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl;->yBy(Landroid/support/v4/view/ViewPropertyAnimatorCompat;Landroid/view/View;F)V
    //         :cond_0
    //         return-object p0
    */

    companion object {
    val IMPL: android.support.v4.view.ViewPropertyAnimatorCompat.ViewPropertyAnimatorCompatImpl = null!!
    val LISTENER_TAG_ID: Int = 0x7e000000
    private val TAG: String = "ViewAnimatorCompat"
    }
}
