package com.google.android.gms.analytics

// Auto-emitted from smali.
// 2 fields, 5 methods.

open class p: android.content.BroadcastReceiver() {
    private val yb: com.google.android.gms.analytics.ae

    constructor(p0: com.google.android.gms.analytics.ae)

    public fun onReceive(ctx: android.content.Context, intent: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 3
    //         const/4 v0, 0x0
    //         invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"
    //         invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v2
    //         if-eqz v2, :cond_2
    //         const-string v1, "noConnectivity"
    //         invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
    //         move-result v1
    //         iget-object v2, p0, Lcom/google/android/gms/analytics/p;->yb:Lcom/google/android/gms/analytics/ae;
    //         if-nez v1, :cond_0
    //         const/4 v0, 0x1
    //         :cond_0
    //         invoke-virtual {v2, v0}, Lcom/google/android/gms/analytics/ae;->A(Z)V
    //         :cond_1
    //         :goto_0
    //         return-void
    //         :cond_2
    //         const-string v0, "com.google.analytics.RADIO_POWERED"
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         sget-object v0, Lcom/google/android/gms/analytics/p;->ya:Ljava/lang/String;
    //         invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/analytics/p;->yb:Lcom/google/android/gms/analytics/ae;
    //         invoke-virtual {v0}, Lcom/google/android/gms/analytics/ae;->ed()V
    //         goto :goto_0
    */

    public fun z(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 2
    //         new-instance v0, Landroid/content/IntentFilter;
    //         invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V
    //         const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"
    //         invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         invoke-virtual {p1, p0, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //         new-instance v0, Landroid/content/IntentFilter;
    //         invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V
    //         const-string v1, "com.google.analytics.RADIO_POWERED"
    //         invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    //         invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V
    //         invoke-virtual {p1, p0, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //         return-void
    */

    companion object {
    val ya: String = null!!

    public @JvmStatic fun A(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 3
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "com.google.analytics.RADIO_POWERED"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
    //         sget-object v1, Lcom/google/android/gms/analytics/p;->ya:Ljava/lang/String;
    //         const/4 v2, 0x1
    //         invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
    //         invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    //         return-void
    */

    }
}
