.class Lcom/facebook/internal/ImageDownloader$DownloadImageWorkItem;
.super Ljava/lang/Object;
.source "ImageDownloader.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/ImageDownloader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DownloadImageWorkItem"
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private key:Lcom/facebook/internal/ImageDownloader$RequestKey;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/facebook/internal/ImageDownloader$RequestKey;)V
    .locals 0

    .prologue
    .line 355
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 356
    iput-object p1, p0, Lcom/facebook/internal/ImageDownloader$DownloadImageWorkItem;->context:Landroid/content/Context;

    .line 357
    iput-object p2, p0, Lcom/facebook/internal/ImageDownloader$DownloadImageWorkItem;->key:Lcom/facebook/internal/ImageDownloader$RequestKey;

    .line 358
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 362
    iget-object v0, p0, Lcom/facebook/internal/ImageDownloader$DownloadImageWorkItem;->key:Lcom/facebook/internal/ImageDownloader$RequestKey;

    iget-object v1, p0, Lcom/facebook/internal/ImageDownloader$DownloadImageWorkItem;->context:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/facebook/internal/ImageDownloader;->access$200(Lcom/facebook/internal/ImageDownloader$RequestKey;Landroid/content/Context;)V

    .line 363
    return-void
.end method
