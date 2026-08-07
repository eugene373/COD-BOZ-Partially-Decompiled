package android.support.v4.content

// Auto-emitted from smali source: IntentCompat.java.
// 0 fields, 4 methods.

open class IntentCompat_IntentCompatImplBase: android.support.v4.content.IntentCompat.IntentCompatImpl {
    constructor()

    public fun makeMainActivity(componentName: android.content.ComponentName): android.content.Intent { return TODO("body: (Landroid/content/ComponentName;)Landroid/content/Intent;") }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "android.intent.action.MAIN"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         .local v0, "intent":Landroid/content/Intent;
    //         invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         const-string v1, "android.intent.category.LAUNCHER"
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
    //         return-object v0
    */

    public fun makeMainSelectorActivity(selectorAction: String, selectorCategory: String): android.content.Intent { return TODO("body: (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         new-instance v0, Landroid/content/Intent;
    //         invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         .local v0, "intent":Landroid/content/Intent;
    //         invoke-virtual {v0, p2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
    //         return-object v0
    */

    public fun makeRestartActivityTask(mainActivity: android.content.ComponentName): android.content.Intent { return TODO("body: (Landroid/content/ComponentName;)Landroid/content/Intent;") }
    /*
    //         .locals 2
    //         invoke-virtual {p0, p1}, Landroid/support/v4/content/IntentCompat$IntentCompatImplBase;->makeMainActivity(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         move-result-object v0
    //         .local v0, "intent":Landroid/content/Intent;
    //         const v1, 0x10008000
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         return-object v0
    */

}
