package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 8 fields, 15 methods.

open class LoaderGL {
        private var m_Started: Boolean
        private var m_DoneInit: Boolean
        private var m_GLVersion: Int
        var m_Egl: javax.microedition.khronos.egl.EGL10
        var m_EglDisplay: javax.microedition.khronos.egl.EGLDisplay
        var m_EglSurface: javax.microedition.khronos.egl.EGLSurface
        var m_EglConfigs: Array<javax.microedition.khronos.egl.EGLConfig>
        var m_EglContext: javax.microedition.khronos.egl.EGLContext

    public fun started(): Boolean { return TODO("body: ()Z") }
    public fun init() { /* TODO(body): ()V */ }
    public fun startGL(p0: android.view.SurfaceHolder, p1: Int): javax.microedition.khronos.opengles.GL { return TODO("body: (Landroid/view/SurfaceHolder;I)Ljavax/microedition/khronos/opengles/GL;") }
    private fun CreateSpecFromSettings(p0: Array<com.ideaworks3d.marmalade.LoaderGL$ConfigSetting>): Array<Int> { return TODO("body: ([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;)[I") }
    private fun chooseConfigs() { /* TODO(body): ()V */ }
    private fun findConfigAttrib(p0: javax.microedition.khronos.egl.EGL10, p1: javax.microedition.khronos.egl.EGLDisplay, p2: javax.microedition.khronos.egl.EGLConfig, p3: Int, p4: Int): Int { return TODO("body: (Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;Ljavax/microedition/khronos/egl/EGLConfig;II)I") }
    public fun swap() { /* TODO(body): ()V */ }
    public fun restartGL(p0: android.view.SurfaceHolder): javax.microedition.khronos.opengles.GL { return TODO("body: (Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;") }
    public fun stopGL() { /* TODO(body): ()V */ }
    public fun pauseGL() { /* TODO(body): ()V */ }
    public fun resumeGL(p0: android.view.SurfaceHolder): javax.microedition.khronos.opengles.GL { return TODO("body: (Landroid/view/SurfaceHolder;)Ljavax/microedition/khronos/opengles/GL;") }
    private fun stop() { /* TODO(body): ()V */ }
    public fun term() { /* TODO(body): ()V */ }

    companion object {
        private @JvmStatic fun CountSettingsWithValue(p0: Array<com.ideaworks3d.marmalade.LoaderGL$ConfigSetting>): Int { return TODO("body: ([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;)I") }
        private @JvmStatic fun CopySettingsWithValues(p0: Array<com.ideaworks3d.marmalade.LoaderGL$ConfigSetting>, p1: Array<Int>): Int { return TODO("body: ([Lcom/ideaworks3d/marmalade/LoaderGL$ConfigSetting;[I)I") }
    }
}
