package com.google.android.gms.wallet.fragment

// Auto-emitted from smali.
// 1 fields, 5 methods.

open class WalletFragment_c: com.google.android.gms.dynamic.a(), android.view.View.OnClickListener {
    val auj: com.google.android.gms.wallet.fragment.WalletFragment

    private constructor(p0: com.google.android.gms.wallet.fragment.WalletFragment)

    constructor(p0: com.google.android.gms.wallet.fragment.WalletFragment, p1: com.google.android.gms.wallet.fragment.WalletFragment.1)

    protected fun a(p0: android.widget.FrameLayout) { /* TODO(body): (Landroid/widget/FrameLayout;)V */ }
    /*
    //         .locals 6
    //         new-instance v2, Landroid/widget/Button;
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Landroid/app/Fragment;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;
    //         move-result-object v0
    //         invoke-direct {v2, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V
    //         sget v0, Lcom/google/android/gms/R$string;->wallet_buy_button_place_holder:I
    //         invoke-virtual {v2, v0}, Landroid/widget/Button;->setText(I)V
    //         const/4 v1, -0x1
    //         const/4 v0, -0x2
    //         iget-object v3, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v3}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->e(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    //         move-result-object v3
    //         if-eqz v3, :cond_0
    //         iget-object v3, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v3}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->e(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    //         move-result-object v3
    //         invoke-virtual {v3}, Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;->getFragmentStyle()Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;
    //         move-result-object v3
    //         if-eqz v3, :cond_0
    //         iget-object v4, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v4}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Landroid/app/Fragment;
    //         move-result-object v4
    //         invoke-virtual {v4}, Landroid/app/Fragment;->getResources()Landroid/content/res/Resources;
    //         move-result-object v4
    //         invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
    //         move-result-object v4
    //         const-string v5, "buyButtonWidth"
    //         invoke-virtual {v3, v5, v4, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(Ljava/lang/String;Landroid/util/DisplayMetrics;I)I
    //         move-result v1
    //         const-string v5, "buyButtonHeight"
    //         invoke-virtual {v3, v5, v4, v0}, Lcom/google/android/gms/wallet/fragment/WalletFragmentStyle;->a(Ljava/lang/String;Landroid/util/DisplayMetrics;I)I
    //         move-result v0
    //         :cond_0
    //         new-instance v3, Landroid/view/ViewGroup$LayoutParams;
    //         invoke-direct {v3, v1, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
    //         invoke-virtual {v2, v3}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    //         invoke-virtual {v2, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    //         invoke-virtual {p1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
    //         return-void
    */

    protected fun a(p0: com.google.android.gms.dynamic.f) { /* TODO(body): (Lcom/google/android/gms/dynamic/f;)V */ }
    /*
    //         .locals 5
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/dynamic/f",
    //                 "<",
    //                 "Lcom/google/android/gms/wallet/fragment/WalletFragment$b;",
    //                 ">;)V"
    //             }
    //         .end annotation
    //         const/4 v4, 0x0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Landroid/app/Fragment;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->b(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$b;
    //         move-result-object v1
    //         if-nez v1, :cond_3
    //         iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->c(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Z
    //         move-result v1
    //         if-eqz v1, :cond_3
    //         if-eqz v0, :cond_3
    //         :try_start_0
    //         iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->d(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/dynamic/b;
    //         move-result-object v1
    //         iget-object v2, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v2}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->e(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    //         move-result-object v2
    //         iget-object v3, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v3}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->f(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$a;
    //         move-result-object v3
    //         invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/oz;->a(Landroid/app/Activity;Lcom/google/android/gms/dynamic/c;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;Lcom/google/android/gms/internal/os;)Lcom/google/android/gms/internal/or;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         new-instance v2, Lcom/google/android/gms/wallet/fragment/WalletFragment$b;
    //         const/4 v3, 0x0
    //         invoke-direct {v2, v0, v3}, Lcom/google/android/gms/wallet/fragment/WalletFragment$b;-><init>(Lcom/google/android/gms/internal/or;Lcom/google/android/gms/wallet/fragment/WalletFragment$1;)V
    //         invoke-static {v1, v2}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment;Lcom/google/android/gms/wallet/fragment/WalletFragment$b;)Lcom/google/android/gms/wallet/fragment/WalletFragment$b;
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         const/4 v1, 0x0
    //         invoke-static {v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment;Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;)Lcom/google/android/gms/wallet/fragment/WalletFragmentOptions;
    //         :try_end_0
    //         .catch Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException; {:try_start_0 .. :try_end_0} :catch_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->b(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$b;
    //         move-result-object v0
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/dynamic/f;->a(Lcom/google/android/gms/dynamic/LifecycleDelegate;)V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->g(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         move-result-object v0
    //         if-eqz v0, :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->b(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$b;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->g(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment$b;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment$b;Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0, v4}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment;Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;)Lcom/google/android/gms/wallet/fragment/WalletFragmentInitParams;
    //         :cond_0
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->h(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         move-result-object v0
    //         if-eqz v0, :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->b(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$b;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->h(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment$b;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment$b;Lcom/google/android/gms/wallet/MaskedWalletRequest;)V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0, v4}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment;Lcom/google/android/gms/wallet/MaskedWalletRequest;)Lcom/google/android/gms/wallet/MaskedWalletRequest;
    //         :cond_1
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->i(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/MaskedWallet;
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->b(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$b;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->i(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/MaskedWallet;
    //         move-result-object v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment$b;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment$b;Lcom/google/android/gms/wallet/MaskedWallet;)V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0, v4}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment;Lcom/google/android/gms/wallet/MaskedWallet;)Lcom/google/android/gms/wallet/MaskedWallet;
    //         :cond_2
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->j(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Ljava/lang/Boolean;
    //         move-result-object v0
    //         if-eqz v0, :cond_3
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->b(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Lcom/google/android/gms/wallet/fragment/WalletFragment$b;
    //         move-result-object v0
    //         iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->j(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Ljava/lang/Boolean;
    //         move-result-object v1
    //         invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
    //         move-result v1
    //         invoke-static {v0, v1}, Lcom/google/android/gms/wallet/fragment/WalletFragment$b;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment$b;Z)V
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0, v4}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    //         :cond_3
    //         :goto_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         goto :goto_0
    */

    public fun onClick(view: android.view.View) { /* TODO(body): (Landroid/view/View;)V */ }
    /*
    //         .locals 3
    //         iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$c;->auj:Lcom/google/android/gms/wallet/fragment/WalletFragment;
    //         invoke-static {v0}, Lcom/google/android/gms/wallet/fragment/WalletFragment;->a(Lcom/google/android/gms/wallet/fragment/WalletFragment;)Landroid/app/Fragment;
    //         move-result-object v0
    //         invoke-virtual {v0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;
    //         move-result-object v0
    //         invoke-static {v0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I
    //         move-result v1
    //         const/4 v2, -0x1
    //         invoke-static {v1, v0, v2}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->showErrorDialogFragment(ILandroid/app/Activity;I)Z
    //         return-void
    */

}
