package android.support.v4.widget

// Auto-emitted from smali source: CircleImageView.java.
// 5 fields, 2 methods.

open class CircleImageView_OvalShadow: android.graphics.drawable.shapes.OvalShape() {
    private var mCircleDiameter: Int
    private var mRadialGradient: android.graphics.RadialGradient
    private var mShadowPaint: android.graphics.Paint
    private var mShadowRadius: Int
    val this$0: android.support.v4.widget.CircleImageView

    public constructor(shadowRadius: android.support.v4.widget.CircleImageView, circleDiameter: Int, p2: Int)

    public fun draw(canvas: android.graphics.Canvas, paint: android.graphics.Paint) { /* TODO(body): (Landroid/graphics/Canvas;Landroid/graphics/Paint;)V */ }
    /*
    //         .locals 6
    //         iget-object v2, p0, Landroid/support/v4/widget/CircleImageView$OvalShadow;->this$0:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v2}, Landroid/support/v4/widget/CircleImageView;->getWidth()I
    //         move-result v1
    //         .local v1, "viewWidth":I
    //         iget-object v2, p0, Landroid/support/v4/widget/CircleImageView$OvalShadow;->this$0:Landroid/support/v4/widget/CircleImageView;
    //         invoke-virtual {v2}, Landroid/support/v4/widget/CircleImageView;->getHeight()I
    //         move-result v0
    //         .local v0, "viewHeight":I
    //         div-int/lit8 v2, v1, 0x2
    //         int-to-float v2, v2
    //         div-int/lit8 v3, v0, 0x2
    //         int-to-float v3, v3
    //         iget v4, p0, Landroid/support/v4/widget/CircleImageView$OvalShadow;->mCircleDiameter:I
    //         div-int/lit8 v4, v4, 0x2
    //         iget v5, p0, Landroid/support/v4/widget/CircleImageView$OvalShadow;->mShadowRadius:I
    //         add-int/2addr v4, v5
    //         int-to-float v4, v4
    //         iget-object v5, p0, Landroid/support/v4/widget/CircleImageView$OvalShadow;->mShadowPaint:Landroid/graphics/Paint;
    //         invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
    //         div-int/lit8 v2, v1, 0x2
    //         int-to-float v2, v2
    //         div-int/lit8 v3, v0, 0x2
    //         int-to-float v3, v3
    //         iget v4, p0, Landroid/support/v4/widget/CircleImageView$OvalShadow;->mCircleDiameter:I
    //         div-int/lit8 v4, v4, 0x2
    //         int-to-float v4, v4
    //         invoke-virtual {p1, v2, v3, v4, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
    //         return-void
    */

}
