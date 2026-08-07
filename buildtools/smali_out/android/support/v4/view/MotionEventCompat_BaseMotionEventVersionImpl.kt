package android.support.v4.view

// Auto-emitted from smali source: MotionEventCompat.java.
// 0 fields, 6 methods.

open class MotionEventCompat_BaseMotionEventVersionImpl: android.support.v4.view.MotionEventCompat.MotionEventVersionImpl {
    constructor()

    public fun findPointerIndex(event: android.view.MotionEvent, pointerId: Int): Int { return TODO("body: (Landroid/view/MotionEvent;I)I") }
    /*
    //         .locals 1
    //         if-nez p2, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, -0x1
    //         goto :goto_0
    */

    public fun getPointerCount(event: android.view.MotionEvent): Int { return TODO("body: (Landroid/view/MotionEvent;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun getPointerId(event: android.view.MotionEvent, pointerIndex: Int): Int { return TODO("body: (Landroid/view/MotionEvent;I)I") }
    /*
    //         .locals 2
    //         if-nez p2, :cond_0
    //         const/4 v0, 0x0
    //         return v0
    //         :cond_0
    //         new-instance v0, Ljava/lang/IndexOutOfBoundsException;
    //         const-string v1, "Pre-Eclair does not support multiple pointers"
    //         invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getX(event: android.view.MotionEvent, pointerIndex: Int): Float { return TODO("body: (Landroid/view/MotionEvent;I)F") }
    /*
    //         .locals 2
    //         if-nez p2, :cond_0
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
    //         move-result v0
    //         return v0
    //         :cond_0
    //         new-instance v0, Ljava/lang/IndexOutOfBoundsException;
    //         const-string v1, "Pre-Eclair does not support multiple pointers"
    //         invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun getY(event: android.view.MotionEvent, pointerIndex: Int): Float { return TODO("body: (Landroid/view/MotionEvent;I)F") }
    /*
    //         .locals 2
    //         if-nez p2, :cond_0
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
    //         move-result v0
    //         return v0
    //         :cond_0
    //         new-instance v0, Ljava/lang/IndexOutOfBoundsException;
    //         const-string v1, "Pre-Eclair does not support multiple pointers"
    //         invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

}
