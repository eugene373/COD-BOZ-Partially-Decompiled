package android.support.v4.widget

// Auto-emitted from smali source: MaterialProgressDrawable.java.
// 0 fields, 3 methods.

open class MaterialProgressDrawable_StartCurveInterpolator: android.view.animation.AccelerateDecelerateInterpolator() {
    private constructor()

    constructor(x0: android.support.v4.widget.MaterialProgressDrawable.1)

    public fun getInterpolation(input: Float): Float { return TODO("body: (F)F") }
    /*
    //         .locals 2
    //         const/high16 v0, 0x3f800000    # 1.0f
    //         const/high16 v1, 0x40000000    # 2.0f
    //         mul-float/2addr v1, p1
    //         invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F
    //         move-result v0
    //         invoke-super {p0, v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;->getInterpolation(F)F
    //         move-result v0
    //         return v0
    */

}
