.class Lcom/facebook/internal/LikeActionController$8;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Lcom/facebook/internal/LikeActionController$RequestCompletionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/LikeActionController;->refreshStatusAsync()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/internal/LikeActionController;


# direct methods
.method constructor <init>(Lcom/facebook/internal/LikeActionController;)V
    .locals 0

    .prologue
    .line 898
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 4

    .prologue
    .line 901
    new-instance v0, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-static {v2}, Lcom/facebook/internal/LikeActionController;->access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 903
    new-instance v1, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v3, p0, Lcom/facebook/internal/LikeActionController$8;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-static {v3}, Lcom/facebook/internal/LikeActionController;->access$1900(Lcom/facebook/internal/LikeActionController;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;-><init>(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)V

    .line 906
    new-instance v2, Lcom/facebook/RequestBatch;

    invoke-direct {v2}, Lcom/facebook/RequestBatch;-><init>()V

    .line 907
    invoke-virtual {v0, v2}, Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V

    .line 908
    invoke-virtual {v1, v2}, Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;->addToBatch(Lcom/facebook/RequestBatch;)V

    .line 910
    new-instance v3, Lcom/facebook/internal/LikeActionController$8$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/facebook/internal/LikeActionController$8$1;-><init>(Lcom/facebook/internal/LikeActionController$8;Lcom/facebook/internal/LikeActionController$GetOGObjectLikesRequestWrapper;Lcom/facebook/internal/LikeActionController$GetEngagementRequestWrapper;)V

    invoke-virtual {v2, v3}, Lcom/facebook/RequestBatch;->addCallback(Lcom/facebook/RequestBatch$Callback;)V

    .line 933
    invoke-virtual {v2}, Lcom/facebook/RequestBatch;->executeAsync()Lcom/facebook/RequestAsyncTask;

    .line 934
    return-void
.end method
