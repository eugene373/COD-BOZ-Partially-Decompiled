package android.support.v4.app

// Auto-emitted from smali source: ActionBarDrawerToggle.java.
// 5 fields, 6 methods.

open class ActionBarDrawerToggle_SlideDrawable: android.graphics.drawable.InsetDrawable(), android.graphics.drawable.Drawable.Callback {
    private val mHasMirroring: Boolean
    private var mOffset: Float
    private var mPosition: Float
    private val mTmpRect: android.graphics.Rect
    val this$0: android.support.v4.app.ActionBarDrawerToggle

    private constructor(wrapped: android.support.v4.app.ActionBarDrawerToggle, p1: android.graphics.drawable.Drawable)

    constructor(x0: android.support.v4.app.ActionBarDrawerToggle, x1: android.graphics.drawable.Drawable, x2: android.support.v4.app.ActionBarDrawerToggle.1)

    public fun draw(canvas: android.graphics.Canvas) { /* TODO(body): (Landroid/graphics/Canvas;)V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         const/4 v0, 0x1
    //         iget-object v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mTmpRect:Landroid/graphics/Rect;
    //         invoke-virtual {p0, v3}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->copyBounds(Landroid/graphics/Rect;)V
    //         invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
    //         iget-object v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->this$0:Landroid/support/v4/app/ActionBarDrawerToggle;
    //         invoke-static {v3}, Landroid/support/v4/app/ActionBarDrawerToggle;->access$400(Landroid/support/v4/app/ActionBarDrawerToggle;)Landroid/app/Activity;
    //         move-result-object v3
    //         invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
    //         move-result-object v3
    //         invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;
    //         move-result-object v3
    //         invoke-static {v3}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
    //         move-result v3
    //         if-ne v3, v0, :cond_2
    //         move v1, v0
    //         .local v1, "isLayoutRTL":Z
    //         :goto_0
    //         if-eqz v1, :cond_0
    //         const/4 v0, -0x1
    //         .local v0, "flipRtl":I
    //         :cond_0
    //         iget-object v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mTmpRect:Landroid/graphics/Rect;
    //         invoke-virtual {v3}, Landroid/graphics/Rect;->width()I
    //         move-result v2
    //         .local v2, "width":I
    //         iget v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mOffset:F
    //         neg-float v3, v3
    //         int-to-float v4, v2
    //         mul-float/2addr v3, v4
    //         iget v4, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mPosition:F
    //         mul-float/2addr v3, v4
    //         int-to-float v4, v0
    //         mul-float/2addr v3, v4
    //         invoke-virtual {p1, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V
    //         if-eqz v1, :cond_1
    //         iget-boolean v3, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mHasMirroring:Z
    //         if-nez v3, :cond_1
    //         int-to-float v3, v2
    //         invoke-virtual {p1, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V
    //         const/high16 v3, -0x40800000    # -1.0f
    //         const/high16 v4, 0x3f800000    # 1.0f
    //         invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->scale(FF)V
    //         :cond_1
    //         invoke-super {p0, p1}, Landroid/graphics/drawable/InsetDrawable;->draw(Landroid/graphics/Canvas;)V
    //         invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
    //         return-void
    //         .end local v0    # "flipRtl":I
    //         .end local v1    # "isLayoutRTL":Z
    //         .end local v2    # "width":I
    //         :cond_2
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun getPosition(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget v0, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mPosition:F
    //         return v0
    */

    public fun setOffset(offset: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mOffset:F
    //         invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->invalidateSelf()V
    //         return-void
    */

    public fun setPosition(position: Float) { /* TODO(body): (F)V */ }
    /*
    //         .locals 0
    //         iput p1, p0, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->mPosition:F
    //         invoke-virtual {p0}, Landroid/support/v4/app/ActionBarDrawerToggle$SlideDrawable;->invalidateSelf()V
    //         return-void
    */

}
