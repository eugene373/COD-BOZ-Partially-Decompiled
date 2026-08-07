package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 6 methods.

open class ox: com.google.android.gms.wallet.Payments {
    public constructor()

    public fun changeMaskedWallet(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, googleTransactionId: String, merchantTransactionId: String, requestCode: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;I)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/ox$4;
    //         invoke-direct {v0, p0, p2, p3, p4}, Lcom/google/android/gms/internal/ox$4;-><init>(Lcom/google/android/gms/internal/ox;Ljava/lang/String;Ljava/lang/String;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         return-void
    */

    public fun checkForPreAuthorization(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, requestCode: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;I)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/ox$1;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ox$1;-><init>(Lcom/google/android/gms/internal/ox;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         return-void
    */

    public fun loadFullWallet(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.wallet.FullWalletRequest, requestCode: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/FullWalletRequest;I)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/ox$3;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/internal/ox$3;-><init>(Lcom/google/android/gms/internal/ox;Lcom/google/android/gms/wallet/FullWalletRequest;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         return-void
    */

    public fun loadMaskedWallet(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.wallet.MaskedWalletRequest, requestCode: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/ox$2;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/internal/ox$2;-><init>(Lcom/google/android/gms/internal/ox;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         return-void
    */

    public fun notifyTransactionStatus(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.wallet.NotifyTransactionStatusRequest) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/ox$5;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ox$5;-><init>(Lcom/google/android/gms/internal/ox;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         return-void
    */

}
