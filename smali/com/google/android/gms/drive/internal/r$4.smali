.class Lcom/google/android/gms/drive/internal/r$4;
.super Lcom/google/android/gms/drive/internal/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/r;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic OL:Lcom/google/android/gms/drive/internal/r;

.field final synthetic OM:Lcom/google/android/gms/drive/MetadataChangeSet;

.field final synthetic ON:Lcom/google/android/gms/drive/ExecutionOptions;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/r;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/ExecutionOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/r$4;->OL:Lcom/google/android/gms/drive/internal/r;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/r$4;->OM:Lcom/google/android/gms/drive/MetadataChangeSet;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/r$4;->ON:Lcom/google/android/gms/drive/ExecutionOptions;

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/p$a;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/drive/internal/q;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/r$4;->a(Lcom/google/android/gms/drive/internal/q;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/q;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/r$4;->OM:Lcom/google/android/gms/drive/MetadataChangeSet;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/MetadataChangeSet;->hS()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/q;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->setContext(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/q;->hY()Lcom/google/android/gms/drive/internal/ab;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/CloseContentsAndUpdateMetadataRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/r$4;->OL:Lcom/google/android/gms/drive/internal/r;

    invoke-static {v2}, Lcom/google/android/gms/drive/internal/r;->a(Lcom/google/android/gms/drive/internal/r;)Lcom/google/android/gms/drive/Contents;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/drive/Contents;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/drive/internal/r$4;->OM:Lcom/google/android/gms/drive/MetadataChangeSet;

    invoke-virtual {v3}, Lcom/google/android/gms/drive/MetadataChangeSet;->hS()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/drive/internal/r$4;->OL:Lcom/google/android/gms/drive/internal/r;

    invoke-static {v4}, Lcom/google/android/gms/drive/internal/r;->a(Lcom/google/android/gms/drive/internal/r;)Lcom/google/android/gms/drive/Contents;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/drive/internal/r$4;->ON:Lcom/google/android/gms/drive/ExecutionOptions;

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/drive/internal/CloseContentsAndUpdateMetadataRequest;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;Lcom/google/android/gms/drive/Contents;Lcom/google/android/gms/drive/ExecutionOptions;)V

    new-instance v2, Lcom/google/android/gms/drive/internal/bb;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/bb;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/ab;->a(Lcom/google/android/gms/drive/internal/CloseContentsAndUpdateMetadataRequest;Lcom/google/android/gms/drive/internal/ac;)V

    return-void
.end method
