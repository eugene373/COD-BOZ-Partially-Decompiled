package android.support.v4.widget

// Auto-emitted from smali source: MaterialProgressDrawable.java.
// 1 fields, 4 methods.

open class MaterialProgressDrawable_Anon3: android.graphics.drawable.Drawable.Callback {
    val this$0: android.support.v4.widget.MaterialProgressDrawable

    constructor(p0: android.support.v4.widget.MaterialProgressDrawable)

    public fun invalidateDrawable(d: android.graphics.drawable.Drawable) { /* TODO(body): (Landroid/graphics/drawable/Drawable;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {v0}, Landroid/support/v4/widget/MaterialProgressDrawable;->invalidateSelf()V
    //         return-void
    */

    public fun scheduleDrawable(d: android.graphics.drawable.Drawable, what: Runnable, when: Long) { /* TODO(body): (Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {v0, p2, p3, p4}, Landroid/support/v4/widget/MaterialProgressDrawable;->scheduleSelf(Ljava/lang/Runnable;J)V
    //         return-void
    */

    public fun unscheduleDrawable(d: android.graphics.drawable.Drawable, what: Runnable) { /* TODO(body): (Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/widget/MaterialProgressDrawable$3;->this$0:Landroid/support/v4/widget/MaterialProgressDrawable;
    //         invoke-virtual {v0, p2}, Landroid/support/v4/widget/MaterialProgressDrawable;->unscheduleSelf(Ljava/lang/Runnable;)V
    //         return-void
    */

}
