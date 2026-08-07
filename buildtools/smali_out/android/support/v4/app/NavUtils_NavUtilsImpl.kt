package android.support.v4.app

// Auto-emitted from smali source: NavUtils.java.
// 0 fields, 4 methods.

interface NavUtils_NavUtilsImpl {
    public fun getParentActivityIntent(p0: android.app.Activity): android.content.Intent

    public fun getParentActivityName(p0: android.content.Context, p1: android.content.pm.ActivityInfo): String

    public fun navigateUpTo(p0: android.app.Activity, p1: android.content.Intent)

    public fun shouldUpRecreateTask(p0: android.app.Activity, p1: android.content.Intent): Boolean

}
