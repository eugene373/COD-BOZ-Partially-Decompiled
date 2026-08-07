package android.support.v4.view

// Auto-emitted from smali source: ViewCompatApi21.java.
// 0 fields, 9 methods.

open class ViewCompatApi21 {
    constructor()

    companion object {
    public @JvmStatic fun getElevation(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/view/View;->getElevation()F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getTransitionName(view: android.view.View): String { return TODO("body: (Landroid/view/View;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/view/View;->getTransitionName()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getTranslationZ(view: android.view.View): Float { return TODO("body: (Landroid/view/View;)F") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/view/View;->getTranslationZ()F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun requestApplyInsets(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V
    //         return-void
    */

    public @JvmStatic fun setElevation(view: android.view.View, elevation: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1}, Landroid/view/View;->setElevation(F)V
    //         return-void
    */

    public @JvmStatic fun setOnApplyWindowInsetsListener(view: android.view.View, listener: android.support.v4.view.OnApplyWindowInsetsListener) { /* TODO(body): (Landroid/view/View;Landroid/support/v4/view/OnApplyWindowInsetsListener;)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/view/ViewCompatApi21$1;
    //         invoke-direct {v0, p1}, Landroid/support/v4/view/ViewCompatApi21$1;-><init>(Landroid/support/v4/view/OnApplyWindowInsetsListener;)V
    //         invoke-virtual {p0, v0}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V
    //         return-void
    */

    public @JvmStatic fun setTransitionName(view: android.view.View, transitionName: String) { /* TODO(body): (Landroid/view/View;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V
    //         return-void
    */

    public @JvmStatic fun setTranslationZ(view: android.view.View, translationZ: Float) { /* TODO(body): (Landroid/view/View;F)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationZ(F)V
    //         return-void
    */

    }
}
