package android.support.v4.widget

// Auto-emitted from smali source: EdgeEffectCompat.java.
// 2 fields, 9 methods.

open class EdgeEffectCompat {
    private var mEdgeEffect: Object

    public constructor(context: android.content.Context)

    public fun draw(canvas: android.graphics.Canvas): Boolean { return TODO("body: (Landroid/graphics/Canvas;)Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->draw(Ljava/lang/Object;Landroid/graphics/Canvas;)Z
    //         move-result v0
    //         return v0
    */

    public fun finish() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->finish(Ljava/lang/Object;)V
    //         return-void
    */

    public fun isFinished(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->isFinished(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun onAbsorb(velocity: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->onAbsorb(Ljava/lang/Object;I)Z
    //         move-result v0
    //         return v0
    */

    public fun onPull(deltaDistance: Float): Boolean { return TODO("body: (F)Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->onPull(Ljava/lang/Object;F)Z
    //         move-result v0
    //         return v0
    */

    public fun onRelease(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->onRelease(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun setSize(width: Int, height: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/widget/EdgeEffectCompat;->IMPL:Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;
    //         iget-object v1, p0, Landroid/support/v4/widget/EdgeEffectCompat;->mEdgeEffect:Ljava/lang/Object;
    //         invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/widget/EdgeEffectCompat$EdgeEffectImpl;->setSize(Ljava/lang/Object;II)V
    //         return-void
    */

    companion object {
    private val IMPL: android.support.v4.widget.EdgeEffectCompat.EdgeEffectImpl = null!!
    }
}
