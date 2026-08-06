.class Lcom/facebook/widget/LoginButton$LoginButtonCallback;
.super Ljava/lang/Object;
.source "LoginButton.java"

# interfaces
.implements Lcom/facebook/Session$StatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/LoginButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LoginButtonCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/LoginButton;


# direct methods
.method private constructor <init>(Lcom/facebook/widget/LoginButton;)V
    .locals 0

    .prologue
    .line 881
    iput-object p1, p0, Lcom/facebook/widget/LoginButton$LoginButtonCallback;->this$0:Lcom/facebook/widget/LoginButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/widget/LoginButton;Lcom/facebook/widget/LoginButton$1;)V
    .locals 0

    .prologue
    .line 881
    invoke-direct {p0, p1}, Lcom/facebook/widget/LoginButton$LoginButtonCallback;-><init>(Lcom/facebook/widget/LoginButton;)V

    return-void
.end method


# virtual methods
.method public call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    .locals 1

    .prologue
    .line 885
    iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonCallback;->this$0:Lcom/facebook/widget/LoginButton;

    invoke-static {v0}, Lcom/facebook/widget/LoginButton;->access$1700(Lcom/facebook/widget/LoginButton;)V

    .line 886
    iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonCallback;->this$0:Lcom/facebook/widget/LoginButton;

    invoke-static {v0}, Lcom/facebook/widget/LoginButton;->access$1800(Lcom/facebook/widget/LoginButton;)V

    .line 890
    iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonCallback;->this$0:Lcom/facebook/widget/LoginButton;

    invoke-static {v0}, Lcom/facebook/widget/LoginButton;->access$1000(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$LoginButtonProperties;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$1900(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/Session$StatusCallback;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 891
    iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonCallback;->this$0:Lcom/facebook/widget/LoginButton;

    invoke-static {v0}, Lcom/facebook/widget/LoginButton;->access$1000(Lcom/facebook/widget/LoginButton;)Lcom/facebook/widget/LoginButton$LoginButtonProperties;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/widget/LoginButton$LoginButtonProperties;->access$1900(Lcom/facebook/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/Session$StatusCallback;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/Session$StatusCallback;->call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V

    .line 895
    :cond_0
    :goto_0
    return-void

    .line 892
    :cond_1
    if-eqz p3, :cond_0

    .line 893
    iget-object v0, p0, Lcom/facebook/widget/LoginButton$LoginButtonCallback;->this$0:Lcom/facebook/widget/LoginButton;

    invoke-virtual {v0, p3}, Lcom/facebook/widget/LoginButton;->handleError(Ljava/lang/Exception;)V

    goto :goto_0
.end method
