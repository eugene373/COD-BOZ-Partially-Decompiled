package com.google.android.gms.wearable.internal

// Auto-emitted from smali.
// 0 fields, 12 methods.

class f: com.google.android.gms.wearable.DataApi {
    public constructor()

    private fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.wearable.DataApi.DataListener, p2: Array<android.content.IntentFilter>): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataApi$DataListener;[Landroid/content/IntentFilter;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "Lcom/google/android/gms/wearable/DataApi$DataListener;",
    //                 "[",
    //                 "Landroid/content/IntentFilter;",
    //                 ")",
    //                 "Lcom/google/android/gms/common/api/PendingResult",
    //                 "<",
    //                 "Lcom/google/android/gms/common/api/Status;",
    //                 ">;"
    //             }
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/f$8;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/wearable/internal/f$8;-><init>(Lcom/google/android/gms/wearable/internal/f;Lcom/google/android/gms/wearable/DataApi$DataListener;[Landroid/content/IntentFilter;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    private fun a(p0: com.google.android.gms.wearable.Asset) { /* TODO(body): (Lcom/google/android/gms/wearable/Asset;)V */ }
    /*
    //         .locals 2
    //         if-nez p1, :cond_0
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "asset is null"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_0
    //         invoke-virtual {p1}, Lcom/google/android/gms/wearable/Asset;->getDigest()Ljava/lang/String;
    //         move-result-object v0
    //         if-nez v0, :cond_1
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "invalid asset"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_1
    //         invoke-virtual {p1}, Lcom/google/android/gms/wearable/Asset;->getData()[B
    //         move-result-object v0
    //         if-eqz v0, :cond_2
    //         new-instance v0, Ljava/lang/IllegalArgumentException;
    //         const-string v1, "invalid asset"
    //         invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
    //         throw v0
    //         :cond_2
    //         return-void
    */

    public fun addListener(client: com.google.android.gms.common.api.GoogleApiClient, listener: com.google.android.gms.wearable.DataApi.DataListener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataApi$DataListener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         const/4 v0, 0x0
    //         invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/wearable/internal/f;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataApi$DataListener;[Landroid/content/IntentFilter;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun deleteDataItems(client: com.google.android.gms.common.api.GoogleApiClient, uri: android.net.Uri): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/f$5;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/wearable/internal/f$5;-><init>(Lcom/google/android/gms/wearable/internal/f;Landroid/net/Uri;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDataItem(client: com.google.android.gms.common.api.GoogleApiClient, uri: android.net.Uri): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/f$2;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/wearable/internal/f$2;-><init>(Lcom/google/android/gms/wearable/internal/f;Landroid/net/Uri;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDataItems(client: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/f$3;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/wearable/internal/f$3;-><init>(Lcom/google/android/gms/wearable/internal/f;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getDataItems(client: com.google.android.gms.common.api.GoogleApiClient, uri: android.net.Uri): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/net/Uri;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/f$4;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/wearable/internal/f$4;-><init>(Lcom/google/android/gms/wearable/internal/f;Landroid/net/Uri;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getFdForAsset(client: com.google.android.gms.common.api.GoogleApiClient, asset: com.google.android.gms.wearable.Asset): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/Asset;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         invoke-direct {p0, p2}, Lcom/google/android/gms/wearable/internal/f;->a(Lcom/google/android/gms/wearable/Asset;)V
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/f$6;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/wearable/internal/f$6;-><init>(Lcom/google/android/gms/wearable/internal/f;Lcom/google/android/gms/wearable/Asset;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getFdForAsset(client: com.google.android.gms.common.api.GoogleApiClient, asset: com.google.android.gms.wearable.DataItemAsset): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataItemAsset;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/f$7;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/wearable/internal/f$7;-><init>(Lcom/google/android/gms/wearable/internal/f;Lcom/google/android/gms/wearable/DataItemAsset;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun putDataItem(client: com.google.android.gms.common.api.GoogleApiClient, request: com.google.android.gms.wearable.PutDataRequest): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/PutDataRequest;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/f$1;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/wearable/internal/f$1;-><init>(Lcom/google/android/gms/wearable/internal/f;Lcom/google/android/gms/wearable/PutDataRequest;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun removeListener(client: com.google.android.gms.common.api.GoogleApiClient, listener: com.google.android.gms.wearable.DataApi.DataListener): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/DataApi$DataListener;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/wearable/internal/f$9;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/wearable/internal/f$9;-><init>(Lcom/google/android/gms/wearable/internal/f;Lcom/google/android/gms/wearable/DataApi$DataListener;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
