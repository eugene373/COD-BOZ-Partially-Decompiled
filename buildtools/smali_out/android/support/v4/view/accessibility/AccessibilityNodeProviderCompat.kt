package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeProviderCompat.java.
// 2 fields, 8 methods.

open class AccessibilityNodeProviderCompat {
    private val mProvider: Object

    public constructor()

    public constructor(provider: Object)

    public fun createAccessibilityNodeInfo(virtualViewId: Int): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: (I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun findAccessibilityNodeInfosByText(text: String, virtualViewId: Int): java.util.List { return TODO("body: (Ljava/lang/String;I)Ljava/util/List;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun findFocus(focus: Int): android.support.v4.view.accessibility.AccessibilityNodeInfoCompat { return TODO("body: (I)Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getProvider(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/support/v4/view/accessibility/AccessibilityNodeProviderCompat;->mProvider:Ljava/lang/Object;
    //         return-object v0
    */

    public fun performAction(virtualViewId: Int, action: Int, arguments: android.os.Bundle): Boolean { return TODO("body: (IILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    companion object {
    private val IMPL: android.support.v4.view.accessibility.AccessibilityNodeProviderCompat.AccessibilityNodeProviderImpl = null!!
    }
}
