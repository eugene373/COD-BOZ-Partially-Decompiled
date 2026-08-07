package android.support.v4.widget

// Auto-emitted from smali source: EdgeEffectCompatIcs.java.
// 0 fields, 9 methods.

open class EdgeEffectCompatIcs {
    constructor()

    companion object {
    public @JvmStatic fun draw(edgeEffect: Object, canvas: android.graphics.Canvas): Boolean { return TODO("body: (Ljava/lang/Object;Landroid/graphics/Canvas;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/EdgeEffect;
    //         .end local p0    # "edgeEffect":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun finish(edgeEffect: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/EdgeEffect;
    //         .end local p0    # "edgeEffect":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/widget/EdgeEffect;->finish()V
    //         return-void
    */

    public @JvmStatic fun isFinished(edgeEffect: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/EdgeEffect;
    //         .end local p0    # "edgeEffect":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/widget/EdgeEffect;->isFinished()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun newEdgeEffect(context: android.content.Context): Object { return TODO("body: (Landroid/content/Context;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/widget/EdgeEffect;
    //         invoke-direct {v0, p0}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V
    //         return-object v0
    */

    public @JvmStatic fun onAbsorb(edgeEffect: Object, velocity: Int): Boolean { return TODO("body: (Ljava/lang/Object;I)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/EdgeEffect;
    //         .end local p0    # "edgeEffect":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V
    //         const/4 v0, 0x1
    //         return v0
    */

    public @JvmStatic fun onPull(edgeEffect: Object, deltaDistance: Float): Boolean { return TODO("body: (Ljava/lang/Object;F)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/widget/EdgeEffect;
    //         .end local p0    # "edgeEffect":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/widget/EdgeEffect;->onPull(F)V
    //         const/4 v0, 0x1
    //         return v0
    */

    public @JvmStatic fun onRelease(edgeEffect: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 2
    //         move-object v0, p0
    //         check-cast v0, Landroid/widget/EdgeEffect;
    //         .local v0, "eff":Landroid/widget/EdgeEffect;
    //         invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V
    //         invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
    //         move-result v1
    //         return v1
    */

    public @JvmStatic fun setSize(edgeEffect: Object, width: Int, height: Int) { /* TODO(body): (Ljava/lang/Object;II)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/widget/EdgeEffect;
    //         .end local p0    # "edgeEffect":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2}, Landroid/widget/EdgeEffect;->setSize(II)V
    //         return-void
    */

    }
}
