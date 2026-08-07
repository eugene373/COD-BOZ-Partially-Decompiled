package com.sec.android.iap.lib.activity

// Auto-emitted from smali source: BaseActivity.java.
// 9 fields, 13 methods.

open class BaseActivity: android.app.Activity() {
    protected var mErrorVo: com.sec.android.iap.lib.vo.ErrorVo
    private var mIapMode: Int
    protected var mInbox: java.util.ArrayList
    protected var mItemList: java.util.ArrayList
    private var mProgressDialog: android.app.Dialog
    protected var mPurchaseVo: com.sec.android.iap.lib.vo.PurchaseVo
    var mSamsungIapHelper: com.sec.android.iap.lib.helper.SamsungIapHelper
    protected var mShowProgressDialog: Boolean

    public constructor()

    public fun bindIapService() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/sec/android/iap/lib/activity/BaseActivity;->TAG:Ljava/lang/String;
    //         const-string v1, "start Bind... "
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         new-instance v1, Lcom/sec/android/iap/lib/activity/BaseActivity$1;
    //         invoke-direct {v1, p0}, Lcom/sec/android/iap/lib/activity/BaseActivity$1;-><init>(Lcom/sec/android/iap/lib/activity/BaseActivity;)V
    //         invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->bindIapService(Lcom/sec/android/iap/lib/listener/OnIapBindListener;)V
    //         return-void
    */

    public fun checkIapPackage(): Boolean { return TODO("body: ()Z") }
    /*
    //         .locals 6
    //         const/4 v4, 0x1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-virtual {v0, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->isInstalledIapPackage(Landroid/content/Context;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-virtual {v0, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->isValidIapPackage(Landroid/content/Context;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         :goto_0
    //         return v4
    //         :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const/16 v1, -0x3ea
    //         const-string v2, "string"
    //         const-string v3, "IDS_SAPPS_POP_YOUR_PURCHASE_VIA_SAMSUNG_IN_APP_PURCHASE_IS_INVALID_A_FAKE_APPLICATION_HAS_BEEN_DETECTED_CHECK_THE_APP_MSG"
    //         invoke-static {v2, v3}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v2
    //         invoke-virtual {p0, v2}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         const-string v1, "string"
    //         const-string v2, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v1, v2}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         const-string v1, "string"
    //         const-string v3, "IDS_SAPPS_POP_YOUR_PURCHASE_VIA_SAMSUNG_IN_APP_PURCHASE_IS_INVALID_A_FAKE_APPLICATION_HAS_BEEN_DETECTED_CHECK_THE_APP_MSG"
    //         invoke-static {v1, v3}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v1
    //         invoke-virtual {p0, v1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v3
    //         const/4 v5, 0x0
    //         move-object v1, p0
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         :goto_1
    //         const/4 v4, 0x0
    //         goto :goto_0
    //         :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-virtual {v0, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->installIapPackage(Lcom/sec/android/iap/lib/activity/BaseActivity;)V
    //         goto :goto_1
    */

    protected fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 6
    //         invoke-virtual {p0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getIntent()Landroid/content/Intent;
    //         move-result-object v2
    //         .local v2, "intent":Landroid/content/Intent;
    //         if-eqz v2, :cond_0
    //         invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v3
    //         if-eqz v3, :cond_0
    //         invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v3
    //         const-string v4, "IapMode"
    //         invoke-virtual {v3, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v3
    //         if-eqz v3, :cond_0
    //         invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v1
    //         .local v1, "extras":Landroid/os/Bundle;
    //         const-string v3, "IapMode"
    //         invoke-virtual {v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v3
    //         iput v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mIapMode:I
    //         .end local v1    # "extras":Landroid/os/Bundle;
    //         :cond_0
    //         iget v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mIapMode:I
    //         invoke-static {p0, v3}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getInstance(Landroid/content/Context;I)Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         move-result-object v3
    //         iput-object v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         sget-boolean v3, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mShowProgressDialog:Z
    //         iput-boolean v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mShowProgressDialog:Z
    //         iget-boolean v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mShowProgressDialog:Z
    //         if-eqz v3, :cond_1
    //         :try_start_0
    //         new-instance v3, Landroid/app/Dialog;
    //         const-string v4, "style"
    //         const-string v5, "Theme_Empty"
    //         invoke-static {v4, v5}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v4
    //         invoke-direct {v3, p0, v4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V
    //         iput-object v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;
    //         iget-object v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;
    //         const-string v4, "layout"
    //         const-string v5, "progress_dialog"
    //         invoke-static {v4, v5}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v4
    //         invoke-virtual {v3, v4}, Landroid/app/Dialog;->setContentView(I)V
    //         iget-object v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;
    //         const/4 v4, 0x0
    //         invoke-virtual {v3, v4}, Landroid/app/Dialog;->setCancelable(Z)V
    //         iget-object v3, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;
    //         invoke-virtual {v3}, Landroid/app/Dialog;->show()V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_1
    //         :goto_0
    //         invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         goto :goto_0
    */

