package com.ideaworks3d.marmalade

import android.view.SurfaceHolder
import javax.microedition.khronos.egl.EGL
import javax.microedition.khronos.egl.EGL10
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.egl.EGLContext
import javax.microedition.khronos.egl.EGLDisplay
import javax.microedition.khronos.egl.EGLSurface
import javax.microedition.khronos.opengles.GL

class LoaderGL {
    companion object {
        const val EGL_CONTEXT_CLIENT_VERSION = 0x3098
        const val EGL_DEPTH_ENCODING_NV = 0x30e2
        const val EGL_NONE = 12344
        const val EGL_BUFFER_SIZE = 0x3020
        const val EGL_DEPTH_SIZE = 0x3025
        const val EGL_SURFACE_TYPE = 0x3033
        const val EGL_RENDERABLE_TYPE = 0x3040
        const val EGL_RED_SIZE = 0x3024
        const val EGL_GREEN_SIZE = 0x3023
        const val EGL_BLUE_SIZE = 0x3022
        const val EGL_ALPHA_SIZE = 0x3021
        const val EGL_STENCIL_SIZE = 0x3026
        const val EGL_SAMPLE_BUFFERS = 0x3032
        const val EGL_SAMPLES = 0x3031
        const val EGL_CONFIG_CAVEAT = 0x3027
        const val EGL_CONFIG_ID = 0x3028
    }

    private var m_GLVersion = 2
    private var m_DoneInit = false
    private var m_Started = false

    private var m_Egl: EGL10? = null
    private lateinit var m_EglConfigs: Array<EGLConfig?>
    private var m_EglContext: EGLContext? = null
    private lateinit var m_EglDisplay: EGLDisplay
    private var m_EglSurface: EGLSurface? = null

    private val m_ConfigSettings = arrayOf(
        LoaderGL_ConfigSetting(EGL_BUFFER_SIZE, EGL_NONE),
        LoaderGL_ConfigSetting(EGL_DEPTH_ENCODING_NV, EGL_NONE),
        LoaderGL_ConfigSetting(EGL_DEPTH_SIZE, EGL_NONE),
        LoaderGL_ConfigSetting(EGL_SURFACE_TYPE, EGL_NONE),
        LoaderGL_ConfigSetting(EGL_RED_SIZE, EGL_NONE),
        LoaderGL_ConfigSetting(EGL_GREEN_SIZE, EGL_NONE),
        LoaderGL_ConfigSetting(EGL_BLUE_SIZE, EGL_NONE),
        LoaderGL_ConfigSetting(EGL_ALPHA_SIZE, EGL_NONE),
        LoaderGL_ConfigSetting(EGL_STENCIL_SIZE, EGL_NONE),
        LoaderGL_ConfigSetting(EGL_SAMPLE_BUFFERS, EGL_NONE),
        LoaderGL_ConfigSetting(EGL_SAMPLES, EGL_NONE)
    )

    private fun createSpecFromSettings(): IntArray {
        val count = m_ConfigSettings.count { it.hasValue() }
        val spec = IntArray(count * 2 + 1)
        var idx = 0
        for (setting in m_ConfigSettings) {
            if (setting.hasValue()) {
                spec[idx * 2] = setting.mSetting
                spec[idx * 2 + 1] = setting.mValue
                idx++
            }
        }
        spec[count * 2] = EGL_NONE
        return spec
    }

    private fun chooseConfigs() {
        val spec = createSpecFromSettings()
        val numConfigs = IntArray(1)

        if (!m_Egl!!.eglChooseConfig(m_EglDisplay, spec, null, 0, numConfigs)) {
            return
        }

        val total = numConfigs[0]
        if (total <= 0) {
            m_EglConfigs = emptyArray()
            return
        }

        m_EglConfigs = arrayOfNulls(total)
        m_Egl!!.eglChooseConfig(m_EglDisplay, spec, m_EglConfigs, total, numConfigs)

        if (total > 0) {
            val config = m_EglConfigs[0]
            val value = IntArray(1)
            m_Egl!!.eglGetConfigAttrib(m_EglDisplay, config, EGL_RED_SIZE, value)
            m_Egl!!.eglGetConfigAttrib(m_EglDisplay, config, EGL_GREEN_SIZE, value)
            m_Egl!!.eglGetConfigAttrib(m_EglDisplay, config, EGL_BLUE_SIZE, value)
            m_Egl!!.eglGetConfigAttrib(m_EglDisplay, config, EGL_ALPHA_SIZE, value)
            m_Egl!!.eglGetConfigAttrib(m_EglDisplay, config, EGL_DEPTH_SIZE, value)
            m_Egl!!.eglGetConfigAttrib(m_EglDisplay, config, EGL_RENDERABLE_TYPE, value)
            m_Egl!!.eglGetConfigAttrib(m_EglDisplay, config, EGL_CONFIG_CAVEAT, value)
        }
    }

    private fun stop() {
        if (m_Egl == null) return

        if (m_EglSurface != null) {
            m_Egl!!.eglMakeCurrent(m_EglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)
            m_Egl!!.eglDestroySurface(m_EglDisplay, m_EglSurface)
            m_EglSurface = null
        }

        if (m_EglContext != null) {
            m_Egl!!.eglDestroyContext(m_EglDisplay, m_EglContext)
            m_EglContext = null
        }

        m_Started = false
    }

    fun init() {
        val egl = EGLContext.getEGL() as EGL10
        m_Egl = egl

        val display = egl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY)
        m_EglDisplay = display as EGLDisplay

        val majorMinor = IntArray(2)
        egl.eglInitialize(m_EglDisplay, majorMinor)

        chooseConfigs()

        val contextAttribs = if (m_GLVersion >= 2) {
            intArrayOf(EGL_CONTEXT_CLIENT_VERSION, m_GLVersion, EGL_NONE)
        } else {
            null
        }

        m_EglContext = egl.eglCreateContext(m_EglDisplay, m_EglConfigs[0], EGL10.EGL_NO_CONTEXT, contextAttribs)
        m_DoneInit = true
    }

    fun pauseGL() {
        stop()
    }

    fun restartGL(holder: SurfaceHolder): GL? {
        stop()
        return startGL(holder, m_GLVersion)
    }

    fun resumeGL(holder: SurfaceHolder): GL? {
        return startGL(holder, m_GLVersion)
    }

    fun startGL(holder: SurfaceHolder, glVersion: Int): GL? {
        if (glVersion != 0) {
            m_GLVersion = glVersion
        }
        if (!m_DoneInit) {
            init()
        }

        val surface = m_Egl!!.eglCreateWindowSurface(m_EglDisplay, m_EglConfigs[0], holder, null)
        m_EglSurface = surface

        m_Egl!!.eglMakeCurrent(m_EglDisplay, surface, surface, m_EglContext)

        m_Started = true
        return (m_EglContext as EGLContext).gl
    }

    fun started(): Boolean = m_Started

    fun stopGL() {
        stop()
    }

    fun swap() {
        if (m_Egl != null && m_EglSurface != null) {
            m_Egl!!.eglSwapBuffers(m_EglDisplay, m_EglSurface)
        }
    }

    fun term() {
        if (m_Egl != null) {
            stop()
            m_Egl!!.eglTerminate(m_EglDisplay)
        }
        m_DoneInit = false
        m_Egl = null
    }
}
