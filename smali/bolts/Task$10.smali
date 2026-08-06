.class final Lbolts/Task$10;
.super Ljava/lang/Object;
.source "Task.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbolts/Task;->completeAfterTask(Lbolts/Task$TaskCompletionSource;Lbolts/Continuation;Lbolts/Task;Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$continuation:Lbolts/Continuation;

.field final synthetic val$task:Lbolts/Task;

.field final synthetic val$tcs:Lbolts/Task$TaskCompletionSource;


# direct methods
.method constructor <init>(Lbolts/Continuation;Lbolts/Task;Lbolts/Task$TaskCompletionSource;)V
    .locals 0

    .prologue
    .line 473
    iput-object p1, p0, Lbolts/Task$10;->val$continuation:Lbolts/Continuation;

    iput-object p2, p0, Lbolts/Task$10;->val$task:Lbolts/Task;

    iput-object p3, p0, Lbolts/Task$10;->val$tcs:Lbolts/Task$TaskCompletionSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 477
    :try_start_0
    iget-object v2, p0, Lbolts/Task$10;->val$continuation:Lbolts/Continuation;

    iget-object v3, p0, Lbolts/Task$10;->val$task:Lbolts/Task;

    invoke-interface {v2, v3}, Lbolts/Continuation;->then(Lbolts/Task;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbolts/Task;

    .line 478
    .local v1, "result":Lbolts/Task;, "Lbolts/Task<TTContinuationResult;>;"
    if-nez v1, :cond_0

    .line 479
    iget-object v2, p0, Lbolts/Task$10;->val$tcs:Lbolts/Task$TaskCompletionSource;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lbolts/Task$TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 498
    .end local v1    # "result":Lbolts/Task;, "Lbolts/Task<TTContinuationResult;>;"
    :goto_0
    return-void

    .line 481
    .restart local v1    # "result":Lbolts/Task;, "Lbolts/Task<TTContinuationResult;>;"
    :cond_0
    new-instance v2, Lbolts/Task$10$1;

    invoke-direct {v2, p0}, Lbolts/Task$10$1;-><init>(Lbolts/Task$10;)V

    invoke-virtual {v1, v2}, Lbolts/Task;->continueWith(Lbolts/Continuation;)Lbolts/Task;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 495
    .end local v1    # "result":Lbolts/Task;, "Lbolts/Task<TTContinuationResult;>;"
    :catch_0
    move-exception v0

    .line 496
    .local v0, "e":Ljava/lang/Exception;
    iget-object v2, p0, Lbolts/Task$10;->val$tcs:Lbolts/Task$TaskCompletionSource;

    invoke-virtual {v2, v0}, Lbolts/Task$TaskCompletionSource;->setError(Ljava/lang/Exception;)V

    goto :goto_0
.end method
