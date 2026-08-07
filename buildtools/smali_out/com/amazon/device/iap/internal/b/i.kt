package com.amazon.device.iap.internal.b

// Auto-emitted from smali source: KiwiCommand.java.
// 11 fields, 19 methods.

open class i: com.amazon.android.framework.task.command.AbstractCommandTask() {
    private val b: com.amazon.device.iap.internal.b.e
    private val c: String
    private val d: String
    private val e: String
    private val f: java.util.Map
    private val g: com.amazon.android.licensing.LicenseFailurePromptContentMapper
    private var h: Boolean
    private var i: com.amazon.device.iap.internal.b.i
    private var j: com.amazon.device.iap.internal.b.i
    private var k: Boolean

    public constructor(p0: com.amazon.device.iap.internal.b.e, p1: String, p2: String)

    private fun a(p0: com.amazon.android.framework.prompt.PromptContent) { /* TODO(body): (Lcom/amazon/android/framework/prompt/PromptContent;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/amazon/device/iap/internal/b/b;
    //         invoke-direct {v0, p1}, Lcom/amazon/device/iap/internal/b/b;-><init>(Lcom/amazon/android/framework/prompt/PromptContent;)V
    //         invoke-static {}, Lcom/amazon/android/Kiwi;->getPromptManager()Lcom/amazon/android/framework/prompt/PromptManager;
    //         move-result-object v1
    //         invoke-interface {v1, v0}, Lcom/amazon/android/framework/prompt/PromptManager;->present(Lcom/amazon/android/framework/prompt/Prompt;)V
    //         goto :goto_0
    */

    public fun a(p0: Boolean): com.amazon.device.iap.internal.b.i { return TODO("body: (Z)Lcom/amazon/device/iap/internal/b/i;") }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z
    //         return-object p0
    */

    public fun a(p0: com.amazon.device.iap.internal.b.i) { /* TODO(body): (Lcom/amazon/device/iap/internal/b/i;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/b/i;->i:Lcom/amazon/device/iap/internal/b/i;
    //         return-void
    */

    protected fun a(p0: String, p1: Object) { /* TODO(body): (Ljava/lang/String;Ljava/lang/Object;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->f:Ljava/util/Map;
    //         invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //         return-void
    */

    protected fun a(p0: com.amazon.venezia.command.SuccessResult): Boolean

    public fun a_() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-static {p0}, Lcom/amazon/android/Kiwi;->addCommandToCommandTaskPipeline(Lcom/amazon/android/framework/task/command/AbstractCommandTask;)V
    //         return-void
    */

    protected fun b(): com.amazon.device.iap.internal.b.e { return TODO("body: ()Lcom/amazon/device/iap/internal/b/e;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->b:Lcom/amazon/device/iap/internal/b/e;
    //         return-object v0
    */

    public fun b(p0: com.amazon.device.iap.internal.b.i) { /* TODO(body): (Lcom/amazon/device/iap/internal/b/i;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;
    //         return-void
    */

    protected fun b(p0: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/amazon/device/iap/internal/b/i;->h:Z
    //         return-void
    */

    protected fun c(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->c:Ljava/lang/String;
    //         return-object v0
    */

    protected fun getCommandData(): java.util.Map { return TODO("body: ()Ljava/util/Map;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "()",
    //                 "Ljava/util/Map",
    //                 "<",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/Object;",
    //                 ">;"
    //             }
    //         .end annotation
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->f:Ljava/util/Map;
    //         return-object v0
    */

    protected fun getCommandName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->d:Ljava/lang/String;
    //         return-object v0
    */

    protected fun getCommandVersion(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->e:Ljava/lang/String;
    //         return-object v0
    */

    protected fun isExecutionNeeded(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

    protected fun onException(p0: com.amazon.android.framework.exception.KiwiException) { /* TODO(body): (Lcom/amazon/android/framework/exception/KiwiException;)V */ }
    /*
    //         .locals 3
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/i;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onException: exception = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {p1}, Lcom/amazon/android/framework/exception/KiwiException;->getMessage()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "UNHANDLED_EXCEPTION"
    //         invoke-virtual {p1}, Lcom/amazon/android/framework/exception/KiwiException;->getType()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         const-string v0, "2.0"
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/i;->e:Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;
    //         iget-boolean v1, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/i;->a(Z)Lcom/amazon/device/iap/internal/b/i;
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/i;->a_()V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-boolean v0, p0, Lcom/amazon/device/iap/internal/b/i;->h:Z
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->g:Lcom/amazon/android/licensing/LicenseFailurePromptContentMapper;
    //         invoke-virtual {v0, p1}, Lcom/amazon/android/licensing/LicenseFailurePromptContentMapper;->map(Lcom/amazon/android/framework/exception/KiwiException;)Lcom/amazon/android/framework/prompt/PromptContent;
    //         move-result-object v0
    //         invoke-direct {p0, v0}, Lcom/amazon/device/iap/internal/b/i;->a(Lcom/amazon/android/framework/prompt/PromptContent;)V
    //         :cond_2
    //         iget-boolean v0, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->b:Lcom/amazon/device/iap/internal/b/e;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->b()V
    //         goto :goto_0
    */

    protected fun onFailure(p0: com.amazon.venezia.command.FailureResult) { /* TODO(body): (Lcom/amazon/venezia/command/FailureResult;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;,
    //                 Lcom/amazon/android/framework/exception/KiwiException;
    //             }
    //         .end annotation
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/i;->a:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "onFailure: result = "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         const/4 v1, 0x0
    //         if-eqz p1, :cond_3
    //         invoke-interface {p1}, Lcom/amazon/venezia/command/FailureResult;->getExtensionData()Ljava/util/Map;
    //         move-result-object v0
    //         const-string v2, "maxVersion"
    //         invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         if-eqz v0, :cond_3
    //         const-string v2, "1.0"
    //         invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         const/4 v0, 0x1
    //         :goto_0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;
    //         iget-boolean v1, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z
    //         invoke-virtual {v0, v1}, Lcom/amazon/device/iap/internal/b/i;->a(Z)Lcom/amazon/device/iap/internal/b/i;
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->j:Lcom/amazon/device/iap/internal/b/i;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/i;->a_()V
    //         :cond_0
    //         :goto_1
    //         return-void
    //         :cond_1
    //         iget-boolean v0, p0, Lcom/amazon/device/iap/internal/b/i;->h:Z
    //         if-eqz v0, :cond_2
    //         new-instance v0, Lcom/amazon/android/framework/prompt/PromptContent;
    //         invoke-interface {p1}, Lcom/amazon/venezia/command/FailureResult;->getDisplayableName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {p1}, Lcom/amazon/venezia/command/FailureResult;->getDisplayableMessage()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-interface {p1}, Lcom/amazon/venezia/command/FailureResult;->getButtonLabel()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-interface {p1}, Lcom/amazon/venezia/command/FailureResult;->show()Z
    //         move-result v4
    //         invoke-direct {v0, v1, v2, v3, v4}, Lcom/amazon/android/framework/prompt/PromptContent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //         invoke-direct {p0, v0}, Lcom/amazon/device/iap/internal/b/i;->a(Lcom/amazon/android/framework/prompt/PromptContent;)V
    //         :cond_2
    //         iget-boolean v0, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->b:Lcom/amazon/device/iap/internal/b/e;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->b()V
    //         goto :goto_1
    //         :cond_3
    //         move v0, v1
    //         goto :goto_0
    */

    protected fun onSuccess(p0: com.amazon.venezia.command.SuccessResult) { /* TODO(body): (Lcom/amazon/venezia/command/SuccessResult;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         invoke-interface {p1}, Lcom/amazon/venezia/command/SuccessResult;->getData()Ljava/util/Map;
    //         move-result-object v0
    //         const-string v1, "errorMessage"
    //         invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/lang/String;
    //         sget-object v1, Lcom/amazon/device/iap/internal/b/i;->a:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "onSuccess: result = "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         const-string v3, ", errorMessage: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {v0}, Lcom/amazon/device/iap/internal/util/d;->a(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         const/4 v0, 0x0
    //         :try_start_0
    //         invoke-virtual {p0, p1}, Lcom/amazon/device/iap/internal/b/i;->a(Lcom/amazon/venezia/command/SuccessResult;)Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         :goto_0
    //         if-eqz v0, :cond_1
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/i;->i:Lcom/amazon/device/iap/internal/b/i;
    //         if-eqz v1, :cond_1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->i:Lcom/amazon/device/iap/internal/b/i;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/i;->a_()V
    //         :cond_0
    //         :goto_1
    //         return-void
    //         :catch_0
    //         move-exception v1
    //         sget-object v2, Lcom/amazon/device/iap/internal/b/i;->a:Ljava/lang/String;
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v4, "Error calling onResult: "
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v2, v1}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    //         :cond_1
    //         iget-boolean v1, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z
    //         if-nez v1, :cond_0
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->b:Lcom/amazon/device/iap/internal/b/e;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->a()V
    //         goto :goto_1
    //         :cond_2
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->b:Lcom/amazon/device/iap/internal/b/e;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->b()V
    //         goto :goto_1
    //         :cond_3
    //         iget-boolean v0, p0, Lcom/amazon/device/iap/internal/b/i;->k:Z
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/i;->b:Lcom/amazon/device/iap/internal/b/e;
    //         invoke-virtual {v0}, Lcom/amazon/device/iap/internal/b/e;->b()V
    //         goto :goto_1
    */

    companion object {
    private val a: String = null!!
    }
}
