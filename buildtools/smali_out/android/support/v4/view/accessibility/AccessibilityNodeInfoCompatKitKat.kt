package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeInfoCompatKitKat.java.
// 0 fields, 10 methods.

open class AccessibilityNodeInfoCompatKitKat {
    constructor()

    companion object {
    @JvmStatic fun getCollectionInfo(info: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getCollectionInfo()Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun getCollectionItemInfo(info: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getCollectionItemInfo()Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;
    //         move-result-object v0
    //         return-object v0
    */

    @JvmStatic fun getLiveRegion(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getLiveRegion()I
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun getRangeInfo(info: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getRangeInfo()Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun obtainCollectionInfo(rowCount: Int, columnCount: Int, hierarchical: Boolean, selectionMode: Int): Object { return TODO("body: (IIZI)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun obtainCollectionItemInfo(rowIndex: Int, rowSpan: Int, columnIndex: Int, columnSpan: Int, heading: Boolean): Object { return TODO("body: (IIIIZ)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p0, p1, p2, p3, p4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun setCollectionInfo(info: Object, collectionInfo: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;
    //         .end local p1    # "collectionInfo":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V
    //         return-void
    */

    public @JvmStatic fun setCollectionItemInfo(info: Object, collectionItemInfo: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;
    //         .end local p1    # "collectionItemInfo":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V
    //         return-void
    */

    @JvmStatic fun setLiveRegion(info: Object, mode: Int) { /* TODO(body): (Ljava/lang/Object;I)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLiveRegion(I)V
    //         return-void
    */

    }
}
