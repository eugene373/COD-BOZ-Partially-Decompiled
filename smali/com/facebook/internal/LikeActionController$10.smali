.class Lcom/facebook/internal/LikeActionController$10;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Lcom/facebook/RequestBatch$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/LikeActionController;->fetchVerifiedObjectId(Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/internal/LikeActionController;

.field final synthetic val$completionHandler:Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;

.field final synthetic val$objectIdRequest:Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;

.field final synthetic val$pageIdRequest:Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;


# direct methods
.method constructor <init>(Lcom/facebook/internal/LikeActionController;Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;)V
    .locals 0

    .prologue
    .line 1017
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;

    iput-object p2, p0, Lcom/facebook/internal/LikeActionController$10;->val$objectIdRequest:Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;

    iput-object p3, p0, Lcom/facebook/internal/LikeActionController$10;->val$pageIdRequest:Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;

    iput-object p4, p0, Lcom/facebook/internal/LikeActionController$10;->val$completionHandler:Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBatchCompleted(Lcom/facebook/RequestBatch;)V
    .locals 6

    .prologue
    .line 1020
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$10;->val$objectIdRequest:Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;

    iget-object v1, v1, Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;->verifiedObjectId:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$1902(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)Ljava/lang/String;

    .line 1021
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1022
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$10;->val$pageIdRequest:Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;

    iget-object v1, v1, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->verifiedObjectId:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$1902(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)Ljava/lang/String;

    .line 1023
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$10;->val$pageIdRequest:Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;

    iget-boolean v1, v1, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->objectIsPage:Z

    invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$2502(Lcom/facebook/internal/LikeActionController;Z)Z

    .line 1026
    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1027
    sget-object v0, Lcom/facebook/LoggingBehavior;->DEVELOPER_ERRORS:Lcom/facebook/LoggingBehavior;

    invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$1500()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unable to verify the FB id for \'%s\'. Verify that it is a valid FB object or page"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-static {v5}, Lcom/facebook/internal/LikeActionController;->access$2400(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1030
    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$10;->this$0:Lcom/facebook/internal/LikeActionController;

    const-string v2, "get_verified_id"

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->val$pageIdRequest:Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->error:Lcom/facebook/FacebookRequestError;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->val$pageIdRequest:Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$GetPageIdRequestWrapper;->error:Lcom/facebook/FacebookRequestError;

    :goto_0
    invoke-static {v1, v2, v0}, Lcom/facebook/internal/LikeActionController;->access$2600(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;Lcom/facebook/FacebookRequestError;)V

    .line 1034
    :cond_1
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->val$completionHandler:Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;

    if-eqz v0, :cond_2

    .line 1035
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->val$completionHandler:Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;

    invoke-interface {v0}, Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;->onComplete()V

    .line 1037
    :cond_2
    return-void

    .line 1030
    :cond_3
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$10;->val$objectIdRequest:Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$GetOGObjectIdRequestWrapper;->error:Lcom/facebook/FacebookRequestError;

    goto :goto_0
.end method
