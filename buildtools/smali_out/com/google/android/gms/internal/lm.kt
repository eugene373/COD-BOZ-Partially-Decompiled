package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 10 methods.

open class lm: com.google.android.gms.common.internal.e() {
    private val Dd: String
    private var adM: com.google.android.gms.internal.lm.a
    private val mTheme: Int
    private var nr: android.app.Activity

    public constructor(p0: android.app.Activity, p1: android.os.Looper, p2: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p3: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, p4: String, p5: Int)

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e) { /* TODO(body): (Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const v0, 0x5e2978
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lm;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {p1, p2, v0, v1}, Lcom/google/android/gms/common/internal/l;->d(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.identity.intents.UserAddressRequest, p1: Int) { /* TODO(body): (Lcom/google/android/gms/identity/intents/UserAddressRequest;I)V */ }
    /*
    //         .locals 5
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lm;->lT()V
    //         new-instance v0, Lcom/google/android/gms/internal/lm$a;
    //         iget-object v1, p0, Lcom/google/android/gms/internal/lm;->nr:Landroid/app/Activity;
    //         invoke-direct {v0, p2, v1}, Lcom/google/android/gms/internal/lm$a;-><init>(ILandroid/app/Activity;)V
    //         iput-object v0, p0, Lcom/google/android/gms/internal/lm;->adM:Lcom/google/android/gms/internal/lm$a;
    //         :try_start_0
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lm;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         const-string v2, "com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME"
    //         invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         iget-object v1, p0, Lcom/google/android/gms/internal/lm;->Dd:Ljava/lang/String;
    //         invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v1, "com.google.android.gms.identity.intents.EXTRA_ACCOUNT"
    //         new-instance v2, Landroid/accounts/Account;
    //         iget-object v3, p0, Lcom/google/android/gms/internal/lm;->Dd:Ljava/lang/String;
    //         const-string v4, "com.google"
    //         invoke-direct {v2, v3, v4}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         :cond_0
    //         const-string v1, "com.google.android.gms.identity.intents.EXTRA_THEME"
    //         iget v2, p0, Lcom/google/android/gms/internal/lm;->mTheme:I
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/lm;->lS()Lcom/google/android/gms/internal/lo;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/lm;->adM:Lcom/google/android/gms/internal/lm$a;
    //         invoke-interface {v1, v2, p1, v0}, Lcom/google/android/gms/internal/lo;->a(Lcom/google/android/gms/internal/ln;Lcom/google/android/gms/identity/intents/UserAddressRequest;Landroid/os/Bundle;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "AddressClientImpl"
    //         const-string v2, "Exception requesting user address"
    //         invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "com.google.android.gms.identity.intents.EXTRA_ERROR_CODE"
    //         const/16 v2, 0x22b
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         iget-object v1, p0, Lcom/google/android/gms/internal/lm;->adM:Lcom/google/android/gms/internal/lm$a;
    //         const/4 v2, 0x1
    //         invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/lm$a;->g(ILandroid/os/Bundle;)V
    //         goto :goto_0
    */

    protected fun aF(p0: android.os.IBinder): com.google.android.gms.internal.lo { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/lo;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/lo$a;->aH(Landroid/os/IBinder;)Lcom/google/android/gms/internal/lo;
    //         move-result-object v0
    //         return-object v0
    */

    public fun disconnect() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->disconnect()V
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lm;->adM:Lcom/google/android/gms/internal/lm$a;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/internal/lm;->adM:Lcom/google/android/gms/internal/lm$a;
    //         invoke-static {v0, v1}, Lcom/google/android/gms/internal/lm$a;->a(Lcom/google/android/gms/internal/lm$a;Landroid/app/Activity;)V
    //         iput-object v1, p0, Lcom/google/android/gms/internal/lm;->adM:Lcom/google/android/gms/internal/lm$a;
    //         :cond_0
    //         return-void
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.identity.intents.internal.IAddressService"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.identity.service.BIND"
    //         return-object v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lm;->aF(Landroid/os/IBinder;)Lcom/google/android/gms/internal/lo;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun lS(): com.google.android.gms.internal.lo { return TODO("body: ()Lcom/google/android/gms/internal/lo;") }
    /*
    //         .locals 1
    //         invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/lo;
    //         return-object v0
    */

    protected fun lT() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         invoke-super {p0}, Lcom/google/android/gms/common/internal/e;->dJ()V
    //         return-void
    */

}
