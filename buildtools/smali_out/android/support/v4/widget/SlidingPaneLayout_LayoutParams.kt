package android.support.v4.widget

// Auto-emitted from smali source: SlidingPaneLayout.java.
// 5 fields, 7 methods.

open class SlidingPaneLayout_LayoutParams: android.view.ViewGroup.MarginLayoutParams() {
    var dimPaint: android.graphics.Paint
    var dimWhenOffset: Boolean
    var slideable: Boolean
    public var weight: Float

    public constructor()

    public constructor(width: Int, height: Int)

    public constructor(c: android.content.Context, attrs: android.util.AttributeSet)

    public constructor(source: android.support.v4.widget.SlidingPaneLayout.LayoutParams)

    public constructor(source: android.view.ViewGroup.LayoutParams)

    public constructor(source: android.view.ViewGroup.MarginLayoutParams)

    companion object {
    private val ATTRS: IntArray = null!!
    }
}
