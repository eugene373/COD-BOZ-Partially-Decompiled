package android.support.v4.view

// Auto-emitted from smali source: GestureDetectorCompat.java.
// 1 fields, 6 methods.

open class GestureDetectorCompat {
    private val mImpl: android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImpl

    public constructor(context: android.content.Context, listener: android.view.GestureDetector.OnGestureListener)

    public constructor(context: android.content.Context, listener: android.view.GestureDetector.OnGestureListener, handler: android.os.Handler)

    public fun isLongpressEnabled(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat;->mImpl:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
    //         invoke-interface {v0}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;->isLongpressEnabled()Z
    //         move-result v0
    //         return v0
    */

    public fun onTouchEvent(event: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat;->mImpl:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;->onTouchEvent(Landroid/view/MotionEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun setIsLongpressEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat;->mImpl:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;->setIsLongpressEnabled(Z)V
    //         return-void
    */

    public fun setOnDoubleTapListener(listener: android.view.GestureDetector.OnDoubleTapListener) { /* TODO(body): (Landroid/view/GestureDetector$OnDoubleTapListener;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat;->mImpl:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
    //         invoke-interface {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
    //         return-void
    */

}
