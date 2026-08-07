package com.google.android.gms.wallet.fragment

// Auto-emitted from smali.
// 1 fields, 25 methods.

open class SupportWalletFragment_b: com.google.android.gms.dynamic.LifecycleDelegate {
    private val aub: com.google.android.gms.internal.or

    private constructor(p0: com.google.android.gms.internal.or)

    constructor(p0: com.google.android.gms.internal.or, p1: com.google.android.gms.wallet.fragment.SupportWalletFragment.1)

    private fun getState(): Int { return TODO("body: ()I") }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/or;->getState()I
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         move-result v0
    //         return v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    private fun initialize(startParams: com.google.android.gms.wallet.fragment.WalletFragmentInitParams) { /* TODO(body): (Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/or;->initialize(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    private fun onActivityResult(requestCode: Int, resultCode: Int, data: android.content.Intent) { /* TODO(body): (IILandroid/content/Intent;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/or;->onActivityResult(IILandroid/content/Intent;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    private fun setEnabled(enabled: Boolean) { /* TODO(body): (Z)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/or;->setEnabled(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    private fun updateMaskedWallet(maskedWallet: com.google.android.gms.wallet.MaskedWallet) { /* TODO(body): (Lcom/google/android/gms/wallet/MaskedWallet;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/or;->updateMaskedWallet(Lcom/google/android/gms/wallet/MaskedWallet;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    private fun updateMaskedWalletRequest(request: com.google.android.gms.wallet.MaskedWalletRequest) { /* TODO(body): (Lcom/google/android/gms/wallet/MaskedWalletRequest;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/or;->updateMaskedWalletRequest(Lcom/google/android/gms/wallet/MaskedWalletRequest;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun onCreate(savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/or;->onCreate(Landroid/os/Bundle;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun onCreateView(inflater: android.view.LayoutInflater, container: android.view.ViewGroup, savedInstanceState: android.os.Bundle): android.view.View { return TODO("body: (Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;") }
    /*
    //         .locals 3
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v1
    //         invoke-static {p2}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v2
    //         invoke-interface {v0, v1, v2, p3}, Lcom/google/android/gms/internal/or;->onCreateView(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/dynamic/d;Landroid/os/Bundle;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/dynamic/e;->f(Lcom/google/android/gms/dynamic/d;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Landroid/view/View;
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-object v0
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun onDestroy() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onDestroyView() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onInflate(activity: android.app.Activity, attrs: android.os.Bundle, savedInstanceState: android.os.Bundle) { /* TODO(body): (Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/Bundle;)V */ }
    /*
    //         .locals 3
    //         const-string v0, "extraWalletFragmentOptions"
    //         invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    //         :try_start_0
    //         iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-static {p1}, Lcom/google/android/gms/dynamic/e;->k(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/d;
    //         move-result-object v2
    //         invoke-interface {v1, v2, v0, p3}, Lcom/google/android/gms/internal/or;->a(Lcom/google/android/gms/dynamic/d;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Landroid/os/Bundle;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun onLowMemory() { /* TODO(body): ()V */ }
    /*
    //         .locals 0
    //         return-void
    */

    public fun onPause() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/or;->onPause()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun onResume() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/or;->onResume()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun onSaveInstanceState(outState: android.os.Bundle) { /* TODO(body): (Landroid/os/Bundle;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-interface {v0, p1}, Lcom/google/android/gms/internal/or;->onSaveInstanceState(Landroid/os/Bundle;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun onStart() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/or;->onStart()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    public fun onStop() { /* TODO(body): ()V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->aub:Lcom/google/android/gms/internal/or;
    //         invoke-interface {v0}, Lcom/google/android/gms/internal/or;->onStop()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v1, Ljava/lang/RuntimeException;
    //         invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
    //         throw v1
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.wallet.fragment.SupportWalletFragment.b): Int { return TODO("body: (Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;)I") }
    /*
    //         .locals 1
    //         invoke-direct {p0}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->getState()I
    //         move-result v0
    //         return v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.wallet.fragment.SupportWalletFragment.b, p1: Int, p2: Int, p3: android.content.Intent) { /* TODO(body): (Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;IILandroid/content/Intent;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->onActivityResult(IILandroid/content/Intent;)V
    //         return-void
    */

    @JvmStatic fun a(p0: com.google.android.gms.wallet.fragment.SupportWalletFragment.b, p1: com.google.android.gms.wallet.MaskedWallet) { /* TODO(body): (Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;Lcom/google/android/gms/wallet/MaskedWallet;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->updateMaskedWallet(Lcom/google/android/gms/wallet/MaskedWallet;)V
    //         return-void
    */

    @JvmStatic fun a(p0: com.google.android.gms.wallet.fragment.SupportWalletFragment.b, p1: com.google.android.gms.wallet.MaskedWalletRequest) { /* TODO(body): (Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;Lcom/google/android/gms/wallet/MaskedWalletRequest;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->updateMaskedWalletRequest(Lcom/google/android/gms/wallet/MaskedWalletRequest;)V
    //         return-void
    */

    @JvmStatic fun a(p0: com.google.android.gms.wallet.fragment.SupportWalletFragment.b, p1: com.google.android.gms.wallet.fragment.WalletFragmentInitParams) { /* TODO(body): (Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->initialize(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)V
    //         return-void
    */

    @JvmStatic fun a(p0: com.google.android.gms.wallet.fragment.SupportWalletFragment.b, p1: Boolean) { /* TODO(body): (Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;Z)V */ }
    /*
    //         .locals 0
    //         invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/fragment/SupportWalletFragment$b;->setEnabled(Z)V
    //         return-void
    */

    }
}
