.class final Lcom/facebook/Settings$2;
.super Ljava/lang/Object;
.source "Settings.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/Settings;->publishInstallAsync(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Request$Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$applicationContext:Landroid/content/Context;

.field final synthetic val$applicationId:Ljava/lang/String;

.field final synthetic val$callback:Lcom/facebook/Request$Callback;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/Request$Callback;)V
    .locals 0

    .prologue
    .line 323
    iput-object p1, p0, Lcom/facebook/Settings$2;->val$applicationContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/facebook/Settings$2;->val$applicationId:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/Settings$2;->val$callback:Lcom/facebook/Request$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 326
    iget-object v0, p0, Lcom/facebook/Settings$2;->val$applicationContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/Settings$2;->val$applicationId:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/facebook/Settings;->publishInstallAndWaitForResponse(Landroid/content/Context;Ljava/lang/String;Z)Lcom/facebook/Response;

    move-result-object v0

    .line 327
    iget-object v1, p0, Lcom/facebook/Settings$2;->val$callback:Lcom/facebook/Request$Callback;

    if-eqz v1, :cond_0

    .line 329
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 330
    new-instance v2, Lcom/facebook/Settings$2$1;

    invoke-direct {v2, p0, v0}, Lcom/facebook/Settings$2$1;-><init>(Lcom/facebook/Settings$2;Lcom/facebook/Response;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 337
    :cond_0
    return-void
.end method
