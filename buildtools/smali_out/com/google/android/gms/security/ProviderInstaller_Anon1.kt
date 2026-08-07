package com.google.android.gms.security

// Auto-emitted from smali.
// 2 fields, 5 methods.

class ProviderInstaller_Anon1: android.os.AsyncTask() {
    val anL: com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
    val mV: android.content.Context

    constructor(p0: android.content.Context, p1: com.google.android.gms.security.ProviderInstaller.ProviderInstallListener)

    protected fun b(p0: Array<Void>): Integer { return TODO("body: ([Ljava/lang/Void;)Ljava/lang/Integer;") }
    /*
    //         .locals 1
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/security/ProviderInstaller$1;->mV:Landroid/content/Context;
    //         invoke-static {v0}, Lcom/google/android/gms/security/ProviderInstaller;->installIfNeeded(Landroid/content/Context;)V
    //         :try_end_0
    //         .catch Lcom/google/android/gms/common/GooglePlayServicesRepairableException; {:try_start_0 .. :try_end_0} :catch_0
    //         .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_1
    //         const/4 v0, 0x0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         :goto_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/common/GooglePlayServicesRepairableException;->getConnectionStatusCode()I
    //         move-result v0
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         goto :goto_0
    //         :catch_1
    //         move-exception v0
    //         iget v0, v0, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;->errorCode:I
    //         invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v0
    //         goto :goto_0
    */

    protected fun d(p0: Integer) { /* TODO(body): (Ljava/lang/Integer;)V */ }
    /*
    //         .locals 3
    //         invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/security/ProviderInstaller$1;->anL:Lcom/google/android/gms/security/ProviderInstaller$ProviderInstallListener;
    //         invoke-interface {v0}, Lcom/google/android/gms/security/ProviderInstaller$ProviderInstallListener;->onProviderInstalled()V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
    //         move-result v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->ai(I)Landroid/content/Intent;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/security/ProviderInstaller$1;->anL:Lcom/google/android/gms/security/ProviderInstaller$ProviderInstallListener;
    //         invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
    //         move-result v2
    //         invoke-interface {v1, v2, v0}, Lcom/google/android/gms/security/ProviderInstaller$ProviderInstallListener;->onProviderInstallFailed(ILandroid/content/Intent;)V
    //         goto :goto_0
    */

    protected fun doInBackground(x0: Array<Object>): Object { return TODO("body: ([Ljava/lang/Object;)Ljava/lang/Object;") }
    /*
    //         .locals 1
    //         check-cast p1, [Ljava/lang/Void;
    //         .end local p1    # "x0":[Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/security/ProviderInstaller$1;->b([Ljava/lang/Void;)Ljava/lang/Integer;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun onPostExecute(x0: Object) { /* TODO(body): (Ljava/lang/Object;)V */ }
    /*
    //         .locals 0
    //         check-cast p1, Ljava/lang/Integer;
    //         .end local p1    # "x0":Ljava/lang/Object;
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/security/ProviderInstaller$1;->d(Ljava/lang/Integer;)V
    //         return-void
    */

}
