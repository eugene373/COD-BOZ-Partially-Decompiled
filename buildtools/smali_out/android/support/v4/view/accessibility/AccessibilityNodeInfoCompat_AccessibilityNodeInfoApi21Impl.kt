package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeInfoCompat.java.
// 0 fields, 6 methods.

open class AccessibilityNodeInfoCompat_AccessibilityNodeInfoApi21Impl: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoKitKatImpl() {
    constructor()

    public fun addAction(info: Object, id: Int, label: CharSequence) { /* TODO(body): (Ljava/lang/Object;ILjava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2, p3}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatApi21;->addAction(Ljava/lang/Object;ILjava/lang/CharSequence;)V
    //         return-void
    */

    public fun getActionList(info: Object): java.util.List { return TODO("body: (Ljava/lang/Object;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatApi21;->getActionList(Ljava/lang/Object;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun isCollectionItemSelected(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatApi21$CollectionItemInfo;->isSelected(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun obtainCollectionInfo(rowCount: Int, columnCount: Int, hierarchical: Boolean, selectionMode: Int): Object { return TODO("body: (IIZI)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2, p3, p4}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatApi21;->obtainCollectionInfo(IIZI)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun obtainCollectionItemInfo(rowIndex: Int, rowSpan: Int, columnIndex: Int, columnSpan: Int, heading: Boolean, selected: Boolean): Object { return TODO("body: (IIIIZZ)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static/range {p1 .. p6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatApi21;->obtainCollectionItemInfo(IIIIZZ)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

}
