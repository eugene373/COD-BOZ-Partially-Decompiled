package com.amazon.device.iap.internal.b.g

// Auto-emitted from smali source: PurchaseFulfilledCommandV2.java.
// 2 fields, 3 methods.

class a: com.amazon.device.iap.internal.b.i() {
    protected val a: java.util.Set
    protected val b: String

    public constructor(p0: com.amazon.device.iap.internal.b.e, p1: java.util.Set, p2: String)

    protected fun a(p0: com.amazon.venezia.command.SuccessResult): Boolean { return TODO("body: (Lcom/amazon/venezia/command/SuccessResult;)Z") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;,
    //                 Lcom/amazon/android/framework/exception/KiwiException;
    //             }
    //         .end annotation
    //         const/4 v0, 0x1
    //         return v0
    */

    public fun a_() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/g/a;->b()Lcom/amazon/device/iap/internal/b/e;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->d()Lcom/amazon/device/iap/internal/b/h;
    //         move-result-object v0
    //         const-string v1, "notifyListenerResult"
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/h;->a(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    //         invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "fulfillmentStatus"
    //         sget-object v1, Lcom/amazon/device/iap/internal/model/a;->b:Lcom/amazon/device/iap/internal/model/a;
    //         invoke-virtual {v1}, Lcom/amazon/device/iap/internal/model/a;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p0, v0, v1}, Lcom/amazon/device/iap/internal/b/g/a;->a(Ljava/lang/String;Ljava/lang/Object;)V
    //         :cond_0
    //         invoke-super {p0}, Lcom/amazon/device/iap/internal/b/i;->a_()V
    //         return-void
    */

}
