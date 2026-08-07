package android.support.v4.graphics.drawable

// Auto-emitted from smali source: RoundedBitmapDrawableFactory.java.
// 0 fields, 4 methods.

open class RoundedBitmapDrawableFactory_DefaultRoundedBitmapDrawable: android.support.v4.graphics.drawable.RoundedBitmapDrawable() {
    constructor(res: android.content.res.Resources, bitmap: android.graphics.Bitmap)

    fun gravityCompatApply(gravity: Int, bitmapWidth: Int, bitmapHeight: Int, bounds: android.graphics.Rect, outRect: android.graphics.Rect) { /* TODO(body): (IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         move v0, p1
    //         move v1, p2
    //         move v2, p3
    //         move-object v3, p4
    //         move-object v4, p5
    //         invoke-static/range {v0 .. v5}, Landroid/support/v4/view/GravityCompat;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V
    //         return-void
    */

    public fun hasMipMap(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawableFactory$DefaultRoundedBitmapDrawable;->mBitmap:Landroid/graphics/Bitmap;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawableFactory$DefaultRoundedBitmapDrawable;->mBitmap:Landroid/graphics/Bitmap;
    //         invoke-static {v0}, Landroid/support/v4/graphics/BitmapCompat;->hasMipMap(Landroid/graphics/Bitmap;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun setMipMap(mipMap: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawableFactory$DefaultRoundedBitmapDrawable;->mBitmap:Landroid/graphics/Bitmap;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawableFactory$DefaultRoundedBitmapDrawable;->mBitmap:Landroid/graphics/Bitmap;
    //         invoke-static {v0, p1}, Landroid/support/v4/graphics/BitmapCompat;->setHasMipMap(Landroid/graphics/Bitmap;Z)V
    //         invoke-virtual {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawableFactory$DefaultRoundedBitmapDrawable;->invalidateSelf()V
    //         :cond_0
    //         return-void
    */

}
