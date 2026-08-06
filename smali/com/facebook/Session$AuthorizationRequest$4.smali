.class Lcom/facebook/Session$AuthorizationRequest$4;
.super Ljava/lang/Object;
.source "Session.java"

# interfaces
.implements Lcom/facebook/AuthorizationClient$StartActivityDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/Session$AuthorizationRequest;->getAuthorizationClientRequest()Lcom/facebook/AuthorizationClient$AuthorizationRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/Session$AuthorizationRequest;


# direct methods
.method constructor <init>(Lcom/facebook/Session$AuthorizationRequest;)V
    .locals 0

    .prologue
    .line 2059
    iput-object p1, p0, Lcom/facebook/Session$AuthorizationRequest$4;->this$0:Lcom/facebook/Session$AuthorizationRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getActivityContext()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 2067
    iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest$4;->this$0:Lcom/facebook/Session$AuthorizationRequest;

    invoke-static {v0}, Lcom/facebook/Session$AuthorizationRequest;->access$1900(Lcom/facebook/Session$AuthorizationRequest;)Lcom/facebook/Session$StartActivityDelegate;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/Session$StartActivityDelegate;->getActivityContext()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 1

    .prologue
    .line 2062
    iget-object v0, p0, Lcom/facebook/Session$AuthorizationRequest$4;->this$0:Lcom/facebook/Session$AuthorizationRequest;

    invoke-static {v0}, Lcom/facebook/Session$AuthorizationRequest;->access$1900(Lcom/facebook/Session$AuthorizationRequest;)Lcom/facebook/Session$StartActivityDelegate;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/facebook/Session$StartActivityDelegate;->startActivityForResult(Landroid/content/Intent;I)V

    .line 2063
    return-void
.end method
