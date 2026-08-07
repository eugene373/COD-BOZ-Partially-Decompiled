package com.sec.android.iap.lib.helper

// Auto-emitted from smali source: SamsungIapHelper.java.
// 6 fields, 6 methods.

open class SamsungIapHelper_VerifyClientToServer: android.os.AsyncTask() {
    private var mActivity: com.sec.android.iap.lib.activity.BaseActivity
    private var mErrorVo: com.sec.android.iap.lib.vo.ErrorVo
    private var mPurchaseVO: com.sec.android.iap.lib.vo.PurchaseVo
    private var mShowSuccessDialog: Boolean
    private var mVerificationVO: com.sec.android.iap.lib.vo.VerificationVo
    val this$0: com.sec.android.iap.lib.helper.SamsungIapHelper

    public constructor(_activity: com.sec.android.iap.lib.helper.SamsungIapHelper, _purchaseVO: com.sec.android.iap.lib.activity.BaseActivity, _showSuccessDialog: com.sec.android.iap.lib.vo.PurchaseVo, p3: Boolean)

    private fun getHttpGetData(_strUrl: String, _connTimeout: Int, _readTimeout: Int): String { return TODO("body: (Ljava/lang/String;II)Ljava/lang/String;") }
    /*
    //         .locals 15
    //         const/4 v11, 0x0
    //         .local v11, "strResult":Ljava/lang/String;
    //         const/4 v6, 0x0
    //         .local v6, "con":Ljava/net/URLConnection;
    //         const/4 v8, 0x0
    //         .local v8, "httpConnection":Ljava/net/HttpURLConnection;
    //         const/4 v2, 0x0
    //         .local v2, "bis":Ljava/io/BufferedInputStream;
    //         const/4 v4, 0x0
    //         .local v4, "buffer":Ljava/io/ByteArrayOutputStream;
    //         :try_start_0
    //         new-instance v12, Ljava/net/URL;
    //         move-object/from16 v0, p1
    //         invoke-direct {v12, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    //         .local v12, "url":Ljava/net/URL;
    //         invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
    //         move-result-object v6
    //         const/16 v13, 0x2710
    //         invoke-virtual {v6, v13}, Ljava/net/URLConnection;->setConnectTimeout(I)V
    //         const/16 v13, 0x2710
    //         invoke-virtual {v6, v13}, Ljava/net/URLConnection;->setReadTimeout(I)V
    //         move-object v0, v6
    //         check-cast v0, Ljava/net/HttpURLConnection;
    //         move-object v8, v0
    //         const-string v13, "GET"
    //         invoke-virtual {v8, v13}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    //         invoke-virtual {v8}, Ljava/net/HttpURLConnection;->connect()V
    //         invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getResponseCode()I
    //         move-result v10
    //         .local v10, "responseCode":I
    //         const/16 v13, 0xc8
    //         if-ne v10, v13, :cond_0
    //         new-instance v3, Ljava/io/BufferedInputStream;
    //         invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    //         move-result-object v13
    //         const/16 v14, 0x1000
    //         invoke-direct {v3, v13, v14}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7
    //         .catchall {:try_start_0 .. :try_end_0} :catchall_0
    //         .end local v2    # "bis":Ljava/io/BufferedInputStream;
    //         .local v3, "bis":Ljava/io/BufferedInputStream;
    //         :try_start_1
    //         new-instance v5, Ljava/io/ByteArrayOutputStream;
    //         const/16 v13, 0x1000
    //         invoke-direct {v5, v13}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
    //         :try_end_1
    //         .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_8
    //         .catchall {:try_start_1 .. :try_end_1} :catchall_1
    //         .end local v4    # "buffer":Ljava/io/ByteArrayOutputStream;
    //         .local v5, "buffer":Ljava/io/ByteArrayOutputStream;
    //         const/16 v13, 0x1000
    //         :try_start_2
    //         new-array v1, v13, [B
    //         .local v1, "bData":[B
    //         :goto_0
    //         const/4 v13, 0x0
    //         const/16 v14, 0x1000
    //         invoke-virtual {v3, v1, v13, v14}, Ljava/io/BufferedInputStream;->read([BII)I
    //         move-result v9
    //         .local v9, "nRead":I
    //         const/4 v13, -0x1
    //         if-ne v9, v13, :cond_3
    //         invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->flush()V
    //         invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
    //         :try_end_2
    //         .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    //         .catchall {:try_start_2 .. :try_end_2} :catchall_2
    //         move-result-object v11
    //         move-object v4, v5
    //         .end local v5    # "buffer":Ljava/io/ByteArrayOutputStream;
    //         .restart local v4    # "buffer":Ljava/io/ByteArrayOutputStream;
    //         move-object v2, v3
    //         .end local v1    # "bData":[B
    //         .end local v3    # "bis":Ljava/io/BufferedInputStream;
    //         .end local v9    # "nRead":I
    //         .restart local v2    # "bis":Ljava/io/BufferedInputStream;
    //         :cond_0
    //         if-eqz v2, :cond_1
    //         :try_start_3
    //         invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    //         :try_end_3
    //         .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5
    //         :cond_1
    //         :goto_1
    //         if-eqz v4, :cond_2
    //         :try_start_4
    //         invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    //         :try_end_4
    //         .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6
    //         :cond_2
    //         :goto_2
    //         const/4 v6, 0x0
    //         const/4 v8, 0x0
    //         .end local v10    # "responseCode":I
    //         .end local v12    # "url":Ljava/net/URL;
    //         :goto_3
    //         return-object v11
    //         .end local v2    # "bis":Ljava/io/BufferedInputStream;
    //         .end local v4    # "buffer":Ljava/io/ByteArrayOutputStream;
    //         .restart local v1    # "bData":[B
    //         .restart local v3    # "bis":Ljava/io/BufferedInputStream;
    //         .restart local v5    # "buffer":Ljava/io/ByteArrayOutputStream;
    //         .restart local v9    # "nRead":I
    //         .restart local v10    # "responseCode":I
    //         .restart local v12    # "url":Ljava/net/URL;
    //         :cond_3
    //         const/4 v13, 0x0
    //         :try_start_5
    //         invoke-virtual {v5, v1, v13, v9}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    //         :try_end_5
    //         .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    //         .catchall {:try_start_5 .. :try_end_5} :catchall_2
    //         goto :goto_0
    //         .end local v1    # "bData":[B
    //         .end local v9    # "nRead":I
    //         :catch_0
    //         move-exception v7
    //         move-object v4, v5
    //         .end local v5    # "buffer":Ljava/io/ByteArrayOutputStream;
    //         .restart local v4    # "buffer":Ljava/io/ByteArrayOutputStream;
    //         move-object v2, v3
    //         .end local v3    # "bis":Ljava/io/BufferedInputStream;
    //         .end local v10    # "responseCode":I
    //         .end local v12    # "url":Ljava/net/URL;
    //         .restart local v2    # "bis":Ljava/io/BufferedInputStream;
    //         .local v7, "e":Ljava/lang/Exception;
    //         :goto_4
    //         :try_start_6
    //         invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V
    //         :try_end_6
    //         .catchall {:try_start_6 .. :try_end_6} :catchall_0
    //         if-eqz v2, :cond_4
    //         :try_start_7
    //         invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    //         :try_end_7
    //         .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    //         :cond_4
    //         :goto_5
    //         if-eqz v4, :cond_5
    //         :try_start_8
    //         invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    //         :try_end_8
    //         .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    //         :cond_5
    //         :goto_6
    //         const/4 v6, 0x0
    //         const/4 v8, 0x0
    //         goto :goto_3
    //         .end local v7    # "e":Ljava/lang/Exception;
    //         :catchall_0
    //         move-exception v13
    //         :goto_7
    //         if-eqz v2, :cond_6
    //         :try_start_9
    //         invoke-virtual {v2}, Ljava/io/BufferedInputStream;->close()V
    //         :try_end_9
    //         .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3
    //         :cond_6
    //         :goto_8
    //         if-eqz v4, :cond_7
    //         :try_start_a
    //         invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    //         :try_end_a
    //         .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_4
    //         :cond_7
    //         :goto_9
    //         const/4 v6, 0x0
    //         const/4 v8, 0x0
    //         throw v13
    //         .restart local v7    # "e":Ljava/lang/Exception;
    //         :catch_1
    //         move-exception v13
    //         goto :goto_5
    //         :catch_2
    //         move-exception v13
    //         goto :goto_6
    //         .end local v7    # "e":Ljava/lang/Exception;
    //         :catch_3
    //         move-exception v14
    //         goto :goto_8
    //         :catch_4
    //         move-exception v14
    //         goto :goto_9
    //         .restart local v10    # "responseCode":I
    //         .restart local v12    # "url":Ljava/net/URL;
    //         :catch_5
    //         move-exception v13
    //         goto :goto_1
    //         :catch_6
    //         move-exception v13
    //         goto :goto_2
    //         .end local v2    # "bis":Ljava/io/BufferedInputStream;
    //         .restart local v3    # "bis":Ljava/io/BufferedInputStream;
    //         :catchall_1
    //         move-exception v13
    //         move-object v2, v3
    //         .end local v3    # "bis":Ljava/io/BufferedInputStream;
    //         .restart local v2    # "bis":Ljava/io/BufferedInputStream;
    //         goto :goto_7
    //         .end local v2    # "bis":Ljava/io/BufferedInputStream;
    //         .end local v4    # "buffer":Ljava/io/ByteArrayOutputStream;
    //         .restart local v3    # "bis":Ljava/io/BufferedInputStream;
    //         .restart local v5    # "buffer":Ljava/io/ByteArrayOutputStream;
    //         :catchall_2
    //         move-exception v13
    //         move-object v4, v5
    //         .end local v5    # "buffer":Ljava/io/ByteArrayOutputStream;
    //         .restart local v4    # "buffer":Ljava/io/ByteArrayOutputStream;
    //         move-object v2, v3
    //         .end local v3    # "bis":Ljava/io/BufferedInputStream;
    //         .restart local v2    # "bis":Ljava/io/BufferedInputStream;
    //         goto :goto_7
    //         .end local v10    # "responseCode":I
    //         .end local v12    # "url":Ljava/net/URL;
    //         :catch_7
    //         move-exception v7
    //         goto :goto_4
    //         .end local v2    # "bis":Ljava/io/BufferedInputStream;
    //         .restart local v3    # "bis":Ljava/io/BufferedInputStream;
    //         .restart local v10    # "responseCode":I
    //         .restart local v12    # "url":Ljava/net/URL;
    //         :catch_8
    //         move-exception v7
    //         move-object v2, v3
    //         .end local v3    # "bis":Ljava/io/BufferedInputStream;
    //         .restart local v2    # "bis":Ljava/io/BufferedInputStream;
    //         goto :goto_4
    */

