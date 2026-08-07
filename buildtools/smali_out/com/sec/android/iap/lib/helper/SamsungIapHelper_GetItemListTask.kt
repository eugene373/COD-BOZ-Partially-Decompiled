package com.sec.android.iap.lib.helper

// Auto-emitted from smali source: SamsungIapHelper.java.
// 8 fields, 6 methods.

open class SamsungIapHelper_GetItemListTask: android.os.AsyncTask() {
    private var mActivity: com.sec.android.iap.lib.activity.BaseActivity
    private var mEndNum: Int
    var mErrorVo: com.sec.android.iap.lib.vo.ErrorVo
    private var mItemGroupId: String
    var mItemList: java.util.ArrayList
    private var mItemType: String
    private var mStartNum: Int
    val this$0: com.sec.android.iap.lib.helper.SamsungIapHelper

    public constructor(_activity: com.sec.android.iap.lib.helper.SamsungIapHelper, _itemGroupId: com.sec.android.iap.lib.activity.BaseActivity, _startNum: String, _endNum: Int, _itemType: Int, p5: String)

    protected fun doInBackground(params: Array<String>): Boolean { return TODO("body: ([Ljava/lang/String;)Ljava/lang/Boolean;") }
    /*
    //         .locals 10
    //         :try_start_0
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mItemGroupId:Ljava/lang/String;
    //         iget v7, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mStartNum:I
    //         iget v8, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mEndNum:I
    //         iget-object v9, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mItemType:Ljava/lang/String;
    //         invoke-virtual {v5, v6, v7, v8, v9}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getItemList(Ljava/lang/String;IILjava/lang/String;)Landroid/os/Bundle;
    //         move-result-object v0
    //         .local v0, "bundle":Landroid/os/Bundle;
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const-string v6, "STATUS_CODE"
    //         invoke-virtual {v0, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v6
    //         const-string v7, "ERROR_STRING"
    //         invoke-virtual {v0, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v7
    //         invoke-virtual {v5, v6, v7}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const-string v6, "IAP_UPGRADE_URL"
    //         invoke-virtual {v0, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v6
    //         invoke-virtual {v5, v6}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setExtraString(Ljava/lang/String;)V
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v5}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I
    //         move-result v5
    //         if-nez v5, :cond_2
    //         const-string v5, "RESULT_LIST"
    //         invoke-virtual {v0, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;
    //         move-result-object v3
    //         .local v3, "itemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         if-eqz v3, :cond_1
    //         invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    //         move-result-object v5
    //         :goto_0
    //         invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v6
    //         if-nez v6, :cond_0
    //         .end local v3    # "itemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         :goto_1
    //         const/4 v5, 0x1
    //         invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v5
    //         .end local v0    # "bundle":Landroid/os/Bundle;
    //         :goto_2
    //         return-object v5
    //         .restart local v0    # "bundle":Landroid/os/Bundle;
    //         .restart local v3    # "itemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         :cond_0
    //         :try_start_1
    //         invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    //         move-result-object v2
    //         check-cast v2, Ljava/lang/String;
    //         .local v2, "itemString":Ljava/lang/String;
    //         new-instance v4, Lcom/sec/android/iap/lib/vo/ItemVo;
    //         invoke-direct {v4, v2}, Lcom/sec/android/iap/lib/vo/ItemVo;-><init>(Ljava/lang/String;)V
    //         .local v4, "itemVo":Lcom/sec/android/iap/lib/vo/ItemVo;
    //         iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mItemList:Ljava/util/ArrayList;
    //         invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    //         .end local v0    # "bundle":Landroid/os/Bundle;
    //         .end local v2    # "itemString":Ljava/lang/String;
    //         .end local v3    # "itemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         .end local v4    # "itemVo":Lcom/sec/android/iap/lib/vo/ItemVo;
    //         :catch_0
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/Exception;
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const/16 v6, -0x3ea
    //         iget-object v7, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v8, "string"
    //         const-string v9, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"
    //         invoke-static {v8, v9}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v8
    //         invoke-virtual {v7, v8}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v7
    //         invoke-virtual {v5, v6, v7}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    //         const/4 v5, 0x0
    //         invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v5
    //         goto :goto_2
    //         .end local v1    # "e":Ljava/lang/Exception;
    //         .restart local v0    # "bundle":Landroid/os/Bundle;
    //         .restart local v3    # "itemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         :cond_1
    //         :try_start_2
    //         invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;
    //         move-result-object v5
    //         const-string v6, "Bundle Value \'RESULT_LIST\' is null."
    //         invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_1
    //         .end local v3    # "itemStringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    //         :cond_2
    //         invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;
    //         move-result-object v5
    //         iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v6}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v6
    //         invoke-static {v5, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    //         goto :goto_1
    */

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Ljava/lang/String;
    //         invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->doInBackground([Ljava/lang/String;)Ljava/lang/Boolean;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun onPostExecute(_result: Boolean) { /* TODO(body): (Ljava/lang/Boolean;)V */ }
    /*
    //         .locals 12
    //         const/4 v11, 0x0
    //         const/4 v4, 0x1
    //         invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I
    //         move-result v0
    //         if-nez v0, :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->finish()V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I
    //         move-result v0
    //         const/16 v1, -0x3e9
    //         if-ne v0, v1, :cond_2
    //         new-instance v5, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask$1;
    //         invoke-direct {v5, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask$1;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;)V
    //         .local v5, "OkBtnRunnable":Ljava/lang/Runnable;
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v3, "string"
    //         const-string v6, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v3, v6}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v3
    //         invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v3}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         .end local v5    # "OkBtnRunnable":Ljava/lang/Runnable;
    //         :cond_2
    //         iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v7, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v1, "string"
    //         const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v8
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v9
    //         move v10, v4
    //         invoke-virtual/range {v6 .. v11}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         invoke-static {}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->access$1()Ljava/lang/String;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    //         :cond_3
    //         iget-object v6, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v7, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v1, "string"
    //         const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v8
    //         new-instance v0, Ljava/lang/StringBuilder;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v2, "string"
    //         const-string v3, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"
    //         invoke-static {v2, v3}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v2
    //         invoke-virtual {v1, v2}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         const-string v1, "[Lib_ItemList]"
    //         invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v9
    //         move v10, v4
    //         invoke-virtual/range {v6 .. v11}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         goto/16 :goto_0
    */

    protected fun onPostExecute(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Ljava/lang/Boolean;
    //         invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->onPostExecute(Ljava/lang/Boolean;)V
    //         return-void
    */

}
