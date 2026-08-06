.class Lcom/facebook/ProgressOutputStream;
.super Ljava/io/FilterOutputStream;
.source "ProgressOutputStream.java"

# interfaces
.implements Lcom/facebook/RequestOutputStream;


# instance fields
.field private batchProgress:J

.field private currentRequestProgress:Lcom/facebook/RequestProgress;

.field private lastReportedProgress:J

.field private maxProgress:J

.field private final progressMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/Request;",
            "Lcom/facebook/RequestProgress;",
            ">;"
        }
    .end annotation
.end field

.field private final requests:Lcom/facebook/RequestBatch;

.field private final threshold:J


# direct methods
.method constructor <init>(Ljava/io/OutputStream;Lcom/facebook/RequestBatch;Ljava/util/Map;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/OutputStream;",
            "Lcom/facebook/RequestBatch;",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/Request;",
            "Lcom/facebook/RequestProgress;",
            ">;J)V"
        }
    .end annotation

    .prologue
    .line 35
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 36
    iput-object p2, p0, Lcom/facebook/ProgressOutputStream;->requests:Lcom/facebook/RequestBatch;

    .line 37
    iput-object p3, p0, Lcom/facebook/ProgressOutputStream;->progressMap:Ljava/util/Map;

    .line 38
    iput-wide p4, p0, Lcom/facebook/ProgressOutputStream;->maxProgress:J

    .line 40
    invoke-static {}, Lcom/facebook/Settings;->getOnProgressThreshold()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ProgressOutputStream;->threshold:J

    .line 41
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/ProgressOutputStream;)Lcom/facebook/RequestBatch;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->requests:Lcom/facebook/RequestBatch;

    return-object v0
.end method

.method static synthetic access$100(Lcom/facebook/ProgressOutputStream;)J
    .locals 2

    .prologue
    .line 26
    iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J

    return-wide v0
.end method

.method static synthetic access$200(Lcom/facebook/ProgressOutputStream;)J
    .locals 2

    .prologue
    .line 26
    iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->maxProgress:J

    return-wide v0
.end method

.method private addProgress(J)V
    .locals 7

    .prologue
    .line 44
    iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->currentRequestProgress:Lcom/facebook/RequestProgress;

    if-eqz v0, :cond_0

    .line 45
    iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->currentRequestProgress:Lcom/facebook/RequestProgress;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/RequestProgress;->addProgress(J)V

    .line 48
    :cond_0
    iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J

    .line 50
    iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J

    iget-wide v2, p0, Lcom/facebook/ProgressOutputStream;->lastReportedProgress:J

    iget-wide v4, p0, Lcom/facebook/ProgressOutputStream;->threshold:J

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J

    iget-wide v2, p0, Lcom/facebook/ProgressOutputStream;->maxProgress:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 51
    :cond_1
    invoke-direct {p0}, Lcom/facebook/ProgressOutputStream;->reportBatchProgress()V

    .line 53
    :cond_2
    return-void
.end method

.method private reportBatchProgress()V
    .locals 7

    .prologue
    .line 56
    iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J

    iget-wide v2, p0, Lcom/facebook/ProgressOutputStream;->lastReportedProgress:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 57
    iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->requests:Lcom/facebook/RequestBatch;

    invoke-virtual {v0}, Lcom/facebook/RequestBatch;->getCallbacks()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/RequestBatch$Callback;

    .line 58
    instance-of v1, v0, Lcom/facebook/RequestBatch$OnProgressCallback;

    if-eqz v1, :cond_0

    .line 59
    iget-object v1, p0, Lcom/facebook/ProgressOutputStream;->requests:Lcom/facebook/RequestBatch;

    invoke-virtual {v1}, Lcom/facebook/RequestBatch;->getCallbackHandler()Landroid/os/Handler;

    move-result-object v1

    .line 62
    check-cast v0, Lcom/facebook/RequestBatch$OnProgressCallback;

    .line 63
    if-nez v1, :cond_1

    .line 64
    iget-object v1, p0, Lcom/facebook/ProgressOutputStream;->requests:Lcom/facebook/RequestBatch;

    iget-wide v2, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J

    iget-wide v4, p0, Lcom/facebook/ProgressOutputStream;->maxProgress:J

    invoke-interface/range {v0 .. v5}, Lcom/facebook/RequestBatch$OnProgressCallback;->onBatchProgress(Lcom/facebook/RequestBatch;JJ)V

    goto :goto_0

    .line 67
    :cond_1
    new-instance v2, Lcom/facebook/ProgressOutputStream$1;

    invoke-direct {v2, p0, v0}, Lcom/facebook/ProgressOutputStream$1;-><init>(Lcom/facebook/ProgressOutputStream;Lcom/facebook/RequestBatch$OnProgressCallback;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 77
    :cond_2
    iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J

    iput-wide v0, p0, Lcom/facebook/ProgressOutputStream;->lastReportedProgress:J

    .line 79
    :cond_3
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 113
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V

    .line 115
    iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->progressMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/RequestProgress;

    .line 116
    invoke-virtual {v0}, Lcom/facebook/RequestProgress;->reportProgress()V

    goto :goto_0

    .line 119
    :cond_0
    invoke-direct {p0}, Lcom/facebook/ProgressOutputStream;->reportBatchProgress()V

    .line 120
    return-void
.end method

.method getBatchProgress()J
    .locals 2

    .prologue
    .line 86
    iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->batchProgress:J

    return-wide v0
.end method

.method getMaxProgress()J
    .locals 2

    .prologue
    .line 90
    iget-wide v0, p0, Lcom/facebook/ProgressOutputStream;->maxProgress:J

    return-wide v0
.end method

.method public setCurrentRequest(Lcom/facebook/Request;)V
    .locals 1

    .prologue
    .line 82
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->progressMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/RequestProgress;

    :goto_0
    iput-object v0, p0, Lcom/facebook/ProgressOutputStream;->currentRequestProgress:Lcom/facebook/RequestProgress;

    .line 83
    return-void

    .line 82
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public write(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 107
    iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 108
    const-wide/16 v0, 0x1

    invoke-direct {p0, v0, v1}, Lcom/facebook/ProgressOutputStream;->addProgress(J)V

    .line 109
    return-void
.end method

.method public write([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 95
    iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 96
    array-length v0, p1

    int-to-long v0, v0

    invoke-direct {p0, v0, v1}, Lcom/facebook/ProgressOutputStream;->addProgress(J)V

    .line 97
    return-void
.end method

.method public write([BII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 101
    iget-object v0, p0, Lcom/facebook/ProgressOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 102
    int-to-long v0, p3

    invoke-direct {p0, v0, v1}, Lcom/facebook/ProgressOutputStream;->addProgress(J)V

    .line 103
    return-void
.end method
