package android.support.v4.view

// Auto-emitted from smali source: KeyEventCompat.java.
// 2 fields, 9 methods.

open class KeyEventCompat_BaseKeyEventVersionImpl: android.support.v4.view.KeyEventCompat.KeyEventVersionImpl {
    constructor()

    public fun dispatch(event: android.view.KeyEvent, receiver: android.view.KeyEvent.Callback, state: Object, target: Object): Boolean { return TODO("body: (Landroid/view/KeyEvent;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p1, p2}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;)Z
    //         move-result v0
    //         return v0
    */

    public fun getKeyDispatcherState(view: android.view.View): Object { return TODO("body: (Landroid/view/View;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun isTracking(event: android.view.KeyEvent): Boolean { return TODO("body: (Landroid/view/KeyEvent;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun metaStateHasModifiers(metaState: Int, modifiers: Int): Boolean { return TODO("body: (II)Z") }
    /*
    //         .locals 4
    //         const/4 v0, 0x1
    //         invoke-virtual {p0, p1}, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;->normalizeMetaState(I)I
    //         move-result v1
    //         and-int/lit16 p1, v1, 0xf7
    //         const/16 v1, 0x40
    //         const/16 v2, 0x80
    //         invoke-static {p1, p2, v0, v1, v2}, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;->metaStateFilterDirectionalModifiers(IIIII)I
    //         move-result p1
    //         const/4 v1, 0x2
    //         const/16 v2, 0x10
    //         const/16 v3, 0x20
    //         invoke-static {p1, p2, v1, v2, v3}, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;->metaStateFilterDirectionalModifiers(IIIII)I
    //         move-result p1
    //         if-ne p1, p2, :cond_0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun metaStateHasNoModifiers(metaState: Int): Boolean { return TODO("body: (I)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Landroid/support/v4/view/KeyEventCompat$BaseKeyEventVersionImpl;->normalizeMetaState(I)I
    //         move-result v0
    //         and-int/lit16 v0, v0, 0xf7
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public fun normalizeMetaState(metaState: Int): Int { return TODO("body: (I)I") }
    /*
    //         .locals 1
    //         and-int/lit16 v0, p1, 0xc0
    //         if-eqz v0, :cond_0
    //         or-int/lit8 p1, p1, 0x1
    //         :cond_0
    //         and-int/lit8 v0, p1, 0x30
    //         if-eqz v0, :cond_1
    //         or-int/lit8 p1, p1, 0x2
    //         :cond_1
    //         and-int/lit16 v0, p1, 0xf7
    //         return v0
    */

    public fun startTracking(event: android.view.KeyEvent) { /* TODO(body): (Landroid/view/KeyEvent;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    companion object {
    private val META_ALL_MASK: Int = 0xf7
    private val META_MODIFIER_MASK: Int = 0xf7

    private @JvmStatic fun metaStateFilterDirectionalModifiers(metaState: Int, modifiers: Int, basic: Int, left: Int, right: Int): Int { return TODO("body: (IIIII)I") }
    /*
    //         .locals 5
    //         const/4 v2, 0x1
    //         const/4 v3, 0x0
    //         and-int v4, p1, p2
    //         if-eqz v4, :cond_0
    //         move v1, v2
    //         .local v1, "wantBasic":Z
    //         :goto_0
    //         or-int v0, p3, p4
    //         .local v0, "directional":I
    //         and-int v4, p1, v0
    //         if-eqz v4, :cond_1
    //         .local v2, "wantLeftOrRight":Z
    //         :goto_1
    //         if-eqz v1, :cond_4
    //         if-eqz v2, :cond_2
    //         new-instance v3, Ljava/lang/IllegalArgumentException;
    //         const-string v4, "bad arguments"
    //         invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v3
    //         .end local v0    # "directional":I
    //         .end local v1    # "wantBasic":Z
    //         .end local v2    # "wantLeftOrRight":Z
    //         :cond_0
    //         move v1, v3
    //         goto :goto_0
    //         .restart local v0    # "directional":I
    //         .restart local v1    # "wantBasic":Z
    //         :cond_1
    //         move v2, v3
    //         goto :goto_1
    //         .restart local v2    # "wantLeftOrRight":Z
    //         :cond_2
    //         xor-int/lit8 v3, v0, -0x1
    //         and-int/2addr p0, v3
    //         .end local p0    # "metaState":I
    //         :cond_3
    //         :goto_2
    //         return p0
    //         .restart local p0    # "metaState":I
    //         :cond_4
    //         if-eqz v2, :cond_3
    //         xor-int/lit8 v3, p2, -0x1
    //         and-int/2addr p0, v3
    //         goto :goto_2
    */

    }
}
