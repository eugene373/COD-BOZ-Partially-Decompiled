package com.google.android.gms.auth

// Auto-emitted from smali.
// 1 fields, 2 methods.

open class GoogleAuthUtil_a: android.os.Handler() {
    private val mD: android.content.Context

    constructor(p0: android.content.Context)

    public fun handleMessage(msg: android.os.Message) { /* TODO(body): (Landroid/os/Message;)V */ }
    /*
    //         .locals 3
    //         iget v0, p1, Landroid/os/Message;->what:I
    //         const/4 v1, 0x1
    //         if-ne v0, v1, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/auth/GoogleAuthUtil$a;->mD:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isUserRecoverableError(I)Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/auth/GoogleAuthUtil$a;->mD:Landroid/content/Context;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->showErrorNotification(ILandroid/content/Context;)V
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         const-string v0, "GoogleAuthUtil"
    //         new-instance v1, Ljava/lang/StringBuilder;
    //         invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
    //         const-string v2, "Don\'t know how to handle this message: "
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         iget v2, p1, Landroid/os/Message;->what:I
    //         invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I
    //         goto :goto_0
    */

}
