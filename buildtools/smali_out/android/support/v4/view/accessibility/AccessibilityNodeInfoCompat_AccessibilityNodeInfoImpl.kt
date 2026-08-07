package android.support.v4.view.accessibility

// Auto-emitted from smali source: AccessibilityNodeInfoCompat.java.
// 0 fields, 82 methods.

interface AccessibilityNodeInfoCompat_AccessibilityNodeInfoImpl {
    public fun addAction(p0: Object, p1: Int)

    public fun addAction(p0: Object, p1: Int, p2: CharSequence)

    public fun addChild(p0: Object, p1: android.view.View)

    public fun addChild(p0: Object, p1: android.view.View, p2: Int)

    public fun findAccessibilityNodeInfosByText(p0: Object, p1: String): java.util.List

    public fun findFocus(p0: Object, p1: Int): Object

    public fun focusSearch(p0: Object, p1: Int): Object

    public fun getActionList(p0: Object): java.util.List

    public fun getActions(p0: Object): Int

    public fun getBoundsInParent(p0: Object, p1: android.graphics.Rect)

    public fun getBoundsInScreen(p0: Object, p1: android.graphics.Rect)

    public fun getChild(p0: Object, p1: Int): Object

    public fun getChildCount(p0: Object): Int

    public fun getClassName(p0: Object): CharSequence

    public fun getCollectionInfo(p0: Object): Object

    public fun getCollectionInfoColumnCount(p0: Object): Int

    public fun getCollectionInfoRowCount(p0: Object): Int

    public fun getCollectionItemColumnIndex(p0: Object): Int

    public fun getCollectionItemColumnSpan(p0: Object): Int

    public fun getCollectionItemInfo(p0: Object): Object

    public fun getCollectionItemRowIndex(p0: Object): Int

    public fun getCollectionItemRowSpan(p0: Object): Int

    public fun getContentDescription(p0: Object): CharSequence

    public fun getLiveRegion(p0: Object): Int

    public fun getMovementGranularities(p0: Object): Int

    public fun getPackageName(p0: Object): CharSequence

    public fun getParent(p0: Object): Object

    public fun getRangeInfo(p0: Object): Object

    public fun getText(p0: Object): CharSequence

    public fun getViewIdResourceName(p0: Object): String

    public fun getWindowId(p0: Object): Int

    public fun isAccessibilityFocused(p0: Object): Boolean

    public fun isCheckable(p0: Object): Boolean

    public fun isChecked(p0: Object): Boolean

    public fun isClickable(p0: Object): Boolean

    public fun isCollectionInfoHierarchical(p0: Object): Boolean

    public fun isCollectionItemHeading(p0: Object): Boolean

    public fun isCollectionItemSelected(p0: Object): Boolean

    public fun isEnabled(p0: Object): Boolean

    public fun isFocusable(p0: Object): Boolean

    public fun isFocused(p0: Object): Boolean

    public fun isLongClickable(p0: Object): Boolean

    public fun isPassword(p0: Object): Boolean

    public fun isScrollable(p0: Object): Boolean

    public fun isSelected(p0: Object): Boolean

    public fun isVisibleToUser(p0: Object): Boolean

    public fun obtain(): Object

    public fun obtain(p0: android.view.View): Object

    public fun obtain(p0: android.view.View, p1: Int): Object

    public fun obtain(p0: Object): Object

    public fun obtainCollectionInfo(p0: Int, p1: Int, p2: Boolean, p3: Int): Object

    public fun obtainCollectionItemInfo(p0: Int, p1: Int, p2: Int, p3: Int, p4: Boolean, p5: Boolean): Object

    public fun performAction(p0: Object, p1: Int): Boolean

    public fun performAction(p0: Object, p1: Int, p2: android.os.Bundle): Boolean

    public fun recycle(p0: Object)

    public fun setAccessibilityFocused(p0: Object, p1: Boolean)

    public fun setBoundsInParent(p0: Object, p1: android.graphics.Rect)

    public fun setBoundsInScreen(p0: Object, p1: android.graphics.Rect)

    public fun setCheckable(p0: Object, p1: Boolean)

    public fun setChecked(p0: Object, p1: Boolean)

    public fun setClassName(p0: Object, p1: CharSequence)

    public fun setClickable(p0: Object, p1: Boolean)

    public fun setCollectionInfo(p0: Object, p1: Object)

    public fun setCollectionItemInfo(p0: Object, p1: Object)

    public fun setContentDescription(p0: Object, p1: CharSequence)

    public fun setEnabled(p0: Object, p1: Boolean)

    public fun setFocusable(p0: Object, p1: Boolean)

    public fun setFocused(p0: Object, p1: Boolean)

    public fun setLiveRegion(p0: Object, p1: Int)

    public fun setLongClickable(p0: Object, p1: Boolean)

    public fun setMovementGranularities(p0: Object, p1: Int)

    public fun setPackageName(p0: Object, p1: CharSequence)

    public fun setParent(p0: Object, p1: android.view.View)

    public fun setParent(p0: Object, p1: android.view.View, p2: Int)

    public fun setPassword(p0: Object, p1: Boolean)

    public fun setScrollable(p0: Object, p1: Boolean)

    public fun setSelected(p0: Object, p1: Boolean)

    public fun setSource(p0: Object, p1: android.view.View)

    public fun setSource(p0: Object, p1: android.view.View, p2: Int)

    public fun setText(p0: Object, p1: CharSequence)

    public fun setViewIdResourceName(p0: Object, p1: String)

    public fun setVisibleToUser(p0: Object, p1: Boolean)

}
