package android.support.v4.view

// Auto-emitted from smali source: ViewCompatApi21.java.
// 1 fields, 2 methods.

class ViewCompatApi21_Anon1: android.view.View.OnApplyWindowInsetsListener {
    val val$listener: android.support.v4.view.OnApplyWindowInsetsListener

    constructor(p0: android.support.v4.view.OnApplyWindowInsetsListener)

    public fun onApplyWindowInsets(view: android.view.View, windowInsets: android.view.WindowInsets): android.view.WindowInsets { return TODO("body: (Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/view/WindowInsetsCompatApi21;
    //         invoke-direct {v0, p2}, Landroid/support/v4/view/WindowInsetsCompatApi21;-><init>(Landroid/view/WindowInsets;)V
    //         .local v0, "insets":Landroid/support/v4/view/WindowInsetsCompatApi21;
    //         iget-object v1, p0, Landroid/support/v4/view/ViewCompatApi21$1;->val$listener:Landroid/support/v4/view/OnApplyWindowInsetsListener;
    //         invoke-interface {v1, p1, v0}, Landroid/support/v4/view/OnApplyWindowInsetsListener;->onApplyWindowInsets(Landroid/view/View;Landroid/support/v4/view/WindowInsetsCompat;)Landroid/support/v4/view/WindowInsetsCompat;
    //         move-result-object v0
    //         .end local v0    # "insets":Landroid/support/v4/view/WindowInsetsCompatApi21;
    //         check-cast v0, Landroid/support/v4/view/WindowInsetsCompatApi21;
    //         .restart local v0    # "insets":Landroid/support/v4/view/WindowInsetsCompatApi21;
    //         invoke-virtual {v0}, Landroid/support/v4/view/WindowInsetsCompatApi21;->unwrap()Landroid/view/WindowInsets;
    //         move-result-object v1
    //         return-object v1
    */

}
