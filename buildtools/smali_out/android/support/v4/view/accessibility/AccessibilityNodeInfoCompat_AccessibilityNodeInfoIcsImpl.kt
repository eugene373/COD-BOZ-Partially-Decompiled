package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeInfoCompat.java.
// 0 fields, 49 methods.

open class AccessibilityNodeInfoCompat_AccessibilityNodeInfoIcsImpl: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoStubImpl() {
    constructor()

    public fun addAction(info: Object, action: Int) { /* TODO(body): (Ljava/lang/Object;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->addAction(Ljava/lang/Object;I)V
    //         return-void
    */

    public fun addAction(info: Object, id: Int, label: CharSequence) { /* TODO(body): (Ljava/lang/Object;ILjava/lang/CharSequence;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I
    //         move-result v0
    //         const/4 v1, 0x1
    //         if-ne v0, v1, :cond_0
    //         invoke-virtual {p0, p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompat$AccessibilityNodeInfoIcsImpl;->addAction(Ljava/lang/Object;I)V
    //         :cond_0
    //         return-void
    */

    public fun addChild(info: Object, child: android.view.View) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->addChild(Ljava/lang/Object;Landroid/view/View;)V
    //         return-void
    */

    public fun findAccessibilityNodeInfosByText(info: Object, text: String): java.util.List { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->findAccessibilityNodeInfosByText(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getActions(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->getActions(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getBoundsInParent(info: Object, outBounds: android.graphics.Rect) { /* TODO(body): (Ljava/lang/Object;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->getBoundsInParent(Ljava/lang/Object;Landroid/graphics/Rect;)V
    //         return-void
    */

    public fun getBoundsInScreen(info: Object, outBounds: android.graphics.Rect) { /* TODO(body): (Ljava/lang/Object;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->getBoundsInScreen(Ljava/lang/Object;Landroid/graphics/Rect;)V
    //         return-void
    */

    public fun getChild(info: Object, index: Int): Object { return TODO("body: (Ljava/lang/Object;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->getChild(Ljava/lang/Object;I)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getChildCount(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->getChildCount(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun getClassName(info: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->getClassName(Ljava/lang/Object;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getContentDescription(info: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->getContentDescription(Ljava/lang/Object;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getPackageName(info: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->getPackageName(Ljava/lang/Object;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getParent(info: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->getParent(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getText(info: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->getText(Ljava/lang/Object;)Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getWindowId(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->getWindowId(Ljava/lang/Object;)I
    //         move-result v0
    //         return v0
    */

    public fun isCheckable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->isCheckable(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isChecked(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->isChecked(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isClickable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->isClickable(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isEnabled(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->isEnabled(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isFocusable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->isFocusable(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isFocused(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->isFocused(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isLongClickable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->isLongClickable(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isPassword(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->isPassword(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isScrollable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->isScrollable(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun isSelected(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->isSelected(Ljava/lang/Object;)Z
    //         move-result v0
    //         return v0
    */

    public fun obtain(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->obtain()Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun obtain(source: android.view.View): Object { return TODO("body: (Landroid/view/View;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->obtain(Landroid/view/View;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun obtain(info: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->obtain(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         return-object v0
    */

    public fun performAction(info: Object, action: Int): Boolean { return TODO("body: (Ljava/lang/Object;I)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->performAction(Ljava/lang/Object;I)Z
    //         move-result v0
    //         return v0
    */

    public fun recycle(info: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->recycle(Ljava/lang/Object;)V
    //         return-void
    */

    public fun setBoundsInParent(info: Object, bounds: android.graphics.Rect) { /* TODO(body): (Ljava/lang/Object;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setBoundsInParent(Ljava/lang/Object;Landroid/graphics/Rect;)V
    //         return-void
    */

    public fun setBoundsInScreen(info: Object, bounds: android.graphics.Rect) { /* TODO(body): (Ljava/lang/Object;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setBoundsInScreen(Ljava/lang/Object;Landroid/graphics/Rect;)V
    //         return-void
    */

    public fun setCheckable(info: Object, checkable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setCheckable(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setChecked(info: Object, checked: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setChecked(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setClassName(info: Object, className: CharSequence) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setClassName(Ljava/lang/Object;Ljava/lang/CharSequence;)V
    //         return-void
    */

    public fun setClickable(info: Object, clickable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setClickable(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setContentDescription(info: Object, contentDescription: CharSequence) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setContentDescription(Ljava/lang/Object;Ljava/lang/CharSequence;)V
    //         return-void
    */

    public fun setEnabled(info: Object, enabled: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setEnabled(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setFocusable(info: Object, focusable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setFocusable(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setFocused(info: Object, focused: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setFocused(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setLongClickable(info: Object, longClickable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setLongClickable(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setPackageName(info: Object, packageName: CharSequence) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setPackageName(Ljava/lang/Object;Ljava/lang/CharSequence;)V
    //         return-void
    */

    public fun setParent(info: Object, parent: android.view.View) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setParent(Ljava/lang/Object;Landroid/view/View;)V
    //         return-void
    */

    public fun setPassword(info: Object, password: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setPassword(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setScrollable(info: Object, scrollable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setScrollable(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setSelected(info: Object, selected: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setSelected(Ljava/lang/Object;Z)V
    //         return-void
    */

    public fun setSource(info: Object, source: android.view.View) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setSource(Ljava/lang/Object;Landroid/view/View;)V
    //         return-void
    */

    public fun setText(info: Object, text: CharSequence) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/view/accessibility/AccessibilityNodeInfoCompatIcs;->setText(Ljava/lang/Object;Ljava/lang/CharSequence;)V
    //         return-void
    */

}
