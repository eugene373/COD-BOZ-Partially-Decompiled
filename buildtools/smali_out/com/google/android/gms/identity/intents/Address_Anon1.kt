package com.google.android.gms.identity.intents

// Auto-emitted from smali.
// 0 fields, 4 methods.

class Address_Anon1: com.google.android.gms.common.api.Api.b {
    constructor()

    public fun a(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: Object, p4: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p5: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.common.api.Api.a { return TODO("body: (Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Ljava/lang/Object;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/Api$a;") }
    /*
    //         .locals 7
    //         move-object v4, p4
    //         check-cast v4, Lcom/google/android/gms/identity/intents/Address$AddressOptions;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v5, p5
    //         move-object v6, p6
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/identity/intents/Address$1;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/identity/intents/Address$AddressOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/internal/lm;
    //         move-result-object v0
    //         return-object v0
    */

    public fun a(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: com.google.android.gms.identity.intents.Address.AddressOptions, p4: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p5: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.internal.lm { return TODO("body: (Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/identity/intents/Address$AddressOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/internal/lm;") }
    /*
    //         .locals 7
    //         instance-of v0, p1, Landroid/app/Activity;
    //         const-string v1, "An Activity must be used for Address APIs"
    //         invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         if-nez p4, :cond_0
    //         new-instance p4, Lcom/google/android/gms/identity/intents/Address$AddressOptions;
    //         invoke-direct {p4}, Lcom/google/android/gms/identity/intents/Address$AddressOptions;-><init>()V
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/lm;
    //         move-object v1, p1
    //         check-cast v1, Landroid/app/Activity;
    //         invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getAccountName()Ljava/lang/String;
    //         move-result-object v5
    //         iget v6, p4, Lcom/google/android/gms/identity/intents/Address$AddressOptions;->theme:I
    //         move-object v2, p2
    //         move-object v3, p5
    //         move-object v4, p6
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/lm;-><init>(Landroid/app/Activity;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;I)V
    //         return-object v0
    */

    public fun getPriority(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const v0, 0x7fffffff
    //         return v0
    */

}
