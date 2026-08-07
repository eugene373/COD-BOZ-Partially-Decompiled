package com.amazon.device.iap.internal.b.b

// Auto-emitted from smali source: PurchaseItemCommandBase.java.
// 4 fields, 5 methods.

open class a: com.amazon.device.iap.internal.b.i() {
    protected var a: com.amazon.android.framework.task.TaskManager
    protected var b: com.amazon.android.framework.context.ContextManager
    protected val c: String

    constructor(p0: com.amazon.device.iap.internal.b.e, p1: String, p2: String)

    protected fun a(p0: com.amazon.venezia.command.SuccessResult): Boolean { return TODO("body: (Lcom/amazon/venezia/command/SuccessResult;)Z") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;,
    //                 Lcom/amazon/android/framework/exception/KiwiException;
    //             }
    //         .end annotation
    //         invoke-interface {p1}, Lcom/amazon/venezia/command/SuccessResult;->getData()Ljava/util/Map;
    //         move-result-object v0
    //         sget-object v1, Lcom/amazon/device/iap/internal/b/b/a;->d:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "data: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "purchaseItemIntent"
    //         invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/b/a;->d:Ljava/lang/String;
    //         const-string v1, "did not find intent"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         const/4 v0, 0x0
    //         :goto_0
    //         return v0
    //         :cond_0
    //         sget-object v1, Lcom/amazon/device/iap/internal/b/b/a;->d:Ljava/lang/String;
    //         const-string v2, "found intent"
    //         invoke-static {v1, v2}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v1, "purchaseItemIntent"
    //         invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/b/a;->a:Lcom/amazon/android/framework/task/TaskManager;
    //         sget-object v2, Lcom/amazon/android/framework/task/pipeline/TaskPipelineId;->FOREGROUND:Lcom/amazon/android/framework/task/pipeline/TaskPipelineId;
    //         new-instance v3, Lcom/amazon/device/iap/internal/b/b/a$1;
    //         invoke-direct {v3, p0, v0}, Lcom/amazon/device/iap/internal/b/b/a$1;-><init>(Lcom/amazon/device/iap/internal/b/b/a;Landroid/content/Intent;)V
    //         invoke-interface {v1, v2, v3}, Lcom/amazon/android/framework/task/TaskManager;->enqueueAtFront(Lcom/amazon/android/framework/task/pipeline/TaskPipelineId;Lcom/amazon/android/framework/task/Task;)V
    //         const/4 v0, 0x1
    //         goto :goto_0
    */

    companion object {
    private val d: String = null!!

    @JvmStatic fun a(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/b/a;->d:Ljava/lang/String;
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.amazon.device.iap.internal.b.b.a): String { return TODO("body: (Lcom/amazon/device/iap/internal/b/b/a;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0}, Lcom/amazon/device/iap/internal/b/b/a;->c()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
