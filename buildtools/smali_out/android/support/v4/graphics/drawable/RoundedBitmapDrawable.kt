package android.support.v4.graphics.drawable

// Auto-emitted from smali source: RoundedBitmapDrawable.java.
// 12 fields, 28 methods.

open class RoundedBitmapDrawable: android.graphics.drawable.Drawable() {
    private var mApplyGravity: Boolean
    var mBitmap: android.graphics.Bitmap
    private var mBitmapHeight: Int
    private var mBitmapShader: android.graphics.BitmapShader
    private var mBitmapWidth: Int
    private var mCornerRadius: Float
    val mDstRect: android.graphics.Rect
    val mDstRectF: android.graphics.RectF
    private var mGravity: Int
    private var mPaint: android.graphics.Paint
    private var mTargetDensity: Int

    constructor(res: android.content.res.Resources, bitmap: android.graphics.Bitmap)

    private fun computeBitmapSize() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mBitmap:Landroid/graphics/Bitmap;
    //         iget v1, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mTargetDensity:I
    //         invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->getScaledWidth(I)I
    //         move-result v0
    //         iput v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mBitmapWidth:I
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mBitmap:Landroid/graphics/Bitmap;
    //         iget v1, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mTargetDensity:I
    //         invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->getScaledHeight(I)I
    //         move-result v0
    //         iput v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mBitmapHeight:I
    //         return-void
    */

    public fun draw(canvas: android.graphics.Canvas) { /* TODO(body): (Landroid/graphics/Canvas;)V */ }
    /*
    //         .locals 6
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mBitmap:Landroid/graphics/Bitmap;
    //         .local v0, "bitmap":Landroid/graphics/Bitmap;
    //         if-nez v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->updateDstRect()V
    //         iget-object v1, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         .local v1, "paint":Landroid/graphics/Paint;
    //         invoke-virtual {v1}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;
    //         move-result-object v2
    //         .local v2, "shader":Landroid/graphics/Shader;
    //         if-nez v2, :cond_1
    //         const/4 v3, 0x0
    //         iget-object v4, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mDstRect:Landroid/graphics/Rect;
    //         invoke-virtual {p1, v0, v3, v4, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    //         goto :goto_0
    //         :cond_1
    //         iget-object v3, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mDstRectF:Landroid/graphics/RectF;
    //         iget v4, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mCornerRadius:F
    //         iget v5, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mCornerRadius:F
    //         invoke-virtual {p1, v3, v4, v5, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
    //         goto :goto_0
    */

