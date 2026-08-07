package android.support.v4.view

// Auto-emitted from smali source: GravityCompat.java.
// 5 fields, 6 methods.

open class GravityCompat {
    public constructor()

    companion object {
    @JvmField public val END: Int = 0x800005
    val IMPL: android.support.v4.view.GravityCompat.GravityCompatImpl = null!!
    @JvmField public val RELATIVE_HORIZONTAL_GRAVITY_MASK: Int = 0x800007
    @JvmField public val RELATIVE_LAYOUT_DIRECTION: Int = 0x800000
    @JvmField public val START: Int = 0x800003

    public @JvmStatic fun apply(gravity: Int, w: Int, h: Int, container: android.graphics.Rect, xAdj: Int, yAdj: Int, outRect: android.graphics.Rect, layoutDirection: Int) { /* TODO(body): (IIILandroid/graphics/Rect;IILandroid/graphics/Rect;I)V */ }
    /*
    //         .locals 9
    //         sget-object v0, Landroid/support/v4/view/GravityCompat;->IMPL:Landroid/support/v4/view/GravityCompat$GravityCompatImpl;
    //         move v1, p0
    //         move v2, p1
    //         move v3, p2
    //         move-object v4, p3
    //         move v5, p4
    //         move v6, p5
    //         move-object v7, p6
    //         move/from16 v8, p7
    //         invoke-interface/range {v0 .. v8}, Landroid/support/v4/view/GravityCompat$GravityCompatImpl;->apply(IIILandroid/graphics/Rect;IILandroid/graphics/Rect;I)V
    //         return-void
    */

    public @JvmStatic fun apply(gravity: Int, w: Int, h: Int, container: android.graphics.Rect, outRect: android.graphics.Rect, layoutDirection: Int) { /* TODO(body): (IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V */ }
    /*
    //         .locals 7
    //         sget-object v0, Landroid/support/v4/view/GravityCompat;->IMPL:Landroid/support/v4/view/GravityCompat$GravityCompatImpl;
    //         move v1, p0
    //         move v2, p1
    //         move v3, p2
    //         move-object v4, p3
    //         move-object v5, p4
    //         move v6, p5
    //         invoke-interface/range {v0 .. v6}, Landroid/support/v4/view/GravityCompat$GravityCompatImpl;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V
    //         return-void
    */

    public @JvmStatic fun applyDisplay(gravity: Int, display: android.graphics.Rect, inoutObj: android.graphics.Rect, layoutDirection: Int) { /* TODO(body): (ILandroid/graphics/Rect;Landroid/graphics/Rect;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/GravityCompat;->IMPL:Landroid/support/v4/view/GravityCompat$GravityCompatImpl;
    //         invoke-interface {v0, p0, p1, p2, p3}, Landroid/support/v4/view/GravityCompat$GravityCompatImpl;->applyDisplay(ILandroid/graphics/Rect;Landroid/graphics/Rect;I)V
    //         return-void
    */

    public @JvmStatic fun getAbsoluteGravity(gravity: Int, layoutDirection: Int): Int { return TODO("body: (II)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/GravityCompat;->IMPL:Landroid/support/v4/view/GravityCompat$GravityCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/GravityCompat$GravityCompatImpl;->getAbsoluteGravity(II)I
    //         move-result v0
    //         return v0
    */

    }
}
