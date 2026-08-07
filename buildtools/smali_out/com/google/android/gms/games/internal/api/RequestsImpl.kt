package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 0 fields, 14 methods.

class RequestsImpl: com.google.android.gms.games.request.Requests {
    public constructor()

    public fun acceptRequest(apiClient: com.google.android.gms.common.api.GoogleApiClient, requestId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/games/internal/api/RequestsImpl;->acceptRequests(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/util/List;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun acceptRequests(apiClient: com.google.android.gms.common.api.GoogleApiClient, p1: java.util.List): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/util/List;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         .local p2, "requestIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    //         if-nez p2, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         new-instance v1, Lcom/google/android/gms/games/internal/api/RequestsImpl$1;
    //         invoke-direct {v1, p0, v0}, Lcom/google/android/gms/games/internal/api/RequestsImpl$1;-><init>(Lcom/google/android/gms/games/internal/api/RequestsImpl;[Ljava/lang/String;)V
    //         invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         invoke-interface {p2}, Ljava/util/List;->size()I
    //         move-result v0
    //         new-array v0, v0, [Ljava/lang/String;
    //         invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Ljava/lang/String;
    //         goto :goto_0
    */

    public fun dismissRequest(apiClient: com.google.android.gms.common.api.GoogleApiClient, requestId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/games/internal/api/RequestsImpl;->dismissRequests(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/util/List;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun dismissRequests(apiClient: com.google.android.gms.common.api.GoogleApiClient, p1: java.util.List): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/util/List;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         .local p2, "requestIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    //         if-nez p2, :cond_0
    //         const/4 v0, 0x0
    //         :goto_0
    //         new-instance v1, Lcom/google/android/gms/games/internal/api/RequestsImpl$2;
    //         invoke-direct {v1, p0, v0}, Lcom/google/android/gms/games/internal/api/RequestsImpl$2;-><init>(Lcom/google/android/gms/games/internal/api/RequestsImpl;[Ljava/lang/String;)V
    //         invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    //         :cond_0
    //         invoke-interface {p2}, Ljava/util/List;->size()I
    //         move-result v0
    //         new-array v0, v0, [Ljava/lang/String;
    //         invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, [Ljava/lang/String;
    //         goto :goto_0
    */

    public fun getGameRequestsFromBundle(extras: android.os.Bundle): java.util.ArrayList { return TODO("body: (Landroid/os/Bundle;)Ljava/util/ArrayList;") }
    /*
    //         .locals 5
    //         if-eqz p1, :cond_0
    //         const-string v0, "requests"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
    //         move-result v0
    //         if-nez v0, :cond_1
    //         :cond_0
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         :goto_0
    //         return-object v0
    //         :cond_1
    //         const-string v0, "requests"
    //         invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
    //         move-result-object v0
    //         check-cast v0, Ljava/util/ArrayList;
    //         new-instance v2, Ljava/util/ArrayList;
    //         invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
    //         const/4 v1, 0x0
    //         invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    //         move-result v4
    //         move v3, v1
    //         :goto_1
    //         if-ge v3, v4, :cond_2
    //         invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
    //         move-result-object v1
    //         check-cast v1, Lcom/google/android/gms/games/request/GameRequest;
    //         invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    //         add-int/lit8 v1, v3, 0x1
    //         move v3, v1
    //         goto :goto_1
    //         :cond_2
    //         move-object v0, v2
    //         goto :goto_0
    */

    public fun getGameRequestsFromInboxResponse(response: android.content.Intent): java.util.ArrayList { return TODO("body: (Landroid/content/Intent;)Ljava/util/ArrayList;") }
    /*
    //         .locals 1
    //         if-nez p1, :cond_0
    //         new-instance v0, Ljava/util/ArrayList;
    //         invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
    //         move-result-object v0
    //         invoke-virtual {p0, v0}, Lcom/google/android/gms/games/internal/api/RequestsImpl;->getGameRequestsFromBundle(Landroid/os/Bundle;)Ljava/util/ArrayList;
    //         move-result-object v0
    //         goto :goto_0
    */

    public fun getInboxIntent(apiClient: com.google.android.gms.common.api.GoogleApiClient): android.content.Intent { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kr()Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getMaxLifetimeDays(apiClient: com.google.android.gms.common.api.GoogleApiClient): Int { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kt()I
    //         move-result v0
    //         return v0
    */

    public fun getMaxPayloadSize(apiClient: com.google.android.gms.common.api.GoogleApiClient): Int { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)I") }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->ks()I
    //         move-result v0
    //         return v0
    */

    public fun getSendIntent(apiClient: com.google.android.gms.common.api.GoogleApiClient, type: Int, payload: ByteArray, requestLifetimeDays: Int, icon: android.graphics.Bitmap, description: String): android.content.Intent { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;I[BILandroid/graphics/Bitmap;Ljava/lang/String;)Landroid/content/Intent;") }
    /*
    //         .locals 6
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         move v1, p2
    //         move-object v2, p3
    //         move v3, p4
    //         move-object v4, p5
    //         move-object v5, p6
    //         invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(I[BILandroid/graphics/Bitmap;Ljava/lang/String;)Landroid/content/Intent;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadRequests(apiClient: com.google.android.gms.common.api.GoogleApiClient, requestDirection: Int, types: Int, sortOrder: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;III)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/RequestsImpl$3;
    //         invoke-direct {v0, p0, p2, p3, p4}, Lcom/google/android/gms/games/internal/api/RequestsImpl$3;-><init>(Lcom/google/android/gms/games/internal/api/RequestsImpl;III)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun registerRequestListener(apiClient: com.google.android.gms.common.api.GoogleApiClient, listener: com.google.android.gms.games.request.OnRequestReceivedListener) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/games/request/OnRequestReceivedListener;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/games/request/OnRequestReceivedListener;)V
    //         return-void
    */

    public fun unregisterRequestListener(apiClient: com.google.android.gms.common.api.GoogleApiClient) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;)V */ }
    /*
    //         .locals 1
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->kl()V
    //         return-void
    */

}
