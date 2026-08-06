.class public interface abstract Lcom/facebook/Request$GraphPlaceListCallback;
.super Ljava/lang/Object;
.source "Request.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/Request;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "GraphPlaceListCallback"
.end annotation


# virtual methods
.method public abstract onCompleted(Ljava/util/List;Lcom/facebook/Response;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/model/GraphPlace;",
            ">;",
            "Lcom/facebook/Response;",
            ")V"
        }
    .end annotation
.end method
