package android.support.v4.app

// Auto-emitted from smali source: ShareCompat.java.
// 0 fields, 3 methods.

open class ShareCompat_ShareCompatImplICS: android.support.v4.app.ShareCompat.ShareCompatImplBase() {
    constructor()

    public fun configureMenuItem(item: android.view.MenuItem, shareIntent: android.support.v4.app.ShareCompat.IntentBuilder) { /* TODO(body): (Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p2}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->getActivity()Landroid/app/Activity;
    //         move-result-object v0
    //         invoke-virtual {p2}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->getIntent()Landroid/content/Intent;
    //         move-result-object v1
    //         invoke-static {p1, v0, v1}, Landroid/support/v4/app/ShareCompatICS;->configureMenuItem(Landroid/view/MenuItem;Landroid/app/Activity;Landroid/content/Intent;)V
    //         invoke-virtual {p0, p1}, Landroid/support/v4/app/ShareCompat$ShareCompatImplICS;->shouldAddChooserIntent(Landroid/view/MenuItem;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         invoke-virtual {p2}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->createChooserIntent()Landroid/content/Intent;
    //         move-result-object v0
    //         invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    //         :cond_0
    //         return-void
    */

    fun shouldAddChooserIntent(item: android.view.MenuItem): Boolean { return TODO("body: (Landroid/view/MenuItem;)Z") }
    /*
    //         .locals 1
    //         invoke-interface {p1}, Landroid/view/MenuItem;->hasSubMenu()Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

}
