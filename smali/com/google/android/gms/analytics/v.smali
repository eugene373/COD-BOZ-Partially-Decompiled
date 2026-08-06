.class Lcom/google/android/gms/analytics/v;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/analytics/i;


# instance fields
.field As:Ljava/lang/String;

.field At:I

.field Au:I

.field xL:Ljava/lang/String;

.field xM:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/google/android/gms/analytics/v;->At:I

    iput v0, p0, Lcom/google/android/gms/analytics/v;->Au:I

    return-void
.end method


# virtual methods
.method public eA()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/analytics/v;->At:I

    return v0
.end method

.method public eB()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/analytics/v;->Au:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public eC()Z
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/analytics/v;->Au:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public et()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/v;->xL:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public eu()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/v;->xL:Ljava/lang/String;

    return-object v0
.end method

.method public ev()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/v;->xM:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public ew()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/v;->xM:Ljava/lang/String;

    return-object v0
.end method

.method public ex()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/v;->As:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public ey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/v;->As:Ljava/lang/String;

    return-object v0
.end method

.method public ez()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/analytics/v;->At:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
