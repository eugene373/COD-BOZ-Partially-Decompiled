.class public Lcom/android/vending/expansion/downloader/impl/CustomNotificationFactory;
.super Ljava/lang/Object;
.source "CustomNotificationFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createCustomNotification()Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;
    .locals 2

    .prologue
    .line 25
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xd

    if-le v0, v1, :cond_0

    .line 26
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;

    invoke-direct {v0}, Lcom/android/vending/expansion/downloader/impl/V14CustomNotification;-><init>()V

    .line 28
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;

    invoke-direct {v0}, Lcom/android/vending/expansion/downloader/impl/V3CustomNotification;-><init>()V

    goto :goto_0
.end method
