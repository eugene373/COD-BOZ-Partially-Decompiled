package com.google.android.gms.drive

// Auto-emitted from smali.
// 0 fields, 5 methods.

open class Drive_a: com.google.android.gms.common.api.Api.b {
    public constructor()

    protected fun a(p0: com.google.android.gms.common.api.Api.ApiOptions): android.os.Bundle

    public fun a(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: Object, p4: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p5: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.common.api.Api.a { return TODO("body: (Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Ljava/lang/Object;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/Api$a;") }
    /*
    //         .locals 7
    //         move-object v4, p4
    //         check-cast v4, Lcom/google/android/gms/common/api/Api$ApiOptions;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v5, p5
    //         move-object v6, p6
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/drive/Drive$a;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/common/api/Api$ApiOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/drive/internal/q;
    //         move-result-object v0
    //         return-object v0
    */

    public fun a(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: com.google.android.gms.common.api.Api.ApiOptions, p4: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p5: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.drive.internal.q { return TODO("body: (Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/common/api/Api$ApiOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/drive/internal/q;") }
    /*
    //         .locals 8
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Landroid/content/Context;",
    //                 "Landroid/os/Looper;",
    //                 "Lcom/google/android/gms/common/internal/ClientSettings;",
    //                 "TO;",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;",
    //                 ")",
    //                 "Lcom/google/android/gms/drive/internal/q;"
    //             }
    //         .end annotation
    //         invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getScopes()Ljava/util/List;
    //         move-result-object v1
    //         new-instance v0, Lcom/google/android/gms/drive/internal/q;
    //         invoke-interface {v1}, Ljava/util/List;->size()I
    //         move-result v2
    //         new-array v2, v2, [Ljava/lang/String;
    //         invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v6
    //         check-cast v6, [Ljava/lang/String;
    //         invoke-virtual {p0, p4}, Lcom/google/android/gms/drive/Drive$a;->a(Lcom/google/android/gms/common/api/Api$ApiOptions;)Landroid/os/Bundle;
    //         move-result-object v7
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v4, p5
    //         move-object v5, p6
    //         invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/drive/internal/q;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;Landroid/os/Bundle;)V
    //         return-object v0
    */

    public fun getPriority(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const v0, 0x7fffffff
    //         return v0
    */

}
