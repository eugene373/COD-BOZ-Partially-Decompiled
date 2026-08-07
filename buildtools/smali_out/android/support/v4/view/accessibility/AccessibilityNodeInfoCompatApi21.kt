package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeInfoCompatApi21.java.
// 0 fields, 5 methods.

open class AccessibilityNodeInfoCompatApi21 {
    constructor()

    companion object {
    @JvmStatic fun addAction(info: Object, id: Int, label: CharSequence) { /* TODO(body): (Ljava/lang/Object;ILjava/lang/CharSequence;)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;
    //         invoke-direct {v0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;-><init>(ILjava/lang/CharSequence;)V
    //         .local v0, "aa":Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)V
    //         return-void
    */

    @JvmStatic fun getActionList(info: Object): java.util.List { return TODO("body: (Ljava/lang/Object;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getActionList()Ljava/util/List;
    //         move-result-object v0
    //         .local v0, "result":Ljava/util/List;
    //         check-cast v0, Ljava/util/List;
    //         .end local v0    # "result":Ljava/util/List;
    //         return-object v0
    */

    public @JvmStatic fun obtainCollectionInfo(rowCount: Int, columnCount: Int, hierarchical: Boolean, selectionMode: Int): Object { return TODO("body: (IIZI)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1, p2, p3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun obtainCollectionItemInfo(rowIndex: Int, rowSpan: Int, columnIndex: Int, columnSpan: Int, heading: Boolean, selected: Boolean): Object { return TODO("body: (IIIIZZ)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static/range {p0 .. p5}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
