.class public Lcom/google/android/gms/internal/oz;
.super Lcom/google/android/gms/dynamic/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/dynamic/g",
        "<",
        "Lcom/google/android/gms/internal/ou;",
        ">;"
    }
.end annotation


# static fields
.field private static aux:Lcom/google/android/gms/internal/oz;


# direct methods
.method protected constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl"

    invoke-direct {p0, v0}, Lcom/google/android/gms/dynamic/g;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/app/Activity;Lcom/google/android/gms/dynamic/c;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/internal/os;)Lcom/google/android/gms/internal/or;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;
        }
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;

    invoke-direct {v1, v0}, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;-><init>(I)V

    throw v1

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/oz;->pP()Lcom/google/android/gms/internal/oz;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/oz;->L(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ou;

    invoke-static {p0}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ou;->a(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/dynamic/c;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/internal/os;)Lcom/google/android/gms/internal/or;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/dynamic/g$a; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static pP()Lcom/google/android/gms/internal/oz;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/oz;->aux:Lcom/google/android/gms/internal/oz;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/oz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/oz;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/oz;->aux:Lcom/google/android/gms/internal/oz;

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/oz;->aux:Lcom/google/android/gms/internal/oz;

    return-object v0
.end method


# virtual methods
.method protected bQ(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ou;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/ou$a;->bM(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ou;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic d(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/oz;->bQ(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ou;

    move-result-object v0

    return-object v0
.end method
