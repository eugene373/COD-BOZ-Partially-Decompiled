.class Lcom/google/android/gms/wearable/internal/aj$4;
.super Lcom/google/android/gms/wearable/internal/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/aj;->removeListener(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/NodeApi$NodeListener;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/d",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic avJ:Lcom/google/android/gms/wearable/internal/aj;

.field final synthetic avK:Lcom/google/android/gms/wearable/NodeApi$NodeListener;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/aj;Lcom/google/android/gms/wearable/NodeApi$NodeListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/aj$4;->avJ:Lcom/google/android/gms/wearable/internal/aj;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/aj$4;->avK:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    invoke-direct {p0}, Lcom/google/android/gms/wearable/internal/d;-><init>()V

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

    check-cast p1, Lcom/google/android/gms/wearable/internal/aw;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/aj$4;->a(Lcom/google/android/gms/wearable/internal/aw;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/aw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/aj$4;->avK:Lcom/google/android/gms/wearable/NodeApi$NodeListener;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/wearable/internal/aw;->b(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/NodeApi$NodeListener;)V

    return-void
.end method

.method public synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/aj$4;->d(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    return-object v0
.end method
