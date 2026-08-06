.class Lcom/google/android/gms/drive/internal/r$3;
.super Lcom/google/android/gms/drive/internal/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/r;->discard(Lcom/google/android/gms/common/api/GoogleApiClient;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic OL:Lcom/google/android/gms/drive/internal/r;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/r;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/r$3;->OL:Lcom/google/android/gms/drive/internal/r;

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/r$3;->a(Lcom/google/android/gms/drive/internal/q;)V

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

    new-instance v1, Lcom/google/android/gms/drive/internal/CloseContentsRequest;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/r$3;->OL:Lcom/google/android/gms/drive/internal/r;

    invoke-static {v2}, Lcom/google/android/gms/drive/internal/r;->a(Lcom/google/android/gms/drive/internal/r;)Lcom/google/android/gms/drive/Contents;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/CloseContentsRequest;-><init>(Lcom/google/android/gms/drive/Contents;Z)V

    new-instance v2, Lcom/google/android/gms/drive/internal/bb;

    invoke-direct {v2, p0}, Lcom/google/android/gms/drive/internal/bb;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/drive/internal/ab;->a(Lcom/google/android/gms/drive/internal/CloseContentsRequest;Lcom/google/android/gms/drive/internal/ac;)V

    return-void
.end method
