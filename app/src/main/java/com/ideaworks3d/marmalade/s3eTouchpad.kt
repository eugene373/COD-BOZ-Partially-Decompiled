package com.ideaworks3d.marmalade

import android.view.InputDevice
import android.view.MotionEvent

class s3eTouchpad {
    companion object {
        const val S3E_TOUCHPAD_AVAILABLE = 0
        const val S3E_TOUCHPAD_HEIGHT = 2
        const val S3E_TOUCHPAD_WIDTH = 1

        @JvmStatic
        private var m_Width = 0

        @JvmStatic
        private var m_Height = 0

        @JvmStatic
        external fun onMotionEvent(deviceId: Int, action: Int, x: Int, y: Int)
    }

    private var inputDeviceId = -1
    private var processPositionEvents = false

    fun s3eTouchpadInit(): Boolean {
        val deviceIds = InputDevice.getDeviceIds()
        for (id in deviceIds) {
            val device = InputDevice.getDevice(id)
            val sources = device.sources
            if (sources and 0x100008 > 0) {
                val xRange = device.getMotionRange(0)
                val yRange = device.getMotionRange(1)
                if (xRange != null && yRange != null) {
                    m_Width = xRange.max.toInt()
                    m_Height = yRange.max.toInt()
                    if (m_Width > 0 && m_Height > 0) {
                        processPositionEvents = setProcessPositionEvents(true)
                        if (processPositionEvents) {
                            inputDeviceId = id
                            return true
                        }
                    }
                }
            }
        }
        return false
    }

    fun s3eTouchpadTerminate() {
        if (processPositionEvents) {
            setProcessPositionEvents(false)
        }
    }

    fun s3eTouchpadGetInt(key: Int): Int {
        return when (key) {
            S3E_TOUCHPAD_AVAILABLE -> if (inputDeviceId != -1) 1 else 0
            S3E_TOUCHPAD_WIDTH -> m_Width
            S3E_TOUCHPAD_HEIGHT -> m_Height
            else -> 0
        }
    }

    @Suppress("DEPRECATION")
    fun setProcessPositionEvents(enabled: Boolean): Boolean {
        if (android.os.Build.VERSION.SDK_INT < 9) {
            return false
        }

        try {
            val activity = LoaderActivity.m_Activity
            val decorView = activity!!.window.decorView
            val rootView = decorView.rootView
            val parent = rootView.parent
            val viewRootClass = Class.forName("android.view.ViewRoot")
            val method = viewRootClass.getMethod("setProcessPositionEvents", Boolean::class.javaPrimitiveType)
            method.invoke(parent, enabled)
            return true
        } catch (e: Exception) {
            return false
        }
    }
}
