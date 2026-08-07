package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeInfoCompat.java.
// 4 fields, 6 methods.

open class AccessibilityNodeInfoCompat_RangeInfoCompat {
    private val mInfo: Object

    private constructor(info: Object)

    constructor(x0: Object, x1: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.1)

    public fun getCurrent(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$RangeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatKitKat$RangeInfo;->getCurrent(Ljava/lang/Object;)F
    //         move-result v0
    //         return v0
    */

    public fun getMax(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$RangeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatKitKat$RangeInfo;->getMax(Ljava/lang/Object;)F
    //         move-result v0
    //         return v0
    */

    public fun getMin(): Float { return TODO("body: ()F") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$RangeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatKitKat$RangeInfo;->getMin(Ljava/lang/Object;)F
    //         move-result v0
    //         return v0
    */

    public fun getType(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$RangeInfoCompat;->mInfo:Ljava/lang/Object;
    //         invoke-static {v0}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatKitKat$RangeInfo;->getType(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    companion object {
    @JvmField public val RANGE_TYPE_FLOAT: Int = 0x1
    @JvmField public val RANGE_TYPE_INT: Int = 0x0
    @JvmField public val RANGE_TYPE_PERCENT: Int = 0x2
    }
}
