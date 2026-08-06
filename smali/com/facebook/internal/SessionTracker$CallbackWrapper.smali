.class Lcom/facebook/internal/SessionTracker$CallbackWrapper;
.super Ljava/lang/Object;
.source "SessionTracker.java"

# interfaces
.implements Lcom/facebook/Session$StatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/SessionTracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "CallbackWrapper"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/internal/SessionTracker;

.field private final wrapped:Lcom/facebook/Session$StatusCallback;


# direct methods
.method public constructor <init>(Lcom/facebook/internal/SessionTracker;Lcom/facebook/Session$StatusCallback;)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lcom/facebook/internal/SessionTracker$CallbackWrapper;->this$0:Lcom/facebook/internal/SessionTracker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 224
    iput-object p2, p0, Lcom/facebook/internal/SessionTracker$CallbackWrapper;->wrapped:Lcom/facebook/Session$StatusCallback;

    .line 225
    return-void
.end method


# virtual methods
.method public call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    .locals 2

    .prologue
    .line 229
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker$CallbackWrapper;->wrapped:Lcom/facebook/Session$StatusCallback;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/internal/SessionTracker$CallbackWrapper;->this$0:Lcom/facebook/internal/SessionTracker;

    invoke-virtual {v0}, Lcom/facebook/internal/SessionTracker;->isTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker$CallbackWrapper;->wrapped:Lcom/facebook/Session$StatusCallback;

    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/Session$StatusCallback;->call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V

    .line 234
    :cond_0
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker$CallbackWrapper;->this$0:Lcom/facebook/internal/SessionTracker;

    invoke-static {v0}, Lcom/facebook/internal/SessionTracker;->access$200(Lcom/facebook/internal/SessionTracker;)Lcom/facebook/Session;

    move-result-object v0

    if-ne p1, v0, :cond_1

    invoke-virtual {p2}, Lcom/facebook/SessionState;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 235
    iget-object v0, p0, Lcom/facebook/internal/SessionTracker$CallbackWrapper;->this$0:Lcom/facebook/internal/SessionTracker;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/internal/SessionTracker;->setSession(Lcom/facebook/Session;)V

    .line 237
    :cond_1
    return-void
.end method
