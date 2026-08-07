package android.support.v4.app

// Auto-emitted from smali source: ActivityCompat21.java.
// 0 fields, 7 methods.

open class ActivityCompat21 {
    constructor()

    companion object {
    private @JvmStatic fun createCallback(callback: android.support.v4.app.ActivityCompat21.SharedElementCallback21): android.app.SharedElementCallback { return TODO("body: (Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;)Landroid/app/SharedElementCallback;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         .local v0, "newListener":Landroid/app/SharedElementCallback;
    //         if-eqz p0, :cond_0
    //         new-instance v0, Landroid/support/v4/app/ActivityCompat21$SharedElementCallbackImpl;
    //         .end local v0    # "newListener":Landroid/app/SharedElementCallback;
    //         invoke-direct {v0, p0}, Landroid/support/v4/app/ActivityCompat21$SharedElementCallbackImpl;-><init>(Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;)V
    //         .restart local v0    # "newListener":Landroid/app/SharedElementCallback;
    //         :cond_0
    //         return-object v0
    */

    public @JvmStatic fun finishAfterTransition(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Landroid/app/Activity;->finishAfterTransition()V
    //         return-void
    */

    public @JvmStatic fun postponeEnterTransition(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Landroid/app/Activity;->postponeEnterTransition()V
    //         return-void
    */

    public @JvmStatic fun setEnterSharedElementCallback(activity: android.app.Activity, callback: android.support.v4.app.ActivityCompat21.SharedElementCallback21) { /* TODO(body): (Landroid/app/Activity;Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/ActivityCompat21;->createCallback(Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;)Landroid/app/SharedElementCallback;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Landroid/app/Activity;->setEnterSharedElementCallback(Landroid/app/SharedElementCallback;)V
    //         return-void
    */

    public @JvmStatic fun setExitSharedElementCallback(activity: android.app.Activity, callback: android.support.v4.app.ActivityCompat21.SharedElementCallback21) { /* TODO(body): (Landroid/app/Activity;Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Landroid/support/v4/app/ActivityCompat21;->createCallback(Landroid/support/v4/app/ActivityCompat21$SharedElementCallback21;)Landroid/app/SharedElementCallback;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Landroid/app/Activity;->setExitSharedElementCallback(Landroid/app/SharedElementCallback;)V
    //         return-void
    */

    public @JvmStatic fun startPostponedEnterTransition(activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 0
    //         invoke-virtual {p0}, Landroid/app/Activity;->startPostponedEnterTransition()V
    //         return-void
    */

    }
}
