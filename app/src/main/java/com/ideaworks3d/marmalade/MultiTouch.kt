package com.ideaworks3d.marmalade

import android.view.MotionEvent

internal class MultiTouch {

    companion object {
        private const val TOUCH_DOWN = 4
        private const val TOUCH_UP = 5
        private const val TOUCH_MOVE = 6
        private const val TOUCH_CANCEL = 7

        @JvmStatic
        fun onTouchEvent(loader: LoaderThread, event: MotionEvent): Boolean {
            val action = event.action and 0xff
            if (action == MotionEvent.ACTION_MOVE) {
                val count = event.pointerCount
                for (i in 0 until count) {
                    val id = event.getPointerId(i)
                    val x = event.getX(i).toInt()
                    val y = event.getY(i).toInt()
                    loader.onMotionEvent(id, TOUCH_MOVE, x, y)
                }
            } else {
                val touchEvent = when (action) {
                    MotionEvent.ACTION_DOWN, MotionEvent.ACTION_POINTER_DOWN -> TOUCH_DOWN
                    MotionEvent.ACTION_UP, MotionEvent.ACTION_POINTER_UP -> TOUCH_UP
                    MotionEvent.ACTION_CANCEL -> TOUCH_CANCEL
                    else -> 0
                }

                if (touchEvent != 0) {
                    val idx = event.actionIndex
                    val id = event.getPointerId(idx)
                    val x = event.getX(idx).toInt()
                    val y = event.getY(idx).toInt()
                    loader.onMotionEvent(id, touchEvent, x, y)
                }
            }
            return true
        }
    }
}
