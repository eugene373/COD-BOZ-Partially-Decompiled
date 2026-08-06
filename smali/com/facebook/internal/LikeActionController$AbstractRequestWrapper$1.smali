.class Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Lcom/facebook/Request$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->setRequest(Lcom/facebook/Request;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;


# direct methods
.method constructor <init>(Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;)V
    .locals 0

    .prologue
    .line 1326
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;->this$1:Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted(Lcom/facebook/Response;)V
    .locals 2

    .prologue
    .line 1329
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;->this$1:Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;

    invoke-virtual {p1}, Lcom/facebook/Response;->getError()Lcom/facebook/FacebookRequestError;

    move-result-object v1

    iput-object v1, v0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->error:Lcom/facebook/FacebookRequestError;

    .line 1330
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;->this$1:Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->error:Lcom/facebook/FacebookRequestError;

    if-eqz v0, :cond_0

    .line 1331
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;->this$1:Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;->this$1:Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;

    iget-object v1, v1, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->error:Lcom/facebook/FacebookRequestError;

    invoke-virtual {v0, v1}, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->processError(Lcom/facebook/FacebookRequestError;)V

    .line 1335
    :goto_0
    return-void

    .line 1333
    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;->this$1:Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;

    invoke-virtual {v0, p1}, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->processSuccess(Lcom/facebook/Response;)V

    goto :goto_0
.end method
