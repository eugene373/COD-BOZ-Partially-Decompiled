package android.support.v4.app

// Auto-emitted from smali source: NavUtilsJB.java.
// 0 fields, 5 methods.

open class NavUtilsJB {
    constructor()

    companion object {
    public @JvmStatic fun getParentActivityIntent(activity: android.app.Activity): android.content.Intent { return TODO("body: (Landroid/app/Activity;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Landroid/app/Activity;->getParentActivityIntent()Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getParentActivityName(info: android.content.pm.ActivityInfo): String { return TODO("body: (Landroid/content/pm/ActivityInfo;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Landroid/content/pm/ActivityInfo;->parentActivityName:Ljava/lang/String;
    //         return-object v0
    */

    public @JvmStatic fun navigateUpTo(activity: android.app.Activity, upIntent: android.content.Intent) { /* TODO(body): (Landroid/app/Activity;Landroid/content/Intent;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z
    //         return-void
    */

    public @JvmStatic fun shouldUpRecreateTask(activity: android.app.Activity, targetIntent: android.content.Intent): Boolean { return TODO("body: (Landroid/app/Activity;Landroid/content/Intent;)Z") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z
    //         move-result v0
    //         return v0
    */

    }
}
