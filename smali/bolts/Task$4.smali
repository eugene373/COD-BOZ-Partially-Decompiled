.class Lbolts/Task$4;
.super Ljava/lang/Object;
.source "Task.java"

# interfaces
.implements Lbolts/Continuation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbolts/Task;->continueWhile(Ljava/util/concurrent/Callable;Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbolts/Continuation",
        "<",
        "Ljava/lang/Void;",
        "Lbolts/Task",
        "<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lbolts/Task;

.field final synthetic val$continuation:Lbolts/Continuation;

.field final synthetic val$executor:Ljava/util/concurrent/Executor;

.field final synthetic val$predicate:Ljava/util/concurrent/Callable;

.field final synthetic val$predicateContinuation:Lbolts/Capture;


# direct methods
.method constructor <init>(Lbolts/Task;Ljava/util/concurrent/Callable;Lbolts/Continuation;Ljava/util/concurrent/Executor;Lbolts/Capture;)V
    .locals 0

    .prologue
    .line 279
    .local p0, "this":Lbolts/Task$4;, "Lbolts/Task.4;"
    iput-object p1, p0, Lbolts/Task$4;->this$0:Lbolts/Task;

    iput-object p2, p0, Lbolts/Task$4;->val$predicate:Ljava/util/concurrent/Callable;

    iput-object p3, p0, Lbolts/Task$4;->val$continuation:Lbolts/Continuation;

    iput-object p4, p0, Lbolts/Task$4;->val$executor:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lbolts/Task$4;->val$predicateContinuation:Lbolts/Capture;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public then(Lbolts/Task;)Lbolts/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbolts/Task",
            "<",
            "Ljava/lang/Void;",
            ">;)",
            "Lbolts/Task",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .local p0, "this":Lbolts/Task$4;, "Lbolts/Task.4;"
    .local p1, "task":Lbolts/Task;, "Lbolts/Task<Ljava/lang/Void;>;"
    const/4 v1, 0x0

    .line 282
    iget-object v0, p0, Lbolts/Task$4;->val$predicate:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 283
    invoke-static {v1}, Lbolts/Task;->forResult(Ljava/lang/Object;)Lbolts/Task;

    move-result-object v0

    iget-object v1, p0, Lbolts/Task$4;->val$continuation:Lbolts/Continuation;

    iget-object v2, p0, Lbolts/Task$4;->val$executor:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Lbolts/Task;->onSuccessTask(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;

    move-result-object v1

    iget-object v0, p0, Lbolts/Task$4;->val$predicateContinuation:Lbolts/Capture;

    invoke-virtual {v0}, Lbolts/Capture;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbolts/Continuation;

    iget-object v2, p0, Lbolts/Task$4;->val$executor:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v0, v2}, Lbolts/Task;->onSuccessTask(Lbolts/Continuation;Ljava/util/concurrent/Executor;)Lbolts/Task;

    move-result-object v0

    .line 286
    :goto_0
    return-object v0

    :cond_0
    invoke-static {v1}, Lbolts/Task;->forResult(Ljava/lang/Object;)Lbolts/Task;

    move-result-object v0

    goto :goto_0
.end method

.method public bridge synthetic then(Lbolts/Task;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lbolts/Task;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 279
    .local p0, "this":Lbolts/Task$4;, "Lbolts/Task.4;"
    invoke-virtual {p0, p1}, Lbolts/Task$4;->then(Lbolts/Task;)Lbolts/Task;

    move-result-object v0

    return-object v0
.end method
