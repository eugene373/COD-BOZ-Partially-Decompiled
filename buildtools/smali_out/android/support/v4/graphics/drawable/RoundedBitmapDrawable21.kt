package android.support.v4.graphics.drawable

// Auto-emitted from smali source: RoundedBitmapDrawable21.java.
// 0 fields, 5 methods.

open class RoundedBitmapDrawable21: android.support.v4.graphics.drawable.RoundedBitmapDrawable() {
    protected constructor(res: android.content.res.Resources, bitmap: android.graphics.Bitmap)

    public fun getOutline(outline: android.graphics.Outline) { /* TODO(body): (Landroid/graphics/Outline;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable21;->updateDstRect()V
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable21;->mDstRect:Landroid/graphics/Rect;
    //         invoke-virtual {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable21;->getCornerRadius()F
    //         move-result v1
    //         invoke-virtual {p1, v0, v1}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V
    //         return-void
    */

    fun gravityCompatApply(gravity: Int, bitmapWidth: Int, bitmapHeight: Int, bounds: android.graphics.Rect, outRect: android.graphics.Rect) { /* TODO(body): (IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         move v0, p1
    //         move v1, p2
    //         move v2, p3
    //         move-object v3, p4
    //         move-object v4, p5
    //         invoke-static/range {v0 .. v5}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V
    //         return-void
    */

    public fun hasMipMap(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable21;->mBitmap:Landroid/graphics/Bitmap;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable21;->mBitmap:Landroid/graphics/Bitmap;
    //         invoke-virtual {v0}, Landroid/graphics/Bitmap;->hasMipMap()Z
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
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable21;->mBitmap:Landroid/graphics/Bitmap;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable21;->mBitmap:Landroid/graphics/Bitmap;
    //         invoke-virtual {v0, p1}, Landroid/graphics/Bitmap;->setHasMipMap(Z)V
    //         invoke-virtual {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable21;->invalidateSelf()V
    //         :cond_0
    //         return-void
    */

}
