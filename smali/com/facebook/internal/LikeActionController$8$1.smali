.class Lcom/facebook/internal/LikeActionController$8$1;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Lcom/facebook/RequestBatch$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/LikeActionController$8;->onComplete()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/internal/LikeActionController$8;

.field final synthetic val$engagementRequest:Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;

.field final synthetic val$objectLikesRequest:Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;


# direct methods
.method constructor <init>(Lcom/facebook/internal/LikeActionController$8;Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;)V
    .locals 0

    .prologue
    .line 910
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$8$1;->this$1:Lcom/facebook/internal/LikeActionController$8;

    iput-object p2, p0, Lcom/facebook/internal/LikeActionController$8$1;->val$objectLikesRequest:Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;

    iput-object p3, p0, Lcom/facebook/internal/LikeActionController$8$1;->val$engagementRequest:Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBatchCompleted(Lcom/facebook/RequestBatch;)V
    .locals 7

    .prologue
    .line 913
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$8$1;->val$objectLikesRequest:Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->error:Lcom/facebook/FacebookRequestError;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$8$1;->val$engagementRequest:Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->error:Lcom/facebook/FacebookRequestError;

    if-eqz v0, :cond_1

    .line 916
    :cond_0
    sget-object v0, Lcom/facebook/LoggingBehavior;->REQUESTS:Lcom/facebook/LoggingBehavior;

    invoke-static {}, Lcom/facebook/internal/LikeActionController;->access$1500()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unable to refresh like state for id: \'%s\'"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/facebook/internal/LikeActionController$8$1;->this$1:Lcom/facebook/internal/LikeActionController$8;

    iget-object v5, v5, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-static {v5}, Lcom/facebook/internal/LikeActionController;->access$2400(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 930
    :goto_0
    return-void

    .line 923
    :cond_1
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$8$1;->this$1:Lcom/facebook/internal/LikeActionController$8;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$8$1;->val$objectLikesRequest:Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;

    iget-boolean v1, v1, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->objectIsLiked:Z

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$8$1;->val$engagementRequest:Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;

    iget-object v2, v2, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->likeCountStringWithLike:Ljava/lang/String;

    iget-object v3, p0, Lcom/facebook/internal/LikeActionController$8$1;->val$engagementRequest:Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;

    iget-object v3, v3, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->likeCountStringWithoutLike:Ljava/lang/String;

    iget-object v4, p0, Lcom/facebook/internal/LikeActionController$8$1;->val$engagementRequest:Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;

    iget-object v4, v4, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->socialSentenceStringWithLike:Ljava/lang/String;

    iget-object v5, p0, Lcom/facebook/internal/LikeActionController$8$1;->val$engagementRequest:Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;

    iget-object v5, v5, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->socialSentenceStringWithoutLike:Ljava/lang/String;

    iget-object v6, p0, Lcom/facebook/internal/LikeActionController$8$1;->val$objectLikesRequest:Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;

    iget-object v6, v6, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->unlikeToken:Ljava/lang/String;

    invoke-static/range {v0 .. v6}, Lcom/facebook/internal/LikeActionController;->access$1400(Lcom/facebook/internal/LikeActionController;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
