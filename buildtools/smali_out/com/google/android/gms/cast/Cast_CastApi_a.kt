package com.google.android.gms.cast

// Auto-emitted from smali.
// 0 fields, 20 methods.

class Cast_CastApi_a: com.google.android.gms.cast.Cast.CastApi {
    public constructor()

    public fun getApplicationMetadata(client: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.cast.ApplicationMetadata { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/cast/ApplicationMetadata;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/cast/Cast;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ij;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->getApplicationMetadata()Lcom/google/android/gms/cast/ApplicationMetadata;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getApplicationStatus(client: com.google.android.gms.common.api.GoogleApiClient): String { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Ljava/lang/String;") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/cast/Cast;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ij;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->getApplicationStatus()Ljava/lang/String;
    //         move-result-object v0
    //         return-object v0
    */

    public fun getVolume(client: com.google.android.gms.common.api.GoogleApiClient): Double { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)D") }
    /*
    //         .locals 2
    //         sget-object v0, Lcom/google/android/gms/cast/Cast;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ij;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->fE()D
    //         move-result-wide v0
    //         return-wide v0
    */

    public fun isMute(client: com.google.android.gms.common.api.GoogleApiClient): Boolean { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Z") }
    /*
    //         .locals 1
    //         sget-object v0, Lcom/google/android/gms/cast/Cast;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ij;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->isMute()Z
    //         move-result v0
    //         return v0
    */

    public fun joinApplication(client: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/Cast$CastApi$a$6;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/cast/Cast$CastApi$a$6;-><init>(Lcom/google/android/gms/cast/Cast$CastApi$a;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun joinApplication(client: com.google.android.gms.common.api.GoogleApiClient, applicationId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/Cast$CastApi$a$5;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/cast/Cast$CastApi$a$5;-><init>(Lcom/google/android/gms/cast/Cast$CastApi$a;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun joinApplication(client: com.google.android.gms.common.api.GoogleApiClient, applicationId: String, sessionId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/Cast$CastApi$a$4;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/cast/Cast$CastApi$a$4;-><init>(Lcom/google/android/gms/cast/Cast$CastApi$a;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun launchApplication(client: com.google.android.gms.common.api.GoogleApiClient, applicationId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/Cast$CastApi$a$2;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/cast/Cast$CastApi$a$2;-><init>(Lcom/google/android/gms/cast/Cast$CastApi$a;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun launchApplication(client: com.google.android.gms.common.api.GoogleApiClient, applicationId: String, options: com.google.android.gms.cast.LaunchOptions): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Lcom/google/android/gms/cast/LaunchOptions;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/Cast$CastApi$a$3;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/cast/Cast$CastApi$a$3;-><init>(Lcom/google/android/gms/cast/Cast$CastApi$a;Ljava/lang/String;Lcom/google/android/gms/cast/LaunchOptions;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun launchApplication(client: com.google.android.gms.common.api.GoogleApiClient, applicationId: String, relaunchIfRunning: Boolean): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Z)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         .annotation runtime Ljava/lang/Deprecated;
    //         .end annotation
    //         new-instance v0, Lcom/google/android/gms/cast/LaunchOptions$Builder;
    //         invoke-direct {v0}, Lcom/google/android/gms/cast/LaunchOptions$Builder;-><init>()V
    //         invoke-virtual {v0, p3}, Lcom/google/android/gms/cast/LaunchOptions$Builder;->setRelaunchIfRunning(Z)Lcom/google/android/gms/cast/LaunchOptions$Builder;
    //         move-result-object v0
    //         invoke-virtual {v0}, Lcom/google/android/gms/cast/LaunchOptions$Builder;->build()Lcom/google/android/gms/cast/LaunchOptions;
    //         move-result-object v0
    //         invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/cast/Cast$CastApi$a;->launchApplication(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Lcom/google/android/gms/cast/LaunchOptions;)Lcom/google/android/gms/common/api/PendingResult;
    //         move-result-object v0
    //         return-object v0
    */

    public fun leaveApplication(client: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/Cast$CastApi$a$7;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/cast/Cast$CastApi$a$7;-><init>(Lcom/google/android/gms/cast/Cast$CastApi$a;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun removeMessageReceivedCallbacks(client: com.google.android.gms.common.api.GoogleApiClient, namespace: String) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/cast/Cast;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ij;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ij;->aE(Ljava/lang/String;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "service error"
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun requestStatus(client: com.google.android.gms.common.api.GoogleApiClient) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/cast/Cast;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ij;
    //         invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->fD()V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "service error"
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun sendMessage(client: com.google.android.gms.common.api.GoogleApiClient, namespace: String, message: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/Cast$CastApi$a$1;
    //         invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/cast/Cast$CastApi$a$1;-><init>(Lcom/google/android/gms/cast/Cast$CastApi$a;Ljava/lang/String;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun setMessageReceivedCallbacks(client: com.google.android.gms.common.api.GoogleApiClient, namespace: String, callbacks: com.google.android.gms.cast.Cast.MessageReceivedCallback) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Lcom/google/android/gms/cast/Cast$MessageReceivedCallback;)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/cast/Cast;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ij;
    //         invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/ij;->a(Ljava/lang/String;Lcom/google/android/gms/cast/Cast$MessageReceivedCallback;)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "service error"
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun setMute(client: com.google.android.gms.common.api.GoogleApiClient, mute: Boolean) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;Z)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/cast/Cast;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ij;
    //         invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ij;->G(Z)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "service error"
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun setVolume(client: com.google.android.gms.common.api.GoogleApiClient, volume: Double) { /* TODO(body): (Lcom/google/android/gms/common/api/GoogleApiClient;D)V */ }
    /*
    //         .locals 2
    //         :try_start_0
    //         sget-object v0, Lcom/google/android/gms/cast/Cast;->CU:Lcom/google/android/gms/common/api/Api$c;
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lcom/google/android/gms/common/api/Api$c;)Lcom/google/android/gms/common/api/Api$a;
    //         move-result-object v0
    //         check-cast v0, Lcom/google/android/gms/internal/ij;
    //         invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/ij;->a(D)V
    //         :try_end_0
    //         .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    //         return-void
    //         :catch_0
    //         move-exception v0
    //         new-instance v0, Ljava/io/IOException;
    //         const-string v1, "service error"
    //         invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V
    //         throw v0
    */

    public fun stopApplication(client: com.google.android.gms.common.api.GoogleApiClient): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/Cast$CastApi$a$8;
    //         invoke-direct {v0, p0}, Lcom/google/android/gms/cast/Cast$CastApi$a$8;-><init>(Lcom/google/android/gms/cast/Cast$CastApi$a;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

    public fun stopApplication(client: com.google.android.gms.common.api.GoogleApiClient, sessionId: String): com.google.android.gms.common.api.PendingResult { return TODO("body: (Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)Lcom/google/android/gms/common/api/PendingResult;") }
    /*
    //         .locals 1
    //         new-instance v0, Lcom/google/android/gms/cast/Cast$CastApi$a$9;
    //         invoke-direct {v0, p0, p2}, Lcom/google/android/gms/cast/Cast$CastApi$a$9;-><init>(Lcom/google/android/gms/cast/Cast$CastApi$a;Ljava/lang/String;)V
    //         invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lcom/google/android/gms/common/api/BaseImplementation$a;)Lcom/google/android/gms/common/api/BaseImplementation$a;
    //         move-result-object v0
    //         return-object v0
    */

}
