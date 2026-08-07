package com.sec.android.iap.lib.helper

// Auto-emitted from smali source: SamsungIapHelper.java.
// 53 fields, 39 methods.

open class SamsungIapHelper {
    private var mContext: android.content.Context
    private var mGetInboxListTask: com.sec.android.iap.lib.helper.SamsungIapHelper.GetInboxListTask
    private var mGetItemListTask: com.sec.android.iap.lib.helper.SamsungIapHelper.GetItemListTask
    private var mIapConnector: com.sec.android.iap.IAPConnector
    private var mInitIapTask: com.sec.android.iap.lib.helper.SamsungIapHelper.InitIapTask
    private var mMode: Int
    private var mOnGetInboxListener: com.sec.android.iap.lib.listener.OnGetInboxListener
    private var mOnGetItemListener: com.sec.android.iap.lib.listener.OnGetItemListener
    private var mOnInitIapListener: com.sec.android.iap.lib.listener.OnInitIapListener
    private var mOnPaymentListener: com.sec.android.iap.lib.listener.OnPaymentListener
    private var mServiceConn: android.content.ServiceConnection
    private var mState: Int
    private var mVerifyClientToServer: com.sec.android.iap.lib.helper.SamsungIapHelper.VerifyClientToServer

    private constructor(_context: android.content.Context, _mode: Int)

    private fun _setContextAndMode(_context: android.content.Context, _mode: Int) { /* TODO(body): (Landroid/content/Context;I)V */ }
    /*
    //         .locals 1
    //         invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
    //         move-result-object v0
    //         iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;
    //         iput p2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mMode:I
    //         return-void
    */

    private fun stopTasksIfNotFinished() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->getStatus()Landroid/os/AsyncTask$Status;
    //         move-result-object v0
    //         sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;
    //         if-eq v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;
    //         invoke-virtual {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->cancel(Z)Z
    //         :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->getStatus()Landroid/os/AsyncTask$Status;
    //         move-result-object v0
    //         sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;
    //         if-eq v0, v1, :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;
    //         invoke-virtual {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->cancel(Z)Z
    //         :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->getStatus()Landroid/os/AsyncTask$Status;
    //         move-result-object v0
    //         sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;
    //         if-eq v0, v1, :cond_2
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;
    //         invoke-virtual {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->cancel(Z)Z
    //         :cond_2
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->getStatus()Landroid/os/AsyncTask$Status;
    //         move-result-object v0
    //         sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;
    //         if-eq v0, v1, :cond_3
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;
    //         invoke-virtual {v0, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->cancel(Z)Z
    //         :cond_3
    //         return-void
    */

    public fun bindIapService(_listener: com.sec.android.iap.lib.listener.OnIapBindListener) { /* TODO(body): (Lcom/sec/android/iap/lib/listener/OnIapBindListener;)V */ }
    /*
    //         .locals 4
    //         const/4 v3, 0x1
    //         iget v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mState:I
    //         if-lt v1, v3, :cond_1
    //         if-eqz p1, :cond_0
    //         const/4 v1, 0x0
    //         invoke-interface {p1, v1}, Lcom/sec/android/iap/lib/listener/OnIapBindListener;->onBindIapFinished(I)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         new-instance v1, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;
    //         invoke-direct {v1, p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$1;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/lib/listener/OnIapBindListener;)V
    //         iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mServiceConn:Landroid/content/ServiceConnection;
    //         new-instance v0, Landroid/content/Intent;
    //         const-string v1, "com.sec.android.iap.service.iapService"
    //         invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         .local v0, "serviceIntent":Landroid/content/Intent;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mServiceConn:Landroid/content/ServiceConnection;
    //         invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //         goto :goto_0
    */

    public fun dispose() { /* TODO(body): ()V */ }
    /*
    //         .locals 3
    //         const/4 v2, 0x0
    //         invoke-direct {p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->stopTasksIfNotFinished()V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mServiceConn:Landroid/content/ServiceConnection;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mServiceConn:Landroid/content/ServiceConnection;
    //         invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         :cond_0
    //         const/4 v0, 0x0
    //         iput v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mState:I
    //         iput-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mServiceConn:Landroid/content/ServiceConnection;
    //         iput-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mIapConnector:Lcom/sec/android/iap/IAPConnector;
    //         return-void
    */

