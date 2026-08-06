.class Lcom/facebook/AuthorizationClient$WebViewAuthHandler$1;
.super Ljava/lang/Object;
.source "AuthorizationClient.java"

# interfaces
.implements Lcom/facebook/widget/WebDialog$OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->tryAuthorize(Lcom/facebook/AuthorizationClient$AuthorizationRequest;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/AuthorizationClient$WebViewAuthHandler;

.field final synthetic val$request:Lcom/facebook/AuthorizationClient$AuthorizationRequest;


# direct methods
.method constructor <init>(Lcom/facebook/AuthorizationClient$WebViewAuthHandler;Lcom/facebook/AuthorizationClient$AuthorizationRequest;)V
    .locals 0

    .prologue
    .line 617
    iput-object p1, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler$1;->this$1:Lcom/facebook/AuthorizationClient$WebViewAuthHandler;

    iput-object p2, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler$1;->val$request:Lcom/facebook/AuthorizationClient$AuthorizationRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Landroid/os/Bundle;Lcom/facebook/FacebookException;)V
    .locals 2

    .prologue
    .line 620
    iget-object v0, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler$1;->this$1:Lcom/facebook/AuthorizationClient$WebViewAuthHandler;

    iget-object v1, p0, Lcom/facebook/AuthorizationClient$WebViewAuthHandler$1;->val$request:Lcom/facebook/AuthorizationClient$AuthorizationRequest;

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/AuthorizationClient$WebViewAuthHandler;->onWebDialogComplete(Lcom/facebook/AuthorizationClient$AuthorizationRequest;Landroid/os/Bundle;Lcom/facebook/FacebookException;)V

    .line 621
    return-void
.end method
