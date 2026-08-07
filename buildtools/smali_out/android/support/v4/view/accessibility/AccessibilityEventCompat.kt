package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityEventCompat.java.
// 17 fields, 6 methods.

open class AccessibilityEventCompat {
    private constructor()

    companion object {
    private val IMPL: android.support.v4.view.accessibility.AccessibilityEventCompat.AccessibilityEventVersionImpl = null!!
    @JvmField public val TYPES_ALL_MASK: Int = 0
    @JvmField public val TYPE_ANNOUNCEMENT: Int = 0x4000
    @JvmField public val TYPE_GESTURE_DETECTION_END: Int = 0x80000
    @JvmField public val TYPE_GESTURE_DETECTION_START: Int = 0x40000
    @JvmField public val TYPE_TOUCH_EXPLORATION_GESTURE_END: Int = 0x400
    @JvmField public val TYPE_TOUCH_EXPLORATION_GESTURE_START: Int = 0x200
    @JvmField public val TYPE_TOUCH_INTERACTION_END: Int = 0x200000
    @JvmField public val TYPE_TOUCH_INTERACTION_START: Int = 0x100000
    @JvmField public val TYPE_VIEW_ACCESSIBILITY_FOCUSED: Int = 0x8000
    @JvmField public val TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED: Int = 0x10000
    @JvmField public val TYPE_VIEW_HOVER_ENTER: Int = 0x80
    @JvmField public val TYPE_VIEW_HOVER_EXIT: Int = 0x100
    @JvmField public val TYPE_VIEW_SCROLLED: Int = 0x1000
    @JvmField public val TYPE_VIEW_TEXT_SELECTION_CHANGED: Int = 0x2000
    @JvmField public val TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY: Int = 0x20000
    @JvmField public val TYPE_WINDOW_CONTENT_CHANGED: Int = 0x800

    public @JvmStatic fun appendRecord(event: android.view.accessibility.AccessibilityEvent, record: android.support.v4.view.accessibility.AccessibilityRecordCompat) { /* TODO(body): (Landroid/view/accessibility/AccessibilityEvent;Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;
    //         invoke-virtual {p1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->getImpl()Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-interface {v0, p0, v1}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;->appendRecord(Landroid/view/accessibility/AccessibilityEvent;Ljava/lang/Object;)V
    //         return-void
    */

    public @JvmStatic fun asRecord(event: android.view.accessibility.AccessibilityEvent): android.support.v4.view.accessibility.AccessibilityRecordCompat { return TODO("body: (Landroid/view/accessibility/AccessibilityEvent;)Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
    //         invoke-direct {v0, p0}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;-><init>(Ljava/lang/Object;)V
    //         return-object v0
    */

    public @JvmStatic fun getRecord(event: android.view.accessibility.AccessibilityEvent, index: Int): android.support.v4.view.accessibility.AccessibilityRecordCompat { return TODO("body: (Landroid/view/accessibility/AccessibilityEvent;I)Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;
    //         sget-object v1, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;
    //         invoke-interface {v1, p0, p1}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;->getRecord(Landroid/view/accessibility/AccessibilityEvent;I)Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;-><init>(Ljava/lang/Object;)V
    //         return-object v0
    */

    public @JvmStatic fun getRecordCount(event: android.view.accessibility.AccessibilityEvent): Int { return TODO("body: (Landroid/view/accessibility/AccessibilityEvent;)I") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->IMPL:Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat$AccessibilityEventVersionImpl;->getRecordCount(Landroid/view/accessibility/AccessibilityEvent;)I
    //         move-result v0
    //         return v0
    */

    }
}