    public fun getItemInboxList(_itemGroupId: String, _startNum: Int, _endNum: Int, _startDate: String, _endDate: String, _onGetInboxListener: com.sec.android.iap.lib.listener.OnGetInboxListener) { /* TODO(body): (Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/sec/android/iap/lib/listener/OnGetInboxListener;)V */ }
    /*
    //         .locals 4
    //         if-nez p6, :cond_0
    //         :try_start_0
    //         new-instance v2, Ljava/lang/Exception;
    //         const-string v3, "OnGetInboxListener is null"
    //         invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
    //         throw v2
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         .end local v0    # "e":Ljava/lang/Exception;
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_1
    //         invoke-virtual {p0, p6}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->setOnGetInboxListener(Lcom/sec/android/iap/lib/listener/OnGetInboxListener;)V
    //         new-instance v1, Landroid/content/Intent;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;
    //         const-class v3, Lcom/sec/android/iap/lib/activity/InboxActivity;
    //         invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    //         .local v1, "intent":Landroid/content/Intent;
    //         const-string v2, "ItemGroupId"
    //         invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v2, "IapMode"
    //         iget v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mMode:I
    //         invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         const-string v2, "StartNum"
    //         invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         const-string v2, "EndNum"
    //         invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         const-string v2, "StartDate"
    //         invoke-virtual {v1, v2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v2, "EndDate"
    //         invoke-virtual {v1, v2, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const/high16 v2, 0x10000000
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;
    //         invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    */

    public fun getItemList(_itemGroupId: String, _startNum: Int, _endNum: Int, _itemType: String): android.os.Bundle { return TODO("body: (Ljava/lang/String;IILjava/lang/String;)Landroid/os/Bundle;") }
    /*
    //         .locals 9
    //         const/4 v8, 0x0
    //         .local v8, "itemList":Landroid/os/Bundle;
    //         :try_start_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mIapConnector:Lcom/sec/android/iap/IAPConnector;
    //         iget v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mMode:I
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;
    //         invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v2
    //         move-object v3, p1
    //         move v4, p2
    //         move v5, p3
    //         move-object v6, p4
    //         invoke-interface/range {v0 .. v6}, Lcom/sec/android/iap/IAPConnector;->getItemList(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)Landroid/os/Bundle;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v8
    //         :goto_0
    //         return-object v8
    //         :catch_0
    //         move-exception v7
    //         .local v7, "e":Landroid/os/RemoteException;
    //         invoke-virtual {v7}, Landroid/os/RemoteException;->printStackTrace()V
    //         goto :goto_0
    */

    public fun getItemList(_itemGroupId: String, _startNum: Int, _endNum: Int, _itemType: String, _mode: Int, _onGetItemListener: com.sec.android.iap.lib.listener.OnGetItemListener) { /* TODO(body): (Ljava/lang/String;IILjava/lang/String;ILcom/sec/android/iap/lib/listener/OnGetItemListener;)V */ }
    /*
    //         .locals 4
    //         if-nez p6, :cond_0
    //         :try_start_0
    //         new-instance v2, Ljava/lang/Exception;
    //         const-string v3, "OnGetItemListener is null"
    //         invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
    //         throw v2
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         .end local v0    # "e":Ljava/lang/Exception;
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_1
    //         invoke-virtual {p0, p6}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->setOnGetItemListener(Lcom/sec/android/iap/lib/listener/OnGetItemListener;)V
    //         new-instance v1, Landroid/content/Intent;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;
    //         const-class v3, Lcom/sec/android/iap/lib/activity/ItemActivity;
    //         invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    //         .local v1, "intent":Landroid/content/Intent;
    //         const-string v2, "ItemGroupId"
    //         invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v2, "StartNum"
    //         invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         const-string v2, "EndNum"
    //         invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         const-string v2, "ItemType"
    //         invoke-virtual {v1, v2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v2, "IapMode"
    //         invoke-virtual {v1, v2, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         const/high16 v2, 0x10000000
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;
    //         invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    */

