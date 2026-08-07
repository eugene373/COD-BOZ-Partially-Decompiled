package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 35 fields, 48 methods.

open class LoaderView: android.view.SurfaceView(), android.view.SurfaceHolder.Callback, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener {
        public var m_GL: javax.microedition.khronos.opengles.GL
        public var m_LoaderKeyboard: com.ideaworks3d.marmalade.LoaderKeyboard
        public var m_LoaderActivity: com.ideaworks3d.marmalade.LoaderActivity
        private var m_SurfaceHolder: android.view.SurfaceHolder
        private var m_FullScreenBitmap: android.graphics.Bitmap
        private var m_Paint: android.graphics.Paint
        var m_Handler: android.os.Handler
        private var m_Vibrator: android.os.Vibrator
        private var m_Pixels: Array<Int>
        public var m_Width: Int
        public var m_Height: Int
        public var m_NewlyCreated: Boolean
        private var m_ErrorDialog: android.app.Dialog
        public var m_ErrorRunning: Boolean
        private var m_ErrorTitle: String
        private var m_ErrorBody: String
        private var m_ErrorType: Int
        private var m_ErrorRtn: Int
        private var m_InputDialog: android.app.Dialog
        private var m_InputTextTitle: String
        private var m_InputTextDefault: String
        private var m_InputTextFlags: Int
        private var m_InputTextResult: String
        public var m_InputTextRunning: Boolean
        private var m_EditText: android.widget.EditText
        private var m_VideoView: com.ideaworks3d.marmalade.S3EVideoView
        private var m_VideoState: Int
        public var m_TerminateApplication: Boolean
        private val m_ShowError: Runnable
        private val m_ShowInputText: Runnable
        private val m_BacklightOn: Runnable
        private val m_RunOnOSThread: Runnable

    private external fun setPixelsNative(p0: Int, p1: Int, p2: Array<Int>, p3: Boolean)
    private external fun runOnOSThreadNative()
    private external fun setInputText(p0: String)
    private external fun videoStoppedNotify()
    public fun getCurrentOrientation(): Int { return TODO("body: ()I") }
    private fun getCurrentKeyboardId(): String { return TODO("body: ()Ljava/lang/String;") }
    public fun onCreateInputConnection(p0: android.view.inputmethod.EditorInfo): android.view.inputmethod.InputConnection { return TODO("body: (Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;") }
    private fun backlightOn() { /* TODO(body): ()V */ }
    private fun terminateApplication() { /* TODO(body): ()V */ }
    public fun onKeyPreIme(p0: Int, p1: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    protected fun onDetachedFromWindow() { /* TODO(body): ()V */ }
    public fun onDismiss(p0: android.content.DialogInterface) { /* TODO(body): (Landroid/content/DialogInterface;)V */ }
    public fun onClick(p0: android.content.DialogInterface, p1: Int) { /* TODO(body): (Landroid/content/DialogInterface;I)V */ }
    public fun onKeyEvent(p0: Int, p1: Int, p2: android.view.KeyEvent): Boolean { return TODO("body: (IILandroid/view/KeyEvent;)Z") }
    public fun runOnOSThread() { /* TODO(body): ()V */ }
    public fun enableRespondingToRotation() { /* TODO(body): ()V */ }
    public fun videoPlay(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int, p7: Boolean, p8: Long, p9: Long): Int { return TODO("body: (Ljava/lang/String;IIIIIIZJJ)I") }
    public fun videoPause(): Int { return TODO("body: ()I") }
    public fun videoResume(): Int { return TODO("body: ()I") }
    private fun videoIsPlaying(): Boolean { return TODO("body: ()Z") }
    public fun videoStop() { /* TODO(body): ()V */ }
    public fun videoSetVolume(p0: Int) { /* TODO(body): (I)V */ }
    public fun videoGetStatus(): Int { return TODO("body: ()I") }
    public fun videoGetPosition(): Int { return TODO("body: ()I") }
    public fun videoStopped() { /* TODO(body): ()V */ }
    private fun showErrorReal() { /* TODO(body): ()V */ }
    public fun showError(p0: String, p1: String, p2: Int): Int { return TODO("body: (Ljava/lang/String;Ljava/lang/String;I)I") }
    public fun doneInputText(p0: android.content.DialogInterface, p1: Int) { /* TODO(body): (Landroid/content/DialogInterface;I)V */ }
    public fun showInputTextReal() { /* TODO(body): ()V */ }
    public fun getInputString(p0: String, p1: String, p2: Int) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;I)V */ }
    public fun vibrateStart(p0: Long) { /* TODO(body): (J)V */ }
    public fun vibrateStop() { /* TODO(body): ()V */ }
    public fun vibrateAvailable(): Boolean { return TODO("body: ()Z") }
    public fun getLocale(): String { return TODO("body: ()Ljava/lang/String;") }
    public fun glInit(p0: Int): Boolean { return TODO("body: (I)Z") }
    public fun glReInit() { /* TODO(body): ()V */ }
    public fun glPause() { /* TODO(body): ()V */ }
    public fun glResume() { /* TODO(body): ()V */ }
    public fun glTerm() { /* TODO(body): ()V */ }
    public fun glSwapBuffers() { /* TODO(body): ()V */ }
    public fun onTouchEvent(p0: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    public fun dispatchKeyEvent(p0: android.view.KeyEvent): Boolean { return TODO("body: (Landroid/view/KeyEvent;)Z") }
    protected fun onDraw(p0: android.graphics.Canvas) { /* TODO(body): (Landroid/graphics/Canvas;)V */ }
    public fun surfaceCreated(p0: android.view.SurfaceHolder) { /* TODO(body): (Landroid/view/SurfaceHolder;)V */ }
    public fun surfaceDestroyed(p0: android.view.SurfaceHolder) { /* TODO(body): (Landroid/view/SurfaceHolder;)V */ }
    public fun surfaceChanged(p0: android.view.SurfaceHolder, p1: Int, p2: Int, p3: Int) { /* TODO(body): (Landroid/view/SurfaceHolder;III)V */ }
    public fun waitForSurface(): Boolean { return TODO("body: ()Z") }
    public fun doDraw() { /* TODO(body): ()V */ }

    companion object {
        private var m_LoaderGL: com.ideaworks3d.marmalade.LoaderGL
        private var g_PixelsLast: Array<Int>
        private var g_GLActive: Boolean
    }
}
