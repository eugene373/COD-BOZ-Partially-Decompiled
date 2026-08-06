.class Lcom/google/android/gms/drive/internal/u$1;
.super Lcom/google/android/gms/drive/internal/u$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/u;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/Contents;ILcom/google/android/gms/drive/ExecutionOptions;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ON:Lcom/google/android/gms/drive/ExecutionOptions;

.field final synthetic OV:Lcom/google/android/gms/drive/MetadataChangeSet;

.field final synthetic OW:I

.field final synthetic OX:Lcom/google/android/gms/drive/internal/u;

.field final synthetic Ov:Lcom/google/android/gms/drive/Contents;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/u;Lcom/google/android/gms/drive/MetadataChangeSet;Lcom/google/android/gms/drive/Contents;ILcom/google/android/gms/drive/ExecutionOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/u$1;->OX:Lcom/google/android/gms/drive/internal/u;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/u$1;->OV:Lcom/google/android/gms/drive/MetadataChangeSet;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/u$1;->Ov:Lcom/google/android/gms/drive/Contents;

    iput p4, p0, Lcom/google/android/gms/drive/internal/u$1;->OW:I

    iput-object p5, p0, Lcom/google/android/gms/drive/internal/u$1;->ON:Lcom/google/android/gms/drive/ExecutionOptions;

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/u$d;-><init>()V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/u$1;->a(Lcom/google/android/gms/drive/internal/q;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/q;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/u$1;->OV:Lcom/google/android/gms/drive/MetadataChangeSet;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/MetadataChangeSet;->hS()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/q;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->setContext(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/u$1;->Ov:Lcom/google/android/gms/drive/Contents;

    if-nez v0, :cond_0

    const/4 v3, 0x0

    :goto_0
    new-instance v0, Lcom/google/android/gms/drive/internal/CreateFileRequest;

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/u$1;->OX:Lcom/google/android/gms/drive/internal/u;

    invoke-virtual {v1}, Lcom/google/android/gms/drive/internal/u;->getDriveId()Lcom/google/android/gms/drive/DriveId;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/u$1;->OV:Lcom/google/android/gms/drive/MetadataChangeSet;

    invoke-virtual {v2}, Lcom/google/android/gms/drive/MetadataChangeSet;->hS()Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v2

    iget v4, p0, Lcom/google/android/gms/drive/internal/u$1;->OW:I

    iget-object v5, p0, Lcom/google/android/gms/drive/internal/u$1;->ON:Lcom/google/android/gms/drive/ExecutionOptions;

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/drive/internal/CreateFileRequest;-><init>(Lcom/google/android/gms/drive/DriveId;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;IILcom/google/android/gms/drive/ExecutionOptions;)V

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/q;->hY()Lcom/google/android/gms/drive/internal/ab;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/drive/internal/u$a;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/u$a;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/drive/internal/ab;->a(Lcom/google/android/gms/drive/internal/CreateFileRequest;Lcom/google/android/gms/drive/internal/ac;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/drive/internal/u$1;->Ov:Lcom/google/android/gms/drive/Contents;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/Contents;->getRequestId()I

    move-result v3

    goto :goto_0
.end method
