.class public Lcom/facebook/RequestBatch;
.super Ljava/util/AbstractList;
.source "RequestBatch.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/RequestBatch$OnProgressCallback;,
        Lcom/facebook/RequestBatch$Callback;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList",
        "<",
        "Lcom/facebook/Request;",
        ">;"
    }
.end annotation


# static fields
.field private static idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private batchApplicationId:Ljava/lang/String;

.field private callbackHandler:Landroid/os/Handler;

.field private callbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/RequestBatch$Callback;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private requests:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/Request;",
            ">;"
        }
    .end annotation
.end field

.field private timeoutInMilliseconds:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/facebook/RequestBatch;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/RequestBatch;->timeoutInMilliseconds:I

    .line 33
    sget-object v0, Lcom/facebook/RequestBatch;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/RequestBatch;->id:Ljava/lang/String;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    .line 42
    return-void
.end method

.method public constructor <init>(Lcom/facebook/RequestBatch;)V
    .locals 2

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/RequestBatch;->timeoutInMilliseconds:I

    .line 33
    sget-object v0, Lcom/facebook/RequestBatch;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/RequestBatch;->id:Ljava/lang/String;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    .line 66
    iget-object v0, p1, Lcom/facebook/RequestBatch;->callbackHandler:Landroid/os/Handler;

    iput-object v0, p0, Lcom/facebook/RequestBatch;->callbackHandler:Landroid/os/Handler;

    .line 67
    iget v0, p1, Lcom/facebook/RequestBatch;->timeoutInMilliseconds:I

    iput v0, p0, Lcom/facebook/RequestBatch;->timeoutInMilliseconds:I

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;

    .line 69
    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/Request;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/RequestBatch;->timeoutInMilliseconds:I

    .line 33
    sget-object v0, Lcom/facebook/RequestBatch;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/RequestBatch;->id:Ljava/lang/String;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    .line 50
    return-void
.end method

.method public varargs constructor <init>([Lcom/facebook/Request;)V
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/RequestBatch;->timeoutInMilliseconds:I

    .line 33
    sget-object v0, Lcom/facebook/RequestBatch;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/RequestBatch;->id:Ljava/lang/String;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;

    .line 57
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    .line 58
    return-void
.end method


# virtual methods
.method public final add(ILcom/facebook/Request;)V
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 118
    return-void
.end method

.method public bridge synthetic add(ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 27
    check-cast p2, Lcom/facebook/Request;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/RequestBatch;->add(ILcom/facebook/Request;)V

    return-void
.end method

.method public final add(Lcom/facebook/Request;)Z
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 27
    check-cast p1, Lcom/facebook/Request;

    invoke-virtual {p0, p1}, Lcom/facebook/RequestBatch;->add(Lcom/facebook/Request;)Z

    move-result v0

    return v0
.end method

.method public addCallback(Lcom/facebook/RequestBatch$Callback;)V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    :cond_0
    return-void
.end method

.method public final clear()V
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 123
    return-void
.end method

.method public final executeAndWait()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/Response;",
            ">;"
        }
    .end annotation

    .prologue
    .line 187
    invoke-virtual {p0}, Lcom/facebook/RequestBatch;->executeAndWaitImpl()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method executeAndWaitImpl()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/Response;",
            ">;"
        }
    .end annotation

    .prologue
    .line 237
    invoke-static {p0}, Lcom/facebook/Request;->executeBatchAndWait(Lcom/facebook/RequestBatch;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final executeAsync()Lcom/facebook/RequestAsyncTask;
    .locals 1

    .prologue
    .line 204
    invoke-virtual {p0}, Lcom/facebook/RequestBatch;->executeAsyncImpl()Lcom/facebook/RequestAsyncTask;

    move-result-object v0

    return-object v0
.end method

.method executeAsyncImpl()Lcom/facebook/RequestAsyncTask;
    .locals 1

    .prologue
    .line 241
    invoke-static {p0}, Lcom/facebook/Request;->executeBatchAsync(Lcom/facebook/RequestBatch;)Lcom/facebook/RequestAsyncTask;

    move-result-object v0

    return-object v0
.end method

.method public final get(I)Lcom/facebook/Request;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/Request;

    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lcom/facebook/RequestBatch;->get(I)Lcom/facebook/Request;

    move-result-object v0

    return-object v0
.end method

.method final getBatchApplicationId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/facebook/RequestBatch;->batchApplicationId:Ljava/lang/String;

    return-object v0
.end method

.method final getCallbackHandler()Landroid/os/Handler;
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/facebook/RequestBatch;->callbackHandler:Landroid/os/Handler;

    return-object v0
.end method

.method final getCallbacks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/RequestBatch$Callback;",
            ">;"
        }
    .end annotation

    .prologue
    .line 162
    iget-object v0, p0, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;

    return-object v0
.end method

.method final getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/RequestBatch;->id:Ljava/lang/String;

    return-object v0
.end method

.method final getRequests()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/Request;",
            ">;"
        }
    .end annotation

    .prologue
    .line 158
    iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    return-object v0
.end method

.method public getTimeout()I
    .locals 1

    .prologue
    .line 76
    iget v0, p0, Lcom/facebook/RequestBatch;->timeoutInMilliseconds:I

    return v0
.end method

.method public final remove(I)Lcom/facebook/Request;
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/Request;

    return-object v0
.end method

.method public bridge synthetic remove(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lcom/facebook/RequestBatch;->remove(I)Lcom/facebook/Request;

    move-result-object v0

    return-object v0
.end method

.method public removeCallback(Lcom/facebook/RequestBatch$Callback;)V
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/facebook/RequestBatch;->callbacks:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 108
    return-void
.end method

.method public final set(ILcom/facebook/Request;)Lcom/facebook/Request;
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/Request;

    return-object v0
.end method

.method public bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    check-cast p2, Lcom/facebook/Request;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/RequestBatch;->set(ILcom/facebook/Request;)Lcom/facebook/Request;

    move-result-object v0

    return-object v0
.end method

.method final setBatchApplicationId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 170
    iput-object p1, p0, Lcom/facebook/RequestBatch;->batchApplicationId:Ljava/lang/String;

    .line 171
    return-void
.end method

.method final setCallbackHandler(Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lcom/facebook/RequestBatch;->callbackHandler:Landroid/os/Handler;

    .line 155
    return-void
.end method

.method public setTimeout(I)V
    .locals 2

    .prologue
    .line 84
    if-gez p1, :cond_0

    .line 85
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Argument timeoutInMilliseconds must be >= 0."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    :cond_0
    iput p1, p0, Lcom/facebook/RequestBatch;->timeoutInMilliseconds:I

    .line 88
    return-void
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/facebook/RequestBatch;->requests:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
