package android.support.v4.view

// Auto-emitted from smali source: KeyEventCompat.java.
// 0 fields, 5 methods.

open class KeyEventCompat_EclairKeyEventVersionImpl: android.support.v4.view.KeyEventCompat.BaseKeyEventVersionImpl() {
    constructor()

    public fun dispatch(event: android.view.KeyEvent, receiver: android.view.KeyEvent.Callback, state: Object, target: Object): Boolean { return TODO("body: (Landroid/view/KeyEvent;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2, p3, p4}, Landroid/support/v4/view/KeyEventCompatEclair;->dispatch(Landroid/view/KeyEvent;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun getKeyDispatcherState(view: android.view.View): Object { return TODO("body: (Landroid/view/View;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/KeyEventCompatEclair;->getKeyDispatcherState(Landroid/view/View;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun isTracking(event: android.view.KeyEvent): Boolean { return TODO("body: (Landroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/KeyEventCompatEclair;->isTracking(Landroid/view/KeyEvent;)Z
    //         move-result v0
    //         return v0
    */

    public fun startTracking(event: android.view.KeyEvent) { /* TODO(body): (Landroid/view/KeyEvent;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1}, Landroid/support/v4/view/KeyEventCompatEclair;->startTracking(Landroid/view/KeyEvent;)V
    //         return-void
    */

}
