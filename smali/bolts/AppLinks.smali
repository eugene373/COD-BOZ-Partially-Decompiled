.class public final Lbolts/AppLinks;
.super Ljava/lang/Object;
.source "AppLinks.java"


# static fields
.field static final KEY_NAME_APPLINK_DATA:Ljava/lang/String; = "al_applink_data"

.field static final KEY_NAME_EXTRAS:Ljava/lang/String; = "extras"

.field static final KEY_NAME_TARGET:Ljava/lang/String; = "target_url"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAppLinkData(Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 1
    .param p0, "intent"    # Landroid/content/Intent;

    .prologue
    .line 36
    const-string v0, "al_applink_data"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public static getAppLinkExtras(Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 2
    .param p0, "intent"    # Landroid/content/Intent;

    .prologue
    .line 47
    invoke-static {p0}, Lbolts/AppLinks;->getAppLinkData(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v0

    .line 48
    .local v0, "appLinkData":Landroid/os/Bundle;
    if-nez v0, :cond_0

    .line 49
    const/4 v1, 0x0

    .line 51
    :goto_0
    return-object v1

    :cond_0
    const-string v1, "extras"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0
.end method

.method public static getTargetUrl(Landroid/content/Intent;)Landroid/net/Uri;
    .locals 3
    .param p0, "intent"    # Landroid/content/Intent;

    .prologue
    .line 63
    invoke-static {p0}, Lbolts/AppLinks;->getAppLinkData(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v0

    .line 64
    .local v0, "appLinkData":Landroid/os/Bundle;
    if-eqz v0, :cond_0

    .line 65
    const-string v2, "target_url"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 66
    .local v1, "targetString":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 67
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 70
    .end local v1    # "targetString":Ljava/lang/String;
    :goto_0
    return-object v2

    :cond_0
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    goto :goto_0
.end method

.method public static getTargetUrlFromInboundIntent(Landroid/content/Context;Landroid/content/Intent;)Landroid/net/Uri;
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    const/4 v2, 0x0

    .line 82
    invoke-static {p1}, Lbolts/AppLinks;->getAppLinkData(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v0

    .line 83
    .local v0, "appLinkData":Landroid/os/Bundle;
    if-eqz v0, :cond_0

    .line 84
    const-string v3, "target_url"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 85
    .local v1, "targetString":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 86
    const-string v3, "al_nav_in"

    invoke-static {p0, v3, p1, v2}, Lbolts/MeasurementEvent;->sendBroadcastEvent(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Ljava/util/Map;)V

    .line 87
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 90
    .end local v1    # "targetString":Ljava/lang/String;
    :cond_0
    return-object v2
.end method
