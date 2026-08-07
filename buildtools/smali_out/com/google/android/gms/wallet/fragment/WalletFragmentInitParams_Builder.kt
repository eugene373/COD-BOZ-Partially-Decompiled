package com.google.android.gms.wallet.fragment

// Auto-emitted from smali.
// 1 fields, 7 methods.

class WalletFragmentInitParams_Builder {
    val aul: com.google.android.gms.wallet.fragment.WalletFragmentInitParams

    private constructor(p0: com.google.android.gms.wallet.fragment.WalletFragmentInitParams)

    constructor(x0: com.google.android.gms.wallet.fragment.WalletFragmentInitParams, x1: com.google.android.gms.wallet.fragment.WalletFragmentInitParams.1)

    public fun build(): com.google.android.gms.wallet.fragment.WalletFragmentInitParams { return TODO("body: ()Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;") }
    /*
    //         .locals 4
    //         const/4 v2, 0x1
    //         const/4 v1, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/MaskedWallet;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->b(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/MaskedWallet;
    //         move-result-object v0
    //         if-nez v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->b(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         :cond_1
    //         move v0, v2
    //         :goto_0
    //         const-string v3, "Exactly one of MaskedWallet or MaskedWalletRequest is required"
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->c(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)I
    //         move-result v0
    //         if-ltz v0, :cond_3
    //         :goto_1
    //         const-string v0, "masked wallet request code is required and must be non-negative"
    //         invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         return-object v0
    //         :cond_2
    //         move v0, v1
    //         goto :goto_0
    //         :cond_3
    //         move v2, v1
    //         goto :goto_1
    */

    public fun setAccountName(accountName: String): com.google.android.gms.wallet.fragment.WalletFragmentInitParams.Builder { return TODO("body: (Ljava/lang/String;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Ljava/lang/String;)Ljava/lang/String;
    //         return-object p0
    */

    public fun setMaskedWallet(maskedWallet: com.google.android.gms.wallet.MaskedWallet): com.google.android.gms.wallet.fragment.WalletFragmentInitParams.Builder { return TODO("body: (Lcom/google/android/gms/wallet/MaskedWallet;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Lcom/google/android/gms/wallet/MaskedWallet;)Lcom/google/android/gms/wallet/MaskedWallet;
    //         return-object p0
    */

    public fun setMaskedWalletRequest(request: com.google.android.gms.wallet.MaskedWalletRequest): com.google.android.gms.wallet.fragment.WalletFragmentInitParams.Builder { return TODO("body: (Lcom/google/android/gms/wallet/MaskedWalletRequest;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Lcom/google/android/gms/wallet/MaskedWalletRequest;)Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         return-object p0
    */

    public fun setMaskedWalletRequestCode(requestCode: Int): com.google.android.gms.wallet.fragment.WalletFragmentInitParams.Builder { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;->aul:Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         invoke-static {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;I)I
    //         return-object p0
    */

}
