.class Lcom/google/android/gms/wearable/internal/f$6;
.super Lcom/google/android/gms/wearable/internal/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/f;->getFdForAsset(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/Asset;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/wearable/internal/d",
        "<",
        "Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic avn:Lcom/google/android/gms/wearable/internal/f;

.field final synthetic avo:Lcom/google/android/gms/wearable/Asset;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/f;Lcom/google/android/gms/wearable/Asset;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/f$6;->avn:Lcom/google/android/gms/wearable/internal/f;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/f$6;->avo:Lcom/google/android/gms/wearable/Asset;

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/f$6;->a(Lcom/google/android/gms/wearable/internal/aw;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/wearable/internal/aw;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/f$6;->avo:Lcom/google/android/gms/wearable/Asset;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/wearable/internal/aw;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/wearable/Asset;)V

    return-void
.end method

.method protected aI(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;
    .locals 2

    new-instance v0, Lcom/google/android/gms/wearable/internal/f$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/wearable/internal/f$c;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/os/ParcelFileDescriptor;)V

    return-object v0
.end method

.method protected synthetic c(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Result;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/f$6;->aI(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/wearable/DataApi$GetFdForAssetResult;

    move-result-object v0

    return-object v0
.end method
