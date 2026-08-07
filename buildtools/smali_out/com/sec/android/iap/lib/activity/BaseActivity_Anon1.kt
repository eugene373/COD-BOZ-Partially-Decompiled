package com.sec.android.iap.lib.activity

// Auto-emitted from smali source: BaseActivity.java.
// 1 fields, 2 methods.

open class BaseActivity_Anon1: com.sec.android.iap.lib.listener.OnIapBindListener {
    val this$0: com.sec.android.iap.lib.activity.BaseActivity

    constructor(p0: com.sec.android.iap.lib.activity.BaseActivity)

    public fun onBindIapFinished(_result: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 7
    //         invoke-static {}, Lcom/sec/android/iap/lib/activity/BaseActivity;->access$0()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "Binding OK... "
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         if-nez p1, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity$1;->this$0:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->succeedBind()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity$1;->this$0:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         iget-object v0, v0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const/16 v1, -0x3ea
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/activity/BaseActivity$1;->this$0:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v3, "string"
    //         const-string v4, "IDS_SAPPS_POP_YOUR_PURCHASE_VIA_SAMSUNG_IN_APP_PURCHASE_IS_INVALID_A_FAKE_APPLICATION_HAS_BEEN_DETECTED_CHECK_THE_APP_MSG"
    //         invoke-static {v3, v4}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v3
    //         invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity$1;->this$0:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         iget-object v0, v0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity$1;->this$0:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/activity/BaseActivity$1;->this$0:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v3, "string"
    //         const-string v4, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v3, v4}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v3
    //         invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity$1;->this$0:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v5, "string"
    //         const-string v6, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"
    //         invoke-static {v5, v6}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v5
    //         invoke-virtual {v4, v5}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         const-string v4, "[Lib_Bind]"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         const/4 v4, 0x1
    //         const/4 v5, 0x0
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         goto :goto_0
    */

}
