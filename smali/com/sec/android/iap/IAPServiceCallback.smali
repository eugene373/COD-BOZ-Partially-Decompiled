.class public interface abstract Lcom/sec/android/iap/IAPServiceCallback;
.super Ljava/lang/Object;
.source "IAPServiceCallback.java"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sec/android/iap/IAPServiceCallback$Stub;
    }
.end annotation


# virtual methods
.method public abstract responseCallback(Landroid/os/Bundle;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
