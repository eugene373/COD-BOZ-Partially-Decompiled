package com.ideaworks3d.marmalade

// Auto-emitted from smali source: MultiTouch.java.
// 7 fields, 2 methods.

open class MultiTouch {
    constructor()

    companion object {
    private val POINTER_DOWN: Int = 0x1
    private val POINTER_MOVE: Int = 0x3
    private val POINTER_UP: Int = 0x2
    private val TOUCH_CANCEL: Int = 0x7
    private val TOUCH_DOWN: Int = 0x4
    private val TOUCH_MOVE: Int = 0x6
    private val TOUCH_UP: Int = 0x5

    public @JvmStatic fun onTouchEvent(p0: com.ideaworks3d.marmalade.LoaderThread, p1: android.view.MotionEvent): Boolean { return TODO("body: (Lcom/ideaworks3d/marmalade/LoaderThread;Landroid/view/MotionEvent;)Z") }
    /*
    //         .locals 7
    //         const/4 v6, 0x6
    //         const/4 v1, 0x5
    //         const/4 v5, 0x1
    //         const/4 v0, 0x0
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
    //         move-result v2
    //         and-int/lit16 v2, v2, 0xff
    //         const/4 v3, 0x2
    //         if-ne v2, v3, :cond_0
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
    //         move-result v1
    //         :goto_0
    //         if-ge v0, v1, :cond_3
    //         invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
    //         move-result v2
    //         invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F
    //         move-result v3
    //         float-to-int v3, v3
    //         invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
    //         move-result v4
    //         float-to-int v4, v4
    //         invoke-virtual {p0, v2, v6, v3, v4}, Lcom/ideaworks3d/marmalade/LoaderThread;->onMotionEvent(IIII)V
    //         add-int/lit8 v0, v0, 0x1
    //         goto :goto_0
    //         :cond_0
    //         if-eqz v2, :cond_1
    //         if-ne v2, v1, :cond_4
    //         :cond_1
    //         const/4 v0, 0x4
    //         :cond_2
    //         :goto_1
    //         if-eqz v0, :cond_3
    //         invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
    //         move-result v1
    //         const v2, 0xff00
    //         and-int/2addr v1, v2
    //         ushr-int/lit8 v1, v1, 0x8
    //         invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I
    //         move-result v2
    //         invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F
    //         move-result v3
    //         float-to-int v3, v3
    //         invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F
    //         move-result v1
    //         float-to-int v1, v1
    //         invoke-virtual {p0, v2, v0, v3, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->onMotionEvent(IIII)V
    //         :cond_3
    //         return v5
    //         :cond_4
    //         if-eq v2, v5, :cond_5
    //         if-ne v2, v6, :cond_6
    //         :cond_5
    //         move v0, v1
    //         goto :goto_1
    //         :cond_6
    //         const/4 v1, 0x3
    //         if-ne v2, v1, :cond_2
    //         const/4 v0, 0x7
    //         goto :goto_1
    */

    }
}
