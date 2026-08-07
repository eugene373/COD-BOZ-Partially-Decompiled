package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 0 fields, 5 methods.

class ag: com.google.android.gms.wearable.MessageApi {
    public constructor()

    private fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wearable.MessageApi.MessageListener, p2: Array<android.content.IntentFilter>): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/MessageApi$MessageListener;[Landroid/content/IntentFilter;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "Lcom/google/android/gms/wearable/MessageApi$MessageListener;",
    //                 "[",
    //                 "Landroid/content/IntentFilter;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/ag$2;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/wearable/internal/ag$2;-><init>(Lcom/google/android/gms/wearable/internal/ag;Lcom/google/android/gms/wearable/MessageApi$MessageListener;[Landroid/content/IntentFilter;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun addListener(client: com.google.android.gms.common.api.GoogleApiClient, listener: com.google.android.gms.wearable.MessageApi.MessageListener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/MessageApi$MessageListener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/wearable/internal/ag;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/MessageApi$MessageListener;[Landroid/content/IntentFilter;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun removeListener(client: com.google.android.gms.common.api.GoogleApiClient, listener: com.google.android.gms.wearable.MessageApi.MessageListener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/MessageApi$MessageListener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/ag$3;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/wearable/internal/ag$3;-><init>(Lcom/google/android/gms/wearable/internal/ag;Lcom/google/android/gms/wearable/MessageApi$MessageListener;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun sendMessage(client: com.google.android.gms.common.api.GoogleApiClient, nodeId: String, action: String, data: ByteArray): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;[B)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/ag$1;
    //         invoke-direct {v0, p0, p2, p3, p4}, Lcom/google/android/gms/wearable/internal/ag$1;-><init>(Lcom/google/android/gms/wearable/internal/ag;Ljava/lang/String;Ljava/lang/String;[B)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
