.class public Lcom/google/android/gms/internal/nc;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/panorama/PanoramaApi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/nc$c;,
        Lcom/google/android/gms/internal/nc$a;,
        Lcom/google/android/gms/internal/nc$b;,
        Lcom/google/android/gms/internal/nc$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->revokeUriPermission(Landroid/net/Uri;I)V

    return-void
.end method

.method private static a(Landroid/content/Context;Lcom/google/android/gms/internal/nb;Lcom/google/android/gms/internal/na;Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    const/4 v1, 0x1

    const-string v0, "com.google.android.gms"

    invoke-virtual {p0, v0, p3, v1}, Landroid/content/Context;->grantUriPermission(Ljava/lang/String;Landroid/net/Uri;I)V

    new-instance v0, Lcom/google/android/gms/internal/nc$4;

    invoke-direct {v0, p0, p3, p2}, Lcom/google/android/gms/internal/nc$4;-><init>(Landroid/content/Context;Landroid/net/Uri;Lcom/google/android/gms/internal/na;)V

    const/4 v1, 0x1

    :try_start_0
    invoke-interface {p1, v0, p3, p4, v1}, Lcom/google/android/gms/internal/nb;->a(Lcom/google/android/gms/internal/na;Landroid/net/Uri;Landroid/os/Bundle;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_0
    move-exception v0

    invoke-static {p0, p3}, Lcom/google/android/gms/internal/nc;->a(Landroid/content/Context;Landroid/net/Uri;)V

    throw v0

    :catch_1
    move-exception v0

    invoke-static {p0, p3}, Lcom/google/android/gms/internal/nc;->a(Landroid/content/Context;Landroid/net/Uri;)V

    throw v0
.end method

.method static synthetic b(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/nc;->a(Landroid/content/Context;Landroid/net/Uri;)V

    return-void
.end method

.method static synthetic b(Landroid/content/Context;Lcom/google/android/gms/internal/nb;Lcom/google/android/gms/internal/na;Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/nc;->a(Landroid/content/Context;Lcom/google/android/gms/internal/nb;Lcom/google/android/gms/internal/na;Landroid/net/Uri;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public loadPanoramaInfo(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "client"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "uri"    # Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Landroid/net/Uri;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/panorama/PanoramaApi$PanoramaResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/nc$2;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/nc$2;-><init>(Lcom/google/android/gms/internal/nc;Landroid/net/Uri;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;

    move-result-object v0

    return-object v0
.end method

.method public loadPanoramaInfoAndGrantAccess(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)Lcom/google/android/gms/common/api/PendingResult;
    .locals 1
    .param p1, "client"    # Lcom/google/android/gms/common/api/GoogleApiClient;
    .param p2, "uri"    # Landroid/net/Uri;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/GoogleApiClient;",
            "Landroid/net/Uri;",
            ")",
            "Lcom/google/android/gms/common/api/PendingResult",
            "<",
            "Lcom/google/android/gms/panorama/PanoramaApi$PanoramaResult;",
            ">;"
        }
    .end annotation

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/nc$3;

    invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/nc$3;-><init>(Lcom/google/android/gms/internal/nc;Landroid/net/Uri;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;

    move-result-object v0

    return-object v0
.end method
