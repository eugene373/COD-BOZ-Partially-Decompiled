package com.google.android.gms.games.internal.api

// Auto-emitted from smali.
// 0 fields, 4 methods.

class EventsImpl: com.google.android.gms.games.event.Events {
    public constructor()

    public fun increment(apiClient: com.google.android.gms.common.api.GoogleApiClient, eventId: String, incrementAmount: Int) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)V */ }
    /*
    //         .locals 2
    //         invoke-static {p1}, Lcom/google/android/gms/games/Games;->d(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/games/internal/GamesClientImpl;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/games/internal/GamesClientImpl;->isConnected()Z
    //         move-result v1
    //         if-eqz v1, :cond_0
    //         invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/games/internal/GamesClientImpl;->n(Ljava/lang/String;I)V
    //         :goto_0
    //         return-void
    //         :cond_0
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/EventsImpl$3;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/games/internal/api/EventsImpl$3;-><init>(Lcom/google/android/gms/games/internal/api/EventsImpl;Ljava/lang/String;I)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         goto :goto_0
    */

    public fun load(apiClient: com.google.android.gms.common.api.GoogleApiClient, forceReload: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Z)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/EventsImpl$2;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/games/internal/api/EventsImpl$2;-><init>(Lcom/google/android/gms/games/internal/api/EventsImpl;Z)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun loadByIds(apiClient: com.google.android.gms.common.api.GoogleApiClient, forceReload: Boolean, eventIds: Array<String>): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Z[Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/games/internal/api/EventsImpl$1;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/games/internal/api/EventsImpl$1;-><init>(Lcom/google/android/gms/games/internal/api/EventsImpl;Z[Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
