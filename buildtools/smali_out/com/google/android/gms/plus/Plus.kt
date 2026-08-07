package com.google.android.gms.plus

// Auto-emitted from smali.
// 10 fields, 3 methods.

class Plus {
    private constructor()

    companion object {
    @JvmField public val API: com.google.android.gms.common.api.Api = null!!
    @JvmField public val AccountApi: com.google.android.gms.plus.Account = null!!
    @JvmField public val CU: com.google.android.gms.common.api.Api.c = null!!
    val CV: com.google.android.gms.common.api.Api.b = null!!
    @JvmField public val MomentsApi: com.google.android.gms.plus.Moments = null!!
    @JvmField public val PeopleApi: com.google.android.gms.plus.People = null!!
    @JvmField public val SCOPE_PLUS_LOGIN: com.google.android.gms.common.api.Scope = null!!
    @JvmField public val SCOPE_PLUS_PROFILE: com.google.android.gms.common.api.Scope = null!!
    @JvmField public val akZ: com.google.android.gms.plus.b = null!!
    @JvmField public val ala: com.google.android.gms.plus.a = null!!

    public @JvmStatic fun a(p0: com.google.android.gms.common.api.GoogleApiClient, p1: com.google.android.gms.common.api.Api.c): com.google.android.gms.plus.internal.e { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/plus/internal/e;") }
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
