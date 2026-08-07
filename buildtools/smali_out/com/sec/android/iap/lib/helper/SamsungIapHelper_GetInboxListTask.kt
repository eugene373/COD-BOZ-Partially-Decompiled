package com.sec.android.iap.lib.helper

// Auto-emitted from smali source: SamsungIapHelper.java.
// 9 fields, 5 methods.

open class SamsungIapHelper_GetInboxListTask: android.os.AsyncTask() {
    private var mActivity: com.sec.android.iap.lib.activity.BaseActivity
    private var mEndDate: String
    private var mEndNum: Int
    private var mErrorVo: com.sec.android.iap.lib.vo.ErrorVo
    private var mInbox: java.util.ArrayList
    private var mItemGroupId: String
    private var mStartDate: String
    private var mStartNum: Int
    val this$0: com.sec.android.iap.lib.helper.SamsungIapHelper

    public constructor(_activity: com.sec.android.iap.lib.helper.SamsungIapHelper, _itemGroupId: com.sec.android.iap.lib.activity.BaseActivity, _startNum: String, _endNum: Int, _startDate: Int, _endDate: String, p6: String)

    protected fun doInBackground(params: Array<String>): Boolean { return TODO("body: ([Ljava/lang/String;)Ljava/lang/Boolean;") }
    /*
    //         .locals 11
    //         :try_start_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mItemGroupId:Ljava/lang/String;
    //         iget v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mStartNum:I
    //         iget v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mEndNum:I
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mStartDate:Ljava/lang/String;
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mEndDate:Ljava/lang/String;
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getItemsInbox(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v6
    //         .local v6, "bundle":Landroid/os/Bundle;
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const-string v1, "STATUS_CODE"
    //         invoke-virtual {v6, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v1
    //         const-string v2, "ERROR_STRING"
    //         invoke-virtual {v6, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I
    //         move-result v0
    //         if-nez v0, :cond_2
    //         const-string v0, "RESULT_LIST"
    //         invoke-virtual {v6, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v10
    //         .local v10, "purchaseItemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         if-eqz v10, :cond_1
    //         invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v0
    //         :goto_0
    //         invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v1
    //         if-nez v1, :cond_0
    //         .end local v10    # "purchaseItemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         :goto_1
    //         const/4 v0, 0x1
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         .end local v6    # "bundle":Landroid/os/Bundle;
    //         :goto_2
    //         return-object v0
    //         .restart local v6    # "bundle":Landroid/os/Bundle;
    //         .restart local v10    # "purchaseItemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         :cond_0
    //         :try_start_1
    //         invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v9
    //         check-cast v9, Ljava/lang/String;
    //         .local v9, "itemString":Ljava/lang/String;
    //         new-instance v8, Lcom/sec/android/iap/lib/vo/InboxVo;
    //         invoke-direct {v8, v9}, Lcom/sec/android/iap/lib/vo/InboxVo;-><init>(Ljava/lang/String;)V
    //         .local v8, "inboxVo":Lcom/sec/android/iap/lib/vo/InboxVo;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mInbox:Ljava/util/ArrayList;
    //         invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    //         .end local v6    # "bundle":Landroid/os/Bundle;
    //         .end local v8    # "inboxVo":Lcom/sec/android/iap/lib/vo/InboxVo;
    //         .end local v9    # "itemString":Ljava/lang/String;
    //         .end local v10    # "purchaseItemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         :catch_0
    //         move-exception v7
    //         .local v7, "e":Ljava/lang/Exception;
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const/16 v1, -0x3ea
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v3, "string"
    //         const-string v4, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"
    //         invoke-static {v3, v4}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v3
    //         invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V
    //         const/4 v0, 0x0
    //         invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v0
    //         goto :goto_2
    //         .end local v7    # "e":Ljava/lang/Exception;
    //         .restart local v6    # "bundle":Landroid/os/Bundle;
    //         .restart local v10    # "purchaseItemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         :cond_1
    //         :try_start_2
    //         invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;
    //         move-result-object v0
    //         const-string v1, "Bundle Value \'RESULT_LIST\' is null."
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_1
    //         .end local v10    # "purchaseItemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         :cond_2
    //         invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    //         goto :goto_1
    */

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Ljava/lang/String;
    //         invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun onPostExecute(_result: Boolean) { /* TODO(body): (Ljava/lang/Boolean;)V */ }
    /*
    //         .locals 9
    //         const/4 v5, 0x0
    //         const/4 v4, 0x1
    //         invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->finish()V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v3, "string"
    //         const-string v6, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v3, v6}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v3
    //         invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v3}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v3, "string"
    //         const-string v6, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v3, v6}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v3
    //         invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         new-instance v3, Ljava/lang/StringBuilder;
    //         iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v7, "string"
    //         const-string v8, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"
    //         invoke-static {v7, v8}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v7
    //         invoke-virtual {v6, v7}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v6
    //         invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v6
    //         invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         const-string v6, "[Lib_InboxList]"
    //         invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v3
    //         invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         goto :goto_0
    */

    protected fun onPostExecute(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Ljava/lang/Boolean;
    //         invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->onPostExecute(Ljava/lang/Boolean;)V
    //         return-void
    */

}
