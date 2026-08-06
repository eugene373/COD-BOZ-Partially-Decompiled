.class Lcom/google/android/gms/maps/GoogleMap$6$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/maps/LocationSource$OnLocationChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/GoogleMap$6;->activate(Lcom/google/android/gms/maps/internal/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aiw:Lcom/google/android/gms/maps/internal/h;

.field final synthetic aix:Lcom/google/android/gms/maps/GoogleMap$6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/GoogleMap$6;Lcom/google/android/gms/maps/internal/h;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/GoogleMap$6$1;->aix:Lcom/google/android/gms/maps/GoogleMap$6;

    iput-object p2, p0, Lcom/google/android/gms/maps/GoogleMap$6$1;->aiw:Lcom/google/android/gms/maps/internal/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 2
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/GoogleMap$6$1;->aiw:Lcom/google/android/gms/maps/internal/h;

    invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/h;->l(Lcom/google/android/gms/dynamic/d;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method
