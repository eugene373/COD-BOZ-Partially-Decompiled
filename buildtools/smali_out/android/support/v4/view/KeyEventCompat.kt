package android.support.v4.view

// Auto-emitted from smali source: KeyEventCompat.java.
// 1 fields, 11 methods.

open class KeyEventCompat {
    public constructor()

    companion object {
    val IMPL: android.support.v4.view.KeyEventCompat.KeyEventVersionImpl = null!!

    public @JvmStatic fun dispatch(event: android.view.KeyEvent, receiver: android.view.KeyEvent.Callback, state: Object, target: Object): Boolean { return TODO("body: (Landroid/view/KeyEvent;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;
    //         invoke-interface {v0, p0, p1, p2, p3}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->dispatch(Landroid/view/KeyEvent;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getKeyDispatcherState(view: android.view.View): Object { return TODO("body: (Landroid/view/View;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->getKeyDispatcherState(Landroid/view/View;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun hasModifiers(event: android.view.KeyEvent, modifiers: Int): Boolean { return TODO("body: (Landroid/view/KeyEvent;I)Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;
    //         invoke-virtual {p0}, Landroid/view/KeyEvent;->getMetaState()I
    //         move-result v1
    //         invoke-interface {v0, v1, p1}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->metaStateHasModifiers(II)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun hasNoModifiers(event: android.view.KeyEvent): Boolean { return TODO("body: (Landroid/view/KeyEvent;)Z") }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;
    //         invoke-virtual {p0}, Landroid/view/KeyEvent;->getMetaState()I
    //         move-result v1
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->metaStateHasNoModifiers(I)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isTracking(event: android.view.KeyEvent): Boolean { return TODO("body: (Landroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->isTracking(Landroid/view/KeyEvent;)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun metaStateHasModifiers(metaState: Int, modifiers: Int): Boolean { return TODO("body: (II)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->metaStateHasModifiers(II)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun metaStateHasNoModifiers(metaState: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->metaStateHasNoModifiers(I)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun normalizeMetaState(metaState: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->normalizeMetaState(I)I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun startTracking(event: android.view.KeyEvent) { /* TODO(body): (Landroid/view/KeyEvent;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/KeyEventCompat;->IMPL:Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/KeyEventCompat$KeyEventVersionImpl;->startTracking(Landroid/view/KeyEvent;)V
    //         return-void
    */

    }
}