    public fun getAlpha(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I
    //         move-result v0
    //         return v0
    */

    public fun getBitmap(): android.graphics.Bitmap { return TODO("body: ()Landroid/graphics/Bitmap;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mBitmap:Landroid/graphics/Bitmap;
    //         return-object v0
    */

    public fun getColorFilter(): android.graphics.ColorFilter { return TODO("body: ()Landroid/graphics/ColorFilter;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         invoke-virtual {v0}, Landroid/graphics/Paint;->getColorFilter()Landroid/graphics/ColorFilter;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getCornerRadius(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mCornerRadius:F
    //         return v0
    */

    public fun getGravity(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mGravity:I
    //         return v0
    */

    public fun getIntrinsicHeight(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mBitmapHeight:I
    //         return v0
    */

    public fun getIntrinsicWidth(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mBitmapWidth:I
    //         return v0
    */

    public fun getOpacity(): Int { return TODO("body: ()I") }
    /*
    //         .locals 4
    //         const/4 v1, -0x3
    //         iget v2, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mGravity:I
    //         const/16 v3, 0x77
    //         if-eq v2, v3, :cond_1
    //         :cond_0
    //         :goto_0
    //         return v1
    //         :cond_1
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mBitmap:Landroid/graphics/Bitmap;
    //         .local v0, "bm":Landroid/graphics/Bitmap;
    //         if-eqz v0, :cond_0
    //         invoke-virtual {v0}, Landroid/graphics/Bitmap;->hasAlpha()Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         iget-object v2, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         invoke-virtual {v2}, Landroid/graphics/Paint;->getAlpha()I
    //         move-result v2
    //         const/16 v3, 0xff
    //         if-lt v2, v3, :cond_0
    //         iget v2, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mCornerRadius:F
    //         invoke-static {v2}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->isGreaterThanZero(F)Z
    //         move-result v2
    //         if-nez v2, :cond_0
    //         const/4 v1, -0x1
    //         goto :goto_0
    */

    public fun getPaint(): android.graphics.Paint { return TODO("body: ()Landroid/graphics/Paint;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         return-object v0
    */

    fun gravityCompatApply(gravity: Int, bitmapWidth: Int, bitmapHeight: Int, bounds: android.graphics.Rect, outRect: android.graphics.Rect) { /* TODO(body): (IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
    */

    public fun hasAntiAlias(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         invoke-virtual {v0}, Landroid/graphics/Paint;->isAntiAlias()Z
    //         move-result v0
    //         return v0
    */

    public fun hasMipMap(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
    */

    public fun setAlpha(alpha: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 2
    //         iget-object v1, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         invoke-virtual {v1}, Landroid/graphics/Paint;->getAlpha()I
    //         move-result v0
    //         .local v0, "oldAlpha":I
    //         if-eq p1, v0, :cond_0
    //         iget-object v1, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setAlpha(I)V
    //         invoke-virtual {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->invalidateSelf()V
    //         :cond_0
    //         return-void
    */

    public fun setAntiAlias(aa: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V
    //         invoke-virtual {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->invalidateSelf()V
    //         return-void
    */

    public fun setColorFilter(cf: android.graphics.ColorFilter) { /* TODO(body): (Landroid/graphics/ColorFilter;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
    //         invoke-virtual {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->invalidateSelf()V
    //         return-void
    */

    public fun setCornerRadius(cornerRadius: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 2
    //         invoke-static {p1}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->isGreaterThanZero(F)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         iget-object v1, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mBitmapShader:Landroid/graphics/BitmapShader;
    //         invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
    //         :goto_0
    //         iput p1, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mCornerRadius:F
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
    //         goto :goto_0
    */

    public fun setDither(dither: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setDither(Z)V
    //         invoke-virtual {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->invalidateSelf()V
    //         return-void
    */

    public fun setFilterBitmap(filter: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mPaint:Landroid/graphics/Paint;
    //         invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V
    //         invoke-virtual {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->invalidateSelf()V
    //         return-void
    */

    public fun setGravity(gravity: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mGravity:I
    //         if-eq v0, p1, :cond_0
    //         iput p1, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mGravity:I
    //         const/4 v0, 0x1
    //         iput-boolean v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mApplyGravity:Z
    //         invoke-virtual {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->invalidateSelf()V
    //         :cond_0
    //         return-void
    */

    public fun setMipMap(mipMap: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/lang/UnsupportedOperationException;
    //         invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
    //         throw v0
    */

    public fun setTargetDensity(density: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mTargetDensity:I
    //         if-eq v0, p1, :cond_2
    //         if-nez p1, :cond_0
    //         const/16 p1, 0xa0
    //         .end local p1    # "density":I
    //         :cond_0
    //         iput p1, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mTargetDensity:I
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mBitmap:Landroid/graphics/Bitmap;
    //         if-eqz v0, :cond_1
    //         invoke-direct {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->computeBitmapSize()V
    //         :cond_1
    //         invoke-virtual {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->invalidateSelf()V
    //         :cond_2
    //         return-void
    */

    public fun setTargetDensity(canvas: android.graphics.Canvas) { /* TODO(body): (Landroid/graphics/Canvas;)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/graphics/Canvas;->getDensity()I
    //         move-result v0
    //         invoke-virtual {p0, v0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->setTargetDensity(I)V
    //         return-void
    */

    public fun setTargetDensity(metrics: android.util.DisplayMetrics) { /* TODO(body): (Landroid/util/DisplayMetrics;)V */ }
    /*
    //         .locals 1
    //         iget v0, p1, Landroid/util/DisplayMetrics;->densityDpi:I
    //         invoke-virtual {p0, v0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->setTargetDensity(I)V
    //         return-void
    */

    fun updateDstRect() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         iget-boolean v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mApplyGravity:Z
    //         if-eqz v0, :cond_0
    //         iget v1, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mGravity:I
    //         iget v2, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mBitmapWidth:I
    //         iget v3, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mBitmapHeight:I
    //         invoke-virtual {p0}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->getBounds()Landroid/graphics/Rect;
    //         move-result-object v4
    //         iget-object v5, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mDstRect:Landroid/graphics/Rect;
    //         move-object v0, p0
    //         invoke-virtual/range {v0 .. v5}, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->gravityCompatApply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V
    //         iget-object v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mDstRectF:Landroid/graphics/RectF;
    //         iget-object v1, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mDstRect:Landroid/graphics/Rect;
    //         invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V
    //         const/4 v0, 0x0
    //         iput-boolean v0, p0, Landroid/support/v4/graphics/drawable/RoundedBitmapDrawable;->mApplyGravity:Z
    //         :cond_0
    //         return-void
    */

    companion object {
    private val DEFAULT_PAINT_FLAGS: Int = 0x6

    private @JvmStatic fun isGreaterThanZero(toCompare: Float): Boolean { return TODO("body: (F)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I
    //         move-result v0
    //         if-lez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    }
}
