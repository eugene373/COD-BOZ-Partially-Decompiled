package com.ideaworks3d.marmalade

import android.view.MotionEvent

internal class MultiTouch {

    companion object {
        private const val POINTER_DOWN = 1
        private const val POINTER_UP = 2
        private const val POINTER_MOVE = 3
        private const val TOUCH_DOWN = 4
        private const val TOUCH_UP = 5
        private const val TOUCH_MOVE = 6
        private const val TOUCH_CANCEL = 7

        @JvmStatic
        fun onTouchEvent(loader: LoaderThread, event: MotionEvent): Boolean {
            var action = event.action
            action = action and 0xff
            if (action == POINTER_MOVE) {
                val count = event.pointerCount
                for (i in 0 until count) {
                    val id = event.getPointerId(i)
                    val x = event.getX(i).toInt()
                    val y = event.getY(i).toInt()
                    loader.onMotionEvent(id, TOUCH_MOVE, x, y)
                }
            } else {
                var touchEvent = 0
                if (action != MotionEvent.ACTION_DOWN && action != MotionEvent.ACTION_POINTER_DOWN) {
                    if (action != MotionEvent.ACTION_UP && action != MotionEvent.ACTION_POINTER_UP) {
                        if (action == MotionEvent.ACTION_CANCEL) {
                            touchEvent = TOUCH_CANCEL
                        }
                    } else {
                        touchEvent = TOUCH_UP
                    }
                } else {
                    touchEvent = TOUCH_DOWN
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
