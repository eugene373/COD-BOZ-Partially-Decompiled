.class Lcom/google/android/gms/drive/internal/s$b;
.super Lcom/google/android/gms/drive/internal/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final De:Lcom/google/android/gms/common/api/BaseImplementation$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/drive/DriveApi$ContentsResult;",
            ">;"
        }
    .end annotation
.end field

.field private final OU:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/drive/DriveApi$ContentsResult;",
            ">;",
            "Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/c;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/s$b;->De:Lcom/google/android/gms/common/api/BaseImplementation$b;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/s$b;->OU:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/drive/internal/OnContentsResponse;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnContentsResponse;->ie()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/drive/internal/s$b;->De:Lcom/google/android/gms/common/api/BaseImplementation$b;

    new-instance v2, Lcom/google/android/gms/drive/internal/o$a;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnContentsResponse;->id()Lcom/google/android/gms/drive/Contents;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/drive/internal/o$a;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/Contents;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/s$b;->OU:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/s$b;->OU:Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;->if()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnDownloadProgressResponse;->ig()J

    move-result-wide v4

    invoke-interface {v0, v2, v3, v4, v5}, Lcom/google/android/gms/drive/DriveFile$DownloadProgressListener;->onProgress(JJ)V

    :cond_0
    return-void
.end method

.method public o(Lcom/google/android/gms/common/api/Status;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/s$b;->De:Lcom/google/android/gms/common/api/BaseImplementation$b;

    new-instance v1, Lcom/google/android/gms/drive/internal/o$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/drive/internal/o$a;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/Contents;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V

    return-void
.end method
