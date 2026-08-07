package com.sec.android.iap.lib.helper

// Auto-emitted from smali source: SamsungIapHelper.java.
// 3 fields, 7 methods.

open class SamsungIapHelper_InitIapTask: android.os.AsyncTask() {
    private var mActivity: com.sec.android.iap.lib.activity.BaseActivity
    private var mErrorVo: com.sec.android.iap.lib.vo.ErrorVo
    val this$0: com.sec.android.iap.lib.helper.SamsungIapHelper

    public constructor(_activity: com.sec.android.iap.lib.helper.SamsungIapHelper, p1: com.sec.android.iap.lib.activity.BaseActivity)

    protected fun doInBackground(params: Array<String>): Boolean { return TODO("body: ([Ljava/lang/String;)Ljava/lang/Boolean;") }
    /*
    //         .locals 7
    //         const/4 v6, 0x0
    //         :try_start_0
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-static {v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$0(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)I
    //         move-result v1
    //         const/4 v2, 0x2
    //         if-ne v1, v2, :cond_0
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const/4 v2, 0x0
    //         const-string v3, ""
    //         invoke-virtual {v1, v2, v3}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         :goto_0
    //         const/4 v1, 0x1
    //         invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v1
    //         :goto_1
    //         return-object v1
    //         :cond_0
    //         invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "start Init... "
    //         invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v1, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->init(Lcom/sec/android/iap/lib/vo/ErrorVo;)V
    //         invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "end Init... "
    //         invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const/16 v2, -0x3e8
    //         iget-object v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v4, "string"
    //         const-string v5, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"
    //         invoke-static {v4, v5}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v4
    //         invoke-virtual {v3, v4}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v1, v2, v3}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v1
    //         goto :goto_1
    */

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Ljava/lang/String;
    //         invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun onPostExecute(result: Boolean) { /* TODO(body): (Ljava/lang/Boolean;)V */ }
    /*
    //         .locals 12
    //         const/4 v11, 0x0
    //         const/4 v4, 0x1
    //         invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-static {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$2(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)Lcom/sec/android/iap/lib/listener/OnInitIapListener;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         const/4 v1, 0x2
    //         invoke-static {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$3(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;I)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-static {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$2(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)Lcom/sec/android/iap/lib/listener/OnInitIapListener;
    //         move-result-object v0
    //         invoke-interface {v0}, Lcom/sec/android/iap/lib/listener/OnInitIapListener;->onSucceedInitIap()V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I
    //         move-result v0
    //         const/16 v1, -0x3e9
    //         if-ne v0, v1, :cond_2
    //         new-instance v5, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask$1;
    //         invoke-direct {v5, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask$1;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;)V
    //         .local v5, "OkBtnRunnable":Ljava/lang/Runnable;
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v3, "string"
    //         const-string v6, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v3, v6}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v3
    //         invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v3}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         goto :goto_0
    //         .end local v5    # "OkBtnRunnable":Ljava/lang/Runnable;
    //         :cond_2
    //         iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v7, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v1, "string"
    //         const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v8
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v9
    //         move v10, v4
    //         invoke-virtual/range {v6 .. v11}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         goto :goto_0
    //         :cond_3
    //         iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v7, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v1, "string"
    //         const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v8
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v2, "string"
    //         const-string v3, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"
    //         invoke-static {v2, v3}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         const-string v1, "[Lib_Init]"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v9
    //         move v10, v4
    //         invoke-virtual/range {v6 .. v11}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         goto :goto_0
    */

    protected fun onPostExecute(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Ljava/lang/Boolean;
    //         invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->onPostExecute(Ljava/lang/Boolean;)V
    //         return-void
    */

}
