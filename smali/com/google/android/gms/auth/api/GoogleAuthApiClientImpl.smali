.class public final Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;
.super Lcom/google/android/gms/common/internal/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/e",
        "<",
        "Lcom/google/android/gms/auth/api/IGoogleAuthService;",
        ">;"
    }
.end annotation


# static fields
.field public static final ACTION_START_SERVICE:Ljava/lang/String; = "com.google.android.gms.auth.service.START"

.field public static final SERVICE_DESCRIPTOR:Ljava/lang/String; = "com.google.android.gms.auth.api.IGoogleAuthService"


# instance fields
.field private final Dd:Ljava/lang/String;

.field private Ds:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "looper"    # Landroid/os/Looper;
    .param p3, "settings"    # Lcom/google/android/gms/common/internal/ClientSettings;
    .param p4, "connectedListener"    # Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
    .param p5, "connectionFailedListener"    # Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
    .param p6, "accountName"    # Ljava/lang/String;
    .param p7, "scopes"    # [Ljava/lang/String;

    .prologue
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    move-object v4, p5

    move-object v5, p7

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/common/internal/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    iput-object p6, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;->Dd:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;->Ds:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 8
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "settings"    # Lcom/google/android/gms/common/internal/ClientSettings;
    .param p3, "connectedListener"    # Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
    .param p4, "connectionFailedListener"    # Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
    .param p5, "accountName"    # Ljava/lang/String;
    .param p6, "scopes"    # [Ljava/lang/String;

    .prologue
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const v2, 0x5e2978

    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;->Dd:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;->gR()[Ljava/lang/String;

    move-result-object v5

    move-object v0, p1

    move-object v1, p2

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/common/internal/l;->b(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method protected createServiceInterface(Landroid/os/IBinder;)Lcom/google/android/gms/auth/api/IGoogleAuthService;
    .locals 1
    .param p1, "iBinder"    # Landroid/os/IBinder;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/auth/api/IGoogleAuthService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/auth/api/IGoogleAuthService;

    move-result-object v0

    return-object v0
.end method

.method public getAccountName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;->Dd:Ljava/lang/String;

    return-object v0
.end method

.method protected getServiceDescriptor()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.IGoogleAuthService"

    return-object v0
.end method

.method protected getStartServiceAction()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.service.START"

    return-object v0
.end method

.method protected synthetic j(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/api/GoogleAuthApiClientImpl;->createServiceInterface(Landroid/os/IBinder;)Lcom/google/android/gms/auth/api/IGoogleAuthService;

    move-result-object v0

    return-object v0
.end method
