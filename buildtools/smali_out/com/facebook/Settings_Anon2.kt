package com.facebook

// Auto-emitted from smali source: Settings.java.
// 3 fields, 2 methods.

class Settings_Anon2: Runnable {
    val val$applicationContext: android.content.Context
    val val$applicationId: String
    val val$callback: com.facebook.Request.Callback

    constructor(p0: android.content.Context, p1: String, p2: com.facebook.Request.Callback)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/facebook/Settings$2;->val$applicationContext:Landroid/content/Context;
    //         iget-object v1, p0, Lcom/facebook/Settings$2;->val$applicationId:Ljava/lang/String;
    //         const/4 v2, 0x0
    //         invoke-static {v0, v1, v2}, Lcom/facebook/Settings;->publishInstallAndWaitForResponse(Landroid/content/Context;Ljava/lang/String;Z)Lcom/facebook/Response;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/facebook/Settings$2;->val$callback:Lcom/facebook/Request$Callback;
    //         if-eqz v1, :cond_0
    //         new-instance v1, Landroid/os/Handler;
    //         invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v2
    //         invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
    //         new-instance v2, Lcom/facebook/Settings$2$1;
    //         invoke-direct {v2, p0, v0}, Lcom/facebook/Settings$2$1;-><init>(Lcom/facebook/Settings$2;Lcom/facebook/Response;)V
    //         invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         :cond_0
    //         return-void
    */

}
