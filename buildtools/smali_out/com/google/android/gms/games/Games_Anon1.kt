package com.google.android.gms.games

// Auto-emitted from smali.
// 0 fields, 4 methods.

class Games_Anon1: com.google.android.gms.common.api.Api.b {
    constructor()

    public fun a(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: Object, p4: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p5: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.common.api.Api.a { return TODO("body: (Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Ljava/lang/Object;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/Api$a;") }
    /*
    //         .locals 7
    //         move-object v4, p4
    //         check-cast v4, Lcom/google/android/gms/games/Games$GamesOptions;
    //         move-object v0, p0
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object v3, p3
    //         move-object v5, p5
    //         move-object v6, p6
    //         invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/games/Games$1;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/games/Games$GamesOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         return-object v0
    */

    public fun a(p0: android.content.Context, p1: android.os.Looper, p2: com.google.android.gms.common.internal.ClientSettings, p3: com.google.android.gms.games.Games.GamesOptions, p4: com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, p5: com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener): com.google.android.gms.games.internal.GamesClientImpl { return TODO("body: (Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/games/Games$GamesOptions;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/games/internal/GamesClientImpl;") }
    /*
    //         .locals 11
    //         if-nez p4, :cond_0
    //         new-instance v10, Lcom/google/android/gms/games/Games$GamesOptions;
    //         const/4 v0, 0x0
    //         invoke-direct {v10, v0}, Lcom/google/android/gms/games/Games$GamesOptions;-><init>(Lcom/google/android/gms/games/Games$1;)V
    //         :goto_0
    //         new-instance v0, Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getRealClientPackageName()Ljava/lang/String;
    //         move-result-object v3
    //         invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getAccountNameOrDefault()Ljava/lang/String;
    //         move-result-object v4
    //         invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getScopesArray()[Ljava/lang/String;
    //         move-result-object v7
    //         invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getGravityForPopups()I
    //         move-result v8
    //         invoke-virtual {p3}, Lcom/google/android/gms/common/internal/ClientSettings;->getViewForPopups()Landroid/view/View;
    //         move-result-object v9
    //         move-object v1, p1
    //         move-object v2, p2
    //         move-object/from16 v5, p5
    //         move-object/from16 v6, p6
    //         invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/games/internal/GamesClientImpl;-><init>(Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;ILandroid/view/View;Lcom/google/android/gms/games/Games$GamesOptions;)V
    //         return-object v0
    //         :cond_0
    //         move-object v10, p4
    //         goto :goto_0
    */

    public fun getPriority(): Int { return TODO("body: ()I") }
    /*
    //         .locals 1
    //         const/4 v0, 0x1
    //         return v0
    */

}
