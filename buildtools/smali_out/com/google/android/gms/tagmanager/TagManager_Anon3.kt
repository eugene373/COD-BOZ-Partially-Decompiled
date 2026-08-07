package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 1 fields, 4 methods.

open class TagManager_Anon3: android.content.ComponentCallbacks2 {
    val arO: com.google.android.gms.tagmanager.TagManager

    constructor(p0: com.google.android.gms.tagmanager.TagManager)

    public fun onConfigurationChanged(configuration: android.content.res.Configuration) { /* TODO(body): (Landroid/content/res/Configuration;)V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onLowMemory() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onTrimMemory(i: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         const/16 v0, 0x14
    //         if-ne p1, v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/TagManager$3;->arO:Lcom/google/android/gms/tagmanager/TagManager;
    //         invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/TagManager;->dispatch()V
    //         :cond_0
    //         return-void
    */

}
