package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityEventCompatIcs.java.
// 0 fields, 5 methods.

open class AccessibilityEventCompatIcs {
    constructor()

    companion object {
    public @JvmStatic fun appendRecord(event: android.view.accessibility.AccessibilityEvent, record: Object) { /* TODO(body): (Landroid/view/accessibility/AccessibilityEvent;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Landroid/view/accessibility/AccessibilityRecord;
    //         .end local p1    # "record":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityEvent;->appendRecord(Landroid/view/accessibility/AccessibilityRecord;)V
    //         return-void
    */

    public @JvmStatic fun getRecord(event: android.view.accessibility.AccessibilityEvent, index: Int): Object { return TODO("body: (Landroid/view/accessibility/AccessibilityEvent;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityEvent;->getRecord(I)Landroid/view/accessibility/AccessibilityRecord;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getRecordCount(event: android.view.accessibility.AccessibilityEvent): Int { return TODO("body: (Landroid/view/accessibility/AccessibilityEvent;)I") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityEvent;->getRecordCount()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun setScrollable(event: android.view.accessibility.AccessibilityEvent, scrollable: Boolean) { /* TODO(body): (Landroid/view/accessibility/AccessibilityEvent;Z)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V
    //         return-void
    */

    }
}
