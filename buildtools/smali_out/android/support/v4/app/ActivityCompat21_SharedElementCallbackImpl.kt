package android.support.v4.app

// Auto-emitted from smali source: ActivityCompat21.java.
// 1 fields, 7 methods.

open class ActivityCompat21_SharedElementCallbackImpl: android.app.SharedElementCallback() {
    private var mCallback: android.support.v4.app.ActivityCompat21.SharedElementCallback21

    public constructor(callback: android.support.v4.app.ActivityCompat21.SharedElementCallback21)

    public fun onCaptureSharedElementSnapshot(sharedElement: android.view.View, viewToGlobalMatrix: android.graphics.Matrix, screenBounds: android.graphics.RectF): android.os.Parcelable { return TODO("body: (Landroid/view/View;Landroid/graphics/Matrix;Landroid/graphics/RectF;)Landroid/os/Parcelable;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/ActivityCompat21$SharedElementCallbackImpl;->mCallback:Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;
    //         invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;->onCaptureSharedElementSnapshot(Landroid/view/View;Landroid/graphics/Matrix;Landroid/graphics/RectF;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onCreateSnapshotView(context: android.content.Context, snapshot: android.os.Parcelable): android.view.View { return TODO("body: (Landroid/content/Context;Landroid/os/Parcelable;)Landroid/view/View;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/app/ActivityCompat21$SharedElementCallbackImpl;->mCallback:Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;->onCreateSnapshotView(Landroid/content/Context;Landroid/os/Parcelable;)Landroid/view/View;
    //         move-result-object v0
    //         return-object v0
    */

    public fun onMapSharedElements(p0: java.util.List, p1: java.util.Map) { /* TODO(body): (Ljava/util/List;Ljava/util/Map;)V */ }
    /*
    //         .locals 1
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
    //         iget-object v0, p0, Landroid/support/v4/app/ActivityCompat21$SharedElementCallbackImpl;->mCallback:Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;
    //         invoke-virtual {v0, p1, p2}, Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;->onMapSharedElements(Ljava/util/List;Ljava/util/Map;)V
    //         return-void
    */

    public fun onRejectSharedElements(p0: java.util.List) { /* TODO(body): (Ljava/util/List;)V */ }
    /*
    //         .locals 1
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
    //         iget-object v0, p0, Landroid/support/v4/app/ActivityCompat21$SharedElementCallbackImpl;->mCallback:Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;
    //         invoke-virtual {v0, p1}, Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;->onRejectSharedElements(Ljava/util/List;)V
    //         return-void
    */

    public fun onSharedElementEnd(p0: java.util.List, p1: java.util.List, p2: java.util.List) { /* TODO(body): (Ljava/util/List;Ljava/util/List;Ljava/util/List;)V */ }
    /*
    //         .locals 1
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
    //         iget-object v0, p0, Landroid/support/v4/app/ActivityCompat21$SharedElementCallbackImpl;->mCallback:Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;
    //         invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;->onSharedElementEnd(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    //         return-void
    */

    public fun onSharedElementStart(p0: java.util.List, p1: java.util.List, p2: java.util.List) { /* TODO(body): (Ljava/util/List;Ljava/util/List;Ljava/util/List;)V */ }
    /*
    //         .locals 1
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
    //         iget-object v0, p0, Landroid/support/v4/app/ActivityCompat21$SharedElementCallbackImpl;->mCallback:Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;
    //         invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;->onSharedElementStart(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    //         return-void
    */

}
