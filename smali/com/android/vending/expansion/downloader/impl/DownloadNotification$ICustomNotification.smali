.class public interface abstract Lcom/android/vending/expansion/downloader/impl/DownloadNotification$ICustomNotification;
.super Ljava/lang/Object;
.source "DownloadNotification.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/vending/expansion/downloader/impl/DownloadNotification;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ICustomNotification"
.end annotation


# virtual methods
.method public abstract setCurrentBytes(J)V
.end method

.method public abstract setIcon(I)V
.end method

.method public abstract setPendingIntent(Landroid/app/PendingIntent;)V
.end method

.method public abstract setTicker(Ljava/lang/CharSequence;)V
.end method

.method public abstract setTimeRemaining(J)V
.end method

.method public abstract setTitle(Ljava/lang/CharSequence;)V
.end method

.method public abstract setTotalBytes(J)V
.end method

.method public abstract updateNotification(Landroid/content/Context;)Landroid/app/Notification;
.end method
