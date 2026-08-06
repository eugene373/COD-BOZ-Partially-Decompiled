.class Lcom/google/android/gms/internal/lb$2;
.super Lcom/google/android/gms/internal/kk$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/lb;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/af;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic TO:Lcom/google/android/gms/internal/lb;

.field final synthetic TP:Lcom/google/android/gms/fitness/request/af;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/lb;Lcom/google/android/gms/fitness/request/af;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/lb$2;->TO:Lcom/google/android/gms/internal/lb;

    iput-object p2, p0, Lcom/google/android/gms/internal/lb$2;->TP:Lcom/google/android/gms/fitness/request/af;

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lb$2;->a(Lcom/google/android/gms/internal/kk;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/kk;)V
    .locals 4
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

    iget-object v3, p0, Lcom/google/android/gms/internal/lb$2;->TP:Lcom/google/android/gms/fitness/request/af;

    invoke-interface {v2, v3, v0, v1}, Lcom/google/android/gms/internal/kp;->a(Lcom/google/android/gms/fitness/request/af;Lcom/google/android/gms/internal/kt;Ljava/lang/String;)V

    return-void
.end method