    protected fun doInBackground(params: Array<Void>): Boolean { return TODO("body: ([Ljava/lang/Void;)Ljava/lang/Boolean;") }
    /*
    //         .locals 8
    //         const/4 v7, 0x1
    //         const/4 v5, 0x0
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mPurchaseVO:Lcom/sec/android/iap/lib/vo/PurchaseVo;
    //         if-eqz v4, :cond_0
    //         iget-object v4, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         if-nez v4, :cond_1
    //         :cond_0
    //         invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v4
    //         :goto_0
    //         return-object v4
    //         :cond_1
    //         :try_start_0
    //         new-instance v3, Ljava/lang/StringBuffer;
    //         invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V
    //         .local v3, "strUrl":Ljava/lang/StringBuffer;
    //         const-string v4, "https://iap.samsungapps.com/iap/appsItemVerifyIAPReceipt.as?protocolVersion=2.0"
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //         new-instance v4, Ljava/lang/StringBuilder;
    //         const-string v5, "&purchaseID="
    //         invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mPurchaseVO:Lcom/sec/android/iap/lib/vo/PurchaseVo;
    //         invoke-virtual {v5}, Lcom/sec/android/iap/lib/vo/PurchaseVo;->getPurchaseId()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v4
    //         invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //         const/4 v1, 0x0
    //         .local v1, "retryCount":I
    //         const/4 v2, 0x0
    //         .local v2, "strResponse":Ljava/lang/String;
    //         :cond_2
    //         invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    //         move-result-object v4
    //         const/16 v5, 0x2710
    //         const/16 v6, 0x2710
    //         invoke-direct {p0, v4, v5, v6}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->getHttpGetData(Ljava/lang/String;II)Ljava/lang/String;
    //         move-result-object v2
    //         add-int/lit8 v1, v1, 0x1
    //         const/4 v4, 0x3
    //         if-ge v1, v4, :cond_3
    //         invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v4
    //         if-nez v4, :cond_2
    //         :cond_3
    //         invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v4
    //         if-nez v4, :cond_4
    //         new-instance v4, Lcom/sec/android/iap/lib/vo/VerificationVo;
    //         invoke-direct {v4, v2}, Lcom/sec/android/iap/lib/vo/VerificationVo;-><init>(Ljava/lang/String;)V
    //         iput-object v4, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mVerificationVO:Lcom/sec/android/iap/lib/vo/VerificationVo;
    //         const-string v4, "true"
    //         iget-object v5, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mVerificationVO:Lcom/sec/android/iap/lib/vo/VerificationVo;
    //         invoke-virtual {v5}, Lcom/sec/android/iap/lib/vo/VerificationVo;->getStatus()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v4
    //         if-nez v4, :cond_4
    //         const/4 v4, 0x0
    //         invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v4
    //         goto :goto_0
    //         :cond_4
    //         const/4 v4, 0x1
    //         invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         :try_end_0
    //         .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v4
    //         goto :goto_0
    //         .end local v1    # "retryCount":I
    //         .end local v2    # "strResponse":Ljava/lang/String;
    //         .end local v3    # "strUrl":Ljava/lang/StringBuffer;
    //         :catch_0
    //         move-exception v0
    //         .local v0, "e":Ljava/lang/Exception;
    //         invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    //         invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    //         move-result-object v4
    //         goto :goto_0
    */

