package com.google.android.gms.analytics

// Auto-emitted from smali.
// 0 fields, 2 methods.

class CampaignTrackingReceiver: android.content.BroadcastReceiver() {
    public constructor()

    public fun onReceive(ctx: android.content.Context, intent: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "referrer"
    //         invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "com.android.vending.INSTALL_REFERRER"
    //         invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         new-instance v1, Landroid/content/Intent;
    //         const-class v2, Lcom/google/android/gms/analytics/CampaignTrackingService;
    //         invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    //         const-string v2, "referrer"
    //         invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         invoke-virtual {p1, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    //         goto :goto_0
    */

}
