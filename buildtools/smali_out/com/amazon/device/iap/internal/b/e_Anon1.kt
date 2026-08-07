package com.amazon.device.iap.internal.b

// Auto-emitted from smali source: KiwiRequest.java.
// 4 fields, 2 methods.

open class e_Anon1: Runnable {
    val a: Object
    val b: com.amazon.device.iap.PurchasingListener
    val c: com.amazon.device.iap.internal.b.i
    val d: com.amazon.device.iap.internal.b.e

    constructor(p0: com.amazon.device.iap.internal.b.e, p1: Object, p2: com.amazon.device.iap.PurchasingListener, p3: com.amazon.device.iap.internal.b.i)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->d:Lcom/amazon/device/iap/internal/b/e;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v0
    //         const-string v1, "notifyListenerResult"
    //         sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    //         invoke-virtual {v0, v1, v2}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/String;Ljava/lang/Object;)V
    //         :try_start_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;
    //         instance-of v0, v0, Lcom/amazon/device/iap/model/ProductDataResponse;
    //         if-eqz v0, :cond_2
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/e$1;->b:Lcom/amazon/device/iap/PurchasingListener;
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;
    //         check-cast v0, Lcom/amazon/device/iap/model/ProductDataResponse;
    //         invoke-interface {v1, v0}, Lcom/amazon/device/iap/PurchasingListener;->onProductDataResponse(Lcom/amazon/device/iap/model/ProductDataResponse;)V
    //         :cond_0
    //         :goto_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->d:Lcom/amazon/device/iap/internal/b/e;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v0
    //         const-string v1, "notifyListenerResult"
    //         sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    //         invoke-virtual {v0, v1, v2}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/String;Ljava/lang/Object;)V
    //         :try_end_0
    //         .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->c:Lcom/amazon/device/iap/internal/b/i;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->c:Lcom/amazon/device/iap/internal/b/i;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/i;->a(Z)Lcom/amazon/device/iap/internal/b/i;
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->c:Lcom/amazon/device/iap/internal/b/i;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/i;->a_()V
    //         :cond_1
    //         return-void
    //         :cond_2
    //         :try_start_1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;
    //         instance-of v0, v0, Lcom/amazon/device/iap/model/UserDataResponse;
    //         if-eqz v0, :cond_3
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/e$1;->b:Lcom/amazon/device/iap/PurchasingListener;
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;
    //         check-cast v0, Lcom/amazon/device/iap/model/UserDataResponse;
    //         invoke-interface {v1, v0}, Lcom/amazon/device/iap/PurchasingListener;->onUserDataResponse(Lcom/amazon/device/iap/model/UserDataResponse;)V
    //         :try_end_1
    //         .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/b/e;->f()Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Error in sendResponse: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_1
    //         :cond_3
    //         :try_start_2
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;
    //         instance-of v0, v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         if-eqz v0, :cond_4
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;
    //         check-cast v0, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/e$1;->b:Lcom/amazon/device/iap/PurchasingListener;
    //         invoke-interface {v1, v0}, Lcom/amazon/device/iap/PurchasingListener;->onPurchaseUpdatesResponse(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/e$1;->d:Lcom/amazon/device/iap/internal/b/e;
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v1
    //         const-string v2, "newCursor"
    //         invoke-virtual {v1, v2}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v1
    //         if-eqz v1, :cond_0
    //         instance-of v2, v1, Ljava/lang/String;
    //         if-eqz v2, :cond_0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;->getUserData()Lcom/amazon/device/iap/model/UserData;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/model/UserData;->getUserId()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_4
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;
    //         instance-of v0, v0, Lcom/amazon/device/iap/model/PurchaseResponse;
    //         if-eqz v0, :cond_5
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/e$1;->b:Lcom/amazon/device/iap/PurchasingListener;
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;
    //         check-cast v0, Lcom/amazon/device/iap/model/PurchaseResponse;
    //         invoke-interface {v1, v0}, Lcom/amazon/device/iap/PurchasingListener;->onPurchaseResponse(Lcom/amazon/device/iap/model/PurchaseResponse;)V
    //         goto/16 :goto_0
    //         :cond_5
    //         invoke-static {}, Lcom/amazon/device/iap/internal/b/e;->f()Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Unknown response type:"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/amazon/device/iap/internal/b/e$1;->a:Ljava/lang/Object;
    //         invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         :try_end_2
    //         .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    //         goto/16 :goto_0
    */

}
