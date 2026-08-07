package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeInfoCompat.java.
// 0 fields, 83 methods.

open class AccessibilityNodeInfoCompat_AccessibilityNodeInfoStubImpl: android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl {
    constructor()

    public fun addAction(info: Object, action: Int) { /* TODO(body): (Ljava/lang/Object;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun addAction(info: Object, id: Int, label: CharSequence) { /* TODO(body): (Ljava/lang/Object;ILjava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun addChild(info: Object, child: android.view.View) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun addChild(info: Object, child: android.view.View, virtualDescendantId: Int) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun findAccessibilityNodeInfosByText(info: Object, text: String): java.util.List { return TODO("body: (Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
    //         move-result-object v0
    //         return-object v0
    */

    public fun findFocus(info: Object, focus: Int): Object { return TODO("body: (Ljava/lang/Object;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun focusSearch(info: Object, direction: Int): Object { return TODO("body: (Ljava/lang/Object;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getActionList(info: Object): java.util.List { return TODO("body: (Ljava/lang/Object;)Ljava/util/List;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getActions(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getBoundsInParent(info: Object, outBounds: android.graphics.Rect) { /* TODO(body): (Ljava/lang/Object;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun getBoundsInScreen(info: Object, outBounds: android.graphics.Rect) { /* TODO(body): (Ljava/lang/Object;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun getChild(info: Object, index: Int): Object { return TODO("body: (Ljava/lang/Object;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getChildCount(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getClassName(info: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getCollectionInfo(info: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getCollectionInfoColumnCount(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getCollectionInfoRowCount(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getCollectionItemColumnIndex(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getCollectionItemColumnSpan(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getCollectionItemInfo(info: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getCollectionItemRowIndex(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getCollectionItemRowSpan(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getContentDescription(info: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getLiveRegion(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getMovementGranularities(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getPackageName(info: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getParent(info: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getRangeInfo(info: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getText(info: Object): CharSequence { return TODO("body: (Ljava/lang/Object;)Ljava/lang/CharSequence;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getViewIdResourceName(info: Object): String { return TODO("body: (Ljava/lang/Object;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun getWindowId(info: Object): Int { return TODO("body: (Ljava/lang/Object;)I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isAccessibilityFocused(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isCheckable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isChecked(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isClickable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isCollectionInfoHierarchical(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isCollectionItemHeading(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isCollectionItemSelected(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isEnabled(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isFocusable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isFocused(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isLongClickable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isPassword(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isScrollable(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isSelected(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun isVisibleToUser(info: Object): Boolean { return TODO("body: (Ljava/lang/Object;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun obtain(): Object { return TODO("body: ()Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun obtain(source: android.view.View): Object { return TODO("body: (Landroid/view/View;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun obtain(root: android.view.View, virtualDescendantId: Int): Object { return TODO("body: (Landroid/view/View;I)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun obtain(info: Object): Object { return TODO("body: (Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun obtainCollectionInfo(rowCount: Int, columnCount: Int, hierarchical: Boolean, selectionMode: Int): Object { return TODO("body: (IIZI)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun obtainCollectionItemInfo(rowIndex: Int, rowSpan: Int, columnIndex: Int, columnSpan: Int, heading: Boolean, selected: Boolean): Object { return TODO("body: (IIIIZZ)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return-object v0
    */

    public fun performAction(info: Object, action: Int): Boolean { return TODO("body: (Ljava/lang/Object;I)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun performAction(info: Object, action: Int, arguments: android.os.Bundle): Boolean { return TODO("body: (Ljava/lang/Object;ILandroid/os/Bundle;)Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun recycle(info: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setAccessibilityFocused(info: Object, focused: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setBoundsInParent(info: Object, bounds: android.graphics.Rect) { /* TODO(body): (Ljava/lang/Object;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setBoundsInScreen(info: Object, bounds: android.graphics.Rect) { /* TODO(body): (Ljava/lang/Object;Landroid/graphics/Rect;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setCheckable(info: Object, checkable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setChecked(info: Object, checked: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setClassName(info: Object, className: CharSequence) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setClickable(info: Object, clickable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setCollectionInfo(info: Object, collectionInfo: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setCollectionItemInfo(info: Object, collectionItemInfo: Object) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setContentDescription(info: Object, contentDescription: CharSequence) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setEnabled(info: Object, enabled: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setFocusable(info: Object, focusable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setFocused(info: Object, focused: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setLiveRegion(info: Object, mode: Int) { /* TODO(body): (Ljava/lang/Object;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setLongClickable(info: Object, longClickable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setMovementGranularities(info: Object, granularities: Int) { /* TODO(body): (Ljava/lang/Object;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setPackageName(info: Object, packageName: CharSequence) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setParent(info: Object, parent: android.view.View) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setParent(info: Object, root: android.view.View, virtualDescendantId: Int) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setPassword(info: Object, password: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setScrollable(info: Object, scrollable: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setSelected(info: Object, selected: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setSource(info: Object, source: android.view.View) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setSource(info: Object, root: android.view.View, virtualDescendantId: Int) { /* TODO(body): (Ljava/lang/Object;Landroid/view/View;I)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setText(info: Object, text: CharSequence) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/CharSequence;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setViewIdResourceName(info: Object, viewId: String) { /* TODO(body): (Ljava/lang/Object;Ljava/lang/String;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun setVisibleToUser(info: Object, visibleToUser: Boolean) { /* TODO(body): (Ljava/lang/Object;Z)V */ }
    /*
    //         .locals 0
    //         return-void
    */

}
