package com.google.android.gms.internal

// Auto-emitted from smali.
// 2 fields, 3 methods.

class dp: android.widget.FrameLayout(), android.view.View.OnClickListener {
    private val nr: android.app.Activity
    private val sg: android.widget.ImageButton

    public constructor(p0: android.app.Activity, p1: Int)

    public fun o(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Lcom/google/android/gms/internal/dp;->sg:Landroid/widget/ImageButton;
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x4
    //         :goto_0
    //         invoke-virtual {v1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V
    //         return-void
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun onClick(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/dp;->nr:Landroid/app/Activity;
    //         invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    //         return-void
    */

}
