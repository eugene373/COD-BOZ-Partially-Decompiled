package com.sec.android.iap.lib.activity

// Auto-emitted from smali source: ItemActivity.java.
// 5 fields, 4 methods.

open class ItemActivity: com.sec.android.iap.lib.activity.BaseActivity() {
    private var mEndNum: Int
    private var mItemGroupId: String
    private var mItemType: String
    private var mStartNum: Int

    public constructor()

    protected fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 6
    //         invoke-super {p0, p1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->onCreate(Landroid/os/Bundle;)V
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/ItemActivity;->getIntent()Landroid/content/Intent;
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
    //         const-string v3, "ItemType"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v0
    //         .local v0, "extras":Landroid/os/Bundle;
    //         const-string v2, "ItemGroupId"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/sec/android/iap/lib/activity/ItemActivity;->mItemGroupId:Ljava/lang/String;
    //         const-string v2, "StartNum"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v2
    //         iput v2, p0, Lcom/sec/android/iap/lib/activity/ItemActivity;->mStartNum:I
    //         const-string v2, "EndNum"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v2
    //         iput v2, p0, Lcom/sec/android/iap/lib/activity/ItemActivity;->mEndNum:I
    //         const-string v2, "ItemType"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/sec/android/iap/lib/activity/ItemActivity;->mItemType:Ljava/lang/String;
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/ItemActivity;->checkIapPackage()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/ItemActivity;->bindIapService()V
    //         .end local v0    # "extras":Landroid/os/Bundle;
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/activity/ItemActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const/16 v3, -0x3ea
    //         const-string v4, "string"
    //         const-string v5, "IDS_SAPPS_POP_AN_INVALID_VALUE_HAS_BEEN_PROVIDED_FOR_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v4, v5}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v4
    //         invoke-virtual {p0, v4}, Lcom/sec/android/iap/lib/activity/ItemActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/ItemActivity;->finish()V
    //         goto :goto_0
    */

    protected fun succeedBind() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/ItemActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/activity/ItemActivity;->mItemGroupId:Ljava/lang/String;
    //         iget v3, p0, Lcom/sec/android/iap/lib/activity/ItemActivity;->mStartNum:I
    //         iget v4, p0, Lcom/sec/android/iap/lib/activity/ItemActivity;->mEndNum:I
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/activity/ItemActivity;->mItemType:Ljava/lang/String;
    //         move-object v1, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->safeGetItemList(Lcom/sec/android/iap/lib/activity/BaseActivity;Ljava/lang/String;IILjava/lang/String;)V
    //         return-void
    */

    companion object {
    private val TAG: String = null!!
    }
}
