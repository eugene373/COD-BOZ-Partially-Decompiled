.class final Lcom/facebook/AppLinkData$1;
.super Ljava/lang/Object;
.source "AppLinkData.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/AppLinkData;->fetchDeferredAppLinkData(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AppLinkData$CompletionHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$applicationContext:Landroid/content/Context;

.field final synthetic val$applicationIdCopy:Ljava/lang/String;

.field final synthetic val$completionHandler:Lcom/facebook/AppLinkData$CompletionHandler;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AppLinkData$CompletionHandler;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lcom/facebook/AppLinkData$1;->val$applicationContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/facebook/AppLinkData$1;->val$applicationIdCopy:Ljava/lang/String;

    iput-object p3, p0, Lcom/facebook/AppLinkData$1;->val$completionHandler:Lcom/facebook/AppLinkData$CompletionHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/AppLinkData$1;->val$applicationContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/facebook/AppLinkData$1;->val$applicationIdCopy:Ljava/lang/String;

    iget-object v2, p0, Lcom/facebook/AppLinkData$1;->val$completionHandler:Lcom/facebook/AppLinkData$CompletionHandler;

    invoke-static {v0, v1, v2}, Lcom/facebook/AppLinkData;->access$000(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AppLinkData$CompletionHandler;)V

    .line 122
    return-void
.end method
