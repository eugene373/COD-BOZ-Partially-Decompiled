.class public Lcom/google/android/gms/internal/lz;
.super Lcom/google/android/gms/common/internal/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/lz$1;,
        Lcom/google/android/gms/internal/lz$d;,
        Lcom/google/android/gms/internal/lz$a;,
        Lcom/google/android/gms/internal/lz$b;,
        Lcom/google/android/gms/internal/lz$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/e",
        "<",
        "Lcom/google/android/gms/internal/lx;",
        ">;"
    }
.end annotation


# instance fields
.field private final Dh:Lcom/google/android/gms/internal/me;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/me",
            "<",
            "Lcom/google/android/gms/internal/lx;",
            ">;"
        }
    .end annotation
.end field

.field private final aeW:Lcom/google/android/gms/internal/ly;

.field private final aeX:Lcom/google/android/gms/internal/mw;

.field private final aeY:Lcom/google/android/gms/internal/lp;

.field private final aeZ:Lcom/google/android/gms/internal/ie;

.field private final afa:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/lz;-><init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/lz;-><init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/4 v0, 0x0

    new-array v5, v0, [Ljava/lang/String;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/internal/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/lz$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/lz$c;-><init>(Lcom/google/android/gms/internal/lz;Lcom/google/android/gms/internal/lz$1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/lz;->Dh:Lcom/google/android/gms/internal/me;

    new-instance v0, Lcom/google/android/gms/internal/ly;

    iget-object v1, p0, Lcom/google/android/gms/internal/lz;->Dh:Lcom/google/android/gms/internal/me;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ly;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/me;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    iput-object p6, p0, Lcom/google/android/gms/internal/lz;->afa:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/mw;

    iget-object v1, p0, Lcom/google/android/gms/internal/lz;->Dh:Lcom/google/android/gms/internal/me;

    invoke-direct {v0, p3, v1, p7}, Lcom/google/android/gms/internal/mw;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/me;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/lz;->aeX:Lcom/google/android/gms/internal/mw;

    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->Dh:Lcom/google/android/gms/internal/me;

    invoke-static {p1, p7, p8, v0}, Lcom/google/android/gms/internal/lp;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/me;)Lcom/google/android/gms/internal/lp;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/lz;->aeY:Lcom/google/android/gms/internal/lp;

    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->Dh:Lcom/google/android/gms/internal/me;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ie;->a(Landroid/content/Context;Lcom/google/android/gms/internal/me;)Lcom/google/android/gms/internal/ie;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/lz;->aeZ:Lcom/google/android/gms/internal/ie;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;Ljava/lang/String;)V
    .locals 4

    const/4 v3, 0x0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/common/internal/e;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/GooglePlayServicesClient$ConnectionCallbacks;Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/lz$c;

    invoke-direct {v0, p0, v3}, Lcom/google/android/gms/internal/lz$c;-><init>(Lcom/google/android/gms/internal/lz;Lcom/google/android/gms/internal/lz$1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/lz;->Dh:Lcom/google/android/gms/internal/me;

    new-instance v0, Lcom/google/android/gms/internal/ly;

    iget-object v1, p0, Lcom/google/android/gms/internal/lz;->Dh:Lcom/google/android/gms/internal/me;

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ly;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/me;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    iput-object p4, p0, Lcom/google/android/gms/internal/lz;->afa:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/mw;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/lz;->Dh:Lcom/google/android/gms/internal/me;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/mw;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/me;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/lz;->aeX:Lcom/google/android/gms/internal/mw;

    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->Dh:Lcom/google/android/gms/internal/me;

    invoke-static {p1, v3, v3, v0}, Lcom/google/android/gms/internal/lp;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/me;)Lcom/google/android/gms/internal/lp;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/lz;->aeY:Lcom/google/android/gms/internal/lp;

    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->Dh:Lcom/google/android/gms/internal/me;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ie;->a(Landroid/content/Context;Lcom/google/android/gms/internal/me;)Lcom/google/android/gms/internal/ie;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/lz;->aeZ:Lcom/google/android/gms/internal/ie;

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/lz;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->dJ()V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "client_name"

    iget-object v2, p0, Lcom/google/android/gms/internal/lz;->afa:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const v1, 0x5e2978

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, p2, v1, v2, v0}, Lcom/google/android/gms/common/internal/l;->e(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ma;Lcom/google/android/gms/location/LocationListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/lz;->a(Lcom/google/android/gms/internal/ma;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ma;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ly;->a(Lcom/google/android/gms/internal/ma;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected aL(Landroid/os/IBinder;)Lcom/google/android/gms/internal/lx;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/lx$a;->aK(Landroid/os/IBinder;)Lcom/google/android/gms/internal/lx;

    move-result-object v0

    return-object v0
.end method

.method public addGeofences(Ljava/util/List;Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;)V
    .locals 3
    .param p2, "pendingIntent"    # Landroid/app/PendingIntent;
    .param p3, "listener"    # Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/mc;",
            ">;",
            "Landroid/app/PendingIntent;",
            "Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .local p1, "geofences":Ljava/util/List;, "Ljava/util/List<Lcom/google/android/gms/internal/mc;>;"
    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->dJ()V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "At least one geofence must be specified."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V

    const-string v0, "PendingIntent must be specified."

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "OnAddGeofencesResultListener not provided."

    invoke-static {p3, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p3, :cond_1

    const/4 v0, 0x0

    move-object v1, v0

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lx;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p1, p2, v1, v2}, Lcom/google/android/gms/internal/lx;->a(Ljava/util/List;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/lw;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/lz$b;

    invoke-direct {v0, p3, p0}, Lcom/google/android/gms/internal/lz$b;-><init>(Lcom/google/android/gms/location/LocationClient$OnAddGeofencesResultListener;Lcom/google/android/gms/internal/lz;)V

    move-object v1, v0

    goto :goto_1
.end method

.method public b(Lcom/google/android/gms/internal/ma;Landroid/app/PendingIntent;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ly;->b(Lcom/google/android/gms/internal/ma;Landroid/app/PendingIntent;)V

    return-void
.end method

.method public disconnect()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ly;->removeAllListeners()V

    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ly;->lY()V

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->disconnect()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getLastLocation()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ly;->getLastLocation()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method

.method protected getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    return-object v0
.end method

.method protected getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.location.internal.GoogleLocationManagerService.START"

    return-object v0
.end method

.method protected synthetic j(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lz;->aL(Landroid/os/IBinder;)Lcom/google/android/gms/internal/lx;

    move-result-object v0

    return-object v0
.end method

.method public removeActivityUpdates(Landroid/app/PendingIntent;)V
    .locals 1
    .param p1, "callbackIntent"    # Landroid/app/PendingIntent;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->dJ()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lx;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/lx;->removeActivityUpdates(Landroid/app/PendingIntent;)V

    return-void
.end method

.method public removeGeofences(Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;)V
    .locals 3
    .param p1, "pendingIntent"    # Landroid/app/PendingIntent;
    .param p2, "listener"    # Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->dJ()V

    const-string v0, "PendingIntent must be specified."

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "OnRemoveGeofencesResultListener not provided."

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_0

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lx;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/internal/lx;->a(Landroid/app/PendingIntent;Lcom/google/android/gms/internal/lw;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/lz$b;

    invoke-direct {v0, p2, p0}, Lcom/google/android/gms/internal/lz$b;-><init>(Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;Lcom/google/android/gms/internal/lz;)V

    move-object v1, v0

    goto :goto_0
.end method

.method public removeGeofences(Ljava/util/List;Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;)V
    .locals 4
    .param p2, "listener"    # Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .local p1, "geofenceRequestIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v1, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->dJ()V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v2, "geofenceRequestIds can\'t be null nor empty."

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V

    const-string v0, "OnRemoveGeofencesResultListener not provided."

    invoke-static {p2, v0}, Lcom/google/android/gms/common/internal/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-array v0, v1, [Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    if-nez p2, :cond_1

    const/4 v1, 0x0

    move-object v2, v1

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->gS()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/lx;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, Lcom/google/android/gms/internal/lx;->a([Ljava/lang/String;Lcom/google/android/gms/internal/lw;Ljava/lang/String;)V

    return-void

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/lz$b;

    invoke-direct {v1, p2, p0}, Lcom/google/android/gms/internal/lz$b;-><init>(Lcom/google/android/gms/location/LocationClient$OnRemoveGeofencesResultListener;Lcom/google/android/gms/internal/lz;)V

    move-object v2, v1

    goto :goto_1
.end method

.method public removeLocationUpdates(Landroid/app/PendingIntent;)V
    .locals 1
    .param p1, "callbackIntent"    # Landroid/app/PendingIntent;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ly;->removeLocationUpdates(Landroid/app/PendingIntent;)V

    return-void
.end method

.method public removeLocationUpdates(Lcom/google/android/gms/location/LocationListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/google/android/gms/location/LocationListener;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ly;->removeLocationUpdates(Lcom/google/android/gms/location/LocationListener;)V

    return-void
.end method

.method public requestActivityUpdates(JLandroid/app/PendingIntent;)V
    .locals 5
    .param p1, "detectionIntervalMillis"    # J
    .param p3, "callbackIntent"    # Landroid/app/PendingIntent;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->dJ()V

    invoke-static {p3}, Lcom/google/android/gms/common/internal/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v2, 0x0

    cmp-long v0, p1, v2

    if-ltz v0, :cond_0

    move v0, v1

    :goto_0
    const-string v2, "detectionIntervalMillis must be >= 0"

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lz;->gS()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lx;

    invoke-interface {v0, p1, p2, v1, p3}, Lcom/google/android/gms/internal/lx;->a(JZLandroid/app/PendingIntent;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V
    .locals 1
    .param p1, "request"    # Lcom/google/android/gms/location/LocationRequest;
    .param p2, "callbackIntent"    # Landroid/app/PendingIntent;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ly;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V

    return-void
.end method

.method public requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V
    .locals 2
    .param p1, "request"    # Lcom/google/android/gms/location/LocationRequest;
    .param p2, "listener"    # Lcom/google/android/gms/location/LocationListener;
    .param p3, "looper"    # Landroid/os/Looper;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    iget-object v1, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ly;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/LocationListener;Landroid/os/Looper;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public setMockLocation(Landroid/location/Location;)V
    .locals 1
    .param p1, "mockLocation"    # Landroid/location/Location;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ly;->setMockLocation(Landroid/location/Location;)V

    return-void
.end method

.method public setMockMode(Z)V
    .locals 1
    .param p1, "isMockMode"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/lz;->aeW:Lcom/google/android/gms/internal/ly;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ly;->setMockMode(Z)V

    return-void
.end method
