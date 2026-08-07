package com.amazon.device.iap.internal.b

// Auto-emitted from smali source: KiwiRequest.java.
// 4 fields, 11 methods.

open class e {
    private val b: com.amazon.device.iap.model.RequestId
    private val c: com.amazon.device.iap.internal.b.h
    private var d: com.amazon.device.iap.internal.b.i

    public constructor(p0: com.amazon.device.iap.model.RequestId)

    public fun a() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    protected fun a(p0: com.amazon.device.iap.internal.b.i) { /* TODO(body): (Lcom/amazon/device/iap/internal/b/i;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/b/e;->d:Lcom/amazon/device/iap/internal/b/i;
    //         return-void
    */

    protected fun a(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-virtual {p0, p1, v0}, Lcom/amazon/device/iap/internal/b/e;->a(Ljava/lang/Object;Lcom/amazon/device/iap/internal/b/i;)V
    //         return-void
    */

    protected fun a(p0: Object, p1: com.amazon.device.iap.internal.b.i) { /* TODO(body): (Ljava/lang/Object;Lcom/amazon/device/iap/internal/b/i;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "response"
    //         invoke-static {p1, v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/Object;Ljava/lang/String;)V
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/d;->b()Landroid/content/Context;
    //         move-result-object v0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/d;->d()Lcom/amazon/device/iap/internal/d;
    //         move-result-object v1
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/d;->a()Lcom/amazon/device/iap/PurchasingListener;
    //         move-result-object v1
    //         if-eqz v0, :cond_0
    //         if-nez v1, :cond_1
    //         :cond_0
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/e;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "PurchasingListener is not set. Dropping response: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         :goto_0
    //         return-void
    //         :cond_1
    //         new-instance v2, Lcom/amazon/device/iap/internal/b/e$1;
    //         invoke-direct {v2, p0, p1, v1, p2}, Lcom/amazon/device/iap/internal/b/e$1;-><init>(Lcom/amazon/device/iap/internal/b/e;Ljava/lang/Object;Lcom/amazon/device/iap/PurchasingListener;Lcom/amazon/device/iap/internal/b/i;)V
    //         new-instance v1, Landroid/os/Handler;
    //         invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
    //         move-result-object v0
    //         invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
    //         invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         goto :goto_0
    */

    public fun b() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun c(): com.amazon.device.iap.model.RequestId { return TODO("body: ()Lcom/amazon/device/iap/model/RequestId;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e;->b:Lcom/amazon/device/iap/model/RequestId;
    //         return-object v0
    */

    public fun d(): com.amazon.device.iap.internal.b.h { return TODO("body: ()Lcom/amazon/device/iap/internal/b/h;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e;->c:Lcom/amazon/device/iap/internal/b/h;
    //         return-object v0
    */

    public fun e() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e;->d:Lcom/amazon/device/iap/internal/b/i;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/e;->d:Lcom/amazon/device/iap/internal/b/i;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/i;->a_()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/e;->a()V
    //         goto :goto_0
    */

    companion object {
    private val a: String = null!!

    @JvmStatic fun f(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/e;->a:Ljava/lang/String;
    //         return-object v0
    */

    }
}
