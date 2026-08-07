package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeInfoCompatIcs.java.
// 0 fields, 48 methods.

open class AccessibilityNodeInfoCompatIcs {
    constructor()

    companion object {
    public @JvmStatic fun addAction(info: Object, action: Int) { /* TODO(body): (Ljava/lang/Object;I)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V
    //         return-void
    */

    public @JvmStatic fun addChild(info: Object, child: android.view.View) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->addChild(Landroid/view/View;)V
    //         return-void
    */

    public @JvmStatic fun findAccessibilityNodeInfosByText(info: Object, text: String): java.util.List { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->findAccessibilityNodeInfosByText(Ljava/lang/String;)Ljava/util/List;
    //         move-result-object v0
    //         .local v0, "result":Ljava/util/List;
    //         check-cast v0, Ljava/util/List;
    //         .end local v0    # "result":Ljava/util/List;
    //         return-object v0
    */

    public @JvmStatic fun getActions(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getActions()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getBoundsInParent(info: Object, outBounds: android.graphics.Rect) { /* TODO(body): (Ljava/lang/Object;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInParent(Landroid/graphics/Rect;)V
    //         return-void
    */

    public @JvmStatic fun getBoundsInScreen(info: Object, outBounds: android.graphics.Rect) { /* TODO(body): (Ljava/lang/Object;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V
    //         return-void
    */

    public @JvmStatic fun getChild(info: Object, index: Int): Object { return TODO("body: (Ljava/lang/Object;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getChildCount(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChildCount()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getClassName(info: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getClassName()Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getContentDescription(info: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContentDescription()Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getPackageName(info: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getPackageName()Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getParent(info: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent()Landroid/view/accessibility/AccessibilityNodeInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getText(info: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getWindowId(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getWindowId()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isCheckable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isCheckable()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isChecked(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isChecked()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isClickable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isClickable()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isEnabled(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isEnabled()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isFocusable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocusable()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isFocused(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isFocused()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isLongClickable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isLongClickable()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isPassword(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isPassword()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isScrollable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isScrollable()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun isSelected(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isSelected()Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun obtain(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain()Landroid/view/accessibility/AccessibilityNodeInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun obtain(source: android.view.View): Object { return TODO("body: (Landroid/view/View;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun obtain(info: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-static {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun performAction(info: Object, action: Int): Boolean { return TODO("body: (Ljava/lang/Object;I)Z") }
    /*
    //         .locals 1
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(I)Z
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun recycle(info: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->recycle()V
    //         return-void
    */

    public @JvmStatic fun setBoundsInParent(info: Object, bounds: android.graphics.Rect) { /* TODO(body): (Ljava/lang/Object;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInParent(Landroid/graphics/Rect;)V
    //         return-void
    */

    public @JvmStatic fun setBoundsInScreen(info: Object, bounds: android.graphics.Rect) { /* TODO(body): (Ljava/lang/Object;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    //         return-void
    */

    public @JvmStatic fun setCheckable(info: Object, checkable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V
    //         return-void
    */

    public @JvmStatic fun setChecked(info: Object, checked: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V
    //         return-void
    */

    public @JvmStatic fun setClassName(info: Object, className: CharSequence) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V
    //         return-void
    */

    public @JvmStatic fun setClickable(info: Object, clickable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V
    //         return-void
    */

    public @JvmStatic fun setContentDescription(info: Object, contentDescription: CharSequence) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V
    //         return-void
    */

    public @JvmStatic fun setEnabled(info: Object, enabled: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V
    //         return-void
    */

    public @JvmStatic fun setFocusable(info: Object, focusable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocusable(Z)V
    //         return-void
    */

    public @JvmStatic fun setFocused(info: Object, focused: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setFocused(Z)V
    //         return-void
    */

    public @JvmStatic fun setLongClickable(info: Object, longClickable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setLongClickable(Z)V
    //         return-void
    */

    public @JvmStatic fun setPackageName(info: Object, packageName: CharSequence) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPackageName(Ljava/lang/CharSequence;)V
    //         return-void
    */

    public @JvmStatic fun setParent(info: Object, parent: android.view.View) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V
    //         return-void
    */

    public @JvmStatic fun setPassword(info: Object, password: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V
    //         return-void
    */

    public @JvmStatic fun setScrollable(info: Object, scrollable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V
    //         return-void
    */

    public @JvmStatic fun setSelected(info: Object, selected: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSelected(Z)V
    //         return-void
    */

    public @JvmStatic fun setSource(info: Object, source: android.view.View) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setSource(Landroid/view/View;)V
    //         return-void
    */

    public @JvmStatic fun setText(info: Object, text: CharSequence) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo;
    //         .end local p0    # "info":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V
    //         return-void
    */

    }
}
