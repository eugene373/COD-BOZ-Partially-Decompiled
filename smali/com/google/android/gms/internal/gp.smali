.class public final Lcom/google/android/gms/internal/gp;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ez;
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Landroid/webkit/WebSettings;)V
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/gn;->a(Landroid/content/Context;Landroid/webkit/WebSettings;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    return-void
.end method

.method public static getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    invoke-static {p0}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
