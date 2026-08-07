package com.ideaworks3d.marmalade

import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.ResultReceiver
import android.view.KeyEvent
import android.view.inputmethod.InputMethodManager

class LoaderKeyboard(private val m_View: LoaderView) : SuspendResumeListener {
    private var m_onScreenKeyboard = false
    private var m_pausing = false
    private var m_Receiver: SoftInputReceiver = SoftInputReceiver(m_View.m_Handler)
    private var m_keyboardInputType: Int = m_InputTypeTransform[0]!!

    private external fun onKeyEventNative(action: Int, unicodeChar: Int, keyCode: Int): Boolean
    private external fun setCharInputEnabledNative(enabled: Boolean)

    init {
        LoaderAPI.addSuspendResumeListener(this)
    }

    override fun onSuspendResumeEvent(event: SuspendResumeEvent) {
        if (event.eventType == SuspendResumeEvent.EventType.SUSPEND && m_onScreenKeyboard) {
            m_pausing = true
            setShowOnScreenKeyboard(false)
            m_onScreenKeyboard = true
        }
        if (event.eventType == SuspendResumeEvent.EventType.RESUME) {
            m_pausing = false
            if (m_onScreenKeyboard) {
                setShowOnScreenKeyboard(m_onScreenKeyboard)
            }
        }
    }

    fun onKeyEvent(action: Int, keyCode: Int, event: KeyEvent): Boolean {
        var unicode = event.unicodeChar
        if (unicode == 0 && !event.characters.isNullOrEmpty()) {
            unicode = event.characters[0].code
        }
        return onKeyEventNative(action, unicode, keyCode)
    }

    fun onKeyPreIme(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && m_onScreenKeyboard) {
            trace("Back key captured, hiding on screen keyboard")
            setCharInputEnabledNative(false)
            setShowOnScreenKeyboard(false)
            return true
        }
        return false
    }

    fun hardKeyboardConfigurationChanged(visible: Boolean) {
        if (!visible && m_onScreenKeyboard) {
            setShowOnScreenKeyboard(true)
        }
    }

    fun getKeyboardInputType(): Int = m_keyboardInputType

    fun setKeyboardInputType(type: Int) {
        var mapped = m_InputTypeTransform[0]!!
        if (m_InputTypeTransform.containsKey(type)) {
            mapped = m_InputTypeTransform[type]!!
        }
        if (mapped != m_keyboardInputType) {
            trace("setKeyboardInputType changed to $m_keyboardInputType input type.")
            m_keyboardInputType = mapped
            val imm = LoaderActivity.m_Activity!!.getSystemService("input_method") as? InputMethodManager
            imm?.restartInput(m_View)
        }
    }

    fun setShowOnScreenKeyboard(show: Boolean) {
        m_onScreenKeyboard = show
        val imm = LoaderActivity.m_Activity!!.getSystemService("input_method") as InputMethodManager
        LoaderActivity.m_Activity!!.LoaderThread().runOnOSThread {
            trace("Showing On Screen Keyboard: $show")
            if (show) {
                m_View.requestFocus()
                var shown = imm.showSoftInput(m_View, 2, m_Receiver)
                trace("LoaderKeyboard:Show keyboard result: $shown")
                if (!shown && m_View.hasWindowFocus()) {
                    m_View.onWindowFocusChanged(true)
                    shown = imm.showSoftInput(m_View, 2, m_Receiver)
                    trace("LoaderKeyboard:(2)Show keyboard result: $shown")
                }
            } else {
                val hidden = imm.hideSoftInputFromWindow(m_View.windowToken, 0, m_Receiver)
                if (!hidden) {
                    imm.toggleSoftInput(0, 0)
                }
            }
        }
    }

    fun getShowOnScreenKeyboard(): Boolean = m_onScreenKeyboard

    fun getKeyboardInfo(): Int {
        val cfg: Configuration = m_View.resources.configuration
        var flags = 0
        if (cfg.keyboard == 2 && cfg.hardKeyboardHidden != 2) flags = flags or 1
        if (cfg.keyboard == 3 && cfg.hardKeyboardHidden != 2) flags = flags or 2
        if (cfg.navigation >= 2) {
            try {
                val navHidden = cfg.javaClass.getField("navigationHidden").get(cfg) as Int
                if (navHidden == 2) return flags
            } catch (_: Exception) {
            }
            if (Build.MODEL != "Zeus" || cfg.hardKeyboardHidden != 2) {
                flags = flags or 4
            }
        }
        return flags
    }

    private fun trace(msg: String) {
        LoaderAPI.traceChan(className() + "-" + Thread.currentThread().name, msg)
    }

    private fun className(): String {
        val full = this::class.java.name
        return full.substring(full.lastIndexOf('.') + 1)
    }

    internal inner class SoftInputReceiver(handler: Handler) : ResultReceiver(handler) {
        override fun onReceiveResult(resultCode: Int, resultData: Bundle?) {
            trace("Recieved soft input change notification, visibility=$m_onScreenKeyboard")
            var toggle = false
            when (resultCode) {
                0, 2 -> if (!m_onScreenKeyboard && !m_pausing) toggle = true
                1, 3 -> if (m_onScreenKeyboard && !m_pausing) toggle = true
            }
            if (toggle) {
                trace("Toggling on screen keyboard view")
                val imm = LoaderActivity.m_Activity!!.getSystemService("input_method") as InputMethodManager
                imm.toggleSoftInput(0, 0)
            }
        }
    }

    companion object {
        const val S3E_KEYBOARD_INPUT_TYPE_DEFAULT = 0
        const val S3E_KEYBOARD_INPUT_TYPE_URL = 1
        const val S3E_KEYBOARD_INPUT_TYPE_EMAIL = 2
        const val S3E_KEYBOARD_INPUT_TYPE_NUMBER = 3
        const val S3E_KEYBOARD_INPUT_TYPE_PHONE = 4

        private val m_InputTypeTransform: MutableMap<Int, Int> = mutableMapOf(
            0 to 0,
            S3E_KEYBOARD_INPUT_TYPE_URL to 17,
            S3E_KEYBOARD_INPUT_TYPE_EMAIL to 209,
            S3E_KEYBOARD_INPUT_TYPE_NUMBER to 2,
            S3E_KEYBOARD_INPUT_TYPE_PHONE to 3,
        )
    }
}
