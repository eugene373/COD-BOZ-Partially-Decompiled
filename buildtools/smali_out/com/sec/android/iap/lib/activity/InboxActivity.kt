package com.sec.android.iap.lib.activity

// Auto-emitted from smali source: InboxActivity.java.
// 6 fields, 5 methods.

open class InboxActivity: com.sec.android.iap.lib.activity.BaseActivity() {
    private var mEndDate: String
    private var mEndNum: Int
    private var mItemGroupId: String
    private var mStartDate: String
    private var mStartNum: Int

    public constructor()

    protected fun onActivityResult(_requestCode: Int, _resultCode: Int, _intent: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 6
    //         const/4 v4, 0x1
    //         packed-switch p1, :pswitch_data_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         const/4 v0, -0x1
    //         if-ne v0, p2, :cond_1
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/InboxActivity;->bindIapService()V
    //         goto :goto_0
    //         :cond_1
    //         if-nez p2, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const-string v1, "string"
    //         const-string v2, "IDS_SAPPS_POP_PAYMENT_CANCELLED"
    //         invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/InboxActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v4, v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         const-string v1, "string"
    //         const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/InboxActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         const-string v1, "string"
    //         const-string v3, "IDS_SAPPS_POP_PAYMENT_CANCELLED"
    //         invoke-static {v1, v3}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/InboxActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v3
    //         const/4 v5, 0x0
    //         move-object v1, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x2
    //             :pswitch_0
    //         .end packed-switch
    */

    protected fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 6
    //         invoke-super {p0, p1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->onCreate(Landroid/os/Bundle;)V
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/InboxActivity;->getIntent()Landroid/content/Intent;
    //         move-result-object v1
    //         .local v1, "intent":Landroid/content/Intent;
    //         if-eqz v1, :cond_1
    //         invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v2
    //         const-string v3, "ItemGroupId"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v2
    //         const-string v3, "StartNum"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v2
    //         const-string v3, "EndNum"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v2
    //         const-string v3, "StartDate"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v2
    //         const-string v3, "EndDate"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v0
    //         .local v0, "extras":Landroid/os/Bundle;
    //         const-string v2, "ItemGroupId"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mItemGroupId:Ljava/lang/String;
    //         const-string v2, "StartNum"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v2
    //         iput v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mStartNum:I
    //         const-string v2, "EndNum"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v2
    //         iput v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mEndNum:I
    //         const-string v2, "StartDate"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mStartDate:Ljava/lang/String;
    //         const-string v2, "EndDate"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mEndDate:Ljava/lang/String;
    //         .end local v0    # "extras":Landroid/os/Bundle;
    //         :goto_0
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/InboxActivity;->checkIapPackage()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-virtual {v2, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->startAccountActivity(Landroid/app/Activity;)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const/16 v3, -0x3ea
    //         const-string v4, "string"
    //         const-string v5, "IDS_SAPPS_POP_AN_INVALID_VALUE_HAS_BEEN_PROVIDED_FOR_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v4, v5}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v4
    //         invoke-virtual {p0, v4}, Lcom/sec/android/iap/lib/activity/InboxActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/InboxActivity;->finish()V
    //         goto :goto_0
    */

    protected fun succeedBind() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mItemGroupId:Ljava/lang/String;
    //         iget v3, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mStartNum:I
    //         iget v4, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mEndNum:I
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mStartDate:Ljava/lang/String;
    //         iget-object v6, p0, Lcom/sec/android/iap/lib/activity/InboxActivity;->mEndDate:Ljava/lang/String;
    //         move-object v1, p0
    //         invoke-virtual/range {v0 .. v6}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->safeGetItemInboxTask(Lcom/sec/android/iap/lib/activity/BaseActivity;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    companion object {
    private val TAG: String = null!!
    }
}
