.class Lcom/google/android/gms/drive/internal/o$m;
.super Lcom/google/android/gms/drive/internal/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "m"
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/p$a;-><init>()V

    new-instance v1, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;

    sget-object v0, Lcom/google/android/gms/drive/Drive;->CU:Lcom/google/android/gms/common/api/Api$c;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/internal/q;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/internal/q;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/drive/internal/o$m;->a(Lcom/google/android/gms/common/api/BaseImplementation$CallbackHandler;)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/drive/internal/o$m;->b(Lcom/google/android/gms/common/api/Result;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/internal/o$m;->a(Lcom/google/android/gms/drive/internal/q;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/drive/internal/q;)V
    .locals 0

    return-void
.end method
