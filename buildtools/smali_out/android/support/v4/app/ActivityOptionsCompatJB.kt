package android.support.v4.app

// Auto-emitted from smali source: ActivityOptionsCompatJB.java.
// 1 fields, 6 methods.

open class ActivityOptionsCompatJB {
    private val mActivityOptions: android.app.ActivityOptions

    private constructor(activityOptions: android.app.ActivityOptions)

    public fun toBundle(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/ActivityOptionsCompatJB;->mActivityOptions:Landroid/app/ActivityOptions;
    //         invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public fun update(otherOptions: android.support.v4.app.ActivityOptionsCompatJB) { /* TODO(body): (Landroid/support/v4/app/ActivityOptionsCompatJB;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Landroid/support/v4/app/ActivityOptionsCompatJB;->mActivityOptions:Landroid/app/ActivityOptions;
    //         iget-object v1, p1, Landroid/support/v4/app/ActivityOptionsCompatJB;->mActivityOptions:Landroid/app/ActivityOptions;
    //         invoke-virtual {v0, v1}, Landroid/app/ActivityOptions;->update(Landroid/app/ActivityOptions;)V
    //         return-void
    */

    companion object {
    public @JvmStatic fun makeCustomAnimation(context: android.content.Context, enterResId: Int, exitResId: Int): android.support.v4.app.ActivityOptionsCompatJB { return TODO("body: (Landroid/content/Context;II)Landroid/support/v4/app/ActivityOptionsCompatJB;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/app/ActivityOptionsCompatJB;
    //         invoke-static {p0, p1, p2}, Landroid/app/ActivityOptions;->makeCustomAnimation(Landroid/content/Context;II)Landroid/app/ActivityOptions;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompatJB;-><init>(Landroid/app/ActivityOptions;)V
    //         return-object v0
    */

    public @JvmStatic fun makeScaleUpAnimation(source: android.view.View, startX: Int, startY: Int, startWidth: Int, startHeight: Int): android.support.v4.app.ActivityOptionsCompatJB { return TODO("body: (Landroid/view/View;IIII)Landroid/support/v4/app/ActivityOptionsCompatJB;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/app/ActivityOptionsCompatJB;
    //         invoke-static {p0, p1, p2, p3, p4}, Landroid/app/ActivityOptions;->makeScaleUpAnimation(Landroid/view/View;IIII)Landroid/app/ActivityOptions;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompatJB;-><init>(Landroid/app/ActivityOptions;)V
    //         return-object v0
    */

    public @JvmStatic fun makeThumbnailScaleUpAnimation(source: android.view.View, thumbnail: android.graphics.Bitmap, startX: Int, startY: Int): android.support.v4.app.ActivityOptionsCompatJB { return TODO("body: (Landroid/view/View;Landroid/graphics/Bitmap;II)Landroid/support/v4/app/ActivityOptionsCompatJB;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/app/ActivityOptionsCompatJB;
    //         invoke-static {p0, p1, p2, p3}, Landroid/app/ActivityOptions;->makeThumbnailScaleUpAnimation(Landroid/view/View;Landroid/graphics/Bitmap;II)Landroid/app/ActivityOptions;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/app/ActivityOptionsCompatJB;-><init>(Landroid/app/ActivityOptions;)V
    //         return-object v0
    */

    }
}
