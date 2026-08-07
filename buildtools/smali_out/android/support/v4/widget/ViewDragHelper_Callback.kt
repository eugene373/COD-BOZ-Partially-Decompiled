package android.support.v4.widget

// Auto-emitted from smali source: ViewDragHelper.java.
// 0 fields, 14 methods.

open class ViewDragHelper_Callback {
    public constructor()

    public fun clampViewPositionHorizontal(child: android.view.View, left: Int, dx: Int): Int { return TODO("body: (Landroid/view/View;II)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun clampViewPositionVertical(child: android.view.View, top: Int, dy: Int): Int { return TODO("body: (Landroid/view/View;II)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getOrderedChildIndex(index: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 0
    //         return p1
    */

    public fun getViewHorizontalDragRange(child: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getViewVerticalDragRange(child: android.view.View): Int { return TODO("body: (Landroid/view/View;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun onEdgeDragStarted(edgeFlags: Int, pointerId: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onEdgeLock(edgeFlags: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun onEdgeTouched(edgeFlags: Int, pointerId: Int) { /* TODO(body): (II)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onViewCaptured(capturedChild: android.view.View, activePointerId: Int) { /* TODO(body): (Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onViewDragStateChanged(state: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onViewPositionChanged(changedView: android.view.View, left: Int, top: Int, dx: Int, dy: Int) { /* TODO(body): (Landroid/view/View;IIII)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onViewReleased(releasedChild: android.view.View, xvel: Float, yvel: Float) { /* TODO(body): (Landroid/view/View;FF)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun tryCaptureView(p0: android.view.View, p1: Int): Boolean

}
