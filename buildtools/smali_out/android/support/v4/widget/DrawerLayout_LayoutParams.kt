package android.support.v4.widget

// Auto-emitted from smali source: DrawerLayout.java.
// 4 fields, 6 methods.

open class DrawerLayout_LayoutParams: android.view.ViewGroup.MarginLayoutParams() {
    public var gravity: Int
    var isPeeking: Boolean
    var knownOpen: Boolean
    var onScreen: Float

    public constructor(width: Int, height: Int)

    public constructor(width: Int, height: Int, gravity: Int)

    public constructor(c: android.content.Context, attrs: android.util.AttributeSet)

    public constructor(source: android.support.v4.widget.DrawerLayout.LayoutParams)

    public constructor(source: android.view.ViewGroup.LayoutParams)

    public constructor(source: android.view.ViewGroup.MarginLayoutParams)

}
