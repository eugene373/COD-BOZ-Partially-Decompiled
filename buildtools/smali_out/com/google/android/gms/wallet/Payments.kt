package com.google.android.gms.wallet

// Auto-emitted from smali.
// 0 fields, 5 methods.

interface Payments {
    public fun changeMaskedWallet(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: String, p3: Int)

    public fun checkForPreAuthorization(p0: com.google.android.gms.common.api.GoogleApiClient, p1: Int)

    public fun loadFullWallet(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wallet.FullWalletRequest, p2: Int)

    public fun loadMaskedWallet(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wallet.MaskedWalletRequest, p2: Int)

    public fun notifyTransactionStatus(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wallet.NotifyTransactionStatusRequest)

}
