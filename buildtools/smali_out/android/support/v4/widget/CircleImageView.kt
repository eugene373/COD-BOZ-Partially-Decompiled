package android.support.v4.widget

// Auto-emitted from smali source: CircleImageView.java.
// 8 fields, 7 methods.

open class CircleImageView: android.widget.ImageView() {
    private var mListener: android.view.animation.Animation.AnimationListener
    private var mShadowRadius: Int

    public constructor(context: android.content.Context, color: Int, radius: Float)

    private fun elevationSupported(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x15
    //         if-lt v0, v1, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun onAnimationEnd() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Landroid/widget/ImageView;->onAnimationEnd()V
    //         iget-object v0, p0, Landroid/support/v4/widget/CircleImageView;->mListener:Landroid/view/animation/Animation$AnimationListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CircleImageView;->mListener:Landroid/view/animation/Animation$AnimationListener;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/CircleImageView;->getAnimation()Landroid/view/animation/Animation;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Landroid/view/animation/Animation$AnimationListener;->onAnimationEnd(Landroid/view/animation/Animation;)V
    //         :cond_0
    //         return-void
    */

    public fun onAnimationStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-super {p0}, Landroid/widget/ImageView;->onAnimationStart()V
    //         iget-object v0, p0, Landroid/support/v4/widget/CircleImageView;->mListener:Landroid/view/animation/Animation$AnimationListener;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Landroid/support/v4/widget/CircleImageView;->mListener:Landroid/view/animation/Animation$AnimationListener;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/CircleImageView;->getAnimation()Landroid/view/animation/Animation;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Landroid/view/animation/Animation$AnimationListener;->onAnimationStart(Landroid/view/animation/Animation;)V
    //         :cond_0
    //         return-void
    */

    protected fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 3
    //         invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V
    //         invoke-direct {p0}, Landroid/support/v4/widget/CircleImageView;->elevationSupported()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/widget/CircleImageView;->getMeasuredWidth()I
    //         move-result v0
    //         iget v1, p0, Landroid/support/v4/widget/CircleImageView;->mShadowRadius:I
    //         mul-int/lit8 v1, v1, 0x2
    //         add-int/2addr v0, v1
    //         invoke-virtual {p0}, Landroid/support/v4/widget/CircleImageView;->getMeasuredHeight()I
    //         move-result v1
    //         iget v2, p0, Landroid/support/v4/widget/CircleImageView;->mShadowRadius:I
    //         mul-int/lit8 v2, v2, 0x2
    //         add-int/2addr v1, v2
    //         invoke-virtual {p0, v0, v1}, Landroid/support/v4/widget/CircleImageView;->setMeasuredDimension(II)V
    //         :cond_0
    //         return-void
    */

    public fun setAnimationListener(listener: android.view.animation.Animation.AnimationListener) { /* TODO(body): (Landroid/view/animation/Animation$AnimationListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Landroid/support/v4/widget/CircleImageView;->mListener:Landroid/view/animation/Animation$AnimationListener;
    //         return-void
    */

    public fun setBackgroundColor(colorRes: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p0}, Landroid/support/v4/widget/CircleImageView;->getBackground()Landroid/graphics/drawable/Drawable;
    //         move-result-object v1
    //         instance-of v1, v1, Landroid/graphics/drawable/ShapeDrawable;
    //         if-eqz v1, :cond_0
    //         invoke-virtual {p0}, Landroid/support/v4/widget/CircleImageView;->getResources()Landroid/content/res/Resources;
    //         move-result-object v0
    //         .local v0, "res":Landroid/content/res/Resources;
    //         invoke-virtual {p0}, Landroid/support/v4/widget/CircleImageView;->getBackground()Landroid/graphics/drawable/Drawable;
    //         move-result-object v1
    //         check-cast v1, Landroid/graphics/drawable/ShapeDrawable;
    //         invoke-virtual {v1}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
    //         move-result-object v1
    //         invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
    //         .end local v0    # "res":Landroid/content/res/Resources;
    //         :cond_0
    //         return-void
    */

    companion object {
    private val FILL_SHADOW_COLOR: Int = 0x3d000000
    private val KEY_SHADOW_COLOR: Int = 0x1e000000
    private val SHADOW_ELEVATION: Int = 0x4
    private val SHADOW_RADIUS: Float = 0.0f
    private val X_OFFSET: Float = 0.0f
    private val Y_OFFSET: Float = 0.0f
    }
}
