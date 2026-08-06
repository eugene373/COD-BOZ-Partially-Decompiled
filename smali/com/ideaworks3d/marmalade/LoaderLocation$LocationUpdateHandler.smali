.class Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;
.super Ljava/lang/Object;
.source "LoaderLocation.java"

# interfaces
.implements Landroid/location/LocationListener;
.implements Landroid/location/GpsStatus$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ideaworks3d/marmalade/LoaderLocation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "LocationUpdateHandler"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;


# direct methods
.method constructor <init>(Lcom/ideaworks3d/marmalade/LoaderLocation;)V
    .locals 0

    .prologue
    .line 17
    iput-object p1, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGpsStatusChanged(I)V
    .locals 3

    .prologue
    .line 22
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$000(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/LocationManager;

    move-result-object v0

    if-nez v0, :cond_0

    .line 28
    :goto_0
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$100(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/GpsStatus;

    move-result-object v0

    if-nez v0, :cond_1

    .line 25
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$000(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/LocationManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->getGpsStatus(Landroid/location/GpsStatus;)Landroid/location/GpsStatus;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$102(Lcom/ideaworks3d/marmalade/LoaderLocation;Landroid/location/GpsStatus;)Landroid/location/GpsStatus;

    goto :goto_0

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-static {v0}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$000(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/LocationManager;

    move-result-object v0

    iget-object v1, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-static {v1}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$100(Lcom/ideaworks3d/marmalade/LoaderLocation;)Landroid/location/GpsStatus;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getGpsStatus(Landroid/location/GpsStatus;)Landroid/location/GpsStatus;

    goto :goto_0
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 13

    .prologue
    .line 32
    if-eqz p1, :cond_0

    .line 34
    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 35
    :goto_0
    iget-object v0, p0, Lcom/ideaworks3d/marmalade/LoaderLocation$LocationUpdateHandler;->this$0:Lcom/ideaworks3d/marmalade/LoaderLocation;

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v4

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-virtual {p1}, Landroid/location/Location;->getAltitude()D

    move-result-wide v8

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v10

    invoke-virtual {p1}, Landroid/location/Location;->hasBearing()Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-virtual {p1}, Landroid/location/Location;->getBearing()F

    move-result v11

    :goto_1
    invoke-virtual {p1}, Landroid/location/Location;->getSpeed()F

    move-result v12

    invoke-static/range {v0 .. v12}, Lcom/ideaworks3d/marmalade/LoaderLocation;->access$200(Lcom/ideaworks3d/marmalade/LoaderLocation;IJDDDFFF)V

    .line 37
    :cond_0
    return-void

    .line 34
    :cond_1
    const/4 v1, 0x3

    goto :goto_0

    .line 35
    :cond_2
    const/high16 v11, -0x40800000    # -1.0f

    goto :goto_1
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 41
    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 45
    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 49
    return-void
.end method
