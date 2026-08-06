.class public Lcom/ideaworks3d/marmalade/LoaderLocation;
.super Ljava/lang/Object;
.source "LoaderLocation.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;
    }
.end annotation


# instance fields
.field private m_GpsStatus:Landroid/location/GpsStatus;

.field private m_LocationListener:Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;

.field private m_LocationManager:Landroid/location/LocationManager;

.field private m_LocationUpdateDistance:I

.field private m_LocationUpdateInterval:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/16 v0, 0x1388

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationUpdateInterval:I

    .line 14
    const/4 v0, 0x2

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationUpdateDistance:I

    .line 17
    return-void
.end method

.method static synthetic access$000(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/LocationManager;
    .locals 1

    .prologue
    .line 8
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;

    return-object v0
.end method

.method static synthetic access$100(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/GpsStatus;
    .locals 1

    .prologue
    .line 8
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_GpsStatus:Landroid/location/GpsStatus;

    return-object v0
.end method

.method static synthetic access$102(Lcom/ideaworks3d/marmalade/LoaderLocation;Landroid/location/GpsStatus;)Landroid/location/GpsStatus;
    .locals 0

    .prologue
    .line 8
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_GpsStatus:Landroid/location/GpsStatus;

    return-object p1
.end method

.method static synthetic access$200(Lcom/ideaworks3d/marmalade/LoaderLocation;IJDDDFFF)V
    .locals 0

    .prologue
    .line 8
    invoke-direct/range {p0 .. p12}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationUpdate(IJDDDFFF)V

    return-void
.end method

.method static synthetic access$300(Lcom/ideaworks3d/marmalade/LoaderLocation;)Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;
    .locals 1

    .prologue
    .line 8
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationListener:Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;

    return-object v0
.end method

.method static synthetic access$302(Lcom/ideaworks3d/marmalade/LoaderLocation;Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;)Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;
    .locals 0

    .prologue
    .line 8
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationListener:Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;

    return-object p1
.end method

.method static synthetic access$400(Lcom/ideaworks3d/marmalade/LoaderLocation;)I
    .locals 1

    .prologue
    .line 8
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationUpdateInterval:I

    return v0
.end method

.method static synthetic access$500(Lcom/ideaworks3d/marmalade/LoaderLocation;)I
    .locals 1

    .prologue
    .line 8
    iget v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationUpdateDistance:I

    return v0
.end method

.method private native locationSatellite(IFFIFZ)V
.end method

.method private native locationUpdate(IJDDDFFF)V
.end method


# virtual methods
.method public locationGpsData()Z
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 94
    .line 95
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_GpsStatus:Landroid/location/GpsStatus;

    if-eqz v0, :cond_1

    .line 97
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_GpsStatus:Landroid/location/GpsStatus;

    invoke-virtual {v0}, Landroid/location/GpsStatus;->getSatellites()Ljava/lang/Iterable;

    move-result-object v0

    .line 98
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/GpsSatellite;

    .line 100
    invoke-virtual {v0}, Landroid/location/GpsSatellite;->getAzimuth()F

    move-result v2

    invoke-virtual {v0}, Landroid/location/GpsSatellite;->getElevation()F

    move-result v3

    invoke-virtual {v0}, Landroid/location/GpsSatellite;->getPrn()I

    move-result v4

    invoke-virtual {v0}, Landroid/location/GpsSatellite;->getSnr()F

    move-result v5

    invoke-virtual {v0}, Landroid/location/GpsSatellite;->usedInFix()Z

    move-result v6

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationSatellite(IFFIFZ)V

    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    goto :goto_0

    .line 103
    :cond_0
    const/4 v1, 0x1

    .line 105
    :cond_1
    return v1
.end method

.method public locationStart(Lcom/ideaworks3d/marmalade/LoaderActivity;)Z
    .locals 14

    .prologue
    const/4 v13, 0x1

    const/4 v1, 0x0

    .line 53
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;

    if-eqz v0, :cond_0

    move v0, v1

    .line 80
    :goto_0
    return v0

    .line 55
    :cond_0
    const-string v0, "location"

    invoke-virtual {p1, v0}, Lcom/ideaworks3d/marmalade/LoaderActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;

    .line 56
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;

    if-nez v0, :cond_1

    move v0, v1

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-array v0, v13, [I

    const/16 v2, 0x1388

    aput v2, v0, v1

    .line 59
    new-array v2, v13, [I

    const/4 v3, 0x2

    aput v3, v2, v1

    .line 60
    const-string v3, "s3e"

    const-string v4, "LocUpdateInterval"

    invoke-static {v3, v4, v0}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGetInt(Ljava/lang/String;Ljava/lang/String;[I)I

    move-result v3

    if-nez v3, :cond_2

    .line 61
    aget v0, v0, v1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationUpdateInterval:I

    .line 62
    :cond_2
    const-string v0, "s3e"

    const-string v3, "LocUpdateDistance"

    invoke-static {v0, v3, v2}, Lcom/ideaworks3d/marmalade/LoaderAPI;->s3eConfigGetInt(Ljava/lang/String;Ljava/lang/String;[I)I

    move-result v0

    if-nez v0, :cond_3

    .line 63
    aget v0, v2, v1

    iput v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationUpdateDistance:I

    .line 64
    :cond_3
    invoke-virtual {p1}, Lcom/ideaworks3d/marmalade/LoaderActivity;->LoaderThread()Lcom/ideaworks3d/marmalade/LoaderThread;

    move-result-object v0

    new-instance v1, Lcom/ideaworks3d/marmalade/LoaderLocation$1;

    invoke-direct {v1, p0}, Lcom/ideaworks3d/marmalade/LoaderLocation$1;-><init>(Lcom/ideaworks3d/marmalade/LoaderLocation;)V

    invoke-virtual {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderThread;->runOnOSThread(Ljava/lang/Runnable;)V

    .line 70
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v0

    .line 71
    if-nez v0, :cond_6

    .line 73
    const/4 v1, 0x3

    .line 74
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;

    const-string v2, "network"

    invoke-virtual {v0, v2}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v0

    .line 76
    :goto_1
    if-eqz v0, :cond_4

    .line 78
    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-virtual {v0}, Landroid/location/Location;->getAltitude()D

    move-result-wide v8

    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v10

    invoke-virtual {v0}, Landroid/location/Location;->hasBearing()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-virtual {v0}, Landroid/location/Location;->getBearing()F

    move-result v11

    :goto_2
    invoke-virtual {v0}, Landroid/location/Location;->getSpeed()F

    move-result v12

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/ideaworks3d/marmalade/LoaderLocation;->locationUpdate(IJDDDFFF)V

    :cond_4
    move v0, v13

    .line 80
    goto :goto_0

    .line 78
    :cond_5
    const/high16 v11, -0x40800000    # -1.0f

    goto :goto_2

    :cond_6
    move v1, v13

    goto :goto_1
.end method

.method public locationStop()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 84
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;

    if-nez v0, :cond_0

    .line 85
    const/4 v0, 0x0

    .line 90
    :goto_0
    return v0

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationListener:Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeGpsStatusListener(Landroid/location/GpsStatus$Listener;)V

    .line 87
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationListener:Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 88
    iput-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationListener:Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;

    .line 89
    iput-object v2, p0, Lcom/ideaworks3d/marmalade/LoaderLocation;->m_LocationManager:Landroid/location/LocationManager;

    .line 90
    const/4 v0, 0x1

    goto :goto_0
.end method
