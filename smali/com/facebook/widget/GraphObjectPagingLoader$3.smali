.class Lcom/facebook/widget/GraphObjectPagingLoader$3;
.super Ljava/lang/Object;
.source "GraphObjectPagingLoader.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/widget/GraphObjectPagingLoader;->startLoading(Lcom/facebook/Request;ZJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/widget/GraphObjectPagingLoader;

.field final synthetic val$batch:Lcom/facebook/RequestBatch;


# direct methods
.method constructor <init>(Lcom/facebook/widget/GraphObjectPagingLoader;Lcom/facebook/RequestBatch;)V
    .locals 0

    .prologue
    .line 142
    iput-object p1, p0, Lcom/facebook/widget/GraphObjectPagingLoader$3;->this$0:Lcom/facebook/widget/GraphObjectPagingLoader;

    iput-object p2, p0, Lcom/facebook/widget/GraphObjectPagingLoader$3;->val$batch:Lcom/facebook/RequestBatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/facebook/widget/GraphObjectPagingLoader$3;->val$batch:Lcom/facebook/RequestBatch;

    invoke-static {v0}, Lcom/facebook/Request;->executeBatchAsync(Lcom/facebook/RequestBatch;)Lcom/facebook/RequestAsyncTask;

    .line 146
    return-void
.end method
