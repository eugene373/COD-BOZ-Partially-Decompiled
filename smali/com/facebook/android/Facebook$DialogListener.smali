.class public interface abstract Lcom/facebook/android/Facebook$DialogListener;
.super Ljava/lang/Object;
.source "Facebook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/android/Facebook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "DialogListener"
.end annotation


# virtual methods
.method public abstract onCancel()V
.end method

.method public abstract onComplete(Landroid/os/Bundle;)V
.end method

.method public abstract onError(Lcom/facebook/android/DialogError;)V
.end method

.method public abstract onFacebookError(Lcom/facebook/android/FacebookError;)V
.end method
