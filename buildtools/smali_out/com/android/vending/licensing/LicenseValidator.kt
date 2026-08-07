package com.android.vending.licensing

// Auto-emitted from smali source: LicenseValidator.java.
// 17 fields, 8 methods.

open class LicenseValidator {
    private val mCallback: com.android.vending.licensing.LicenseCheckerCallback
    private val mDeviceLimiter: com.android.vending.licensing.DeviceLimiter
    private val mNonce: Int
    private val mPackageName: String
    private val mPolicy: com.android.vending.licensing.Policy
    private val mVersionCode: String

    constructor(p0: com.android.vending.licensing.Policy, p1: com.android.vending.licensing.DeviceLimiter, p2: com.android.vending.licensing.LicenseCheckerCallback, p3: Int, p4: String, p5: String)

    private fun handleApplicationError(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mCallback:Lcom/android/vending/licensing/LicenseCheckerCallback;
    //         invoke-interface {v0, p1}, Lcom/android/vending/licensing/LicenseCheckerCallback;->applicationError(I)V
    //         return-void
    */

    private fun handleInvalidResponse() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mCallback:Lcom/android/vending/licensing/LicenseCheckerCallback;
    //         const/16 v1, 0x231
    //         invoke-interface {v0, v1}, Lcom/android/vending/licensing/LicenseCheckerCallback;->dontAllow(I)V
    //         return-void
    */

    private fun handleResponse(p0: Int, p1: com.android.vending.licensing.ResponseData) { /* TODO(body): (ILcom/android/vending/licensing/ResponseData;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mPolicy:Lcom/android/vending/licensing/Policy;
    //         invoke-interface {v0, p1, p2}, Lcom/android/vending/licensing/Policy;->processServerResponse(ILcom/android/vending/licensing/ResponseData;)V
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mPolicy:Lcom/android/vending/licensing/Policy;
    //         invoke-interface {v0}, Lcom/android/vending/licensing/Policy;->allowAccess()Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         const-string v0, "LicenseValidator"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Allowed: Response "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mCallback:Lcom/android/vending/licensing/LicenseCheckerCallback;
    //         const/4 v1, 0x0
    //         invoke-interface {v0, v1}, Lcom/android/vending/licensing/LicenseCheckerCallback;->allow(I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         const-string v0, "LicenseValidator"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Not Allowed: Response "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mCallback:Lcom/android/vending/licensing/LicenseCheckerCallback;
    //         const/4 v1, 0x1
    //         invoke-interface {v0, v1}, Lcom/android/vending/licensing/LicenseCheckerCallback;->dontAllow(I)V
    //         goto :goto_0
    */

    public fun getCallback(): com.android.vending.licensing.LicenseCheckerCallback { return TODO("body: ()Lcom/android/vending/licensing/LicenseCheckerCallback;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mCallback:Lcom/android/vending/licensing/LicenseCheckerCallback;
    //         return-object v0
    */

    public fun getNonce(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mNonce:I
    //         return v0
    */

    public fun getPackageName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseValidator;->mPackageName:Ljava/lang/String;
    //         return-object v0
    */

    public fun verify(p0: java.security.PublicKey, p1: Int, p2: String, p3: String) { /* TODO(body): (Ljava/security/PublicKey;ILjava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 6
    //         const/4 v0, 0x0
    //         const/4 v5, 0x2
    //         const/4 v4, 0x1
    //         const/16 v3, 0x123
    //         if-eqz p2, :cond_0
    //         if-eq p2, v4, :cond_0
    //         if-ne p2, v5, :cond_6
    //         :cond_0
    //         :try_start_0
    //         const-string v0, "SHA256withRSA"
    //         invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;
    //         move-result-object v0
    //         invoke-virtual {v0, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V
    //         invoke-virtual {p3}, Ljava/lang/String;->getBytes()[B
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/security/Signature;->update([B)V
    //         invoke-static {p4}, Lcom/android/vending/licensing/util/Base64;->decode(Ljava/lang/String;)[B
    //         move-result-object v1
    //         invoke-virtual {v0, v1}, Ljava/security/Signature;->verify([B)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         const-string v0, "LicenseValidator"
    //         const-string v1, "Signature verification failed."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V
    //         :try_end_0
    //         .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_2
    //         .catch Lcom/android/vending/licensing/util/Base64DecoderException; {:try_start_0 .. :try_end_0} :catch_3
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    //         :catch_1
    //         move-exception v0
    //         const/4 v0, 0x5
    //         invoke-direct {p0, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleApplicationError(I)V
    //         goto :goto_0
    //         :catch_2
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    //         :catch_3
    //         move-exception v0
    //         const-string v0, "LicenseValidator"
    //         const-string v1, "Could not Base64-decode signature."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V
    //         goto :goto_0
    //         :cond_1
    //         :try_start_1
    //         invoke-static {p3}, Lcom/android/vending/licensing/ResponseData;->parse(Ljava/lang/String;)Lcom/android/vending/licensing/ResponseData;
    //         :try_end_1
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_4
    //         move-result-object v0
    //         iget v1, v0, Lcom/android/vending/licensing/ResponseData;->responseCode:I
    //         if-eq v1, p2, :cond_2
    //         const-string v0, "LicenseValidator"
    //         const-string v1, "Response codes don\'t match."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V
    //         goto :goto_0
    //         :catch_4
    //         move-exception v0
    //         const-string v0, "LicenseValidator"
    //         const-string v1, "Could not parse response."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V
    //         goto :goto_0
    //         :cond_2
    //         iget v1, v0, Lcom/android/vending/licensing/ResponseData;->nonce:I
    //         iget v2, p0, Lcom/android/vending/licensing/LicenseValidator;->mNonce:I
    //         if-eq v1, v2, :cond_3
    //         const-string v0, "LicenseValidator"
    //         const-string v1, "Nonce doesn\'t match."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V
    //         goto :goto_0
    //         :cond_3
    //         iget-object v1, v0, Lcom/android/vending/licensing/ResponseData;->packageName:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/android/vending/licensing/LicenseValidator;->mPackageName:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_4
    //         const-string v0, "LicenseValidator"
    //         const-string v1, "Package name doesn\'t match."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V
    //         goto :goto_0
    //         :cond_4
    //         iget-object v1, v0, Lcom/android/vending/licensing/ResponseData;->versionCode:Ljava/lang/String;
    //         iget-object v2, p0, Lcom/android/vending/licensing/LicenseValidator;->mVersionCode:Ljava/lang/String;
    //         invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    //         move-result v1
    //         if-nez v1, :cond_5
    //         const-string v0, "LicenseValidator"
    //         const-string v1, "Version codes don\'t match."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V
    //         goto :goto_0
    //         :cond_5
    //         iget-object v1, v0, Lcom/android/vending/licensing/ResponseData;->userId:Ljava/lang/String;
    //         invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v2
    //         if-eqz v2, :cond_7
    //         const-string v0, "LicenseValidator"
    //         const-string v1, "User identifier is empty."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V
    //         goto/16 :goto_0
    //         :cond_6
    //         move-object v1, v0
    //         :cond_7
    //         sparse-switch p2, :sswitch_data_0
    //         const-string v0, "LicenseValidator"
    //         const-string v1, "Unknown response code for license check."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0}, Lcom/android/vending/licensing/LicenseValidator;->handleInvalidResponse()V
    //         goto/16 :goto_0
    //         :sswitch_0
    //         iget-object v2, p0, Lcom/android/vending/licensing/LicenseValidator;->mDeviceLimiter:Lcom/android/vending/licensing/DeviceLimiter;
    //         invoke-interface {v2, v1}, Lcom/android/vending/licensing/DeviceLimiter;->isDeviceAllowed(Ljava/lang/String;)I
    //         move-result v1
    //         invoke-direct {p0, v1, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleResponse(ILcom/android/vending/licensing/ResponseData;)V
    //         goto/16 :goto_0
    //         :sswitch_1
    //         const/16 v1, 0x231
    //         invoke-direct {p0, v1, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleResponse(ILcom/android/vending/licensing/ResponseData;)V
    //         goto/16 :goto_0
    //         :sswitch_2
    //         const-string v1, "LicenseValidator"
    //         const-string v2, "Error contacting licensing server."
    //         invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0, v3, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleResponse(ILcom/android/vending/licensing/ResponseData;)V
    //         goto/16 :goto_0
    //         :sswitch_3
    //         const-string v1, "LicenseValidator"
    //         const-string v2, "An error has occurred on the licensing server."
    //         invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0, v3, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleResponse(ILcom/android/vending/licensing/ResponseData;)V
    //         goto/16 :goto_0
    //         :sswitch_4
    //         const-string v1, "LicenseValidator"
    //         const-string v2, "Licensing server is refusing to talk to this device, over quota."
    //         invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    //         invoke-direct {p0, v3, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleResponse(ILcom/android/vending/licensing/ResponseData;)V
    //         goto/16 :goto_0
    //         :sswitch_5
    //         invoke-direct {p0, v4}, Lcom/android/vending/licensing/LicenseValidator;->handleApplicationError(I)V
    //         goto/16 :goto_0
    //         :sswitch_6
    //         invoke-direct {p0, v5}, Lcom/android/vending/licensing/LicenseValidator;->handleApplicationError(I)V
    //         goto/16 :goto_0
    //         :sswitch_7
    //         const/4 v0, 0x3
    //         invoke-direct {p0, v0}, Lcom/android/vending/licensing/LicenseValidator;->handleApplicationError(I)V
    //         goto/16 :goto_0
    //         :sswitch_data_0
    //         .sparse-switch
    //             0x0 -> :sswitch_0
    //             0x1 -> :sswitch_1
    //             0x2 -> :sswitch_0
    //             0x3 -> :sswitch_7
    //             0x4 -> :sswitch_3
    //             0x5 -> :sswitch_4
    //             0x101 -> :sswitch_2
    //             0x102 -> :sswitch_5
    //             0x103 -> :sswitch_6
    //         .end sparse-switch
    */

    companion object {
    private val ERROR_CONTACTING_SERVER: Int = 0x101
    private val ERROR_INVALID_PACKAGE_NAME: Int = 0x102
    private val ERROR_NON_MATCHING_UID: Int = 0x103
    private val ERROR_NOT_MARKET_MANAGED: Int = 0x3
    private val ERROR_OVER_QUOTA: Int = 0x5
    private val ERROR_SERVER_FAILURE: Int = 0x4
    private val LICENSED: Int = 0x0
    private val LICENSED_OLD_KEY: Int = 0x2
    private val NOT_LICENSED: Int = 0x1
    private val SIGNATURE_ALGORITHM: String = "SHA256withRSA"
    private val TAG: String = "LicenseValidator"
    }
}
