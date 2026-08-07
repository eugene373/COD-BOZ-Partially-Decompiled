package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeInfoCompat.java.
// 4 fields, 6 methods.

open class AccessibilityNodeInfoCompat_CollectionInfoCompat {
    val mInfo: Object

    private constructor(info: Object)

    constructor(x0: Object, x1: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.1)

    public fun getColumnCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->access$000()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getCollectionInfoColumnCount(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getRowCount(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->access$000()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getCollectionInfoRowCount(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun isHierarchical(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->access$000()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isCollectionInfoHierarchical(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    companion object {
    @JvmField public val SELECTION_MODE_MULTIPLE: Int = 0x2
    @JvmField public val SELECTION_MODE_NONE: Int = 0x0
    @JvmField public val SELECTION_MODE_SINGLE: Int = 0x1

    public @JvmStatic fun obtain(rowCount: Int, columnCount: Int, hierarchical: Boolean, selectionMode: Int): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat { return TODO("body: (IIZI)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;
    //         invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->access$000()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         move-result-object v1
    //         invoke-interface {v1, p0, p1, p2, p3}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->obtainCollectionInfo(IIZI)Ljava/lang/Object;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionInfoCompat;-><init>(Ljava/lang/Object;)V
    //         return-object v0
    */

    }
}
