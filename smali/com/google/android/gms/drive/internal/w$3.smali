.class Lcom/google/android/gms/drive/internal/w$3;
.super Lcom/google/android/gms/drive/internal/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/w;->setParents(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/util/Set;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Pb:Lcom/google/android/gms/drive/internal/w;

.field final synthetic Pc:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/w;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/w$3;->Pb:Lcom/google/android/gms/drive/internal/w;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/w$3;->Pc:Ljava/util/List;

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/w$3;->a(Lcom/google/android/gms/drive/internal/q;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/q;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/q;->hY()Lcom/google/android/gms/drive/internal/ab;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/w$3;->Pb:Lcom/google/android/gms/drive/internal/w;

    iget-object v2, v2, Lcom/google/android/gms/drive/internal/w;->MW:Lcom/google/android/gms/drive/DriveId;

    iget-object v3, p0, Lcom/google/android/gms/drive/internal/w$3;->Pc:Ljava/util/List;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;-><init>(Lcom/google/android/gms/drive/DriveId;Ljava/util/List;)V

    new-instance v2, Lcom/google/android/gms/drive/internal/bb;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/bb;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/ab;->a(Lcom/google/android/gms/drive/internal/SetResourceParentsRequest;Lcom/google/android/gms/drive/internal/ac;)V

    return-void
.end method
