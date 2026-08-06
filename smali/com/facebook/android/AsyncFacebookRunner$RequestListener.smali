.class public interface abstract Lcom/facebook/android/AsyncFacebookRunner$RequestListener;
.super Ljava/lang/Object;
.source "AsyncFacebookRunner.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/android/AsyncFacebookRunner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RequestListener"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# virtual methods
.method public abstract onComplete(Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method public abstract onFacebookError(Lcom/facebook/android/FacebookError;Ljava/lang/Object;)V
.end method

.method public abstract onFileNotFoundException(Ljava/io/FileNotFoundException;Ljava/lang/Object;)V
.end method

.method public abstract onIOException(Ljava/io/IOException;Ljava/lang/Object;)V
.end method

.method public abstract onMalformedURLException(Ljava/net/MalformedURLException;Ljava/lang/Object;)V
.end method
