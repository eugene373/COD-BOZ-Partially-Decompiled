.class public final Lcom/google/android/gms/internal/bh;
.super Ljava/lang/Object;


# instance fields
.field private nR:Lcom/google/android/gms/ads/AdListener;

.field private oA:Ljava/lang/String;

.field private oB:Landroid/view/ViewGroup;

.field private oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

.field private oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;

.field private oE:Lcom/google/android/gms/ads/doubleclick/b;

.field private oi:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

.field private oj:[Lcom/google/android/gms/ads/AdSize;

.field private ok:Ljava/lang/String;

.field private final ox:Lcom/google/android/gms/internal/cs;

.field private final oy:Lcom/google/android/gms/internal/ax;

.field private oz:Lcom/google/android/gms/internal/bd;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {}, Lcom/google/android/gms/internal/ax;->bb()Lcom/google/android/gms/internal/ax;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/internal/bh;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/ax;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;Z)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ax;->bb()Lcom/google/android/gms/internal/ax;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/gms/internal/bh;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/ax;)V

    return-void
.end method

.method constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/ax;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/bh;-><init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/ax;Lcom/google/android/gms/internal/bd;)V

    return-void
.end method

.method constructor <init>(Landroid/view/ViewGroup;Landroid/util/AttributeSet;ZLcom/google/android/gms/internal/ax;Lcom/google/android/gms/internal/bd;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/cs;

    invoke-direct {v0}, Lcom/google/android/gms/internal/cs;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/bh;->ox:Lcom/google/android/gms/internal/cs;

    iput-object p1, p0, Lcom/google/android/gms/internal/bh;->oB:Landroid/view/ViewGroup;

    iput-object p4, p0, Lcom/google/android/gms/internal/bh;->oy:Lcom/google/android/gms/internal/ax;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/bb;

    invoke-direct {v0, v1, p2}, Lcom/google/android/gms/internal/bb;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/bb;->f(Z)[Lcom/google/android/gms/ads/AdSize;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/bb;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/bh;->ok:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ay;

    iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ay;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdSize;)V

    const-string v1, "Ads by Google"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/gr;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ay;Ljava/lang/String;)V

    :goto_0
    return-void

    :catch_0
    move-exception v0

    new-instance v2, Lcom/google/android/gms/internal/ay;

    sget-object v3, Lcom/google/android/gms/ads/AdSize;->BANNER:Lcom/google/android/gms/ads/AdSize;

    invoke-direct {v2, v1, v3}, Lcom/google/android/gms/internal/ay;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdSize;)V

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v2, v1, v0}, Lcom/google/android/gms/internal/gr;->a(Landroid/view/ViewGroup;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iput-object p5, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    goto :goto_0
.end method

.method private bh()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->X()Lcom/google/android/gms/dynamic/d;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oB:Landroid/view/ViewGroup;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->f(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get an ad frame."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private bi()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->ok:Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad size and ad unit ID must be set before loadAd is called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oB:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ay;

    iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ay;-><init>(Landroid/content/Context;[Lcom/google/android/gms/ads/AdSize;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/bh;->ok:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/bh;->ox:Lcom/google/android/gms/internal/cs;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/au;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ay;Ljava/lang/String;Lcom/google/android/gms/internal/cs;)Lcom/google/android/gms/internal/bd;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->nR:Lcom/google/android/gms/ads/AdListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    new-instance v1, Lcom/google/android/gms/internal/at;

    iget-object v2, p0, Lcom/google/android/gms/internal/bh;->nR:Lcom/google/android/gms/ads/AdListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/at;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/bc;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oi:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    new-instance v1, Lcom/google/android/gms/internal/ba;

    iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oi:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ba;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/bf;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    new-instance v1, Lcom/google/android/gms/internal/em;

    iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/em;-><init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/eh;)V

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    new-instance v1, Lcom/google/android/gms/internal/eq;

    iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/eq;-><init>(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oA:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/el;Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oE:Lcom/google/android/gms/ads/doubleclick/b;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    new-instance v2, Lcom/google/android/gms/internal/ew;

    iget-object v3, p0, Lcom/google/android/gms/internal/bh;->oE:Lcom/google/android/gms/ads/doubleclick/b;

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oB:Landroid/view/ViewGroup;

    check-cast v0, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    invoke-direct {v2, v3, v0}, Lcom/google/android/gms/internal/ew;-><init>(Lcom/google/android/gms/ads/doubleclick/b;Lcom/google/android/gms/ads/doubleclick/PublisherAdView;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/et;)V

    :cond_6
    invoke-direct {p0}, Lcom/google/android/gms/internal/bh;->bh()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/bg;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/bh;->bi()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oy:Lcom/google/android/gms/internal/ax;

    iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oB:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ax;->a(Landroid/content/Context;Lcom/google/android/gms/internal/bg;)Lcom/google/android/gms/internal/av;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/av;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->ox:Lcom/google/android/gms/internal/cs;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/bg;->be()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/cs;->d(Ljava/util/Map;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to load ad."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public varargs a([Lcom/google/android/gms/ads/AdSize;)V
    .locals 4

    iput-object p1, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    new-instance v1, Lcom/google/android/gms/internal/ay;

    iget-object v2, p0, Lcom/google/android/gms/internal/bh;->oB:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ay;-><init>(Landroid/content/Context;[Lcom/google/android/gms/ads/AdSize;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/ay;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oB:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the ad size."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public destroy()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->destroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to destroy AdView."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public getAdListener()Lcom/google/android/gms/ads/AdListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->nR:Lcom/google/android/gms/ads/AdListener;

    return-object v0
.end method

.method public getAdSize()Lcom/google/android/gms/ads/AdSize;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->Y()Lcom/google/android/gms/internal/ay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ay;->bc()Lcom/google/android/gms/ads/AdSize;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get the current AdSize."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getAdSizes()[Lcom/google/android/gms/ads/AdSize;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->ok:Ljava/lang/String;

    return-object v0
.end method

.method public getAppEventListener()Lcom/google/android/gms/ads/doubleclick/AppEventListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oi:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    return-object v0
.end method

.method public getInAppPurchaseListener()Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    return-object v0
.end method

.method public getMediationAdapterClassName()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->getMediationAdapterClassName()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to get the mediation adapter class name."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public pause()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->pause()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to call pause."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public recordManualImpression()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->aj()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to record impression."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public resume()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bd;->resume()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Failed to call resume."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public setAdListener(Lcom/google/android/gms/ads/AdListener;)V
    .locals 2
    .param p1, "adListener"    # Lcom/google/android/gms/ads/AdListener;

    .prologue
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/bh;->nR:Lcom/google/android/gms/ads/AdListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/at;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/at;-><init>(Lcom/google/android/gms/ads/AdListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/bc;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AdListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public varargs setAdSizes([Lcom/google/android/gms/ads/AdSize;)V
    .locals 2
    .param p1, "adSizes"    # [Lcom/google/android/gms/ads/AdSize;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oj:[Lcom/google/android/gms/ads/AdSize;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad size can only be set once on AdView."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/bh;->a([Lcom/google/android/gms/ads/AdSize;)V

    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 2
    .param p1, "adUnitId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->ok:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The ad unit ID can only be set once on AdView."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/bh;->ok:Ljava/lang/String;

    return-void
.end method

.method public setAppEventListener(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V
    .locals 2
    .param p1, "appEventListener"    # Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    .prologue
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/bh;->oi:Lcom/google/android/gms/ads/doubleclick/AppEventListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ba;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ba;-><init>(Lcom/google/android/gms/ads/doubleclick/AppEventListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/bf;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_1
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the AppEventListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public setInAppPurchaseListener(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    .locals 2
    .param p1, "inAppPurchaseListener"    # Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Play store purchase parameter has already been set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/bh;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/em;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/em;-><init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/eh;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the InAppPurchaseListener."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public setPlayStorePurchaseParams(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;Ljava/lang/String;)V
    .locals 2
    .param p1, "playStorePurchaseListener"    # Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;
    .param p2, "publicKey"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oC:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "InAppPurchaseListener has already been set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/bh;->oD:Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;

    iput-object p2, p0, Lcom/google/android/gms/internal/bh;->oA:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/bh;->oz:Lcom/google/android/gms/internal/bd;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/eq;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/eq;-><init>(Lcom/google/android/gms/ads/purchase/PlayStorePurchaseListener;)V

    :goto_0
    invoke-interface {v1, v0, p2}, Lcom/google/android/gms/internal/bd;->a(Lcom/google/android/gms/internal/el;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to set the play store purchase parameter."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/gs;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method
