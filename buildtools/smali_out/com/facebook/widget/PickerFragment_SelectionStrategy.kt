package com.facebook.widget

// Auto-emitted from smali source: PickerFragment.java.
// 1 fields, 9 methods.

open class PickerFragment_SelectionStrategy {
    val this$0: com.facebook.widget.PickerFragment

    constructor(p0: com.facebook.widget.PickerFragment)

    fun clear()

    fun getSelectedIds(): java.util.Collection

    fun isEmpty(): Boolean

    fun isSelected(p0: String): Boolean

    fun readSelectionFromBundle(p0: android.os.Bundle, p1: String)

    fun saveSelectionToBundle(p0: android.os.Bundle, p1: String)

    fun shouldShowCheckBoxIfUnselected(): Boolean

    fun toggleSelection(p0: String)

}
