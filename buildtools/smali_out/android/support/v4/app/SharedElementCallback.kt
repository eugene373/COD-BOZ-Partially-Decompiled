package android.support.v4.app

// Auto-emitted from smali source: SharedElementCallback.java.
// 1 fields, 7 methods.

open class SharedElementCallback {
    private var mTempMatrix: android.graphics.Matrix

    public constructor()

    public fun onCaptureSharedElementSnapshot(sharedElement: android.view.View, viewToGlobalMatrix: android.graphics.Matrix, screenBounds: android.graphics.RectF): android.os.Parcelable { return TODO("body: (Landroid/view/View;Landroid/graphics/Matrix;Landroid/graphics/RectF;)Landroid/os/Parcelable;") }
    /*
    //         .locals 7
    //         invoke-virtual {p3}, Landroid/graphics/RectF;->width()F
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Math;->round(F)I
    //         move-result v2
    //         .local v2, "bitmapWidth":I
    //         invoke-virtual {p3}, Landroid/graphics/RectF;->height()F
    //         move-result v4
    //         invoke-static {v4}, Ljava/lang/Math;->round(F)I
    //         move-result v1
    //         .local v1, "bitmapHeight":I
    //         const/4 v0, 0x0
    //         .local v0, "bitmap":Landroid/graphics/Bitmap;
    //         if-lez v2, :cond_1
    //         if-lez v1, :cond_1
    //         iget-object v4, p0, Landroid/support/v4/app/SharedElementCallback;->mTempMatrix:Landroid/graphics/Matrix;
    //         if-nez v4, :cond_0
    //         new-instance v4, Landroid/graphics/Matrix;
    //         invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V
    //         iput-object v4, p0, Landroid/support/v4/app/SharedElementCallback;->mTempMatrix:Landroid/graphics/Matrix;
    //         :cond_0
    //         iget-object v4, p0, Landroid/support/v4/app/SharedElementCallback;->mTempMatrix:Landroid/graphics/Matrix;
    //         invoke-virtual {v4, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V
    //         iget-object v4, p0, Landroid/support/v4/app/SharedElementCallback;->mTempMatrix:Landroid/graphics/Matrix;
    //         iget v5, p3, Landroid/graphics/RectF;->left:F
    //         neg-float v5, v5
    //         iget v6, p3, Landroid/graphics/RectF;->top:F
    //         neg-float v6, v6
    //         invoke-virtual {v4, v5, v6}, Landroid/graphics/Matrix;->postTranslate(FF)Z
    //         sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
    //         invoke-static {v2, v1, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //         move-result-object v0
    //         new-instance v3, Landroid/graphics/Canvas;
    //         invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
    //         .local v3, "canvas":Landroid/graphics/Canvas;
    //         iget-object v4, p0, Landroid/support/v4/app/SharedElementCallback;->mTempMatrix:Landroid/graphics/Matrix;
    //         invoke-virtual {v3, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
    //         invoke-virtual {p1, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    //         .end local v3    # "canvas":Landroid/graphics/Canvas;
    //         :cond_1
    //         return-object v0
    */

    public fun onCreateSnapshotView(context: android.content.Context, snapshot: android.os.Parcelable): android.view.View { return TODO("body: (Landroid/content/Context;Landroid/os/Parcelable;)Landroid/view/View;") }
    /*
    //         .locals 3
    //         const/4 v1, 0x0
    //         .local v1, "view":Landroid/widget/ImageView;
    //         instance-of v2, p2, Landroid/graphics/Bitmap;
    //         if-eqz v2, :cond_0
    //         move-object v0, p2
    //         check-cast v0, Landroid/graphics/Bitmap;
    //         .local v0, "bitmap":Landroid/graphics/Bitmap;
    //         new-instance v1, Landroid/widget/ImageView;
    //         .end local v1    # "view":Landroid/widget/ImageView;
    //         invoke-direct {v1, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V
    //         .restart local v1    # "view":Landroid/widget/ImageView;
    //         invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
    //         .end local v0    # "bitmap":Landroid/graphics/Bitmap;
    //         :cond_0
    //         return-object v1
    */

    public fun onMapSharedElements(p0: java.util.List, p1: java.util.Map) { /* TODO(body): (Ljava/util/List;Ljava/util/Map;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Landroid/view/View;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .local p1, "names":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    //         .local p2, "sharedElements":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Landroid/view/View;>;"
    //         return-void
    */

    public fun onRejectSharedElements(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Landroid/view/View;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .local p1, "rejectedSharedElements":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
    //         return-void
    */

    public fun onSharedElementEnd(p0: java.util.List, p1: java.util.List, p2: java.util.List) { /* TODO(body): (Ljava/util/List;Ljava/util/List;Ljava/util/List;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Landroid/view/View;",
    //                 ">;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Landroid/view/View;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .local p1, "sharedElementNames":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    //         .local p2, "sharedElements":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
    //         .local p3, "sharedElementSnapshots":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
    //         return-void
    */

    public fun onSharedElementStart(p0: java.util.List, p1: java.util.List, p2: java.util.List) { /* TODO(body): (Ljava/util/List;Ljava/util/List;Ljava/util/List;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Landroid/view/View;",
    //                 ">;",
    //                 "Ljava/util/List",
    //                 "<",
    //                 "Landroid/view/View;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .local p1, "sharedElementNames":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    //         .local p2, "sharedElements":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
    //         .local p3, "sharedElementSnapshots":Ljava/util/List;, "Ljava/util/List<Landroid/view/View;>;"
    //         return-void
    */

}
