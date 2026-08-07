package com.android.vending.licensing

// Auto-emitted from smali source: LicenseChecker.java.
// 4 fields, 2 methods.

open class LicenseChecker_ResultListener_Anon2: Runnable {
    val this$1: com.android.vending.licensing.LicenseChecker.ResultListener
    val val$responseCode: Int
    val val$signature: String
    val val$signedData: String

    constructor(p0: com.android.vending.licensing.LicenseChecker.ResultListener, p1: Int, p2: String, p3: String)

    public fun run() { /* TODO(body): ()V */ }
    /*
    //         .locals 5
    //         const-string v0, "LicenseChecker"
    //         const-string v1, "Received response."
    //         invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;->this$1:Lcom/android/vending/licensing/LicenseChecker$ResultListener;
    //         iget-object v0, v0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->this$0:Lcom/android/vending/licensing/LicenseChecker;
    //         invoke-static {v0}, Lcom/android/vending/licensing/LicenseChecker;->access$300(Lcom/android/vending/licensing/LicenseChecker;)Ljava/util/Set;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;->this$1:Lcom/android/vending/licensing/LicenseChecker$ResultListener;
    //         invoke-static {v1}, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->access$000(Lcom/android/vending/licensing/LicenseChecker$ResultListener;)Lcom/android/vending/licensing/LicenseValidator;
    //         move-result-object v1
    //         invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;->this$1:Lcom/android/vending/licensing/LicenseChecker$ResultListener;
    //         invoke-static {v0}, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->access$400(Lcom/android/vending/licensing/LicenseChecker$ResultListener;)V
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;->this$1:Lcom/android/vending/licensing/LicenseChecker$ResultListener;
    //         invoke-static {v0}, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->access$000(Lcom/android/vending/licensing/LicenseChecker$ResultListener;)Lcom/android/vending/licensing/LicenseValidator;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;->this$1:Lcom/android/vending/licensing/LicenseChecker$ResultListener;
    //         iget-object v1, v1, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->this$0:Lcom/android/vending/licensing/LicenseChecker;
    //         invoke-static {v1}, Lcom/android/vending/licensing/LicenseChecker;->access$500(Lcom/android/vending/licensing/LicenseChecker;)Ljava/security/PublicKey;
    //         move-result-object v1
    //         iget v2, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;->val$responseCode:I
    //         iget-object v3, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;->val$signedData:Ljava/lang/String;
    //         iget-object v4, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;->val$signature:Ljava/lang/String;
    //         invoke-virtual {v0, v1, v2, v3, v4}, Lcom/android/vending/licensing/LicenseValidator;->verify(Ljava/security/PublicKey;ILjava/lang/String;Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;->this$1:Lcom/android/vending/licensing/LicenseChecker$ResultListener;
    //         iget-object v0, v0, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->this$0:Lcom/android/vending/licensing/LicenseChecker;
    //         iget-object v1, p0, Lcom/android/vending/licensing/LicenseChecker$ResultListener$2;->this$1:Lcom/android/vending/licensing/LicenseChecker$ResultListener;
    //         invoke-static {v1}, Lcom/android/vending/licensing/LicenseChecker$ResultListener;->access$000(Lcom/android/vending/licensing/LicenseChecker$ResultListener;)Lcom/android/vending/licensing/LicenseValidator;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/android/vending/licensing/LicenseChecker;->access$200(Lcom/android/vending/licensing/LicenseChecker;Lcom/android/vending/licensing/LicenseValidator;)V
    //         :cond_0
    //         return-void
    */

}
