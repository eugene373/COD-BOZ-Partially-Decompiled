package com.google.android.gms.appstate

// Auto-emitted from smali.
// 4 fields, 14 methods.

class AppStateManager {
    private constructor()

    companion object {
    @JvmField public val API: com.google.android.gms.common.api.Api = null!!
    val CU: com.google.android.gms.common.api.Api.c = null!!
    private val CV: com.google.android.gms.common.api.Api.b = null!!
    @JvmField public val SCOPE_APP_STATE: com.google.android.gms.common.api.Scope = null!!

    public @JvmStatic fun a(p0: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.internal.ib { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/internal/ib;") }
    /*
    //         .locals 4
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
    //         sget-object v0, Lcom/google/android/gms/appstate/AppStateManager;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ib;
    //         if-eqz v0, :cond_1
    //         :goto_1
    //         const-string v2, "GoogleApiClient is not configured to use the AppState API. Pass AppStateManager.API into GoogleApiClient.Builder#addApi() to use this feature."
    //         invoke-static {v1, v2}, Lcom/google/android/gms/common/internal/o;->a(ZLjava/lang/Object;)V
    //         return-object v0
    //         :cond_0
    //         move v0, v2
    //         goto :goto_0
    //         :cond_1
    //         move v1, v2
    //         goto :goto_1
    */

    public @JvmStatic fun delete(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, stateKey: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/appstate/AppStateManager$5;
    //         invoke-direct {v0, p1}, Lcom/google/android/gms/appstate/AppStateManager$5;-><init>(I)V
    //         invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    private @JvmStatic fun e(p0: com.google.android.gms.common.api.Status): com.google.android.gms.appstate.AppStateManager.StateResult { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/appstate/AppStateManager$StateResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/appstate/AppStateManager$2;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/appstate/AppStateManager$2;-><init>(Lcom/google/android/gms/common/api/Status;)V
    //         return-object v0
    */

    @JvmStatic fun f(p0: com.google.android.gms.common.api.Status): com.google.android.gms.appstate.AppStateManager.StateResult { return TODO("body: (Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/appstate/AppStateManager$StateResult;") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/appstate/AppStateManager;->e(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/appstate/AppStateManager$StateResult;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun getMaxNumKeys(googleApiClient: com.google.android.gms.common.api.GoogleApiClient): Int { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/appstate/AppStateManager;->a(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/internal/ib;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ib;->fr()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun getMaxStateSize(googleApiClient: com.google.android.gms.common.api.GoogleApiClient): Int { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)I") }
    /*
    //         .locals 1
    //         invoke-static {p0}, Lcom/google/android/gms/appstate/AppStateManager;->a(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/internal/ib;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ib;->fq()I
    //         move-result v0
    //         return v0
    */

    public @JvmStatic fun list(googleApiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/appstate/AppStateManager$7;
    //         invoke-direct {v0}, Lcom/google/android/gms/appstate/AppStateManager$7;-><init>()V
    //         invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun load(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, stateKey: Int): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;I)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/appstate/AppStateManager$6;
    //         invoke-direct {v0, p1}, Lcom/google/android/gms/appstate/AppStateManager$6;-><init>(I)V
    //         invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun resolve(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, stateKey: Int, resolvedVersion: String, resolvedData: ByteArray): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;ILjava/lang/String;[B)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/appstate/AppStateManager$8;
    //         invoke-direct {v0, p1, p2, p3}, Lcom/google/android/gms/appstate/AppStateManager$8;-><init>(ILjava/lang/String;[B)V
    //         invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun signOut(googleApiClient: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/appstate/AppStateManager$9;
    //         invoke-direct {v0}, Lcom/google/android/gms/appstate/AppStateManager$9;-><init>()V
    //         invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public @JvmStatic fun update(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, stateKey: Int, data: ByteArray) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;I[B)V */ }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/appstate/AppStateManager$3;
    //         invoke-direct {v0, p1, p2}, Lcom/google/android/gms/appstate/AppStateManager$3;-><init>(I[B)V
    //         invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         return-void
    */

    public @JvmStatic fun updateImmediate(googleApiClient: com.google.android.gms.common.api.GoogleApiClient, stateKey: Int, data: ByteArray): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;I[B)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/appstate/AppStateManager$4;
    //         invoke-direct {v0, p1, p2}, Lcom/google/android/gms/appstate/AppStateManager$4;-><init>(I[B)V
    //         invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    }
}
