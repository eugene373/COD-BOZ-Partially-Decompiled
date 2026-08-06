.class public Lcom/google/android/gms/drive/events/d;
.super Ljava/lang/Object;


# direct methods
.method public static a(ILcom/google/android/gms/drive/DriveId;)Z
    .locals 1

    if-nez p1, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/drive/events/d;->bd(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static bd(I)Z
    .locals 6

    const/4 v0, 0x1

    const-wide/16 v2, 0x2

    shl-int v1, v0, p0

    int-to-long v4, v1

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
