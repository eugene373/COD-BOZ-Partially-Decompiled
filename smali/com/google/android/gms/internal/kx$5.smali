.class Lcom/google/android/gms/internal/kx$5;
.super Lcom/google/android/gms/internal/kk$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/kx;->unclaimBleDevice(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic TA:Lcom/google/android/gms/internal/kx;

.field final synthetic TC:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/kx;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/kx$5;->TA:Lcom/google/android/gms/internal/kx;

    iput-object p2, p0, Lcom/google/android/gms/internal/kx$5;->TC:Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/internal/kk$c;-><init>()V

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

    check-cast p1, Lcom/google/android/gms/internal/kk;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/kx$5;->a(Lcom/google/android/gms/internal/kk;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/kk;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/kk$b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/kk$b;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/kk;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lcom/google/android/gms/internal/kk;->jb()Lcom/google/android/gms/internal/kp;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/fitness/request/ah;

    iget-object v4, p0, Lcom/google/android/gms/internal/kx$5;->TC:Ljava/lang/String;

    invoke-direct {v3, v4}, Lcom/google/android/gms/fitness/request/ah;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v3, v0, v1}, Lcom/google/android/gms/internal/kp;->a(Lcom/google/android/gms/fitness/request/ah;Lcom/google/android/gms/internal/kt;Ljava/lang/String;)V

    return-void
.end method
