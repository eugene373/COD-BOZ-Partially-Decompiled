.class Lcom/google/android/gms/internal/ld$2;
.super Lcom/google/android/gms/internal/kk$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ld;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/kk$a",
        "<",
        "Lcom/google/android/gms/fitness/result/SessionStopResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic TZ:Lcom/google/android/gms/internal/ld;

.field final synthetic Ua:Ljava/lang/String;

.field final synthetic val$name:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ld;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ld$2;->TZ:Lcom/google/android/gms/internal/ld;

    iput-object p2, p0, Lcom/google/android/gms/internal/ld$2;->val$name:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ld$2;->Ua:Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/internal/kk$a;-><init>()V

    return-void
.end method


# virtual methods
.method protected B(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/SessionStopResult;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/fitness/result/SessionStopResult;->I(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/SessionStopResult;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/kk;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ld$2;->a(Lcom/google/android/gms/internal/kk;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/kk;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ld$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ld$b;-><init>(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/internal/ld$1;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/kk;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lcom/google/android/gms/internal/kk;->jb()Lcom/google/android/gms/internal/kp;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/fitness/request/y$a;

    invoke-direct {v3}, Lcom/google/android/gms/fitness/request/y$a;-><init>()V

    iget-object v4, p0, Lcom/google/android/gms/internal/ld$2;->val$name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/fitness/request/y$a;->bu(Ljava/lang/String;)Lcom/google/android/gms/fitness/request/y$a;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/ld$2;->Ua:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/fitness/request/y$a;->bv(Ljava/lang/String;)Lcom/google/android/gms/fitness/request/y$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/fitness/request/y$a;->jB()Lcom/google/android/gms/fitness/request/y;

    move-result-object v3

    invoke-interface {v2, v3, v0, v1}, Lcom/google/android/gms/internal/kp;->a(Lcom/google/android/gms/fitness/request/y;Lcom/google/android/gms/internal/ks;Ljava/lang/String;)V

    return-void
.end method

.method protected synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ld$2;->B(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/fitness/result/SessionStopResult;

    move-result-object v0

    return-object v0
.end method
