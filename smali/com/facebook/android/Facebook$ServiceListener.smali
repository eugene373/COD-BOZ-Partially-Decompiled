.class public interface abstract Lcom/facebook/android/Facebook$ServiceListener;
.super Ljava/lang/Object;
.source "Facebook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/android/Facebook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ServiceListener"
.end annotation


# virtual methods
.method public abstract onComplete(Landroid/os/Bundle;)V
.end method

.method public abstract onError(Ljava/lang/Error;)V
.end method

.method public abstract onFacebookError(Lcom/facebook/android/FacebookError;)V
.end method
