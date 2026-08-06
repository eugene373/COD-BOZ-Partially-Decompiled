package com.ideaworks3d.marmalade

import android.os.Bundle
import android.os.Handler
import android.os.ResultReceiver
import android.view.KeyEvent
import android.view.inputmethod.InputMethodManager

class LoaderKeyboard(private val m_View: LoaderView) : SuspendResumeListener {

    private var m_onScreenKeyboard = false
    private var m_pausing = false
    private val m_Handler = m_View.m_Handler

    private inner class SoftInputReceiver(handler: Handler) : ResultReceiver(handler) {
        override fun onReceiveResult(resultCode: Int, resultData: Bundle?) {
            var shouldToggle = false

            when (resultCode) {
                0, 2 -> {
                    if (m_onScreenKeyboard != true && !m_pausing) {
                        shouldToggle = true
                    }
                }
                1, 3 -> {
                    if (m_onScreenKeyboard == true && !m_pausing) {
                        shouldToggle = true
                    }
                }
            }

            if (shouldToggle) {
                val activity = LoaderActivity.m_Activity
                val imm = activity?.getSystemService("input_method") as InputMethodManager
                imm.toggleSoftInput(0, 0)
            }
        }
    }

    private val m_Receiver = SoftInputReceiver(m_Handler)

    private external fun onKeyEventNative(keyCode: Int, unicodeChar: Int, action: Int): Boolean
    private external fun setCharInputEnabledNative(enabled: Boolean)

    init {
        LoaderAPI.addSuspendResumeListener(this)
    }

    fun getKeyboardInfo(): Int {
        val config = m_View.resources.configuration
        var result = 0

        if (config.keyboard == 2 && config.hardKeyboardHidden == 2) {
            result = 1
        }

        if (config.keyboard == 3 && config.hardKeyboardHidden == 2) {
            result = result or 2
        }

        if (config.navigation >= 2) {
            try {
                val navHiddenField = config.javaClass.getField("navigationHidden")
                val navHidden = navHiddenField.get(config) as Int
                if (navHidden == 2) {
                    return result
                }
            } catch (e: Exception) {
            }

            if ("Zeus" == android.os.Build.MODEL) {
                if (config.hardKeyboardHidden == 2) {
                    return result
                }
            }
            result = result or 4
        }

        return result
    }

    fun getShowOnScreenKeyboard(): Boolean = m_onScreenKeyboard

    fun hardKeyboardConfigurationChanged(hardKeyboardHidden: Boolean) {
        if (!hardKeyboardHidden && m_onScreenKeyboard) {
            setShowOnScreenKeyboard(true)
        }
    }

    fun onKeyEvent(keyCode: Int, unicodeChar: Int, event: KeyEvent): Boolean {
        return onKeyEventNative(keyCode, unicodeChar, event.action)
    }

    fun onKeyPreIme(keyCode: Int, event: KeyEvent?): Boolean {
        var result = false
        if (keyCode == 4 && m_onScreenKeyboard) {
            setCharInputEnabledNative(false)
            setShowOnScreenKeyboard(false)
            result = true
        }
        return result
    }

    override fun onSuspendResumeEvent(event: SuspendResumeEvent) {
        when (event.eventType) {
            SuspendResumeEvent.EventType.SUSPEND -> {
                if (!m_onScreenKeyboard) return
                m_pausing = true
                setShowOnScreenKeyboard(false)
                m_onScreenKeyboard = true
            }
            SuspendResumeEvent.EventType.RESUME -> {
                m_pausing = false
                if (m_onScreenKeyboard) {
                    setShowOnScreenKeyboard(m_onScreenKeyboard)
                }
            }
            else -> {}
        }
    }

    fun setShowOnScreenKeyboard(show: Boolean) {
        m_onScreenKeyboard = show

        val activity = LoaderActivity.m_Activity
        val imm = activity?.getSystemService("input_method") as InputMethodManager

        val thread = activity?.LoaderThread()
        thread?.runOnOSThread(object : Runnable {
            override fun run() {
                if (show) {
                    m_View.requestFocus()
                    val result = imm.showSoftInput(m_View, 2, m_Receiver)
                    if (!result && m_View.hasWindowFocus()) {
                        m_View.onWindowFocusChanged(true)
                        imm.showSoftInput(m_View, 2, m_Receiver)
                    }
                } else {
                    val result = imm.hideSoftInputFromWindow(m_View.windowToken, 0, m_Receiver)
                    if (!result) {
                        imm.toggleSoftInput(0, 0)
                    }
                }
            }
        })
    }
}
