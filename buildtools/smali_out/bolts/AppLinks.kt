package bolts

// Auto-emitted from smali source: AppLinks.java.
// 3 fields, 5 methods.

class AppLinks {
    public constructor()

    companion object {
    val KEY_NAME_APPLINK_DATA: String = "al_applink_data"
    val KEY_NAME_EXTRAS: String = "extras"
    val KEY_NAME_TARGET: String = "target_url"

    public @JvmStatic fun getAppLinkData(intent: android.content.Intent): android.os.Bundle { return TODO("body: (Landroid/content/Intent;)Landroid/os/Bundle;") }
    /*
    //         .locals 1
    //         const-string v0, "al_applink_data"
    //         invoke-virtual {p0, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getAppLinkExtras(intent: android.content.Intent): android.os.Bundle { return TODO("body: (Landroid/content/Intent;)Landroid/os/Bundle;") }
    /*
    //         .locals 2
    //         invoke-static {p0}, Lbolts/AppLinks;->getAppLinkData(Landroid/content/Intent;)Landroid/os/Bundle;
    //         move-result-object v0
    //         .local v0, "appLinkData":Landroid/os/Bundle;
    //         if-nez v0, :cond_0
    //         const/4 v1, 0x0
    //         :goto_0
    //         return-object v1
    //         :cond_0
    //         const-string v1, "extras"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v1
    //         goto :goto_0
    */

    public @JvmStatic fun getTargetUrl(intent: android.content.Intent): android.net.Uri { return TODO("body: (Landroid/content/Intent;)Landroid/net/Uri;") }
    /*
    //         .locals 3
    //         invoke-static {p0}, Lbolts/AppLinks;->getAppLinkData(Landroid/content/Intent;)Landroid/os/Bundle;
    //         move-result-object v0
    //         .local v0, "appLinkData":Landroid/os/Bundle;
    //         if-eqz v0, :cond_0
    //         const-string v2, "target_url"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         .local v1, "targetString":Ljava/lang/String;
    //         if-eqz v1, :cond_0
    //         invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v2
    //         .end local v1    # "targetString":Ljava/lang/String;
    //         :goto_0
    //         return-object v2
    //         :cond_0
    //         invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;
    //         move-result-object v2
    //         goto :goto_0
    */

    public @JvmStatic fun getTargetUrlFromInboundIntent(context: android.content.Context, intent: android.content.Intent): android.net.Uri { return TODO("body: (Landroid/content/Context;Landroid/content/Intent;)Landroid/net/Uri;") }
    /*
    //         .locals 4
    //         const/4 v2, 0x0
    //         invoke-static {p1}, Lbolts/AppLinks;->getAppLinkData(Landroid/content/Intent;)Landroid/os/Bundle;
    //         move-result-object v0
    //         .local v0, "appLinkData":Landroid/os/Bundle;
    //         if-eqz v0, :cond_0
    //         const-string v3, "target_url"
    //         invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         .local v1, "targetString":Ljava/lang/String;
    //         if-eqz v1, :cond_0
    //         const-string v3, "al_nav_in"
    //         invoke-static {p0, v3, p1, v2}, Lbolts/MeasurementEvent;->sendBroadcastEvent(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Ljava/util/Map;)V
    //         invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v2
    //         .end local v1    # "targetString":Ljava/lang/String;
    //         :cond_0
    //         return-object v2
    */

    }
}
