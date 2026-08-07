package com.amazon.device.iap.internal.b

// Auto-emitted from smali source: FailurePrompt.java.
// 3 fields, 5 methods.

open class b: com.amazon.android.framework.prompt.SimplePrompt() {
    private var b: com.amazon.android.framework.context.ContextManager
    private val c: com.amazon.android.framework.prompt.PromptContent

    public constructor(p0: com.amazon.android.framework.prompt.PromptContent)

    protected fun doAction() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/b;->a:Ljava/lang/String;
    //         const-string v1, "doAction"
    //         invoke-static {v0, v1}, Lcom/amazon/device/iap/internal/util/e;->a(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v0, "Amazon Appstore required"
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/b;->c:Lcom/amazon/android/framework/prompt/PromptContent;
    //         invoke-virtual {v1}, Lcom/amazon/android/framework/prompt/PromptContent;->getTitle()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         const-string v0, "Amazon Appstore Update Required"
    //         iget-object v1, p0, Lcom/amazon/device/iap/internal/b/b;->c:Lcom/amazon/android/framework/prompt/PromptContent;
    //         invoke-virtual {v1}, Lcom/amazon/android/framework/prompt/PromptContent;->getTitle()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/b;->b:Lcom/amazon/android/framework/context/ContextManager;
    //         invoke-interface {v0}, Lcom/amazon/android/framework/context/ContextManager;->getVisible()Landroid/app/Activity;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/amazon/device/iap/internal/b/b;->b:Lcom/amazon/android/framework/context/ContextManager;
    //         invoke-interface {v0}, Lcom/amazon/android/framework/context/ContextManager;->getRoot()Landroid/app/Activity;
    //         move-result-object v0
    //         :cond_1
    //         new-instance v1, Landroid/content/Intent;
    //         const-string v2, "android.intent.action.VIEW"
    //         const-string v3, "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl"
    //         invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v3
    //         invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V
    //         invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_2
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         sget-object v1, Lcom/amazon/device/iap/internal/b/b;->a:Ljava/lang/String;
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Exception in PurchaseItemCommandTask.OnSuccess: "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v0
    //         invoke-static {v1, v0}, Lcom/amazon/device/iap/internal/util/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    //         goto :goto_0
    */

    protected fun getExpirationDurationInSeconds(): Long { return TODO("body: ()J") }
    /*
    //         .locals 2
    //         const-wide/32 v0, 0x1e13380
    //         return-wide v0
    */

    public fun toString(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/amazon/device/iap/internal/b/b;->a:Ljava/lang/String;
    //         return-object v0
    */

    companion object {
    private val a: String = null!!
    }
}
