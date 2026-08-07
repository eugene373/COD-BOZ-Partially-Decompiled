package com.android.vending.licensing

// Auto-emitted from smali source: LicenseChecker.java.
// 6 fields, 6 methods.

open class LicenseChecker_ResultListener: com.android.vending.licensing.ILicenseResultListener.Stub() {
    private var mOnTimeout: Runnable
    private val mValidator: com.android.vending.licensing.LicenseValidator
    val this$0: com.android.vending.licensing.LicenseChecker

    public constructor(p0: com.android.vending.licensing.LicenseChecker, p1: com.android.vending.licensing.LicenseValidator)

    private fun clearTimeout() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const-string v0, "LicenseChecker"
    //         const-string v1, "Clearing timeout."
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->this$0:Lcom/android/vending/licensing/LicenseChecker;
    //         invoke-static {v0}, Lcom/android/vending/licensing/LicenseChecker;->access$600(Lcom/android/vending/licensing/LicenseChecker;)Landroid/os/Handler;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->mOnTimeout:Ljava/lang/Runnable;
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
    //         return-void
    */

    private fun startTimeout() { /* TODO(body): ()V */ }
    /*
    //         .locals 4
    //         const-string v0, "LicenseChecker"
    //         const-string v1, "Start monitoring timeout."
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->this$0:Lcom/android/vending/licensing/LicenseChecker;
    //         invoke-static {v0}, Lcom/android/vending/licensing/LicenseChecker;->access$600(Lcom/android/vending/licensing/LicenseChecker;)Landroid/os/Handler;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->mOnTimeout:Ljava/lang/Runnable;
    //         const-wide/16 v2, 0x2710
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    //         return-void
    */

    public fun verifyLicense(p0: Int, p1: String, p2: String) { /* TODO(body): (ILjava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->this$0:Lcom/android/vending/licensing/LicenseChecker;
    //         invoke-static {v0}, Lcom/android/vending/licensing/LicenseChecker;->access$600(Lcom/android/vending/licensing/LicenseChecker;)Landroid/os/Handler;
    //         move-result-object v0
    //         new-instance v1, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;
    //         invoke-direct {v1, p0, p1, p2, p3}, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;-><init>(Lcom/android/vending/licensing/LicenseChecker$ResultListener;ILjava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    //         return-void
    */

    companion object {
    private val ERROR_CONTACTING_SERVER: Int = 0x101
    private val ERROR_INVALID_PACKAGE_NAME: Int = 0x102
    private val ERROR_NON_MATCHING_UID: Int = 0x103
    }
}
