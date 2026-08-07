package android.support.v4.view

// Auto-emitted from smali source: ViewPropertyAnimatorCompat.java.
// 1 fields, 4 methods.

open class ViewPropertyAnimatorCompat_ICSViewPropertyAnimatorCompatImpl_MyVpaListener: android.support.v4.view.ViewPropertyAnimatorListener {
    var mVpa: android.support.v4.view.ViewPropertyAnimatorCompat

    constructor(vpa: android.support.v4.view.ViewPropertyAnimatorCompat)

    public fun onAnimationCancel(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 3
    //         const/high16 v2, 0x7e000000
    //         invoke-virtual {p1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
    //         move-result-object v1
    //         .local v1, "listenerTag":Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         .local v0, "listener":Landroid/support/v4/view/ViewPropertyAnimatorListener;
    //         instance-of v2, v1, Landroid/support/v4/view/ViewPropertyAnimatorListener;
    //         if-eqz v2, :cond_0
    //         move-object v0, v1
    //         check-cast v0, Landroid/support/v4/view/ViewPropertyAnimatorListener;
    //         :cond_0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorListener;->onAnimationCancel(Landroid/view/View;)V
    //         :cond_1
    //         return-void
    */

    public fun onAnimationEnd(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 4
    //         iget-object v2, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$MyVpaListener;->mVpa:Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         invoke-static {v2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->access$400(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)I
    //         move-result v2
    //         if-ltz v2, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$MyVpaListener;->mVpa:Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         invoke-static {v2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->access$400(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)I
    //         move-result v2
    //         const/4 v3, 0x0
    //         invoke-static {p1, v2, v3}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
    //         iget-object v2, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$MyVpaListener;->mVpa:Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         const/4 v3, -0x1
    //         invoke-static {v2, v3}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->access$402(Landroid/support/v4/view/ViewPropertyAnimatorCompat;I)I
    //         :cond_0
    //         iget-object v2, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$MyVpaListener;->mVpa:Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         invoke-static {v2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->access$000(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)Ljava/lang/Runnable;
    //         move-result-object v2
    //         if-eqz v2, :cond_1
    //         iget-object v2, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$MyVpaListener;->mVpa:Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         invoke-static {v2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->access$000(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)Ljava/lang/Runnable;
    //         move-result-object v2
    //         invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    //         :cond_1
    //         const/high16 v2, 0x7e000000
    //         invoke-virtual {p1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
    //         move-result-object v1
    //         .local v1, "listenerTag":Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         .local v0, "listener":Landroid/support/v4/view/ViewPropertyAnimatorListener;
    //         instance-of v2, v1, Landroid/support/v4/view/ViewPropertyAnimatorListener;
    //         if-eqz v2, :cond_2
    //         move-object v0, v1
    //         check-cast v0, Landroid/support/v4/view/ViewPropertyAnimatorListener;
    //         :cond_2
    //         if-eqz v0, :cond_3
    //         invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorListener;->onAnimationEnd(Landroid/view/View;)V
    //         :cond_3
    //         return-void
    */

    public fun onAnimationStart(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 4
    //         iget-object v2, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$MyVpaListener;->mVpa:Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         invoke-static {v2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->access$400(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)I
    //         move-result v2
    //         if-ltz v2, :cond_0
    //         const/4 v2, 0x2
    //         const/4 v3, 0x0
    //         invoke-static {p1, v2, v3}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
    //         :cond_0
    //         iget-object v2, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$MyVpaListener;->mVpa:Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         invoke-static {v2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->access$100(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)Ljava/lang/Runnable;
    //         move-result-object v2
    //         if-eqz v2, :cond_1
    //         iget-object v2, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$MyVpaListener;->mVpa:Landroid/support/v4/view/ViewPropertyAnimatorCompat;
    //         invoke-static {v2}, Landroid/support/v4/view/ViewPropertyAnimatorCompat;->access$100(Landroid/support/v4/view/ViewPropertyAnimatorCompat;)Ljava/lang/Runnable;
    //         move-result-object v2
    //         invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    //         :cond_1
    //         const/high16 v2, 0x7e000000
    //         invoke-virtual {p1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
    //         move-result-object v1
    //         .local v1, "listenerTag":Ljava/lang/Object;
    //         const/4 v0, 0x0
    //         .local v0, "listener":Landroid/support/v4/view/ViewPropertyAnimatorListener;
    //         instance-of v2, v1, Landroid/support/v4/view/ViewPropertyAnimatorListener;
    //         if-eqz v2, :cond_2
    //         move-object v0, v1
    //         check-cast v0, Landroid/support/v4/view/ViewPropertyAnimatorListener;
    //         :cond_2
    //         if-eqz v0, :cond_3
    //         invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPropertyAnimatorListener;->onAnimationStart(Landroid/view/View;)V
    //         :cond_3
    //         return-void
    */

}
