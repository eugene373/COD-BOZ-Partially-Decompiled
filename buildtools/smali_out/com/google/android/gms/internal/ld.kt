package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 8 methods.

open class ld: com.google.android.gms.fitness.SessionsApi {
    public constructor()

    private fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: String, p2: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "Ljava/lang/String;",
    //                 "Ljava/lang/String;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/fitness/result/SessionStopResult;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/internal/ld$2;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/internal/ld$2;-><init>(Lcom/google/android/gms/internal/ld;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun insertSession(client: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.fitness.request.SessionInsertRequest): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/SessionInsertRequest;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/ld$3;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ld$3;-><init>(Lcom/google/android/gms/internal/ld;Lcom/google/android/gms/fitness/request/SessionInsertRequest;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun readSession(client: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.fitness.request.SessionReadRequest): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/SessionReadRequest;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/ld$4;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ld$4;-><init>(Lcom/google/android/gms/internal/ld;Lcom/google/android/gms/fitness/request/SessionReadRequest;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun registerForSessions(client: com.google.android.gms.common.api.GoogleApiClient, intent: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/ld$5;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ld$5;-><init>(Lcom/google/android/gms/internal/ld;Landroid/app/PendingIntent;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun startSession(client: com.google.android.gms.common.api.GoogleApiClient, session: com.google.android.gms.fitness.data.Session): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/data/Session;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/ld$1;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ld$1;-><init>(Lcom/google/android/gms/internal/ld;Lcom/google/android/gms/fitness/data/Session;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun stopSession(client: com.google.android.gms.common.api.GoogleApiClient, identifier: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/internal/ld;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun unregisterForSessions(client: com.google.android.gms.common.api.GoogleApiClient, intent: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/ld$6;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/ld$6;-><init>(Lcom/google/android/gms/internal/ld;Landroid/app/PendingIntent;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
