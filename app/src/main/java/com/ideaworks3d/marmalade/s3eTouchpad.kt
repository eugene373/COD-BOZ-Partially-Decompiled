package com.ideaworks3d.marmalade

import android.content.res.Configuration
import android.os.Build
import android.view.InputDevice
import android.view.MotionEvent
import android.view.ViewParent

class s3eTouchpad {
    private var processPositionEvents = false
    private var inputDeviceId = -1

    fun s3eTouchpadInit(): Boolean {
        val ids = InputDevice.getDeviceIds()
        for (id in ids) {
            val device = InputDevice.getDevice(id) ?: continue
            if (device.sources and SOURCE_TOUCHPAD > 0) {
                val xRange = device.getMotionRange(0)
                val yRange = device.getMotionRange(1)
                if (xRange != null && yRange != null) {
                    m_Width = xRange.max.toInt()
                    m_Height = yRange.max.toInt()
                    trace("Detected touchpad with m_Width: $m_Width m_Height: $m_Height")
                    if (m_Width > 0 && m_Height > 0) {
                        if (setProcessPositionEvents(true)) {
                            inputDeviceId = id
                            return true
                        }
                        trace("setProcessPositionEvents failed")
                        return false
                    }
                }
            }
        }
        trace("Couldn't detect touchpad")
        return false
    }

    fun s3eTouchpadTerminate() {
        if (processPositionEvents) {
            setProcessPositionEvents(false)
        }
    }

    fun s3eTouchpadGetInt(prop: Int): Int {
        if (prop == S3E_TOUCHPAD_AVAILABLE) {
            LoaderAPI.trace("Touchpad GetInt S3E_TOUCHPAD_AVAILABLE")
            if (inputDeviceId == -1) return 0
            val cfg: Configuration = LoaderActivity.m_Activity!!.resources.configuration
            val legacyId = "3.0.A.2."
            try {
                LoaderAPI.trace("Android build: ${Build.ID}")
                LoaderAPI.trace("Checking for legacy Xperia Play build ID: $legacyId")
                if (Build.ID.startsWith(legacyId) && Build.ID.substring(legacyId.length).toInt() <= 181) {
                    LoaderAPI.trace("Found... Using legacy Configuration enum")
                    return if (cfg.hardKeyboardHidden != 2) 1 else 0
                }
            } catch (_: NumberFormatException) {
                LoaderAPI.trace("Error parsing build ID")
            }
            val navAvailable = if (cfg.navigationHidden != 2) 1 else 0
            LoaderAPI.trace("Touchpad available: $navAvailable")
            return navAvailable
        } else if (prop == S3E_TOUCHPAD_WIDTH) {
            return m_Width
        } else if (prop == S3E_TOUCHPAD_HEIGHT) {
            return m_Height
        }
        return 0
    }

    fun setProcessPositionEvents(process: Boolean): Boolean {
        trace("setProcessPositionEvents$process")
        return try {
            val parent: ViewParent = LoaderActivity.m_Activity!!.window.decorView.rootView.parent
            val clazz = Class.forName("android.view.ViewRoot")
            val m = clazz.getMethod("setProcessPositionEvents", java.lang.Boolean.TYPE)
            m.invoke(parent, process)
            true
        } catch (e: Exception) {
            trace("Exception accessing trackpad:$e")
            false
        }
    }

    private fun trace(msg: String) {
        LoaderAPI.traceChan(className() + "-" + Thread.currentThread().name, msg)
    }

    private fun className(): String {
        val full = this::class.java.name
        return full.substring(full.lastIndexOf('.') + 1)
    }

    companion object {
        private const val SOURCE_TOUCHPAD = 1048584
        private var m_Width = 0
        private var m_Height = 0

        const val S3E_TOUCHPAD_AVAILABLE = 0
        const val S3E_TOUCHPAD_WIDTH = 1
        const val S3E_TOUCHPAD_HEIGHT = 2

        @JvmStatic
        external fun onMotionEvent(pointerId: Int, action: Int, x: Int, y: Int)

        @JvmStatic
        fun onTouchEvent(event: MotionEvent): Boolean {
            if (event.source != SOURCE_TOUCHPAD) return false
            val action = event.action
            val actionIndex = event.actionIndex
            if (action == MotionEvent.ACTION_MOVE) {
                val count = event.pointerCount
                for (i in 0 until count) {
                    onMotionEvent(
                        event.getPointerId(i),
                        action + 4,
                        event.getX(i).toInt(),
                        m_Height - event.getY(i).toInt(),
                    )
                }
            } else if (action != MotionEvent.ACTION_DOWN && action != MotionEvent.ACTION_UP) {
                val pointerId = event.getPointerId(actionIndex)
                val masked = action and 0xff
                val mapped = if (masked == 6 || masked == 5) masked - 5 else masked
                onMotionEvent(
                    pointerId,
                    mapped + 4,
                    event.getX(actionIndex).toInt(),
                    m_Height - event.getY(actionIndex).toInt(),
                )
            } else {
                val pointerId = event.getPointerId(0)
                onMotionEvent(pointerId, action + 4, event.x.toInt(), m_Height - event.y.toInt())
            }
            return true
        }
    }
}
