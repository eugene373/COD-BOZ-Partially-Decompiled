.class Lcom/google/android/gms/internal/lu$3;
.super Lcom/google/android/gms/internal/lu$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/lu;->requestLocationUpdates(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aeE:Lcom/google/android/gms/location/LocationRequest;

.field final synthetic aeF:Lcom/google/android/gms/location/LocationListener;

.field final synthetic aeG:Lcom/google/android/gms/internal/lu;

.field final synthetic aeI:Landroid/os/Looper;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/lu;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/lu$3;->aeG:Lcom/google/android/gms/internal/lu;

    iput-object p2, p0, Lcom/google/android/gms/internal/lu$3;->aeE:Lcom/google/android/gms/location/LocationRequest;

    iput-object p3, p0, Lcom/google/android/gms/internal/lu$3;->aeF:Lcom/google/android/gms/location/LocationListener;

    iput-object p4, p0, Lcom/google/android/gms/internal/lu$3;->aeI:Landroid/os/Looper;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/lu$a;-><init>(Lcom/google/android/gms/internal/lu$1;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lu$3;->a(Lcom/google/android/gms/internal/lz;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/lz;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/lu$3;->aeE:Lcom/google/android/gms/location/LocationRequest;

    iget-object v1, p0, Lcom/google/android/gms/internal/lu$3;->aeF:Lcom/google/android/gms/location/LocationListener;

    iget-object v2, p0, Lcom/google/android/gms/internal/lu$3;->aeI:Landroid/os/Looper;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/lz;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/lu$3;->b(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
