package android.support.v4.widget

// Auto-emitted from smali source: DrawerLayoutCompatApi21.java.
// 0 fields, 5 methods.

open class DrawerLayoutCompatApi21 {
    constructor()

    companion object {
    public @JvmStatic fun applyMarginInsets(lp: android.view.ViewGroup.MarginLayoutParams, insets: Object, gravity: Int) { /* TODO(body): (Landroid/view/ViewGroup$MarginLayoutParams;Ljava/lang/Object;I)V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         move-object v0, p1
    //         check-cast v0, Landroid/view/WindowInsets;
    //         .local v0, "wi":Landroid/view/WindowInsets;
    //         const/4 v1, 0x3
    //         if-ne p2, v1, :cond_1
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I
    //         move-result v1
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
    //         move-result v2
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
    //         move-result v3
    //         invoke-virtual {v0, v1, v2, v4, v3}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;
    //         move-result-object v0
    //         :cond_0
    //         :goto_0
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I
    //         move-result v1
    //         iput v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
    //         move-result v1
    //         iput v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I
    //         move-result v1
    //         iput v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
    //         move-result v1
    //         iput v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x5
    //         if-ne p2, v1, :cond_0
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
    //         move-result v1
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I
    //         move-result v2
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
    //         move-result v3
    //         invoke-virtual {v0, v4, v1, v2, v3}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun configureApplyInsets(drawerLayout: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 1
    //         instance-of v0, p0, Landroid/support/v4/widget/DrawerLayoutImpl;
    //         if-eqz v0, :cond_0
    //         new-instance v0, Landroid/support/v4/widget/DrawerLayoutCompatApi21$InsetsListener;
    //         invoke-direct {v0}, Landroid/support/v4/widget/DrawerLayoutCompatApi21$InsetsListener;-><init>()V
    //         invoke-virtual {p0, v0}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V
    //         const/16 v0, 0x500
    //         invoke-virtual {p0, v0}, Landroid/view/View;->setSystemUiVisibility(I)V
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun dispatchChildInsets(child: android.view.View, insets: Object, gravity: Int) { /* TODO(body): (Landroid/view/View;Ljava/lang/Object;I)V */ }
    /*
    //         .locals 5
    //         const/4 v4, 0x0
    //         move-object v0, p1
    //         check-cast v0, Landroid/view/WindowInsets;
    //         .local v0, "wi":Landroid/view/WindowInsets;
    //         const/4 v1, 0x3
    //         if-ne p2, v1, :cond_1
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I
    //         move-result v1
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
    //         move-result v2
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
    //         move-result v3
    //         invoke-virtual {v0, v1, v2, v4, v3}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;
    //         move-result-object v0
    //         :cond_0
    //         :goto_0
    //         invoke-virtual {p0, v0}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    //         return-void
    //         :cond_1
    //         const/4 v1, 0x5
    //         if-ne p2, v1, :cond_0
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
    //         move-result v1
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I
    //         move-result v2
    //         invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I
    //         move-result v3
    //         invoke-virtual {v0, v4, v1, v2, v3}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;
    //         move-result-object v0
    //         goto :goto_0
    */

    public @JvmStatic fun getTopInset(insets: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         if-eqz p0, :cond_0
    //         check-cast p0, Landroid/view/WindowInsets;
    //         .end local p0    # "insets":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I
    //         move-result v0
    //         :goto_0
    //         return v0
    //         .restart local p0    # "insets":Ljava/lang/Object;
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
