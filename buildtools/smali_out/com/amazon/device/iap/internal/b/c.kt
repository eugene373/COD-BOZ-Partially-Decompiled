package com.amazon.device.iap.internal.b

// Auto-emitted from smali source: KiwiRequestHandler.java.
// 1 fields, 8 methods.

class c: com.amazon.device.iap.internal.c {
    public constructor()

    public fun a(p0: android.content.Context, p1: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 4
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;
    //         const-string v1, "handleResponse"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "response_type"
    //         invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;
    //         const-string v1, "Invalid response type: null"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         sget-object v1, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Found response type: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "purchase_response"
    //         invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "requestId"
    //         invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Lcom/amazon/device/iap/internal/b/a/d;
    //         invoke-static {v0}, Lcom/amazon/device/iap/model/RequestId;->fromString(Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Lcom/amazon/device/iap/internal/b/a/d;-><init>(Lcom/amazon/device/iap/model/RequestId;)V
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/b/a/d;->e()V
    //         goto :goto_0
    */

    public fun a(p0: com.amazon.device.iap.model.RequestId) { /* TODO(body): (Lcom/amazon/device/iap/model/RequestId;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;
    //         const-string v1, "sendGetUserData"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Lcom/amazon/device/iap/internal/b/e/a;
    //         invoke-direct {v0, p1}, Lcom/amazon/device/iap/internal/b/e/a;-><init>(Lcom/amazon/device/iap/model/RequestId;)V
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e/a;->e()V
    //         return-void
    */

    public fun a(p0: com.amazon.device.iap.model.RequestId, p1: String) { /* TODO(body): (Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;
    //         const-string v1, "sendPurchaseRequest"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Lcom/amazon/device/iap/internal/b/b/d;
    //         invoke-direct {v0, p1, p2}, Lcom/amazon/device/iap/internal/b/b/d;-><init>(Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;)V
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/b/d;->e()V
    //         return-void
    */

    public fun a(p0: com.amazon.device.iap.model.RequestId, p1: String, p2: com.amazon.device.iap.model.FulfillmentResult) { /* TODO(body): (Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;
    //         const-string v1, "sendNotifyFulfillment"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Lcom/amazon/device/iap/internal/b/g/b;
    //         invoke-direct {v0, p1, p2, p3}, Lcom/amazon/device/iap/internal/b/g/b;-><init>(Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/g/b;->e()V
    //         return-void
    */

    public fun a(p0: com.amazon.device.iap.model.RequestId, p1: java.util.Set) { /* TODO(body): (Lcom/amazon/device/iap/model/RequestId;Ljava/util/Set;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/amazon/device/iap/model/RequestId;",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;
    //         const-string v1, "sendGetProductDataRequest"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Lcom/amazon/device/iap/internal/b/c/d;
    //         invoke-direct {v0, p1, p2}, Lcom/amazon/device/iap/internal/b/c/d;-><init>(Lcom/amazon/device/iap/model/RequestId;Ljava/util/Set;)V
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/c/d;->e()V
    //         return-void
    */

    public fun a(p0: com.amazon.device.iap.model.RequestId, p1: Boolean) { /* TODO(body): (Lcom/amazon/device/iap/model/RequestId;Z)V */ }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/c;->a:Ljava/lang/String;
    //         const-string v1, "sendGetPurchaseUpdates"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v0, Lcom/amazon/device/iap/internal/b/d/a;
    //         invoke-direct {v0, p1, p2}, Lcom/amazon/device/iap/internal/b/d/a;-><init>(Lcom/amazon/device/iap/model/RequestId;Z)V
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/d/a;->e()V
    //         return-void
    */

    companion object {
    private val a: String = null!!
    }
}
