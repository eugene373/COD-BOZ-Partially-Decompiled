package android.support.v4.content

// Auto-emitted from smali source: IntentCompat.java.
// 8 fields, 5 methods.

open class IntentCompat {
    private constructor()

    companion object {
    @JvmField public val ACTION_EXTERNAL_APPLICATIONS_AVAILABLE: String = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE"
    @JvmField public val ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE: String = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE"
    @JvmField public val EXTRA_CHANGED_PACKAGE_LIST: String = "android.intent.extra.changed_package_list"
    @JvmField public val EXTRA_CHANGED_UID_LIST: String = "android.intent.extra.changed_uid_list"
    @JvmField public val EXTRA_HTML_TEXT: String = "android.intent.extra.HTML_TEXT"
    @JvmField public val FLAG_ACTIVITY_CLEAR_TASK: Int = 0x8000
    @JvmField public val FLAG_ACTIVITY_TASK_ON_HOME: Int = 0x4000
    private val IMPL: android.support.v4.content.IntentCompat.IntentCompatImpl = null!!

    public @JvmStatic fun makeMainActivity(mainActivity: android.content.ComponentName): android.content.Intent { return TODO("body: (Landroid/content/ComponentName;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/content/IntentCompat$IntentCompatImpl;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun makeMainSelectorActivity(selectorAction: String, selectorCategory: String): android.content.Intent { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/content/IntentCompat$IntentCompatImpl;->makeMainSelectorActivity(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun makeRestartActivityTask(mainActivity: android.content.ComponentName): android.content.Intent { return TODO("body: (Landroid/content/ComponentName;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/content/IntentCompat;->IMPL:Landroid/support/v4/content/IntentCompat$IntentCompatImpl;
    //         invoke-interface {v0, p0}, Landroid/support/v4/content/IntentCompat$IntentCompatImpl;->makeRestartActivityTask(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
