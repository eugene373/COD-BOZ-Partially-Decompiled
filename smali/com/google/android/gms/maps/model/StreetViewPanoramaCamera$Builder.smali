.class public final Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field public bearing:F

.field public tilt:F

.field public zoom:F


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;)V
    .locals 1
    .param p1, "previous"    # Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->zoom:F

    iput v0, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->zoom:F

    iget v0, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->bearing:F

    iput v0, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->bearing:F

    iget v0, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;->tilt:F

    iput v0, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->tilt:F

    return-void
.end method


# virtual methods
.method public bearing(F)Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;
    .locals 0
    .param p1, "bearing"    # F

    .prologue
    iput p1, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->bearing:F

    return-object p0
.end method

.method public build()Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;
    .locals 4

    new-instance v0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;

    iget v1, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->zoom:F

    iget v2, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->tilt:F

    iget v3, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->bearing:F

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;-><init>(FFF)V

    return-object v0
.end method

.method public orientation(Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;)Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;
    .locals 1
    .param p1, "orientation"    # Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;

    .prologue
    iget v0, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;->tilt:F

    iput v0, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->tilt:F

    iget v0, p1, Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;->bearing:F

    iput v0, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->bearing:F

    return-object p0
.end method

.method public tilt(F)Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;
    .locals 0
    .param p1, "tilt"    # F

    .prologue
    iput p1, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->tilt:F

    return-object p0
.end method

.method public zoom(F)Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;
    .locals 0
    .param p1, "zoom"    # F

    .prologue
    iput p1, p0, Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera$Builder;->zoom:F

    return-object p0
.end method
