package com.google.android.gms.wallet

// Auto-emitted from smali.
// 6 fields, 8 methods.

class Wallet {
    private constructor()

    companion object {
    @JvmField public val API: com.google.android.gms.common.api.Api = null!!
    private val CU: com.google.android.gms.common.api.Api.c = null!!
    private val CV: com.google.android.gms.common.api.Api.b = null!!
    @JvmField public val Payments: com.google.android.gms.wallet.Payments = null!!
    @JvmField public val atJ: com.google.android.gms.wallet.wobs.r = null!!
    @JvmField public val atK: com.google.android.gms.internal.om = null!!

    public @JvmStatic fun changeMaskedWallet(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, googleTransactionId: String, merchantTransactionId: String, requestCode: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/wallet/Wallet;->Payments:Lcom/google/android/gms/wallet/Payments;
    //         invoke-interface {v0, p0, p1, p2, p3}, Lcom/google/android/gms/wallet/Payments;->changeMaskedWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;I)V
    //         return-void
    */

    public @JvmStatic fun checkForPreAuthorization(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, requestCode: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/wallet/Wallet;->Payments:Lcom/google/android/gms/wallet/Payments;
    //         invoke-interface {v0, p0, p1}, Lcom/google/android/gms/wallet/Payments;->checkForPreAuthorization(Lcom/google/android/gms/common/api/GoogleApiClient;I)V
    //         return-void
    */

    public @JvmStatic fun loadFullWallet(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.wallet.FullWalletRequest, requestCode: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/FullWalletRequest;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/wallet/Wallet;->Payments:Lcom/google/android/gms/wallet/Payments;
    //         invoke-interface {v0, p0, p1, p2}, Lcom/google/android/gms/wallet/Payments;->loadFullWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/FullWalletRequest;I)V
    //         return-void
    */

    public @JvmStatic fun loadMaskedWallet(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.wallet.MaskedWalletRequest, requestCode: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/wallet/Wallet;->Payments:Lcom/google/android/gms/wallet/Payments;
    //         invoke-interface {v0, p0, p1, p2}, Lcom/google/android/gms/wallet/Payments;->loadMaskedWallet(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V
    //         return-void
    */

    public @JvmStatic fun notifyTransactionStatus(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.wallet.NotifyTransactionStatusRequest) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/wallet/Wallet;->Payments:Lcom/google/android/gms/wallet/Payments;
    //         invoke-interface {v0, p0, p1}, Lcom/google/android/gms/wallet/Payments;->notifyTransactionStatus(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V
    //         return-void
    */

    @JvmStatic fun pN(): com.google.android.gms.common.api.Api.c { return TODO("body: ()Lcom/google/android/gms/common/api/Api$c;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/wallet/Wallet;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         return-object v0
    */

    }
}
