package com.ideaworks3d.marmalade

// Auto-emitted from javap text dump. See HOWTO_BUILD.md.
// 5 fields, 11 methods.

open class LoaderKeyboard: com.ideaworks3d.marmalade.SuspendResumeListener {
        private var m_onScreenKeyboard: Boolean
        private var m_pausing: Boolean
        private var m_Receiver: com.ideaworks3d.marmalade.LoaderKeyboard$SoftInputReceiver
        private var m_View: com.ideaworks3d.marmalade.LoaderView
        private var m_keyboardInputType: Int

    private external fun onKeyEventNative(p0: Int, p1: Int, p2: Int): Boolean
    private external fun setCharInputEnabledNative(p0: Boolean)
    public fun onSuspendResumeEvent(p0: com.ideaworks3d.marmalade.SuspendResumeEvent) { /* TODO(body): (Lcom/ideaworks3d/marmalade/SuspendResumeEvent;)V */ }
    public fun onKeyEvent(p0: Int, p1: Int, p2: android.view.KeyEvent): Boolean { return TODO("body: (IILandroid/view/KeyEvent;)Z") }
    public fun onKeyPreIme(p0: Int, p1: android.view.KeyEvent): Boolean { return TODO("body: (ILandroid/view/KeyEvent;)Z") }
    public fun hardKeyboardConfigurationChanged(p0: Boolean) { /* TODO(body): (Z)V */ }
    public fun getKeyboardInputType(): Int { return TODO("body: ()I") }
    public fun setKeyboardInputType(p0: Int) { /* TODO(body): (I)V */ }
    public fun setShowOnScreenKeyboard(p0: Boolean) { /* TODO(body): (Z)V */ }
    public fun getShowOnScreenKeyboard(): Boolean { return TODO("body: ()Z") }
    public fun getKeyboardInfo(): Int { return TODO("body: ()I") }
}
