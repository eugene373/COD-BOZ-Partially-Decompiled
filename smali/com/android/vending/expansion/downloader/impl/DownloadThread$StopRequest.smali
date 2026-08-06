.class Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;
.super Ljava/lang/Throwable;
.source "DownloadThread.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/downloader/impl/DownloadThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "StopRequest"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x57f734754efdfa45L


# instance fields
.field public mFinalStatus:I

.field final synthetic this$0:Lcom/android/vending/expansion/downloader/impl/DownloadThread;


# direct methods
.method public constructor <init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloadThread;

    .line 127
    invoke-direct {p0, p3}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 128
    iput p2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;->mFinalStatus:I

    .line 129
    return-void
.end method

.method public constructor <init>(Lcom/android/vending/expansion/downloader/impl/DownloadThread;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;->this$0:Lcom/android/vending/expansion/downloader/impl/DownloadThread;

    .line 132
    invoke-direct {p0, p3, p4}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    iput p2, p0, Lcom/android/vending/expansion/downloader/impl/DownloadThread$StopRequest;->mFinalStatus:I

    .line 134
    return-void
.end method
