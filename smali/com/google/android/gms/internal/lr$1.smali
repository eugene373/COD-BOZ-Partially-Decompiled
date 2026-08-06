.class Lcom/google/android/gms/internal/lr$1;
.super Lcom/google/android/gms/internal/lr$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/lr;->requestActivityUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;JLandroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aeB:J

.field final synthetic aeC:Landroid/app/PendingIntent;

.field final synthetic aeD:Lcom/google/android/gms/internal/lr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/lr;JLandroid/app/PendingIntent;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/lr$1;->aeD:Lcom/google/android/gms/internal/lr;

    iput-wide p2, p0, Lcom/google/android/gms/internal/lr$1;->aeB:J

    iput-object p4, p0, Lcom/google/android/gms/internal/lr$1;->aeC:Landroid/app/PendingIntent;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/lr$a;-><init>(Lcom/google/android/gms/internal/lr$1;)V

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

    check-cast p1, Lcom/google/android/gms/internal/lz;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lr$1;->a(Lcom/google/android/gms/internal/lz;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/lz;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-wide v0, p0, Lcom/google/android/gms/internal/lr$1;->aeB:J

    iget-object v2, p0, Lcom/google/android/gms/internal/lr$1;->aeC:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/lz;->requestActivityUpdates(JLandroid/app/PendingIntent;)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/lr$1;->b(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
