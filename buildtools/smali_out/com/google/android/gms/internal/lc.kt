package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 8 methods.

open class lc: com.google.android.gms.fitness.SensorsApi {
    public constructor()

    private fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.request.o): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/o;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "Lcom/google/android/gms/fitness/request/o;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/internal/lc$2;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/lc$2;-><init>(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/fitness/request/o;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    private fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.fitness.request.q, p2: com.google.android.gms.internal.lc.b): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/q;Lcom/google/android/gms/internal/lc$b;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "Lcom/google/android/gms/fitness/request/q;",
    //                 "Lcom/google/android/gms/internal/lc$b;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/internal/lc$4;
    //         invoke-direct {v0, p0, p3, p2}, Lcom/google/android/gms/internal/lc$4;-><init>(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/lc$b;Lcom/google/android/gms/fitness/request/q;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun add(client: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.fitness.request.SensorRequest, intent: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/SensorRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         new-instance v0, Lcom/google/android/gms/fitness/request/o;
    //         const/4 v1, 0x0
    //         invoke-direct {v0, p2, v1, p3}, Lcom/google/android/gms/fitness/request/o;-><init>(Lcom/google/android/gms/fitness/request/SensorRequest;Lcom/google/android/gms/fitness/data/k;Landroid/app/PendingIntent;)V
    //         invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/o;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun add(client: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.fitness.request.SensorRequest, listener: com.google.android.gms.fitness.request.OnDataPointListener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/SensorRequest;Lcom/google/android/gms/fitness/request/OnDataPointListener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 3
    //         invoke-static {}, Lcom/google/android/gms/fitness/data/l$a;->iV()Lcom/google/android/gms/fitness/data/l$a;
    //         move-result-object v0
    //         invoke-virtual {v0, p3}, Lcom/google/android/gms/fitness/data/l$a;->a(Lcom/google/android/gms/fitness/request/OnDataPointListener;)Lcom/google/android/gms/fitness/data/l;
    //         move-result-object v0
    //         new-instance v1, Lcom/google/android/gms/fitness/request/o;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, p2, v0, v2}, Lcom/google/android/gms/fitness/request/o;-><init>(Lcom/google/android/gms/fitness/request/SensorRequest;Lcom/google/android/gms/fitness/data/k;Landroid/app/PendingIntent;)V
    //         invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/o;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun findDataSources(client: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.fitness.request.DataSourcesRequest): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/DataSourcesRequest;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/lc$1;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/lc$1;-><init>(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/fitness/request/DataSourcesRequest;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun remove(client: com.google.android.gms.common.api.GoogleApiClient, pendingIntent: android.app.PendingIntent): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 2
    //         const/4 v1, 0x0
    //         new-instance v0, Lcom/google/android/gms/fitness/request/q;
    //         invoke-direct {v0, v1, p2}, Lcom/google/android/gms/fitness/request/q;-><init>(Lcom/google/android/gms/fitness/data/k;Landroid/app/PendingIntent;)V
    //         invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/q;Lcom/google/android/gms/internal/lc$b;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun remove(client: com.google.android.gms.common.api.GoogleApiClient, listener: com.google.android.gms.fitness.request.OnDataPointListener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/OnDataPointListener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 3
    //         invoke-static {}, Lcom/google/android/gms/fitness/data/l$a;->iV()Lcom/google/android/gms/fitness/data/l$a;
    //         move-result-object v0
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/fitness/data/l$a;->b(Lcom/google/android/gms/fitness/request/OnDataPointListener;)Lcom/google/android/gms/fitness/data/l;
    //         move-result-object v0
    //         if-nez v0, :cond_0
    //         new-instance v0, Lcom/google/android/gms/internal/ku;
    //         sget-object v1, Lcom/google/android/gms/common/api/Status;->Jv:Lcom/google/android/gms/common/api/Status;
    //         invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ku;-><init>(Lcom/google/android/gms/common/api/Result;)V
    //         :goto_0
    //         return-object v0
    //         :cond_0
    //         new-instance v1, Lcom/google/android/gms/fitness/request/q;
    //         const/4 v2, 0x0
    //         invoke-direct {v1, v0, v2}, Lcom/google/android/gms/fitness/request/q;-><init>(Lcom/google/android/gms/fitness/data/k;Landroid/app/PendingIntent;)V
    //         new-instance v0, Lcom/google/android/gms/internal/lc$3;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/internal/lc$3;-><init>(Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/fitness/request/OnDataPointListener;)V
    //         invoke-direct {p0, p1, v1, v0}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/fitness/request/q;Lcom/google/android/gms/internal/lc$b;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         goto :goto_0
    */

}
