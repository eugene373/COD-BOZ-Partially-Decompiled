.class public Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;
.super Landroid/support/v4/app/Fragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;,
        Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;
    }
.end annotation


# instance fields
.field private ajh:Lcom/google/android/gms/maps/StreetViewPanorama;

.field private final ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    new-instance v0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-direct {v0, p0}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;-><init>(Landroid/support/v4/app/Fragment;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    return-void
.end method

.method public static newInstance()Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;

    invoke-direct {v0}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;-><init>()V

    return-object v0
.end method

.method public static newInstance(Lcom/google/android/gms/maps/StreetViewPanoramaOptions;)Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;
    .locals 3
    .param p0, "options"    # Lcom/google/android/gms/maps/StreetViewPanoramaOptions;

    .prologue
    new-instance v0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;

    invoke-direct {v0}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "StreetViewPanoramaOptions"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public final getStreetViewPanorama()Lcom/google/android/gms/maps/StreetViewPanorama;
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->mD()Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    invoke-interface {v1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;->getStreetViewPanorama()Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajh:Lcom/google/android/gms/maps/StreetViewPanorama;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajh:Lcom/google/android/gms/maps/StreetViewPanorama;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/StreetViewPanorama;->mC()Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {v1}, Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    if-eq v0, v2, :cond_3

    :cond_2
    new-instance v0, Lcom/google/android/gms/maps/StreetViewPanorama;

    invoke-direct {v0, v1}, Lcom/google/android/gms/maps/StreetViewPanorama;-><init>(Lcom/google/android/gms/maps/internal/IStreetViewPanoramaDelegate;)V

    iput-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajh:Lcom/google/android/gms/maps/StreetViewPanorama;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajh:Lcom/google/android/gms/maps/StreetViewPanorama;

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/RuntimeRemoteException;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method protected mD()Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->mA()V

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->it()Lcom/google/android/gms/dynamic/LifecycleDelegate;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$a;->mD()Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;

    move-result-object v0

    goto :goto_0
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    if-eqz p1, :cond_0

    const-class v0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-static {v0, p1}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->a(Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;Landroid/app/Activity;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->onDestroy()V

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->onDestroyView()V

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    return-void
.end method

.method public onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-static {v0, p1}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->a(Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;Landroid/app/Activity;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-virtual {v1, p1, v0, p3}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->onInflate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/Bundle;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->onLowMemory()V

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onLowMemory()V

    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->onPause()V

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->onResume()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "outState"    # Landroid/os/Bundle;

    .prologue
    if-eqz p1, :cond_0

    const-class v0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;->ajv:Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment$b;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public setArguments(Landroid/os/Bundle;)V
    .locals 0
    .param p1, "args"    # Landroid/os/Bundle;

    .prologue
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-void
.end method
