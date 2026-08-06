.class public Lcom/google/android/gms/maps/StreetViewPanoramaView;
.super Landroid/widget/FrameLayout;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/maps/StreetViewPanoramaView$a;,
        Lcom/google/android/gms/maps/StreetViewPanoramaView$b;
    }
.end annotation


# instance fields
.field private ajh:Lcom/google/android/gms/maps/StreetViewPanorama;

.field private final ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "options"    # Lcom/google/android/gms/maps/StreetViewPanoramaOptions;

    .prologue
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/StreetViewPanoramaOptions;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    return-void
.end method


# virtual methods
.method public final getStreetViewPanorama()Lcom/google/android/gms/maps/StreetViewPanorama;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajh:Lcom/google/android/gms/maps/StreetViewPanorama;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajh:Lcom/google/android/gms/maps/StreetViewPanorama;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->mA()V

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    :try_start_0
    new-instance v1, Lcom/google/android/gms/maps/StreetViewPanorama;

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$b;->mH()Lcom/google/android/gms/maps/internal/IStreetViewPanoramaViewDelegate;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaViewDelegate;->getStreetViewPanorama()Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/StreetViewPanorama;-><init>(Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;)V

    iput-object v1, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajh:Lcom/google/android/gms/maps/StreetViewPanorama;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajh:Lcom/google/android/gms/maps/StreetViewPanorama;

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    invoke-static {p0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->b(Landroid/widget/FrameLayout;)V

    :cond_0
    return-void
.end method

.method public final onDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->onDestroy()V

    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->onLowMemory()V

    return-void
.end method

.method public final onPause()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->onResume()V

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "outState"    # Landroid/os/Bundle;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/maps/StreetViewPanoramaView;->ajq:Lcom/google/android/gms/maps/StreetViewPanoramaView$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/StreetViewPanoramaView$a;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method
