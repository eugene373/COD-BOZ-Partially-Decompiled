.class Lcom/facebook/internal/LikeActionController$6$1;
.super Ljava/lang/Object;
.source "LikeActionController.java"

# interfaces
.implements Lcom/facebook/RequestBatch$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/internal/LikeActionController$6;->onComplete()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/internal/LikeActionController$6;

.field final synthetic val$likeRequest:Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;


# direct methods
.method constructor <init>(Lcom/facebook/internal/LikeActionController$6;Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;)V
    .locals 0

    .prologue
    .line 824
    iput-object p1, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iput-object p2, p0, Lcom/facebook/internal/LikeActionController$6$1;->val$likeRequest:Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBatchCompleted(Lcom/facebook/RequestBatch;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 827
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-static {v0, v3}, Lcom/facebook/internal/LikeActionController;->access$2002(Lcom/facebook/internal/LikeActionController;Z)Z

    .line 829
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->val$likeRequest:Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;->error:Lcom/facebook/FacebookRequestError;

    if-eqz v0, :cond_0

    .line 834
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v1, v1, Lcom/facebook/internal/LikeActionController$6;->val$activity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v2, v2, Lcom/facebook/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/internal/LikeActionController;->access$2100(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;Z)V

    .line 843
    :goto_0
    return-void

    .line 836
    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$6$1;->val$likeRequest:Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;

    iget-object v1, v1, Lcom/facebook/internal/LikeActionController$PublishLikeRequestWrapper;->unlikeToken:Ljava/lang/String;

    invoke-static {v1, v4}, Lcom/facebook/internal/Utility;->coerceValueIfNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$1202(Lcom/facebook/internal/LikeActionController;Ljava/lang/String;)Ljava/lang/String;

    .line 837
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/internal/LikeActionController;->access$2202(Lcom/facebook/internal/LikeActionController;Z)Z

    .line 839
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    invoke-static {v0}, Lcom/facebook/internal/LikeActionController;->access$1300(Lcom/facebook/internal/LikeActionController;)Lcom/facebook/AppEventsLogger;

    move-result-object v0

    const-string v1, "fb_like_control_did_like"

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v2, v2, Lcom/facebook/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v4, v2}, Lcom/facebook/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 841
    iget-object v0, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v0, v0, Lcom/facebook/internal/LikeActionController$6;->this$0:Lcom/facebook/internal/LikeActionController;

    iget-object v1, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v1, v1, Lcom/facebook/internal/LikeActionController$6;->val$activity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/facebook/internal/LikeActionController$6$1;->this$1:Lcom/facebook/internal/LikeActionController$6;

    iget-object v2, v2, Lcom/facebook/internal/LikeActionController$6;->val$analyticsParameters:Landroid/os/Bundle;

    invoke-static {v0, v1, v2}, Lcom/facebook/internal/LikeActionController;->access$2300(Lcom/facebook/internal/LikeActionController;Landroid/app/Activity;Landroid/os/Bundle;)V

    goto :goto_0
.end method
