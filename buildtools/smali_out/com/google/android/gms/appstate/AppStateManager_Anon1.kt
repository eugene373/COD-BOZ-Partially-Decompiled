package com.google.android.gms.appstate

// Auto-emitted from smali.
// 0 fields, 4 methods.

class AppStateManager_Anon1: com.google.android.gms.common.api.Api.b {
    constructor()

    public fun a(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: Object, p4: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p5: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.common.api.Api.a { return TODO("body: (Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Ljava/lang/Object;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/Api$a;") }
    /*
    //         .locals 7
    //         move-object v4, p4
    //         check-cast v4, Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v5, p5
    //         move-object v6, p6
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/appstate/AppStateManager$1;->b(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/internal/ib;
    //         move-result-object v0
    //         return-object v0
    */

    public fun b(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: com.google.android.gms.common.api.Api.ApiOptions.NoOptions, p4: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p5: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.internal.ib { return TODO("body: (Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/internal/ib;") }
    /*
    //         .locals 7
    //         new-instance v0, Lcom/google/android/gms/internal/ib;
    //         invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getAccountNameOrDefault()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getScopes()Ljava/util/List;
    //         move-result-object v1
    //         const/4 v2, 0x0
    //         new-array v2, v2, [Ljava/lang/String;
    //         invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v6
    //         check-cast v6, [Ljava/lang/String;
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p5
    //         move-object v4, p6
    //         invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ib;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Ljava/lang/String;[Ljava/lang/String;)V
    //         return-object v0
    */

    public fun getPriority(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const v0, 0x7fffffff
    //         return v0
    */

}
