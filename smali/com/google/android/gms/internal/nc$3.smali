.class Lcom/google/android/gms/internal/nc$3;
.super Lcom/google/android/gms/internal/nc$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/nc;->loadPanoramaInfoAndGrantAccess(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic akA:Lcom/google/android/gms/internal/nc;

.field final synthetic aky:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/nc;Landroid/net/Uri;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/nc$3;->akA:Lcom/google/android/gms/internal/nc;

    iput-object p2, p0, Lcom/google/android/gms/internal/nc$3;->aky:Landroid/net/Uri;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/nc$b;-><init>(Lcom/google/android/gms/internal/nc$1;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/content/Context;Lcom/google/android/gms/internal/nb;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/nc$c;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/nc$c;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/nc$3;->aky:Landroid/net/Uri;

    const/4 v2, 0x0

    invoke-static {p1, p2, v0, v1, v2}, Lcom/google/android/gms/internal/nc;->b(Landroid/content/Context;Lcom/google/android/gms/internal/nb;Lcom/google/android/gms/internal/na;Landroid/net/Uri;Landroid/os/Bundle;)V

    return-void
.end method
