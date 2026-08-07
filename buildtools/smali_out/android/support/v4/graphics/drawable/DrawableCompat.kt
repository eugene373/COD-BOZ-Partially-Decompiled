package android.support.v4.graphics.drawable

// Auto-emitted from smali source: DrawableCompat.java.
// 1 fields, 10 methods.

open class DrawableCompat {
    public constructor()

    companion object {
    val IMPL: android.support.v4.graphics.drawable.DrawableCompat.DrawableImpl = null!!

    public @JvmStatic fun isAutoMirrored(drawable: android.graphics.drawable.Drawable): Boolean { return TODO("body: (Landroid/graphics/drawable/Drawable;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->isAutoMirrored(Landroid/graphics/drawable/Drawable;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun jumpToCurrentState(drawable: android.graphics.drawable.Drawable) { /* TODO(body): (Landroid/graphics/drawable/Drawable;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->jumpToCurrentState(Landroid/graphics/drawable/Drawable;)V
    //         return-void
    */

    public @JvmStatic fun setAutoMirrored(drawable: android.graphics.drawable.Drawable, mirrored: Boolean) { /* TODO(body): (Landroid/graphics/drawable/Drawable;Z)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->setAutoMirrored(Landroid/graphics/drawable/Drawable;Z)V
    //         return-void
    */

    public @JvmStatic fun setHotspot(drawable: android.graphics.drawable.Drawable, x: Float, y: Float) { /* TODO(body): (Landroid/graphics/drawable/Drawable;FF)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
    //         invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->setHotspot(Landroid/graphics/drawable/Drawable;FF)V
    //         return-void
    */

    public @JvmStatic fun setHotspotBounds(drawable: android.graphics.drawable.Drawable, left: Int, top: Int, right: Int, bottom: Int) { /* TODO(body): (Landroid/graphics/drawable/Drawable;IIII)V */ }
    /*
    //         .locals 6
    //         sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
    //         move-object v1, p0
    //         move v2, p1
    //         move v3, p2
    //         move v4, p3
    //         move v5, p4
    //         invoke-interface/range {v0 .. v5}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->setHotspotBounds(Landroid/graphics/drawable/Drawable;IIII)V
    //         return-void
    */

    public @JvmStatic fun setTint(drawable: android.graphics.drawable.Drawable, tint: Int) { /* TODO(body): (Landroid/graphics/drawable/Drawable;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->setTint(Landroid/graphics/drawable/Drawable;I)V
    //         return-void
    */

    public @JvmStatic fun setTintList(drawable: android.graphics.drawable.Drawable, tint: android.content.res.ColorStateList) { /* TODO(body): (Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->setTintList(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    //         return-void
    */

    public @JvmStatic fun setTintMode(drawable: android.graphics.drawable.Drawable, tintMode: android.graphics.PorterDuff.Mode) { /* TODO(body): (Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->setTintMode(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    //         return-void
    */

    }
}
