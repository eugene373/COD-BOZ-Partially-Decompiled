package android.support.v4.app

// Auto-emitted from smali source: ShareCompat.java.
// 3 fields, 7 methods.

open class ShareCompat {
    public constructor()

    companion object {
    @JvmField public val EXTRA_CALLING_ACTIVITY: String = "android.support.v4.app.EXTRA_CALLING_ACTIVITY"
    @JvmField public val EXTRA_CALLING_PACKAGE: String = "android.support.v4.app.EXTRA_CALLING_PACKAGE"
    private var IMPL: android.support.v4.app.ShareCompat.ShareCompatImpl

    public @JvmStatic fun configureMenuItem(menu: android.view.Menu, menuItemId: Int, shareIntent: android.support.v4.app.ShareCompat.IntentBuilder) { /* TODO(body): (Landroid/view/Menu;ILandroid/support/v4/app/ShareCompat$IntentBuilder;)V */ }
    /*
    //         .locals 4
    //         invoke-interface {p0, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;
    //         move-result-object v0
    //         .local v0, "item":Landroid/view/MenuItem;
    //         if-nez v0, :cond_0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Could not find menu item with id "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, " in the supplied menu"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v1
    //         :cond_0
    //         invoke-static {v0, p2}, Landroid/support/v4/app/ShareCompat;->configureMenuItem(Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V
    //         return-void
    */

    public @JvmStatic fun configureMenuItem(item: android.view.MenuItem, shareIntent: android.support.v4.app.ShareCompat.IntentBuilder) { /* TODO(body): (Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Landroid/support/v4/app/ShareCompat;->IMPL:Landroid/support/v4/app/ShareCompat$ShareCompatImpl;
    //         invoke-interface {v0, p0, p1}, Landroid/support/v4/app/ShareCompat$ShareCompatImpl;->configureMenuItem(Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V
    //         return-void
    */

    public @JvmStatic fun getCallingActivity(calledActivity: android.app.Activity): android.content.ComponentName { return TODO("body: (Landroid/app/Activity;)Landroid/content/ComponentName;") }
    /*
    //         .locals 3
    //         invoke-virtual {p0}, Landroid/app/Activity;->getCallingActivity()Landroid/content/ComponentName;
    //         move-result-object v0
    //         .local v0, "result":Landroid/content/ComponentName;
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
    //         move-result-object v1
    //         const-string v2, "android.support.v4.app.EXTRA_CALLING_ACTIVITY"
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         .end local v0    # "result":Landroid/content/ComponentName;
    //         check-cast v0, Landroid/content/ComponentName;
    //         .restart local v0    # "result":Landroid/content/ComponentName;
    //         :cond_0
    //         return-object v0
    */

    public @JvmStatic fun getCallingPackage(calledActivity: android.app.Activity): String { return TODO("body: (Landroid/app/Activity;)Ljava/lang/String;") }
    /*
    //         .locals 3
    //         invoke-virtual {p0}, Landroid/app/Activity;->getCallingPackage()Ljava/lang/String;
    //         move-result-object v0
    //         .local v0, "result":Ljava/lang/String;
    //         if-nez v0, :cond_0
    //         invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
    //         move-result-object v1
    //         const-string v2, "android.support.v4.app.EXTRA_CALLING_PACKAGE"
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         :cond_0
    //         return-object v0
    */

    }
}
