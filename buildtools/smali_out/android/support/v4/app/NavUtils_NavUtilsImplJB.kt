package android.support.v4.app

// Auto-emitted from smali source: NavUtils.java.
// 0 fields, 6 methods.

open class NavUtils_NavUtilsImplJB: android.support.v4.app.NavUtils.NavUtilsImplBase() {
    constructor()

    public fun getParentActivityIntent(activity: android.app.Activity): android.content.Intent { return TODO("body: (Landroid/app/Activity;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/NavUtilsJB;->getParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;
    //         move-result-object v0
    //         .local v0, "result":Landroid/content/Intent;
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/NavUtils$NavUtilsImplJB;->superGetParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;
    //         move-result-object v0
    //         :cond_0
    //         return-object v0
    */

    public fun getParentActivityName(context: android.content.Context, info: android.content.pm.ActivityInfo): String { return TODO("body: (Landroid/content/Context;Landroid/content/pm/ActivityInfo;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-static {p2}, Landroid/support/v4/app/NavUtilsJB;->getParentActivityName(Landroid/content/pm/ActivityInfo;)Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "result":Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         invoke-super {p0, p1, p2}, Landroid/support/v4/app/NavUtils$NavUtilsImplBase;->getParentActivityName(Landroid/content/Context;Landroid/content/pm/ActivityInfo;)Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         return-object v0
    */

    public fun navigateUpTo(activity: android.app.Activity, upIntent: android.content.Intent) { /* TODO(body): (Landroid/app/Activity;Landroid/content/Intent;)V */ }
    /*
    //         .locals 0
    //         invoke-static {p1, p2}, Landroid/support/v4/app/NavUtilsJB;->navigateUpTo(Landroid/app/Activity;Landroid/content/Intent;)V
    //         return-void
    */

    public fun shouldUpRecreateTask(activity: android.app.Activity, targetIntent: android.content.Intent): Boolean { return TODO("body: (Landroid/app/Activity;Landroid/content/Intent;)Z") }
    /*
    //         .locals 1
    //         invoke-static {p1, p2}, Landroid/support/v4/app/NavUtilsJB;->shouldUpRecreateTask(Landroid/app/Activity;Landroid/content/Intent;)Z
    //         move-result v0
    //         return v0
    */

    fun superGetParentActivityIntent(activity: android.app.Activity): android.content.Intent { return TODO("body: (Landroid/app/Activity;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-super {p0, p1}, Landroid/support/v4/app/NavUtils$NavUtilsImplBase;->getParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

}
