.class Lcom/google/android/gms/internal/ld$6;
.super Lcom/google/android/gms/internal/kk$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ld;->unregisterForSessions(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic TZ:Lcom/google/android/gms/internal/ld;

.field final synthetic Ud:Landroid/app/PendingIntent;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ld;Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ld$6;->TZ:Lcom/google/android/gms/internal/ld;

    iput-object p2, p0, Lcom/google/android/gms/internal/ld$6;->Ud:Landroid/app/PendingIntent;

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ld$6;->a(Lcom/google/android/gms/internal/kk;)V

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

    new-instance v1, Lcom/google/android/gms/fitness/request/aa;

    iget-object v2, p0, Lcom/google/android/gms/internal/ld$6;->Ud:Landroid/app/PendingIntent;

    invoke-direct {v1, v2}, Lcom/google/android/gms/fitness/request/aa;-><init>(Landroid/app/PendingIntent;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/kk;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lcom/google/android/gms/internal/kk;->jb()Lcom/google/android/gms/internal/kp;

    move-result-object v3

    invoke-interface {v3, v1, v0, v2}, Lcom/google/android/gms/internal/kp;->a(Lcom/google/android/gms/fitness/request/aa;Lcom/google/android/gms/internal/kt;Ljava/lang/String;)V

    return-void
.end method
