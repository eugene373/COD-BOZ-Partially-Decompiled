package android.support.v4.app

// Auto-emitted from smali source: FragmentTransaction.java.
// 7 fields, 26 methods.

open class FragmentTransaction {
    public constructor()

    public fun add(p0: Int, p1: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction

    public fun add(p0: Int, p1: android.support.v4.app.Fragment, p2: String): android.support.v4.app.FragmentTransaction

    public fun add(p0: android.support.v4.app.Fragment, p1: String): android.support.v4.app.FragmentTransaction

    public fun addSharedElement(p0: android.view.View, p1: String): android.support.v4.app.FragmentTransaction

    public fun addToBackStack(p0: String): android.support.v4.app.FragmentTransaction

    public fun attach(p0: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction

    public fun commit(): Int

    public fun commitAllowingStateLoss(): Int

    public fun detach(p0: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction

    public fun disallowAddToBackStack(): android.support.v4.app.FragmentTransaction

    public fun hide(p0: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction

    public fun isAddToBackStackAllowed(): Boolean

    public fun isEmpty(): Boolean

    public fun remove(p0: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction

    public fun replace(p0: Int, p1: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction

    public fun replace(p0: Int, p1: android.support.v4.app.Fragment, p2: String): android.support.v4.app.FragmentTransaction

    public fun setBreadCrumbShortTitle(p0: Int): android.support.v4.app.FragmentTransaction

    public fun setBreadCrumbShortTitle(p0: CharSequence): android.support.v4.app.FragmentTransaction

    public fun setBreadCrumbTitle(p0: Int): android.support.v4.app.FragmentTransaction

    public fun setBreadCrumbTitle(p0: CharSequence): android.support.v4.app.FragmentTransaction

    public fun setCustomAnimations(p0: Int, p1: Int): android.support.v4.app.FragmentTransaction

    public fun setCustomAnimations(p0: Int, p1: Int, p2: Int, p3: Int): android.support.v4.app.FragmentTransaction

    public fun setTransition(p0: Int): android.support.v4.app.FragmentTransaction

    public fun setTransitionStyle(p0: Int): android.support.v4.app.FragmentTransaction

    public fun show(p0: android.support.v4.app.Fragment): android.support.v4.app.FragmentTransaction

    companion object {
    @JvmField public val TRANSIT_ENTER_MASK: Int = 0x1000
    @JvmField public val TRANSIT_EXIT_MASK: Int = 0x2000
    @JvmField public val TRANSIT_FRAGMENT_CLOSE: Int = 0x2002
    @JvmField public val TRANSIT_FRAGMENT_FADE: Int = 0x1003
    @JvmField public val TRANSIT_FRAGMENT_OPEN: Int = 0x1001
    @JvmField public val TRANSIT_NONE: Int = 0x0
    @JvmField public val TRANSIT_UNSET: Int = 0
    }
}
