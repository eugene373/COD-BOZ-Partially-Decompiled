.class abstract Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;
.super Ljava/lang/Object;
.source "LikeActionController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/LikeActionController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "AbstractRequestWrapper"
.end annotation


# instance fields
.field error:Lcom/facebook/FacebookRequestError;

.field protected objectId:Ljava/lang/String;

.field private request:Lcom/facebook/Request;

.field final synthetic this$0:Lcom/facebook/internal/LikeActionController;


# direct methods
.method protected constructor <init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1314
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1315
    iput-object p2, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->objectId:Ljava/lang/String;

    .line 1316
    return-void
.end method


# virtual methods
.method addToBatch(Lcom/facebook/RequestBatch;)V
    .locals 1

    .prologue
    .line 1319
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->request:Lcom/facebook/Request;

    invoke-virtual {p1, v0}, Lcom/facebook/RequestBatch;->add(Lcom/facebook/Request;)Z

    .line 1320
    return-void
.end method

.method protected processError(Lcom/facebook/FacebookRequestError;)V
    .locals 6

    .prologue
    .line 1340
    sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;

    invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$1500()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Error running request for object \'%s\' : %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->objectId:Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object p1, v3, v4

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1343
    return-void
.end method

.method protected abstract processSuccess(Lcom/facebook/Response;)V
.end method

.method protected setRequest(Lcom/facebook/Request;)V
    .locals 1

    .prologue
    .line 1323
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;->request:Lcom/facebook/Request;

    .line 1325
    const-string v0, "v2.2"

    invoke-virtual {p1, v0}, Lcom/facebook/Request;->setVersion(Ljava/lang/String;)V

    .line 1326
    new-instance v0, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;

    invoke-direct {v0, p0}, Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper$1;-><init>(Lcom/facebook/internal/LikeActionController$AbstractRequestWrapper;)V

    invoke-virtual {p1, v0}, Lcom/facebook/Request;->setCallback(Lcom/facebook/Request$Callback;)V

    .line 1337
    return-void
.end method
