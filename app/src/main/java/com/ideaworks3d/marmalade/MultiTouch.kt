package com.ideaworks3d.marmalade

import android.view.MotionEvent

object MultiTouch {
    private const val POINTER_DOWN = 1
    private const val POINTER_MOVE = 3
    private const val POINTER_UP = 2
    private const val TOUCH_CANCEL = 7
    private const val TOUCH_DOWN = 4
    private const val TOUCH_MOVE = 6
    private const val TOUCH_UP = 5

    @JvmStatic
    fun onTouchEvent(thread: LoaderThread, event: MotionEvent): Boolean {
        var action = event.action
        val actionMasked = action and 0xff

        var touchAction = 0

        if (actionMasked == 2) {
            val pointerCount = event.pointerCount
            for (i in 0 until pointerCount) {
                val pointerId = event.getPointerId(i)
                val x = event.getX(i).toInt()
                val y = event.getY(i).toInt()
                thread.onMotionEvent(pointerId, POINTER_MOVE, x, y)
            }
            return true
        }

        if (actionMasked == 0 || actionMasked == TOUCH_DOWN) {
            touchAction = TOUCH_DOWN
        } else if (actionMasked == POINTER_DOWN || actionMasked == POINTER_UP) {
            touchAction = if (actionMasked == POINTER_DOWN) TOUCH_DOWN else TOUCH_UP
        } else if (actionMasked == TOUCH_MOVE) {
            touchAction = TOUCH_MOVE
        } else if (actionMasked == TOUCH_CANCEL) {
            touchAction = TOUCH_CANCEL
        }

        if (touchAction != 0) {
            action = event.action
            val pointerIndex = (action and 0xff00) shr 8
            val pointerId = event.getPointerId(pointerIndex)
            val x = event.getX(pointerIndex).toInt()
            val y = event.getY(pointerIndex).toInt()
            thread.onMotionEvent(pointerId, touchAction, x, y)
        }

        return true
    }
}