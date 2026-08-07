package com.android.vending.licensing

// Auto-emitted from smali source: LicenseChecker.java.
// 14 fields, 12 methods.

open class LicenseChecker: android.content.ServiceConnection {
    private val mChecksInProgress: java.util.Set
    private val mContext: android.content.Context
    private var mHandler: android.os.Handler
    private val mPackageName: String
    private val mPendingChecks: java.util.Queue
    private val mPolicy: com.android.vending.licensing.Policy
    private var mPublicKey: java.security.PublicKey
    private var mService: com.android.vending.licensing.ILicensingService
    private val mVersionCode: String

    public constructor(p0: android.content.Context, p1: com.android.vending.licensing.Policy, p2: String)

    private fun cleanupService() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mService:Lcom/android/vending/licensing/ILicensingService;
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mContext:Landroid/content/Context;
    //         invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    //         :try_end_0
    //         .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         const/4 v0, 0x0
    //         iput-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mService:Lcom/android/vending/licensing/ILicensingService;
    //         :cond_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "LicenseChecker"
    //         const-string v1, "Unable to unbind from licensing service (already unbound)"
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

    private fun generateNonce(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/android/vending/licensing/LicenseChecker;->RANDOM:Ljava/security/SecureRandom;
    //         invoke-virtual {v0}, Ljava/security/SecureRandom;->nextInt()I
    //         move-result v0
    //         return v0
    */

    private fun runChecks() { /* TODO(body): ()V */ }
    /*
    //         .locals 6
    //         :goto_0
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker;->mPendingChecks:Ljava/util/Queue;
    //         invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Lcom/android/vending/licensing/LicenseValidator;
    //         if-eqz v0, :cond_0
    //         :try_start_0
    //         const-string v1, "LicenseChecker"
    //         new-instance v2, Ljava/lang/StringBuilder;
    //         invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v3, "Calling checkLicense on service for "
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v0}, Lcom/android/vending/licensing/LicenseValidator;->getPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v2
    //         invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v2
    //         invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker;->mService:Lcom/android/vending/licensing/ILicensingService;
    //         invoke-virtual {v0}, Lcom/android/vending/licensing/LicenseValidator;->getNonce()I
    //         move-result v2
    //         int-to-long v2, v2
    //         invoke-virtual {v0}, Lcom/android/vending/licensing/LicenseValidator;->getPackageName()Ljava/lang/String;
    //         move-result-object v4
    //         new-instance v5, Lcom/android/vending/licensing/LicenseChecker$ResultListener;
    //         invoke-direct {v5, p0, v0}, Lcom/android/vending/licensing/LicenseChecker$ResultListener;-><init>(Lcom/android/vending/licensing/LicenseChecker;Lcom/android/vending/licensing/LicenseValidator;)V
    //         invoke-interface {v1, v2, v3, v4, v5}, Lcom/android/vending/licensing/ILicensingService;->checkLicense(JLjava/lang/String;Lcom/android/vending/licensing/ILicenseResultListener;)V
    //         iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker;->mChecksInProgress:Ljava/util/Set;
    //         invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         goto :goto_0
    //         :catch_0
    //         move-exception v1
    //         const-string v2, "LicenseChecker"
    //         const-string v3, "RemoteException in checkLicense call."
    //         invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         invoke-direct {p0, v0}, Lcom/android/vending/licensing/LicenseChecker;->handleServiceConnectionError(Lcom/android/vending/licensing/LicenseValidator;)V
    //         goto :goto_0
    //         :cond_0
    //         return-void
    */

    companion object {
    private val DEBUG_LICENSE_ERROR: Boolean = false
    private val KEY_FACTORY_ALGORITHM: String = "RSA"
    private val RANDOM: java.security.SecureRandom = null!!
    private val TAG: String = "LicenseChecker"
    private val TIMEOUT_MS: Int = 0x2710

    private @JvmStatic fun generatePublicKey(p0: String): java.security.PublicKey { return TODO("body: (Ljava/lang/String;)Ljava/security/PublicKey;") }
    /*
    //         .locals 3
    //         :try_start_0
    //         invoke-static {p0}, Lcom/android/vending/licensing/util/Base64;->decode(Ljava/lang/String;)[B
    //         move-result-object v0
    //         const-string v1, "RSA"
    //         invoke-static {v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;
    //         move-result-object v1
    //         new-instance v2, Ljava/security/spec/X509EncodedKeySpec;
    //         invoke-direct {v2, v0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V
    //         invoke-virtual {v1, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //         :try_end_0
    //         .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lcom/android/vending/licensing/util/Base64DecoderException; {:try_start_0 .. :try_end_0} :catch_1
    //         .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_2
    //         move-result-object v0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    //         :catch_1
    //         move-exception v0
    //         const-string v1, "LicenseChecker"
    //         const-string v2, "Could not decode from Base64."
    //         invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    //         :catch_2
    //         move-exception v0
    //         const-string v1, "LicenseChecker"
    //         const-string v2, "Invalid key specification."
    //         invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    private @JvmStatic fun getVersionCode(p0: android.content.Context, p1: String): String { return TODO("body: (Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 2
    //         :try_start_0
    //         invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    //         move-result-object v0
    //         const/4 v1, 0x0
    //         invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //         move-result-object v0
    //         iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    //         invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
    //         :try_end_0
    //         .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         const-string v0, "LicenseChecker"
    //         const-string v1, "Package not found. could not get version code."
    //         invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    //         const-string v0, ""
    //         goto :goto_0
    */

    }
}
