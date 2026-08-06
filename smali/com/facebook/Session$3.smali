.class Lcom/facebook/Session$3;
.super Ljava/lang/Object;
.source "Session.java"

# interfaces
.implements Lcom/facebook/AuthorizationClient$OnCompletedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/Session;->tryLegacyAuth(Lcom/facebook/Session$AuthorizationRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/Session;


# direct methods
.method constructor <init>(Lcom/facebook/Session;)V
    .locals 0

    .prologue
    .line 1440
    iput-object p1, p0, Lcom/facebook/Session$3;->this$0:Lcom/facebook/Session;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/AuthorizationClient$Result;)V
    .locals 2

    .prologue
    .line 1444
    iget-object v0, p1, Lcom/facebook/AuthorizationClient$Result;->code:Lcom/facebook/AuthorizationClient$Result$Code;

    sget-object v1, Lcom/facebook/AuthorizationClient$Result$Code;->CANCEL:Lcom/facebook/AuthorizationClient$Result$Code;

    if-ne v0, v1, :cond_0

    .line 1445
    const/4 v0, 0x0

    .line 1449
    :goto_0
    iget-object v1, p0, Lcom/facebook/Session$3;->this$0:Lcom/facebook/Session;

    invoke-static {v1, v0, p1}, Lcom/facebook/Session;->access$1100(Lcom/facebook/Session;ILcom/facebook/AuthorizationClient$Result;)V

    .line 1450
    return-void

    .line 1447
    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method
