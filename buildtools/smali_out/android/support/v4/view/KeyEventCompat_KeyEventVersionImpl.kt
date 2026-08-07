package android.support.v4.view

// Auto-emitted from smali source: KeyEventCompat.java.
// 0 fields, 7 methods.

interface KeyEventCompat_KeyEventVersionImpl {
    public fun dispatch(p0: android.view.KeyEvent, p1: android.view.KeyEvent.Callback, p2: Object, p3: Object): Boolean

    public fun getKeyDispatcherState(p0: android.view.View): Object

    public fun isTracking(p0: android.view.KeyEvent): Boolean

    public fun metaStateHasModifiers(p0: Int, p1: Int): Boolean

    public fun metaStateHasNoModifiers(p0: Int): Boolean

    public fun normalizeMetaState(p0: Int): Int

    public fun startTracking(p0: android.view.KeyEvent)

}
