package android.support.v4.view

// Auto-emitted from smali source: MotionEventCompat.java.
// 10 fields, 9 methods.

open class MotionEventCompat {
    public constructor()

    companion object {
    @JvmField public val ACTION_HOVER_ENTER: Int = 0x9
    @JvmField public val ACTION_HOVER_EXIT: Int = 0xa
    @JvmField public val ACTION_HOVER_MOVE: Int = 0x7
    @JvmField public val ACTION_MASK: Int = 0xff
    @JvmField public val ACTION_POINTER_DOWN: Int = 0x5
    @JvmField public val ACTION_POINTER_INDEX_MASK: Int = 0xff00
    @JvmField public val ACTION_POINTER_INDEX_SHIFT: Int = 0x8
    @JvmField public val ACTION_POINTER_UP: Int = 0x6
    @JvmField public val ACTION_SCROLL: Int = 0x8
    val IMPL: android.support.v4.view.MotionEventCompat.MotionEventVersionImpl = null!!

    public @JvmStatic fun findPointerIndex(event: android.view.MotionEvent, pointerId: Int): Int { return TODO("body: (Landroid/view/MotionEvent;I)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/MotionEventCompat;->IMPL:Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;->findPointerIndex(Landroid/view/MotionEvent;I)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getActionIndex(event: android.view.MotionEvent): Int { return TODO("body: (Landroid/view/MotionEvent;)I") }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I
    //         move-result v0
    //         const v1, 0xff00
    //         and-int/2addr v0, v1
    //         shr-int/lit8 v0, v0, 0x8
    //         return v0
    */

    public @JvmStatic fun getActionMasked(event: android.view.MotionEvent): Int { return TODO("body: (Landroid/view/MotionEvent;)I") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I
    //         move-result v0
    //         and-int/lit16 v0, v0, 0xff
    //         return v0
    */

    public @JvmStatic fun getPointerCount(event: android.view.MotionEvent): Int { return TODO("body: (Landroid/view/MotionEvent;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/MotionEventCompat;->IMPL:Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;->getPointerCount(Landroid/view/MotionEvent;)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getPointerId(event: android.view.MotionEvent, pointerIndex: Int): Int { return TODO("body: (Landroid/view/MotionEvent;I)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/MotionEventCompat;->IMPL:Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;->getPointerId(Landroid/view/MotionEvent;I)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getX(event: android.view.MotionEvent, pointerIndex: Int): Float { return TODO("body: (Landroid/view/MotionEvent;I)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/MotionEventCompat;->IMPL:Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;->getX(Landroid/view/MotionEvent;I)F
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getY(event: android.view.MotionEvent, pointerIndex: Int): Float { return TODO("body: (Landroid/view/MotionEvent;I)F") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/MotionEventCompat;->IMPL:Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;->getY(Landroid/view/MotionEvent;I)F
    //         move-result v0
    //         return v0
    */

    }
}
