.class Lcom/google/android/gms/internal/lv$2;
.super Lcom/google/android/gms/internal/lv$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/lv;->removeGeofences(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aeL:Landroid/app/PendingIntent;

.field final synthetic aeM:Lcom/google/android/gms/internal/lv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/lv;Landroid/app/PendingIntent;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/lv$2;->aeM:Lcom/google/android/gms/internal/lv;

    iput-object p2, p0, Lcom/google/android/gms/internal/lv$2;->aeL:Landroid/app/PendingIntent;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/lv$a;-><init>(Lcom/google/android/gms/internal/lv$1;)V

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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lv$2;->a(Lcom/google/android/gms/internal/lz;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/lz;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/lv$2$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/lv$2$1;-><init>(Lcom/google/android/gms/internal/lv$2;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/lv$2;->aeL:Landroid/app/PendingIntent;

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/lz;->removeGeofences(Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;)V

    return-void
.end method
