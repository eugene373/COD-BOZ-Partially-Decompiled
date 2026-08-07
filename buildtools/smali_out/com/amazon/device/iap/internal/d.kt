package com.amazon.device.iap.internal

// Auto-emitted from smali source: PurchasingManager.java.
// 6 fields, 13 methods.

open class d {
    private val d: com.amazon.device.iap.internal.c
    private var e: android.content.Context
    private var f: com.amazon.device.iap.PurchasingListener

    private constructor()

    private fun e() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/d;->f:Lcom/amazon/device/iap/PurchasingListener;
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalStateException;
    //         const-string v1, "You must register a PurchasingListener before invoking this operation"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         return-void
    */

    public fun a(): com.amazon.device.iap.PurchasingListener { return TODO("body: ()Lcom/amazon/device/iap/PurchasingListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/d;->f:Lcom/amazon/device/iap/PurchasingListener;
    //         return-object v0
    */

    public fun a(p0: String): com.amazon.device.iap.model.RequestId { return TODO("body: (Ljava/lang/String;)Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/amazon/device/iap/internal/d;->b:Ljava/lang/String;
    //         invoke-static {p1, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-direct {p0}, Lcom/amazon/device/iap/internal/d;->e()V
    //         new-instance v0, Lcom/amazon/device/iap/model/RequestId;
    //         invoke-direct {v0}, Lcom/amazon/device/iap/model/RequestId;-><init>()V
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/d;->d:Lcom/amazon/device/iap/internal/c;
    //         invoke-interface {v1, v0, p1}, Lcom/amazon/device/iap/internal/c;->a(Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;)V
    //         return-object v0
    */

    public fun a(p0: java.util.Set): com.amazon.device.iap.model.RequestId { return TODO("body: (Ljava/util/Set;)Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/Set",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 ">;)",
    //                 "Lcom/amazon/device/iap/model/RequestId;"
    //             }
    //         .end annotation
    //         const/16 v3, 0x64
    //         const-string v0, "skus"
    //         invoke-static {p1, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V
    //         const-string v0, "skus"
    //         invoke-static {p1, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/util/Collection;Ljava/lang/String;)V
    //         invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    //         move-result-object v1
    //         :cond_0
    //         invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/String;->length()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Empty SKU values are not allowed"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-interface {p1}, Ljava/util/Set;->size()I
    //         move-result v0
    //         if-le v0, v3, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-interface {p1}, Ljava/util/Set;->size()I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " SKUs were provided, but no more than "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         const-string v2, " SKUs are allowed"
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         invoke-direct {p0}, Lcom/amazon/device/iap/internal/d;->e()V
    //         new-instance v0, Lcom/amazon/device/iap/model/RequestId;
    //         invoke-direct {v0}, Lcom/amazon/device/iap/model/RequestId;-><init>()V
    //         new-instance v1, Ljava/util/LinkedHashSet;
    //         invoke-direct {v1, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V
    //         iget-object v2, p0, Lcom/amazon/device/iap/internal/d;->d:Lcom/amazon/device/iap/internal/c;
    //         invoke-interface {v2, v0, v1}, Lcom/amazon/device/iap/internal/c;->a(Lcom/amazon/device/iap/model/RequestId;Ljava/util/Set;)V
    //         return-object v0
    */

    public fun a(p0: Boolean): com.amazon.device.iap.model.RequestId { return TODO("body: (Z)Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/amazon/device/iap/internal/d;->e()V
    //         new-instance v0, Lcom/amazon/device/iap/model/RequestId;
    //         invoke-direct {v0}, Lcom/amazon/device/iap/model/RequestId;-><init>()V
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/d;->d:Lcom/amazon/device/iap/internal/c;
    //         invoke-interface {v1, v0, p1}, Lcom/amazon/device/iap/internal/c;->a(Lcom/amazon/device/iap/model/RequestId;Z)V
    //         return-object v0
    */

    public fun a(p0: android.content.Context, p1: android.content.Intent) { /* TODO(body): (Landroid/content/Context;Landroid/content/Intent;)V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/d;->d:Lcom/amazon/device/iap/internal/c;
    //         invoke-interface {v0, p1, p2}, Lcom/amazon/device/iap/internal/c;->a(Landroid/content/Context;Landroid/content/Intent;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/amazon/device/iap/internal/d;->a:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Error in onReceive: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    public fun a(p0: android.content.Context, p1: com.amazon.device.iap.PurchasingListener) { /* TODO(body): (Landroid/content/Context;Lcom/amazon/device/iap/PurchasingListener;)V */ }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/amazon/device/iap/internal/d;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "PurchasingListener registered: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         sget-object v0, Lcom/amazon/device/iap/internal/d;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "PurchasingListener Context: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         if-eqz p2, :cond_0
    //         if-nez p1, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Neither PurchasingListener or its Context can be null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/amazon/device/iap/internal/d;->e:Landroid/content/Context;
    //         iput-object p2, p0, Lcom/amazon/device/iap/internal/d;->f:Lcom/amazon/device/iap/PurchasingListener;
    //         return-void
    */

    public fun a(p0: String, p1: com.amazon.device.iap.model.FulfillmentResult) { /* TODO(body): (Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V */ }
    /*
    //         .locals 2
    //         invoke-static {p1}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "Empty receiptId is not allowed"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         const-string v0, "fulfillmentResult"
    //         invoke-static {p2, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-direct {p0}, Lcom/amazon/device/iap/internal/d;->e()V
    //         new-instance v0, Lcom/amazon/device/iap/model/RequestId;
    //         invoke-direct {v0}, Lcom/amazon/device/iap/model/RequestId;-><init>()V
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/d;->d:Lcom/amazon/device/iap/internal/c;
    //         invoke-interface {v1, v0, p1, p2}, Lcom/amazon/device/iap/internal/c;->a(Lcom/amazon/device/iap/model/RequestId;Ljava/lang/String;Lcom/amazon/device/iap/model/FulfillmentResult;)V
    //         return-void
    */

    public fun b(): android.content.Context { return TODO("body: ()Landroid/content/Context;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/d;->e:Landroid/content/Context;
    //         return-object v0
    */

    public fun c(): com.amazon.device.iap.model.RequestId { return TODO("body: ()Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/amazon/device/iap/internal/d;->e()V
    //         new-instance v0, Lcom/amazon/device/iap/model/RequestId;
    //         invoke-direct {v0}, Lcom/amazon/device/iap/model/RequestId;-><init>()V
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/d;->d:Lcom/amazon/device/iap/internal/c;
    //         invoke-interface {v1, v0}, Lcom/amazon/device/iap/internal/c;->a(Lcom/amazon/device/iap/model/RequestId;)V
    //         return-object v0
    */

    companion object {
    private var a: String
    private var b: String
    private var c: com.amazon.device.iap.internal.d

    public @JvmStatic fun d(): com.amazon.device.iap.internal.d { return TODO("body: ()Lcom/amazon/device/iap/internal/d;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/amazon/device/iap/internal/d;->c:Lcom/amazon/device/iap/internal/d;
    //         return-object v0
    */

    }
}
