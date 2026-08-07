package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeInfoCompat.java.
// 1 fields, 10 methods.

open class AccessibilityNodeInfoCompat_CollectionItemInfoCompat {
    private val mInfo: Object

    private constructor(info: Object)

    constructor(x0: Object, x1: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.1)

    public fun getColumnIndex(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->access$000()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getCollectionItemColumnIndex(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getColumnSpan(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->access$000()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getCollectionItemColumnSpan(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getRowIndex(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->access$000()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getCollectionItemRowIndex(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getRowSpan(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->access$000()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->getCollectionItemRowSpan(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun isHeading(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->access$000()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isCollectionItemHeading(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isSelected(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 2
    //         invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->access$000()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         move-result-object v0
    //         iget-object v1, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-interface {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->isCollectionItemSelected(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    companion object {
    public @JvmStatic fun obtain(rowIndex: Int, rowSpan: Int, columnIndex: Int, columnSpan: Int, heading: Boolean, selected: Boolean): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat { return TODO("body: (IIIIZZ)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;") }
    /*
    //         .locals 8
    //         new-instance v7, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;
    //         invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;->access$000()Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;
    //         move-result-object v0
    //         move v1, p0
    //         move v2, p1
    //         move v3, p2
    //         move v4, p3
    //         move v5, p4
    //         move v6, p5
    //         invoke-interface/range {v0 .. v6}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoImpl;->obtainCollectionItemInfo(IIIIZZ)Ljava/lang/Object;
    //         move-result-object v0
    //         invoke-direct {v7, v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$CollectionItemInfoCompat;-><init>(Ljava/lang/Object;)V
    //         return-object v7
    */

    }
}
