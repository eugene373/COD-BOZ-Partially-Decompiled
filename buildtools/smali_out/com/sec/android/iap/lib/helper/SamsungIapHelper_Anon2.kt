package com.sec.android.iap.lib.helper

// Auto-emitted from smali source: SamsungIapHelper.java.
// 1 fields, 2 methods.

open class SamsungIapHelper_Anon2: Runnable {
    val this$0: com.sec.android.iap.lib.helper.SamsungIapHelper

    constructor(p0: com.sec.android.iap.lib.helper.SamsungIapHelper)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const-string v2, "samsungapps://ProductDetail/com.sec.android.iap"
    //         invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v0
    //         .local v0, "iapDeepLink":Landroid/net/Uri;
    //         new-instance v1, Landroid/content/Intent;
    //         invoke-direct {v1}, Landroid/content/Intent;-><init>()V
    //         .local v1, "intent":Landroid/content/Intent;
    //         invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    //         sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    //         const/16 v3, 0xc
    //         if-lt v2, v3, :cond_0
    //         const v2, 0x14000020
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         :goto_0
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$2;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-static {v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$7(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)Landroid/content/Context;
    //         move-result-object v2
    //         invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    //         return-void
    //         :cond_0
    //         const/high16 v2, 0x14000000
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         goto :goto_0
    */

}
