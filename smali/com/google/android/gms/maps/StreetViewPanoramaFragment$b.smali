.class Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;
.super Lcom/google/android/gms/dynamic/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/maps/StreetViewPanoramaFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/dynamic/a",
        "<",
        "Lcom/google/android/gms/maps/StreetViewPanoramaFragment$a;",
        ">;"
    }
.end annotation


# instance fields
.field private final Sj:Landroid/app/Fragment;

.field protected aiT:Lcom/google/android/gms/dynamic/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/dynamic/f",
            "<",
            "Lcom/google/android/gms/maps/StreetViewPanoramaFragment$a;",
            ">;"
        }
    .end annotation
.end field

.field private nr:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/app/Fragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/dynamic/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->Sj:Landroid/app/Fragment;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->setActivity(Landroid/app/Activity;)V

    return-void
.end method

.method private setActivity(Landroid/app/Activity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->nr:Landroid/app/Activity;

    invoke-virtual {p0}, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->mA()V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/dynamic/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/dynamic/f",
            "<",
            "Lcom/google/android/gms/maps/StreetViewPanoramaFragment$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->aiT:Lcom/google/android/gms/dynamic/f;

    invoke-virtual {p0}, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->mA()V

    return-void
.end method

.method public mA()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->nr:Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->aiT:Lcom/google/android/gms/dynamic/f;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;

    move-result-object v0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->nr:Landroid/app/Activity;

    invoke-static {v0}, Lcom/google/android/gms/maps/MapsInitializer;->initialize(Landroid/content/Context;)I

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->nr:Landroid/app/Activity;

    invoke-static {v0}, Lcom/google/android/gms/maps/internal/u;->S(Landroid/content/Context;)Lcom/google/android/gms/maps/internal/c;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->nr:Landroid/app/Activity;

    invoke-static {v1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/internal/c;->k(Lcom/google/android/gms/dynamic/d;)Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->aiT:Lcom/google/android/gms/dynamic/f;

    new-instance v2, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$a;

    iget-object v3, p0, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$b;->Sj:Landroid/app/Fragment;

    invoke-direct {v2, v3, v0}, Lcom/google/android/gms/maps/StreetViewPanoramaFragment$a;-><init>(Landroid/app/Fragment;Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/dynamic/f;->a(Lcom/google/android/gms/dynamic/LifecycleDelegate;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v1

    :catch_1
    move-exception v0

    goto :goto_0
.end method
