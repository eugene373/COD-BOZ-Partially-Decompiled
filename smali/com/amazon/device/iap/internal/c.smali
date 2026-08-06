.class public interface abstract Lcom/amazon/device/iap/internal/c;
.super Ljava/lang/Object;
.source "RequestHandler.java"


# virtual methods
.method public abstract a(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public abstract a(Lcom/amazon/device/iap/model/RequestId;)V
.end method

.method public abstract a(Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;)V
.end method

.method public abstract a(Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V
.end method

.method public abstract a(Lcom/amazon/device/iap/model/RequestId;Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/amazon/device/iap/model/RequestId;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract a(Lcom/amazon/device/iap/model/RequestId;Z)V
.end method
