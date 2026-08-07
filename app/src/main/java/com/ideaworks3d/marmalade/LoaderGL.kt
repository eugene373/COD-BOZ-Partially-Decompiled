package com.ideaworks3d.marmalade

import android.view.SurfaceHolder
import javax.microedition.khronos.egl.EGL10
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.egl.EGLContext
import javax.microedition.khronos.egl.EGLDisplay
import javax.microedition.khronos.egl.EGLSurface
import javax.microedition.khronos.opengles.GL

internal class LoaderGL {
    private var m_Started = false
    private var m_DoneInit = false
    private var m_GLVersion = 0
    var m_Egl: EGL10? = null
    var m_EglDisplay: EGLDisplay? = null
    var m_EglSurface: EGLSurface? = null
    var m_EglConfigs: Array<EGLConfig?>? = null
    var m_EglContext: EGLContext? = null

    fun started(): Boolean = m_Started

    fun init() {
        m_Egl = EGLContext.getEGL() as EGL10
        m_EglDisplay = m_Egl!!.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY)
        m_Egl!!.eglInitialize(m_EglDisplay, IntArray(2))
        chooseConfigs()
        var ctxAttrs: IntArray? = null
        if (m_GLVersion >= 2) {
            ctxAttrs = intArrayOf(EGL_CONTEXT_CLIENT_VERSION, m_GLVersion, EGL10.EGL_NONE)
        }
        m_EglContext = m_Egl!!.eglCreateContext(m_EglDisplay, m_EglConfigs!![0], EGL10.EGL_NO_CONTEXT, ctxAttrs)
        m_DoneInit = true
    }

    fun startGL(holder: SurfaceHolder?, glVersion: Int): GL {
        trace("startGL: $holder")
        if (glVersion != 0) m_GLVersion = glVersion
        if (!m_DoneInit) init()
        m_EglSurface = m_Egl!!.eglCreateWindowSurface(m_EglDisplay, m_EglConfigs!![0], holder, null)
        val ok = m_Egl!!.eglMakeCurrent(m_EglDisplay, m_EglSurface, m_EglSurface, m_EglContext)
        trace("startGL done: $m_EglContext eglMakeCurrent: $ok")
        m_Started = true
        return m_EglContext!!.gl
    }

    private fun CreateSpecFromSettings(settings: Array<ConfigSetting>): IntArray {
        var count = CountSettingsWithValue(settings)
        if (m_GLVersion >= 2) count++
        val spec = IntArray(2 * count + 1)
        var copied = CopySettingsWithValues(settings, spec)
        if (m_GLVersion >= 2) {
            spec[2 * copied] = EGL_RENDERABLE_TYPE
            spec[2 * copied + 1] = 4
            copied++
        }
        spec[2 * copied] = EGL10.EGL_NONE
        return spec
    }

    private fun chooseConfigs() {
        val settings = arrayOf(
            ConfigSetting("EGL_BUFFER_SIZE", EGL_BUFFER_SIZE),
            ConfigSetting("EGL_DEPTH_ENCODING_NV", EGL_DEPTH_ENCODING_NV),
            ConfigSetting("EGL_DEPTH_SIZE", EGL_DEPTH_SIZE),
            ConfigSetting("EGL_SURFACE_TYPE", EGL_SURFACE_TYPE),
            ConfigSetting("EGL_RED_SIZE", EGL_RED_SIZE),
            ConfigSetting("EGL_GREEN_SIZE", EGL_GREEN_SIZE),
            ConfigSetting("EGL_BLUE_SIZE", EGL_BLUE_SIZE),
            ConfigSetting("EGL_ALPHA_SIZE", EGL_ALPHA_SIZE),
            ConfigSetting("EGL_STENCIL_SIZE", EGL_STENCIL_SIZE),
            ConfigSetting("EGL_SAMPLE_BUFFERS", EGL_SAMPLE_BUFFERS),
            ConfigSetting("EGL_SAMPLES", EGL_SAMPLES),
        )
        val count = IntArray(1)
        var revertIndex = 0
        while (true) {
            val spec = CreateSpecFromSettings(settings)
            m_Egl!!.eglChooseConfig(m_EglDisplay, spec, null, 0, count)
            if (count[0] != 0) {
                val n = count[0]
                m_EglConfigs = arrayOfNulls<EGLConfig>(n)
                m_Egl!!.eglChooseConfig(m_EglDisplay, spec, m_EglConfigs, n, count)
                val cfg = m_EglConfigs!![0]!!
                val r = findConfigAttrib(m_Egl!!, m_EglDisplay, cfg, EGL_RED_SIZE, 0)
                val g = findConfigAttrib(m_Egl!!, m_EglDisplay, cfg, EGL_GREEN_SIZE, 0)
                val b = findConfigAttrib(m_Egl!!, m_EglDisplay, cfg, EGL_BLUE_SIZE, 0)
                val a = findConfigAttrib(m_Egl!!, m_EglDisplay, cfg, EGL_ALPHA_SIZE, 0)
                val d = findConfigAttrib(m_Egl!!, m_EglDisplay, cfg, EGL_DEPTH_SIZE, 0)
                val renderableType = findConfigAttrib(m_Egl!!, m_EglDisplay, cfg, EGL_RENDERABLE_TYPE, 0)
                findConfigAttrib(m_Egl!!, m_EglDisplay, cfg, EGL_RENDERABLE_TYPE, EGL10.EGL_NONE)
                trace("EGLConfig: r: $r g: $g b: $b a: $a d: $d renderable_type: $renderableType")
                return
            }
            if (revertIndex >= settings.size) {
                throw RuntimeException("Failed to choose an EGL config")
            }
            val s = settings[revertIndex]
            trace("No matching egl configs... reverting setting: ${s.GetName()} : ${s.GetValue()} -> ${s.GetDefault()}")
            s.SetValueToDefault()
            revertIndex++
        }
    }

    private fun findConfigAttrib(egl: EGL10, display: EGLDisplay?, config: EGLConfig, attribute: Int, defaultValue: Int): Int {
        val out = IntArray(1)
        return if (egl.eglGetConfigAttrib(display, config, attribute, out)) out[0] else defaultValue
    }

    fun swap() {
        m_Egl!!.eglSwapBuffers(m_EglDisplay, m_EglSurface)
    }

    fun restartGL(holder: SurfaceHolder?): GL {
        trace("restartGL: $holder")
        stop()
        return startGL(holder, m_GLVersion)
    }

    fun stopGL() {
        trace("stopGL")
        stop()
        term()
    }

    fun pauseGL() {
        trace("pauseGL")
        stop()
    }

    fun resumeGL(holder: SurfaceHolder?): GL {
        trace("resumeGL: $holder")
        return startGL(holder, m_GLVersion)
    }

    private fun stop() {
        trace("stop : ${Thread.currentThread()}")
        trace("surface : $m_EglSurface display : $m_EglDisplay")
        trace("eglGetDisplay : ${m_Egl!!.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY)}")
        m_Started = false
        if (m_EglSurface != null) {
            trace("--> eglMakeCurrent")
            m_Egl!!.eglMakeCurrent(m_EglDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)
            trace("<-- eglMakeCurrent")
            m_Egl!!.eglDestroySurface(m_EglDisplay, m_EglSurface)
            m_EglSurface = null
        }
    }

    fun term() {
        trace("term")
        if (m_EglContext != null) {
            m_Egl!!.eglDestroyContext(m_EglDisplay, m_EglContext)
            m_EglContext = null
        }
        if (m_EglDisplay != null) {
            m_Egl!!.eglTerminate(m_EglDisplay)
            m_EglDisplay = null
        }
        m_DoneInit = false
    }

    private fun trace(msg: String) {
        LoaderAPI.traceChan(className() + "-" + Thread.currentThread().name, msg)
    }

    private fun className(): String {
        val full = this::class.java.name
        return full.substring(full.lastIndexOf('.') + 1)
    }

    internal class ConfigSetting @JvmOverloads constructor(
        private val mName: String,
        private val mSetting: Int,
        defaultValue: Int = -1,
    ) {
        private var mValue: Int
        private val mDefault: Int = defaultValue

        init {
            val out = intArrayOf(-1)
            if (LoaderAPI.s3eConfigGetInt("GL", mName, out) == 0) {
                mValue = out[0]
                trace("$mName : 0x" + Integer.toString(mValue, 16).uppercase())
            } else {
                mValue = mDefault
            }
        }

        fun GetName(): String = mName
        fun GetSetting(): Int = mSetting
        fun GetValue(): Int = mValue
        fun GetDefault(): Int = mDefault
        fun SetValueToDefault() { mValue = mDefault }
        fun HasValue(): Boolean = mValue != -1

        private fun trace(msg: String) {
            LoaderAPI.traceChan(className() + "-" + Thread.currentThread().name, msg)
        }

        private fun className(): String {
            val full = this::class.java.name
            return full.substring(full.lastIndexOf('.') + 1)
        }
    }

    companion object {
        private const val EGL_CONTEXT_CLIENT_VERSION = 12440
        private const val EGL_DEPTH_ENCODING_NV = 12514
        private const val EGL_BUFFER_SIZE = 12320
        private const val EGL_DEPTH_SIZE = 12325
        private const val EGL_SURFACE_TYPE = 12339
        private const val EGL_RED_SIZE = 12324
        private const val EGL_GREEN_SIZE = 12323
        private const val EGL_BLUE_SIZE = 12322
        private const val EGL_ALPHA_SIZE = 12321
        private const val EGL_STENCIL_SIZE = 12326
        private const val EGL_SAMPLE_BUFFERS = 12338
        private const val EGL_SAMPLES = 12337
        private const val EGL_RENDERABLE_TYPE = 12352

        private fun CountSettingsWithValue(settings: Array<ConfigSetting>): Int {
            var count = 0
            for (s in settings) if (s.HasValue()) count++
            return count
        }

        private fun CopySettingsWithValues(settings: Array<ConfigSetting>, out: IntArray): Int {
            var copied = 0
            for (s in settings) {
                if (s.HasValue()) {
                    out[2 * copied] = s.GetSetting()
                    out[2 * copied + 1] = s.GetValue()
                    copied++
                }
            }
            return copied
        }
    }
}
