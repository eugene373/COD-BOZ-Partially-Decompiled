package com.google.android.gms.wallet

// Auto-emitted from smali.
// 0 fields, 4 methods.

class Wallet_Anon1: com.google.android.gms.common.api.Api.b {
    constructor()

    public fun a(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: Object, p4: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p5: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.common.api.Api.a { return TODO("body: (Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Ljava/lang/Object;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/Api$a;") }
    /*
    //         .locals 7
    //         move-object v4, p4
    //         check-cast v4, Lcom/google/android/gms/wallet/Wallet$WalletOptions;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v5, p5
    //         move-object v6, p6
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/wallet/Wallet$1;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/wallet/Wallet$WalletOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/internal/oy;
    //         move-result-object v0
    //         return-object v0
    */

    public fun a(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: com.google.android.gms.wallet.Wallet.WalletOptions, p4: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p5: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.internal.oy { return TODO("body: (Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/wallet/Wallet$WalletOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/internal/oy;") }
    /*
    //         .locals 8
    //         instance-of v0, p1, Landroid/app/Activity;
    //         const-string v1, "An Activity must be used for Wallet APIs"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         move-object v1, p1
    //         check-cast v1, Landroid/app/Activity;
    //         if-eqz p4, :cond_0
    //         :goto_0
    //         new-instance v0, Lcom/google/android/gms/internal/oy;
    //         iget v5, p4, Lcom/google/android/gms/wallet/Wallet$WalletOptions;->environment:I
    //         invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getAccountName()Ljava/lang/String;
    //         move-result-object v6
    //         iget v7, p4, Lcom/google/android/gms/wallet/Wallet$WalletOptions;->theme:I
    //         move-object v2, p2
    //         move-object v3, p5
    //         move-object v4, p6
    //         invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/oy;-><init>(Landroid/app/Activity;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;ILjava/lang/String;I)V
    //         return-object v0
    //         :cond_0
    //         new-instance p4, Lcom/google/android/gms/wallet/Wallet$WalletOptions;
    //         const/4 v0, 0x0
    //         invoke-direct {p4, v0}, Lcom/google/android/gms/wallet/Wallet$WalletOptions;-><init>(Lcom/google/android/gms/wallet/Wallet$1;)V
    //         goto :goto_0
    */

    public fun getPriority(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const v0, 0x7fffffff
    //         return v0
    */

}
