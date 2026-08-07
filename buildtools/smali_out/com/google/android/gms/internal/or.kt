package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 14 methods.

interface or: android.os.IInterface {
    public fun a(p0: com.google.android.gms.dynamic.d, p1: com.google.android.gms.wallet.fragment.WalletFragmentOptions, p2: android.os.Bundle)

    public fun getState(): Int

    public fun initialize(p0: com.google.android.gms.wallet.fragment.WalletFragmentInitParams)

    public fun onActivityResult(p0: Int, p1: Int, p2: android.content.Intent)

    public fun onCreate(p0: android.os.Bundle)

    public fun onCreateView(p0: com.google.android.gms.dynamic.d, p1: com.google.android.gms.dynamic.d, p2: android.os.Bundle): com.google.android.gms.dynamic.d

    public fun onPause()

    public fun onResume()

    public fun onSaveInstanceState(p0: android.os.Bundle)

    public fun onStart()

    public fun onStop()

    public fun setEnabled(p0: Boolean)

    public fun updateMaskedWallet(p0: com.google.android.gms.wallet.MaskedWallet)

    public fun updateMaskedWalletRequest(p0: com.google.android.gms.wallet.MaskedWalletRequest)

}
