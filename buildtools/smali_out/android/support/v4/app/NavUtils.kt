package android.support.v4.app

// Auto-emitted from smali source: NavUtils.java.
// 3 fields, 10 methods.

open class NavUtils {
    private constructor()

    companion object {
    private val IMPL: android.support.v4.app.NavUtils.NavUtilsImpl = null!!
    @JvmField public val PARENT_ACTIVITY: String = "android.support.PARENT_ACTIVITY"
    private val TAG: String = "NavUtils"

    public @JvmStatic fun getParentActivityIntent(sourceActivity: android.app.Activity): android.content.Intent { return TODO("body: (Landroid/app/Activity;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/NavUtils;->IMPL:Landroid/support/v4/app/NavUtils$NavUtilsImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/app/NavUtils$NavUtilsImpl;->getParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getParentActivityIntent(context: android.content.Context, componentName: android.content.ComponentName): android.content.Intent { return TODO("body: (Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         invoke-static {p0, p1}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
    //         move-result-object v1
    //         .local v1, "parentActivity":Ljava/lang/String;
    //         if-nez v1, :cond_0
    //         const/4 v2, 0x0
    //         :goto_0
    //         return-object v2
    //         :cond_0
    //         new-instance v3, Landroid/content/ComponentName;
    //         invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-direct {v3, v4, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         .local v3, "target":Landroid/content/ComponentName;
    //         invoke-static {p0, v3}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "grandparent":Ljava/lang/String;
    //         if-nez v0, :cond_1
    //         invoke-static {v3}, Landroid/support/v4/content/IntentCompat;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         move-result-object v2
    //         .local v2, "parentIntent":Landroid/content/Intent;
    //         :goto_1
    //         goto :goto_0
    //         .end local v2    # "parentIntent":Landroid/content/Intent;
    //         :cond_1
    //         new-instance v4, Landroid/content/Intent;
    //         invoke-direct {v4}, Landroid/content/Intent;-><init>()V
    //         invoke-virtual {v4, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         move-result-object v2
    //         goto :goto_1
    */

    public @JvmStatic fun getParentActivityIntent(context: android.content.Context, p1: Class): android.content.Intent { return TODO("body: (Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;") }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/content/pm/PackageManager$NameNotFoundException;
    //             }
    //         .end annotation
    //         .local p1, "sourceActivityClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    //         new-instance v4, Landroid/content/ComponentName;
    //         invoke-direct {v4, p0, p1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    //         invoke-static {p0, v4}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
    //         move-result-object v1
    //         .local v1, "parentActivity":Ljava/lang/String;
    //         if-nez v1, :cond_0
    //         const/4 v2, 0x0
    //         :goto_0
    //         return-object v2
    //         :cond_0
    //         new-instance v3, Landroid/content/ComponentName;
    //         invoke-direct {v3, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V
    //         .local v3, "target":Landroid/content/ComponentName;
    //         invoke-static {p0, v3}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "grandparent":Ljava/lang/String;
    //         if-nez v0, :cond_1
    //         invoke-static {v3}, Landroid/support/v4/content/IntentCompat;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         move-result-object v2
    //         .local v2, "parentIntent":Landroid/content/Intent;
    //         :goto_1
    //         goto :goto_0
    //         .end local v2    # "parentIntent":Landroid/content/Intent;
    //         :cond_1
    //         new-instance v4, Landroid/content/Intent;
    //         invoke-direct {v4}, Landroid/content/Intent;-><init>()V
    //         invoke-virtual {v4, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         move-result-object v2
    //         goto :goto_1
    */

    public @JvmStatic fun getParentActivityName(sourceActivity: android.app.Activity): String { return TODO("body: (Landroid/app/Activity;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         invoke-virtual {p0}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;
    //         move-result-object v1
    //         invoke-static {p0, v1}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v1
    //         return-object v1
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public @JvmStatic fun getParentActivityName(context: android.content.Context, componentName: android.content.ComponentName): String { return TODO("body: (Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/content/pm/PackageManager$NameNotFoundException;
    //             }
    //         .end annotation
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v2
    //         .local v2, "pm":Landroid/content/pm/PackageManager;
    //         const/16 v3, 0x80
    //         invoke-virtual {v2, p1, v3}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    //         move-result-object v0
    //         .local v0, "info":Landroid/content/pm/ActivityInfo;
    //         sget-object v3, Landroid/support/v4/app/NavUtils;->IMPL:Landroid/support/v4/app/NavUtils$NavUtilsImpl;
    //         invoke-interface {v3, p0, v0}, Landroid/support/v4/app/NavUtils$NavUtilsImpl;->getParentActivityName(Landroid/content/Context;Landroid/content/pm/ActivityInfo;)Ljava/lang/String;
    //         move-result-object v1
    //         .local v1, "parentActivity":Ljava/lang/String;
    //         return-object v1
    */

    public @JvmStatic fun navigateUpFromSameTask(sourceActivity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 4
    //         invoke-static {p0}, Landroid/support/v4/app/NavUtils;->getParentActivityIntent(Landroid/app/Activity;)Landroid/content/Intent;
    //         move-result-object v0
    //         .local v0, "upIntent":Landroid/content/Intent;
    //         if-nez v0, :cond_0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Activity "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " does not have a parent activity name specified."
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " element in your manifest?)"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         invoke-static {p0, v0}, Landroid/support/v4/app/NavUtils;->navigateUpTo(Landroid/app/Activity;Landroid/content/Intent;)V
    //         return-void
    */

    public @JvmStatic fun navigateUpTo(sourceActivity: android.app.Activity, upIntent: android.content.Intent) { /* TODO(body): (Landroid/app/Activity;Landroid/content/Intent;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/NavUtils;->IMPL:Landroid/support/v4/app/NavUtils$NavUtilsImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/app/NavUtils$NavUtilsImpl;->navigateUpTo(Landroid/app/Activity;Landroid/content/Intent;)V
    //         return-void
    */

    public @JvmStatic fun shouldUpRecreateTask(sourceActivity: android.app.Activity, targetIntent: android.content.Intent): Boolean { return TODO("body: (Landroid/app/Activity;Landroid/content/Intent;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/NavUtils;->IMPL:Landroid/support/v4/app/NavUtils$NavUtilsImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/app/NavUtils$NavUtilsImpl;->shouldUpRecreateTask(Landroid/app/Activity;Landroid/content/Intent;)Z
    //         move-result v0
    //         return v0
    */

    }
}
