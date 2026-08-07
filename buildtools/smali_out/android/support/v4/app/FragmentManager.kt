package android.support.v4.app

// Auto-emitted from smali source: FragmentManager.java.
// 1 fields, 23 methods.

open class FragmentManager {
    public constructor()

    public fun addOnBackStackChangedListener(p0: android.support.v4.app.FragmentManager.OnBackStackChangedListener)

    public fun beginTransaction(): android.support.v4.app.FragmentTransaction

    public fun dump(p0: String, p1: java.io.FileDescriptor, p2: java.io.PrintWriter, p3: Array<String>)

    public fun executePendingTransactions(): Boolean

    public fun findFragmentById(p0: Int): android.support.v4.app.Fragment

    public fun findFragmentByTag(p0: String): android.support.v4.app.Fragment

    public fun getBackStackEntryAt(p0: Int): android.support.v4.app.FragmentManager.BackStackEntry

    public fun getBackStackEntryCount(): Int

    public fun getFragment(p0: android.os.Bundle, p1: String): android.support.v4.app.Fragment

    public fun getFragments(): java.util.List

    public fun isDestroyed(): Boolean

    public fun openTransaction(): android.support.v4.app.FragmentTransaction { return TODO("body: ()Landroid/support/v4/app/FragmentTransaction;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         invoke-virtual {p0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
    //         move-result-object v0
    //         return-object v0
    */

    public fun popBackStack()

    public fun popBackStack(p0: Int, p1: Int)

    public fun popBackStack(p0: String, p1: Int)

    public fun popBackStackImmediate(): Boolean

    public fun popBackStackImmediate(p0: Int, p1: Int): Boolean

    public fun popBackStackImmediate(p0: String, p1: Int): Boolean

    public fun putFragment(p0: android.os.Bundle, p1: String, p2: android.support.v4.app.Fragment)

    public fun removeOnBackStackChangedListener(p0: android.support.v4.app.FragmentManager.OnBackStackChangedListener)

    public fun saveFragmentInstanceState(p0: android.support.v4.app.Fragment): android.support.v4.app.Fragment.SavedState

    companion object {
    @JvmField public val POP_BACK_STACK_INCLUSIVE: Int = 0x1

    public @JvmStatic fun enableDebugLogging(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         sput-boolean p0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
    //         return-void
    */

    }
}
