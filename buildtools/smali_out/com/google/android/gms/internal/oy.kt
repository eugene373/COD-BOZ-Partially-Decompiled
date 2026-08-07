package com.google.android.gms.internal

// Auto-emitted from smali.
// 4 fields, 14 methods.

open class oy: com.google.android.gms.common.internal.e() {
    private val Dd: String
    private val atL: Int
    private val mTheme: Int
    private val nr: android.app.Activity

    public constructor(p0: android.app.Activity, p1: android.os.Looper, p2: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p3: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, p4: Int, p5: String, p6: Int)

    private fun pO(): android.os.Bundle { return TODO("body: ()Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         iget v0, p0, Lcom/google/android/gms/internal/oy;->atL:I
    //         iget-object v1, p0, Lcom/google/android/gms/internal/oy;->nr:Landroid/app/Activity;
    //         invoke-virtual {v1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/internal/oy;->Dd:Ljava/lang/String;
    //         iget v3, p0, Lcom/google/android/gms/internal/oy;->mTheme:I
    //         invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/oy;->a(ILjava/lang/String;Ljava/lang/String;I)Landroid/os/Bundle;
    //         move-result-object v0
    //         return-object v0
    */

    protected fun a(p0: com.google.android.gms.common.internal.l, p1: com.google.android.gms.common.internal.e.e) { /* TODO(body): (Lcom/google/android/gms/common/internal/l;Lcom/google/android/gms/common/internal/e$e;)V */ }
    /*
    //         .locals 2
    //         .annotation system Ldalvik/annotation/Throws;
    //             value = {
    //                 Landroid/os/RemoteException;
    //             }
    //         .end annotation
    //         const v0, 0x5e2978
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/oy;->getContext()Landroid/content/Context;
    //         move-result-object v1
    //         invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-interface {p1, p2, v0, v1}, Lcom/google/android/gms/common/internal/l;->k(Lcom/google/android/gms/common/internal/k;ILjava/lang/String;)V
    //         return-void
    */

    public fun a(p0: com.google.android.gms.wallet.FullWalletRequest, p1: Int) { /* TODO(body): (Lcom/google/android/gms/wallet/FullWalletRequest;I)V */ }
    /*
    //         .locals 4
    //         new-instance v1, Lcom/google/android/gms/internal/oy$b;
    //         invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/oy$b;-><init>(Lcom/google/android/gms/internal/oy;I)V
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/oy;->pO()Landroid/os/Bundle;
    //         move-result-object v2
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/oy;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ot;
    //         invoke-interface {v0, p1, v2, v1}, Lcom/google/android/gms/internal/ot;->a(Lcom/google/android/gms/wallet/FullWalletRequest;Landroid/os/Bundle;Lcom/google/android/gms/internal/ow;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v2, "WalletClientImpl"
    //         const-string v3, "RemoteException getting full wallet"
    //         invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         const/16 v0, 0x8
    //         const/4 v2, 0x0
    //         sget-object v3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;
    //         invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/internal/oy$b;->a(ILcom/google/android/gms/wallet/FullWallet;Landroid/os/Bundle;)V
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.wallet.MaskedWalletRequest, p1: Int) { /* TODO(body): (Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V */ }
    /*
    //         .locals 4
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/oy;->pO()Landroid/os/Bundle;
    //         move-result-object v1
    //         new-instance v2, Lcom/google/android/gms/internal/oy$b;
    //         invoke-direct {v2, p0, p2}, Lcom/google/android/gms/internal/oy$b;-><init>(Lcom/google/android/gms/internal/oy;I)V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/oy;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ot;
    //         invoke-interface {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ot;->a(Lcom/google/android/gms/wallet/MaskedWalletRequest;Landroid/os/Bundle;Lcom/google/android/gms/internal/ow;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "WalletClientImpl"
    //         const-string v3, "RemoteException getting masked wallet"
    //         invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         const/16 v0, 0x8
    //         const/4 v1, 0x0
    //         sget-object v3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;
    //         invoke-virtual {v2, v0, v1, v3}, Lcom/google/android/gms/internal/oy$b;->a(ILcom/google/android/gms/wallet/MaskedWallet;Landroid/os/Bundle;)V
    //         goto :goto_0
    */

    public fun a(p0: com.google.android.gms.wallet.NotifyTransactionStatusRequest) { /* TODO(body): (Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V */ }
    /*
    //         .locals 2
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/oy;->pO()Landroid/os/Bundle;
    //         move-result-object v1
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/oy;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ot;
    //         invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ot;->a(Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;Landroid/os/Bundle;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    protected fun bP(p0: android.os.IBinder): com.google.android.gms.internal.ot { return TODO("body: (Landroid/os/IBinder;)Lcom/google/android/gms/internal/ot;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/internal/ot$a;->bL(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ot;
    //         move-result-object v0
    //         return-object v0
    */

    public fun d(p0: String, p1: String, p2: Int) { /* TODO(body): (Ljava/lang/String;Ljava/lang/String;I)V */ }
    /*
    //         .locals 4
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/oy;->pO()Landroid/os/Bundle;
    //         move-result-object v1
    //         new-instance v2, Lcom/google/android/gms/internal/oy$b;
    //         invoke-direct {v2, p0, p3}, Lcom/google/android/gms/internal/oy$b;-><init>(Lcom/google/android/gms/internal/oy;I)V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/oy;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ot;
    //         invoke-interface {v0, p1, p2, v1, v2}, Lcom/google/android/gms/internal/ot;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/ow;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "WalletClientImpl"
    //         const-string v3, "RemoteException changing masked wallet"
    //         invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         const/16 v0, 0x8
    //         const/4 v1, 0x0
    //         sget-object v3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;
    //         invoke-virtual {v2, v0, v1, v3}, Lcom/google/android/gms/internal/oy$b;->a(ILcom/google/android/gms/wallet/MaskedWallet;Landroid/os/Bundle;)V
    //         goto :goto_0
    */

    public fun fI(p0: Int) { /* TODO(body): (I)V */ }
    /*
    //         .locals 4
    //         invoke-direct {p0}, Lcom/google/android/gms/internal/oy;->pO()Landroid/os/Bundle;
    //         move-result-object v1
    //         new-instance v2, Lcom/google/android/gms/internal/oy$b;
    //         invoke-direct {v2, p0, p1}, Lcom/google/android/gms/internal/oy$b;-><init>(Lcom/google/android/gms/internal/oy;I)V
    //         :try_start_0
    //         invoke-virtual {p0}, Lcom/google/android/gms/internal/oy;->gS()Landroid/os/IInterface;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ot;
    //         invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ot;->a(Landroid/os/Bundle;Lcom/google/android/gms/internal/ow;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         const-string v1, "WalletClientImpl"
    //         const-string v3, "RemoteException during checkForPreAuthorization"
    //         invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //         const/16 v0, 0x8
    //         const/4 v1, 0x0
    //         sget-object v3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;
    //         invoke-virtual {v2, v0, v1, v3}, Lcom/google/android/gms/internal/oy$b;->a(IZLandroid/os/Bundle;)V
    //         goto :goto_0
    */

    protected fun getServiceDescriptor(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.wallet.internal.IOwService"
    //         return-object v0
    */

    protected fun getStartServiceAction(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         const-string v0, "com.google.android.gms.wallet.service.BIND"
    //         return-object v0
    */

    protected fun j(p0: android.os.IBinder): android.os.IInterface { return TODO("body: (Landroid/os/IBinder;)Landroid/os/IInterface;") }
    /*
    //         .locals 1
    //         invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/oy;->bP(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ot;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    public @JvmStatic fun a(p0: Int, p1: String, p2: String, p3: Int): android.os.Bundle { return TODO("body: (ILjava/lang/String;Ljava/lang/String;I)Landroid/os/Bundle;") }
    /*
    //         .locals 4
    //         new-instance v0, Landroid/os/Bundle;
    //         invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
    //         const-string v1, "com.google.android.gms.wallet.EXTRA_ENVIRONMENT"
    //         invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         const-string v1, "androidPackageName"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    //         move-result v1
    //         if-nez v1, :cond_0
    //         const-string v1, "com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT"
    //         new-instance v2, Landroid/accounts/Account;
    //         const-string v3, "com.google"
    //         invoke-direct {v2, p2, v3}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V
    //         :cond_0
    //         const-string v1, "com.google.android.gms.wallet.EXTRA_THEME"
    //         invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         return-object v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.internal.oy): android.app.Activity { return TODO("body: (Lcom/google/android/gms/internal/oy;)Landroid/app/Activity;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/internal/oy;->nr:Landroid/app/Activity;
    //         return-object v0
    */

    }
}
