package com.google.android.gms.plus

// Auto-emitted from smali.
// 0 fields, 4 methods.

class Plus_Anon1: com.google.android.gms.common.api.Api.b {
    constructor()

    public fun a(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: Object, p4: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p5: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.common.api.Api.a { return TODO("body: (Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Ljava/lang/Object;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/Api$a;") }
    /*
    //         .locals 7
    //         move-object v4, p4
    //         check-cast v4, Lcom/google/android/gms/plus/Plus$PlusOptions;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v5, p5
    //         move-object v6, p6
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/plus/Plus$1;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/plus/Plus$PlusOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/plus/internal/e;
    //         move-result-object v0
    //         return-object v0
    */

    public fun a(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: com.google.android.gms.plus.Plus.PlusOptions, p4: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p5: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.plus.internal.e { return TODO("body: (Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/plus/Plus$PlusOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/plus/internal/e;") }
    /*
    //         .locals 10
    //         if-nez p4, :cond_0
    //         new-instance p4, Lcom/google/android/gms/plus/Plus$PlusOptions;
    //         const/4 v0, 0x0
    //         invoke-direct {p4, v0}, Lcom/google/android/gms/plus/Plus$PlusOptions;-><init>(Lcom/google/android/gms/plus/Plus$1;)V
    //         :cond_0
    //         new-instance v9, Lcom/google/android/gms/plus/internal/e;
    //         new-instance v0, Lcom/google/android/gms/plus/internal/h;
    //         invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getAccountNameOrDefault()Ljava/lang/String;
    //         move-result-object v1
    //         invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getScopesArray()[Ljava/lang/String;
    //         move-result-object v2
    //         iget-object v3, p4, Lcom/google/android/gms/plus/Plus$PlusOptions;->alc:Ljava/util/Set;
    //         const/4 v4, 0x0
    //         new-array v4, v4, [Ljava/lang/String;
    //         invoke-interface {v3, v4}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v3
    //         check-cast v3, [Ljava/lang/String;
    //         const/4 v4, 0x0
    //         new-array v4, v4, [Ljava/lang/String;
    //         invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v5
    //         invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    //         move-result-object v6
    //         const/4 v7, 0x0
    //         new-instance v8, Lcom/google/android/gms/plus/internal/PlusCommonExtras;
    //         invoke-direct {v8}, Lcom/google/android/gms/plus/internal/PlusCommonExtras;-><init>()V
    //         invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/plus/internal/h;-><init>(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/plus/internal/PlusCommonExtras;)V
    //         move-object v1, v9
    //         move-object v2, p1
    //         move-object v3, p2
    //         move-object v4, p5
    //         move-object/from16 v5, p6
    //         move-object v6, v0
    //         invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/plus/internal/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;Lcom/google/android/gms/plus/internal/h;)V
    //         return-object v9
    */

    public fun getPriority(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x2
    //         return v0
    */

}
