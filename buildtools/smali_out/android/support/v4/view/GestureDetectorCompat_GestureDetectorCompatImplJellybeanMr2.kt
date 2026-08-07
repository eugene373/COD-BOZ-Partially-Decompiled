package android.support.v4.view

// Auto-emitted from smali source: GestureDetectorCompat.java.
// 1 fields, 5 methods.

open class GestureDetectorCompat_GestureDetectorCompatImplJellybeanMr2: android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImpl {
    private val mDetector: android.view.GestureDetector

    public constructor(context: android.content.Context, listener: android.view.GestureDetector.OnGestureListener, handler: android.os.Handler)

    public fun isLongpressEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;->mDetector:Landroid/view/GestureDetector;
    //         invoke-virtual {v0}, Landroid/view/GestureDetector;->isLongpressEnabled()Z
    //         move-result v0
    //         return v0
    */

    public fun onTouchEvent(ev: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;->mDetector:Landroid/view/GestureDetector;
    //         invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun setIsLongpressEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;->mDetector:Landroid/view/GestureDetector;
    //         invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V
    //         return-void
    */

    public fun setOnDoubleTapListener(listener: android.view.GestureDetector.OnDoubleTapListener) { /* TODO(body): (Landroid/view/GestureDetector$OnDoubleTapListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;->mDetector:Landroid/view/GestureDetector;
    //         invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
    //         return-void
    */

}
