package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 4 fields, 6 methods.

open class s3eTouchpad {
        private var processPositionEvents: Boolean
        private var inputDeviceId: Int

    public fun s3eTouchpadInit(): Boolean { return TODO("body: ()Z") }
    public fun s3eTouchpadTerminate() { /* TODO(body): ()V */ }
    public fun s3eTouchpadGetInt(p0: Int): Int { return TODO("body: (I)I") }
    public fun setProcessPositionEvents(p0: Boolean): Boolean { return TODO("body: (Z)Z") }

    companion object {
        private var m_Width: Int
        private var m_Height: Int

        public external @JvmStatic fun onMotionEvent(p0: Int, p1: Int, p2: Int, p3: Int)
        public @JvmStatic fun onTouchEvent(p0: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    }
}
