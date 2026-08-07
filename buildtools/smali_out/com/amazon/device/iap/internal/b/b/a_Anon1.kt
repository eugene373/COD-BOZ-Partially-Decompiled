package com.amazon.device.iap.internal.b.b

// Auto-emitted from smali source: PurchaseItemCommandBase.java.
// 2 fields, 2 methods.

open class a_Anon1: com.amazon.android.framework.task.Task {
    val a: android.content.Intent
    val b: com.amazon.device.iap.internal.b.b.a

    constructor(p0: com.amazon.device.iap.internal.b.b.a, p1: android.content.Intent)

    public fun execute() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/b/a$1;->b:Lcom/amazon/device/iap/internal/b/b/a;
    //         iget-object v0, v0, Lcom/amazon/device/iap/internal/b/b/a;->b:Lcom/amazon/android/framework/context/ContextManager;
    //         invoke-interface {v0}, Lcom/amazon/android/framework/context/ContextManager;->getVisible()Landroid/app/Activity;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/b/a$1;->b:Lcom/amazon/device/iap/internal/b/b/a;
    //         iget-object v0, v0, Lcom/amazon/device/iap/internal/b/b/a;->b:Lcom/amazon/android/framework/context/ContextManager;
    //         invoke-interface {v0}, Lcom/amazon/android/framework/context/ContextManager;->getRoot()Landroid/app/Activity;
    //         move-result-object v0
    //         :cond_0
    //         invoke-static {}, Lcom/amazon/device/iap/internal/b/b/a;->a()Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "About to fire intent with activity "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/b/a$1;->a:Landroid/content/Intent;
    //         invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/b/a$1;->b:Lcom/amazon/device/iap/internal/b/b/a;
    //         invoke-static {v1}, Lcom/amazon/device/iap/internal/b/b/a;->a(Lcom/amazon/device/iap/internal/b/b/a;)Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         invoke-static {}, Lcom/amazon/device/iap/internal/b/b/a;->a()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, ".onResult().execute()"
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2, v0}, Lcom/amazon/device/iap/internal/util/MetricsHelper;->submitExceptionMetrics(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //         invoke-static {}, Lcom/amazon/device/iap/internal/b/b/a;->a()Ljava/lang/String;
    //         move-result-object v1
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Exception when attempting to fire intent: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

}
