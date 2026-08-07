package android.support.v4.app

// Auto-emitted from smali source: NoSaveStateFrameLayout.java.
// 0 fields, 4 methods.

open class NoSaveStateFrameLayout: android.widget.FrameLayout() {
    public constructor(context: android.content.Context)

    protected fun dispatchRestoreInstanceState(p0: android.util.SparseArray) { /* TODO(body): (Landroid/util/SparseArray;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/util/SparseArray",
    //                 "<",
    //                 "Landroid/os/Parcelable;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .local p1, "container":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/NoSaveStateFrameLayout;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V
    //         return-void
    */

    protected fun dispatchSaveInstanceState(p0: android.util.SparseArray) { /* TODO(body): (Landroid/util/SparseArray;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/util/SparseArray",
    //                 "<",
    //                 "Landroid/os/Parcelable;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .local p1, "container":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/NoSaveStateFrameLayout;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V
    //         return-void
    */

    companion object {
    @JvmStatic fun wrap(child: android.view.View): android.view.ViewGroup { return TODO("body: (Landroid/view/View;)Landroid/view/ViewGroup;") }
    /*
    //         .locals 5
    //         const/4 v4, -0x1
    //         new-instance v2, Landroid/support/v4/app/NoSaveStateFrameLayout;
    //         invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
    //         move-result-object v3
    //         invoke-direct {v2, v3}, Landroid/support/v4/app/NoSaveStateFrameLayout;-><init>(Landroid/content/Context;)V
    //         .local v2, "wrapper":Landroid/support/v4/app/NoSaveStateFrameLayout;
    //         invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    //         move-result-object v0
    //         .local v0, "childParams":Landroid/view/ViewGroup$LayoutParams;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v2, v0}, Landroid/support/v4/app/NoSaveStateFrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    //         :cond_0
    //         new-instance v1, Landroid/widget/FrameLayout$LayoutParams;
    //         invoke-direct {v1, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V
    //         .local v1, "lp":Landroid/widget/FrameLayout$LayoutParams;
    //         invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    //         invoke-virtual {v2, p0}, Landroid/support/v4/app/NoSaveStateFrameLayout;->addView(Landroid/view/View;)V
    //         return-object v2
    */

    }
}
