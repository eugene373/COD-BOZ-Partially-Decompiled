package com.google.android.gms.tagmanager

// Auto-emitted from smali.
// 2 fields, 4 methods.

class InstallReferrerService: android.app.IntentService() {
    var apw: com.google.android.gms.analytics.CampaignTrackingService
    var apx: android.content.Context

    public constructor()

    public constructor(name: String)

    private fun a(p0: android.content.Context, p1: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/InstallReferrerService;->apw:Lcom/google/android/gms/analytics/CampaignTrackingService;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/analytics/CampaignTrackingService;
    //         invoke-direct {v0}, Lcom/google/android/gms/analytics/CampaignTrackingService;-><init>()V
    //         iput-object v0, p0, Lcom/google/android/gms/tagmanager/InstallReferrerService;->apw:Lcom/google/android/gms/analytics/CampaignTrackingService;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/InstallReferrerService;->apw:Lcom/google/android/gms/analytics/CampaignTrackingService;
    //         invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/analytics/CampaignTrackingService;->processIntent(Landroid/content/Context;Landroid/content/Intent;)V
    //         return-void
    */

    protected fun onHandleIntent(intent: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 2
    //         const-string v0, "referrer"
    //         invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/InstallReferrerService;->apx:Landroid/content/Context;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/tagmanager/InstallReferrerService;->apx:Landroid/content/Context;
    //         :goto_0
    //         invoke-static {v0, v1}, Lcom/google/android/gms/tagmanager/ay;->d(Landroid/content/Context;Ljava/lang/String;)V
    //         invoke-direct {p0, v0, p1}, Lcom/google/android/gms/tagmanager/InstallReferrerService;->a(Landroid/content/Context;Landroid/content/Intent;)V
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/tagmanager/InstallReferrerService;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         goto :goto_0
    */

}
