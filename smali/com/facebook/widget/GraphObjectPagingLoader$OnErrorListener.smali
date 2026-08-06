.class public interface abstract Lcom/facebook/widget/GraphObjectPagingLoader$OnErrorListener;
.super Ljava/lang/Object;
.source "GraphObjectPagingLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/GraphObjectPagingLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OnErrorListener"
.end annotation


# virtual methods
.method public abstract onError(Lcom/facebook/FacebookException;Lcom/facebook/widget/GraphObjectPagingLoader;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/FacebookException;",
            "Lcom/facebook/widget/GraphObjectPagingLoader",
            "<*>;)V"
        }
    .end annotation
.end method
