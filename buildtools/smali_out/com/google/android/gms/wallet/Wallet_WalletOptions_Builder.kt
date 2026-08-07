package com.google.android.gms.wallet

// Auto-emitted from smali.
// 2 fields, 6 methods.

class Wallet_WalletOptions_Builder {
    private var atL: Int
    private var mTheme: Int

    public constructor()

    public fun build(): com.google.android.gms.wallet.Wallet.WalletOptions { return TODO("body: ()Lcom/google/android/gms/wallet/Wallet$WalletOptions;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/wallet/Wallet$WalletOptions;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p0, v1}, Lcom/google/android/gms/wallet/Wallet$WalletOptions;-><init>(Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;Lcom/google/android/gms/wallet/Wallet$1;)V
    //         return-object v0
    */

    public fun setEnvironment(environment: Int): com.google.android.gms.wallet.Wallet.WalletOptions.Builder { return TODO("body: (I)Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;") }
    /*
    //         .locals 5
    //         const/4 v2, 0x1
    //         if-eqz p1, :cond_0
    //         const/4 v0, 0x2
    //         if-eq p1, v0, :cond_0
    //         if-ne p1, v2, :cond_1
    //         :cond_0
    //         iput p1, p0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->atL:I
    //         return-object p0
    //         :cond_1
    //         sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         const-string v1, "Invalid environment value %d"
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v1
    */

    public fun setTheme(theme: Int): com.google.android.gms.wallet.Wallet.WalletOptions.Builder { return TODO("body: (I)Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;") }
    /*
    //         .locals 5
    //         const/4 v2, 0x1
    //         if-eqz p1, :cond_0
    //         if-ne p1, v2, :cond_1
    //         :cond_0
    //         iput p1, p0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->mTheme:I
    //         return-object p0
    //         :cond_1
    //         sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;
    //         const-string v1, "Invalid theme value %d"
    //         new-array v2, v2, [Ljava/lang/Object;
    //         const/4 v3, 0x0
    //         invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    //         move-result-object v4
    //         aput-object v4, v2, v3
    //         invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //         move-result-object v0
    //         new-instance v1, Ljava/lang/IllegalArgumentException;
    //         invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v1
    */

    companion object {
    @JvmStatic fun a(p0: com.google.android.gms.wallet.Wallet.WalletOptions.Builder): Int { return TODO("body: (Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->atL:I
    //         return v0
    */

    @JvmStatic fun b(p0: com.google.android.gms.wallet.Wallet.WalletOptions.Builder): Int { return TODO("body: (Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/Wallet$WalletOptions$Builder;->mTheme:I
    //         return v0
    */

    }
}