    protected fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 7
    //         const/4 v6, 0x0
    //         iget-boolean v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mShowProgressDialog:Z
    //         if-eqz v4, :cond_0
    //         :try_start_0
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;
    //         if-eqz v4, :cond_0
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;
    //         invoke-virtual {v4}, Landroid/app/Dialog;->dismiss()V
    //         const/4 v4, 0x0
    //         iput-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mProgressDialog:Landroid/app/Dialog;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :cond_0
    //         :goto_0
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         if-eqz v4, :cond_4
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-virtual {v4}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getOnGetInboxListener()Lcom/sec/android/iap/lib/listener/OnGetInboxListener;
    //         move-result-object v1
    //         .local v1, "onGetInboxListener":Lcom/sec/android/iap/lib/listener/OnGetInboxListener;
    //         if-eqz v1, :cond_1
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mInbox:Ljava/util/ArrayList;
    //         invoke-interface {v1, v4, v5}, Lcom/sec/android/iap/lib/listener/OnGetInboxListener;->onGetItemInbox(Lcom/sec/android/iap/lib/vo/ErrorVo;Ljava/util/ArrayList;)V
    //         :cond_1
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-virtual {v4}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getOnGetItemListener()Lcom/sec/android/iap/lib/listener/OnGetItemListener;
    //         move-result-object v2
    //         .local v2, "onItemListener":Lcom/sec/android/iap/lib/listener/OnGetItemListener;
    //         if-eqz v2, :cond_2
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mItemList:Ljava/util/ArrayList;
    //         invoke-interface {v2, v4, v5}, Lcom/sec/android/iap/lib/listener/OnGetItemListener;->onGetItem(Lcom/sec/android/iap/lib/vo/ErrorVo;Ljava/util/ArrayList;)V
    //         :cond_2
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-virtual {v4}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->getOnPaymentListener()Lcom/sec/android/iap/lib/listener/OnPaymentListener;
    //         move-result-object v3
    //         .local v3, "onPaymentListener":Lcom/sec/android/iap/lib/listener/OnPaymentListener;
    //         if-eqz v3, :cond_3
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mPurchaseVo:Lcom/sec/android/iap/lib/vo/PurchaseVo;
    //         invoke-interface {v3, v4, v5}, Lcom/sec/android/iap/lib/listener/OnPaymentListener;->onPayment(Lcom/sec/android/iap/lib/vo/ErrorVo;Lcom/sec/android/iap/lib/vo/PurchaseVo;)V
    //         :cond_3
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-virtual {v4}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->removeAllListener()V
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-virtual {v4}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->dispose()V
    //         iput-object v6, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mSamsungIapHelper:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         .end local v1    # "onGetInboxListener":Lcom/sec/android/iap/lib/listener/OnGetInboxListener;
    //         .end local v2    # "onItemListener":Lcom/sec/android/iap/lib/listener/OnGetItemListener;
    //         .end local v3    # "onPaymentListener":Lcom/sec/android/iap/lib/listener/OnPaymentListener;
    //         :cond_4
    //         invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         goto :goto_0
    */

    public fun setErrorVo(_errorVo: com.sec.android.iap.lib.vo.ErrorVo) { /* TODO(body): (Lcom/sec/android/iap/lib/vo/ErrorVo;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         return-void
    */

    public fun setInbox(p0: java.util.ArrayList) { /* TODO(body): (Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/sec/android/iap/lib/vo/InboxVo;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .local p1, "_inbox":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/sec/android/iap/lib/vo/InboxVo;>;"
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mInbox:Ljava/util/ArrayList;
    //         return-void
    */

    public fun setItemList(p0: java.util.ArrayList) { /* TODO(body): (Ljava/util/ArrayList;)V */ }
    /*
    //         .locals 0
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Ljava/util/ArrayList",
    //                 "<",
    //                 "Lcom/sec/android/iap/lib/vo/ItemVo;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         .local p1, "_itemList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/sec/android/iap/lib/vo/ItemVo;>;"
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mItemList:Ljava/util/ArrayList;
    //         return-void
    */

    public fun setPurchaseVo(_purchaseVo: com.sec.android.iap.lib.vo.PurchaseVo) { /* TODO(body): (Lcom/sec/android/iap/lib/vo/PurchaseVo;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mPurchaseVo:Lcom/sec/android/iap/lib/vo/PurchaseVo;
    //         return-void
    */

    public fun setShowProgressDialog(enable: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 0
    //         iput-boolean p1, p0, Lcom/sec/android/iap/lib/activity/BaseActivity;->mShowProgressDialog:Z
    //         return-void
    */

    fun succeedBind()

    companion object {
    private val TAG: String = null!!
    }
}
