.class public final Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/search/SearchAdRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private final le:Lcom/google/android/gms/internal/bg$a;

.field private xl:I

.field private xm:I

.field private xn:I

.field private xo:I

.field private xp:I

.field private xq:I

.field private xr:I

.field private xs:I

.field private xt:Ljava/lang/String;

.field private xu:I

.field private xv:Ljava/lang/String;

.field private xw:I

.field private xx:I

.field private xy:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/bg$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/bg$a;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xr:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xl:I

    return v0
.end method

.method static synthetic b(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xm:I

    return v0
.end method

.method static synthetic c(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xn:I

    return v0
.end method

.method static synthetic d(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xo:I

    return v0
.end method

.method static synthetic e(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xp:I

    return v0
.end method

.method static synthetic f(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xq:I

    return v0
.end method

.method static synthetic g(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xr:I

    return v0
.end method

.method static synthetic h(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xs:I

    return v0
.end method

.method static synthetic i(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xt:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic j(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xu:I

    return v0
.end method

.method static synthetic k(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xv:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic l(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xw:I

    return v0
.end method

.method static synthetic m(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xx:I

    return v0
.end method

.method static synthetic n(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xy:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic o(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;)Lcom/google/android/gms/internal/bg$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;

    return-object v0
.end method


# virtual methods
.method public addCustomEventExtrasBundle(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p2, "customEventExtras"    # Landroid/os/Bundle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/ads/mediation/customevent/CustomEvent;",
            ">;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;"
        }
    .end annotation

    .prologue
    .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/android/gms/ads/mediation/customevent/CustomEvent;>;"
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/bg$a;->b(Ljava/lang/Class;Landroid/os/Bundle;)V

    return-object p0
.end method

.method public addNetworkExtras(Lcom/google/android/gms/ads/mediation/NetworkExtras;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p1, "networkExtras"    # Lcom/google/android/gms/ads/mediation/NetworkExtras;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->a(Lcom/google/android/gms/ads/mediation/NetworkExtras;)V

    return-object p0
.end method

.method public addNetworkExtrasBundle(Ljava/lang/Class;Landroid/os/Bundle;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p2, "networkExtras"    # Landroid/os/Bundle;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/ads/mediation/MediationAdapter;",
            ">;",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;"
        }
    .end annotation

    .prologue
    .local p1, "adapterClass":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/google/android/gms/ads/mediation/MediationAdapter;>;"
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/bg$a;->a(Ljava/lang/Class;Landroid/os/Bundle;)V

    return-object p0
.end method

.method public addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p1, "deviceId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->s(Ljava/lang/String;)V

    return-object p0
.end method

.method public build()Lcom/google/android/gms/ads/search/SearchAdRequest;
    .locals 2

    new-instance v0, Lcom/google/android/gms/ads/search/SearchAdRequest;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/search/SearchAdRequest;-><init>(Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;Lcom/google/android/gms/ads/search/SearchAdRequest$1;)V

    return-object v0
.end method

.method public setAnchorTextColor(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "anchorTextColor"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xl:I

    return-object p0
.end method

.method public setBackgroundColor(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 2
    .param p1, "backgroundColor"    # I

    .prologue
    const/4 v1, 0x0

    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xm:I

    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xn:I

    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xo:I

    return-object p0
.end method

.method public setBackgroundGradient(II)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p1, "top"    # I
    .param p2, "bottom"    # I

    .prologue
    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xm:I

    iput p2, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xn:I

    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xo:I

    return-object p0
.end method

.method public setBorderColor(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "borderColor"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xp:I

    return-object p0
.end method

.method public setBorderThickness(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "borderThickness"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xq:I

    return-object p0
.end method

.method public setBorderType(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "borderType"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xr:I

    return-object p0
.end method

.method public setCallButtonColor(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "callButtonColor"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xs:I

    return-object p0
.end method

.method public setCustomChannels(Ljava/lang/String;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "channelIds"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xt:Ljava/lang/String;

    return-object p0
.end method

.method public setDescriptionTextColor(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "descriptionTextColor"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xu:I

    return-object p0
.end method

.method public setFontFace(Ljava/lang/String;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "fontFace"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xv:Ljava/lang/String;

    return-object p0
.end method

.method public setHeaderTextColor(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "headerTextColor"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xw:I

    return-object p0
.end method

.method public setHeaderTextSize(I)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "headerTextSize"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xx:I

    return-object p0
.end method

.method public setLocation(Landroid/location/Location;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->a(Landroid/location/Location;)V

    return-object p0
.end method

.method public setQuery(Ljava/lang/String;)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 0
    .param p1, "query"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->xy:Ljava/lang/String;

    return-object p0
.end method

.method public tagForChildDirectedTreatment(Z)Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;
    .locals 1
    .param p1, "tagForChildDirectedTreatment"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/ads/search/SearchAdRequest$Builder;->le:Lcom/google/android/gms/internal/bg$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/bg$a;->h(Z)V

    return-object p0
.end method