    public fun getItemsInbox(_itemGroupId: String, _startNum: Int, _endNum: Int, _startDate: String, _endDate: String): android.os.Bundle { return TODO("body: (Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;") }
    /*
    //         .locals 9
    //         const/4 v8, 0x0
    //         .local v8, "purchaseItemList":Landroid/os/Bundle;
    //         :try_start_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mIapConnector:Lcom/sec/android/iap/IAPConnector;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         move-object v2, p1
    //         move v3, p2
    //         move v4, p3
    //         move-object v5, p4
    //         move-object v6, p5
    //         invoke-interface/range {v0 .. v6}, Lcom/sec/android/iap/IAPConnector;->getItemsInbox(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v8
    //         :goto_0
    //         return-object v8
    //         :catch_0
    //         move-exception v7
    //         .local v7, "e":Landroid/os/RemoteException;
    //         invoke-virtual {v7}, Landroid/os/RemoteException;->printStackTrace()V
    //         goto :goto_0
    */

    public fun getOnGetInboxListener(): com.sec.android.iap.lib.listener.OnGetInboxListener { return TODO("body: ()Lcom/sec/android/iap/lib/listener/OnGetInboxListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetInboxListener:Lcom/sec/android/iap/lib/listener/OnGetInboxListener;
    //         return-object v0
    */

    public fun getOnGetItemListener(): com.sec.android.iap.lib.listener.OnGetItemListener { return TODO("body: ()Lcom/sec/android/iap/lib/listener/OnGetItemListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetItemListener:Lcom/sec/android/iap/lib/listener/OnGetItemListener;
    //         return-object v0
    */

    public fun getOnPaymentListener(): com.sec.android.iap.lib.listener.OnPaymentListener { return TODO("body: ()Lcom/sec/android/iap/lib/listener/OnPaymentListener;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnPaymentListener:Lcom/sec/android/iap/lib/listener/OnPaymentListener;
    //         return-object v0
    */

    public fun init(_errorVo: com.sec.android.iap.lib.vo.ErrorVo) { /* TODO(body): (Lcom/sec/android/iap/lib/vo/ErrorVo;)V */ }
    /*
    //         .locals 4
    //         :try_start_0
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mIapConnector:Lcom/sec/android/iap/IAPConnector;
    //         iget v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mMode:I
    //         invoke-interface {v2, v3}, Lcom/sec/android/iap/IAPConnector;->init(I)Landroid/os/Bundle;
    //         move-result-object v0
    //         .local v0, "bundle":Landroid/os/Bundle;
    //         if-eqz v0, :cond_0
    //         const-string v2, "STATUS_CODE"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    //         move-result v2
    //         const-string v3, "ERROR_STRING"
    //         invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p1, v2, v3}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         const-string v2, "IAP_UPGRADE_URL"
    //         invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {p1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setExtraString(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         .end local v0    # "bundle":Landroid/os/Bundle;
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v1
    //         .local v1, "e":Landroid/os/RemoteException;
    //         invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V
    //         goto :goto_0
    */

    public fun installIapPackage(_activity: com.sec.android.iap.lib.activity.BaseActivity) { /* TODO(body): (Lcom/sec/android/iap/lib/activity/BaseActivity;)V */ }
    /*
    //         .locals 7
    //         const/4 v4, 0x1
    //         new-instance v5, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$2;
    //         invoke-direct {v5, p0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$2;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;)V
    //         .local v5, "OkBtnRunnable":Ljava/lang/Runnable;
    //         new-instance v6, Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-direct {v6}, Lcom/sec/android/iap/lib/vo/ErrorVo;-><init>()V
    //         .local v6, "errorVo":Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {p1, v6}, Lcom/sec/android/iap/lib/activity/BaseActivity;->setErrorVo(Lcom/sec/android/iap/lib/vo/ErrorVo;)V
    //         const-string v0, "string"
    //         const-string v1, "IDS_SAPPS_POP_PAYMENT_CANCELLED"
    //         invoke-static {v0, v1}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v0
    //         invoke-virtual {p1, v0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v0
    //         invoke-virtual {v6, v4, v0}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         const-string v0, "string"
    //         const-string v1, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v0, v1}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v0
    //         invoke-virtual {p1, v0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         const-string v0, "string"
    //         const-string v1, "IDS_SAPPS_POP_TO_PURCHASE_ITEMS_YOU_NEED_TO_INSTALL_SAMSUNG_IN_APP_PURCHASE_INSTALL_Q"
    //         invoke-static {v0, v1}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v0
    //         invoke-virtual {p1, v0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v3
    //         move-object v0, p0
    //         move-object v1, p1
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         return-void
    */

    public fun isInstalledIapPackage(_context: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 4
    //         invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v1
    //         .local v1, "pm":Landroid/content/pm/PackageManager;
    //         :try_start_0
    //         const-string v2, "com.sec.android.iap"
    //         const/16 v3, 0x80
    //         invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         const/4 v2, 0x1
    //         :goto_0
    //         return v2
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    //         invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
    //         const/4 v2, 0x0
    //         goto :goto_0
    */

    public fun isValidIapPackage(_context: android.content.Context): Boolean { return TODO("body: (Landroid/content/Context;)Z") }
    /*
    //         .locals 6
    //         const/4 v1, 0x1
    //         .local v1, "result":Z
    //         :try_start_0
    //         invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v3
    //         const-string v4, "com.sec.android.iap"
    //         const/16 v5, 0x40
    //         invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         move-result-object v3
    //         iget-object v2, v3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
    //         .local v2, "sigs":[Landroid/content/pm/Signature;
    //         const/4 v3, 0x0
    //         aget-object v3, v2, v3
    //         invoke-virtual {v3}, Landroid/content/pm/Signature;->hashCode()I
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v3
    //         const v4, 0x7a7eaf4b
    //         if-eq v3, v4, :cond_0
    //         const/4 v1, 0x0
    //         .end local v2    # "sigs":[Landroid/content/pm/Signature;
    //         :cond_0
    //         :goto_0
    //         return v1
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         const/4 v1, 0x0
    //         goto :goto_0
    */

    public fun removeAllListener() { /* TODO(body): ()V */ }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetInboxListener:Lcom/sec/android/iap/lib/listener/OnGetInboxListener;
    //         iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetItemListener:Lcom/sec/android/iap/lib/listener/OnGetItemListener;
    //         iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnPaymentListener:Lcom/sec/android/iap/lib/listener/OnPaymentListener;
    //         return-void
    */

    public fun safeGetItemInboxTask(_activity: com.sec.android.iap.lib.activity.BaseActivity, _itemGroupId: String, _startNum: Int, _endNum: Int, _startDate: String, _endDate: String) { /* TODO(body): (Lcom/sec/android/iap/lib/activity/BaseActivity;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 9
    //         :try_start_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->getStatus()Landroid/os/AsyncTask$Status;
    //         move-result-object v0
    //         sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;
    //         if-eq v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->cancel(Z)Z
    //         :cond_0
    //         new-instance v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v3, p2
    //         move v4, p3
    //         move v5, p4
    //         move-object v6, p5
    //         move-object v7, p6
    //         invoke-direct/range {v0 .. v7}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/lib/activity/BaseActivity;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    //         iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetInboxListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;
    //         const/4 v1, 0x0
    //         new-array v1, v1, [Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetInboxListTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v8
    //         .local v8, "e":Ljava/lang/Exception;
    //         if-eqz p1, :cond_1
    //         invoke-virtual {p1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->finish()V
    //         :cond_1
    //         invoke-virtual {v8}, Ljava/lang/Exception;->printStackTrace()V
    //         goto :goto_0
    */

    public fun safeGetItemList(_activity: com.sec.android.iap.lib.activity.BaseActivity, _itemGroupId: String, _startNum: Int, _endNum: Int, _itemType: String) { /* TODO(body): (Lcom/sec/android/iap/lib/activity/BaseActivity;Ljava/lang/String;IILjava/lang/String;)V */ }
    /*
    //         .locals 8
    //         :try_start_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->getStatus()Landroid/os/AsyncTask$Status;
    //         move-result-object v0
    //         sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;
    //         if-eq v0, v1, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;
    //         const/4 v1, 0x1
    //         invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->cancel(Z)Z
    //         :cond_0
    //         new-instance v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;
    //         move-object v1, p0
    //         move-object v2, p1
    //         move-object v3, p2
    //         move v4, p3
    //         move v5, p4
    //         move-object v6, p5
    //         invoke-direct/range {v0 .. v6}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/lib/activity/BaseActivity;Ljava/lang/String;IILjava/lang/String;)V
    //         iput-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mGetItemListTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;
    //         const/4 v1, 0x0
    //         new-array v1, v1, [Ljava/lang/String;
    //         invoke-virtual {v0, v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$GetItemListTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v7
    //         .local v7, "e":Ljava/lang/Exception;
    //         if-eqz p1, :cond_1
    //         invoke-virtual {p1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->finish()V
    //         :cond_1
    //         invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V
    //         goto :goto_0
    */

    public fun safeInitIap(_activity: com.sec.android.iap.lib.activity.BaseActivity) { /* TODO(body): (Lcom/sec/android/iap/lib/activity/BaseActivity;)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;
    //         invoke-virtual {v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->getStatus()Landroid/os/AsyncTask$Status;
    //         move-result-object v1
    //         sget-object v2, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;
    //         if-eq v1, v2, :cond_0
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->cancel(Z)Z
    //         :cond_0
    //         new-instance v1, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;
    //         invoke-direct {v1, p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/lib/activity/BaseActivity;)V
    //         iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInitIapTask:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;
    //         const/4 v2, 0x0
    //         new-array v2, v2, [Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$InitIapTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         if-eqz p1, :cond_1
    //         invoke-virtual {p1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->finish()V
    //         :cond_1
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         goto :goto_0
    */

    public fun setOnGetInboxListener(_onGetInboxListener: com.sec.android.iap.lib.listener.OnGetInboxListener) { /* TODO(body): (Lcom/sec/android/iap/lib/listener/OnGetInboxListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetInboxListener:Lcom/sec/android/iap/lib/listener/OnGetInboxListener;
    //         return-void
    */

    public fun setOnGetItemListener(_onGetItemListener: com.sec.android.iap.lib.listener.OnGetItemListener) { /* TODO(body): (Lcom/sec/android/iap/lib/listener/OnGetItemListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnGetItemListener:Lcom/sec/android/iap/lib/listener/OnGetItemListener;
    //         return-void
    */

    public fun setOnInitIapListener(_onInitIapListener: com.sec.android.iap.lib.listener.OnInitIapListener) { /* TODO(body): (Lcom/sec/android/iap/lib/listener/OnInitIapListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnInitIapListener:Lcom/sec/android/iap/lib/listener/OnInitIapListener;
    //         return-void
    */

    public fun setOnPaymentListener(_onPaymentListener: com.sec.android.iap.lib.listener.OnPaymentListener) { /* TODO(body): (Lcom/sec/android/iap/lib/listener/OnPaymentListener;)V */ }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mOnPaymentListener:Lcom/sec/android/iap/lib/listener/OnPaymentListener;
    //         return-void
    */

    public fun showIapDialog(_activity: android.app.Activity, _title: String, _message: String, _finishActivity: Boolean, _onClickRunable: Runnable) { /* TODO(body): (Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V */ }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/app/AlertDialog$Builder;
    //         invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
    //         .local v0, "alert":Landroid/app/AlertDialog$Builder;
    //         invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //         invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
    //         const v2, 0x104000a
    //         new-instance v3, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$3;
    //         invoke-direct {v3, p0, p5, p4, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$3;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Ljava/lang/Runnable;ZLandroid/app/Activity;)V
    //         invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
    //         if-eqz p4, :cond_0
    //         new-instance v2, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$4;
    //         invoke-direct {v2, p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$4;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Landroid/app/Activity;)V
    //         invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;
    //         :cond_0
    //         :try_start_0
    //         invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v1
    //         .local v1, "e":Ljava/lang/Exception;
    //         invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    //         goto :goto_0
    */

    public fun startAccountActivity(_activity: android.app.Activity) { /* TODO(body): (Landroid/app/Activity;)V */ }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/content/ComponentName;
    //         const-string v2, "com.sec.android.iap"
    //         const-string v3, "com.sec.android.iap.activity.AccountActivity"
    //         invoke-direct {v0, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         .local v0, "com":Landroid/content/ComponentName;
    //         new-instance v1, Landroid/content/Intent;
    //         invoke-direct {v1}, Landroid/content/Intent;-><init>()V
    //         .local v1, "intent":Landroid/content/Intent;
    //         invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         const/4 v2, 0x2
    //         invoke-virtual {p1, v1, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         return-void
    */

    public fun startPayment(_itemGroupId: String, _itemId: String, _showSuccessDialog: Boolean, _onPaymentListener: com.sec.android.iap.lib.listener.OnPaymentListener) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;ZLcom/sec/android/iap/lib/listener/OnPaymentListener;)V */ }
    /*
    //         .locals 4
    //         if-nez p4, :cond_0
    //         :try_start_0
    //         new-instance v2, Ljava/lang/Exception;
    //         const-string v3, "OnPaymentListener is null"
    //         invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
    //         throw v2
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         .end local v0    # "e":Ljava/lang/Exception;
    //         :goto_0
    //         return-void
    //         :cond_0
    //         :try_start_1
    //         invoke-virtual {p0, p4}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->setOnPaymentListener(Lcom/sec/android/iap/lib/listener/OnPaymentListener;)V
    //         new-instance v1, Landroid/content/Intent;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;
    //         const-class v3, Lcom/sec/android/iap/lib/activity/PaymentActivity;
    //         invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    //         .local v1, "intent":Landroid/content/Intent;
    //         const-string v2, "ItemGroupId"
    //         invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v2, "ItemId"
    //         invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //         const-string v2, "ShowSuccessDialog"
    //         invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
    //         const-string v2, "IapMode"
    //         iget v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mMode:I
    //         invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
    //         const/high16 v2, 0x10000000
    //         invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;
    //         invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    //         goto :goto_0
    */

    public fun startPaymentActivity(_activity: android.app.Activity, _requestCode: Int, _itemGroupId: String, _itemId: String) { /* TODO(body): (Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 6
    //         :try_start_0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         .local v0, "bundle":Landroid/os/Bundle;
    //         const-string v4, "THIRD_PARTY_NAME"
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mContext:Landroid/content/Context;
    //         invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v0, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v4, "ITEM_GROUP_ID"
    //         invoke-virtual {v0, v4, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         const-string v4, "ITEM_ID"
    //         invoke-virtual {v0, v4, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         new-instance v1, Landroid/content/ComponentName;
    //         const-string v4, "com.sec.android.iap"
    //         const-string v5, "com.sec.android.iap.activity.PaymentMethodListActivity"
    //         invoke-direct {v1, v4, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         .local v1, "com":Landroid/content/ComponentName;
    //         new-instance v3, Landroid/content/Intent;
    //         const-string v4, "android.intent.action.MAIN"
    //         invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
    //         .local v3, "intent":Landroid/content/Intent;
    //         const-string v4, "android.intent.category.LAUNCHER"
    //         invoke-virtual {v3, v4}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
    //         invoke-virtual {v3, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
    //         invoke-virtual {v3, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    //         invoke-virtual {p1, v3, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         .end local v0    # "bundle":Landroid/os/Bundle;
    //         .end local v1    # "com":Landroid/content/ComponentName;
    //         .end local v3    # "intent":Landroid/content/Intent;
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v2
    //         .local v2, "e":Ljava/lang/Exception;
    //         invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
    //         goto :goto_0
    */

    public fun verifyPurchaseResult(_activity: com.sec.android.iap.lib.activity.BaseActivity, _purchaseVO: com.sec.android.iap.lib.vo.PurchaseVo, _showSuccessDialog: Boolean) { /* TODO(body): (Lcom/sec/android/iap/lib/activity/BaseActivity;Lcom/sec/android/iap/lib/vo/PurchaseVo;Z)V */ }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;
    //         invoke-virtual {v1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->getStatus()Landroid/os/AsyncTask$Status;
    //         move-result-object v1
    //         sget-object v2, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;
    //         if-eq v1, v2, :cond_0
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->cancel(Z)Z
    //         :cond_0
    //         new-instance v1, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;
    //         invoke-direct {v1, p0, p1, p2, p3}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;-><init>(Lcom/sec/android/iap/lib/helper/SamsungIapHelper;Lcom/sec/android/iap/lib/activity/BaseActivity;Lcom/sec/android/iap/lib/vo/PurchaseVo;Z)V
    //         iput-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mVerifyClientToServer:Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;
    //         const/4 v2, 0x0
    //         new-array v2, v2, [Ljava/lang/Void;
    //         invoke-virtual {v1, v2}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         if-eqz p1, :cond_1
    //         invoke-virtual {p1}, Lcom/sec/android/iap/lib/activity/BaseActivity;->finish()V
    //         :cond_1
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         goto :goto_0
    */

    companion object {
    private val FLAG_INCLUDE_STOPPED_PACKAGES: Int = 0x20
    private val HONEYCOMB_MR1: Int = 0xc
    @JvmField public val IAP_ERROR_ALREADY_PURCHASED: Int = 0
    @JvmField public val IAP_ERROR_COMMON: Int = 0
    @JvmField public val IAP_ERROR_CONFIRM_INBOX: Int = 0
    @JvmField public val IAP_ERROR_INITIALIZATION: Int = 0
    @JvmField public val IAP_ERROR_NEED_APP_UPGRADE: Int = 0
    @JvmField public val IAP_ERROR_NONE: Int = 0x0
    @JvmField public val IAP_ERROR_PRODUCT_DOES_NOT_EXIST: Int = 0
    @JvmField public val IAP_ERROR_WHILE_RUNNING: Int = 0
    @JvmField public val IAP_MODE_COMMERCIAL: Int = 0x0
    @JvmField public val IAP_MODE_TEST_FAIL: Int = 0
    @JvmField public val IAP_MODE_TEST_SUCCESS: Int = 0x1
    @JvmField public val IAP_PACKAGE_NAME: String = "com.sec.android.iap"
    @JvmField public val IAP_PAYMENT_IS_CANCELED: Int = 0x1
    @JvmField public val IAP_RESPONSE_RESULT_OK: Int = 0x0
    @JvmField public val IAP_RESPONSE_RESULT_UNAVAILABLE: Int = 0x2
    @JvmField public val IAP_SERVICE_NAME: String = "com.sec.android.iap.service.iapService"
    @JvmField public val IAP_SIGNATURE_HASHCODE: Int = 0x7a7eaf4b
    @JvmField public val ITEM_TYPE_ALL: String = "10"
    @JvmField public val ITEM_TYPE_CONSUMABLE: String = "00"
    @JvmField public val ITEM_TYPE_NON_CONSUMABLE: String = "01"
    @JvmField public val ITEM_TYPE_SUBSCRIPTION: String = "02"
    @JvmField public val KEY_NAME_ERROR_STRING: String = "ERROR_STRING"
    @JvmField public val KEY_NAME_IAP_UPGRADE_URL: String = "IAP_UPGRADE_URL"
    @JvmField public val KEY_NAME_ITEM_GROUP_ID: String = "ITEM_GROUP_ID"
    @JvmField public val KEY_NAME_ITEM_ID: String = "ITEM_ID"
    @JvmField public val KEY_NAME_RESULT_LIST: String = "RESULT_LIST"
    @JvmField public val KEY_NAME_RESULT_OBJECT: String = "RESULT_OBJECT"
    @JvmField public val KEY_NAME_STATUS_CODE: String = "STATUS_CODE"
    @JvmField public val KEY_NAME_THIRD_PARTY_NAME: String = "THIRD_PARTY_NAME"
    @JvmField public val REQUEST_CODE_IS_ACCOUNT_CERTIFICATION: Int = 0x2
    @JvmField public val REQUEST_CODE_IS_IAP_PAYMENT: Int = 0x1
    private val STATE_BINDING: Int = 0x1
    private val STATE_READY: Int = 0x2
    private val STATE_TERM: Int = 0x0
    private val TAG: String = null!!
    private val VERIFY_URL: String = "https://iap.samsungapps.com/iap/appsItemVerifyIAPReceipt.as?protocolVersion=2.0"
    private var mInstance: com.sec.android.iap.lib.helper.SamsungIapHelper
    @JvmField public var mShowProgressDialog: Boolean

    public @JvmStatic fun getInstance(_context: android.content.Context, _mode: Int): com.sec.android.iap.lib.helper.SamsungIapHelper { return TODO("body: (Landroid/content/Context;I)Lcom/sec/android/iap/lib/helper/SamsungIapHelper;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInstance:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-direct {v0, p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;-><init>(Landroid/content/Context;I)V
    //         sput-object v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInstance:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         :goto_0
    //         sget-object v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInstance:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         return-object v0
    //         :cond_0
    //         sget-object v0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->mInstance:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         invoke-direct {v0, p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->_setContextAndMode(Landroid/content/Context;I)V
    //         goto :goto_0
    */

    }
}
