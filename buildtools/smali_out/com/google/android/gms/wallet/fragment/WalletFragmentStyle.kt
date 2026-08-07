package com.google.android.gms.wallet.fragment

// Auto-emitted from smali.
// 4 fields, 26 methods.

class WalletFragmentStyle: com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    val BR: Int
    var auo: android.os.Bundle
    var aup: Int

    public constructor()

    constructor(versionCode: Int, attributes: android.os.Bundle, styleResourceId: Int)

    private fun a(p0: android.content.res.TypedArray, p1: Int, p2: String) { /* TODO(body): (Landroid/content/res/TypedArray;ILjava/lang/String;)V */ }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         invoke-virtual {v0, p3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/Dimension;->a(Landroid/util/TypedValue;)J
    //         move-result-wide v2
    //         invoke-virtual {v1, p3, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         goto :goto_0
    */

    private fun a(p0: android.content.res.TypedArray, p1: Int, p2: String, p3: String) { /* TODO(body): (Landroid/content/res/TypedArray;ILjava/lang/String;Ljava/lang/String;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         invoke-virtual {v0, p3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         invoke-virtual {v0, p4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget v1, v0, Landroid/util/TypedValue;->type:I
    //         const/16 v2, 0x1c
    //         if-lt v1, v2, :cond_2
    //         iget v1, v0, Landroid/util/TypedValue;->type:I
    //         const/16 v2, 0x1f
    //         if-gt v1, v2, :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         iget v0, v0, Landroid/util/TypedValue;->data:I
    //         invoke-virtual {v1, p3, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         goto :goto_0
    //         :cond_2
    //         iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         iget v0, v0, Landroid/util/TypedValue;->resourceId:I
    //         invoke-virtual {v1, p4, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         goto :goto_0
    */

    private fun b(p0: android.content.res.TypedArray, p1: Int, p2: String) { /* TODO(body): (Landroid/content/res/TypedArray;ILjava/lang/String;)V */ }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         invoke-virtual {v0, p3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_1
    //         :cond_0
    //         :goto_0
    //         return-void
    //         :cond_1
    //         invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         iget v0, v0, Landroid/util/TypedValue;->data:I
    //         invoke-virtual {v1, p3, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         goto :goto_0
    */

    public fun a(p0: String, p1: android.util.DisplayMetrics, p2: Int): Int { return TODO("body: (Ljava/lang/String;Landroid/util/DisplayMetrics;I)I") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         invoke-virtual {v0, p1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
    //         move-result-wide v0
    //         invoke-static {v0, v1, p2}, Lcom/google/android/gms/wallet/fragment/Dimension;->a(JLandroid/util/DisplayMetrics;)I
    //         move-result p3
    //         :cond_0
    //         return p3
    */

    public fun aa(p0: android.content.Context) { /* TODO(body): (Landroid/content/Context;)V */ }
    /*
    //         .locals 4
    //         iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->aup:I
    //         if-gtz v0, :cond_0
    //         sget v0, Lcom/google/android/gms/R$style;->WalletFragmentDefaultStyle:I
    //         :goto_0
    //         sget-object v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle:[I
    //         invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;
    //         move-result-object v0
    //         sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_buyButtonWidth:I
    //         const-string v2, "buyButtonWidth"
    //         invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(Landroid/content/res/TypedArray;ILjava/lang/String;)V
    //         sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_buyButtonHeight:I
    //         const-string v2, "buyButtonHeight"
    //         invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(Landroid/content/res/TypedArray;ILjava/lang/String;)V
    //         sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_buyButtonText:I
    //         const-string v2, "buyButtonText"
    //         invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V
    //         sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_buyButtonAppearance:I
    //         const-string v2, "buyButtonAppearance"
    //         invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V
    //         sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsTextAppearance:I
    //         const-string v2, "maskedWalletDetailsTextAppearance"
    //         invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V
    //         sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance:I
    //         const-string v2, "maskedWalletDetailsHeaderTextAppearance"
    //         invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V
    //         sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsBackground:I
    //         const-string v2, "maskedWalletDetailsBackgroundColor"
    //         const-string v3, "maskedWalletDetailsBackgroundResource"
    //         invoke-direct {p0, v0, v1, v2, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(Landroid/content/res/TypedArray;ILjava/lang/String;Ljava/lang/String;)V
    //         sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance:I
    //         const-string v2, "maskedWalletDetailsButtonTextAppearance"
    //         invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V
    //         sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsButtonBackground:I
    //         const-string v2, "maskedWalletDetailsButtonBackgroundColor"
    //         const-string v3, "maskedWalletDetailsButtonBackgroundResource"
    //         invoke-direct {p0, v0, v1, v2, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(Landroid/content/res/TypedArray;ILjava/lang/String;Ljava/lang/String;)V
    //         sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsLogoTextColor:I
    //         const-string v2, "maskedWalletDetailsLogoTextColor"
    //         invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V
    //         sget v1, Lcom/google/android/gms/R$styleable;->WalletFragmentStyle_maskedWalletDetailsLogoImageType:I
    //         const-string v2, "maskedWalletDetailsLogoImageType"
    //         invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->b(Landroid/content/res/TypedArray;ILjava/lang/String;)V
    //         invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
    //         return-void
    //         :cond_0
    //         iget v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->aup:I
    //         goto :goto_0
    */

    public fun describeContents(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         return v0
    */

    public fun setBuyButtonAppearance(buyButtonAppearance: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "buyButtonAppearance"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun setBuyButtonHeight(height: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "buyButtonHeight"
    //         invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/Dimension;->fE(I)J
    //         move-result-wide v2
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         return-object p0
    */

    public fun setBuyButtonHeight(unit: Int, height: Float): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (IF)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "buyButtonHeight"
    //         invoke-static {p1, p2}, Lcom/google/android/gms/wallet/fragment/Dimension;->a(IF)J
    //         move-result-wide v2
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         return-object p0
    */

    public fun setBuyButtonText(buyButtonText: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "buyButtonText"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun setBuyButtonWidth(width: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "buyButtonWidth"
    //         invoke-static {p1}, Lcom/google/android/gms/wallet/fragment/Dimension;->fE(I)J
    //         move-result-wide v2
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         return-object p0
    */

    public fun setBuyButtonWidth(unit: Int, width: Float): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (IF)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 4
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "buyButtonWidth"
    //         invoke-static {p1, p2}, Lcom/google/android/gms/wallet/fragment/Dimension;->a(IF)J
    //         move-result-wide v2
    //         invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
    //         return-object p0
    */

    public fun setMaskedWalletDetailsBackgroundColor(color: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "maskedWalletDetailsBackgroundResource"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "maskedWalletDetailsBackgroundColor"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun setMaskedWalletDetailsBackgroundResource(resourceId: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "maskedWalletDetailsBackgroundColor"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "maskedWalletDetailsBackgroundResource"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun setMaskedWalletDetailsButtonBackgroundColor(color: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "maskedWalletDetailsButtonBackgroundResource"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "maskedWalletDetailsButtonBackgroundColor"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun setMaskedWalletDetailsButtonBackgroundResource(resourceId: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "maskedWalletDetailsButtonBackgroundColor"
    //         invoke-virtual {v0, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "maskedWalletDetailsButtonBackgroundResource"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun setMaskedWalletDetailsButtonTextAppearance(resourceId: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "maskedWalletDetailsButtonTextAppearance"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun setMaskedWalletDetailsHeaderTextAppearance(resourceId: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "maskedWalletDetailsHeaderTextAppearance"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun setMaskedWalletDetailsLogoImageType(imageType: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "maskedWalletDetailsLogoImageType"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun setMaskedWalletDetailsLogoTextColor(color: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "maskedWalletDetailsLogoTextColor"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun setMaskedWalletDetailsTextAppearance(resourceId: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->auo:Landroid/os/Bundle;
    //         const-string v1, "maskedWalletDetailsTextAppearance"
    //         invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
    //         return-object p0
    */

    public fun setStyleResourceId(id: Int): com.google.android.gms.wallet.fragment.WalletFragmentStyle { return TODO("body: (I)Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;") }
    /*
    //         .locals 0
    //         iput p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->aup:I
    //         return-object p0
    */

    public fun writeToParcel(dest: android.os.Parcel, flags: Int) { /* TODO(body): (Landroid/os/Parcel;I)V */ }
    /*
    //         .locals 0
    //         invoke-static {p0, p1, p2}, Lcom/google/android/gms/wallet/fragment/c;->a(Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;Landroid/os/Parcel;I)V
    //         return-void
    */

    companion object {
    @JvmField public val CREATOR: android.os.Parcelable.Creator = null!!
    }
}