    protected fun doInBackground(p0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Ljava/lang/Void;
    //         invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun onPostExecute(result: Boolean) { /* TODO(body): (Ljava/lang/Boolean;)V */ }
    /*
    //         .locals 7
    //         const/4 v5, 0x0
    //         const/4 v4, 0x1
    //         invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v0
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const/4 v1, 0x0
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v3, "string"
    //         const-string v6, "dlg_msg_payment_success"
    //         invoke-static {v3, v6}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v3
    //         invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         iget-boolean v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mShowSuccessDialog:Z
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v3, "string"
    //         const-string v6, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v3, v6}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v3
    //         invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v3}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         invoke-virtual {v0}, Lcom/sec/android/iap/lib/activity/BaseActivity;->finish()V
    //         goto :goto_0
    //         :cond_2
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         const/16 v1, -0x3ea
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v3, "string"
    //         const-string v6, "IDS_SAPPS_POP_YOUR_PURCHASE_VIA_SAMSUNG_IN_APP_PURCHASE_IS_INVALID_A_FAKE_APPLICATION_HAS_BEEN_DETECTED_CHECK_THE_APP_MSG"
    //         invoke-static {v3, v6}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v3
    //         invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         invoke-virtual {v0, v1, v2}, Lcom/sec/android/iap/lib/vo/ErrorVo;->setError(ILjava/lang/String;)V
    //         iget-object v0, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->this$0:Lcom/sec/android/iap/lib/helper/SamsungIapHelper;
    //         iget-object v1, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         iget-object v2, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mActivity:Lcom/sec/android/iap/lib/activity/BaseActivity;
    //         const-string v3, "string"
    //         const-string v6, "IDS_SAPPS_POP_SAMSUNG_IN_APP_PURCHASE"
    //         invoke-static {v3, v6}, Lcom/sec/android/iap/lib/ResourceUtility;->getResId(Ljava/lang/String;Ljava/lang/String;)I
    //         move-result v3
    //         invoke-virtual {v2, v3}, Lcom/sec/android/iap/lib/activity/BaseActivity;->getString(I)Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->mErrorVo:Lcom/sec/android/iap/lib/vo/ErrorVo;
    //         invoke-virtual {v3}, Lcom/sec/android/iap/lib/vo/ErrorVo;->getErrorString()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual/range {v0 .. v5}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper;->showIapDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Runnable;)V
    //         goto :goto_0
    */

    protected fun onPostExecute(p0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Ljava/lang/Boolean;
    //         invoke-virtual {p0, p1}, Lcom/sec/android/iap/lib/helper/SamsungIapHelper$VerifyClientToServer;->onPostExecute(Ljava/lang/Boolean;)V
    //         return-void
    */

}
