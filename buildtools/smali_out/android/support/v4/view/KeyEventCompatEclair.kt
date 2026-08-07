package android.support.v4.view

// Auto-emitted from smali source: KeyEventCompatEclair.java.
// 0 fields, 5 methods.

open class KeyEventCompatEclair {
    constructor()

    companion object {
    public @JvmStatic fun dispatch(event: android.view.KeyEvent, receiver: android.view.KeyEvent.Callback, state: Object, target: Object): Boolean { return TODO("body: (Landroid/view/KeyEvent;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p2, Landroid/view/KeyEvent$DispatcherState;
    //         .end local p2    # "state":Ljava/lang/Object;
    //         invoke-virtual {p0, p1, p2, p3}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getKeyDispatcherState(view: android.view.View): Object { return TODO("body: (Landroid/view/View;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun isTracking(event: android.view.KeyEvent): Boolean { return TODO("body: (Landroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/view/KeyEvent;->isTracking()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun startTracking(event: android.view.KeyEvent) { /* TODO(body): (Landroid/view/KeyEvent;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Landroid/view/KeyEvent;->startTracking()V
    //         return-void
    */

    }
}
