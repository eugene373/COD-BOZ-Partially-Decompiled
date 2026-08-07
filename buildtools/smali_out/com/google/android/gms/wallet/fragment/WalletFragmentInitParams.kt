package com.google.android.gms.wallet.fragment

// Auto-emitted from smali.
// 6 fields, 17 methods.

class WalletFragmentInitParams: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    private var Dd: String
    private var atW: com.google.android.gms.wallet.MaskedWalletRequest
    private var atX: com.google.android.gms.wallet.MaskedWallet
    private var auk: Int

    private constructor()

    constructor(versionCode: Int, accountName: String, maskedWalletRequest: com.google.android.gms.wallet.MaskedWalletRequest, maskedWalletRequestCode: Int, maskedWallet: com.google.android.gms.wallet.MaskedWallet)

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getAccountName(): String { return TODO("body: ()Ljava/lang/String;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->Dd:Ljava/lang/String;
    //         return-object v0
    */

    public fun getMaskedWallet(): com.google.android.gms.wallet.MaskedWallet { return TODO("body: ()Lcom/google/android/gms/wallet/MaskedWallet;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->atX:Lcom/google/android/gms/wallet/MaskedWallet;
    //         return-object v0
    */

    public fun getMaskedWalletRequest(): com.google.android.gms.wallet.MaskedWalletRequest { return TODO("body: ()Lcom/google/android/gms/wallet/MaskedWalletRequest;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->atW:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         return-object v0
    */

    public fun getMaskedWalletRequestCode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->auk:I
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/fragment/a;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    @JvmStatic fun a(p0: com.google.android.gms.wallet.fragment.WalletFragmentInitParams, p1: Int): Int { return TODO("body: (Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;I)I") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->auk:I
    //         return p1
    */

    @JvmStatic fun a(p0: com.google.android.gms.wallet.fragment.WalletFragmentInitParams): com.google.android.gms.wallet.MaskedWallet { return TODO("body: (Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/MaskedWallet;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->atX:Lcom/google/android/gms/wallet/MaskedWallet;
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.wallet.fragment.WalletFragmentInitParams, p1: com.google.android.gms.wallet.MaskedWallet): com.google.android.gms.wallet.MaskedWallet { return TODO("body: (Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Lcom/google/android/gms/wallet/MaskedWallet;)Lcom/google/android/gms/wallet/MaskedWallet;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->atX:Lcom/google/android/gms/wallet/MaskedWallet;
    //         return-object p1
    */

    @JvmStatic fun a(p0: com.google.android.gms.wallet.fragment.WalletFragmentInitParams, p1: com.google.android.gms.wallet.MaskedWalletRequest): com.google.android.gms.wallet.MaskedWalletRequest { return TODO("body: (Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Lcom/google/android/gms/wallet/MaskedWalletRequest;)Lcom/google/android/gms/wallet/MaskedWalletRequest;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->atW:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         return-object p1
    */

    @JvmStatic fun a(p0: com.google.android.gms.wallet.fragment.WalletFragmentInitParams, p1: String): String { return TODO("body: (Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Ljava/lang/String;)Ljava/lang/String;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->Dd:Ljava/lang/String;
    //         return-object p1
    */

    @JvmStatic fun b(p0: com.google.android.gms.wallet.fragment.WalletFragmentInitParams): com.google.android.gms.wallet.MaskedWalletRequest { return TODO("body: (Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/MaskedWalletRequest;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->atW:Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         return-object v0
    */

    @JvmStatic fun c(p0: com.google.android.gms.wallet.fragment.WalletFragmentInitParams): Int { return TODO("body: (Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;->auk:I
    //         return v0
    */

    public @JvmStatic fun newBuilder(): com.google.android.gms.wallet.fragment.WalletFragmentInitParams.Builder { return TODO("body: ()Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;
    //         new-instance v1, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         invoke-direct {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;-><init>()V
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$Builder;-><init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams$1;)V
    //         return-object v0
    */

    }
}
