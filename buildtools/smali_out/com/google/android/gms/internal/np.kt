package com.google.android.gms.internal

// Auto-emitted from smali.
// 0 fields, 5 methods.

class np: com.google.android.gms.plus.Account {
    public constructor()

    public fun clearDefaultAccount(googleApiClient: com.google.android.gms.common.api.GoogleApiClient) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;)V */ }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/plus/Plus;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/np;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/plus/internal/e;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->clearDefaultAccount()V
    //         return-void
    */

    public fun getAccountName(googleApiClient: com.google.android.gms.common.api.GoogleApiClient): String { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/plus/Plus;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-static {p1, v0}, Lcom/google/android/gms/internal/np;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/plus/internal/e;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->getAccountName()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun revokeAccessAndDisconnect(googleApiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/internal/np$1;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/internal/np$1;-><init>(Lcom/google/android/gms/internal/np;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    companion object {
    private @JvmStatic fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.common.api.Api.c): com.google.android.gms.plus.internal.e { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/plus/internal/e;") }
    /*
    //         .locals 4
    //         .annotation system Ldalvik/annotation/Signature;
    //             value = {
    //                 "(",
    //                 "Lcom/google/android/gms/common/api/GoogleApiClient;",
    //                 "Lcom/google/android/gms/common/api/Api$c",
    //                 "<",
    //                 "Lcom/google/android/gms/plus/internal/e;",
    //                 ">;)",
    //                 "Lcom/google/android/gms/plus/internal/e;"
    //             }
    //         .end annotation
    //         const/4 v1, 0x1
    //         const/4 v2, 0x0
    //         if-eqz p0, :cond_0
    //         move v0, v1
    //         :goto_0
    //         const-string v3, "GoogleApiClient parameter is required."
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->b(ZLjava/lang/Object;)V
    //         invoke-interface {p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z
    //         move-result v0
    //         const-string v3, "GoogleApiClient must be connected."
    //         invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         invoke-interface {p0, p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/plus/internal/e;
    //         if-eqz v0, :cond_1
    //         :goto_1
    //         const-string v2, "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature."
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         return-object v0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v1, v2
    //         goto :goto_1
    */

    }
}
