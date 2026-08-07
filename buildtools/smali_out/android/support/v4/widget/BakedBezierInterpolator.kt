package android.support.v4.widget

// Auto-emitted from smali source: BakedBezierInterpolator.java.
// 3 fields, 4 methods.

class BakedBezierInterpolator: android.view.animation.Interpolator {
    private constructor()

    public fun getInterpolation(input: Float): Float { return TODO("body: (F)F") }
    /*
    //         .locals 7
    //         const/high16 v4, 0x3f800000    # 1.0f
    //         const/4 v5, 0x0
    //         cmpl-float v6, p1, v4
    //         if-ltz v6, :cond_0
    //         :goto_0
    //         return v4
    //         :cond_0
    //         cmpg-float v4, p1, v5
    //         if-gtz v4, :cond_1
    //         move v4, v5
    //         goto :goto_0
    //         :cond_1
    //         sget-object v4, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
    //         array-length v4, v4
    //         add-int/lit8 v4, v4, -0x1
    //         int-to-float v4, v4
    //         mul-float/2addr v4, p1
    //         float-to-int v4, v4
    //         sget-object v5, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
    //         array-length v5, v5
    //         add-int/lit8 v5, v5, -0x2
    //         invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I
    //         move-result v1
    //         .local v1, "position":I
    //         int-to-float v4, v1
    //         sget v5, Landroid/support/v4/widget/BakedBezierInterpolator;->STEP_SIZE:F
    //         mul-float v2, v4, v5
    //         .local v2, "quantized":F
    //         sub-float v0, p1, v2
    //         .local v0, "difference":F
    //         sget v4, Landroid/support/v4/widget/BakedBezierInterpolator;->STEP_SIZE:F
    //         div-float v3, v0, v4
    //         .local v3, "weight":F
    //         sget-object v4, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
    //         aget v4, v4, v1
    //         sget-object v5, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
    //         add-int/lit8 v6, v1, 0x1
    //         aget v5, v5, v6
    //         sget-object v6, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
    //         aget v6, v6, v1
    //         sub-float/2addr v5, v6
    //         mul-float/2addr v5, v3
    //         add-float/2addr v4, v5
    //         goto :goto_0
    */

    companion object {
    private val INSTANCE: android.support.v4.widget.BakedBezierInterpolator = null!!
    private val STEP_SIZE: Float = 0.0f
    private val VALUES: FloatArray = null!!

    public @JvmStatic fun getInstance(): android.support.v4.widget.BakedBezierInterpolator { return TODO("body: ()Landroid/support/v4/widget/BakedBezierInterpolator;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/widget/BakedBezierInterpolator;->INSTANCE:Landroid/support/v4/widget/BakedBezierInterpolator;
    //         return-object v0
    */

    }
}
