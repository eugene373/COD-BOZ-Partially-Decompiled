package com.facebook.internal

// Auto-emitted from smali source: LikeActionController.java.
// 0 fields, 2 methods.

class LikeActionController_Anon4: android.content.BroadcastReceiver() {
    constructor()

    public fun onReceive(p0: android.content.Context, p1: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 6
    //         const/4 v1, 0x1
    //         invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$200()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v2, "com.facebook.sdk.ACTIVE_SESSION_UNSET"
    //         invoke-static {v2, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v2
    //         if-nez v2, :cond_1
    //         const-string v2, "com.facebook.sdk.ACTIVE_SESSION_CLOSED"
    //         invoke-static {v2, v0}, Lcom/facebook/internal/Utility;->areObjectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         :cond_1
    //         move v0, v1
    //         :goto_1
    //         invoke-static {v1}, Lcom/facebook/internal/LikeActionController;->access$202(Z)Z
    //         invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$700()Landroid/os/Handler;
    //         move-result-object v1
    //         new-instance v2, Lcom/facebook/internal/LikeActionController$4$1;
    //         invoke-direct {v2, p0, v0, p1}, Lcom/facebook/internal/LikeActionController$4$1;-><init>(Lcom/facebook/internal/LikeActionController$4;ZLandroid/content/Context;)V
    //         const-wide/16 v4, 0x64
    //         invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    //         goto :goto_0
    //         :cond_2
    //         const/4 v0, 0x0
    //         goto :goto_1
    */

}
