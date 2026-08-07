package com.sec.android.iap.lib.helper

// Auto-emitted from smali source: SamsungIapHelper.java.
// 1 fields, 2 methods.

open class SamsungIapHelper_InitIapTask_Anon1: Runnable {
    val this$1: com.sec.android.iap.lib.helper.SamsungIapHelper.InitIapTask

    constructor(p0: com.sec.android.iap.lib.helper.SamsungIapHelper.InitIapTask)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask$1;->this$1:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;
    //         invoke-static {v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->access$2(Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;)Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getExtraString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v1, Landroid/content/Intent;
    //         invoke-direct {v1}, Landroid/content/Intent;-><init>()V
    //         .local v1, "intent":Landroid/content/Intent;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask$1;->this$1:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;
    //         invoke-static {v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->access$2(Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;)Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         move-result-object v2
    //         invoke-virtual {v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getExtraString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    //         move-result-object v2
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
    //         const/high16 v2, 0x10000000
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
    //         :try_start_0
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask$1;->this$1:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;
    //         invoke-static {v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->access$3(Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;)Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         move-result-object v2
    //         invoke-virtual {v2, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->startActivity(Landroid/content/Intent;)V
    //         :try_end_0
    //         .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Landroid/content/ActivityNotFoundException;
    //         invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V
    //         goto :goto_0
    */

}
