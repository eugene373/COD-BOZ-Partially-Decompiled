package com.sec.android.iap.lib.activity

// Auto-emitted from smali source: PaymentActivity.java.
// 4 fields, 7 methods.

open class PaymentActivity: com.sec.android.iap.lib.activity.BaseActivity(), com.sec.android.iap.lib.listener.OnInitIapListener {
    private var mItemGroupId: String
    private var mItemId: String
    private var mShowSuccessDialog: Boolean

    public constructor()

    private fun finishPurchase(_intent: android.content.Intent) { /* TODO(body): (Landroid/content/Intent;)V */ }
    /*
    //         .locals 8
    //         const/4 v5, 0x0
    //         const/4 v4, 0x1
    //         if-eqz p1, :cond_1
    //         invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v6
    //         .local v6, "extras":Landroid/os/Bundle;
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const-string v1, "STATUS_CODE"
    //         invoke-virtual {v6, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v1
    //         const-string v2, "ERROR_STRING"
    //         invoke-virtual {v6, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorCode()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/sec/android/iap/lib/vo/PurchaseVo;
    //         const-string v1, "RESULT_OBJECT"
    //         invoke-virtual {v6, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-direct {v0, v1}, Lcom/sec/android/iap/lib/vo/PurchaseVo;-><init>(Ljava/lang/String;)V
    //         iput-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mPurchaseVo:Lcom/sec/android/iap/lib/vo/PurchaseVo;
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mPurchaseVo:Lcom/sec/android/iap/lib/vo/PurchaseVo;
    //         iget-boolean v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mShowSuccessDialog:Z
    //         invoke-virtual {v0, p0, v1, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->verifyPurchaseResult(Lcom/sec/android/iap/lib/activity/BaseActivity;Lcom/sec/android/iap/lib/vo/PurchaseVo;Z)V
    //         .end local v6    # "extras":Landroid/os/Bundle;
    //         :goto_0
    //         return-void
    //         .restart local v6    # "extras":Landroid/os/Bundle;
    //         :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         const-string v1, "string"
    //         const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v3
    //         move-object v1, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         goto :goto_0
    //         .end local v6    # "extras":Landroid/os/Bundle;
    //         :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         const-string v1, "string"
    //         const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         const-string v3, "string"
    //         const-string v7, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"
    //         invoke-static {v3, v7}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v3
    //         invoke-virtual {p0, v3}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         const-string v3, "[Lib_Payment]"
    //         invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v3
    //         move-object v1, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const/16 v1, -0x3ea
    //         const-string v2, "string"
    //         const-string v3, "IDS_SAPPS_POP_UNKNOWN_ERROR_OCCURRED"
    //         invoke-static {v2, v3}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v2
    //         invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         goto :goto_0
    */

    protected fun onActivityResult(_requestCode: Int, _resultCode: Int, _intent: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 6
    //         const/4 v5, 0x0
    //         const/4 v3, -0x1
    //         const/4 v4, 0x1
    //         packed-switch p1, :pswitch_data_0
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :pswitch_0
    //         if-ne v3, p2, :cond_1
    //         invoke-direct {p0, p3}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->finishPurchase(Landroid/content/Intent;)V
    //         goto :goto_0
    //         :cond_1
    //         if-nez p2, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const-string v1, "string"
    //         const-string v2, "IDS_SAPPS_POP_PAYMENT_CANCELLED"
    //         invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v4, v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         const-string v1, "string"
    //         const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v3
    //         move-object v1, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         goto :goto_0
    //         :pswitch_1
    //         sget-object v0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->TAG:Ljava/lang/String;
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         const-string v2, "Samsung Account Result : "
    //         invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         if-ne v3, p2, :cond_2
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->bindIapService()V
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const-string v1, "string"
    //         const-string v2, "IDS_SAPPS_POP_PAYMENT_CANCELLED"
    //         invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {v0, v4, v1}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         const-string v1, "string"
    //         const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         const-string v1, "string"
    //         const-string v3, "IDS_SAPPS_POP_PAYMENT_CANCELLED"
    //         invoke-static {v1, v3}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v3
    //         move-object v1, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         goto :goto_0
    //         nop
    //         :pswitch_data_0
    //         .packed-switch 0x1
    //             :pswitch_0
    //             :pswitch_1
    //         .end packed-switch
    */

    protected fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 6
    //         invoke-super {p0, p1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->onCreate(Landroid/os/Bundle;)V
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getIntent()Landroid/content/Intent;
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
    //         const-string v3, "ItemId"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v2
    //         const-string v3, "ShowSuccessDialog"
    //         invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v2
    //         if-eqz v2, :cond_1
    //         invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v0
    //         .local v0, "extras":Landroid/os/Bundle;
    //         const-string v2, "ItemGroupId"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mItemGroupId:Ljava/lang/String;
    //         const-string v2, "ItemId"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         iput-object v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mItemId:Ljava/lang/String;
    //         const-string v2, "ShowSuccessDialog"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
    //         move-result v2
    //         iput-boolean v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mShowSuccessDialog:Z
    //         .end local v0    # "extras":Landroid/os/Bundle;
    //         :goto_0
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-virtual {v2, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->setOnInitIapListener(Lcom/sec/android/iap/lib/listener/OnInitIapListener;)V
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->checkIapPackage()Z
    //         move-result v2
    //         if-eqz v2, :cond_0
    //         sget-object v2, Lcom/sec/android/iap/lib/activity/PaymentActivity;->TAG:Ljava/lang/String;
    //         const-string v3, "Samsung Account Login..."
    //         invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-virtual {v2, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->startAccountActivity(Landroid/app/Activity;)V
    //         :cond_0
    //         return-void
    //         :cond_1
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const/16 v3, -0x3ea
    //         const-string v4, "string"
    //         const-string v5, "IDS_SAPPS_POP_AN_INVALID_VALUE_HAS_BEEN_PROVIDED_FOR_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v4, v5}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v4
    //         invoke-virtual {p0, v4}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v2, v3, v4}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/PaymentActivity;->finish()V
    //         goto :goto_0
    */

    public fun onSucceedInitIap() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         const/4 v1, 0x1
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mItemGroupId:Ljava/lang/String;
    //         iget-object v3, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mItemId:Ljava/lang/String;
    //         invoke-virtual {v0, p0, v1, v2, v3}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->startPaymentActivity(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;)V
    //         return-void
    */

    protected fun succeedBind() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/PaymentActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-virtual {v0, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->safeInitIap(Lcom/sec/android/iap/lib/activity/BaseActivity;)V
    //         return-void
    */

    companion object {
    private val TAG: String = null!!
    }
}
