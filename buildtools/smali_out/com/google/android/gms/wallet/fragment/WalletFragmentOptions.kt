package com.google.android.gms.wallet.fragment

// Auto-emitted from smali.
// 6 fields, 16 methods.

class WalletFragmentOptions: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    private var MV: Int
    private var atL: Int
    private var aum: com.google.android.gms.wallet.fragment.WalletFragmentStyle
    private var mTheme: Int

    private constructor()

    constructor(versionCode: Int, environment: Int, theme: Int, fragmentStyle: com.google.android.gms.wallet.fragment.WalletFragmentStyle, mode: Int)

    public fun aa(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->aum:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->aum:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    //         invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->aa(Landroid/content/Context;)V
    //         :cond_0
    //         return-void
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun getEnvironment(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->atL:I
    //         return v0
    */

    public fun getFragmentStyle(): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: ()Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->aum:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    //         return-object v0
    */

    public fun getMode(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->MV:I
    //         return v0
    */

    public fun getTheme(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->mTheme:I
    //         return v0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/fragment/b;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!

    @JvmStatic fun a(p0: com.google.android.gms.wallet.fragment.WalletFragmentOptions, p1: Int): Int { return TODO("body: (Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->atL:I
    //         return p1
    */

    public @JvmStatic fun a(p0: android.content.Context, p1: android.util.AttributeSet): com.google.android.gms.wallet.fragment.WalletFragmentOptions { return TODO("body: (Landroid/content/Context;Landroid/util/AttributeSet;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;") }
    /*
    //         .locals 6
    //         const/4 v5, 0x1
    //         const/4 v4, 0x0
    //         sget-object v0, Lcom/google/android/gms/R$styleable;->WalletFragmentOptions:[I
    //         invoke-virtual {p0, p1, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //         move-result-object v0
    //         sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentOptions_appTheme:I
    //         invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getInt(II)I
    //         move-result v1
    //         sget v2, Lcom/google/android/gms/R$styleable;->WalletFragmentOptions_environment:I
    //         invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getInt(II)I
    //         move-result v2
    //         sget v3, Lcom/google/android/gms/R$styleable;->WalletFragmentOptions_fragmentStyle:I
    //         invoke-virtual {v0, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I
    //         move-result v3
    //         sget v4, Lcom/google/android/gms/R$styleable;->WalletFragmentOptions_fragmentMode:I
    //         invoke-virtual {v0, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I
    //         move-result v4
    //         invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
    //         new-instance v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    //         invoke-direct {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;-><init>()V
    //         iput v1, v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->mTheme:I
    //         iput v2, v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->atL:I
    //         new-instance v1, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    //         invoke-direct {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;-><init>()V
    //         invoke-virtual {v1, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->setStyleResourceId(I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    //         move-result-object v1
    //         iput-object v1, v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->aum:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    //         iget-object v1, v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->aum:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    //         invoke-virtual {v1, p0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->aa(Landroid/content/Context;)V
    //         iput v4, v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->MV:I
    //         return-object v0
    */

    @JvmStatic fun a(p0: com.google.android.gms.wallet.fragment.WalletFragmentOptions, p1: com.google.android.gms.wallet.fragment.WalletFragmentStyle): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 0
    //         iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->aum:Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    //         return-object p1
    */

    @JvmStatic fun b(p0: com.google.android.gms.wallet.fragment.WalletFragmentOptions, p1: Int): Int { return TODO("body: (Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->mTheme:I
    //         return p1
    */

    @JvmStatic fun c(p0: com.google.android.gms.wallet.fragment.WalletFragmentOptions, p1: Int): Int { return TODO("body: (Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;I)I") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->MV:I
    //         return p1
    */

    public @JvmStatic fun newBuilder(): com.google.android.gms.wallet.fragment.WalletFragmentOptions.Builder { return TODO("body: ()Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;") }
    /*
    //         .locals 3
    //         new-instance v0, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;
    //         new-instance v1, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    //         invoke-direct {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;-><init>()V
    //         invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    //         const/4 v2, 0x0
    //         invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$Builder;-><init>(Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions$1;)V
    //         return-object v0
    */

    }
}
