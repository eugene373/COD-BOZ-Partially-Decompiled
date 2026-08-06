.class Lcom/google/android/gms/internal/ns$1;
.super Lcom/google/android/gms/internal/ns$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ns;->load(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic alO:Lcom/google/android/gms/internal/ns;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ns;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ns$1;->alO:Lcom/google/android/gms/internal/ns;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ns$a;-><init>(Lcom/google/android/gms/internal/ns$1;)V

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

    check-cast p1, Lcom/google/android/gms/plus/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ns$1;->a(Lcom/google/android/gms/plus/internal/e;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/plus/internal/e;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/plus/internal/e;->k(Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    return-void
.end method
