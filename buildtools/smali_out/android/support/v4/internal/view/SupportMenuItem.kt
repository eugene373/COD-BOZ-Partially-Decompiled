package android.support.v4.internal.view

// Auto-emitted from smali source: SupportMenuItem.java.
// 5 fields, 11 methods.

interface SupportMenuItem: android.view.MenuItem {
    public fun collapseActionView(): Boolean

    public fun expandActionView(): Boolean

    public fun getActionView(): android.view.View

    public fun getSupportActionProvider(): android.support.v4.view.ActionProvider

    public fun isActionViewExpanded(): Boolean

    public fun setActionView(p0: Int): android.view.MenuItem

    public fun setActionView(p0: android.view.View): android.view.MenuItem

    public fun setShowAsAction(p0: Int)

    public fun setShowAsActionFlags(p0: Int): android.view.MenuItem

    public fun setSupportActionProvider(p0: android.support.v4.view.ActionProvider): android.support.v4.internal.view.SupportMenuItem

    public fun setSupportOnActionExpandListener(p0: android.support.v4.view.MenuItemCompat.OnActionExpandListener): android.support.v4.internal.view.SupportMenuItem

    companion object {
    @JvmField public val SHOW_AS_ACTION_ALWAYS: Int = 0x2
    @JvmField public val SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW: Int = 0x8
    @JvmField public val SHOW_AS_ACTION_IF_ROOM: Int = 0x1
    @JvmField public val SHOW_AS_ACTION_NEVER: Int = 0x0
    @JvmField public val SHOW_AS_ACTION_WITH_TEXT: Int = 0x4
    }
}
