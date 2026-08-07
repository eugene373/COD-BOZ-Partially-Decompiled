package android.support.v4.app

// Auto-emitted from smali source: ActivityCompat.java.
// 0 fields, 11 methods.

open class ActivityCompat: android.support.v4.content.ContextCompat() {
    public constructor()

    companion object {
    private @JvmStatic fun createCallback(callback: android.support.v4.app.SharedElementCallback): android.support.v4.app.ActivityCompat21.SharedElementCallback21 { return TODO("body: (Landroid/support/v4/app/SharedElementCallback;)Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         .local v0, "newCallback":Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;
    //         if-eqz p0, :cond_0
    //         new-instance v0, Landroid/support/v4/app/ActivityCompat$SharedElementCallback21Impl;
    //         .end local v0    # "newCallback":Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;
    //         invoke-direct {v0, p0}, Landroid/support/v4/app/ActivityCompat$SharedElementCallback21Impl;-><init>(Landroid/support/v4/app/SharedElementCallback;)V
    //         .restart local v0    # "newCallback":Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;
    //         :cond_0
    //         return-object v0
    */

    public @JvmStatic fun finishAffinity(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x10
    //         if-lt v0, v1, :cond_0
    //         invoke-static {p0}, Landroid/support/v4/app/ActivityCompatJB;->finishAffinity(Landroid/app/Activity;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/app/Activity;->finish()V
    //         goto :goto_0
    */

    public @JvmStatic fun finishAfterTransition(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x15
    //         if-lt v0, v1, :cond_0
    //         invoke-static {p0}, Landroid/support/v4/app/ActivityCompat21;->finishAfterTransition(Landroid/app/Activity;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/app/Activity;->finish()V
    //         goto :goto_0
    */

    public @JvmStatic fun invalidateOptionsMenu(activity: android.app.Activity): Boolean { return TODO("body: (Landroid/app/Activity;)Z") }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0xb
    //         if-lt v0, v1, :cond_0
    //         invoke-static {p0}, Landroid/support/v4/app/ActivityCompatHoneycomb;->invalidateOptionsMenu(Landroid/app/Activity;)V
    //         const/4 v0, 0x1
    //         :goto_0
    //         return v0
    //         :cond_0
    //         const/4 v0, 0x0
    //         goto :goto_0
    */

    public @JvmStatic fun postponeEnterTransition(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x15
    //         if-lt v0, v1, :cond_0
    //         invoke-static {p0}, Landroid/support/v4/app/ActivityCompat21;->postponeEnterTransition(Landroid/app/Activity;)V
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun setEnterSharedElementCallback(activity: android.app.Activity, callback: android.support.v4.app.SharedElementCallback) { /* TODO(body): (Landroid/app/Activity;Landroid/support/v4/app/SharedElementCallback;)V */ }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x15
    //         if-lt v0, v1, :cond_0
    //         invoke-static {p1}, Landroid/support/v4/app/ActivityCompat;->createCallback(Landroid/support/v4/app/SharedElementCallback;)Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Landroid/support/v4/app/ActivityCompat21;->setEnterSharedElementCallback(Landroid/app/Activity;Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;)V
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun setExitSharedElementCallback(activity: android.app.Activity, callback: android.support.v4.app.SharedElementCallback) { /* TODO(body): (Landroid/app/Activity;Landroid/support/v4/app/SharedElementCallback;)V */ }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x15
    //         if-lt v0, v1, :cond_0
    //         invoke-static {p1}, Landroid/support/v4/app/ActivityCompat;->createCallback(Landroid/support/v4/app/SharedElementCallback;)Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;
    //         move-result-object v0
    //         invoke-static {p0, v0}, Landroid/support/v4/app/ActivityCompat21;->setExitSharedElementCallback(Landroid/app/Activity;Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;)V
    //         :cond_0
    //         return-void
    */

    public @JvmStatic fun startActivity(activity: android.app.Activity, intent: android.content.Intent, options: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/content/Intent;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         .end param
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x10
    //         if-lt v0, v1, :cond_0
    //         invoke-static {p0, p1, p2}, Landroid/support/v4/app/ActivityCompatJB;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    //         goto :goto_0
    */

    public @JvmStatic fun startActivityForResult(activity: android.app.Activity, intent: android.content.Intent, requestCode: Int, options: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         .end param
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x10
    //         if-lt v0, v1, :cond_0
    //         invoke-static {p0, p1, p2, p3}, Landroid/support/v4/app/ActivityCompatJB;->startActivityForResult(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         goto :goto_0
    */

    public @JvmStatic fun startPostponedEnterTransition(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 2
    //         sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v1, 0x15
    //         if-lt v0, v1, :cond_0
    //         invoke-static {p0}, Landroid/support/v4/app/ActivityCompat21;->startPostponedEnterTransition(Landroid/app/Activity;)V
    //         :cond_0
    //         return-void
    */

    }
}
