package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 13 fields, 36 methods.

open class LoaderActivity: android.app.Activity() {
        public var m_ListenerManager: com.ideaworks3d.marmalade.event.ListenerManager
        private var m_LoaderThread: com.ideaworks3d.marmalade.LoaderThread
        public var m_View: com.ideaworks3d.marmalade.LoaderView
        public var m_TopLevel: android.widget.RelativeLayout
        public var m_FrameLayout: android.widget.FrameLayout
        public var m_IgnoreFocusLoss: Boolean
        private var m_IntentBlocking: Boolean
        private var m_ExecuteIntentActivityNotFoundException: Boolean
        private var m_Data: android.content.Intent
        private var m_ProgressDialogHandler: android.os.Handler
        private var m_orientationEventListener: android.view.OrientationEventListener
        private var m_LegacySuspendMode: Boolean

    private external fun onOrientationChangedNative()
    private external fun setART(p0: Boolean)
    public fun LoaderThread(): com.ideaworks3d.marmalade.LoaderThread { return TODO("body: ()Lcom/ideaworks3d/marmalade/LoaderThread;") }
    protected fun attachBaseContext(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    protected fun onCreate(p0: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    public fun createView(p0: Boolean) { /* TODO(body): (Z)V */ }
    public fun onWindowFocusChanged(p0: Boolean) { /* TODO(body): (Z)V */ }
    public fun onConfigurationChanged(p0: android.content.res.Configuration) { /* TODO(body): (Landroid/content/res/Configuration;)V */ }
    protected fun onStart() { /* TODO(body): ()V */ }
    protected fun onRestart() { /* TODO(body): ()V */ }
    protected fun onResume() { /* TODO(body): ()V */ }
    protected fun onPause() { /* TODO(body): ()V */ }
    protected fun onStop() { /* TODO(body): ()V */ }
    protected fun onDestroy() { /* TODO(body): ()V */ }
    public fun onLowMemory() { /* TODO(body): ()V */ }
    private fun isScreenLocked(): Boolean { return TODO("body: ()Z") }
    private fun isScreenOn(): Boolean { return TODO("body: ()Z") }
    private fun startDelayedResume() { /* TODO(body): ()V */ }
    private fun startLoader() { /* TODO(body): ()V */ }
    public fun dispatchTouchEvent(p0: android.view.MotionEvent): Boolean { return TODO("body: (Landroid/view/MotionEvent;)Z") }
    private fun onKeyEvent(p0: Int, p1: Int, p2: android.view.KeyEvent): Boolean { return TODO("body: (IILandroid/view/KeyEvent;)Z") }
    public fun onKeyDown(p0: Int, p1: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    public fun onKeyUp(p0: Int, p1: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    public fun dispatchKeyEvent(p0: android.view.KeyEvent): Boolean { return TODO("body: (Landroid/view/KeyEvent;)Z") }
    public fun getIgnoreFocusLoss(): Boolean { return TODO("body: ()Z") }
    public fun setIgnoreFocusLoss(p0: Boolean) { /* TODO(body): (Z)V */ }
    public fun ExecuteIntent(p0: android.content.Intent): android.content.Intent { return TODO("body: (Landroid/content/Intent;)Landroid/content/Intent;") }
    public fun executeIntentActivityNotFoundException(): Boolean { return TODO("body: ()Z") }
    protected fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    public fun onRequestPermissionsResult(p0: Int, p1: Array<String>, p2: Array<Int>) { /* TODO(body): (I[Ljava/lang/String;[I)V */ }
    public fun getCursor(p0: android.net.Uri, p1: Array<String>, p2: com.ideaworks3d.marmalade.LoaderActivity$CursorCompleteListener) { /* TODO(body): (Landroid/net/Uri;[Ljava/lang/String;Lcom/ideaworks3d/marmalade/LoaderActivity$CursorCompleteListener;)V */ }
    public fun ShowProgressDialog() { /* TODO(body): ()V */ }
    public fun HideProgressDialog() { /* TODO(body): ()V */ }
    protected fun onNewIntent(p0: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    private fun IsRunningART(): Boolean { return TODO("body: ()Z") }
    public fun isReadyForSuspend(p0: Boolean): Boolean { return TODO("body: (Z)Z") }

    companion object {
        @JvmField public var m_Activity: com.ideaworks3d.marmalade.LoaderActivity
    }
}
